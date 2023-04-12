package cn.sen.middleware.db.router.dynamic;

import cn.sen.middleware.db.router.DBContextHolder;
import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;

/**
 * 动态数据源获取，每当切换数据源，都要从这个里面进行获取
 * @Author caosen
 * @Date 2023/3/31 22:10
 */
public class DynamicDataSource extends AbstractRoutingDataSource {

    @Override
    protected Object determineCurrentLookupKey() {
        return "db" + DBContextHolder.getDBKey();
    }

}