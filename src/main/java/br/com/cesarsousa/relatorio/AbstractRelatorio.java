package br.com.cesarsousa.relatorio;

import java.util.HashMap;
import java.util.List;

import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;

public abstract class AbstractRelatorio {

	private String path;
	private String pathToReportPackage;

	public void gerarRelatorio(String nomeRelatorio, HashMap paramRelatorio, List listaRelatorio) throws Exception {

		this.path = this.getClass().getClassLoader().getResource("").getPath();
		this.pathToReportPackage = this.path + "br/com/cesarsousa/jasper/";

		JRBeanCollectionDataSource rel = new JRBeanCollectionDataSource(listaRelatorio);

		JasperPrint print = JasperFillManager.fillReport(this.pathToReportPackage + nomeRelatorio + ".jasper", paramRelatorio, rel);

		JasperExportManager.exportReportToPdfFile(print,
				"C:\\Users\\cesar\\eclipse-oxygen-workspace\\hello-jasper\\target\\relatorios\\" + nomeRelatorio + ".pdf");

	}

}
