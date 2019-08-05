@isTest
private class OASComDayCqWcmCoreWCMRequestFilterInTest {
    @isTest
    private static void equalsSameInstance() {
        OASComDayCqWcmCoreWCMRequestFilterIn comDayCqWcmCoreWCMRequestFilterInfo1 = OASComDayCqWcmCoreWCMRequestFilterIn.getExample();
        OASComDayCqWcmCoreWCMRequestFilterIn comDayCqWcmCoreWCMRequestFilterInfo2 = comDayCqWcmCoreWCMRequestFilterInfo1;
        OASComDayCqWcmCoreWCMRequestFilterIn comDayCqWcmCoreWCMRequestFilterInfo3 = new OASComDayCqWcmCoreWCMRequestFilterIn();
        OASComDayCqWcmCoreWCMRequestFilterIn comDayCqWcmCoreWCMRequestFilterInfo4 = comDayCqWcmCoreWCMRequestFilterInfo3;

        System.assert(comDayCqWcmCoreWCMRequestFilterInfo1.equals(comDayCqWcmCoreWCMRequestFilterInfo2));
        System.assert(comDayCqWcmCoreWCMRequestFilterInfo2.equals(comDayCqWcmCoreWCMRequestFilterInfo1));
        System.assert(comDayCqWcmCoreWCMRequestFilterInfo1.equals(comDayCqWcmCoreWCMRequestFilterInfo1));
        System.assert(comDayCqWcmCoreWCMRequestFilterInfo3.equals(comDayCqWcmCoreWCMRequestFilterInfo4));
        System.assert(comDayCqWcmCoreWCMRequestFilterInfo4.equals(comDayCqWcmCoreWCMRequestFilterInfo3));
        System.assert(comDayCqWcmCoreWCMRequestFilterInfo3.equals(comDayCqWcmCoreWCMRequestFilterInfo3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASComDayCqWcmCoreWCMRequestFilterIn comDayCqWcmCoreWCMRequestFilterInfo1 = OASComDayCqWcmCoreWCMRequestFilterIn.getExample();
        OASComDayCqWcmCoreWCMRequestFilterIn comDayCqWcmCoreWCMRequestFilterInfo2 = OASComDayCqWcmCoreWCMRequestFilterIn.getExample();
        OASComDayCqWcmCoreWCMRequestFilterIn comDayCqWcmCoreWCMRequestFilterInfo3 = new OASComDayCqWcmCoreWCMRequestFilterIn();
        OASComDayCqWcmCoreWCMRequestFilterIn comDayCqWcmCoreWCMRequestFilterInfo4 = new OASComDayCqWcmCoreWCMRequestFilterIn();

        System.assert(comDayCqWcmCoreWCMRequestFilterInfo1.equals(comDayCqWcmCoreWCMRequestFilterInfo2));
        System.assert(comDayCqWcmCoreWCMRequestFilterInfo2.equals(comDayCqWcmCoreWCMRequestFilterInfo1));
        System.assert(comDayCqWcmCoreWCMRequestFilterInfo3.equals(comDayCqWcmCoreWCMRequestFilterInfo4));
        System.assert(comDayCqWcmCoreWCMRequestFilterInfo4.equals(comDayCqWcmCoreWCMRequestFilterInfo3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASComDayCqWcmCoreWCMRequestFilterIn comDayCqWcmCoreWCMRequestFilterInfo1 = OASComDayCqWcmCoreWCMRequestFilterIn.getExample();
        OASComDayCqWcmCoreWCMRequestFilterIn comDayCqWcmCoreWCMRequestFilterInfo2 = new OASComDayCqWcmCoreWCMRequestFilterIn();

        System.assertEquals(false, comDayCqWcmCoreWCMRequestFilterInfo1.equals('foo'));
        System.assertEquals(false, comDayCqWcmCoreWCMRequestFilterInfo2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASComDayCqWcmCoreWCMRequestFilterIn comDayCqWcmCoreWCMRequestFilterInfo1 = OASComDayCqWcmCoreWCMRequestFilterIn.getExample();
        OASComDayCqWcmCoreWCMRequestFilterIn comDayCqWcmCoreWCMRequestFilterInfo2 = new OASComDayCqWcmCoreWCMRequestFilterIn();
        OASComDayCqWcmCoreWCMRequestFilterIn comDayCqWcmCoreWCMRequestFilterInfo3;

        System.assertEquals(false, comDayCqWcmCoreWCMRequestFilterInfo1.equals(comDayCqWcmCoreWCMRequestFilterInfo3));
        System.assertEquals(false, comDayCqWcmCoreWCMRequestFilterInfo2.equals(comDayCqWcmCoreWCMRequestFilterInfo3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASComDayCqWcmCoreWCMRequestFilterIn comDayCqWcmCoreWCMRequestFilterInfo1 = OASComDayCqWcmCoreWCMRequestFilterIn.getExample();
        OASComDayCqWcmCoreWCMRequestFilterIn comDayCqWcmCoreWCMRequestFilterInfo2 = new OASComDayCqWcmCoreWCMRequestFilterIn();

        System.assertEquals(comDayCqWcmCoreWCMRequestFilterInfo1.hashCode(), comDayCqWcmCoreWCMRequestFilterInfo1.hashCode());
        System.assertEquals(comDayCqWcmCoreWCMRequestFilterInfo2.hashCode(), comDayCqWcmCoreWCMRequestFilterInfo2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASComDayCqWcmCoreWCMRequestFilterIn comDayCqWcmCoreWCMRequestFilterInfo1 = OASComDayCqWcmCoreWCMRequestFilterIn.getExample();
        OASComDayCqWcmCoreWCMRequestFilterIn comDayCqWcmCoreWCMRequestFilterInfo2 = OASComDayCqWcmCoreWCMRequestFilterIn.getExample();
        OASComDayCqWcmCoreWCMRequestFilterIn comDayCqWcmCoreWCMRequestFilterInfo3 = new OASComDayCqWcmCoreWCMRequestFilterIn();
        OASComDayCqWcmCoreWCMRequestFilterIn comDayCqWcmCoreWCMRequestFilterInfo4 = new OASComDayCqWcmCoreWCMRequestFilterIn();

        System.assert(comDayCqWcmCoreWCMRequestFilterInfo1.equals(comDayCqWcmCoreWCMRequestFilterInfo2));
        System.assert(comDayCqWcmCoreWCMRequestFilterInfo3.equals(comDayCqWcmCoreWCMRequestFilterInfo4));
        System.assertEquals(comDayCqWcmCoreWCMRequestFilterInfo1.hashCode(), comDayCqWcmCoreWCMRequestFilterInfo2.hashCode());
        System.assertEquals(comDayCqWcmCoreWCMRequestFilterInfo3.hashCode(), comDayCqWcmCoreWCMRequestFilterInfo4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASComDayCqWcmCoreWCMRequestFilterIn comDayCqWcmCoreWCMRequestFilterInfo = new OASComDayCqWcmCoreWCMRequestFilterIn();
        Map<String, String> propertyMappings = comDayCqWcmCoreWCMRequestFilterInfo.getPropertyMappings();
        System.assertEquals('bundleLocation', propertyMappings.get('bundle_location'));
        System.assertEquals('serviceLocation', propertyMappings.get('service_location'));
    }
}
