package demo;

import org.noear.solon.SolonApp;
import org.noear.solon.annotation.Component;
import org.noear.solon.core.Plugin;
import org.noear.solon.extend.staticfiles.StaticMappings;
import org.noear.solon.extend.staticfiles.repository.ClassPathStaticRepository;
import org.noear.solon.extend.staticfiles.repository.ExtendStaticRepository;
import org.noear.solon.extend.staticfiles.repository.FileStaticRepository;

/**
 * @author noear
 */
@Component
public class InitPlugin implements Plugin {
    @Override
    public void start(SolonApp app) {
        //添加静态目录印射

        //1.添加扩展目录：${solon.extend}/static/
        StaticMappings.add("/", new ExtendStaticRepository());
        //2.添加本地绝对目录
        StaticMappings.add("/", new FileStaticRepository("/data/sss/water/water_ext/"));
        //3.添加资源路径
        StaticMappings.add("/", new ClassPathStaticRepository("user"));
    }
}
