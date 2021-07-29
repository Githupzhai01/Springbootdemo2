package com.example.service;

import com.example.entity.Playuser;
import com.example.entity.PlayuserExample;
import com.example.mapper.PlayuserMapper;
import com.example.util.MD5;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.xml.crypto.Data;
import java.util.Date;
import java.util.List;

@Service
public class PlayuserService {
    @Autowired
    PlayuserMapper playuserMapper;


    //根据用户名密码登录
    public boolean login(Playuser playuser) throws Exception {
        MD5 md5=new MD5();
        String md5pwd = md5.md5Encode2(playuser.getPlaypwd());
        PlayuserExample playuserExample=new PlayuserExample();
        playuserExample.createCriteria().andPlaynameEqualTo(playuser.getPlayname()).andPlaypwdEqualTo(md5pwd);
        List<Playuser> playusers = playuserMapper.selectByExample(playuserExample);
//        System.out.println(playusers.size());
        if(playusers.size()!=0){
            return true;
        }else{
            return false;
        }
    }

    //注册用户
    public int  adduser(Playuser playuser){
        Date data=new Date();
        playuser.setPlaystartime(data);
        playuser.setPlaystate(0);
        return playuserMapper.insertSelective(playuser);
    }

        //查询用户姓名
        public List<Playuser> SelPlayuser(){
            PlayuserExample playuserExample=new PlayuserExample();
            playuserExample.createCriteria().andPlaystateEqualTo(0);
            List<Playuser> playusers = playuserMapper.selectByExample(playuserExample);
            return  playusers;
        }


}
