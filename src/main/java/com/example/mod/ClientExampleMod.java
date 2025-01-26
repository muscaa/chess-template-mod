package com.example.mod;

import muscaa.chess.client.modloader.IClientModInitializer;

public class ClientExampleMod implements IClientModInitializer {
	
	@Override
	public void onPreInitializeClient() throws Exception {
		System.out.println("--------------------------");
		System.out.println("Hello from the pre client!");
		System.out.println("--------------------------");
	}
	
	@Override
	public void onPostInitializeClient() throws Exception {
		System.out.println("--------------------------");
		System.out.println("Hello from the post client!");
		System.out.println("--------------------------");
	}
}
