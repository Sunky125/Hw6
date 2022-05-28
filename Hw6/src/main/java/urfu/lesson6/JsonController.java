package urfu.lesson6;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import java.util.ArrayList;

@Controller
public class JsonController
{
    @Autowired
    private ItemManager itemManager;

    @PutMapping("/json")
    public ResponseEntity getItem(@RequestBody Item item)
    {
        try {
            var newItem = itemManager.addItem(item);
            return ResponseEntity.ok(newItem);
        } catch (Exception e)
        {
            return ResponseEntity.badRequest().body("Incorrect data");
        }
    }

    @GetMapping("/headers")
    public ResponseEntity<ArrayList<String>> getHeaders(@RequestHeader MultiValueMap headers)
    {
        var result = new ArrayList<String>();
        headers.forEach((key, value) -> {
            result.add(String.format("Header '%s' = %s%n", key, value));
            System.out.printf("Header '%s' = %s%n", key, value);
        });
        System.out.println(headers.toString());
        return new ResponseEntity<ArrayList<String>>(result, HttpStatus.OK);
    }
}
