<%@ page contentType="text/html; charset=gb2312"%>


<html>
  <head>
    <title>�û�ע��</title>
  </head>
  <body>
    <center>
          <table border="1" width="80%" bgcolor="#F9F9F9" cellspacing="0" cellpadding="0" bordercolor="lightgrey" bordercolorlight="lightgrey" bordercolordark="white" rules="none" style="margin-top:5">
          <form action="user/reg.do">
          <input type="hidden" name="method" value="userReg">
          <input type="hidden" name="validate" value="yes">
	          <tr height="80">  <td colspan="5" style="text-indent:20">�� �û�ע��</td></tr>
	          <tr height="45">
	                <td align="right" width="35%">�� �� ����&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</td>
    	            <td colspan="4"><input type="text" name="userName" size="40"/></td>
    	      </tr>
    	      <tr>
    	      		<td></td>
    	      		<td colspan="4"></td>
    	      </tr>
	          <tr height="45">
	                <td align="right">�û����룺&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</td>
	                <td colspan="4"><inputy type="text"  name="userPassword" size="40" redisplay="false"/></td>
	          </tr>
	          <tr>
    	      		<td></td>
    	      		<td colspan="4"></td>
    	      </tr>
	          <tr height="45">
	                <td align="right">ȷ�����룺&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</td>
	                <td colspan="3"><input type="password" name="aginPassword" size="40" redisplay="false"></td>
	                <td rowspan="3" width="20%" valign="bottom" style="padding-bottom:10">	                    
	                    <img id="head" src="images/face/user/user0.gif" style="border:1 solid">   
	                </td>
	          </tr>
	          <tr>
    	      		<td></td>
    	      		<td colspan="4"><html:errors property="aginPassword"/></td>
    	      </tr>
   	          <tr height="45">
	                <td align="right">�û��Ա�&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</td>
	                <td>
	                    <input type="radio"  name="userSex" value="��"/>��
	                    <input type="radio"  name="userSex" value="Ů"/>Ů
	                </td>
	                <td width="15%" align="center">�û�ͷ��</td>
	                <td width="20%" align="center">
	                    <input type="select" name="userFace" onchange="showHead(this.options[this.selectedIndex].value)">
	                        <option collection="headFace" name="value" labelProperty="label" filter="false"/>
	                    </input>
	                </td>
	          </tr>
   	          <tr height="45">
	                <td align="right">��ϵ�绰��&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</td>
	                <td colspan="4"><inputy type="text"  name="userPhone" size="40"/></td>
	          </tr>
	          <tr>
    	      		<td></td>
    	      		<td colspan="4"></td>
    	      </tr>
	          <tr height="45">
	                <td align="right">OICQ��&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</td>
	                <td colspan="4"><inputy type="text"  name="userOICQ" size="40"/></td>
	          </tr>
	          <tr>
    	      		<td></td>
    	      		<td colspan="4"></td>
    	      </tr>
   	          <tr height="45">
	                <td align="right">E-mail��&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</td>
	                <td colspan="4"><inputy type="text"  name="userEmail" size="50"/></td>
	          </tr>
   	          <tr>
    	      		<td></td>
    	      		<td colspan="4"></td>
    	      </tr>

    	      <tr height="80">
	                <td>&nbsp;</td>
	                <td colspan="4">
	                    <inputy type="submit"  value="�û�ע��"/>
						<inputy type="submit" value="������д"/>
    	            </td>
	          </tr>	      	      
          </form>
          </table>
          <br>
    </center>
  </body>
</html>