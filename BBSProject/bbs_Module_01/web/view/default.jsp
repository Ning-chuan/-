<%@ page contentType="text/html; charset=gb2312"%>
<%@ taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core" %>

<html>
  <head>
    <title>��ҳ��������ʾ���е�����</title>
  </head>
  <body>
    <center>
      <table border="0" width="100%" cellspacing="0" cellpadding="0" style="margin-top:8">        

        <tr>
            <td>                
                <table rules="none" border="1" width="100%"  cellspacing="0" cellpadding="3" bordercolor="lightgrey" bordercolorlight="lightgrey" bordercolordark="white">
                    <tr height="30"><td style="text-indent:5" background="images/index/classT.jpg"><b><font color="white">�� <bean:write name="classSingle" property="className"/></font></b></td></tr>
                    <tr bgcolor="#F9F9F9">
                        <td height="60" align="center">
                              <c:if test="${empty parentBoards}">
		                            <li>����̳������ް�����ʾ��</li>
                              </c:if>



                                <c:forEach items="${parentBoards}" var="parentBoard">
                                    <li>${parentBoard.boardName}</li>
                                    <c:forEach items="${parentBoard.children}" var="childBoard">
                                <table border="1" width="100%" cellspacing="0" cellpadding="4" bgcolor="#F9F9F9" bordercolor="#EEEEEE" bordercolorlight="#EEEEEE" bordercolordark="white" rules="cols">

        	    	       				          <tr height="35">
					       		                    <td align="center" width="60" rowspan="2"><img src="images/index/boardPic.jpg"></td>
                    	        		            <td><img src="images/index/btitle.jpg"> <a href="" style="" alt="������棡">${childBoard.boardName}</a></td>
                        						    <td rowspan="2" width="20%" align="center">
						                           		<table border="0" width="90%" cellspacing="3" cellpadding="0">
		                	                                <tr><td>����������<b><font color="blue"></font></b></td></tr>
        			        	                            <tr><td>�������ӣ�<b><font color="green"></font></b></td></tr>
                    		    	                        <tr><td>δ �� ����<b><font color="red"></font></b></td></tr>
                            			                </table>
                                    			    </td>
		                                    	</tr>
	        		                            <tr height="25" background="images/index/masterB.jpg">
    	            		                        <td style="text-indent:60">
    	            		                            <img src="images/index/master.jpg">
        	            		                        <a href="">
															����  </a>
													</td>

        	                		            </tr>

            	                    		</table>
                                    </c:forEach>
                                </c:forEach>



                        </td>
                    </tr>
                    <tr height="25"><td style="text-indent:10" background="images/index/boardE.jpg"><font color="#F9F9F9)">��̳���ܣ�</font></td></tr>

                </table>


            </td>
        </tr>
        <tr height="3"><td></td></tr>

      </table>
    </center>
  </body>
</html>