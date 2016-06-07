package com.vinay.jersey.util;

import java.io.File;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.ResponseBuilder;

@Path("/downloadFile")
public class DownloadFileService {

	String path = "D:\\Apple.txt"; // Place the file at location if not exists :-)

	@GET
	@Path("/asText")
	@Produces("text/plain")
	// @Produces("image/png")
	// @Produces("application/pdf")
	public Response getDataFile() {

		File file = new File(path);
		ResponseBuilder rb = Response.ok((Object) file);
		rb.header("Content-Disposition", "attachment; filename=AppleFile.txt");
		return rb.build();
	}

	@GET
	@Path("/asImage")
	// @Produces("text/plain")
	@Produces("image/png")
	// @Produces("application/pdf")
	public Response getImageFile() {

		File file = new File(path);
		ResponseBuilder rb = Response.ok((Object) file);
		rb.header("Content-Disposition", "attachment; filename=AppleFile.png");
		return rb.build();
	}

	@GET
	@Path("/asPdf")
	// @Produces("text/plain")
	// @Produces("image/png")
	@Produces("application/pdf")
	public Response getPdfFile() {

		File file = new File(path);
		ResponseBuilder rb = Response.ok((Object) file);
		rb.header("Content-Disposition", "attachment; filename=AppleFile.pdf");
		return rb.build();
	}
}
