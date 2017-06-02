package jeecartographytool.utils;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStream;
import java.util.ArrayList;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.Path;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.ide.IDE;

public class FileUtils {

	public static void loadFileDirs(ArrayList<File> totalFiles, File f,
			String separador, boolean validateExtention) {
		File[] ficheros = f.listFiles();

		for (int x = 0; x < ficheros.length; x++) {

			if (ficheros[x].isDirectory()) {
				String nuevo_separador;
				nuevo_separador = separador + " ";
				loadFileDirs(totalFiles, ficheros[x], nuevo_separador,
						validateExtention);
			} else {

				if (validateExtention) {
					if (getExtension(ficheros[x]).equals("java")) {
						System.out.println(separador + ficheros[x].getName());
						totalFiles.add(ficheros[x]);
					}/*
					 * else if (getExtension(ficheros[x]).equals("mmb")) {
					 * System.out.println(separador + ficheros[x].getName());
					 * totalFiles.add(ficheros[x]); }
					 */
				} else {
					System.out.println(separador + ficheros[x].getName());
					totalFiles.add(ficheros[x]);
				}
			}
		}
	}

	public static String getExtension(File f) {
		String ext = "";
		String s = f.getName();
		int i = s.lastIndexOf('.');

		if (i > 0 && i < s.length() - 1) {
			ext = s.substring(i + 1).toLowerCase();
		}
		return ext;
	}

	public static InputStream replaceWord(InputStream in, String word,
			String replace) {

		java.util.Scanner s = new java.util.Scanner(in).useDelimiter("\\A");
		String oldText = s.hasNext() ? s.next() : "";

		String newtext = oldText.replaceAll(word, replace);

		return new ByteArrayInputStream(newtext.getBytes());

	}

	public static void openFileinWorkSpace(String filePath) {

		final IFile inputFile = ResourcesPlugin.getWorkspace().getRoot()
				.getFileForLocation(Path.fromOSString(filePath));
		if (inputFile != null) {
			IWorkbenchPage page = PlatformUI.getWorkbench()
					.getActiveWorkbenchWindow().getActivePage();
			try {
				IEditorPart openEditor = IDE.openEditor(page, inputFile);
			} catch (PartInitException e) {
				MessageDialog.openError(
						null,
						"Jee Cartography Tool",
						"An error ocurred during the operation. "
								+ e.getMessage());
				e.printStackTrace();
			}
		}
	}

	public static void prepareFolder(IFolder folder) throws Exception {
		IContainer parent = folder.getParent();
		if (parent instanceof IFolder) {
			prepareFolder((IFolder) parent);
		}
		if (!folder.exists()) {
			folder.create(false, true, null);
		}
	}

}
