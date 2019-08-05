@isTest
private class OASComDayCqWcmCoreStatsPageViewStatiTest {
    @isTest
    private static void equalsSameInstance() {
        OASComDayCqWcmCoreStatsPageViewStati comDayCqWcmCoreStatsPageViewStatisticsImplProperties1 = OASComDayCqWcmCoreStatsPageViewStati.getExample();
        OASComDayCqWcmCoreStatsPageViewStati comDayCqWcmCoreStatsPageViewStatisticsImplProperties2 = comDayCqWcmCoreStatsPageViewStatisticsImplProperties1;
        OASComDayCqWcmCoreStatsPageViewStati comDayCqWcmCoreStatsPageViewStatisticsImplProperties3 = new OASComDayCqWcmCoreStatsPageViewStati();
        OASComDayCqWcmCoreStatsPageViewStati comDayCqWcmCoreStatsPageViewStatisticsImplProperties4 = comDayCqWcmCoreStatsPageViewStatisticsImplProperties3;

        System.assert(comDayCqWcmCoreStatsPageViewStatisticsImplProperties1.equals(comDayCqWcmCoreStatsPageViewStatisticsImplProperties2));
        System.assert(comDayCqWcmCoreStatsPageViewStatisticsImplProperties2.equals(comDayCqWcmCoreStatsPageViewStatisticsImplProperties1));
        System.assert(comDayCqWcmCoreStatsPageViewStatisticsImplProperties1.equals(comDayCqWcmCoreStatsPageViewStatisticsImplProperties1));
        System.assert(comDayCqWcmCoreStatsPageViewStatisticsImplProperties3.equals(comDayCqWcmCoreStatsPageViewStatisticsImplProperties4));
        System.assert(comDayCqWcmCoreStatsPageViewStatisticsImplProperties4.equals(comDayCqWcmCoreStatsPageViewStatisticsImplProperties3));
        System.assert(comDayCqWcmCoreStatsPageViewStatisticsImplProperties3.equals(comDayCqWcmCoreStatsPageViewStatisticsImplProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASComDayCqWcmCoreStatsPageViewStati comDayCqWcmCoreStatsPageViewStatisticsImplProperties1 = OASComDayCqWcmCoreStatsPageViewStati.getExample();
        OASComDayCqWcmCoreStatsPageViewStati comDayCqWcmCoreStatsPageViewStatisticsImplProperties2 = OASComDayCqWcmCoreStatsPageViewStati.getExample();
        OASComDayCqWcmCoreStatsPageViewStati comDayCqWcmCoreStatsPageViewStatisticsImplProperties3 = new OASComDayCqWcmCoreStatsPageViewStati();
        OASComDayCqWcmCoreStatsPageViewStati comDayCqWcmCoreStatsPageViewStatisticsImplProperties4 = new OASComDayCqWcmCoreStatsPageViewStati();

        System.assert(comDayCqWcmCoreStatsPageViewStatisticsImplProperties1.equals(comDayCqWcmCoreStatsPageViewStatisticsImplProperties2));
        System.assert(comDayCqWcmCoreStatsPageViewStatisticsImplProperties2.equals(comDayCqWcmCoreStatsPageViewStatisticsImplProperties1));
        System.assert(comDayCqWcmCoreStatsPageViewStatisticsImplProperties3.equals(comDayCqWcmCoreStatsPageViewStatisticsImplProperties4));
        System.assert(comDayCqWcmCoreStatsPageViewStatisticsImplProperties4.equals(comDayCqWcmCoreStatsPageViewStatisticsImplProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASComDayCqWcmCoreStatsPageViewStati comDayCqWcmCoreStatsPageViewStatisticsImplProperties1 = OASComDayCqWcmCoreStatsPageViewStati.getExample();
        OASComDayCqWcmCoreStatsPageViewStati comDayCqWcmCoreStatsPageViewStatisticsImplProperties2 = new OASComDayCqWcmCoreStatsPageViewStati();

        System.assertEquals(false, comDayCqWcmCoreStatsPageViewStatisticsImplProperties1.equals('foo'));
        System.assertEquals(false, comDayCqWcmCoreStatsPageViewStatisticsImplProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASComDayCqWcmCoreStatsPageViewStati comDayCqWcmCoreStatsPageViewStatisticsImplProperties1 = OASComDayCqWcmCoreStatsPageViewStati.getExample();
        OASComDayCqWcmCoreStatsPageViewStati comDayCqWcmCoreStatsPageViewStatisticsImplProperties2 = new OASComDayCqWcmCoreStatsPageViewStati();
        OASComDayCqWcmCoreStatsPageViewStati comDayCqWcmCoreStatsPageViewStatisticsImplProperties3;

        System.assertEquals(false, comDayCqWcmCoreStatsPageViewStatisticsImplProperties1.equals(comDayCqWcmCoreStatsPageViewStatisticsImplProperties3));
        System.assertEquals(false, comDayCqWcmCoreStatsPageViewStatisticsImplProperties2.equals(comDayCqWcmCoreStatsPageViewStatisticsImplProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASComDayCqWcmCoreStatsPageViewStati comDayCqWcmCoreStatsPageViewStatisticsImplProperties1 = OASComDayCqWcmCoreStatsPageViewStati.getExample();
        OASComDayCqWcmCoreStatsPageViewStati comDayCqWcmCoreStatsPageViewStatisticsImplProperties2 = new OASComDayCqWcmCoreStatsPageViewStati();

        System.assertEquals(comDayCqWcmCoreStatsPageViewStatisticsImplProperties1.hashCode(), comDayCqWcmCoreStatsPageViewStatisticsImplProperties1.hashCode());
        System.assertEquals(comDayCqWcmCoreStatsPageViewStatisticsImplProperties2.hashCode(), comDayCqWcmCoreStatsPageViewStatisticsImplProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASComDayCqWcmCoreStatsPageViewStati comDayCqWcmCoreStatsPageViewStatisticsImplProperties1 = OASComDayCqWcmCoreStatsPageViewStati.getExample();
        OASComDayCqWcmCoreStatsPageViewStati comDayCqWcmCoreStatsPageViewStatisticsImplProperties2 = OASComDayCqWcmCoreStatsPageViewStati.getExample();
        OASComDayCqWcmCoreStatsPageViewStati comDayCqWcmCoreStatsPageViewStatisticsImplProperties3 = new OASComDayCqWcmCoreStatsPageViewStati();
        OASComDayCqWcmCoreStatsPageViewStati comDayCqWcmCoreStatsPageViewStatisticsImplProperties4 = new OASComDayCqWcmCoreStatsPageViewStati();

        System.assert(comDayCqWcmCoreStatsPageViewStatisticsImplProperties1.equals(comDayCqWcmCoreStatsPageViewStatisticsImplProperties2));
        System.assert(comDayCqWcmCoreStatsPageViewStatisticsImplProperties3.equals(comDayCqWcmCoreStatsPageViewStatisticsImplProperties4));
        System.assertEquals(comDayCqWcmCoreStatsPageViewStatisticsImplProperties1.hashCode(), comDayCqWcmCoreStatsPageViewStatisticsImplProperties2.hashCode());
        System.assertEquals(comDayCqWcmCoreStatsPageViewStatisticsImplProperties3.hashCode(), comDayCqWcmCoreStatsPageViewStatisticsImplProperties4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASComDayCqWcmCoreStatsPageViewStati comDayCqWcmCoreStatsPageViewStatisticsImplProperties = new OASComDayCqWcmCoreStatsPageViewStati();
        Map<String, String> propertyMappings = comDayCqWcmCoreStatsPageViewStatisticsImplProperties.getPropertyMappings();
        System.assertEquals('pageviewstatisticsTrackingurl', propertyMappings.get('pageviewstatistics.trackingurl'));
        System.assertEquals('pageviewstatisticsTrackingscriptEnabled', propertyMappings.get('pageviewstatistics.trackingscript.enabled'));
    }
}
