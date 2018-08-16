package c.z;

import java.io.IOException;

import org.csource.common.MyException;
import org.csource.common.NameValuePair;
import org.csource.fastdfs.DownloadCallback;
import org.csource.fastdfs.FileInfo;
import org.csource.fastdfs.UploadCallback;

public interface Fastdfs1Service extends FastdfsService{

    /**
       * upload file to storage server (by file name)
       *
       * @param local_filename local filename to upload
       * @param file_ext_name  file ext name, do not include dot(.), null to extract ext name from the local filename
       * @param meta_list      meta info array
       * @return file id(including group name and filename) if success, <br>
       * return null if fail
       */
    String upload_file1(String local_filename, String file_ext_name, NameValuePair[] meta_list)
            throws IOException, MyException;

    /**
       * upload file to storage server (by file name)
       *
       * @param group_name     the group name to upload file to, can be empty
       * @param local_filename local filename to upload
       * @param file_ext_name  file ext name, do not include dot(.), null to extract ext name from the local filename
       * @param meta_list      meta info array
       * @return file id(including group name and filename) if success, <br>
       * return null if fail
       */
    String upload_file1(String group_name, String local_filename, String file_ext_name, NameValuePair[] meta_list)
            throws IOException, MyException;

    /**
       * upload file to storage server (by file buff)
       *
       * @param file_buff     file content/buff
       * @param file_ext_name file ext name, do not include dot(.)
       * @param meta_list     meta info array
       * @return file id(including group name and filename) if success, <br>
       * return null if fail
       */
    String upload_file1(byte[] file_buff, String file_ext_name, NameValuePair[] meta_list)
            throws IOException, MyException;

    /**
       * upload file to storage server (by file buff)
       *
       * @param group_name    the group name to upload file to, can be empty
       * @param file_buff     file content/buff
       * @param file_ext_name file ext name, do not include dot(.)
       * @param meta_list     meta info array
       * @return file id(including group name and filename) if success, <br>
       * return null if fail
       */
    String upload_file1(String group_name, byte[] file_buff, String file_ext_name, NameValuePair[] meta_list)
            throws IOException, MyException;

    /**
       * upload file to storage server (by callback)
       *
       * @param group_name    the group name to upload file to, can be empty
       * @param file_size     the file size
       * @param callback      the write data callback object
       * @param file_ext_name file ext name, do not include dot(.)
       * @param meta_list     meta info array
       * @return file id(including group name and filename) if success, <br>
       * return null if fail
       */
    String upload_file1(String group_name, long file_size, UploadCallback callback, String file_ext_name,
            NameValuePair[] meta_list) throws IOException, MyException;

    /**
       * upload appender file to storage server (by file name)
       *
       * @param local_filename local filename to upload
       * @param file_ext_name  file ext name, do not include dot(.), null to extract ext name from the local filename
       * @param meta_list      meta info array
       * @return file id(including group name and filename) if success, <br>
       * return null if fail
       */
    String upload_appender_file1(String local_filename, String file_ext_name, NameValuePair[] meta_list)
            throws IOException, MyException;

    /**
       * upload appender file to storage server (by file name)
       *
       * @param group_name     the group name to upload file to, can be empty
       * @param local_filename local filename to upload
       * @param file_ext_name  file ext name, do not include dot(.), null to extract ext name from the local filename
       * @param meta_list      meta info array
       * @return file id(including group name and filename) if success, <br>
       * return null if fail
       */
    String upload_appender_file1(String group_name, String local_filename, String file_ext_name,
            NameValuePair[] meta_list) throws IOException, MyException;

    /**
       * upload appender file to storage server (by file buff)
       *
       * @param file_buff     file content/buff
       * @param file_ext_name file ext name, do not include dot(.)
       * @param meta_list     meta info array
       * @return file id(including group name and filename) if success, <br>
       * return null if fail
       */
    String upload_appender_file1(byte[] file_buff, String file_ext_name, NameValuePair[] meta_list)
            throws IOException, MyException;

    /**
       * upload appender file to storage server (by file buff)
       *
       * @param group_name    the group name to upload file to, can be empty
       * @param file_buff     file content/buff
       * @param file_ext_name file ext name, do not include dot(.)
       * @param meta_list     meta info array
       * @return file id(including group name and filename) if success, <br>
       * return null if fail
       */
    String upload_appender_file1(String group_name, byte[] file_buff, String file_ext_name, NameValuePair[] meta_list)
            throws IOException, MyException;

    /**
       * upload appender file to storage server (by callback)
       *
       * @param group_name    the group name to upload file to, can be empty
       * @param file_size     the file size
       * @param callback      the write data callback object
       * @param file_ext_name file ext name, do not include dot(.)
       * @param meta_list     meta info array
       * @return file id(including group name and filename) if success, <br>
       * return null if fail
       */
    String upload_appender_file1(String group_name, long file_size, UploadCallback callback, String file_ext_name,
            NameValuePair[] meta_list) throws IOException, MyException;

    /**
       * upload file to storage server (by file name, slave file mode)
       *
       * @param master_file_id the master file id to generate the slave file
       * @param prefix_name    the prefix name to generate the slave file
       * @param local_filename local filename to upload
       * @param file_ext_name  file ext name, do not include dot(.), null to extract ext name from the local filename
       * @param meta_list      meta info array
       * @return file id(including group name and filename) if success, <br>
       * return null if fail
       */
    String upload_file1(String master_file_id, String prefix_name, String local_filename, String file_ext_name,
            NameValuePair[] meta_list) throws IOException, MyException;

    /**
       * upload file to storage server (by file buff, slave file mode)
       *
       * @param master_file_id the master file id to generate the slave file
       * @param prefix_name    the prefix name to generate the slave file
       * @param file_buff      file content/buff
       * @param file_ext_name  file ext name, do not include dot(.)
       * @param meta_list      meta info array
       * @return file id(including group name and filename) if success, <br>
       * return null if fail
       */
    String upload_file1(String master_file_id, String prefix_name, byte[] file_buff, String file_ext_name,
            NameValuePair[] meta_list) throws IOException, MyException;

    /**
       * upload file to storage server (by file buff, slave file mode)
       *
       * @param master_file_id the master file id to generate the slave file
       * @param prefix_name    the prefix name to generate the slave file
       * @param file_buff      file content/buff
       * @param file_ext_name  file ext name, do not include dot(.)
       * @param meta_list      meta info array
       * @return file id(including group name and filename) if success, <br>
       * return null if fail
       */
    String upload_file1(String master_file_id, String prefix_name, byte[] file_buff, int offset, int length,
            String file_ext_name, NameValuePair[] meta_list) throws IOException, MyException;

    /**
       * upload file to storage server (by callback)
       *
       * @param master_file_id the master file id to generate the slave file
       * @param prefix_name    the prefix name to generate the slave file
       * @param file_size      the file size
       * @param callback       the write data callback object
       * @param file_ext_name  file ext name, do not include dot(.)
       * @param meta_list      meta info array
       * @return file id(including group name and filename) if success, <br>
       * return null if fail
       */
    String upload_file1(String master_file_id, String prefix_name, long file_size, UploadCallback callback,
            String file_ext_name, NameValuePair[] meta_list) throws IOException, MyException;

    /**
       * append file to storage server (by file name)
       *
       * @param appender_file_id the appender file id
       * @param local_filename   local filename to append
       * @return 0 for success, != 0 for error (error no)
       */
    int append_file1(String appender_file_id, String local_filename) throws IOException, MyException;

    /**
       * append file to storage server (by file buff)
       *
       * @param appender_file_id the appender file id
       * @param file_buff        file content/buff
       * @return 0 for success, != 0 for error (error no)
       */
    int append_file1(String appender_file_id, byte[] file_buff) throws IOException, MyException;

    /**
       * append file to storage server (by file buff)
       *
       * @param appender_file_id the appender file id
       * @param file_buff        file content/buffer
       * @param offset           start offset of the buffer
       * @param length           the length of the buffer to append
       * @return 0 for success, != 0 for error (error no)
       */
    int append_file1(String appender_file_id, byte[] file_buff, int offset, int length) throws IOException, MyException;

    /**
       * append file to storage server (by callback)
       *
       * @param appender_file_id the appender file id
       * @param file_size        the file size
       * @param callback         the write data callback object
       * @return 0 for success, != 0 for error (error no)
       */
    int append_file1(String appender_file_id, long file_size, UploadCallback callback) throws IOException, MyException;

    /**
       * modify appender file to storage server (by file name)
       *
       * @param appender_file_id the appender file id
       * @param file_offset      the offset of appender file
       * @param local_filename   local filename to append
       * @return 0 for success, != 0 for error (error no)
       */
    int modify_file1(String appender_file_id, long file_offset, String local_filename) throws IOException, MyException;

    /**
       * modify appender file to storage server (by file buff)
       *
       * @param appender_file_id the appender file id
       * @param file_offset      the offset of appender file
       * @param file_buff        file content/buff
       * @return 0 for success, != 0 for error (error no)
       */
    int modify_file1(String appender_file_id, long file_offset, byte[] file_buff) throws IOException, MyException;

    /**
       * modify appender file to storage server (by file buff)
       *
       * @param appender_file_id the appender file id
       * @param file_offset      the offset of appender file
       * @param file_buff        file content/buff
       * @param buffer_offset    start offset of the buff
       * @param buffer_length    the length of buff to modify
       * @return 0 for success, != 0 for error (error no)
       */
    int modify_file1(String appender_file_id, long file_offset, byte[] file_buff, int buffer_offset, int buffer_length)
            throws IOException, MyException;

    /**
       * modify appender file to storage server (by callback)
       *
       * @param appender_file_id the appender file id
       * @param file_offset      the offset of appender file
       * @param modify_size      the modify size
       * @param callback         the write data callback object
       * @return 0 for success, != 0 for error (error no)
       */
    int modify_file1(String appender_file_id, long file_offset, long modify_size, UploadCallback callback)
            throws IOException, MyException;

    /**
       * delete file from storage server
       *
       * @param file_id the file id(including group name and filename)
       * @return 0 for success, none zero for fail (error code)
       */
    int delete_file1(String file_id) throws IOException, MyException;

    /**
       * truncate appender file to size 0 from storage server
       *
       * @param appender_file_id the appender file id
       * @return 0 for success, none zero for fail (error code)
       */
    int truncate_file1(String appender_file_id) throws IOException, MyException;

    /**
       * truncate appender file from storage server
       *
       * @param appender_file_id    the appender file id
       * @param truncated_file_size truncated file size
       * @return 0 for success, none zero for fail (error code)
       */
    int truncate_file1(String appender_file_id, long truncated_file_size) throws IOException, MyException;

    /**
       * download file from storage server
       *
       * @param file_id the file id(including group name and filename)
       * @return file content/buffer, return null if fail
       */
    byte[] download_file1(String file_id) throws IOException, MyException;

    /**
       * download file from storage server
       *
       * @param file_id        the file id(including group name and filename)
       * @param file_offset    the start offset of the file
       * @param download_bytes download bytes, 0 for remain bytes from offset
       * @return file content/buff, return null if fail
       */
    byte[] download_file1(String file_id, long file_offset, long download_bytes) throws IOException, MyException;

    /**
       * download file from storage server
       *
       * @param file_id        the file id(including group name and filename)
       * @param local_filename the filename on local
       * @return 0 success, return none zero errno if fail
       */
    int download_file1(String file_id, String local_filename) throws IOException, MyException;

    /**
       * download file from storage server
       *
       * @param file_id        the file id(including group name and filename)
       * @param file_offset    the start offset of the file
       * @param download_bytes download bytes, 0 for remain bytes from offset
       * @param local_filename the filename on local
       * @return 0 success, return none zero errno if fail
       */
    int download_file1(String file_id, long file_offset, long download_bytes, String local_filename)
            throws IOException, MyException;

    /**
       * download file from storage server
       *
       * @param file_id  the file id(including group name and filename)
       * @param callback the callback object, will call callback.recv() when data arrive
       * @return 0 success, return none zero errno if fail
       */
    int download_file1(String file_id, DownloadCallback callback) throws IOException, MyException;

    /**
       * download file from storage server
       *
       * @param file_id        the file id(including group name and filename)
       * @param file_offset    the start offset of the file
       * @param download_bytes download bytes, 0 for remain bytes from offset
       * @param callback       the callback object, will call callback.recv() when data arrive
       * @return 0 success, return none zero errno if fail
       */
    int download_file1(String file_id, long file_offset, long download_bytes, DownloadCallback callback)
            throws IOException, MyException;

    /**
       * get all metadata items from storage server
       *
       * @param file_id the file id(including group name and filename)
       * @return meta info array, return null if fail
       */
    NameValuePair[] get_metadata1(String file_id) throws IOException, MyException;

    /**
       * set metadata items to storage server
       *
       * @param file_id   the file id(including group name and filename)
       * @param meta_list meta item array
       * @param op_flag   flag, can be one of following values: <br>
       *                  <ul><li> ProtoCommon.STORAGE_SET_METADATA_FLAG_OVERWRITE: overwrite all old
       *                  metadata items</li></ul>
       *                  <ul><li> ProtoCommon.STORAGE_SET_METADATA_FLAG_MERGE: merge, insert when
       *                  the metadata item not exist, otherwise update it</li></ul>
       * @return 0 for success, !=0 fail (error code)
       */
    int set_metadata1(String file_id, NameValuePair[] meta_list, byte op_flag) throws IOException, MyException;

    /**
       * get file info from storage server
       *
       * @param file_id the file id(including group name and filename)
       * @return FileInfo object for success, return null for fail
       */
    FileInfo query_file_info1(String file_id) throws IOException, MyException;

    /**
       * get file info decoded from filename
       *
       * @param file_id the file id(including group name and filename)
       * @return FileInfo object for success, return null for fail
       */
    FileInfo get_file_info1(String file_id) throws IOException, MyException;

}