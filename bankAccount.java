abstract class bank
{
abstract int credit(int amt);
abstract int debit(int amt);
abstract void show();
}
class sbi extends bank
{
int bal;
void get(int x)
{
bal=x;
}
int debit(int amt)
{
return bal=bal-amt;
}
void show()
{
System.out.print(bal);
}
int credit(int amt)
{
return bal=amt+bal;
}
}
class bankaccount
{
public static void main(String geetansh[])
{
sbi obj=new sbi();
obj.get(10000);
int a=obj.debit(3000);
obj.show();
int b=obj.credit(5000);
obj.show();
}
}
