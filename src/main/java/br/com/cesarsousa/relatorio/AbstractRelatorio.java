package br.com.cesarsousa.relatorio;

import java.util.HashMap;
import java.util.List;

import net.sf.jasperreports.engine.JREmptyDataSource;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;

public abstract class AbstractRelatorio {

	private String path;

	public void gerarRelatorio(String nomeRelatorio, HashMap paramRelatorio, List listaRelatorio) throws Exception {

		//this.path = this.getClass().getClassLoader().getResource("").getPath();
		this.path = "C:\\Users\\César Sousa Júnior\\eclipse-workspace\\hello-jasper\\src\\main\\java\\br\\com\\cesarsousa\\jasper\\";

		//JRBeanCollectionDataSource rel = new JRBeanCollectionDataSource(listaRelatorio);
		//JasperPrint print = JasperFillManager.fillReport(this.path + nomeRelatorio + ".jasper", paramRelatorio, rel);
		
		JasperPrint print = JasperFillManager.fillReport(this.path + nomeRelatorio + ".jasper", paramRelatorio, new JREmptyDataSource());

		/*
		 * desktop
		 */
		//JasperExportManager.exportReportToPdfFile(print, "C:\\Users\\cesar\\eclipse-oxygen-workspace\\hello-jasper\\target\\relatorios\\" + nomeRelatorio + ".pdf");
		
		/*
		 * notebook
		 */
		JasperExportManager.exportReportToPdfFile(print,
				"C:\\Users\\César Sousa Júnior\\eclipse-workspace\\hello-jasper\\target\\relatorios" + nomeRelatorio + ".pdf");

	}

}
