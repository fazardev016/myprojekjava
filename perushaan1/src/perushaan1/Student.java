package perushaan1;

public class Student {
	public static void main(String[] args){
		
		String e,f,g,h,i,j;
        int x[] = new int[6];
        
        x[0] = 89 ;
        x[1] = 90 ;
        x[2] = 97 ;
        x[3] = 85 ;
        x[4] = 88 ;
        x[5] = 93 ;
        
        String b[]= new String[6];
        
        b[0] = " Agus " ;
        b[1] = " Juni " ;
        b[2] = " Yanuar ";
        b[3] = " Desi " ;
        b[4] = " Nopi " ;
        b[5] = " Febi " ;
        
        String c[]= new String[6];
        
        c[0] = " Ranking 2 " ;
        c[1] = " Ranking 3 " ;
        c[2] = " Ranking 1 " ;
        c[3] = " Ranking 5 " ;
        c[4] = " Ranking 4 " ;
        c[5] = " Ranking 6 " ;
        
        e= b[2]+ x[2]+ c[2];
        f= b[5]+ x[5]+ c[0];
        g= b[1]+ x[1]+ c[1];
        h= b[0]+ x[0]+ c[4];
        i= b[4]+ x[4]+ c[3];
        j= b[3]+ x[3]+ c[5];
        
        System.out.println("Nilai Rapot Semester 2");
        System.out.println("----------------------");
        
        System.out.println(e);
        System.out.println(f);
        System.out.println(g);
        System.out.println(h);
        System.out.println(i);
        System.out.println(j);
        


        
        
}
}