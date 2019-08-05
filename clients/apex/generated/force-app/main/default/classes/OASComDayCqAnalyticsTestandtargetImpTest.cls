@isTest
private class OASComDayCqAnalyticsTestandtargetImpTest {
    @isTest
    private static void equalsSameInstance() {
        OASComDayCqAnalyticsTestandtargetImp comDayCqAnalyticsTestandtargetImplTestandtargetHttpClientImplProperties1 = OASComDayCqAnalyticsTestandtargetImp.getExample();
        OASComDayCqAnalyticsTestandtargetImp comDayCqAnalyticsTestandtargetImplTestandtargetHttpClientImplProperties2 = comDayCqAnalyticsTestandtargetImplTestandtargetHttpClientImplProperties1;
        OASComDayCqAnalyticsTestandtargetImp comDayCqAnalyticsTestandtargetImplTestandtargetHttpClientImplProperties3 = new OASComDayCqAnalyticsTestandtargetImp();
        OASComDayCqAnalyticsTestandtargetImp comDayCqAnalyticsTestandtargetImplTestandtargetHttpClientImplProperties4 = comDayCqAnalyticsTestandtargetImplTestandtargetHttpClientImplProperties3;

        System.assert(comDayCqAnalyticsTestandtargetImplTestandtargetHttpClientImplProperties1.equals(comDayCqAnalyticsTestandtargetImplTestandtargetHttpClientImplProperties2));
        System.assert(comDayCqAnalyticsTestandtargetImplTestandtargetHttpClientImplProperties2.equals(comDayCqAnalyticsTestandtargetImplTestandtargetHttpClientImplProperties1));
        System.assert(comDayCqAnalyticsTestandtargetImplTestandtargetHttpClientImplProperties1.equals(comDayCqAnalyticsTestandtargetImplTestandtargetHttpClientImplProperties1));
        System.assert(comDayCqAnalyticsTestandtargetImplTestandtargetHttpClientImplProperties3.equals(comDayCqAnalyticsTestandtargetImplTestandtargetHttpClientImplProperties4));
        System.assert(comDayCqAnalyticsTestandtargetImplTestandtargetHttpClientImplProperties4.equals(comDayCqAnalyticsTestandtargetImplTestandtargetHttpClientImplProperties3));
        System.assert(comDayCqAnalyticsTestandtargetImplTestandtargetHttpClientImplProperties3.equals(comDayCqAnalyticsTestandtargetImplTestandtargetHttpClientImplProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASComDayCqAnalyticsTestandtargetImp comDayCqAnalyticsTestandtargetImplTestandtargetHttpClientImplProperties1 = OASComDayCqAnalyticsTestandtargetImp.getExample();
        OASComDayCqAnalyticsTestandtargetImp comDayCqAnalyticsTestandtargetImplTestandtargetHttpClientImplProperties2 = OASComDayCqAnalyticsTestandtargetImp.getExample();
        OASComDayCqAnalyticsTestandtargetImp comDayCqAnalyticsTestandtargetImplTestandtargetHttpClientImplProperties3 = new OASComDayCqAnalyticsTestandtargetImp();
        OASComDayCqAnalyticsTestandtargetImp comDayCqAnalyticsTestandtargetImplTestandtargetHttpClientImplProperties4 = new OASComDayCqAnalyticsTestandtargetImp();

        System.assert(comDayCqAnalyticsTestandtargetImplTestandtargetHttpClientImplProperties1.equals(comDayCqAnalyticsTestandtargetImplTestandtargetHttpClientImplProperties2));
        System.assert(comDayCqAnalyticsTestandtargetImplTestandtargetHttpClientImplProperties2.equals(comDayCqAnalyticsTestandtargetImplTestandtargetHttpClientImplProperties1));
        System.assert(comDayCqAnalyticsTestandtargetImplTestandtargetHttpClientImplProperties3.equals(comDayCqAnalyticsTestandtargetImplTestandtargetHttpClientImplProperties4));
        System.assert(comDayCqAnalyticsTestandtargetImplTestandtargetHttpClientImplProperties4.equals(comDayCqAnalyticsTestandtargetImplTestandtargetHttpClientImplProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASComDayCqAnalyticsTestandtargetImp comDayCqAnalyticsTestandtargetImplTestandtargetHttpClientImplProperties1 = OASComDayCqAnalyticsTestandtargetImp.getExample();
        OASComDayCqAnalyticsTestandtargetImp comDayCqAnalyticsTestandtargetImplTestandtargetHttpClientImplProperties2 = new OASComDayCqAnalyticsTestandtargetImp();

        System.assertEquals(false, comDayCqAnalyticsTestandtargetImplTestandtargetHttpClientImplProperties1.equals('foo'));
        System.assertEquals(false, comDayCqAnalyticsTestandtargetImplTestandtargetHttpClientImplProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASComDayCqAnalyticsTestandtargetImp comDayCqAnalyticsTestandtargetImplTestandtargetHttpClientImplProperties1 = OASComDayCqAnalyticsTestandtargetImp.getExample();
        OASComDayCqAnalyticsTestandtargetImp comDayCqAnalyticsTestandtargetImplTestandtargetHttpClientImplProperties2 = new OASComDayCqAnalyticsTestandtargetImp();
        OASComDayCqAnalyticsTestandtargetImp comDayCqAnalyticsTestandtargetImplTestandtargetHttpClientImplProperties3;

        System.assertEquals(false, comDayCqAnalyticsTestandtargetImplTestandtargetHttpClientImplProperties1.equals(comDayCqAnalyticsTestandtargetImplTestandtargetHttpClientImplProperties3));
        System.assertEquals(false, comDayCqAnalyticsTestandtargetImplTestandtargetHttpClientImplProperties2.equals(comDayCqAnalyticsTestandtargetImplTestandtargetHttpClientImplProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASComDayCqAnalyticsTestandtargetImp comDayCqAnalyticsTestandtargetImplTestandtargetHttpClientImplProperties1 = OASComDayCqAnalyticsTestandtargetImp.getExample();
        OASComDayCqAnalyticsTestandtargetImp comDayCqAnalyticsTestandtargetImplTestandtargetHttpClientImplProperties2 = new OASComDayCqAnalyticsTestandtargetImp();

        System.assertEquals(comDayCqAnalyticsTestandtargetImplTestandtargetHttpClientImplProperties1.hashCode(), comDayCqAnalyticsTestandtargetImplTestandtargetHttpClientImplProperties1.hashCode());
        System.assertEquals(comDayCqAnalyticsTestandtargetImplTestandtargetHttpClientImplProperties2.hashCode(), comDayCqAnalyticsTestandtargetImplTestandtargetHttpClientImplProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASComDayCqAnalyticsTestandtargetImp comDayCqAnalyticsTestandtargetImplTestandtargetHttpClientImplProperties1 = OASComDayCqAnalyticsTestandtargetImp.getExample();
        OASComDayCqAnalyticsTestandtargetImp comDayCqAnalyticsTestandtargetImplTestandtargetHttpClientImplProperties2 = OASComDayCqAnalyticsTestandtargetImp.getExample();
        OASComDayCqAnalyticsTestandtargetImp comDayCqAnalyticsTestandtargetImplTestandtargetHttpClientImplProperties3 = new OASComDayCqAnalyticsTestandtargetImp();
        OASComDayCqAnalyticsTestandtargetImp comDayCqAnalyticsTestandtargetImplTestandtargetHttpClientImplProperties4 = new OASComDayCqAnalyticsTestandtargetImp();

        System.assert(comDayCqAnalyticsTestandtargetImplTestandtargetHttpClientImplProperties1.equals(comDayCqAnalyticsTestandtargetImplTestandtargetHttpClientImplProperties2));
        System.assert(comDayCqAnalyticsTestandtargetImplTestandtargetHttpClientImplProperties3.equals(comDayCqAnalyticsTestandtargetImplTestandtargetHttpClientImplProperties4));
        System.assertEquals(comDayCqAnalyticsTestandtargetImplTestandtargetHttpClientImplProperties1.hashCode(), comDayCqAnalyticsTestandtargetImplTestandtargetHttpClientImplProperties2.hashCode());
        System.assertEquals(comDayCqAnalyticsTestandtargetImplTestandtargetHttpClientImplProperties3.hashCode(), comDayCqAnalyticsTestandtargetImplTestandtargetHttpClientImplProperties4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASComDayCqAnalyticsTestandtargetImp comDayCqAnalyticsTestandtargetImplTestandtargetHttpClientImplProperties = new OASComDayCqAnalyticsTestandtargetImp();
        Map<String, String> propertyMappings = comDayCqAnalyticsTestandtargetImplTestandtargetHttpClientImplProperties.getPropertyMappings();
        System.assertEquals('cqAnalyticsTestandtargetApiUrl', propertyMappings.get('cq.analytics.testandtarget.api.url'));
        System.assertEquals('cqAnalyticsTestandtargetTimeout', propertyMappings.get('cq.analytics.testandtarget.timeout'));
        System.assertEquals('cqAnalyticsTestandtargetSockettimeout', propertyMappings.get('cq.analytics.testandtarget.sockettimeout'));
        System.assertEquals('cqAnalyticsTestandtargetRecommendationsUrlReplace', propertyMappings.get('cq.analytics.testandtarget.recommendations.url.replace'));
        System.assertEquals('cqAnalyticsTestandtargetRecommendationsUrlReplacewith', propertyMappings.get('cq.analytics.testandtarget.recommendations.url.replacewith'));
    }
}
