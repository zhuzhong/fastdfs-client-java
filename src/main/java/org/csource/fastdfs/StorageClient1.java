/**
 * Copyright (C) 2008 Happy Fish / YuQing
 * <p>
 * FastDFS Java Client may be copied only under the terms of the GNU Lesser
 * General Public License (LGPL).
 * Please visit the FastDFS Home Page http://www.csource.org/ for more detail.
 */

package org.csource.fastdfs;

import org.csource.common.MyException;
import org.csource.common.NameValuePair;

import java.io.IOException;

/**
 * Storage client for 1 field file id: combined group name and filename
 *
 * @author Happy Fish / YuQing
 * @version Version 1.21
 */
public class StorageClient1 extends StorageClient {
  public static final String SPLIT_GROUP_NAME_AND_FILENAME_SEPERATOR = "/";

  /**
   * constructor
   */
 /* public StorageClient1() {
    super();
  }*/

  /**
   * constructor
   *
   * @param trackerServer the tracker server, can be null
   * @param storageServer the storage server, can be null
   */
  /*public StorageClient1(TrackerServer trackerServer, StorageServer storageServer) {
    super(trackerServer, storageServer);
  }*/
  public StorageClient1(TrackerServer trackerServer, TrackerClient trckerClient) {
      super(trackerServer, trckerClient);
    }
  public static byte split_file_id(String file_id, String[] results) {
    int pos = file_id.indexOf(SPLIT_GROUP_NAME_AND_FILENAME_SEPERATOR);
    if ((pos <= 0) || (pos == file_id.length() - 1)) {
      return ProtoCommon.ERR_NO_EINVAL;
    }

    results[0] = file_id.substring(0, pos); //group name
    results[1] = file_id.substring(pos + 1); //file name
    return 0;
  }

  /* (non-Javadoc)
 * @see org.csource.fastdfs.FastdfsService#upload_file1(java.lang.String, java.lang.String, org.csource.common.NameValuePair[])
 */
  public String upload_file1(String local_filename, String file_ext_name,
                             NameValuePair[] meta_list) throws IOException, MyException {
    String parts[] = this.upload_file(local_filename, file_ext_name, meta_list);
    if (parts != null) {
      return parts[0] + SPLIT_GROUP_NAME_AND_FILENAME_SEPERATOR + parts[1];
    } else {
      return null;
    }
  }

  /* (non-Javadoc)
 * @see org.csource.fastdfs.FastdfsService#upload_file1(java.lang.String, java.lang.String, java.lang.String, org.csource.common.NameValuePair[])
 */
  public String upload_file1(String group_name, String local_filename, String file_ext_name,
                             NameValuePair[] meta_list) throws IOException, MyException {
    String parts[] = this.upload_file(group_name, local_filename, file_ext_name, meta_list);
    if (parts != null) {
      return parts[0] + SPLIT_GROUP_NAME_AND_FILENAME_SEPERATOR + parts[1];
    } else {
      return null;
    }
  }

  /* (non-Javadoc)
 * @see org.csource.fastdfs.FastdfsService#upload_file1(byte[], java.lang.String, org.csource.common.NameValuePair[])
 */
  public String upload_file1(byte[] file_buff, String file_ext_name,
                             NameValuePair[] meta_list) throws IOException, MyException {
    String parts[] = this.upload_file(file_buff, file_ext_name, meta_list);
    if (parts != null) {
      return parts[0] + SPLIT_GROUP_NAME_AND_FILENAME_SEPERATOR + parts[1];
    } else {
      return null;
    }
  }

  /* (non-Javadoc)
 * @see org.csource.fastdfs.FastdfsService#upload_file1(java.lang.String, byte[], java.lang.String, org.csource.common.NameValuePair[])
 */
  public String upload_file1(String group_name, byte[] file_buff, String file_ext_name,
                             NameValuePair[] meta_list) throws IOException, MyException {
    String parts[] = this.upload_file(group_name, file_buff, file_ext_name, meta_list);
    if (parts != null) {
      return parts[0] + SPLIT_GROUP_NAME_AND_FILENAME_SEPERATOR + parts[1];
    } else {
      return null;
    }
  }

  /* (non-Javadoc)
 * @see org.csource.fastdfs.FastdfsService#upload_file1(java.lang.String, long, org.csource.fastdfs.UploadCallback, java.lang.String, org.csource.common.NameValuePair[])
 */
  public String upload_file1(String group_name, long file_size,
                             UploadCallback callback, String file_ext_name,
                             NameValuePair[] meta_list) throws IOException, MyException {
    String parts[] = this.upload_file(group_name, file_size, callback, file_ext_name, meta_list);
    if (parts != null) {
      return parts[0] + SPLIT_GROUP_NAME_AND_FILENAME_SEPERATOR + parts[1];
    } else {
      return null;
    }
  }

  /* (non-Javadoc)
 * @see org.csource.fastdfs.FastdfsService#upload_appender_file1(java.lang.String, java.lang.String, org.csource.common.NameValuePair[])
 */
  public String upload_appender_file1(String local_filename, String file_ext_name,
                                      NameValuePair[] meta_list) throws IOException, MyException {
    String parts[] = this.upload_appender_file(local_filename, file_ext_name, meta_list);
    if (parts != null) {
      return parts[0] + SPLIT_GROUP_NAME_AND_FILENAME_SEPERATOR + parts[1];
    } else {
      return null;
    }
  }

  /* (non-Javadoc)
 * @see org.csource.fastdfs.FastdfsService#upload_appender_file1(java.lang.String, java.lang.String, java.lang.String, org.csource.common.NameValuePair[])
 */
  public String upload_appender_file1(String group_name, String local_filename, String file_ext_name,
                                      NameValuePair[] meta_list) throws IOException, MyException {
    String parts[] = this.upload_appender_file(group_name, local_filename, file_ext_name, meta_list);
    if (parts != null) {
      return parts[0] + SPLIT_GROUP_NAME_AND_FILENAME_SEPERATOR + parts[1];
    } else {
      return null;
    }
  }

  /* (non-Javadoc)
 * @see org.csource.fastdfs.FastdfsService#upload_appender_file1(byte[], java.lang.String, org.csource.common.NameValuePair[])
 */
  public String upload_appender_file1(byte[] file_buff, String file_ext_name,
                                      NameValuePair[] meta_list) throws IOException, MyException {
    String parts[] = this.upload_appender_file(file_buff, file_ext_name, meta_list);
    if (parts != null) {
      return parts[0] + SPLIT_GROUP_NAME_AND_FILENAME_SEPERATOR + parts[1];
    } else {
      return null;
    }
  }

  /* (non-Javadoc)
 * @see org.csource.fastdfs.FastdfsService#upload_appender_file1(java.lang.String, byte[], java.lang.String, org.csource.common.NameValuePair[])
 */
  public String upload_appender_file1(String group_name, byte[] file_buff, String file_ext_name,
                                      NameValuePair[] meta_list) throws IOException, MyException {
    String parts[] = this.upload_appender_file(group_name, file_buff, file_ext_name, meta_list);
    if (parts != null) {
      return parts[0] + SPLIT_GROUP_NAME_AND_FILENAME_SEPERATOR + parts[1];
    } else {
      return null;
    }
  }

  /* (non-Javadoc)
 * @see org.csource.fastdfs.FastdfsService#upload_appender_file1(java.lang.String, long, org.csource.fastdfs.UploadCallback, java.lang.String, org.csource.common.NameValuePair[])
 */
  public String upload_appender_file1(String group_name, long file_size,
                                      UploadCallback callback, String file_ext_name,
                                      NameValuePair[] meta_list) throws IOException, MyException {
    String parts[] = this.upload_appender_file(group_name, file_size, callback, file_ext_name, meta_list);
    if (parts != null) {
      return parts[0] + SPLIT_GROUP_NAME_AND_FILENAME_SEPERATOR + parts[1];
    } else {
      return null;
    }
  }

  /* (non-Javadoc)
 * @see org.csource.fastdfs.FastdfsService#upload_file1(java.lang.String, java.lang.String, java.lang.String, java.lang.String, org.csource.common.NameValuePair[])
 */
  public String upload_file1(String master_file_id, String prefix_name,
                             String local_filename, String file_ext_name, NameValuePair[] meta_list) throws IOException, MyException {
    String[] parts = new String[2];
    this.errno = this.split_file_id(master_file_id, parts);
    if (this.errno != 0) {
      return null;
    }

    parts = this.upload_file(parts[0], parts[1], prefix_name,
      local_filename, file_ext_name, meta_list);
    if (parts != null) {
      return parts[0] + SPLIT_GROUP_NAME_AND_FILENAME_SEPERATOR + parts[1];
    } else {
      return null;
    }
  }

  /* (non-Javadoc)
 * @see org.csource.fastdfs.FastdfsService#upload_file1(java.lang.String, java.lang.String, byte[], java.lang.String, org.csource.common.NameValuePair[])
 */
  public String upload_file1(String master_file_id, String prefix_name,
                             byte[] file_buff, String file_ext_name, NameValuePair[] meta_list) throws IOException, MyException {
    String[] parts = new String[2];
    this.errno = this.split_file_id(master_file_id, parts);
    if (this.errno != 0) {
      return null;
    }

    parts = this.upload_file(parts[0], parts[1], prefix_name, file_buff, file_ext_name, meta_list);
    if (parts != null) {
      return parts[0] + SPLIT_GROUP_NAME_AND_FILENAME_SEPERATOR + parts[1];
    } else {
      return null;
    }
  }

  /* (non-Javadoc)
 * @see org.csource.fastdfs.FastdfsService#upload_file1(java.lang.String, java.lang.String, byte[], int, int, java.lang.String, org.csource.common.NameValuePair[])
 */
  public String upload_file1(String master_file_id, String prefix_name,
                             byte[] file_buff, int offset, int length, String file_ext_name,
                             NameValuePair[] meta_list) throws IOException, MyException {
    String[] parts = new String[2];
    this.errno = this.split_file_id(master_file_id, parts);
    if (this.errno != 0) {
      return null;
    }

    parts = this.upload_file(parts[0], parts[1], prefix_name, file_buff,
      offset, length, file_ext_name, meta_list);
    if (parts != null) {
      return parts[0] + SPLIT_GROUP_NAME_AND_FILENAME_SEPERATOR + parts[1];
    } else {
      return null;
    }
  }

  /* (non-Javadoc)
 * @see org.csource.fastdfs.FastdfsService#upload_file1(java.lang.String, java.lang.String, long, org.csource.fastdfs.UploadCallback, java.lang.String, org.csource.common.NameValuePair[])
 */
  public String upload_file1(String master_file_id, String prefix_name, long file_size,
                             UploadCallback callback, String file_ext_name,
                             NameValuePair[] meta_list) throws IOException, MyException {
    String[] parts = new String[2];
    this.errno = this.split_file_id(master_file_id, parts);
    if (this.errno != 0) {
      return null;
    }

    parts = this.upload_file(parts[0], parts[1], prefix_name, file_size, callback, file_ext_name, meta_list);
    if (parts != null) {
      return parts[0] + SPLIT_GROUP_NAME_AND_FILENAME_SEPERATOR + parts[1];
    } else {
      return null;
    }
  }

  /* (non-Javadoc)
 * @see org.csource.fastdfs.FastdfsService#append_file1(java.lang.String, java.lang.String)
 */
  public int append_file1(String appender_file_id, String local_filename) throws IOException, MyException {
    String[] parts = new String[2];
    this.errno = this.split_file_id(appender_file_id, parts);
    if (this.errno != 0) {
      return this.errno;
    }

    return this.append_file(parts[0], parts[1], local_filename);
  }

  /* (non-Javadoc)
 * @see org.csource.fastdfs.FastdfsService#append_file1(java.lang.String, byte[])
 */
  public int append_file1(String appender_file_id, byte[] file_buff) throws IOException, MyException {
    String[] parts = new String[2];
    this.errno = this.split_file_id(appender_file_id, parts);
    if (this.errno != 0) {
      return this.errno;
    }

    return this.append_file(parts[0], parts[1], file_buff);
  }

  /* (non-Javadoc)
 * @see org.csource.fastdfs.FastdfsService#append_file1(java.lang.String, byte[], int, int)
 */
  public int append_file1(String appender_file_id, byte[] file_buff, int offset, int length) throws IOException, MyException {
    String[] parts = new String[2];
    this.errno = this.split_file_id(appender_file_id, parts);
    if (this.errno != 0) {
      return this.errno;
    }

    return this.append_file(parts[0], parts[1], file_buff, offset, length);
  }

  /* (non-Javadoc)
 * @see org.csource.fastdfs.FastdfsService#append_file1(java.lang.String, long, org.csource.fastdfs.UploadCallback)
 */
  public int append_file1(String appender_file_id, long file_size, UploadCallback callback) throws IOException, MyException {
    String[] parts = new String[2];
    this.errno = this.split_file_id(appender_file_id, parts);
    if (this.errno != 0) {
      return this.errno;
    }

    return this.append_file(parts[0], parts[1], file_size, callback);
  }

  /* (non-Javadoc)
 * @see org.csource.fastdfs.FastdfsService#modify_file1(java.lang.String, long, java.lang.String)
 */
  public int modify_file1(String appender_file_id,
                          long file_offset, String local_filename) throws IOException, MyException {
    String[] parts = new String[2];
    this.errno = this.split_file_id(appender_file_id, parts);
    if (this.errno != 0) {
      return this.errno;
    }

    return this.modify_file(parts[0], parts[1], file_offset, local_filename);
  }

  /* (non-Javadoc)
 * @see org.csource.fastdfs.FastdfsService#modify_file1(java.lang.String, long, byte[])
 */
  public int modify_file1(String appender_file_id,
                          long file_offset, byte[] file_buff) throws IOException, MyException {
    String[] parts = new String[2];
    this.errno = this.split_file_id(appender_file_id, parts);
    if (this.errno != 0) {
      return this.errno;
    }

    return this.modify_file(parts[0], parts[1], file_offset, file_buff);
  }

  /* (non-Javadoc)
 * @see org.csource.fastdfs.FastdfsService#modify_file1(java.lang.String, long, byte[], int, int)
 */
  public int modify_file1(String appender_file_id,
                          long file_offset, byte[] file_buff, int buffer_offset, int buffer_length) throws IOException, MyException {
    String[] parts = new String[2];
    this.errno = this.split_file_id(appender_file_id, parts);
    if (this.errno != 0) {
      return this.errno;
    }

    return this.modify_file(parts[0], parts[1], file_offset,
      file_buff, buffer_offset, buffer_length);
  }

  /* (non-Javadoc)
 * @see org.csource.fastdfs.FastdfsService#modify_file1(java.lang.String, long, long, org.csource.fastdfs.UploadCallback)
 */
  public int modify_file1(String appender_file_id,
                          long file_offset, long modify_size, UploadCallback callback) throws IOException, MyException {
    String[] parts = new String[2];
    this.errno = this.split_file_id(appender_file_id, parts);
    if (this.errno != 0) {
      return this.errno;
    }

    return this.modify_file(parts[0], parts[1], file_offset, modify_size, callback);
  }

  /* (non-Javadoc)
 * @see org.csource.fastdfs.FastdfsService#delete_file1(java.lang.String)
 */
  public int delete_file1(String file_id) throws IOException, MyException {
    String[] parts = new String[2];
    this.errno = this.split_file_id(file_id, parts);
    if (this.errno != 0) {
      return this.errno;
    }

    return this.delete_file(parts[0], parts[1]);
  }

  /* (non-Javadoc)
 * @see org.csource.fastdfs.FastdfsService#truncate_file1(java.lang.String)
 */
  public int truncate_file1(String appender_file_id) throws IOException, MyException {
    String[] parts = new String[2];
    this.errno = this.split_file_id(appender_file_id, parts);
    if (this.errno != 0) {
      return this.errno;
    }

    return this.truncate_file(parts[0], parts[1]);
  }

  /* (non-Javadoc)
 * @see org.csource.fastdfs.FastdfsService#truncate_file1(java.lang.String, long)
 */
  public int truncate_file1(String appender_file_id, long truncated_file_size) throws IOException, MyException {
    String[] parts = new String[2];
    this.errno = this.split_file_id(appender_file_id, parts);
    if (this.errno != 0) {
      return this.errno;
    }

    return this.truncate_file(parts[0], parts[1], truncated_file_size);
  }

  /* (non-Javadoc)
 * @see org.csource.fastdfs.FastdfsService#download_file1(java.lang.String)
 */
  public byte[] download_file1(String file_id) throws IOException, MyException {
    final long file_offset = 0;
    final long download_bytes = 0;

    return this.download_file1(file_id, file_offset, download_bytes);
  }

  /* (non-Javadoc)
 * @see org.csource.fastdfs.FastdfsService#download_file1(java.lang.String, long, long)
 */
  public byte[] download_file1(String file_id, long file_offset, long download_bytes) throws IOException, MyException {
    String[] parts = new String[2];
    this.errno = this.split_file_id(file_id, parts);
    if (this.errno != 0) {
      return null;
    }

    return this.download_file(parts[0], parts[1], file_offset, download_bytes);
  }

  /* (non-Javadoc)
 * @see org.csource.fastdfs.FastdfsService#download_file1(java.lang.String, java.lang.String)
 */
  public int download_file1(String file_id, String local_filename) throws IOException, MyException {
    final long file_offset = 0;
    final long download_bytes = 0;

    return this.download_file1(file_id, file_offset, download_bytes, local_filename);
  }

  /* (non-Javadoc)
 * @see org.csource.fastdfs.FastdfsService#download_file1(java.lang.String, long, long, java.lang.String)
 */
  public int download_file1(String file_id, long file_offset, long download_bytes, String local_filename) throws IOException, MyException {
    String[] parts = new String[2];
    this.errno = this.split_file_id(file_id, parts);
    if (this.errno != 0) {
      return this.errno;
    }

    return this.download_file(parts[0], parts[1], file_offset, download_bytes, local_filename);
  }

  /* (non-Javadoc)
 * @see org.csource.fastdfs.FastdfsService#download_file1(java.lang.String, org.csource.fastdfs.DownloadCallback)
 */
  public int download_file1(String file_id, DownloadCallback callback) throws IOException, MyException {
    final long file_offset = 0;
    final long download_bytes = 0;

    return this.download_file1(file_id, file_offset, download_bytes, callback);
  }

  /* (non-Javadoc)
 * @see org.csource.fastdfs.FastdfsService#download_file1(java.lang.String, long, long, org.csource.fastdfs.DownloadCallback)
 */
  public int download_file1(String file_id, long file_offset, long download_bytes, DownloadCallback callback) throws IOException, MyException {
    String[] parts = new String[2];
    this.errno = this.split_file_id(file_id, parts);
    if (this.errno != 0) {
      return this.errno;
    }

    return this.download_file(parts[0], parts[1], file_offset, download_bytes, callback);
  }

  /* (non-Javadoc)
 * @see org.csource.fastdfs.FastdfsService#get_metadata1(java.lang.String)
 */
  public NameValuePair[] get_metadata1(String file_id) throws IOException, MyException {
    String[] parts = new String[2];
    this.errno = this.split_file_id(file_id, parts);
    if (this.errno != 0) {
      return null;
    }

    return this.get_metadata(parts[0], parts[1]);
  }

  /* (non-Javadoc)
 * @see org.csource.fastdfs.FastdfsService#set_metadata1(java.lang.String, org.csource.common.NameValuePair[], byte)
 */
  public int set_metadata1(String file_id, NameValuePair[] meta_list, byte op_flag) throws IOException, MyException {
    String[] parts = new String[2];
    this.errno = this.split_file_id(file_id, parts);
    if (this.errno != 0) {
      return this.errno;
    }

    return this.set_metadata(parts[0], parts[1], meta_list, op_flag);
  }

  /* (non-Javadoc)
 * @see org.csource.fastdfs.FastdfsService#query_file_info1(java.lang.String)
 */
  public FileInfo query_file_info1(String file_id) throws IOException, MyException {
    String[] parts = new String[2];
    this.errno = this.split_file_id(file_id, parts);
    if (this.errno != 0) {
      return null;
    }

    return this.query_file_info(parts[0], parts[1]);
  }

  /* (non-Javadoc)
 * @see org.csource.fastdfs.FastdfsService#get_file_info1(java.lang.String)
 */
  public FileInfo get_file_info1(String file_id) throws IOException, MyException {
    String[] parts = new String[2];
    this.errno = this.split_file_id(file_id, parts);
    if (this.errno != 0) {
      return null;
    }

    return this.get_file_info(parts[0], parts[1]);
  }
}
