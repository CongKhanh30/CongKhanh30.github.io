class myMath{
   public boolean isTriangle(double a, double b, double c){
   
     boolean flag = false;
    if( a<b+c && b<a+c && c<a+b ){
        if( a*a==b*b+c*c || b*b==a*a+c*c || c*c== a*a+b*b){
            System.out.println("Day la tam giac vuong");
            flag = true;
        } 
        else if(a==b && b==c){
            System.out.println("Day la tam giac deu");
            flag = true;
        }
        else if(a==b || a==c || b==c){
            System.out.println("Day la tam giac can");
            flag = true;
        }
        else if(a*a > b*b+c*c || b*b > a*a+c*c || c*c > a*a+b*b)   {
            System.out.println("Day la tam giac tu");
            flag = true;
        } 
        else{
            System.out.println("Day la tam giac nhon");
            flag = true;
        }
    }
    else{
        System.out.println("Ba canh a, b, c khong phai la ba canh cua mot tam giac");
        return false;
    }   
    
    return flag;
   
   }
  
}