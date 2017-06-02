package com.asesoftware.pilotoconciso.bbeans.util;

/**
 * Clase utilitaria para verificar el Mime Type de acuerdo al nombre de un archivo
 *
 * @author cadmilo at <cadmilo@gmail.com>
 */
public class FileUtils {
    
    /**
     * Obtiene el tipo MIME dado su extensión de archivo.
     * @param String name Extensión del archivo.
     * @return String mime
     */
    public static String getMimeType(String name) {
        String mime = null;
        int extDot = name.lastIndexOf('.');
        if (extDot > 0) {
            String extension = name.substring(extDot + 1).toLowerCase();
            if ("bmp".equals(extension)) {
                mime = "image/bmp";
            } else if ("jpg".equals(extension)) {
                mime = "image/jpeg";
            } else if ("jpeg".equals(extension)) {
                mime = "image/jpeg";
            } else if ("gif".equals(extension)) {
                mime = "image/gif";
            } else if ("png".equals(extension)) {
                mime = "image/png";
            } else if ("pdf".equals(extension)) {
                mime = "application/pdf";
            } else if ("doc".equals(extension)) {
                mime = "application/msword";
            } else if ("xdoc".equals(extension)) {
                mime = "application/msword";
            }  else {
                mime = "image/jpg";
            }
        }
        return mime;
    }
    
}
