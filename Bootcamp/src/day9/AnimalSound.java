package day9;

public class AnimalSound {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s1="old mackdonal had a farm,E-I-E-I and on his fam he had some ANIMAL,E-I-E-I, with a SOUND,SOUND here,and a SOUND ,SOUND thre,here a SOUND there a SOUND,every where a SOUND ,SOUND";
String replaceString=s1.replace("SOUND", "chicks");
String replaceString2=s1.replace("ANIMAL", "chick");
System.out.println(replaceString);
System.out.println(replaceString2);
	}

}
