@isTest
private class OASAnalyticsComponentQueryCacheServiTest {
    @isTest
    private static void equalsSameInstance() {
        OASAnalyticsComponentQueryCacheServi analyticsComponentQueryCacheServiceProperties1 = OASAnalyticsComponentQueryCacheServi.getExample();
        OASAnalyticsComponentQueryCacheServi analyticsComponentQueryCacheServiceProperties2 = analyticsComponentQueryCacheServiceProperties1;
        OASAnalyticsComponentQueryCacheServi analyticsComponentQueryCacheServiceProperties3 = new OASAnalyticsComponentQueryCacheServi();
        OASAnalyticsComponentQueryCacheServi analyticsComponentQueryCacheServiceProperties4 = analyticsComponentQueryCacheServiceProperties3;

        System.assert(analyticsComponentQueryCacheServiceProperties1.equals(analyticsComponentQueryCacheServiceProperties2));
        System.assert(analyticsComponentQueryCacheServiceProperties2.equals(analyticsComponentQueryCacheServiceProperties1));
        System.assert(analyticsComponentQueryCacheServiceProperties1.equals(analyticsComponentQueryCacheServiceProperties1));
        System.assert(analyticsComponentQueryCacheServiceProperties3.equals(analyticsComponentQueryCacheServiceProperties4));
        System.assert(analyticsComponentQueryCacheServiceProperties4.equals(analyticsComponentQueryCacheServiceProperties3));
        System.assert(analyticsComponentQueryCacheServiceProperties3.equals(analyticsComponentQueryCacheServiceProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASAnalyticsComponentQueryCacheServi analyticsComponentQueryCacheServiceProperties1 = OASAnalyticsComponentQueryCacheServi.getExample();
        OASAnalyticsComponentQueryCacheServi analyticsComponentQueryCacheServiceProperties2 = OASAnalyticsComponentQueryCacheServi.getExample();
        OASAnalyticsComponentQueryCacheServi analyticsComponentQueryCacheServiceProperties3 = new OASAnalyticsComponentQueryCacheServi();
        OASAnalyticsComponentQueryCacheServi analyticsComponentQueryCacheServiceProperties4 = new OASAnalyticsComponentQueryCacheServi();

        System.assert(analyticsComponentQueryCacheServiceProperties1.equals(analyticsComponentQueryCacheServiceProperties2));
        System.assert(analyticsComponentQueryCacheServiceProperties2.equals(analyticsComponentQueryCacheServiceProperties1));
        System.assert(analyticsComponentQueryCacheServiceProperties3.equals(analyticsComponentQueryCacheServiceProperties4));
        System.assert(analyticsComponentQueryCacheServiceProperties4.equals(analyticsComponentQueryCacheServiceProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASAnalyticsComponentQueryCacheServi analyticsComponentQueryCacheServiceProperties1 = OASAnalyticsComponentQueryCacheServi.getExample();
        OASAnalyticsComponentQueryCacheServi analyticsComponentQueryCacheServiceProperties2 = new OASAnalyticsComponentQueryCacheServi();

        System.assertEquals(false, analyticsComponentQueryCacheServiceProperties1.equals('foo'));
        System.assertEquals(false, analyticsComponentQueryCacheServiceProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASAnalyticsComponentQueryCacheServi analyticsComponentQueryCacheServiceProperties1 = OASAnalyticsComponentQueryCacheServi.getExample();
        OASAnalyticsComponentQueryCacheServi analyticsComponentQueryCacheServiceProperties2 = new OASAnalyticsComponentQueryCacheServi();
        OASAnalyticsComponentQueryCacheServi analyticsComponentQueryCacheServiceProperties3;

        System.assertEquals(false, analyticsComponentQueryCacheServiceProperties1.equals(analyticsComponentQueryCacheServiceProperties3));
        System.assertEquals(false, analyticsComponentQueryCacheServiceProperties2.equals(analyticsComponentQueryCacheServiceProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASAnalyticsComponentQueryCacheServi analyticsComponentQueryCacheServiceProperties1 = OASAnalyticsComponentQueryCacheServi.getExample();
        OASAnalyticsComponentQueryCacheServi analyticsComponentQueryCacheServiceProperties2 = new OASAnalyticsComponentQueryCacheServi();

        System.assertEquals(analyticsComponentQueryCacheServiceProperties1.hashCode(), analyticsComponentQueryCacheServiceProperties1.hashCode());
        System.assertEquals(analyticsComponentQueryCacheServiceProperties2.hashCode(), analyticsComponentQueryCacheServiceProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASAnalyticsComponentQueryCacheServi analyticsComponentQueryCacheServiceProperties1 = OASAnalyticsComponentQueryCacheServi.getExample();
        OASAnalyticsComponentQueryCacheServi analyticsComponentQueryCacheServiceProperties2 = OASAnalyticsComponentQueryCacheServi.getExample();
        OASAnalyticsComponentQueryCacheServi analyticsComponentQueryCacheServiceProperties3 = new OASAnalyticsComponentQueryCacheServi();
        OASAnalyticsComponentQueryCacheServi analyticsComponentQueryCacheServiceProperties4 = new OASAnalyticsComponentQueryCacheServi();

        System.assert(analyticsComponentQueryCacheServiceProperties1.equals(analyticsComponentQueryCacheServiceProperties2));
        System.assert(analyticsComponentQueryCacheServiceProperties3.equals(analyticsComponentQueryCacheServiceProperties4));
        System.assertEquals(analyticsComponentQueryCacheServiceProperties1.hashCode(), analyticsComponentQueryCacheServiceProperties2.hashCode());
        System.assertEquals(analyticsComponentQueryCacheServiceProperties3.hashCode(), analyticsComponentQueryCacheServiceProperties4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASAnalyticsComponentQueryCacheServi analyticsComponentQueryCacheServiceProperties = new OASAnalyticsComponentQueryCacheServi();
        Map<String, String> propertyMappings = analyticsComponentQueryCacheServiceProperties.getPropertyMappings();
        System.assertEquals('cqAnalyticsComponentQueryCacheSize', propertyMappings.get('cq.analytics.component.query.cache.size'));
    }
}
