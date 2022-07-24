package Examen;

public class pregunta1 {
    public void matrisN1() {
        Object[][] matris1;
        matris1=new Object[3][3];

        matris1[0][0]="1";
        matris1[0][1]="2";
        matris1[0][2]="12"; 

        matris1[1][0]="6";
        matris1[1][1]="50";
        matris1[1][2]="10";

        matris1[2][0]="2";
        matris1[2][1]="5";
        matris1[2][2]="3";
    
        for (int i = 0; i < matris1.length; i++) {
           System.out.println(matris1[i][0]+"\t"+matris1[i][1]+"\t"
           +matris1[i][2]); 
        }
    }
    public void matrisN2() {
        Object[][] matris2;
        matris2=new Object[3][3];

        matris2[0][0]="1";
        matris2[0][1]="6";
        matris2[0][2]="2"; 

        matris2[1][0]="2";
        matris2[1][1]="8";
        matris2[1][2]="5";

        matris2[2][0]="4";
        matris2[2][1]="10";
        matris2[2][2]="3";
    
        for (int i = 0; i < matris2.length; i++) {
           System.out.println(matris2[i][0]+"\t"+matris2[i][1]+"\t"
           +matris2[i][2]); 
        }
    }
    
    public void Pregunta1() {
        int[][] mA={{1,2,12},{6,50,10,9},{2,5,3}};
        int[][] mB={{1,6,2},{2,8,5},{4,10,3}};
        int[][] mR=new int[mA.length][mA[0].length];
        for (int i = 0; i < mA.length; i++) {
            for (int j = 0; j < mA[0].length; j++) {
                mR[i][j]=mA[i][j]-mB[i][j];
            }
        }
        imprimirMatrix(mR);
    }
    
    public void imprimirMatrix(int[][] m) {
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++) {
                System.out.print(m[i][j]+"\t");
            }
            System.out.println("");
        }
    }
    public void imprimirMatrix(Object[][] m) {
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++) {
                System.out.print(m[i][j]+"\t");
            }
            System.out.println("");
        }
    }
    public static void main(String[] args) {
        System.out.println("matris numero 1");
        new pregunta1().matrisN1();
        System.out.println("matris numero 2");
        new pregunta1().matrisN2();
        System.out.println("resultado");
        new pregunta1().Pregunta1();
    }
    
}
