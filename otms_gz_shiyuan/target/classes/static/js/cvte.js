 $("#showTooltips").click(function() {
        var beginDate = $('#beginDate').val();
        var endDate = $('#endDate').val();
        $.ajax({
            url: ctx+'/cvte.do',
            type: 'POST',
            dataType: 'json',
            data: {
              'beginDate': beginDate,
              'endDate': endDate
            },
            async: false,
            success: function(result) {
            	
            if(result.code==200){
            		window.location.href = ctx +'/msg/success';
            }else{
                 alert(result.result);
            }
            },
            error: function() {
              alert("error");
            }
          });
        
        
      });