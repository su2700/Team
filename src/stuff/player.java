package stuff;

public class  player extends employee{
    int position;
    double height;
    double armSpan;
    public void printinf( int postion, double heigh, double armSpan){
        System.out.println(
                "you are position is " + this.position;
        "you are height is" +this.height;
        "you are arm span is " + this.armSpan;
        "you are salary is" + super.salary;
        "payment date is" + super.payDate;
                    );}


}