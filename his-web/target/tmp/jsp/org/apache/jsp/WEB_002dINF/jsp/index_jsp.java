/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: jetty/9.4.0.M1
 * Generated at: 2018-03-19 10:24:35 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
      return;
    }

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

      out.write('\r');
      out.write('\n');

String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<base href=\"");
      out.print(basePath);
      out.write("\">\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"static/h-ui/css/H-ui.min.css\" />\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"static/h-ui.admin/css/H-ui.admin.css\" />\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"lib/Hui-iconfont/1.0.7/iconfont.css\" />\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"lib/icheck/icheck.css\" />\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"static/h-ui.admin/skin/default/skin.css\" id=\"skin\" />\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"static/h-ui.admin/css/style.css\" />\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<header class=\"navbar-wrapper\">\r\n");
      out.write("\t<div class=\"navbar navbar-fixed-top\">\r\n");
      out.write("\t\t<div class=\"container-fluid cl\"> <a class=\"logo navbar-logo f-l mr-10 hidden-xs\" href=\"/aboutHui.shtml\">H-ui.admin</a> <a class=\"logo navbar-logo-m f-l mr-10 visible-xs\" href=\"/aboutHui.shtml\">H-ui</a> <span class=\"logo navbar-slogan f-l mr-10 hidden-xs\">v2.4</span> <a aria-hidden=\"false\" class=\"nav-toggle Hui-iconfont visible-xs\" href=\"javascript:;\">&#xe667;</a>\r\n");
      out.write("\t\t\t<nav class=\"nav navbar-nav\">\r\n");
      out.write("\t\t\t\t<ul class=\"cl\">\r\n");
      out.write("\t\t\t\t\t<li class=\"dropDown dropDown_hover\"><a href=\"javascript:;\" class=\"dropDown_A\"><i class=\"Hui-iconfont\">&#xe600;</i> 新增 <i class=\"Hui-iconfont\">&#xe6d5;</i></a>\r\n");
      out.write("\t\t\t\t\t\t<ul class=\"dropDown-menu menu radius box-shadow\">\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"javascript:;\" onclick=\"article_add('添加资讯','article-add.html')\"><i class=\"Hui-iconfont\">&#xe616;</i> 资讯</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"javascript:;\" onclick=\"picture_add('添加资讯','picture-add.html')\"><i class=\"Hui-iconfont\">&#xe613;</i> 图片</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"javascript:;\" onclick=\"product_add('添加资讯','product-add.html')\"><i class=\"Hui-iconfont\">&#xe620;</i> 产品</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"javascript:;\" onclick=\"member_add('添加用户','member-add.html','','510')\"><i class=\"Hui-iconfont\">&#xe60d;</i> 用户</a></li>\r\n");
      out.write("\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t</ul>\r\n");
      out.write("\t\t\t</nav>\r\n");
      out.write("\t\t\t<nav id=\"Hui-userbar\" class=\"nav navbar-nav navbar-userbar hidden-xs\">\r\n");
      out.write("\t\t\t\t<ul class=\"cl\">\r\n");
      out.write("\t\t\t\t\t<li>超级管理员</li>\r\n");
      out.write("\t\t\t\t\t<li class=\"dropDown dropDown_hover\"> <a href=\"#\" class=\"dropDown_A\">admin <i class=\"Hui-iconfont\">&#xe6d5;</i></a>\r\n");
      out.write("\t\t\t\t\t\t<ul class=\"dropDown-menu menu radius box-shadow\">\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"#\">个人信息</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"#\">切换账户</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"#\">退出</a></li>\r\n");
      out.write("\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t<li id=\"Hui-msg\"> <a href=\"#\" title=\"消息\"><span class=\"badge badge-danger\">1</span><i class=\"Hui-iconfont\" style=\"font-size:18px\">&#xe68a;</i></a> </li>\r\n");
      out.write("\t\t\t\t\t<li id=\"Hui-skin\" class=\"dropDown right dropDown_hover\"> <a href=\"javascript:;\" class=\"dropDown_A\" title=\"换肤\"><i class=\"Hui-iconfont\" style=\"font-size:18px\">&#xe62a;</i></a>\r\n");
      out.write("\t\t\t\t\t\t<ul class=\"dropDown-menu menu radius box-shadow\">\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"javascript:;\" data-val=\"default\" title=\"默认（黑色）\">默认（黑色）</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"javascript:;\" data-val=\"blue\" title=\"蓝色\">蓝色</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"javascript:;\" data-val=\"green\" title=\"绿色\">绿色</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"javascript:;\" data-val=\"red\" title=\"红色\">红色</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"javascript:;\" data-val=\"yellow\" title=\"黄色\">黄色</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"javascript:;\" data-val=\"orange\" title=\"绿色\">橙色</a></li>\r\n");
      out.write("\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t</ul>\r\n");
      out.write("\t\t\t</nav>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("</header>\r\n");
      out.write("<aside class=\"Hui-aside\">\r\n");
      out.write("\t<input runat=\"server\" id=\"divScrollValue\" type=\"hidden\" value=\"\" />\r\n");
      out.write("\t<div class=\"menu_dropdown bk_2\">\r\n");
      out.write("\t\t<dl id=\"menu-article\">\r\n");
      out.write("\t\t\t<dt><i class=\"Hui-iconfont\">&#xe616;</i> 资讯管理<i class=\"Hui-iconfont menu_dropdown-arrow\">&#xe6d5;</i></dt>\r\n");
      out.write("\t\t\t<dd>\r\n");
      out.write("\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t<li><a _href=\"article-list.html\" data-title=\"资讯管理\" href=\"javascript:void(0)\">资讯管理</a></li>\r\n");
      out.write("\t\t\t\t</ul>\r\n");
      out.write("\t\t\t</dd>\r\n");
      out.write("\t\t</dl>\r\n");
      out.write("\t\t<dl id=\"menu-picture\">\r\n");
      out.write("\t\t\t<dt><i class=\"Hui-iconfont\">&#xe613;</i> 图片管理<i class=\"Hui-iconfont menu_dropdown-arrow\">&#xe6d5;</i></dt>\r\n");
      out.write("\t\t\t<dd>\r\n");
      out.write("\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t<li><a _href=\"picture-list.html\" data-title=\"图片管理\" href=\"javascript:void(0)\">图片管理</a></li>\r\n");
      out.write("\t\t\t\t</ul>\r\n");
      out.write("\t\t\t</dd>\r\n");
      out.write("\t\t</dl>\r\n");
      out.write("\t\t<dl id=\"menu-product\">\r\n");
      out.write("\t\t\t<dt><i class=\"Hui-iconfont\">&#xe620;</i> 产品管理<i class=\"Hui-iconfont menu_dropdown-arrow\">&#xe6d5;</i></dt>\r\n");
      out.write("\t\t\t<dd>\r\n");
      out.write("\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t<li><a _href=\"product-brand.html\" data-title=\"品牌管理\" href=\"javascript:void(0)\">品牌管理</a></li>\r\n");
      out.write("\t\t\t\t\t<li><a _href=\"product-category.html\" data-title=\"分类管理\" href=\"javascript:void(0)\">分类管理</a></li>\r\n");
      out.write("\t\t\t\t\t<li><a _href=\"product-list.html\" data-title=\"产品管理\" href=\"javascript:void(0)\">产品管理</a></li>\r\n");
      out.write("\t\t\t\t</ul>\r\n");
      out.write("\t\t\t</dd>\r\n");
      out.write("\t\t</dl>\r\n");
      out.write("\t\t<dl id=\"menu-comments\">\r\n");
      out.write("\t\t\t<dt><i class=\"Hui-iconfont\">&#xe622;</i> 评论管理<i class=\"Hui-iconfont menu_dropdown-arrow\">&#xe6d5;</i></dt>\r\n");
      out.write("\t\t\t<dd>\r\n");
      out.write("\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t<li><a _href=\"http://h-ui.duoshuo.com/admin/\" data-title=\"评论列表\" href=\"javascript:;\">评论列表</a></li>\r\n");
      out.write("\t\t\t\t\t<li><a _href=\"feedback-list.html\" data-title=\"意见反馈\" href=\"javascript:void(0)\">意见反馈</a></li>\r\n");
      out.write("\t\t\t\t</ul>\r\n");
      out.write("\t\t\t</dd>\r\n");
      out.write("\t\t</dl>\r\n");
      out.write("\t\t<dl id=\"menu-member\">\r\n");
      out.write("\t\t\t<dt><i class=\"Hui-iconfont\">&#xe60d;</i> 会员管理<i class=\"Hui-iconfont menu_dropdown-arrow\">&#xe6d5;</i></dt>\r\n");
      out.write("\t\t\t<dd>\r\n");
      out.write("\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t<li><a _href=\"member-list.html\" data-title=\"会员列表\" href=\"javascript:;\">会员列表</a></li>\r\n");
      out.write("\t\t\t\t\t<li><a _href=\"member-del.html\" data-title=\"删除的会员\" href=\"javascript:;\">删除的会员</a></li>\r\n");
      out.write("\t\t\t\t\t<li><a _href=\"member-level.html\" data-title=\"等级管理\" href=\"javascript:;\">等级管理</a></li>\r\n");
      out.write("\t\t\t\t\t<li><a _href=\"member-scoreoperation.html\" data-title=\"积分管理\" href=\"javascript:;\">积分管理</a></li>\r\n");
      out.write("\t\t\t\t\t<li><a _href=\"member-record-browse.html\" data-title=\"浏览记录\" href=\"javascript:void(0)\">浏览记录</a></li>\r\n");
      out.write("\t\t\t\t\t<li><a _href=\"member-record-download.html\" data-title=\"下载记录\" href=\"javascript:void(0)\">下载记录</a></li>\r\n");
      out.write("\t\t\t\t\t<li><a _href=\"member-record-share.html\" data-title=\"分享记录\" href=\"javascript:void(0)\">分享记录</a></li>\r\n");
      out.write("\t\t\t\t</ul>\r\n");
      out.write("\t\t\t</dd>\r\n");
      out.write("\t\t</dl>\r\n");
      out.write("\t\t<dl id=\"menu-admin\">\r\n");
      out.write("\t\t\t<dt><i class=\"Hui-iconfont\">&#xe62d;</i> 管理员管理<i class=\"Hui-iconfont menu_dropdown-arrow\">&#xe6d5;</i></dt>\r\n");
      out.write("\t\t\t<dd>\r\n");
      out.write("\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t<li><a _href=\"admin-role.html\" data-title=\"角色管理\" href=\"javascript:void(0)\">角色管理</a></li>\r\n");
      out.write("\t\t\t\t\t<li><a _href=\"admin-permission.html\" data-title=\"权限管理\" href=\"javascript:void(0)\">权限管理</a></li>\r\n");
      out.write("\t\t\t\t\t<li><a _href=\"admin-list.html\" data-title=\"管理员列表\" href=\"javascript:void(0)\">管理员列表</a></li>\r\n");
      out.write("\t\t\t\t</ul>\r\n");
      out.write("\t\t\t</dd>\r\n");
      out.write("\t\t</dl>\r\n");
      out.write("\t\t<dl id=\"menu-tongji\">\r\n");
      out.write("\t\t\t<dt><i class=\"Hui-iconfont\">&#xe61a;</i> 系统统计<i class=\"Hui-iconfont menu_dropdown-arrow\">&#xe6d5;</i></dt>\r\n");
      out.write("\t\t\t<dd>\r\n");
      out.write("\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t<li><a _href=\"charts-1.html\" data-title=\"折线图\" href=\"javascript:void(0)\">折线图</a></li>\r\n");
      out.write("\t\t\t\t\t<li><a _href=\"charts-2.html\" data-title=\"时间轴折线图\" href=\"javascript:void(0)\">时间轴折线图</a></li>\r\n");
      out.write("\t\t\t\t\t<li><a _href=\"charts-3.html\" data-title=\"区域图\" href=\"javascript:void(0)\">区域图</a></li>\r\n");
      out.write("\t\t\t\t\t<li><a _href=\"charts-4.html\" data-title=\"柱状图\" href=\"javascript:void(0)\">柱状图</a></li>\r\n");
      out.write("\t\t\t\t\t<li><a _href=\"charts-5.html\" data-title=\"饼状图\" href=\"javascript:void(0)\">饼状图</a></li>\r\n");
      out.write("\t\t\t\t\t<li><a _href=\"charts-6.html\" data-title=\"3D柱状图\" href=\"javascript:void(0)\">3D柱状图</a></li>\r\n");
      out.write("\t\t\t\t\t<li><a _href=\"charts-7.html\" data-title=\"3D饼状图\" href=\"javascript:void(0)\">3D饼状图</a></li>\r\n");
      out.write("\t\t\t\t</ul>\r\n");
      out.write("\t\t\t</dd>\r\n");
      out.write("\t\t</dl>\r\n");
      out.write("\t\t<dl id=\"menu-system\">\r\n");
      out.write("\t\t\t<dt><i class=\"Hui-iconfont\">&#xe62e;</i> 系统管理<i class=\"Hui-iconfont menu_dropdown-arrow\">&#xe6d5;</i></dt>\r\n");
      out.write("\t\t\t<dd>\r\n");
      out.write("\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t<li><a _href=\"system-base.html\" data-title=\"系统设置\" href=\"javascript:void(0)\">系统设置</a></li>\r\n");
      out.write("\t\t\t\t\t<li><a _href=\"system-category.html\" data-title=\"栏目管理\" href=\"javascript:void(0)\">栏目管理</a></li>\r\n");
      out.write("\t\t\t\t\t<li><a _href=\"system-data.html\" data-title=\"数据字典\" href=\"javascript:void(0)\">数据字典</a></li>\r\n");
      out.write("\t\t\t\t\t<li><a _href=\"system-shielding.html\" data-title=\"屏蔽词\" href=\"javascript:void(0)\">屏蔽词</a></li>\r\n");
      out.write("\t\t\t\t\t<li><a _href=\"system-log.html\" data-title=\"系统日志\" href=\"javascript:void(0)\">系统日志</a></li>\r\n");
      out.write("\t\t\t\t</ul>\r\n");
      out.write("\t\t\t</dd>\r\n");
      out.write("\t\t</dl>\r\n");
      out.write("\t</div>\r\n");
      out.write("</aside>\r\n");
      out.write("<div class=\"dislpayArrow hidden-xs\"><a class=\"pngfix\" href=\"javascript:void(0);\" onClick=\"displaynavbar(this)\"></a></div>\r\n");
      out.write("<section class=\"Hui-article-box\">\r\n");
      out.write("\t<div id=\"Hui-tabNav\" class=\"Hui-tabNav hidden-xs\">\r\n");
      out.write("\t\t<div class=\"Hui-tabNav-wp\">\r\n");
      out.write("\t\t\t<ul id=\"min_title_list\" class=\"acrossTab cl\">\r\n");
      out.write("\t\t\t\t<li class=\"active\"><span title=\"我的桌面\" data-href=\"welcome.html\">我的桌面</span><em></em></li>\r\n");
      out.write("\t\t\t</ul>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div class=\"Hui-tabNav-more btn-group\"><a id=\"js-tabNav-prev\" class=\"btn radius btn-default size-S\" href=\"javascript:;\"><i class=\"Hui-iconfont\">&#xe6d4;</i></a><a id=\"js-tabNav-next\" class=\"btn radius btn-default size-S\" href=\"javascript:;\"><i class=\"Hui-iconfont\">&#xe6d7;</i></a></div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<div id=\"iframe_box\" class=\"Hui-article\">\r\n");
      out.write("\t\t<div class=\"show_iframe\">\r\n");
      out.write("\t\t\t<div style=\"display:none\" class=\"loading\"></div>\r\n");
      out.write("\t\t\t<iframe scrolling=\"yes\" frameborder=\"0\" src=\"welcome.html\"></iframe>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("</section>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\" src=\"lib/jquery/1.9.1/jquery.min.js\"></script> \r\n");
      out.write("<script type=\"text/javascript\" src=\"lib/layer/2.1/layer.js\"></script> \r\n");
      out.write("<script type=\"text/javascript\" src=\"static/h-ui/js/H-ui.js\"></script> \r\n");
      out.write("<script type=\"text/javascript\" src=\"static/h-ui.admin/js/H-ui.admin.js\"></script> \r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}