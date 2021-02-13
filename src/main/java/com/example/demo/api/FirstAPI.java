package com.example.demo.api;




import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


//<form th:action="@{/send}" method="get">
//<textarea  th:name="doc" rows="10" cols="100" name="doc"></textarea>
//<button type="submit">Send</button>
//</form>
//
//@GetMapping("/send")
//public String send(@RequestParam(name="doc", required = false) String doc) {
////change required = false as per requirement
//        System.out.println("Doc: "+doc);
//        return "textarea-input";
     //   }
@RestController

public class FirstAPI  {


    @RequestMapping("/")
    public String Welcome()
    {
        return " Welcome to SPRING BOOT";
    }
    @RequestMapping("/hi")
    public String Hello()
    {
        return "Hi, How are you";
    }




    @RequestMapping("/reverse")

    //public int reverse(@RequestParam(name="doc", required = false) int x){
    public int reverse() {
 int x =70696;
        double reverse = 0;

        while (x !=0)
        {

            int mod = x%10; //first take a mode to get the 1th digit number of x

            reverse = reverse *10; //whatever reverse value we have multiply by  10

            reverse = reverse + mod; // Then generate new reverse value

            if( (reverse< Math.pow(-2, 31)) || (reverse> Math.pow(2, 31)) ) {
                reverse =0.0;
                break;
            }

            x =x/10; //For next iteration divide the no by 10, so that it would be 1/10th of the previous x

        }


        return (int)reverse;

    }

}
