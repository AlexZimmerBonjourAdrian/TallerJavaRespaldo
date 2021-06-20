package com.ecodeup.bean;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Calendar;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.servlet.http.Part;

public class UploadHelper {
	
	private final int limit_max_size = 10240000;
	private final String limit_type_file = "gif|jpg|png|jpeg";
	private final String path_to = "resources" + File.separator + "images";

}
