package c.z;

import java.io.IOException;

import org.csource.common.MyException;
import org.csource.common.NameValuePair;
import org.csource.fastdfs.DownloadCallback;
import org.csource.fastdfs.FileInfo;
import org.csource.fastdfs.UploadCallback;

public interface FastdfsService {

    /**
     * get the error code of last call
     *
     * @return the error code of last call
     */
    byte getErrorCode();

    /**
     * upload file to storage server (by file name)
     *
     * @param local_filename
     *            local filename to upload
     * @param file_ext_name
     *            file ext name, do not include dot(.), null to extract ext name
     *            from the local filename
     * @param meta_list
     *            meta info array
     * @return 2 elements string array if success:<br>
     *         <ul>
     *         <li>results[0]: the group name to store the file</li>
     *         </ul>
     *         <ul>
     *         <li>results[1]: the new created filename</li>
     *         </ul>
     *         return null if fail
     */
    String[] upload_file(String local_filename, String file_ext_name, NameValuePair[] meta_list)
            throws IOException, MyException;

    /**
     * upload file to storage server (by file buff)
     *
     * @param file_buff
     *            file content/buff
     * @param offset
     *            start offset of the buff
     * @param length
     *            the length of buff to upload
     * @param file_ext_name
     *            file ext name, do not include dot(.)
     * @param meta_list
     *            meta info array
     * @return 2 elements string array if success:<br>
     *         <ul>
     *         <li>results[0]: the group name to store the file</li>
     *         </ul>
     *         <ul>
     *         <li>results[1]: the new created filename</li>
     *         </ul>
     *         return null if fail
     */
    String[] upload_file(byte[] file_buff, int offset, int length, String file_ext_name, NameValuePair[] meta_list)
            throws IOException, MyException;

    /**
     * upload file to storage server (by file buff)
     *
     * @param group_name
     *            the group name to upload file to, can be empty
     * @param file_buff
     *            file content/buff
     * @param offset
     *            start offset of the buff
     * @param length
     *            the length of buff to upload
     * @param file_ext_name
     *            file ext name, do not include dot(.)
     * @param meta_list
     *            meta info array
     * @return 2 elements string array if success:<br>
     *         <ul>
     *         <li>results[0]: the group name to store the file</li>
     *         </ul>
     *         <ul>
     *         <li>results[1]: the new created filename</li>
     *         </ul>
     *         return null if fail
     */
    String[] upload_file(String group_name, byte[] file_buff, int offset, int length, String file_ext_name,
            NameValuePair[] meta_list) throws IOException, MyException;

    /**
     * upload file to storage server (by file buff)
     *
     * @param file_buff
     *            file content/buff
     * @param file_ext_name
     *            file ext name, do not include dot(.)
     * @param meta_list
     *            meta info array
     * @return 2 elements string array if success:<br>
     *         <ul>
     *         <li>results[0]: the group name to store the file</li>
     *         </ul>
     *         <ul>
     *         <li>results[1]: the new created filename</li>
     *         </ul>
     *         return null if fail
     */
    String[] upload_file(byte[] file_buff, String file_ext_name, NameValuePair[] meta_list)
            throws IOException, MyException;

    /**
     * upload file to storage server (by file buff)
     *
     * @param group_name
     *            the group name to upload file to, can be empty
     * @param file_buff
     *            file content/buff
     * @param file_ext_name
     *            file ext name, do not include dot(.)
     * @param meta_list
     *            meta info array
     * @return 2 elements string array if success:<br>
     *         <ul>
     *         <li>results[0]: the group name to store the file</li>
     *         </ul>
     *         <ul>
     *         <li>results[1]: the new created filename</li>
     *         </ul>
     *         return null if fail
     */
    String[] upload_file(String group_name, byte[] file_buff, String file_ext_name, NameValuePair[] meta_list)
            throws IOException, MyException;

    /**
     * upload file to storage server (by callback)
     *
     * @param group_name
     *            the group name to upload file to, can be empty
     * @param file_size
     *            the file size
     * @param callback
     *            the write data callback object
     * @param file_ext_name
     *            file ext name, do not include dot(.)
     * @param meta_list
     *            meta info array
     * @return 2 elements string array if success:<br>
     *         <ul>
     *         <li>results[0]: the group name to store the file</li>
     *         </ul>
     *         <ul>
     *         <li>results[1]: the new created filename</li>
     *         </ul>
     *         return null if fail
     */
    String[] upload_file(String group_name, long file_size, UploadCallback callback, String file_ext_name,
            NameValuePair[] meta_list) throws IOException, MyException;

    /**
     * upload file to storage server (by file name, slave file mode)
     *
     * @param group_name
     *            the group name of master file
     * @param master_filename
     *            the master file name to generate the slave file
     * @param prefix_name
     *            the prefix name to generate the slave file
     * @param local_filename
     *            local filename to upload
     * @param file_ext_name
     *            file ext name, do not include dot(.), null to extract ext name
     *            from the local filename
     * @param meta_list
     *            meta info array
     * @return 2 elements string array if success:<br>
     *         <ul>
     *         <li>results[0]: the group name to store the file</li>
     *         </ul>
     *         <ul>
     *         <li>results[1]: the new created filename</li>
     *         </ul>
     *         return null if fail
     */
    String[] upload_file(String group_name, String master_filename, String prefix_name, String local_filename,
            String file_ext_name, NameValuePair[] meta_list) throws IOException, MyException;

    /**
     * upload file to storage server (by file buff, slave file mode)
     *
     * @param group_name
     *            the group name of master file
     * @param master_filename
     *            the master file name to generate the slave file
     * @param prefix_name
     *            the prefix name to generate the slave file
     * @param file_buff
     *            file content/buff
     * @param file_ext_name
     *            file ext name, do not include dot(.)
     * @param meta_list
     *            meta info array
     * @return 2 elements string array if success:<br>
     *         <ul>
     *         <li>results[0]: the group name to store the file</li>
     *         </ul>
     *         <ul>
     *         <li>results[1]: the new created filename</li>
     *         </ul>
     *         return null if fail
     */
    String[] upload_file(String group_name, String master_filename, String prefix_name, byte[] file_buff,
            String file_ext_name, NameValuePair[] meta_list) throws IOException, MyException;

    /**
     * upload file to storage server (by file buff, slave file mode)
     *
     * @param group_name
     *            the group name of master file
     * @param master_filename
     *            the master file name to generate the slave file
     * @param prefix_name
     *            the prefix name to generate the slave file
     * @param file_buff
     *            file content/buff
     * @param offset
     *            start offset of the buff
     * @param length
     *            the length of buff to upload
     * @param file_ext_name
     *            file ext name, do not include dot(.)
     * @param meta_list
     *            meta info array
     * @return 2 elements string array if success:<br>
     *         <ul>
     *         <li>results[0]: the group name to store the file</li>
     *         </ul>
     *         <ul>
     *         <li>results[1]: the new created filename</li>
     *         </ul>
     *         return null if fail
     */
    String[] upload_file(String group_name, String master_filename, String prefix_name, byte[] file_buff, int offset,
            int length, String file_ext_name, NameValuePair[] meta_list) throws IOException, MyException;

    /**
     * upload file to storage server (by callback, slave file mode)
     *
     * @param group_name
     *            the group name to upload file to, can be empty
     * @param master_filename
     *            the master file name to generate the slave file
     * @param prefix_name
     *            the prefix name to generate the slave file
     * @param file_size
     *            the file size
     * @param callback
     *            the write data callback object
     * @param file_ext_name
     *            file ext name, do not include dot(.)
     * @param meta_list
     *            meta info array
     * @return 2 elements string array if success:<br>
     *         <ul>
     *         <li>results[0]: the group name to store the file</li>
     *         </ul>
     *         <ul>
     *         <li>results[1]: the new created filename</li>
     *         </ul>
     *         return null if fail
     */
    String[] upload_file(String group_name, String master_filename, String prefix_name, long file_size,
            UploadCallback callback, String file_ext_name, NameValuePair[] meta_list) throws IOException, MyException;

    /**
     * upload appender file to storage server (by file name)
     *
     * @param local_filename
     *            local filename to upload
     * @param file_ext_name
     *            file ext name, do not include dot(.), null to extract ext name
     *            from the local filename
     * @param meta_list
     *            meta info array
     * @return 2 elements string array if success:<br>
     *         <ul>
     *         <li>results[0]: the group name to store the file</li>
     *         </ul>
     *         <ul>
     *         <li>results[1]: the new created filename</li>
     *         </ul>
     *         return null if fail
     */
    String[] upload_appender_file(String local_filename, String file_ext_name, NameValuePair[] meta_list)
            throws IOException, MyException;

    /**
     * upload appender file to storage server (by file buff)
     *
     * @param file_buff
     *            file content/buff
     * @param offset
     *            start offset of the buff
     * @param length
     *            the length of buff to upload
     * @param file_ext_name
     *            file ext name, do not include dot(.)
     * @param meta_list
     *            meta info array
     * @return 2 elements string array if success:<br>
     *         <ul>
     *         <li>results[0]: the group name to store the file</li>
     *         </ul>
     *         <ul>
     *         <li>results[1]: the new created filename</li>
     *         </ul>
     *         return null if fail
     */
    String[] upload_appender_file(byte[] file_buff, int offset, int length, String file_ext_name,
            NameValuePair[] meta_list) throws IOException, MyException;

    /**
     * upload appender file to storage server (by file buff)
     *
     * @param group_name
     *            the group name to upload file to, can be empty
     * @param file_buff
     *            file content/buff
     * @param offset
     *            start offset of the buff
     * @param length
     *            the length of buff to upload
     * @param file_ext_name
     *            file ext name, do not include dot(.)
     * @param meta_list
     *            meta info array
     * @return 2 elements string array if success:<br>
     *         <ul>
     *         <li>results[0]: the group name to store the file</li>
     *         </ul>
     *         <ul>
     *         <li>results[1]: the new created filename</li>
     *         </ul>
     *         return null if fail
     */
    String[] upload_appender_file(String group_name, byte[] file_buff, int offset, int length, String file_ext_name,
            NameValuePair[] meta_list) throws IOException, MyException;

    /**
     * upload appender file to storage server (by file buff)
     *
     * @param file_buff
     *            file content/buff
     * @param file_ext_name
     *            file ext name, do not include dot(.)
     * @param meta_list
     *            meta info array
     * @return 2 elements string array if success:<br>
     *         <ul>
     *         <li>results[0]: the group name to store the file</li>
     *         </ul>
     *         <ul>
     *         <li>results[1]: the new created filename</li>
     *         </ul>
     *         return null if fail
     */
    String[] upload_appender_file(byte[] file_buff, String file_ext_name, NameValuePair[] meta_list)
            throws IOException, MyException;

    /**
     * upload appender file to storage server (by file buff)
     *
     * @param group_name
     *            the group name to upload file to, can be empty
     * @param file_buff
     *            file content/buff
     * @param file_ext_name
     *            file ext name, do not include dot(.)
     * @param meta_list
     *            meta info array
     * @return 2 elements string array if success:<br>
     *         <ul>
     *         <li>results[0]: the group name to store the file</li>
     *         </ul>
     *         <ul>
     *         <li>results[1]: the new created filename</li>
     *         </ul>
     *         return null if fail
     */
    String[] upload_appender_file(String group_name, byte[] file_buff, String file_ext_name, NameValuePair[] meta_list)
            throws IOException, MyException;

    /**
     * upload appender file to storage server (by callback)
     *
     * @param group_name
     *            the group name to upload file to, can be empty
     * @param file_size
     *            the file size
     * @param callback
     *            the write data callback object
     * @param file_ext_name
     *            file ext name, do not include dot(.)
     * @param meta_list
     *            meta info array
     * @return 2 elements string array if success:<br>
     *         <ul>
     *         <li>results[0]: the group name to store the file</li>
     *         </ul>
     *         <ul>
     *         <li>results[1]: the new created filename</li>
     *         </ul>
     *         return null if fail
     */
    String[] upload_appender_file(String group_name, long file_size, UploadCallback callback, String file_ext_name,
            NameValuePair[] meta_list) throws IOException, MyException;

    /**
     * append file to storage server (by file name)
     *
     * @param group_name
     *            the group name of appender file
     * @param appender_filename
     *            the appender filename
     * @param local_filename
     *            local filename to append
     * @return 0 for success, != 0 for error (error no)
     */
    int append_file(String group_name, String appender_filename, String local_filename) throws IOException, MyException;

    /**
     * append file to storage server (by file buff)
     *
     * @param group_name
     *            the group name of appender file
     * @param appender_filename
     *            the appender filename
     * @param file_buff
     *            file content/buff
     * @return 0 for success, != 0 for error (error no)
     */
    int append_file(String group_name, String appender_filename, byte[] file_buff) throws IOException, MyException;

    /**
     * append file to storage server (by file buff)
     *
     * @param group_name
     *            the group name of appender file
     * @param appender_filename
     *            the appender filename
     * @param file_buff
     *            file content/buff
     * @param offset
     *            start offset of the buff
     * @param length
     *            the length of buff to append
     * @return 0 for success, != 0 for error (error no)
     */
    int append_file(String group_name, String appender_filename, byte[] file_buff, int offset, int length)
            throws IOException, MyException;

    /**
     * append file to storage server (by callback)
     *
     * @param group_name
     *            the group name to append file to
     * @param appender_filename
     *            the appender filename
     * @param file_size
     *            the file size
     * @param callback
     *            the write data callback object
     * @return 0 for success, != 0 for error (error no)
     */
    int append_file(String group_name, String appender_filename, long file_size, UploadCallback callback)
            throws IOException, MyException;

    /**
     * modify appender file to storage server (by file name)
     *
     * @param group_name
     *            the group name of appender file
     * @param appender_filename
     *            the appender filename
     * @param file_offset
     *            the offset of appender file
     * @param local_filename
     *            local filename to append
     * @return 0 for success, != 0 for error (error no)
     */
    int modify_file(String group_name, String appender_filename, long file_offset, String local_filename)
            throws IOException, MyException;

    /**
     * modify appender file to storage server (by file buff)
     *
     * @param group_name
     *            the group name of appender file
     * @param appender_filename
     *            the appender filename
     * @param file_offset
     *            the offset of appender file
     * @param file_buff
     *            file content/buff
     * @return 0 for success, != 0 for error (error no)
     */
    int modify_file(String group_name, String appender_filename, long file_offset, byte[] file_buff)
            throws IOException, MyException;

    /**
     * modify appender file to storage server (by file buff)
     *
     * @param group_name
     *            the group name of appender file
     * @param appender_filename
     *            the appender filename
     * @param file_offset
     *            the offset of appender file
     * @param file_buff
     *            file content/buff
     * @param buffer_offset
     *            start offset of the buff
     * @param buffer_length
     *            the length of buff to modify
     * @return 0 for success, != 0 for error (error no)
     */
    int modify_file(String group_name, String appender_filename, long file_offset, byte[] file_buff, int buffer_offset,
            int buffer_length) throws IOException, MyException;

    /**
     * modify appender file to storage server (by callback)
     *
     * @param group_name
     *            the group name to modify file to
     * @param appender_filename
     *            the appender filename
     * @param file_offset
     *            the offset of appender file
     * @param modify_size
     *            the modify size
     * @param callback
     *            the write data callback object
     * @return 0 for success, != 0 for error (error no)
     */
    int modify_file(String group_name, String appender_filename, long file_offset, long modify_size,
            UploadCallback callback) throws IOException, MyException;

    /**
     * delete file from storage server
     *
     * @param group_name
     *            the group name of storage server
     * @param remote_filename
     *            filename on storage server
     * @return 0 for success, none zero for fail (error code)
     */
    int delete_file(String group_name, String remote_filename) throws IOException, MyException;

    /**
     * truncate appender file to size 0 from storage server
     *
     * @param group_name
     *            the group name of storage server
     * @param appender_filename
     *            the appender filename
     * @return 0 for success, none zero for fail (error code)
     */
    int truncate_file(String group_name, String appender_filename) throws IOException, MyException;

    /**
     * truncate appender file from storage server
     *
     * @param group_name
     *            the group name of storage server
     * @param appender_filename
     *            the appender filename
     * @param truncated_file_size
     *            truncated file size
     * @return 0 for success, none zero for fail (error code)
     */
    int truncate_file(String group_name, String appender_filename, long truncated_file_size)
            throws IOException, MyException;

    /**
     * download file from storage server
     *
     * @param group_name
     *            the group name of storage server
     * @param remote_filename
     *            filename on storage server
     * @return file content/buff, return null if fail
     */
    byte[] download_file(String group_name, String remote_filename) throws IOException, MyException;

    /**
     * download file from storage server
     *
     * @param group_name
     *            the group name of storage server
     * @param remote_filename
     *            filename on storage server
     * @param file_offset
     *            the start offset of the file
     * @param download_bytes
     *            download bytes, 0 for remain bytes from offset
     * @return file content/buff, return null if fail
     */
    byte[] download_file(String group_name, String remote_filename, long file_offset, long download_bytes)
            throws IOException, MyException;

    /**
     * download file from storage server
     *
     * @param group_name
     *            the group name of storage server
     * @param remote_filename
     *            filename on storage server
     * @param local_filename
     *            filename on local
     * @return 0 success, return none zero errno if fail
     */
    int download_file(String group_name, String remote_filename, String local_filename) throws IOException, MyException;

    /**
     * download file from storage server
     *
     * @param group_name
     *            the group name of storage server
     * @param remote_filename
     *            filename on storage server
     * @param file_offset
     *            the start offset of the file
     * @param download_bytes
     *            download bytes, 0 for remain bytes from offset
     * @param local_filename
     *            filename on local
     * @return 0 success, return none zero errno if fail
     */
    int download_file(String group_name, String remote_filename, long file_offset, long download_bytes,
            String local_filename) throws IOException, MyException;

    /**
     * download file from storage server
     *
     * @param group_name
     *            the group name of storage server
     * @param remote_filename
     *            filename on storage server
     * @param callback
     *            call callback.recv() when data arrive
     * @return 0 success, return none zero errno if fail
     */
    int download_file(String group_name, String remote_filename, DownloadCallback callback)
            throws IOException, MyException;

    /**
     * download file from storage server
     *
     * @param group_name
     *            the group name of storage server
     * @param remote_filename
     *            filename on storage server
     * @param file_offset
     *            the start offset of the file
     * @param download_bytes
     *            download bytes, 0 for remain bytes from offset
     * @param callback
     *            call callback.recv() when data arrive
     * @return 0 success, return none zero errno if fail
     */
    int download_file(String group_name, String remote_filename, long file_offset, long download_bytes,
            DownloadCallback callback) throws IOException, MyException;

    /**
     * get all metadata items from storage server
     *
     * @param group_name
     *            the group name of storage server
     * @param remote_filename
     *            filename on storage server
     * @return meta info array, return null if fail
     */
    NameValuePair[] get_metadata(String group_name, String remote_filename) throws IOException, MyException;

    /**
     * set metadata items to storage server
     *
     * @param group_name
     *            the group name of storage server
     * @param remote_filename
     *            filename on storage server
     * @param meta_list
     *            meta item array
     * @param op_flag
     *            flag, can be one of following values: <br>
     *            <ul>
     *            <li>ProtoCommon.STORAGE_SET_METADATA_FLAG_OVERWRITE: overwrite
     *            all old metadata items</li>
     *            </ul>
     *            <ul>
     *            <li>ProtoCommon.STORAGE_SET_METADATA_FLAG_MERGE: merge, insert
     *            when the metadata item not exist, otherwise update it</li>
     *            </ul>
     * @return 0 for success, !=0 fail (error code)
     */
    int set_metadata(String group_name, String remote_filename, NameValuePair[] meta_list, byte op_flag)
            throws IOException, MyException;

    /**
     * get file info decoded from the filename, fetch from the storage if
     * necessary
     *
     * @param group_name
     *            the group name
     * @param remote_filename
     *            the filename
     * @return FileInfo object for success, return null for fail
     */
    FileInfo get_file_info(String group_name, String remote_filename) throws IOException, MyException;

    /**
     * get file info from storage server
     *
     * @param group_name
     *            the group name of storage server
     * @param remote_filename
     *            filename on storage server
     * @return FileInfo object for success, return null for fail
     */
    FileInfo query_file_info(String group_name, String remote_filename) throws IOException, MyException;

}