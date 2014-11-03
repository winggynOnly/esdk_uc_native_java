function changeLang()
{
	lang = $("#changeLang").val();
	
	if (lang == "en-us")
	{
		controller = new LanguageControllerEN();
		$.datepicker.setDefaults( $.datepicker.regional[""] );
	}
	else
	{
		controller = new LanguageControllerZH();
		$.datepicker.setDefaults( $.datepicker.regional["zh-TW"] );
	}
	
	// 自动切换所有的label
	var arrayOfLabel;        
	if (document.all || document.getElementById)
	{            
		arrayOfLabel = document.getElementsByTagName("label");        
	}
	
	for(var i=0;i<arrayOfLabel.length;i++)    
	{   
		var labelId = arrayOfLabel[i].id;
		if(labelId!="" && labelId.indexOf("Tree") == -1)
		{
			document.getElementById(labelId).innerHTML=controller.language.titles[labelId];
		}
	}
	
	// 自动切换所有span
	var arrayOfSpan;        
	if (document.all || document.getElementById)
	{            
		arrayOfSpan = document.getElementsByTagName("span");        
	}
	
	for(var i=0;i<arrayOfSpan.length;i++)    
	{   
		var spanId = arrayOfSpan[i].id;
		if(spanId!="" && spanId.indexOf("Tree") == -1)
		{
			document.getElementById(spanId).innerHTML=controller.language.titles[spanId];
		}
	}
	
	// 自动切换所有li
	var arrayOfli;        
	if (document.all || document.getElementById)
	{            
		arrayOfli = document.getElementsByTagName("li");        
	}
	
	for(var i=0;i<arrayOfli.length;i++)    
	{   
		var liId = arrayOfli[i].id;
		if(liId!="" && liId.indexOf("Tree") == -1)
		{
			document.getElementById(liId).innerHTML=controller.language.titles[liId];
		}
	}
	
	// 自动切换所有button
	var arrayOfButton;        
	if (document.all || document.getElementById)
	{            
		arrayOfButton = document.getElementsByTagName("input");        
	}
	
	for(var i=0;i<arrayOfButton.length;i++)    
	{   
		var buttonId = arrayOfButton[i].id;
		if(buttonId!="" && buttonId.indexOf("Btn") > 0)
		{
			document.getElementById(buttonId).value=controller.language.buttons[buttonId];
		}
	}
	
	
	
	// zTree加载时自动生成ID，这边得特殊处理
	if (exist('ucTree_1_span')) $("#ucTree_1_span").html(controller.language.titles["ucTree_1_span"]);
	if (exist('ucTree_2_span')) $("#ucTree_2_span").html(controller.language.titles["ucTree_2_span"]);
	if (exist('ucTree_3_span')) $("#ucTree_3_span").html(controller.language.titles["ucTree_3_span"]);$("#ucTree_3_span").attr("title", controller.language.titles["ucTree_1_span_tag"]);
	if (exist('ucTree_4_span')) $("#ucTree_4_span").html(controller.language.titles["ucTree_4_span"]);
	if (exist('ucTree_5_span')) $("#ucTree_5_span").html(controller.language.titles["ucTree_5_span"]);$("#ucTree_5_span").attr("title", controller.language.titles["ucTree_2_span_tag"]);
	if (exist('ucTree_6_span')) $("#ucTree_6_span").html(controller.language.titles["ucTree_6_span"]);
	if (exist('ucTree_7_span')) $("#ucTree_7_span").html(controller.language.titles["ucTree_7_span"]);$("#ucTree_7_span").attr("title", controller.language.titles["ucTree_3_span_tag"]);
	
	if (exist('conferenceParamLabel')) $("#conferenceParamLabel").val(controller.language.titles["conferenceParamLabel"]);
	if (exist('conferenceParamLabel')) $("#conferenceParamLabel").attr("title",controller.language.titles["conferenceParamLabel"]);
	
	if (exist('confUserParamBtn')) $("#confUserParamBtn").val(controller.language.titles["confUserParamBtn"]);
	
	$("option[name=confTypeOption1]").html(controller.language.titles["confTypeOption1"]);
	$("option[name=confTypeOption2]").html(controller.language.titles["confTypeOption2"]);
	$("option[name=confTypeOption3]").html(controller.language.titles["confTypeOption3"]);
	$("option[name=confTypeOption4]").html(controller.language.titles["confTypeOption4"]);
	
	$("option[name=TalkMode0]").html(controller.language.titles["TalkMode0"]);
	$("option[name=TalkMode1]").html(controller.language.titles["TalkMode1"]);
	$("option[name=TalkMode2]").html(controller.language.titles["TalkMode2"]);
	
	$("option[name=statusOption1]").html(controller.language.titles["statusOption1"]);
	$("option[name=statusOption2]").html(controller.language.titles["statusOption2"]);
	$("option[name=statusOption3]").html(controller.language.titles["statusOption3"]);
	$("option[name=statusOption4]").html(controller.language.titles["statusOption4"]);
	
	$("option[name=supportVideoOption0]").html(controller.language.titles["supportVideoOption0"]);
	$("option[name=supportVideoOption1]").html(controller.language.titles["supportVideoOption1"]);
	
	$("option[name=roleOption1]").html(controller.language.titles["roleOption1"]);
	$("option[name=roleOption2]").html(controller.language.titles["roleOption2"]);
	
	$("#mediaTypeSpan1").html(controller.language.titles["mediaTypeSpan1"]);
	$("#mediaTypeSpan2").html(controller.language.titles["mediaTypeSpan2"]);
	$("#mediaTypeSpan3").html(controller.language.titles["mediaTypeSpan3"]);
	
	
	
	// 状态显示特殊处理，因只有调用接口后才会展示，这边需要作判断是否显示
	statusChange();
	
	// 页面参数校验错误信息在切换语言时清空
	clearTip();
}

function statusChange()
{
	// CTD
	if (exist('dialCall_resultCode') && "" != $("#dialCall_resultCode").val())
	{
		if ($("#dialCall_resultCode").val() == 0)
		{
			$("#dialCall_status").html(controller.language.titles["operationSuccess"]);
		}
		else
		{
			$("#dialCall_status").html(controller.language.titles["operationFailed"]);
		}
	}
	else
	{
		$("#dialCall_status").html("");
	}
	
	// IM
	if (exist('appSendMsgToUC_resultCode') && "" != $("#appSendMsgToUC_resultCode").val())
	{
		if ($("#appSendMsgToUC_resultCode").val() == 0)
		{
			$("#appSendMsgToUC_status").html(controller.language.titles["operationSuccess"]);
		}
		else
		{
			$("#appSendMsgToUC_status").html(controller.language.titles["operationFailed"]);
		}
	}
	else
	{
		$("#appSendMsgToUC_status").html("");
	}
	
	// Conference
	if (exist('createConf_resultCode') && "" != $("#createConf_resultCode").val())
	{
		if ($("#createConf_resultCode").val() == 0)
		{
			$("#createConf_status").html(controller.language.titles["operationSuccess"]);
		}
		else
		{
			$("#createConf_status").html(controller.language.titles["operationFailed"]);
		}
	}
	else
	{
		$("#createConf_status").html("");
	}
	
}

function clearTip()
{
	if (exist('initiatorErrTip')) $("#initiatorErrTip").html("");
	if (exist('callerErrTip')) $("#callerErrTip").html("");
	if (exist('calleeErrTip')) $("#calleeErrTip").html("");
	
	if (exist('sendNumberErrTip')) $("#sendNumberErrTip").html("");
	if (exist('ucAccountErrTip')) $("#ucAccountErrTip").html("");
	if (exist('messageErrTip')) $("#messageErrTip").html("");
	
	if (exist('confUserNumberErrTip')) $("#confUserNumberErrTip").html("");
	if (exist('subjectErrTip')) $("#subjectErrTip").html("");
	if (exist('initiatorErrTip')) $("#initiatorErrTip").html("");
	if (exist('chairmanNumberErrTip')) $("#chairmanNumberErrTip").html("");
	if (exist('maxAttendeeErrTip')) $("#maxAttendeeErrTip").html("");
	if (exist('chairmanEmailErrTip')) $("#chairmanEmailErrTip").html("");
	if (exist('confBeginTimeErrTip')) $("#confBeginTimeErrTip").html("");
	if (exist('confEndTimeErrTip')) $("#confEndTimeErrTip").html("");
	
	
}



function appendInterface(functionName)
{
	if ("dialCall" == functionName)
	{
		$(function() {
			$.ajax({
				type : "get",
				cache : false,
				url : "/eSDK_UC_Demo_BS_Java/pages/interface/dialCall.html",
				async : false,
				success : function(data) {
					$("#main1").html(data);
				}
			});
		});
	}
	else if ("appSendMsgToUC" == functionName)
	{
		$(function() {
			$.ajax({
				type : "get",
				cache : false,
				url : "/eSDK_UC_Demo_BS_Java/pages/interface/appSendMsgToUC.html",
				async : false,
				success : function(data) {
					$("#main1").html(data);
				}
			});
		});
	}
	else if ("createConf" == functionName)
	{
		$(function() {
			$.ajax({
				type : "get",
				cache : false,
				url : "/eSDK_UC_Demo_BS_Java/pages/interface/createConf.html",
				async : false,
				success : function(data) {
					$("#main1").html(data);
				}
			});
		});
	}
	
	setTab(1,0);
	
	changeLang();
}

function setTab(m,n)
{  
	 var tli=document.getElementById("menu"+m).getElementsByTagName("li");  
	 var mli=document.getElementById("main"+m).getElementsByTagName("ul");  
	 for(i=0;i<tli.length;i++)
	 {  
	 	tli[i].className=i==n?"hover":"";  
	  	mli[i].style.display=i==n?"block":"none";  
	 }  
}

function clean()
{
	// 当单击节点时，置空标签页
	$("#main1").html("<ul class='block'><li></li></ul><ul><li></li></ul><ul><li></li></ul>");
	setTab(1,0);
}

function exist(id)
{
    var s=document.getElementById(id);
    if(s)
    {
    	return true;
    }
    else
    {
    	return false;
    }
}

function isEmpty(value)
{
	if (null == value || "" == value)
	{
		return true;
	}
	else
	{
		return false;
	}
}

function isNumber(num)
{
	var reNum=/^\d*$/;
	return(reNum.test(num));
}

/**2014.4.8 新增*/
function textOnF(which)
{
	if (which.style.color === "gray")
	{
		which.value = '';
		which.style.color = 'black';
	}
}


function changeValue(id)
{
	var values = {
			texts : {
				"initiator":"test555",
				"caller":"244555",
				"callee":"244992",
				"sendNumber":"99999876",
				"ucAccount":"testAccont1",
				"message":"<imbody><content>Hellow World!</content></imbody>",
				"subject":"testConf",
				"chairmanNumber":"244555",
				"chairmanName":"testChairmName",
				"chairmanAccount":"UC:test555",
				"maxAttendee":"10",
				"confUserNumber":"244244",
				"confUserAccount":"UC:zl03",
				"confUserName":"zl03"
				}
			};
	
	var result = values.texts[id];
	return result;
}


function textOnB(which)
{
	if ('' === which.value || null === which.value)
	{	
		which.value = changeValue(which.id);
		which.style.color = 'gray';
	}
	return false;
}


