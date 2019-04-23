package util;

import org.springframework.web.servlet.view.InternalResourceView;

import java.io.File;
import java.util.Locale;

/*
 * @Author Aidan.Zhu
 * @Description //TODO
 * @Date 16:53 2019/4/23
 * @Param
 * @return
 **/
public class HtmlResourceView extends InternalResourceView {
    @Override
    public boolean checkResource(Locale locale) {
        File file = new File(this.getServletContext().getRealPath("/") + getUrl());
        return file.exists();// 判断该页面是否存在
    }
}