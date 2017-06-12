package com.game.lll.protobuf;

import com.google.protobuf.InvalidProtocolBufferException;

public class Demo {
	public static void main(String[] args) {
		LCPacket.Login.Builder builder = LCPacket.Login.newBuilder();
		builder.setUsername("aaa");
		builder.setPassword("bbb");
		
		LCPacket.Login login = builder.build();
		byte[] result = login.toByteArray();
		
		try {
			LCPacket.Login person1 = LCPacket.Login.parseFrom(result);
			System.out.println(person1);
		} catch (InvalidProtocolBufferException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
//		HelloworldDemo.Person.Builder builder = HelloworldDemo.Person.newBuilder();
//		builder.setId(1);
//		builder.setName("小毛驴");
//		builder.setEmail("1805348347@qq.com");
//		
//		HelloworldDemo.Person person = builder.build();
//		byte[] result = person.toByteArray();
//		
//		try {
//			HelloworldDemo.Person person1 = HelloworldDemo.Person.parseFrom(result);
//			System.out.println(person1);
//		} catch (InvalidProtocolBufferException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
	}
	
}
