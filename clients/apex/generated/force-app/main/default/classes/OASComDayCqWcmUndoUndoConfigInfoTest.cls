@isTest
private class OASComDayCqWcmUndoUndoConfigInfoTest {
    @isTest
    private static void equalsSameInstance() {
        OASComDayCqWcmUndoUndoConfigInfo comDayCqWcmUndoUndoConfigInfo1 = OASComDayCqWcmUndoUndoConfigInfo.getExample();
        OASComDayCqWcmUndoUndoConfigInfo comDayCqWcmUndoUndoConfigInfo2 = comDayCqWcmUndoUndoConfigInfo1;
        OASComDayCqWcmUndoUndoConfigInfo comDayCqWcmUndoUndoConfigInfo3 = new OASComDayCqWcmUndoUndoConfigInfo();
        OASComDayCqWcmUndoUndoConfigInfo comDayCqWcmUndoUndoConfigInfo4 = comDayCqWcmUndoUndoConfigInfo3;

        System.assert(comDayCqWcmUndoUndoConfigInfo1.equals(comDayCqWcmUndoUndoConfigInfo2));
        System.assert(comDayCqWcmUndoUndoConfigInfo2.equals(comDayCqWcmUndoUndoConfigInfo1));
        System.assert(comDayCqWcmUndoUndoConfigInfo1.equals(comDayCqWcmUndoUndoConfigInfo1));
        System.assert(comDayCqWcmUndoUndoConfigInfo3.equals(comDayCqWcmUndoUndoConfigInfo4));
        System.assert(comDayCqWcmUndoUndoConfigInfo4.equals(comDayCqWcmUndoUndoConfigInfo3));
        System.assert(comDayCqWcmUndoUndoConfigInfo3.equals(comDayCqWcmUndoUndoConfigInfo3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASComDayCqWcmUndoUndoConfigInfo comDayCqWcmUndoUndoConfigInfo1 = OASComDayCqWcmUndoUndoConfigInfo.getExample();
        OASComDayCqWcmUndoUndoConfigInfo comDayCqWcmUndoUndoConfigInfo2 = OASComDayCqWcmUndoUndoConfigInfo.getExample();
        OASComDayCqWcmUndoUndoConfigInfo comDayCqWcmUndoUndoConfigInfo3 = new OASComDayCqWcmUndoUndoConfigInfo();
        OASComDayCqWcmUndoUndoConfigInfo comDayCqWcmUndoUndoConfigInfo4 = new OASComDayCqWcmUndoUndoConfigInfo();

        System.assert(comDayCqWcmUndoUndoConfigInfo1.equals(comDayCqWcmUndoUndoConfigInfo2));
        System.assert(comDayCqWcmUndoUndoConfigInfo2.equals(comDayCqWcmUndoUndoConfigInfo1));
        System.assert(comDayCqWcmUndoUndoConfigInfo3.equals(comDayCqWcmUndoUndoConfigInfo4));
        System.assert(comDayCqWcmUndoUndoConfigInfo4.equals(comDayCqWcmUndoUndoConfigInfo3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASComDayCqWcmUndoUndoConfigInfo comDayCqWcmUndoUndoConfigInfo1 = OASComDayCqWcmUndoUndoConfigInfo.getExample();
        OASComDayCqWcmUndoUndoConfigInfo comDayCqWcmUndoUndoConfigInfo2 = new OASComDayCqWcmUndoUndoConfigInfo();

        System.assertEquals(false, comDayCqWcmUndoUndoConfigInfo1.equals('foo'));
        System.assertEquals(false, comDayCqWcmUndoUndoConfigInfo2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASComDayCqWcmUndoUndoConfigInfo comDayCqWcmUndoUndoConfigInfo1 = OASComDayCqWcmUndoUndoConfigInfo.getExample();
        OASComDayCqWcmUndoUndoConfigInfo comDayCqWcmUndoUndoConfigInfo2 = new OASComDayCqWcmUndoUndoConfigInfo();
        OASComDayCqWcmUndoUndoConfigInfo comDayCqWcmUndoUndoConfigInfo3;

        System.assertEquals(false, comDayCqWcmUndoUndoConfigInfo1.equals(comDayCqWcmUndoUndoConfigInfo3));
        System.assertEquals(false, comDayCqWcmUndoUndoConfigInfo2.equals(comDayCqWcmUndoUndoConfigInfo3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASComDayCqWcmUndoUndoConfigInfo comDayCqWcmUndoUndoConfigInfo1 = OASComDayCqWcmUndoUndoConfigInfo.getExample();
        OASComDayCqWcmUndoUndoConfigInfo comDayCqWcmUndoUndoConfigInfo2 = new OASComDayCqWcmUndoUndoConfigInfo();

        System.assertEquals(comDayCqWcmUndoUndoConfigInfo1.hashCode(), comDayCqWcmUndoUndoConfigInfo1.hashCode());
        System.assertEquals(comDayCqWcmUndoUndoConfigInfo2.hashCode(), comDayCqWcmUndoUndoConfigInfo2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASComDayCqWcmUndoUndoConfigInfo comDayCqWcmUndoUndoConfigInfo1 = OASComDayCqWcmUndoUndoConfigInfo.getExample();
        OASComDayCqWcmUndoUndoConfigInfo comDayCqWcmUndoUndoConfigInfo2 = OASComDayCqWcmUndoUndoConfigInfo.getExample();
        OASComDayCqWcmUndoUndoConfigInfo comDayCqWcmUndoUndoConfigInfo3 = new OASComDayCqWcmUndoUndoConfigInfo();
        OASComDayCqWcmUndoUndoConfigInfo comDayCqWcmUndoUndoConfigInfo4 = new OASComDayCqWcmUndoUndoConfigInfo();

        System.assert(comDayCqWcmUndoUndoConfigInfo1.equals(comDayCqWcmUndoUndoConfigInfo2));
        System.assert(comDayCqWcmUndoUndoConfigInfo3.equals(comDayCqWcmUndoUndoConfigInfo4));
        System.assertEquals(comDayCqWcmUndoUndoConfigInfo1.hashCode(), comDayCqWcmUndoUndoConfigInfo2.hashCode());
        System.assertEquals(comDayCqWcmUndoUndoConfigInfo3.hashCode(), comDayCqWcmUndoUndoConfigInfo4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASComDayCqWcmUndoUndoConfigInfo comDayCqWcmUndoUndoConfigInfo = new OASComDayCqWcmUndoUndoConfigInfo();
        Map<String, String> propertyMappings = comDayCqWcmUndoUndoConfigInfo.getPropertyMappings();
        System.assertEquals('bundleLocation', propertyMappings.get('bundle_location'));
        System.assertEquals('serviceLocation', propertyMappings.get('service_location'));
    }
}
