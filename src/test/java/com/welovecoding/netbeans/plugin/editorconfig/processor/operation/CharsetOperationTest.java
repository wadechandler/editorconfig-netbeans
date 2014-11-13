package com.welovecoding.netbeans.plugin.editorconfig.processor.operation;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import org.junit.Ignore;
import org.junit.Test;
import org.netbeans.junit.NbTestCase;
import org.openide.filesystems.FileObject;
import org.openide.filesystems.FileUtil;

public class CharsetOperationTest extends NbTestCase {

  public CharsetOperationTest() {
    super("CharsetOperationTest");
  }

  @Test
  @Ignore
  public void testSetup() throws FileNotFoundException, IOException, URISyntaxException {
    String path = "files/charsets/utf-8-bom.txt";
    URL url = Thread.currentThread().getContextClassLoader().getResource(path);
    Path testFilePath = Paths.get(url.toURI());
    FileObject fo = FileUtil.toFileObject(testFilePath.toFile());
    assertEquals(fo.getName(), "utf-8-bom");
  }

}