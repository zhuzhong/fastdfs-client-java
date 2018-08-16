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
        return sclient().upload_file(file_buff, offset, length, file_ext_name, meta_list);
    }

    @Override
    public String[] upload_file(String group_name, byte[] file_buff, int offset, int length, String file_ext_name,
            NameValuePair[] meta_list) throws IOException, MyException {
        // TODO Auto-generated method stub
        return sclient().upload_file(group_name, file_buff, file_ext_name, meta_list)
        		;
    }

    @Override
    public String[] upload_file(byte[] file_buff, String file_ext_name, NameValuePair[] meta_list)
            throws IOException, MyException {
        // TODO Auto-generated method stub
        return sclient().upload_file(file_buff, file_ext_name, meta_list);
    }

    @Override
    public String[] upload_file(String group_name, byte[] file_buff, String file_ext_name, NameValuePair[] meta_list)
            throws IOException, MyException {
        // TODO Auto-generated method stub
        return sclient().upload_file(group_name, file_buff, file_ext_name, meta_list);
    }

    @Override
    public String[] upload_file(String group_name, long file_size, UploadCallback callback, String file_ext_name,
            NameValuePair[] meta_list) throws IOException, MyException {
        // TODO Auto-generated method stub
        return sclient().upload_file(group_name, file_size, callback, file_ext_name, meta_list);
    }

    @Override
    public String[] upload_file(String group_name, String master_filename, String prefix_name, String local_filename,
            String file_ext_name, NameValuePair[] meta_list) throws IOException, MyException {
        // TODO Auto-generated method stub
        return sclient().upload_file(group_name, master_filename, prefix_name, local_filename, file_ext_name, meta_list);
    }

    @Override
    public String[] upload_file(String group_name, String master_filename, String prefix_name, byte[] file_buff,
            String file_ext_name, NameValuePair[] meta_list) throws IOException, MyException {
        // TODO Auto-generated method stub
        return sclient().upload_file(group_name, master_filename, prefix_name, file_buff, file_ext_name, meta_list);
    }

    @Override
    public String[] upload_file(String group_name, String master_filename, String prefix_name, byte[] file_buff,
            int offset, int length, String file_ext_name, NameValuePair[] meta_list) throws IOException, MyException {
        // TODO Auto-generated method stub
        return sclient().upload_file(group_name, master_filename, prefix_name, file_buff,offset,length, file_ext_name, meta_list);
    }

    @Override
    public String[] upload_file(String group_name, String master_filename, String prefix_name, long file_size,
            UploadCallback callback, String file_ext_name, NameValuePair[] meta_list) throws IOException, MyException {
        // TODO Auto-generated method stub
        return sclient().upload_file(group_name, master_filename, prefix_name,file_size,callback,file_ext_name,meta_list);
    }

    @Override
    public String[] upload_appender_file(String local_filename, String file_ext_name, NameValuePair[] meta_list)
            throws IOException, MyException {
        // TODO Auto-generated method stub
        return sclient().upload_appender_file(local_filename, file_ext_name, meta_list);
    }

    @Override
    public String[] upload_appender_file(byte[] file_buff, int offset, int length, String file_ext_name,
            NameValuePair[] meta_list) throws IOException, MyException {
        // TODO Auto-generated method stub
        return sclient().upload_appender_file(file_buff, offset,length,file_ext_name,meta_list);
    }

    @Override
    public String[] upload_appender_file(String group_name, byte[] file_buff, int offset, int length,
            String file_ext_name, NameValuePair[] meta_list) throws IOException, MyException {
        // TODO Auto-generated method stub
        return sclient().upload_appender_file(group_name,file_buff,offset,length, file_ext_name, meta_list);
    }

    @Override
    public String[] upload_appender_file(byte[] file_buff, String file_ext_name, NameValuePair[] meta_list)
            throws IOException, MyException {
        // TODO Auto-generated method stub
        return sclient().upload_appender_file(file_buff, file_ext_name,  meta_list);
    }

    @Override
    public String[] upload_appender_file(String group_name, byte[] file_buff, String file_ext_name,
            NameValuePair[] meta_list) throws IOException, MyException {
        // TODO Auto-generated method stub
        return sclient().upload_appender_file(group_name, file_buff, file_ext_name, meta_list);
    }

    @Override
    public String[] upload_appender_file(String group_name, long file_size, UploadCallback callback,
            String file_ext_name, NameValuePair[] meta_list) throws IOException, MyException {
        // TODO Auto-generated method stub
        return sclient().upload_appender_file(group_name, file_size, callback, file_ext_name, meta_list);
    }

    @Override
    public int append_file(String group_name, String appender_filename, String local_filename)
            throws IOException, MyException {
        // TODO Auto-generated method stub
        return sclient().append_file(group_name, appender_filename, local_filename);
    }

    @Override
    public int append_file(String group_name, String appender_filename, byte[] file_buff)
            throws IOException, MyException {
        // TODO Auto-generated method stub
        return sclient().append_file(group_name, appender_filename, file_buff);
    }

    @Override
    public int append_file(String group_name, String appender_filename, byte[] file_buff, int offset, int length)
            throws IOException, MyException {
        // TODO Auto-generated method stub
        return sclient().append_file(group_name, appender_filename, file_buff,offset,length);
    }

    @Override
    public int append_file(String group_name, String appender_filename, long file_size, UploadCallback callback)
            throws IOException, MyException {
        // TODO Auto-generated method stub
        return sclient().append_file(group_name, appender_filename, file_size,callback);
    }

    @Override
    public int modify_file(String group_name, String appender_filename, long file_offset, String local_filename)
            throws IOException, MyException {
        // TODO Auto-generated method stub
        return sclient().modify_file(group_name, appender_filename, file_offset, local_filename);
    }

    @Override
    public int modify_file(String group_name, String appender_filename, long file_offset, byte[] file_buff)
            throws IOException, MyException {
        // TODO Auto-generated method stub
        return sclient().modify_file(group_name, appender_filename, file_offset, file_buff);
    }

    @Override
    public int modify_file(String group_name, String appender_filename, long file_offset, byte[] file_buff,
            int buffer_offset, int buffer_length) throws IOException, MyException {
        // TODO Auto-generated method stub
        return sclient().modify_file(group_name, appender_filename, file_offset, file_buff, buffer_offset,buffer_length);
    }

    @Override
    public int modify_file(String group_name, String appender_filename, long file_offset, long modify_size,
            UploadCallback callback) throws IOException, MyException {
        // TODO Auto-generated method stub
        return sclient().modify_file(group_name, appender_filename, file_offset, modify_size,callback);
    }

    @Override
    public int delete_file(String group_name, String remote_filename) throws IOException, MyException {
        // TODO Auto-generated method stub
        return sclient().delete_file(group_name, remote_filename);
    }

    @Override
    public int truncate_file(String group_name, String appender_filename) throws IOException, MyException {
        // TODO Auto-generated method stub
        return sclient().truncate_file(group_name, appender_filename);
    }

    @Override
    public int truncate_file(String group_name, String appender_filename, long truncated_file_size)
            throws IOException, MyException {
        // TODO Auto-generated method stub
        return sclient().truncate_file(group_name, appender_filename,truncated_file_size);
    }

    @Override
    public byte[] download_file(String group_name, String remote_filename) throws IOException, MyException {
        // TODO Auto-generated method stub
        return sclient().download_file(group_name, remote_filename);
    }

    @Override
    public byte[] download_file(String group_name, String remote_filename, long file_offset, long download_bytes)
            throws IOException, MyException {
        // TODO Auto-generated method stub
        return sclient().download_file(group_name, remote_filename, file_offset, download_bytes);
    }

    @Override
    public int download_file(String group_name, String remote_filename, String local_filename)
            throws IOException, MyException {
        // TODO Auto-generated method stub
        return sclient().download_file(group_name, remote_filename, local_filename);
    }

    @Override
    public int download_file(String group_name, String remote_filename, long file_offset, long download_bytes,
            String local_filename) throws IOException, MyException {
        // TODO Auto-generated method stub
        return	sclient().download_file(group_name, remote_filename, file_offset,download_bytes,local_filename);
    }

    @Override
    public int download_file(String group_name, String remote_filename, DownloadCallback callback)
            throws IOException, MyException {
        // TODO Auto-generated method stub
        return sclient().download_file(group_name, remote_filename, callback);
    }

    @Override
    public int download_file(String group_name, String remote_filename, long file_offset, long download_bytes,
            DownloadCallback callback) throws IOException, MyException {
        // TODO Auto-generated method stub
        return sclient().download_file(group_name, remote_filename, file_offset,download_bytes,callback);
    }

    @Override
    public NameValuePair[] get_metadata(String group_name, String remote_filename) throws IOException, MyException {
        // TODO Auto-generated method stub
        return sclient().get_metadata(group_name, remote_filename);
    }

    @Override
    public int set_metadata(String group_name, String remote_filename, NameValuePair[] meta_list, byte op_flag)
            throws IOException, MyException {
        // TODO Auto-generated method stub
        return sclient().set_metadata(group_name, remote_filename, meta_list, op_flag);
    }

    @Override
    public FileInfo get_file_info(String group_name, String remote_filename) throws IOException, MyException {
        // TODO Auto-generated method stub
        return sclient().get_file_info(group_name, remote_filename);
    }

    @Override
    public FileInfo query_file_info(String group_name, String remote_filename) throws IOException, MyException {
        // TODO Auto-generated method stub
        return sclient().query_file_info(group_name, remote_filename);
    }

}
