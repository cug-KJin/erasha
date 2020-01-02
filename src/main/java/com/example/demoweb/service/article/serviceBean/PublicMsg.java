package com.example.demoweb.service.article.serviceBean;

public class PublicMsg {
    public final static String UEDITOR_CONFIG = "{\n" +
            "\t\"imageActionName\": \"uploadimage\",\n" +
            "\t\"imageFieldName\": \"upfile\",\n" +
            "\t\"imageMaxSize\": 2048000,\n" +
            "\t\"imageAllowFiles\": [\".png\", \".jpg\", \".jpeg\", \".gif\", \".bmp\"],\n" +
            "\t\"imageCompressEnable\": true,\n" +
            "\t\"imageCompressBorder\": 1600,\n" +
            "\t\"imageInsertAlign\": \"none\",\n" +
            "\t\"imageUrlPrefix\": \"\",\n" +
            "\t\"imagePathFormat\": \"/ueditor/jsp/upload/image/{yyyy}{mm}{dd}/{time}{rand:6}\",\n" +
            "\t\"scrawlActionName\": \"uploadscrawl\",\n" +
            "\t\"scrawlFieldName\": \"upfile\",\n" +
            "\t\"scrawlPathFormat\": \"/ueditor/jsp/upload/image/{yyyy}{mm}{dd}/{time}{rand:6}\",\n" +
            "\t\"scrawlMaxSize\": 2048000,\n" +
            "\t\"scrawlUrlPrefix\": \"\",\n" +
            "\t\"scrawlInsertAlign\": \"none\",\n" +
            "\t\"snapscreenActionName\": \"uploadimage\",\n" +
            "\t\"snapscreenPathFormat\": \"/ueditor/jsp/upload/image/{yyyy}{mm}{dd}/{time}{rand:6}\",\n" +
            "\t\"snapscreenUrlPrefix\": \"\",\n" +
            "\t\"snapscreenInsertAlign\": \"none\",\n" +
            "\t\"catcherLocalDomain\": [\"127.0.0.1\", \"localhost\", \"img.baidu.com\"],\n" +
            "\t\"catcherActionName\": \"catchimage\",\n" +
            "\t\"catcherFieldName\": \"source\",\n" +
            "\t\"catcherPathFormat\": \"/ueditor/jsp/upload/image/{yyyy}{mm}{dd}/{time}{rand:6}\",\n" +
            "\t\"catcherUrlPrefix\": \"\",\n" +
            "\t\"catcherMaxSize\": 2048000,\n" +
            "\t\"catcherAllowFiles\": [\".png\", \".jpg\", \".jpeg\", \".gif\", \".bmp\"],\n" +
            "\t\"videoActionName\": \"uploadvideo\",\n" +
            "\t\"videoFieldName\": \"upfile\",\n" +
            "\t\"videoPathFormat\": \"/ueditor/jsp/upload/video/{yyyy}{mm}{dd}/{time}{rand:6}\",\n" +
            "\t\"videoUrlPrefix\": \"\",\n" +
            "\t\"videoMaxSize\": 102400000,\n" +
            "\t\"videoAllowFiles\": [\n" +
            "\t\t\".flv\", \".swf\", \".mkv\", \".avi\", \".rm\", \".rmvb\", \".mpeg\", \".mpg\",\n" +
            "\t\t\".ogg\", \".ogv\", \".mov\", \".wmv\", \".mp4\", \".webm\", \".mp3\", \".wav\", \".mid\"\n" +
            "\t],\n" +
            "\t\"fileActionName\": \"uploadfile\",\n" +
            "\t\"fileFieldName\": \"upfile\",\n" +
            "\t\"filePathFormat\": \"/ueditor/jsp/upload/file/{yyyy}{mm}{dd}/{time}{rand:6}\",\n" +
            "\t\"fileUrlPrefix\": \"\",\n" +
            "\t\"fileMaxSize\": 51200000,\n" +
            "\t\"fileAllowFiles\": [\n" +
            "\t\t\".png\", \".jpg\", \".jpeg\", \".gif\", \".bmp\",\n" +
            "\t\t\".flv\", \".swf\", \".mkv\", \".avi\", \".rm\", \".rmvb\", \".mpeg\", \".mpg\",\n" +
            "\t\t\".ogg\", \".ogv\", \".mov\", \".wmv\", \".mp4\", \".webm\", \".mp3\", \".wav\", \".mid\",\n" +
            "\t\t\".rar\", \".zip\", \".tar\", \".gz\", \".7z\", \".bz2\", \".cab\", \".iso\",\n" +
            "\t\t\".doc\", \".docx\", \".xls\", \".xlsx\", \".ppt\", \".pptx\", \".pdf\", \".txt\", \".md\", \".xml\"\n" +
            "\t],\n" +
            "\t\"imageManagerActionName\": \"listimage\",\n" +
            "\t\"imageManagerListPath\": \"/ueditor/jsp/upload/image/\",\n" +
            "\t\"imageManagerListSize\": 20,\n" +
            "\t\"imageManagerUrlPrefix\": \"\",\n" +
            "\t\"imageManagerInsertAlign\": \"none\",\n" +
            "\t\"imageManagerAllowFiles\": [\".png\", \".jpg\", \".jpeg\", \".gif\", \".bmp\"],\n" +
            "\t\"fileManagerActionName\": \"listfile\",\n" +
            "\t\"fileManagerListPath\": \"/ueditor/jsp/upload/file/\",\n" +
            "\t\"fileManagerUrlPrefix\": \"\",\n" +
            "\t\"fileManagerListSize\": 20,\n" +
            "\t\"fileManagerAllowFiles\": [\n" +
            "\t\t\".png\", \".jpg\", \".jpeg\", \".gif\", \".bmp\",\n" +
            "\t\t\".flv\", \".swf\", \".mkv\", \".avi\", \".rm\", \".rmvb\", \".mpeg\", \".mpg\",\n" +
            "\t\t\".ogg\", \".ogv\", \".mov\", \".wmv\", \".mp4\", \".webm\", \".mp3\", \".wav\", \".mid\",\n" +
            "\t\t\".rar\", \".zip\", \".tar\", \".gz\", \".7z\", \".bz2\", \".cab\", \".iso\",\n" +
            "\t\t\".doc\", \".docx\", \".xls\", \".xlsx\", \".ppt\", \".pptx\", \".pdf\", \".txt\", \".md\", \".xml\"\n" +
            "\t]\n" +
            "}";
    /**
     * Ueditor的返回状态类型
     */
    public enum UeditorMsg{
        SUCCESS("SUCCESS"),ERROR("上传失败");
        private String v;
        UeditorMsg(String v){
            this.v =v;
        }
        public String get(){
            return this.v;
        }
    }
}
