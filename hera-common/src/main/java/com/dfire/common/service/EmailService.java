package com.dfire.common.service;

import javax.mail.MessagingException;

/**
 * Created by xiaosuda on 2018/7/31.
 */
public interface EmailService {

    void sendEmail(String title, String content, String... address) throws MessagingException;
}