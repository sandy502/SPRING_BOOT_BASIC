package com.project.RestAPI;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {

//    @GetMapping
//    public String getUsers(){
//        return "http get request was sent.";
//    }

    @GetMapping("/{userId}")  // path parameter
    public String getUser(@PathVariable String userId){
        return "http get request was sent for userId: "+userId;
    }

    @GetMapping
    public String getUsers(@RequestParam(value = "page") int pageno, @RequestParam(value = "limit") int limitno){
        return "http get request was sent for page: "+pageno+" and limit is: "+limitno;
    }

    @PostMapping
    public String createUsers(){
        return "http post request was sent.";
    }
    @PutMapping
    public String updateUsers(){
        return "http put request was sent.";
    }
    @DeleteMapping
    public String deleteUsers(){
        return "http delete request was sent.";
    }

}
