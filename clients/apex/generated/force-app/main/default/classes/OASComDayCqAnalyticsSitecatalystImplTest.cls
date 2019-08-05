@isTest
private class OASComDayCqAnalyticsSitecatalystImplTest {
    @isTest
    private static void equalsSameInstance() {
        OASComDayCqAnalyticsSitecatalystImpl comDayCqAnalyticsSitecatalystImplSitecatalystHttpClientImplProperties1 = OASComDayCqAnalyticsSitecatalystImpl.getExample();
        OASComDayCqAnalyticsSitecatalystImpl comDayCqAnalyticsSitecatalystImplSitecatalystHttpClientImplProperties2 = comDayCqAnalyticsSitecatalystImplSitecatalystHttpClientImplProperties1;
        OASComDayCqAnalyticsSitecatalystImpl comDayCqAnalyticsSitecatalystImplSitecatalystHttpClientImplProperties3 = new OASComDayCqAnalyticsSitecatalystImpl();
        OASComDayCqAnalyticsSitecatalystImpl comDayCqAnalyticsSitecatalystImplSitecatalystHttpClientImplProperties4 = comDayCqAnalyticsSitecatalystImplSitecatalystHttpClientImplProperties3;

        System.assert(comDayCqAnalyticsSitecatalystImplSitecatalystHttpClientImplProperties1.equals(comDayCqAnalyticsSitecatalystImplSitecatalystHttpClientImplProperties2));
        System.assert(comDayCqAnalyticsSitecatalystImplSitecatalystHttpClientImplProperties2.equals(comDayCqAnalyticsSitecatalystImplSitecatalystHttpClientImplProperties1));
        System.assert(comDayCqAnalyticsSitecatalystImplSitecatalystHttpClientImplProperties1.equals(comDayCqAnalyticsSitecatalystImplSitecatalystHttpClientImplProperties1));
        System.assert(comDayCqAnalyticsSitecatalystImplSitecatalystHttpClientImplProperties3.equals(comDayCqAnalyticsSitecatalystImplSitecatalystHttpClientImplProperties4));
        System.assert(comDayCqAnalyticsSitecatalystImplSitecatalystHttpClientImplProperties4.equals(comDayCqAnalyticsSitecatalystImplSitecatalystHttpClientImplProperties3));
        System.assert(comDayCqAnalyticsSitecatalystImplSitecatalystHttpClientImplProperties3.equals(comDayCqAnalyticsSitecatalystImplSitecatalystHttpClientImplProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASComDayCqAnalyticsSitecatalystImpl comDayCqAnalyticsSitecatalystImplSitecatalystHttpClientImplProperties1 = OASComDayCqAnalyticsSitecatalystImpl.getExample();
        OASComDayCqAnalyticsSitecatalystImpl comDayCqAnalyticsSitecatalystImplSitecatalystHttpClientImplProperties2 = OASComDayCqAnalyticsSitecatalystImpl.getExample();
        OASComDayCqAnalyticsSitecatalystImpl comDayCqAnalyticsSitecatalystImplSitecatalystHttpClientImplProperties3 = new OASComDayCqAnalyticsSitecatalystImpl();
        OASComDayCqAnalyticsSitecatalystImpl comDayCqAnalyticsSitecatalystImplSitecatalystHttpClientImplProperties4 = new OASComDayCqAnalyticsSitecatalystImpl();

        System.assert(comDayCqAnalyticsSitecatalystImplSitecatalystHttpClientImplProperties1.equals(comDayCqAnalyticsSitecatalystImplSitecatalystHttpClientImplProperties2));
        System.assert(comDayCqAnalyticsSitecatalystImplSitecatalystHttpClientImplProperties2.equals(comDayCqAnalyticsSitecatalystImplSitecatalystHttpClientImplProperties1));
        System.assert(comDayCqAnalyticsSitecatalystImplSitecatalystHttpClientImplProperties3.equals(comDayCqAnalyticsSitecatalystImplSitecatalystHttpClientImplProperties4));
        System.assert(comDayCqAnalyticsSitecatalystImplSitecatalystHttpClientImplProperties4.equals(comDayCqAnalyticsSitecatalystImplSitecatalystHttpClientImplProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASComDayCqAnalyticsSitecatalystImpl comDayCqAnalyticsSitecatalystImplSitecatalystHttpClientImplProperties1 = OASComDayCqAnalyticsSitecatalystImpl.getExample();
        OASComDayCqAnalyticsSitecatalystImpl comDayCqAnalyticsSitecatalystImplSitecatalystHttpClientImplProperties2 = new OASComDayCqAnalyticsSitecatalystImpl();

        System.assertEquals(false, comDayCqAnalyticsSitecatalystImplSitecatalystHttpClientImplProperties1.equals('foo'));
        System.assertEquals(false, comDayCqAnalyticsSitecatalystImplSitecatalystHttpClientImplProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASComDayCqAnalyticsSitecatalystImpl comDayCqAnalyticsSitecatalystImplSitecatalystHttpClientImplProperties1 = OASComDayCqAnalyticsSitecatalystImpl.getExample();
        OASComDayCqAnalyticsSitecatalystImpl comDayCqAnalyticsSitecatalystImplSitecatalystHttpClientImplProperties2 = new OASComDayCqAnalyticsSitecatalystImpl();
        OASComDayCqAnalyticsSitecatalystImpl comDayCqAnalyticsSitecatalystImplSitecatalystHttpClientImplProperties3;

        System.assertEquals(false, comDayCqAnalyticsSitecatalystImplSitecatalystHttpClientImplProperties1.equals(comDayCqAnalyticsSitecatalystImplSitecatalystHttpClientImplProperties3));
        System.assertEquals(false, comDayCqAnalyticsSitecatalystImplSitecatalystHttpClientImplProperties2.equals(comDayCqAnalyticsSitecatalystImplSitecatalystHttpClientImplProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASComDayCqAnalyticsSitecatalystImpl comDayCqAnalyticsSitecatalystImplSitecatalystHttpClientImplProperties1 = OASComDayCqAnalyticsSitecatalystImpl.getExample();
        OASComDayCqAnalyticsSitecatalystImpl comDayCqAnalyticsSitecatalystImplSitecatalystHttpClientImplProperties2 = new OASComDayCqAnalyticsSitecatalystImpl();

        System.assertEquals(comDayCqAnalyticsSitecatalystImplSitecatalystHttpClientImplProperties1.hashCode(), comDayCqAnalyticsSitecatalystImplSitecatalystHttpClientImplProperties1.hashCode());
        System.assertEquals(comDayCqAnalyticsSitecatalystImplSitecatalystHttpClientImplProperties2.hashCode(), comDayCqAnalyticsSitecatalystImplSitecatalystHttpClientImplProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASComDayCqAnalyticsSitecatalystImpl comDayCqAnalyticsSitecatalystImplSitecatalystHttpClientImplProperties1 = OASComDayCqAnalyticsSitecatalystImpl.getExample();
        OASComDayCqAnalyticsSitecatalystImpl comDayCqAnalyticsSitecatalystImplSitecatalystHttpClientImplProperties2 = OASComDayCqAnalyticsSitecatalystImpl.getExample();
        OASComDayCqAnalyticsSitecatalystImpl comDayCqAnalyticsSitecatalystImplSitecatalystHttpClientImplProperties3 = new OASComDayCqAnalyticsSitecatalystImpl();
        OASComDayCqAnalyticsSitecatalystImpl comDayCqAnalyticsSitecatalystImplSitecatalystHttpClientImplProperties4 = new OASComDayCqAnalyticsSitecatalystImpl();

        System.assert(comDayCqAnalyticsSitecatalystImplSitecatalystHttpClientImplProperties1.equals(comDayCqAnalyticsSitecatalystImplSitecatalystHttpClientImplProperties2));
        System.assert(comDayCqAnalyticsSitecatalystImplSitecatalystHttpClientImplProperties3.equals(comDayCqAnalyticsSitecatalystImplSitecatalystHttpClientImplProperties4));
        System.assertEquals(comDayCqAnalyticsSitecatalystImplSitecatalystHttpClientImplProperties1.hashCode(), comDayCqAnalyticsSitecatalystImplSitecatalystHttpClientImplProperties2.hashCode());
        System.assertEquals(comDayCqAnalyticsSitecatalystImplSitecatalystHttpClientImplProperties3.hashCode(), comDayCqAnalyticsSitecatalystImplSitecatalystHttpClientImplProperties4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASComDayCqAnalyticsSitecatalystImpl comDayCqAnalyticsSitecatalystImplSitecatalystHttpClientImplProperties = new OASComDayCqAnalyticsSitecatalystImpl();
        Map<String, String> propertyMappings = comDayCqAnalyticsSitecatalystImplSitecatalystHttpClientImplProperties.getPropertyMappings();
        System.assertEquals('cqAnalyticsSitecatalystServiceDatacenterUrl', propertyMappings.get('cq.analytics.sitecatalyst.service.datacenter.url'));
        System.assertEquals('connectionTimeout', propertyMappings.get('connection.timeout'));
        System.assertEquals('socketTimeout', propertyMappings.get('socket.timeout'));
    }
}
