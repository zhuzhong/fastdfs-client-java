/**
 * 
 */
package c.z;

import java.io.IOException;

import org.csource.common.MyException;
import org.csource.common.NameValuePair;
import org.csource.fastdfs.DownloadCallback;
import org.csource.fastdfs.FileInfo;
import org.csource.fastdfs.StorageClient1;
import org.csource.fastdfs.TrackerServer;
import org.csource.fastdfs.UploadCallback;

/**
 * @author zhuzhong
 *
 */
public class DefaultFastdfs1ServiceImpl extends DefaultFastdfsServiceImpl implements Fastdfs1Service {

    public DefaultFastdfs1ServiceImpl() {
    }

    @Override
    protected StorageClient1 sclient() throws IOException {
        TrackerServer trackerServer = tracker.getConnection();
        StorageClient1 storageClient = new StorageClient1(trackerServer, tracker);
        return storageClient;
    }

    @Override
    public String upload_file1(String local_filename, String file_ext_name, NameValuePair[] meta_list)
            throws IOException, MyException {
        return sclient().upload_file1(local_filename, file_ext_name, meta_list);
    }

    @Override
    public String upload_file1(String group_name, String local_filename, String file_ext_name,
            NameValuePair[] meta_list) throws IOException, MyException {
        // TODO Auto-generated method stub
        return sclient().upload_file1(group_name, local_filename, file_ext_name, meta_list);
    }

    @Override
    public String upload_file1(byte[] file_buff, String file_ext_name, NameValuePair[] meta_list)
            throws IOException, MyException {
        // TODO Auto-generated method stub
        return sclient().upload_file1(file_buff, file_ext_name, meta_list);
    }

    @Override
    public String upload_file1(String group_name, byte[] file_buff, String file_ext_name, NameValuePair[] meta_list)
            throws IOException, MyException {
        return sclient().upload_file1(group_name, file_buff, file_ext_name, meta_list);
    }

    @Override
    public String upload_file1(String group_name, long file_size, UploadCallback callback, String file_ext_name,
            NameValuePair[] meta_list) throws IOException, MyException {
        // TODO Auto-generated method stub
        return sclient().upload_file1(group_name, file_size, callback, file_ext_name, meta_list);
    }

    @Override
    public String upload_appender_file1(String local_filename, String file_ext_name, NameValuePair[] meta_list)
            throws IOException, MyException {
        // TODO Auto-generated method stub
        return sclient().upload_appender_file1(local_filename, file_ext_name, meta_list);
    }

    @Override
    public String upload_appender_file1(String group_name, String local_filename, String file_ext_name,
            NameValuePair[] meta_list) throws IOException, MyException {
        // TODO Auto-generated method stub
        return sclient().upload_appender_file1(group_name, local_filename, file_ext_name, meta_list);
    }

    @Override
    public String upload_appender_file1(byte[] file_buff, String file_ext_name, NameValuePair[] meta_list)
            throws IOException, MyException {
        // TODO Auto-generated method stub
        return sclient().upload_appender_file1(file_buff, file_ext_name, meta_list);
    }

    @Override
    public String upload_appender_file1(String group_name, byte[] file_buff, String file_ext_name,
            NameValuePair[] meta_list) throws IOException, MyException {
        // TODO Auto-generated method stub
        return sclient().upload_appender_file1(group_name, file_buff, file_ext_name, meta_list);
    }

    @Override
    public String upload_appender_file1(String group_name, long file_size, UploadCallback callback,
            String file_ext_name, NameValuePair[] meta_list) throws IOException, MyException {
        // TODO Auto-generated method stub
        return sclient().upload_appender_file1(group_name, file_size, callback, file_ext_name, meta_list);
    }

    @Override
    public String upload_file1(String master_file_id, String prefix_name, String local_filename, String file_ext_name,
            NameValuePair[] meta_list) throws IOException, MyException {
        // TODO Auto-generated method stub
        return sclient().upload_file1(master_file_id, prefix_name, local_filename, file_ext_name, meta_list);
    }

    @Override
    public String upload_file1(String master_file_id, String prefix_name, byte[] file_buff, String file_ext_name,
            NameValuePair[] meta_list) throws IOException, MyException {
        // TODO Auto-generated method stub
        return sclient().upload_file1(master_file_id, prefix_name, file_buff, file_ext_name, meta_list);
    }

    @Override
    public String upload_file1(String master_file_id, String prefix_name, byte[] file_buff, int offset, int length,
            String file_ext_name, NameValuePair[] meta_list) throws IOException, MyException {
        // TODO Auto-generated method stub
        return sclient().upload_file1(master_file_id, prefix_name, file_buff, offset, length, file_ext_name,
                meta_list);
    }

    @Override
    public String upload_file1(String master_file_id, String prefix_name, long file_size, UploadCallback callback,
            String file_ext_name, NameValuePair[] meta_list) throws IOException, MyException {
        // TODO Auto-generated method stub
        return sclient().upload_file1(master_file_id, prefix_name, file_size, callback, file_ext_name,
                meta_list);
    }

    @Override
    public int append_file1(String appender_file_id, String local_filename) throws IOException, MyException {
        // TODO Auto-generated method stub
        return sclient().append_file1(appender_file_id, local_filename);
    }

    @Override
    public int append_file1(String appender_file_id, byte[] file_buff) throws IOException, MyException {
        // TODO Auto-generated method stub
        return sclient().append_file1(appender_file_id, file_buff);
    }

    @Override
    public int append_file1(String appender_file_id, byte[] file_buff, int offset, int length)
            throws IOException, MyException {
        // TODO Auto-generated method stub
        return sclient().append_file1(appender_file_id, file_buff, offset, length);
    }

    @Override
    public int append_file1(String appender_file_id, long file_size, UploadCallback callback)
            throws IOException, MyException {
        // TODO Auto-generated method stub
        return sclient().append_file1(appender_file_id, file_size, callback);
    }

    @Override
    public int modify_file1(String appender_file_id, long file_offset, String local_filename)
            throws IOException, MyException {
        // TODO Auto-generated method stub
        return sclient().modify_file1(appender_file_id, file_offset, local_filename);
    }

    @Override
    public int modify_file1(String appender_file_id, long file_offset, byte[] file_buff)
            throws IOException, MyException {
        // TODO Auto-generated method stub
        return sclient().modify_file1(appender_file_id, file_offset, file_buff);
    }

    @Override
    public int modify_file1(String appender_file_id, long file_offset, byte[] file_buff, int buffer_offset,
            int buffer_length) throws IOException, MyException {
        // TODO Auto-generated method stub
        return sclient().modify_file1(appender_file_id, file_offset, file_buff, buffer_offset, buffer_length);
    }

    @Override
    public int modify_file1(String appender_file_id, long file_offset, long modify_size, UploadCallback callback)
            throws IOException, MyException {
        // TODO Auto-generated method stub
        return sclient().modify_file1(appender_file_id, file_offset, modify_size, callback);
    }

    @Override
    public int delete_file1(String file_id) throws IOException, MyException {
        // TODO Auto-generated method stub
        return sclient().delete_file1(file_id);
    }

    @Override
    public int truncate_file1(String appender_file_id) throws IOException, MyException {
        // TODO Auto-generated method stub
        return sclient().truncate_file1(appender_file_id);
    }

    @Override
    public int truncate_file1(String appender_file_id, long truncated_file_size) throws IOException, MyException {
        // TODO Auto-generated method stub
        return sclient().truncate_file1(appender_file_id, truncated_file_size);
    }

    @Override
    public byte[] download_file1(String file_id) throws IOException, MyException {
        // TODO Auto-generated method stub
        return sclient().download_file1(file_id);
    }

    @Override
    public byte[] download_file1(String file_id, long file_offset, long download_bytes)
            throws IOException, MyException {
        // TODO Auto-generated method stub
        return sclient().download_file1(file_id, file_offset, download_bytes);
    }

    @Override
    public int download_file1(String file_id, String local_filename) throws IOException, MyException {
        // TODO Auto-generated method stub
        return sclient().download_file1(file_id, local_filename);
    }

    @Override
    public int download_file1(String file_id, long file_offset, long download_bytes, String local_filename)
            throws IOException, MyException {
        // TODO Auto-generated method stub
        return sclient().download_file1(file_id, file_offset, download_bytes, local_filename);
    }

    @Override
    public int download_file1(String file_id, DownloadCallback callback) throws IOException, MyException {
        // TODO Auto-generated method stub
        return sclient().download_file1(file_id, callback);
    }

    @Override
    public int download_file1(String file_id, long file_offset, long download_bytes, DownloadCallback callback)
            throws IOException, MyException {
        // TODO Auto-generated method stub
        return sclient().download_file1(file_id, file_offset, download_bytes, callback);
    }

    @Override
    public NameValuePair[] get_metadata1(String file_id) throws IOException, MyException {
        // TODO Auto-generated method stub
        return sclient().get_metadata1(file_id);
    }

    @Override
    public int set_metadata1(String file_id, NameValuePair[] meta_list, byte op_flag) throws IOException, MyException {
        // TODO Auto-generated method stub
        return sclient().set_metadata1(file_id, meta_list, op_flag);
    }

    @Override
    public FileInfo query_file_info1(String file_id) throws IOException, MyException {
        // TODO Auto-generated method stub
        return sclient().query_file_info1(file_id);
    }

    @Override
    public FileInfo get_file_info1(String file_id) throws IOException, MyException {
        // TODO Auto-generated method stub
        return sclient().get_file_info1(file_id);
    }

}
