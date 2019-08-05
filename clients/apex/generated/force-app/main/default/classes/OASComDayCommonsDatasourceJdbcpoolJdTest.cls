@isTest
private class OASComDayCommonsDatasourceJdbcpoolJdTest {
    @isTest
    private static void equalsSameInstance() {
        OASComDayCommonsDatasourceJdbcpoolJd comDayCommonsDatasourceJdbcpoolJdbcPoolServiceProperties1 = OASComDayCommonsDatasourceJdbcpoolJd.getExample();
        OASComDayCommonsDatasourceJdbcpoolJd comDayCommonsDatasourceJdbcpoolJdbcPoolServiceProperties2 = comDayCommonsDatasourceJdbcpoolJdbcPoolServiceProperties1;
        OASComDayCommonsDatasourceJdbcpoolJd comDayCommonsDatasourceJdbcpoolJdbcPoolServiceProperties3 = new OASComDayCommonsDatasourceJdbcpoolJd();
        OASComDayCommonsDatasourceJdbcpoolJd comDayCommonsDatasourceJdbcpoolJdbcPoolServiceProperties4 = comDayCommonsDatasourceJdbcpoolJdbcPoolServiceProperties3;

        System.assert(comDayCommonsDatasourceJdbcpoolJdbcPoolServiceProperties1.equals(comDayCommonsDatasourceJdbcpoolJdbcPoolServiceProperties2));
        System.assert(comDayCommonsDatasourceJdbcpoolJdbcPoolServiceProperties2.equals(comDayCommonsDatasourceJdbcpoolJdbcPoolServiceProperties1));
        System.assert(comDayCommonsDatasourceJdbcpoolJdbcPoolServiceProperties1.equals(comDayCommonsDatasourceJdbcpoolJdbcPoolServiceProperties1));
        System.assert(comDayCommonsDatasourceJdbcpoolJdbcPoolServiceProperties3.equals(comDayCommonsDatasourceJdbcpoolJdbcPoolServiceProperties4));
        System.assert(comDayCommonsDatasourceJdbcpoolJdbcPoolServiceProperties4.equals(comDayCommonsDatasourceJdbcpoolJdbcPoolServiceProperties3));
        System.assert(comDayCommonsDatasourceJdbcpoolJdbcPoolServiceProperties3.equals(comDayCommonsDatasourceJdbcpoolJdbcPoolServiceProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASComDayCommonsDatasourceJdbcpoolJd comDayCommonsDatasourceJdbcpoolJdbcPoolServiceProperties1 = OASComDayCommonsDatasourceJdbcpoolJd.getExample();
        OASComDayCommonsDatasourceJdbcpoolJd comDayCommonsDatasourceJdbcpoolJdbcPoolServiceProperties2 = OASComDayCommonsDatasourceJdbcpoolJd.getExample();
        OASComDayCommonsDatasourceJdbcpoolJd comDayCommonsDatasourceJdbcpoolJdbcPoolServiceProperties3 = new OASComDayCommonsDatasourceJdbcpoolJd();
        OASComDayCommonsDatasourceJdbcpoolJd comDayCommonsDatasourceJdbcpoolJdbcPoolServiceProperties4 = new OASComDayCommonsDatasourceJdbcpoolJd();

        System.assert(comDayCommonsDatasourceJdbcpoolJdbcPoolServiceProperties1.equals(comDayCommonsDatasourceJdbcpoolJdbcPoolServiceProperties2));
        System.assert(comDayCommonsDatasourceJdbcpoolJdbcPoolServiceProperties2.equals(comDayCommonsDatasourceJdbcpoolJdbcPoolServiceProperties1));
        System.assert(comDayCommonsDatasourceJdbcpoolJdbcPoolServiceProperties3.equals(comDayCommonsDatasourceJdbcpoolJdbcPoolServiceProperties4));
        System.assert(comDayCommonsDatasourceJdbcpoolJdbcPoolServiceProperties4.equals(comDayCommonsDatasourceJdbcpoolJdbcPoolServiceProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASComDayCommonsDatasourceJdbcpoolJd comDayCommonsDatasourceJdbcpoolJdbcPoolServiceProperties1 = OASComDayCommonsDatasourceJdbcpoolJd.getExample();
        OASComDayCommonsDatasourceJdbcpoolJd comDayCommonsDatasourceJdbcpoolJdbcPoolServiceProperties2 = new OASComDayCommonsDatasourceJdbcpoolJd();

        System.assertEquals(false, comDayCommonsDatasourceJdbcpoolJdbcPoolServiceProperties1.equals('foo'));
        System.assertEquals(false, comDayCommonsDatasourceJdbcpoolJdbcPoolServiceProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASComDayCommonsDatasourceJdbcpoolJd comDayCommonsDatasourceJdbcpoolJdbcPoolServiceProperties1 = OASComDayCommonsDatasourceJdbcpoolJd.getExample();
        OASComDayCommonsDatasourceJdbcpoolJd comDayCommonsDatasourceJdbcpoolJdbcPoolServiceProperties2 = new OASComDayCommonsDatasourceJdbcpoolJd();
        OASComDayCommonsDatasourceJdbcpoolJd comDayCommonsDatasourceJdbcpoolJdbcPoolServiceProperties3;

        System.assertEquals(false, comDayCommonsDatasourceJdbcpoolJdbcPoolServiceProperties1.equals(comDayCommonsDatasourceJdbcpoolJdbcPoolServiceProperties3));
        System.assertEquals(false, comDayCommonsDatasourceJdbcpoolJdbcPoolServiceProperties2.equals(comDayCommonsDatasourceJdbcpoolJdbcPoolServiceProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASComDayCommonsDatasourceJdbcpoolJd comDayCommonsDatasourceJdbcpoolJdbcPoolServiceProperties1 = OASComDayCommonsDatasourceJdbcpoolJd.getExample();
        OASComDayCommonsDatasourceJdbcpoolJd comDayCommonsDatasourceJdbcpoolJdbcPoolServiceProperties2 = new OASComDayCommonsDatasourceJdbcpoolJd();

        System.assertEquals(comDayCommonsDatasourceJdbcpoolJdbcPoolServiceProperties1.hashCode(), comDayCommonsDatasourceJdbcpoolJdbcPoolServiceProperties1.hashCode());
        System.assertEquals(comDayCommonsDatasourceJdbcpoolJdbcPoolServiceProperties2.hashCode(), comDayCommonsDatasourceJdbcpoolJdbcPoolServiceProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASComDayCommonsDatasourceJdbcpoolJd comDayCommonsDatasourceJdbcpoolJdbcPoolServiceProperties1 = OASComDayCommonsDatasourceJdbcpoolJd.getExample();
        OASComDayCommonsDatasourceJdbcpoolJd comDayCommonsDatasourceJdbcpoolJdbcPoolServiceProperties2 = OASComDayCommonsDatasourceJdbcpoolJd.getExample();
        OASComDayCommonsDatasourceJdbcpoolJd comDayCommonsDatasourceJdbcpoolJdbcPoolServiceProperties3 = new OASComDayCommonsDatasourceJdbcpoolJd();
        OASComDayCommonsDatasourceJdbcpoolJd comDayCommonsDatasourceJdbcpoolJdbcPoolServiceProperties4 = new OASComDayCommonsDatasourceJdbcpoolJd();

        System.assert(comDayCommonsDatasourceJdbcpoolJdbcPoolServiceProperties1.equals(comDayCommonsDatasourceJdbcpoolJdbcPoolServiceProperties2));
        System.assert(comDayCommonsDatasourceJdbcpoolJdbcPoolServiceProperties3.equals(comDayCommonsDatasourceJdbcpoolJdbcPoolServiceProperties4));
        System.assertEquals(comDayCommonsDatasourceJdbcpoolJdbcPoolServiceProperties1.hashCode(), comDayCommonsDatasourceJdbcpoolJdbcPoolServiceProperties2.hashCode());
        System.assertEquals(comDayCommonsDatasourceJdbcpoolJdbcPoolServiceProperties3.hashCode(), comDayCommonsDatasourceJdbcpoolJdbcPoolServiceProperties4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASComDayCommonsDatasourceJdbcpoolJd comDayCommonsDatasourceJdbcpoolJdbcPoolServiceProperties = new OASComDayCommonsDatasourceJdbcpoolJd();
        Map<String, String> propertyMappings = comDayCommonsDatasourceJdbcpoolJdbcPoolServiceProperties.getPropertyMappings();
        System.assertEquals('jdbcDriverClass', propertyMappings.get('jdbc.driver.class'));
        System.assertEquals('jdbcConnectionUri', propertyMappings.get('jdbc.connection.uri'));
        System.assertEquals('jdbcUsername', propertyMappings.get('jdbc.username'));
        System.assertEquals('jdbcPassword', propertyMappings.get('jdbc.password'));
        System.assertEquals('jdbcValidationQuery', propertyMappings.get('jdbc.validation.query'));
        System.assertEquals('defaultReadonly', propertyMappings.get('default.readonly'));
        System.assertEquals('defaultAutocommit', propertyMappings.get('default.autocommit'));
        System.assertEquals('poolSize', propertyMappings.get('pool.size'));
        System.assertEquals('poolMaxWaitMsec', propertyMappings.get('pool.max.wait.msec'));
        System.assertEquals('datasourceName', propertyMappings.get('datasource.name'));
        System.assertEquals('datasourceSvcProperties', propertyMappings.get('datasource.svc.properties'));
    }
}
