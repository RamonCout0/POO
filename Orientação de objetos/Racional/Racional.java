public class Racional{
private int num, den;
public Racional (int num , int den){
    this.num = num;
    this.den = den;
}
public Racional( int num){
    //this(num, 1);
    this.num = num;
    this.den = 1;
}
public Racional(){
    this(0,1);
}

public int getNum(){
    return this.num;
}
public int getDen(){
    return this.num;
}
public Racional vezes(int outro){
//    return this.vezes(new Racional (num));
    int num = this.num * outro();
    int den = this.den * 1 ;
    return new Racional(num, den);
}



}