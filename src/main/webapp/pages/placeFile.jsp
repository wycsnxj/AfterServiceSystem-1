<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<meta name="placeFile.viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
<title>Insert title here</title>
	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/layui.css">
	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/main.css">
	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/global.css" media="all">
	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/personal.css" media="all">
	<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-3.3.1.min.js"></script>
	<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery.params.js"></script>
</head>
<body>
	<div class="larry-wrapper">
		
		<div class="larry-personal">
			<header class="larry-personal-tit">
				<span>异常反馈单归档操作</span>
			</header>
			
			<div class="larry-personal-body clearfix">
			<form class="layui-form" action="placeFileAction_doAddPlaceFile" method="post">
				<input type="hidden" name="feedback.docId" value="">
				<div class="layui-form-item">
					<label class="layui-form-label">异常处理类型</label>
					<div class="layui-input-block">
						<input type="radio" name="process.proId" value="3" title="无需处理">
						<input type="radio" name="process.proId" value="4" title="考核通报">
						<input type="radio" name="process.proId" value="5" title="限期整改">
					</div>
				</div>	
				<div class="layui-form-item">
					<div class="layui-inline">
						<label class="layui-form-label">问题类别</label>
						<div class="layui-input-block" id="problemType">
						</div>
					</div>	
					<div class="layui-inline">
						<label class="layui-form-label">问题大类</label>
						<div class="layui-input-block">
							<input type="checkbox" name="placeFile.plaBigCategory" lay-skin="primary" title="功能类" value="功能类">
							<input type="checkbox" name="placeFile.plaBigCategory" lay-skin="primary" title="外观类" value="外观类">
						</div>
					</div>
				</div>	
				<div class="layui-form-item">
					<div class="layui-inline">
						<label class="layui-form-label">是否试制把关失效</label>
						<div class="layui-input-inline">
							<input type="radio" name="placeFile.plaIsTrialControl" value="1" title="是" checked="">
							<input type="radio" name="placeFile.plaIsTrialControl" value="0" title="否">
						</div>
					</div>
					<div class="layui-inline">
						<label class="layui-form-label">是否批量</label>
						<div class="layui-input-inline">
							<input type="radio" name="" value="1" title="是" checked="">
							<input type="radio" name="" value="0" title="否">
						</div>
					</div>
					<div class="layui-inline">
						<label class="layui-form-label" style="width: 160px;">是否有引发售后投诉的隐患</label>
						<div class="layui-input-inline">
							<input type="radio" name="placeFile.plaIsSafeAfterRisk" value="1" title="是" checked="">
							<input type="radio" name="placeFile.plaIsSafeAfterRisk" value="0" title="否">
						</div>
					</div>
				</div>	
			<!-- 	<div class="layui-form-item">
						<label class="layui-form-label">责任单位</label>
						<div class="layui-input-inline">
							
						</div>
				</div> -->
				<div class="layui-form-item">
					<label class="layui-form-label">缺陷类别</label>
					<div class="layui-input-block">
						<input type="checkbox" name="placeFile.plaAbnormalType" lay-skin="primary" title="注塑件" value="注塑件">
						<input type="checkbox" name="placeFile.plaAbnormalType" lay-skin="primary" title="钣金件" value="钣金件">
						<input type="checkbox" name="placeFile.plaAbnormalType" lay-skin="primary" title="系统五金类" value="系统五金类">
						<input type="checkbox" name="placeFile.plaAbnormalType" lay-skin="primary" title="电器类" value="电器类">
						<input type="checkbox" name="placeFile.plaAbnormalType" lay-skin="primary" title="电机类" value="电机类">
						<input type="checkbox" name="placeFile.plaAbnormalType" lay-skin="primary" title="控制器类" value="控制器类">
						<input type="checkbox" name="placeFile.plaAbnormalType" lay-skin="primary" title="化轻类" value="化轻类">
						<input type="checkbox" name="placeFile.plaAbnormalType" lay-skin="primary" title="包装类" value="包装类">
						<input type="checkbox" name="placeFile.plaAbnormalType" lay-skin="primary" title="外观类" value="外观类">
						<input type="checkbox" name="placeFile.plaAbnormalType" lay-skin="primary" title="尺寸、角度超差" value="尺寸、角度超差">
						<input type="checkbox" name="placeFile.plaAbnormalType" lay-skin="primary" title="一致性差" value="一致性差">
						<input type="checkbox" name="placeFile.plaAbnormalType" lay-skin="primary" title="漏工序" value="漏工序">
						<input type="checkbox" name="placeFile.plaAbnormalType" lay-skin="primary" title="焊接不良（过烧、咬边、烧伤、虚焊、烧穿等）" value="焊接不良（过烧、咬边、烧伤、虚焊、烧穿等）">
						<input type="checkbox" name="placeFile.plaAbnormalType" lay-skin="primary" title="焊接位置错误" value="焊接位置错误">
						<input type="checkbox" name="placeFile.plaAbnormalType" lay-skin="primary" title="备料错误" value="备料错误">
						<input type="checkbox" name="placeFile.plaAbnormalType" lay-skin="primary" title="物料用错" value="物料用错">
						<input type="checkbox" name="placeFile.plaAbnormalType" lay-skin="primary" title="标志错误" value="标志错误">
						<input type="checkbox" name="placeFile.plaAbnormalType" lay-skin="primary" title="混料" value="混料">
						<input type="checkbox" name="placeFile.plaAbnormalType" lay-skin="primary" title="工装定位不良" value="工装定位不良">
						<input type="checkbox" name="placeFile.plaAbnormalType" lay-skin="primary" title="其他" value="其他">
					</div>
				</div>
				<div class="layui-form-item">
					<div class="layui-inline">
						<label class="layui-form-label">是否首检失效</label>
						<div class="layui-input-inline">
							<input type="radio" name="placeFile.plaIsFirstCheckLose" value="1" title="是" checked="" value="1">
							<input type="radio" name="placeFile.plaIsFirstCheckLose" value="0" title="否" value="0">
						</div>
					</div>
					<div class="layui-inline">
						<label class="layui-form-label">是否重复一个月发生</label>
						<div class="layui-input-inline">
							<input type="checkbox" name="placeFile.plaMouthLoopCount" lay-skin="switch" lay-text="ON|OFF" value="1">
						</div>
					</div>
					<div class="layui-inline">
						<label class="layui-form-label">第几次重复发生</label>
						<div class="layui-input-inline">
							<input name="placeFile.plaMouthLoopCount" lay-verify="number" placeholder="请输入" autocomplete="off" class="layui-input">
						</div>
					</div>
				</div>
				<div class="layui-form-item layui-form-text">
					<label class="layui-form-label">根本原因分析</label>
					<div class="layui-input-block">
						<textarea name="placeFile.plaCauseAnalysis" placeholder="请输入" class="layui-textarea"></textarea>
					</div>
				</div>
				<div class="layui-form-item">
					<label class="layui-form-label">原因大类</label>
					<div class="layui-input-block">
						<input type="checkbox" name="placeFile.plaBigReason" lay-skin="primary" title="人员管理" value="人员管理">
						<input type="checkbox" name="placeFile.plaBigReason" lay-skin="primary" title="现场和产品管理" value="现场和产品管理">
						<input type="checkbox" name="placeFile.plaBigReason" lay-skin="primary" title="设备工装管理" value="设备工装管理">
						<input type="checkbox" name="placeFile.plaBigReason" lay-skin="primary" title="检验设备" value="检验设备">
						<input type="checkbox" name="placeFile.plaBigReason" lay-skin="primary" title="检验工具和工装管理" value="检验工具和工装管理">
						<input type="checkbox" name="placeFile.plaBigReason" lay-skin="primary" title="生产工艺管理" value="生产工艺管理">
						<input type="checkbox" name="placeFile.plaBigReason" lay-skin="primary" title="检验管理" value="检验管理">
					</div>
				</div>
				<div class="layui-form-item">
					<label class="layui-form-label">原因小类</label>
					<div class="layui-input-block">
						<input type="checkbox" name="placeFile.plaSmallReason" lay-skin="primary" title="未认真核对图纸" value="未认真核对图纸">
						<input type="checkbox" name="placeFile.plaSmallReason" lay-skin="primary" title="工艺文件" value="工艺文件">
						<input type="checkbox" name="placeFile.plaSmallReason" lay-skin="primary" title="无生产工艺文件" value="无生产工艺文件">
						<input type="checkbox" name="placeFile.plaSmallReason" lay-skin="primary" title="生产工艺文件错误" value="生产工艺文件错误">
						<input type="checkbox" name="placeFile.plaSmallReason" lay-skin="primary" title="生产工艺文件有缺陷和漏洞" value="生产工艺文件有缺陷和漏洞">
						<input type="checkbox" name="placeFile.plaSmallReason" lay-skin="primary" title="生产工艺有规定，但具备执行工艺的条件" value="生产工艺有规定，但具备执行工艺的条件">
						<input type="checkbox" name="placeFile.plaSmallReason" lay-skin="primary" title="生产工艺落后，工序能力无保证" value="生产工艺落后，工序能力无保证">
						<input type="checkbox" name="placeFile.plaSmallReason" lay-skin="primary" title="未严格执行生产工艺文件要求" value="未严格执行生产工艺文件要求">
					</div>
				</div>
				<div class="layui-form-item">
					<div class="layui-inline">
						<label class="layui-form-label" style="width: 160px;">是否涉及厂内或外仓产品处理</label>
						<div class="layui-input-inline">
							<input type="radio" name="placeFile.plaIsInvolveHandle" value="1" title="是" checked="">
							<input type="radio" name="placeFile.plaIsInvolveHandle" value="0" title="否">
						</div>
					</div>
				</div>
				<div class="layui-form-item layui-form-text">
					<label class="layui-form-label">应急解决方案</label>
					<div class="layui-input-block">
						<textarea name="placeFile.plaEmergencyPlan" placeholder="请输入" class="layui-textarea"></textarea>
					</div>
				</div>
				<div class="layui-form-item">
					<div class="layui-input-block">
						<button type="button" onclick="test()" class="layui-btn">质量工程师保存异常归档</button>
						<button lay-submit class="layui-btn">质量工程师保存并关闭异常归档</button>
						<button type="reset" class="layui-btn layui-btn-primary">重置</button>
					</div>
				</div>
				
			</form>
			</div>
		</div>
	</div>

	<script type="text/javascript" src="${pageContext.request.contextPath}/layui.js"></script>
	<script>
	layui.use(['jquery', 'laydate', 'form'], function(){
		var laydate = layui.laydate
		,form = layui.form
		,$ = layui.$
		
		//问题类别
		$.post("problemTypeAction_findProblemTypeList", "", function(data){
			var str = ""
			$.each(data.problemTypeList, function(i, v){
				str += "<input type='checkbox' name='problemTypeList[" + i + "].pbtId' lay-skin='primary' title='" + v.pbtName + "' value='" + v.pbtId + "'>";
			});
			$("#problemType").append(str);
			form.render();
		}, "json");
		

		form.render();
		
	});
	
	function test(){
		alert($("form").eq(0).serialize());
	}
	
	window.onload = start();
	
	function start() {
		getFeedbackId();
	}
	
	function getFeedbackId(){
		var docId = $.query.get("docId");
		$("input[name='feedback.docId']").val(docId);
	}
	</script>
</body>
</html>