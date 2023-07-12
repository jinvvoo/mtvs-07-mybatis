package com.ohgiraffers.section01.xml;

import java.util.List;
import java.util.Map;

public interface DynamicSqlMapper {

    List<MenuDTO> findMenuByPrice(Map<String, String> map);

}
