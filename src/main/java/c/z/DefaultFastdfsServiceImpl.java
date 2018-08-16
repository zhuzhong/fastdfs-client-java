/**
 * 
 */
package c.z;

import java.io.IOException;
import java.util.Properties;

import org.csource.common.MyException;
import org.csource.common.NameValuePair;
import org.csource.fastdfs.ClientGlobal;
import org.csource.fastdfs.DownloadCallback;
import org.csource.fastdfs.FileInfo;
import org.csource.fastdfs.StorageClient;
import org.csource.fastdfs.TrackerClient;
import org.csource.fastdfs.TrackerServer;
import org.csource.fastdfs.UploadCallback;

/**
 * @author zhuzhong
 *
 */
public class DefaultFastdfsServiceImpl implements FastdfsService {

    public DefaultFastdfsServiceImpl() {
    }

    private Properties props;

    public void setProps(Properties props) {
        this.props = props;
    }

    protected TrackerClient tracker;

    public void init() throws IOException, MyException {
        ClientGlobal.initByProperties(props);
        tracker = new TrackerClient();
    }

    protected StorageClient sclient() throws IOException {
        TrackerServer trackerServer = tracker.getConnection();
        StorageClient storageClient = new StorageClient(trackerServer, tracker);
        return storageClient;
    }

    @Override
    public byte getErrorCode() {
        // TODO Auto-generated method stub
        try {
            return sclient().getErrorCode();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
           
        }
        return 0;
    }

    @Override
    public String[] upload_file(String local_filename, String file_ext_name, NameValuePair[] meta_list)
            throws IOException, MyException {
        // TODO Auto-generated method stub
        return sclient().upload_file(local_filename, file_ext_name, meta_list);
    }

    @Override
    public String[] upload_file(byte[] file_buff, int offset, int length, String file_ext_name,
            NameValuePair[] meta_list) throws IOException, MyException {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public String[] upload_file(String group_name, byte[] file_buff, int offset, int length, String file_ext_name,
            NameValuePair[] meta_list) throws IOException, MyException {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public String[] upload_file(byte[] file_buff, String file_ext_name, NameValuePair[] meta_list)
            throws IOException, MyException {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public String[] upload_file(String group_name, byte[] file_buff, String file_ext_name, NameValuePair[] meta_list)
            throws IOException, MyException {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public String[] upload_file(String group_name, long file_size, UploadCallback callback, String file_ext_name,
            NameValuePair[] meta_list) throws IOException, MyException {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public String[] upload_file(String group_name, String master_filename, String prefix_name, String local_filename,
            String file_ext_name, NameValuePair[] meta_list) throws IOException, MyException {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public String[] upload_file(String group_name, String master_filename, String prefix_name, byte[] file_buff,
            String file_ext_name, NameValuePair[] meta_list) throws IOException, MyException {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public String[] upload_file(String group_name, String master_filename, String prefix_name, byte[] file_buff,
            int offset, int length, String file_ext_name, NameValuePair[] meta_list) throws IOException, MyException {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public String[] upload_file(String group_name, String master_filename, String prefix_name, long file_size,
            UploadCallback callback, String file_ext_name, NameValuePair[] meta_list) throws IOException, MyException {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public String[] upload_appender_file(String local_filename, String file_ext_name, NameValuePair[] meta_list)
            throws IOException, MyException {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public String[] upload_appender_file(byte[] file_buff, int offset, int length, String file_ext_name,
            NameValuePair[] meta_list) throws IOException, MyException {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public String[] upload_appender_file(String group_name, byte[] file_buff, int offset, int length,
            String file_ext_name, NameValuePair[] meta_list) throws IOException, MyException {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public String[] upload_appender_file(byte[] file_buff, String file_ext_name, NameValuePair[] meta_list)
            throws IOException, MyException {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public String[] upload_appender_file(String group_name, byte[] file_buff, String file_ext_name,
            NameValuePair[] meta_list) throws IOException, MyException {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public String[] upload_appender_file(String group_name, long file_size, UploadCallback callback,
            String file_ext_name, NameValuePair[] meta_list) throws IOException, MyException {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public int append_file(String group_name, String appender_filename, String local_filename)
            throws IOException, MyException {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public int append_file(String group_name, String appender_filename, byte[] file_buff)
            throws IOException, MyException {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public int append_file(String group_name, String appender_filename, byte[] file_buff, int offset, int length)
            throws IOException, MyException {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public int append_file(String group_name, String appender_filename, long file_size, UploadCallback callback)
            throws IOException, MyException {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public int modify_file(String group_name, String appender_filename, long file_offset, String local_filename)
            throws IOException, MyException {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public int modify_file(String group_name, String appender_filename, long file_offset, byte[] file_buff)
            throws IOException, MyException {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public int modify_file(String group_name, String appender_filename, long file_offset, byte[] file_buff,
            int buffer_offset, int buffer_length) throws IOException, MyException {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public int modify_file(String group_name, String appender_filename, long file_offset, long modify_size,
            UploadCallback callback) throws IOException, MyException {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public int delete_file(String group_name, String remote_filename) throws IOException, MyException {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public int truncate_file(String group_name, String appender_filename) throws IOException, MyException {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public int truncate_file(String group_name, String appender_filename, long truncated_file_size)
            throws IOException, MyException {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public byte[] download_file(String group_name, String remote_filename) throws IOException, MyException {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public byte[] download_file(String group_name, String remote_filename, long file_offset, long download_bytes)
            throws IOException, MyException {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public int download_file(String group_name, String remote_filename, String local_filename)
            throws IOException, MyException {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public int download_file(String group_name, String remote_filename, long file_offset, long download_bytes,
            String local_filename) throws IOException, MyException {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public int download_file(String group_name, String remote_filename, DownloadCallback callback)
            throws IOException, MyException {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public int download_file(String group_name, String remote_filename, long file_offset, long download_bytes,
            DownloadCallback callback) throws IOException, MyException {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public NameValuePair[] get_metadata(String group_name, String remote_filename) throws IOException, MyException {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public int set_metadata(String group_name, String remote_filename, NameValuePair[] meta_list, byte op_flag)
            throws IOException, MyException {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public FileInfo get_file_info(String group_name, String remote_filename) throws IOException, MyException {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public FileInfo query_file_info(String group_name, String remote_filename) throws IOException, MyException {
        // TODO Auto-generated method stub
        return null;
    }

}
