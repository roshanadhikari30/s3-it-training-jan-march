package oddevenfinder.assesment.api;


import oddevenfinder.assesment.module.Finder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OddEvenFinder {
    @PostMapping("/findOddEven")
    public Finder findOddEven(@RequestBody Finder finder ) {
if ((finder.getNumber()%2 ==0 ))
        {
            finder.setType("even");
    }
    else
        {
            finder.setType("odd");
        }

    return finder;
}






}