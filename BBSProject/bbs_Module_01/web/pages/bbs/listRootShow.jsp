<%@ page contentType="text/html; charset=gb2312"%>

<%@ taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core" %>
<html>
  <head>
    <title>��ʾĳ�����е���������</title>
  </head>
  <body>
    <center>
      <table border="1" width="100%" cellspacing="0" cellpadding="0" bordercolor="#E0E0E0" bordercolorlight="#E3E3E3" bordercolordark="white" rules="rows" style="margin-top:8">          
          <tr height="45" bgcolor="#F9F9F9">
              <!-- ���湫�� -->
              <td colspan="4" style="text-indent:10">
                  ���湫�棺
              </td>
              <!-- ���������ӡ������� -->
              <td colspan="2" align="center"><a href="needLogin/addBbs.do?method=addBbs">[��������]</a></td>
          </tr>
          
          <!-- ������ת -->
          <tr height="30" bgcolor="#F9F9F9">

              <td colspan="6" align="right" background="images/index/boardE.jpg">
                  <input type="hidden" name="method" value="rootListShow">
                  ��ת����:

                  &nbsp;
              </td>

          </tr>
          
          <!-- ****************��ʾ�ö�����**************** -->
          <tr height="30"><td colspan="6" style="text-indent:5" background="images/index/classT.jpg"><b><font color="white">�� �ö�����</font></b></td></tr>
          <tr height="30" align="center">
              <td width="8%">״̬</td>
              <td width="35%">���ӱ���</td>
              <td width="7%">�ظ���</td>
              <td width="22%">������</td>
              <td width="28%" colspan="2">���ظ�</td>
          </tr>
          <!-- �ö������б����� -->
          <c:if test="${empty topPosts}">
              <tr height="70"><td bgcolor="#F9F9F9" align="center" colspan="6"><font color="red"><li>�ö������б����ڣ�</li></font></td></tr>
          </c:if>

          <!-- �ö������б���� -->
          <c:if test="${not empty topPosts}">
                  <tr>
                      <td colspan="6">
                          <table border="1" width="100%" cellspacing="0" cellpadding="0" bordercolor="#F0F0F0" bordercolorlight="#F0F0F0" bordercolordark="white" rules="all">
                              <!-- �����ö������б� -->
                              <c:forEach items="${topPosts}" var="topPost">
                                  <tr height="35" style="text-indent:5" bgcolor="#FBFBFB">
                       			      <td width="8%" align="center">${topPost.status}</td>
			                          <td width="35%" style="text-indent:10">                             
            			                  <img src="images/face/bbs/">
                        			      <a href="">${topPost.title}</a>
			                          </td>
            			              <td width="7%" align="center"></td>
                        			  <td width="22%" align="center">
			                              <a href="">
            			                      <b></b>
                        			          <br>
                			              </a>
			                          </td>
            			              <td width="28%" align="center" colspan="2">
                        			      <a href="">
		                            	      <b></b>
        		                        	  <br>
                        			      </a>
    			                      </td>                          
                			      </tr>
                              </c:forEach>
			              </table>
			          </td>
			      </tr>
          </c:if>
          <tr height="30"><td colspan="6" align="right" background="images/index/boardE.jpg"></td></tr>
          
          <!-- ****************��ʾ��ͨ����**************** -->
          <tr height="30"><td colspan="6" style="text-indent:5" background="images/index/classT.jpg"><b><font color="white">�� ��������</font></b></td></tr>
          <tr height="30" align="center" bgcolor="#F4F4F4">
              <td width="8%">״̬</td>
              <td width="35%">���ӱ���</td>
              <td width="7%">�ظ���</td>
              <td width="22%">������</td>
              <td width="22%">���ظ�</td>
              <td width="6%">����</td>
          </tr>
          <!-- ��ͨ�����б����� -->
          <c:if test="${empty otherPosts}">
              <tr height="180"><td bgcolor="#F9F9F9" align="center" colspan="6"><font color="red"><li>�Բ��������б����ڣ�</li></font></td></tr>
          </c:if>

          <!-- ��ͨ�����б���� -->
          <c:if test="${not empty otherPosts}">
                  <tr>
                      <td colspan="6">
                          <table border="1" width="100%" cellspacing="0" cellpadding="0" bordercolor="#F0F0F0" bordercolorlight="#F0F0F0" bordercolordark="white" rules="all">
			 	              <!-- ������ͨ�����б� -->
                              <c:forEach items="${otherPosts}" var="otherPost">
			                      <tr height="35" bgcolor="#F9F9F9">
            			              <!-- �������״̬ -->
            			              <td align="center" width="8%">
                                            ${otherPost.status}
			                          </td>
			                          <!-- ������ӱ��� -->
            			              <td style="text-indent:10" width="35%">
                        			      <img src="images/face/bbs/${otherBbsSingle.bbsFace}">
			                              <a href="">${otherPost.title}</a>
            			              </td>
            			              <!-- ������ӻظ��� -->
    			                      <td align="center" width="7%"></td>
                			          <!-- ������ӷ����� -->
                			          <td align="center" width="22%">
                            			  <a href="">
			                                  <b></b>
        		                        	  <br>
                        			      </a>
    			                      </td>
                			          <!-- ������ظ��� -->
                			          <td align="center" width="22%">
                            			  <a href="">
			                                  <b></b>
            			                      <br>
                        			      </a>
			                          </td>
			                          <!-- ��ɾ���������� -->
            			              <td align="center" width="6%"><a href="" title="¥��/����Ա����" onclick="javaScript:return confirm('ȷ��Ҫɾ������Ϣ?')">��ɾ��</a></td>
			                      </tr>
                              </c:forEach>
		                  </table>
	                  </td>
	              </tr>
          </c:if>

          <tr height="10" bgcolor="#F4F4F4"><td colspan="6" align="right"></td></tr>                    
          <!-- ****************��ҳ������**************** -->
          <tr height="30">
              <td colspan="6" align="right" background="images/index/boardE.jpg">
                  <table border="0" width="100%" cellspacing="0">
                      <tr>
                          <td width="37%" align="center">





                                  <a href="postServlet?boardId=${boardId}&pageNo=1">��һҳ</a>&nbsp;&nbsp;<a href="postServlet?boardId=${boardId}&pageNo=${pageNO-1}">��һҳ</a>




                              &nbsp;&nbsp;

                                  <a href="postServlet?boardId=${boardId}&pageNo=${pageNo+1}">��һҳ</a>&nbsp;&nbsp;<a href="postServlet?boardId=${boardId}&pageNo=${totalPage}">βҳ</a>
                              &nbsp;&nbsp;&nbsp;&nbsp;

                          </td>
                          <td align="center" width="37%">
                              <form action="" method="post" name="form1">
                                  <select name="pageNo" onchange="">
                                  </select>
                              </form>
                          </td>



                          <form action="bbs_board" method="post">
                              <td width="26%">
                                  ת����
                                  <input type="hidden" name="boardId" value="${boardId }">
                                  <input type="text" name="pageNo" size="7">
                                  <input type="submit" value="��תҳ��2">
                              </td>
                          </form>
                      </tr>
                  </table>
              </td>
          </tr>
          <tr height="10" bgcolor="#F4F4F4"><td colspan="6" align="right"></td></tr>
      </table>
    </center>
  </body>
</html>