package me.cungu.footmark.bizprocess.user.bs.impl;

import me.cungu.footmark.bizprocess.user.bs.IUserBS;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import eap.base.BaseTest;

public class UserBSImplTest extends BaseTest {
	
	@Autowired
	@Qualifier("userBS")
	private IUserBS userBS;

}