package com.adanyc.spring.soap.api;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.adanyc.spring.soap.api.sunat.BillConsultService;
import com.adanyc.spring.soap.api.sunat.BillService;

@SpringBootApplication
public class DemoSpringBootSoapWsClienteApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(DemoSpringBootSoapWsClienteApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		BillConsultService service = new BillConsultService();
		BillService port = service.getBillConsultServicePort();
		port.getStatus("20100144922", "F", "001", 708091);
		System.out.println("demoxxxx");
		
		// wsimport -keep -verbose https://e-factura.sunat.gob.pe/ol-it-wsconscpegem/billConsultService?wsdl -d "C:\temp" -p "com.adanyc.spring.soap.api.sunat" -Xnocompile
	}

}
