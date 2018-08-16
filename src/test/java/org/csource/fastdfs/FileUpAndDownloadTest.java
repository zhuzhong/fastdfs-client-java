/**
 * 
 */
package org.csource.fastdfs;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.csource.common.MyException;
import org.csource.common.NameValuePair;

/**
 * @author zhuzhong
 *
 */
public class FileUpAndDownloadTest {

    private static TrackerClient trackerClient;

    /**
     * @param args
     * @throws MyException
     * @throws IOException
     */
    public static void main(String[] args) throws IOException, MyException {
        /* 使用spring 封装就是这样 */
        Properties props = new Properties();
        ClientGlobal.initByProperties(props);

        trackerClient = new TrackerClient();

    }

    public void download() throws IOException, MyException {
        String groupname = null;
        String filename = null;
        TrackerServer trackerServer = trackerClient.getConnection();

        StorageClient storageClient = new StorageClient(trackerServer, trackerClient);
        String fileAbsolutePath = null;
        FileOutputStream fos = new FileOutputStream(fileAbsolutePath);
        storageClient.download_file(groupname, filename, new DownloadStream(fos));

    }

    public void upload() throws IOException, MyException {
        TrackerServer trackerServer = trackerClient.getConnection();

        StorageClient storageClient = new StorageClient(trackerServer, trackerClient);
        byte[] file_buff = null;
        String file_ext_name = null;
        NameValuePair[] meta_list = null;

        String[] rs = storageClient.upload_file(file_buff, file_ext_name, meta_list);
        if (rs != null) {
            String groupname = rs[0];
            String filename = rs[1];
        }

    }

}
