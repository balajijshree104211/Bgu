package com.samsung.mobiles;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Dataseeder implements CommandLineRunner
{
@Autowired
	private MobileRepository mobileRepository;


@Override
public void run(String... args) throws Exception {
	// TODO Auto-generated method stub
	if (mobileRepository.count() == 0)
	{
		List<Mobile> mobiles = Arrays.asList(
				new Mobile(null, "Lg", "Lx", 100), 
				new Mobile(null, "Samsung", "Sx", 200), 
				new Mobile(null, "Nokia", "Nx", 300));
		mobileRepository.saveAll(mobiles);
		System.out.println("Mobile list saved");
		
	}
}
}
