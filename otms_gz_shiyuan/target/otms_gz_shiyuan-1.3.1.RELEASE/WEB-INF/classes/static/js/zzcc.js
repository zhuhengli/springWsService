 $("#showTooltips").click(function() {
        var erpCode = $('#erpCode').val();
        var feeType = $('#feeType').val();
        var amount = $('#amount').val();
        var remark = $('#remark').val();
        console.log(ctx);
        $.ajax({
            url: ctx+'/registered',
            type: 'POST',
            dataType: 'json',
            data: {
              'erpCode': erpCode,
              'feeType': feeType,
              'amount': amount,
              'remark': remark
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