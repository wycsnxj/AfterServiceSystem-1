/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.37
 * Generated at: 2018-06-03 09:18:28 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.pages;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class userInfo_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(1);
    _jspx_dependants.put("/pages/navbar.jsp", Long.valueOf(1528017506708L));
  }

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("\t<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("\t<meta name=\"viewport\" content=\"width=device-width, initial-scale=1, maximum-scale=1\">\r\n");
      out.write("\t<title>Insert title here</title>\r\n");
      out.write("\t\r\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/css/layui.css\">\r\n");
      out.write("\t<script type=\"text/javascript\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/js/jquery-3.3.1.min.js\"></script>\r\n");
      out.write("</head>\r\n");
      out.write("<body class=\"layui-layout-body\">\r\n");
      out.write("\t<div class=\"layui-layout layui-layout-admin\">\r\n");
      out.write("\r\n");
      out.write("\t\t");
      out.write("\r\n");
      out.write("<div class=\"layui-header\">\r\n");
      out.write("\t<div class=\"layui-logo\">银隆新能源</div>\r\n");
      out.write("    <!-- 头部区域（可配合layui已有的水平导航） -->\r\n");
      out.write("    <ul class=\"layui-nav layui-layout-left\">\r\n");
      out.write("      <li class=\"layui-nav-item\"><a href=\"\">控制台</a></li>\r\n");
      out.write("      <li class=\"layui-nav-item\"><a href=\"\">商品管理</a></li>\r\n");
      out.write("      <li class=\"layui-nav-item\"><a href=\"\">用户</a></li>\r\n");
      out.write("      <li class=\"layui-nav-item\">\r\n");
      out.write("        <a href=\"javascript:;\">其它系统</a>\r\n");
      out.write("        <dl class=\"layui-nav-child\">\r\n");
      out.write("          <dd><a href=\"\">邮件管理</a></dd>\r\n");
      out.write("          <dd><a href=\"\">消息管理</a></dd>\r\n");
      out.write("          <dd><a href=\"\">授权管理</a></dd>\r\n");
      out.write("        </dl>\r\n");
      out.write("      </li>\r\n");
      out.write("    </ul>\r\n");
      out.write("    <ul class=\"layui-nav layui-layout-right\">\r\n");
      out.write("      <li class=\"layui-nav-item\">\r\n");
      out.write("        <a href=\"javascript:;\">\r\n");
      out.write("          <img src=\"http://t.cn/RCzsdCq\" class=\"layui-nav-img\">\r\n");
      out.write("          \t我的\r\n");
      out.write("        </a>\r\n");
      out.write("        <dl class=\"layui-nav-child\">\r\n");
      out.write("          <dd><a href=\"\">基本资料</a></dd>\r\n");
      out.write("          <dd><a href=\"\">安全设置</a></dd>\r\n");
      out.write("        </dl>\r\n");
      out.write("      </li>\r\n");
      out.write("      <li class=\"layui-nav-item\"><a href=\"\">退了</a></li>\r\n");
      out.write("    </ul>\r\n");
      out.write("  </div>\r\n");
      out.write("    \r\n");
      out.write("  <div class=\"layui-side layui-bg-black\">\r\n");
      out.write("    <div class=\"layui-side-scroll\">\r\n");
      out.write("      <!-- 左侧导航区域（可配合layui已有的垂直导航） -->\r\n");
      out.write("      <ul class=\"layui-nav layui-nav-tree\"  lay-filter=\"test\">\r\n");
      out.write("      <li class=\"layui-nav-item layui-nav-itemed\">\r\n");
      out.write("          <a class=\"\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/index.jsp\">首页</a>\r\n");
      out.write("        </li>\r\n");
      out.write("        <li class=\"layui-nav-item layui-nav-itemed\">\r\n");
      out.write("          <a class=\"\" href=\"javascript:;\">单据管理</a>\r\n");
      out.write("          <dl class=\"layui-nav-child\">\r\n");
      out.write("            <dd><a href=\"javascript:;\">填写异常反馈单</a></dd>\r\n");
      out.write("            <dd><a href=\"javascript:;\">查询驳回反馈单</a></dd>\r\n");
      out.write("            <dd><a href=\"javascript:;\">查询驳回反馈单2</a></dd>\r\n");
      out.write("            <dd><a href=\"\">超链接</a></dd>\r\n");
      out.write("          </dl>\r\n");
      out.write("        </li>\r\n");
      out.write("        <li class=\"layui-nav-item layui-nav-itemed\">\r\n");
      out.write("          <a href=\"javascript:;\">基本信息</a>\r\n");
      out.write("          <dl class=\"layui-nav-child\">\r\n");
      out.write("            <dd><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/pages/userInfo.jsp\">查看用户信息</a></dd>\r\n");
      out.write("            <dd><a href=\"companyAction_findCompanyList\">公司部门信息</a></dd>\r\n");
      out.write("            <dd><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/pages/perSystem.jsp\">用户权限管理</a></dd>\r\n");
      out.write("            <dd><a href=\"companyAction_findCompanyList\">！！！</a></dd>\r\n");
      out.write("            <!-- <dd class=\"layui-this\"><a href=\"companyAction_findCompanyList\">！！！</a></dd> -->\r\n");
      out.write("            <dd><a href=\"\">超链接</a></dd>\r\n");
      out.write("          </dl>\r\n");
      out.write("        </li>\r\n");
      out.write("        <li class=\"layui-nav-item\"><a href=\"\">云市场</a></li>\r\n");
      out.write("        <li class=\"layui-nav-item\"><a href=\"\">发布商品</a></li>\r\n");
      out.write("      </ul>\r\n");
      out.write("    </div>\r\n");
      out.write("  </div>");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<div class=\"layui-body\">\r\n");
      out.write("\t\t\t<!-- 内容主体区域 -->\r\n");
      out.write("\t\t\t<div style=\"padding: 15px;\">根据条件筛选</div>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<form class=\"layui-form\" action=\"\">\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\t<div class=\"layui-form-item\">\r\n");
      out.write("\t\t\t\t\t<div class=\"layui-inline\">\r\n");
      out.write("\t\t\t\t\t\t<label class=\"layui-form-label\">姓名</label>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"layui-input-inline\">\r\n");
      out.write("\t\t\t\t\t\t\t<input type=\"text\" name=\"username\" lay-verify=\"required\" placeholder=\"请输入\" autocomplete=\"off\" class=\"layui-input\">\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\t\t\t\r\n");
      out.write("\t\t\t\t\t<div class=\"layui-inline\">\r\n");
      out.write("\t\t\t\t\t\t<label class=\"layui-form-label\">工号</label>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"layui-input-inline\">\r\n");
      out.write("\t\t\t\t\t\t\t<input type=\"text\" name=\"username\" lay-verify=\"required\" placeholder=\"请输入\" autocomplete=\"off\" class=\"layui-input\">\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\t\t\t\r\n");
      out.write("\t\t\t\t\t<div class=\"layui-inline\">\r\n");
      out.write("\t\t\t\t\t\t<label class=\"layui-form-label\">职务</label>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"layui-input-inline\">\r\n");
      out.write("\t\t\t\t\t\t\t<input type=\"text\" name=\"username\" lay-verify=\"required\" placeholder=\"请输入\" autocomplete=\"off\" class=\"layui-input\">\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\t\t\t\r\n");
      out.write("\t\t\t\t\t<div class=\"layui-inline\">\r\n");
      out.write("\t\t\t\t\t\t<label class=\"layui-form-label\">电话</label>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"layui-input-inline\">\r\n");
      out.write("\t\t\t\t\t\t\t<input type=\"text\" name=\"username\" lay-verify=\"required\" placeholder=\"请输入\" autocomplete=\"off\" class=\"layui-input\">\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\t\t\t\r\n");
      out.write("\t\t\t\t\t<div class=\"layui-inline\">\r\n");
      out.write("\t\t\t\t\t\t<label class=\"layui-form-label\">邮箱</label>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"layui-input-inline\">\r\n");
      out.write("\t\t\t\t\t\t\t<input type=\"text\" name=\"username\" lay-verify=\"required\" placeholder=\"请输入\" autocomplete=\"off\" class=\"layui-input\">\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\t\t\t\r\n");
      out.write("\t\t\t\t\t<div class=\"layui-inline\">\r\n");
      out.write("\t\t\t\t\t\t<label class=\"layui-form-label\">备注</label>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"layui-input-inline\">\r\n");
      out.write("\t\t\t\t\t\t\t<input type=\"text\" name=\"username\" lay-verify=\"required\" placeholder=\"请输入\" autocomplete=\"off\" class=\"layui-input\">\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\t\t\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t\t<div class=\"layui-inline\">\r\n");
      out.write("\t\t\t\t\t\t<label class=\"layui-form-label\">行内选择框</label>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"layui-input-inline\">\r\n");
      out.write("\t\t\t\t\t\t\t<select name=\"quiz1\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<option value=\"\">请选择省</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t<option value=\"浙江\" selected=\"\">浙江省</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t<option value=\"你的工号\">江西省</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t<option value=\"你最喜欢的老师\">福建省</option>\r\n");
      out.write("\t\t\t\t\t\t\t</select>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"layui-input-inline\">\r\n");
      out.write("\t\t\t\t\t\t\t<select name=\"quiz2\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<option value=\"\">请选择市</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t<option value=\"杭州\">杭州</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t<option value=\"宁波\" disabled=\"\">宁波</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t<option value=\"温州\">温州</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t<option value=\"温州\">台州</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t<option value=\"温州\">绍兴</option>\r\n");
      out.write("\t\t\t\t\t\t\t</select>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"layui-input-inline\">\r\n");
      out.write("\t\t\t\t\t\t\t<select name=\"quiz3\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<option value=\"\">请选择县/区</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t<option value=\"西湖区\">西湖区</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t<option value=\"余杭区\">余杭区</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t<option value=\"拱墅区\">临安市</option>\r\n");
      out.write("\t\t\t\t\t\t\t</select>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t<div class=\"layui-form-item\">\r\n");
      out.write("\t\t\t\t\t<div class=\"layui-input-block\">\r\n");
      out.write("\t\t\t\t\t\t<button class=\"layui-btn\" lay-submit=\"\" lay-filter=\"demo1\">立即查询</button>\r\n");
      out.write("\t\t\t\t\t\t<button type=\"reset\" class=\"layui-btn layui-btn-primary\">重置</button>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t</form>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<table class=\"layui-hide\" id=\"userTab\"></table>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<div class=\"layui-footer\">\r\n");
      out.write("\t    \t<!-- 底部固定区域 -->\r\n");
      out.write("\t    \t© layui.com - 底部固定区域\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<script type=\"text/javascript\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/layui.all.js\"></script>\r\n");
      out.write("\t<script>\r\n");
      out.write("\t\tlayui.use('table', function(){\r\n");
      out.write("\t\t\t  var table = layui.table;\r\n");
      out.write("\t\t\t  \r\n");
      out.write("\t\t\t  table.render({\r\n");
      out.write("\t\t\t    elem: '#userTab'\r\n");
      out.write("\t\t\t\t,url:'userAction_findUseListLayui' \r\n");
      out.write("\t\t\t\t,cellMinWidth: 80 //全局定义常规单元格的最小宽度，layui 2.2.1 新增\r\n");
      out.write("\t\t\t    ,cols: [[\r\n");
      out.write("\t\t\t    \t   {type:'numbers', title: '序号'}\r\n");
      out.write("\t\t\t\t      ,{field:'userId', title: 'ID', sort: true}\r\n");
      out.write("\t\t\t\t      ,{field:'userName', title: '用户名'}\r\n");
      out.write("\t\t\t\t      ,{field:'userPwd', title: '密码'}\r\n");
      out.write("\t\t\t\t      ,{field:'userRealName', title: '真实姓名'}\r\n");
      out.write("\t\t\t\t      ,{field:'userJobNum', title: '工号'}\r\n");
      out.write("\t\t\t\t      ,{field:'userJobName', title: '职务'}\r\n");
      out.write("\t\t\t\t      ,{field:'userTell', title: '电话'}\r\n");
      out.write("\t\t\t\t      ,{field:'userEmail', title: '邮箱'}\r\n");
      out.write("\t\t\t\t      ,{field:'userRemark', title: '备注'}\r\n");
      out.write("\t\t\t    ]]\r\n");
      out.write("\t\t\t    ,page: true\r\n");
      out.write("\t\t\t  });\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\t</script>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
