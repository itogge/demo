$.ajax({
    	url: "/err/getAjaxerror",
    	type: "POST",
    	async: false,
    	success: function(data) {
    		//debugger;
            if(data.resultCode == "0000" && data.resultMessage == "OK") {
            	alert("success");
            } else {
            	alert("发生异常：" + data.resultMessage);
            }
    	},
        error: function (response, ajaxOptions, thrownError) {
        	//debugger;
        	alert("error");       
        }
    });
    
