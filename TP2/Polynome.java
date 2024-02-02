package TP2;
public class Polynome {
    private double a ;
    private double b;
    private double c ;

  
  //constucteur explicite 
   public Polynome (double a , double b , double c){
    this.a = a;
    this.b = b;
    this.c = c;
   }
   //constructeur sans arguments
   public Polynome() {
    this.a = 0.0;
    this.b = 0.0;
    this.c = 0.0;
   }
   // les getters et setters
   public double getA() {
    return a;
}

public double getB() {
    return b;
}

public double getC() {
    return c;
}

public void setA(double a) {
    this.a = a;
}

public void setB(double b) {
    this.b = b;
}

public void setC(double c) {
    this.c = c;
}
// les methodes d'instances 
  public double evaluer(int val) {
    return a * Math.pow(val, 2) + b * val + c;
  }
  public void multCoeff(int val)  {
        this.a *= val;
        this.b *= val;
        this.c *= val;
  }
  public Polynome somme(Polynome autrePoly) {
      return new Polynome (this.a+autrePoly.getA(), this.b+autrePoly.getB(),this.c+autrePoly.getC());
  }
  public Polynome derive() {
      return new Polynome(2*a,b,0);
  }
  public double evaluerDerive(int val) {
    return 2 * a * val + b;
  }
  public double discriminant() {
    return Math.pow(b, 2) - 4 * a * c;
  }
  public void afficherRacines() {
       double delta = discriminant();
       if (delta <0) {
        System.out.println("il n'y a pas de racines dans le polynomes");
       } else if (delta ==0) {
        double racine = -b / (2 * a);
        System.out.println("il y a une unique racine au polynome qui est : "+racine);
       } else {
        double r1 = (-b + Math.sqrt(delta)) / (2 * a);
        double r2 = (-b - Math.sqrt(delta)) / (2 * a);
        System.out.println("la premiere racine est :"+r1+"la deuxieme racine est : "+r2 );
       }
  }
  public String toString() {
    return "[" + a + "x^2 + " + b + "x + " + c + "]";
}
public void afficher() {
    System.out.println(toString());
}
}

