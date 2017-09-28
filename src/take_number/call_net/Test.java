package take_number.call_net;

import java.util.ArrayList;
import java.util.List;

import take_number.call_net.util.CovertToXml;
import take_number.call_net.util.Table;

public class Test {

	public static void main(String[] args) {
		CreateItemForSDByCustSV sv = new CreateItemForSDByCustSV();
		CreateItemForSDByCustSVSoap cfbs = sv.getCreateItemForSDByCustSVSoap();
		
		String orgID = "1001212053115860";
		String userID = "1001212053116969";
		String userCode = "admin";
		String userName = "admin";
		String strdt = getDtXmlStr();
		String _do = cfbs._do(strdt, orgID, userID, userCode, userName);
		System.out.println(_do);
	}
	
	
	private static String getDtXmlStr() {
		Table transferA = new Table();
		transferA.setCode("0.N50001.0014");
		transferA.setName("������������");
		transferA.setMainItemCategory("N50001");
		transferA.setItemFormAttribute("9");
		transferA.setSPECS("���Թ��");
		transferA.setPLMCode("PLC����Ψһ��");
		transferA.setAssetCategory("11");
		transferA.setUOM("A33");
		transferA.setSecondUOM("123");
		transferA.setWeight("12.5");
		transferA.setSecondWeight("123");
		transferA.setMaterial("���Բ���");
		transferA.setDescription("��������");
		transferA.setOldNo("���Ծ�ͼ��");
		transferA.setDept("����");
		
		Table transferB = new Table();
		transferB.setCode("0.N50001.0014");
		transferB.setName("������������");
		transferB.setMainItemCategory("N50001");
		transferB.setItemFormAttribute("9");
		transferB.setSPECS("���Թ��");
		transferB.setPLMCode("PLC����Ψһ��");
		transferB.setAssetCategory("11");
		transferB.setUOM("A33");
		transferB.setSecondUOM("123");
		transferB.setWeight("22.67");
		transferB.setSecondWeight("123");
		transferB.setMaterial("���Բ���");
		transferB.setDescription("��������");
		transferB.setOldNo("���Ծ�ͼ��");
		transferB.setDept("����");
		
		List<Table> list = new ArrayList<>();
		list.add(transferA);
		list.add(transferB);
		
		try {
			String xml = CovertToXml.beanListToXml(list, Table.class);
			System.out.println(xml);
			return xml;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
}
