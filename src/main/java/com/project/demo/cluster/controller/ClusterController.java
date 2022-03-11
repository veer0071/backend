package com.project.demo.cluster.controller;

import org.apache.commons.lang3.RandomStringUtils;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Licensed Materials - Property of IBM 6949-80Q © Copyright IBM Corp. 2019 All Rights Reserved
 * US Government Users Restricted Rights - Use, duplication or disclosure restricted by GSA ADP Schedule Contract with IBM Corp.
 *
 * @author 000BDV744
 * @project cluster
 * @created-on 23/02/22
 */
@RestController
@RequestMapping("/cluster/v1/")
@CrossOrigin
public class ClusterController {

    @GetMapping("randomString")
    public String getRandomString(){
        return RandomStringUtils.random(15, "UTF-8");
    }
}
