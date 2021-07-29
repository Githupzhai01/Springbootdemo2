package com.example.controller;

import com.example.entity.Playuser;
import com.example.service.PlayuserService;
import com.example.util.MD5;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class PlayuserController {
    @Autowired
    PlayuserService playuserService;

    //跳转登录页面
    @RequestMapping("action")
    public String action() {
        return "login";
    }
    //登录方法
    @RequestMapping("loginaction")
    public String login(Playuser playuser, Model model) throws Exception {
        boolean login = playuserService.login(playuser);
        if(login==true){
            return "redirect:/Selplayuser";
        }else{
            model.addAttribute("msg","用户名或密码错误!!!");
            return "login";
        }
    }

    //注册用户
    @RequestMapping("adduser")
    public String Adduser(Playuser playuser) throws Exception {
        MD5 md5=new MD5();
        String addpwd = md5.md5Encode2(playuser.getPlaypwd());
        playuser.setPlaypwd(addpwd);
        playuserService.adduser(playuser);
        return "login";
    }

    //查询用户
    @RequestMapping("Selplayuser")
        public String selplayuser(Model model){
        List<Playuser> playusers =playuserService.SelPlayuser();
        model.addAttribute("playlist",playusers);
        return "index";
    }


    @RequestMapping("toindex")
    public String Toindex(){
        return "index";
    }
    @RequestMapping("toabout")
    public String ToAbout(){
        return "about";
    }
    @RequestMapping("tocontact")
    public String Tocontact(){
        return "contact";
    }
    @RequestMapping("toservices")
    public String Toservices(){
        return "services";
    }

}

