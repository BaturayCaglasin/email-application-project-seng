package BankApplication;


//Rate class'ını interface yaratmamızın nedeni; rate'leri enum olarak hard coded verdiğimizdendir.
//Developer'ın geliştirme yaparken Rate bilgilerini bilmesi gerekmez. Rate bilgileri bu bakımdan bir interface altındadır.
public interface IBaseRate {

    //metotlarda final kullanamazsın! Final yerine geçecek olan default'u kullandık
    default double getBaseRate() {
        return 2.5;
    }

//Write a method that returns the base rate


}
