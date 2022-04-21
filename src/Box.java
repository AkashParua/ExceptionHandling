public class Box  {   //box class with 4 sides of the box
    double a;
    double b;
    double c;
    double d;
    Box(double a,double b,double c,double d) throws InvalidBoxException
    {
        if(a<=0 || b<=0 || c<=0 || d<=0)                       //various types of exceptions change the data members of exception object accordingly
            throw new InvalidBoxException(0) ;
        else if(a!=c && b!=d)
            throw new InvalidBoxException(1);
        else if(a != c)
            throw new InvalidBoxException(2);
        else if(b != d)
            throw new InvalidBoxException(3);
        else {
            this.a = a;
            this.b = b;
            this.c = c;
            this.d = d;
        }
    }
}
