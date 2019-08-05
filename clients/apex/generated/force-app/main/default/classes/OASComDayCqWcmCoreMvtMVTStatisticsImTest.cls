@isTest
private class OASComDayCqWcmCoreMvtMVTStatisticsImTest {
    @isTest
    private static void equalsSameInstance() {
        OASComDayCqWcmCoreMvtMVTStatisticsIm comDayCqWcmCoreMvtMVTStatisticsImplProperties1 = OASComDayCqWcmCoreMvtMVTStatisticsIm.getExample();
        OASComDayCqWcmCoreMvtMVTStatisticsIm comDayCqWcmCoreMvtMVTStatisticsImplProperties2 = comDayCqWcmCoreMvtMVTStatisticsImplProperties1;
        OASComDayCqWcmCoreMvtMVTStatisticsIm comDayCqWcmCoreMvtMVTStatisticsImplProperties3 = new OASComDayCqWcmCoreMvtMVTStatisticsIm();
        OASComDayCqWcmCoreMvtMVTStatisticsIm comDayCqWcmCoreMvtMVTStatisticsImplProperties4 = comDayCqWcmCoreMvtMVTStatisticsImplProperties3;

        System.assert(comDayCqWcmCoreMvtMVTStatisticsImplProperties1.equals(comDayCqWcmCoreMvtMVTStatisticsImplProperties2));
        System.assert(comDayCqWcmCoreMvtMVTStatisticsImplProperties2.equals(comDayCqWcmCoreMvtMVTStatisticsImplProperties1));
        System.assert(comDayCqWcmCoreMvtMVTStatisticsImplProperties1.equals(comDayCqWcmCoreMvtMVTStatisticsImplProperties1));
        System.assert(comDayCqWcmCoreMvtMVTStatisticsImplProperties3.equals(comDayCqWcmCoreMvtMVTStatisticsImplProperties4));
        System.assert(comDayCqWcmCoreMvtMVTStatisticsImplProperties4.equals(comDayCqWcmCoreMvtMVTStatisticsImplProperties3));
        System.assert(comDayCqWcmCoreMvtMVTStatisticsImplProperties3.equals(comDayCqWcmCoreMvtMVTStatisticsImplProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASComDayCqWcmCoreMvtMVTStatisticsIm comDayCqWcmCoreMvtMVTStatisticsImplProperties1 = OASComDayCqWcmCoreMvtMVTStatisticsIm.getExample();
        OASComDayCqWcmCoreMvtMVTStatisticsIm comDayCqWcmCoreMvtMVTStatisticsImplProperties2 = OASComDayCqWcmCoreMvtMVTStatisticsIm.getExample();
        OASComDayCqWcmCoreMvtMVTStatisticsIm comDayCqWcmCoreMvtMVTStatisticsImplProperties3 = new OASComDayCqWcmCoreMvtMVTStatisticsIm();
        OASComDayCqWcmCoreMvtMVTStatisticsIm comDayCqWcmCoreMvtMVTStatisticsImplProperties4 = new OASComDayCqWcmCoreMvtMVTStatisticsIm();

        System.assert(comDayCqWcmCoreMvtMVTStatisticsImplProperties1.equals(comDayCqWcmCoreMvtMVTStatisticsImplProperties2));
        System.assert(comDayCqWcmCoreMvtMVTStatisticsImplProperties2.equals(comDayCqWcmCoreMvtMVTStatisticsImplProperties1));
        System.assert(comDayCqWcmCoreMvtMVTStatisticsImplProperties3.equals(comDayCqWcmCoreMvtMVTStatisticsImplProperties4));
        System.assert(comDayCqWcmCoreMvtMVTStatisticsImplProperties4.equals(comDayCqWcmCoreMvtMVTStatisticsImplProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASComDayCqWcmCoreMvtMVTStatisticsIm comDayCqWcmCoreMvtMVTStatisticsImplProperties1 = OASComDayCqWcmCoreMvtMVTStatisticsIm.getExample();
        OASComDayCqWcmCoreMvtMVTStatisticsIm comDayCqWcmCoreMvtMVTStatisticsImplProperties2 = new OASComDayCqWcmCoreMvtMVTStatisticsIm();

        System.assertEquals(false, comDayCqWcmCoreMvtMVTStatisticsImplProperties1.equals('foo'));
        System.assertEquals(false, comDayCqWcmCoreMvtMVTStatisticsImplProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASComDayCqWcmCoreMvtMVTStatisticsIm comDayCqWcmCoreMvtMVTStatisticsImplProperties1 = OASComDayCqWcmCoreMvtMVTStatisticsIm.getExample();
        OASComDayCqWcmCoreMvtMVTStatisticsIm comDayCqWcmCoreMvtMVTStatisticsImplProperties2 = new OASComDayCqWcmCoreMvtMVTStatisticsIm();
        OASComDayCqWcmCoreMvtMVTStatisticsIm comDayCqWcmCoreMvtMVTStatisticsImplProperties3;

        System.assertEquals(false, comDayCqWcmCoreMvtMVTStatisticsImplProperties1.equals(comDayCqWcmCoreMvtMVTStatisticsImplProperties3));
        System.assertEquals(false, comDayCqWcmCoreMvtMVTStatisticsImplProperties2.equals(comDayCqWcmCoreMvtMVTStatisticsImplProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASComDayCqWcmCoreMvtMVTStatisticsIm comDayCqWcmCoreMvtMVTStatisticsImplProperties1 = OASComDayCqWcmCoreMvtMVTStatisticsIm.getExample();
        OASComDayCqWcmCoreMvtMVTStatisticsIm comDayCqWcmCoreMvtMVTStatisticsImplProperties2 = new OASComDayCqWcmCoreMvtMVTStatisticsIm();

        System.assertEquals(comDayCqWcmCoreMvtMVTStatisticsImplProperties1.hashCode(), comDayCqWcmCoreMvtMVTStatisticsImplProperties1.hashCode());
        System.assertEquals(comDayCqWcmCoreMvtMVTStatisticsImplProperties2.hashCode(), comDayCqWcmCoreMvtMVTStatisticsImplProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASComDayCqWcmCoreMvtMVTStatisticsIm comDayCqWcmCoreMvtMVTStatisticsImplProperties1 = OASComDayCqWcmCoreMvtMVTStatisticsIm.getExample();
        OASComDayCqWcmCoreMvtMVTStatisticsIm comDayCqWcmCoreMvtMVTStatisticsImplProperties2 = OASComDayCqWcmCoreMvtMVTStatisticsIm.getExample();
        OASComDayCqWcmCoreMvtMVTStatisticsIm comDayCqWcmCoreMvtMVTStatisticsImplProperties3 = new OASComDayCqWcmCoreMvtMVTStatisticsIm();
        OASComDayCqWcmCoreMvtMVTStatisticsIm comDayCqWcmCoreMvtMVTStatisticsImplProperties4 = new OASComDayCqWcmCoreMvtMVTStatisticsIm();

        System.assert(comDayCqWcmCoreMvtMVTStatisticsImplProperties1.equals(comDayCqWcmCoreMvtMVTStatisticsImplProperties2));
        System.assert(comDayCqWcmCoreMvtMVTStatisticsImplProperties3.equals(comDayCqWcmCoreMvtMVTStatisticsImplProperties4));
        System.assertEquals(comDayCqWcmCoreMvtMVTStatisticsImplProperties1.hashCode(), comDayCqWcmCoreMvtMVTStatisticsImplProperties2.hashCode());
        System.assertEquals(comDayCqWcmCoreMvtMVTStatisticsImplProperties3.hashCode(), comDayCqWcmCoreMvtMVTStatisticsImplProperties4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASComDayCqWcmCoreMvtMVTStatisticsIm comDayCqWcmCoreMvtMVTStatisticsImplProperties = new OASComDayCqWcmCoreMvtMVTStatisticsIm();
        Map<String, String> propertyMappings = comDayCqWcmCoreMvtMVTStatisticsImplProperties.getPropertyMappings();
        System.assertEquals('mvtstatisticsTrackingurl', propertyMappings.get('mvtstatistics.trackingurl'));
    }
}
