package d.generic;

public class GenericSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		GenericSample sample = new GenericSample();
		sample.checkCastingDTO();
		
	}

	public void checkCastingDTO() {
		CastingDTO dto1 = new CastingDTO();
		dto1.setObject(new String());

		CastingDTO dto2 = new CastingDTO();
		dto2.setObject(new StringBuffer());

		CastingDTO dto3 = new CastingDTO();
		dto3.setObject(new StringBuilder());

	}
//
//	public void checkDTO(CastingDTO dto) {
//		Object tempObject = dto.getObject();
//		if (tempObject instanceof StringBuilder) {
//			System.out.println("StringBuilder");
//		} else if (tempObject instanceof StringBuffer) {
//			System.out.println("StringBuffer");
//		}
//	}

}
