package com.muselab.project1.controller;

import com.muselab.project1.domain.Member;
import com.muselab.project1.domain.Team;
import com.muselab.project1.service.MemberService;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cglib.beans.BeanMap;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by 1002428 on 16. 1. 3..
 */
@RestController
public class MemberController {

	private String info = "application.hello:Hello Angel";
    @Autowired
    private MemberService memberService;

    @RequestMapping(value="/hello")
    public String hello() {

        System.out.println("hi");

        return "hello";
    }
    
    @RequestMapping(value="/MyJsp")
    public ModelAndView MyJsp(Map<String,Object> map) {
    	ModelAndView mv = new ModelAndView("MyJsp"); 
        System.out.println(info);
        map.put("hello", info);
        return mv;
    }
    

    @RequestMapping("/member/save")
    public Long memberSave(@RequestParam("name") String name, Model model) {
        Member member = new Member();
        member.setName(name);
      //  member.setTeam(memberService.findOneTeam("t1"));
        return memberService.save(member);
    }

    @RequestMapping("/member/findByName")
    public List<Member> findByName(@RequestParam("name") String name) {

        return memberService.findByName(name);
    }

    @RequestMapping("/team/save")
    public String teamSave(@RequestParam("teamcode") String teamCode, Model model) {
        Team team = new Team();
        team.setTeamCode(teamCode);
        team.setTeamName("ocb개발팀");

        System.out.println(team.getTeamCode());
        System.out.println(team.getTeamName());

        memberService.save(team);
        return team.getTeamCode();
    }

    @RequestMapping("/team/findone")
    public Team findTeamone(@RequestParam("teamcode") String teamCode) {

        return memberService.findOneTeam(teamCode);
    }

    @RequestMapping(value="/myMember")
    public ModelAndView myMember(Map<String,Object> map) {
    	ModelAndView mv = new ModelAndView("listMember"); 
        return mv;
    }
   
    
    @RequestMapping("/listMember")
    @ResponseBody
    public Map<String,Object> listMember() {
    	List<Member> list = memberService.findAll();	

    	HashMap<String, Object> result = new HashMap<String, Object>();
    	
    	
    	
    	List<Map<String, Object>> listmap = new ArrayList<Map<String, Object>>();  
        if (list != null && list.size() > 0) {  
            Map<String, Object> map = null;  
            Member bean = null;  
            for (int i = 0,size = list.size(); i < size; i++) {  
                bean = list.get(i);  
                map = beanToMap(bean);  
                listmap.add(map);  
            }  
        }  
    	
    	result.put("total", list.size());
    	result.put("rows", listmap);
        return result;
    }
    
    
    public  Map<String, Object> beanToMap(Member bean) {  
    	HashMap<String, Object> map = new HashMap<String, Object>();  
        if (bean != null) {  
            BeanMap beanMap = BeanMap.create(bean);  
            for (Object key : beanMap.keySet()) {  
                map.put(key+"", beanMap.get(key));  
            }             
        }  
        return map;  
    }
}
