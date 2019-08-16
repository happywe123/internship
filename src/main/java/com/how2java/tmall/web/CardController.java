package com.how2java.tmall.web;


import com.how2java.tmall.pojo.Card;
import com.how2java.tmall.service.CardService;
import com.how2java.tmall.util.Page4Navigator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import javax.servlet.http.HttpServletRequest;

@RestController
public class CardController {

    @Autowired
    CardService cardService;

    @GetMapping("/cards")
    public Page4Navigator<Card> list(@RequestParam(value = "start", defaultValue = "0") int start, @RequestParam(value = "size", defaultValue = "5") int size) throws Exception {
        start = start<0?0:start;
        Page4Navigator<Card> page = cardService.list(start, size, 5);  //5表示导航分页最多有5个，像 [1,2,3,4,5] 这样
        return page;
    }

    @PostMapping("/cards")
    public Object add(@RequestBody Card bean){
        cardService.add(bean);
        return bean;
    }

    @GetMapping("/cards/{id}")
    public Card get(@PathVariable("id") int id){
        Card card = cardService.get(id);
        return card;
    }

    @DeleteMapping("/cards/{id}")
    public String delete(@PathVariable("id") int id, HttpServletRequest httpServletRequest){
        cardService.delete(id);
        return null;
    }

    @PutMapping("/cards")
    public Object update(@RequestBody Card bean){
        cardService.update(bean);
        return bean;
    }
}
