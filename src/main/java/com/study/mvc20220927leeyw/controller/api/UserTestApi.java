package com.study.mvc20220927leeyw.controller.api;

import com.study.mvc20220927leeyw.controller.dto.UserReqDto;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.*;

/* map 사용 수업*/


@Controller
public class UserTestApi {

    @ResponseBody
    @PostMapping("/api/test/user/param")
    public String addUserParam(
            @RequestParam String username,
            @RequestParam String password,
            @RequestParam String name,
            @RequestParam String email ) {
        /* map을 생성할때 String*/
        Map<String,String> map = new HashMap<String, String>();

        /* map은 꼬리표를 달아서 넣는다.
        *  map에서 태그를 가져올때는 put  */
        map.put("username", username);
        map.put("password", password);
        map.put("name", name);
        map.put("email", email);

        System.out.println("map: " +map.toString());

        return map.toString();
    }


    @ResponseBody
    @PostMapping("/api/test/user/dto")
    public String addUserDto(UserReqDto userReqDto){

/*        //map을 생성할때 String
        Map<String,String> map = new HashMap<String, String>();

        map.put("username", userReqDto.getUsername());
        map.put("password", userReqDto.getPassword));
        map.put("name", userReqDto.getName());
        map.put("email", userReqDto.getEmail());

        System.out.println("map: " +map.toString());*/

        return userReqDto.toString();
    }

    //   json
    @ResponseBody
    @PostMapping("/api/test/user/json")

    //json 객체를 받으려면 UserReqDto 앞에 @RequestBody 가와야한다
    public Object addUserJSON(@RequestBody UserReqDto userReqDto){

        List<Map<Integer, UserReqDto>> list = new ArrayList<Map<Integer,UserReqDto>>();

        Map<Integer, UserReqDto> map = null;

        for(int i= 0; i < 100; i++){
            if(i == 0 || i % 10 == 0){
                map = new TreeMap<Integer, UserReqDto>();
            }
            map.put(i + 1, userReqDto);

            if((i - 9) % 10 == 0){
                list.add(map);
            }
        }

    return list;
    }


}