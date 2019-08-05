@isTest
private class OASComDayCqSecurityACLSetupInfoTest {
    @isTest
    private static void equalsSameInstance() {
        OASComDayCqSecurityACLSetupInfo comDayCqSecurityACLSetupInfo1 = OASComDayCqSecurityACLSetupInfo.getExample();
        OASComDayCqSecurityACLSetupInfo comDayCqSecurityACLSetupInfo2 = comDayCqSecurityACLSetupInfo1;
        OASComDayCqSecurityACLSetupInfo comDayCqSecurityACLSetupInfo3 = new OASComDayCqSecurityACLSetupInfo();
        OASComDayCqSecurityACLSetupInfo comDayCqSecurityACLSetupInfo4 = comDayCqSecurityACLSetupInfo3;

        System.assert(comDayCqSecurityACLSetupInfo1.equals(comDayCqSecurityACLSetupInfo2));
        System.assert(comDayCqSecurityACLSetupInfo2.equals(comDayCqSecurityACLSetupInfo1));
        System.assert(comDayCqSecurityACLSetupInfo1.equals(comDayCqSecurityACLSetupInfo1));
        System.assert(comDayCqSecurityACLSetupInfo3.equals(comDayCqSecurityACLSetupInfo4));
        System.assert(comDayCqSecurityACLSetupInfo4.equals(comDayCqSecurityACLSetupInfo3));
        System.assert(comDayCqSecurityACLSetupInfo3.equals(comDayCqSecurityACLSetupInfo3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASComDayCqSecurityACLSetupInfo comDayCqSecurityACLSetupInfo1 = OASComDayCqSecurityACLSetupInfo.getExample();
        OASComDayCqSecurityACLSetupInfo comDayCqSecurityACLSetupInfo2 = OASComDayCqSecurityACLSetupInfo.getExample();
        OASComDayCqSecurityACLSetupInfo comDayCqSecurityACLSetupInfo3 = new OASComDayCqSecurityACLSetupInfo();
        OASComDayCqSecurityACLSetupInfo comDayCqSecurityACLSetupInfo4 = new OASComDayCqSecurityACLSetupInfo();

        System.assert(comDayCqSecurityACLSetupInfo1.equals(comDayCqSecurityACLSetupInfo2));
        System.assert(comDayCqSecurityACLSetupInfo2.equals(comDayCqSecurityACLSetupInfo1));
        System.assert(comDayCqSecurityACLSetupInfo3.equals(comDayCqSecurityACLSetupInfo4));
        System.assert(comDayCqSecurityACLSetupInfo4.equals(comDayCqSecurityACLSetupInfo3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASComDayCqSecurityACLSetupInfo comDayCqSecurityACLSetupInfo1 = OASComDayCqSecurityACLSetupInfo.getExample();
        OASComDayCqSecurityACLSetupInfo comDayCqSecurityACLSetupInfo2 = new OASComDayCqSecurityACLSetupInfo();

        System.assertEquals(false, comDayCqSecurityACLSetupInfo1.equals('foo'));
        System.assertEquals(false, comDayCqSecurityACLSetupInfo2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASComDayCqSecurityACLSetupInfo comDayCqSecurityACLSetupInfo1 = OASComDayCqSecurityACLSetupInfo.getExample();
        OASComDayCqSecurityACLSetupInfo comDayCqSecurityACLSetupInfo2 = new OASComDayCqSecurityACLSetupInfo();
        OASComDayCqSecurityACLSetupInfo comDayCqSecurityACLSetupInfo3;

        System.assertEquals(false, comDayCqSecurityACLSetupInfo1.equals(comDayCqSecurityACLSetupInfo3));
        System.assertEquals(false, comDayCqSecurityACLSetupInfo2.equals(comDayCqSecurityACLSetupInfo3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASComDayCqSecurityACLSetupInfo comDayCqSecurityACLSetupInfo1 = OASComDayCqSecurityACLSetupInfo.getExample();
        OASComDayCqSecurityACLSetupInfo comDayCqSecurityACLSetupInfo2 = new OASComDayCqSecurityACLSetupInfo();

        System.assertEquals(comDayCqSecurityACLSetupInfo1.hashCode(), comDayCqSecurityACLSetupInfo1.hashCode());
        System.assertEquals(comDayCqSecurityACLSetupInfo2.hashCode(), comDayCqSecurityACLSetupInfo2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASComDayCqSecurityACLSetupInfo comDayCqSecurityACLSetupInfo1 = OASComDayCqSecurityACLSetupInfo.getExample();
        OASComDayCqSecurityACLSetupInfo comDayCqSecurityACLSetupInfo2 = OASComDayCqSecurityACLSetupInfo.getExample();
        OASComDayCqSecurityACLSetupInfo comDayCqSecurityACLSetupInfo3 = new OASComDayCqSecurityACLSetupInfo();
        OASComDayCqSecurityACLSetupInfo comDayCqSecurityACLSetupInfo4 = new OASComDayCqSecurityACLSetupInfo();

        System.assert(comDayCqSecurityACLSetupInfo1.equals(comDayCqSecurityACLSetupInfo2));
        System.assert(comDayCqSecurityACLSetupInfo3.equals(comDayCqSecurityACLSetupInfo4));
        System.assertEquals(comDayCqSecurityACLSetupInfo1.hashCode(), comDayCqSecurityACLSetupInfo2.hashCode());
        System.assertEquals(comDayCqSecurityACLSetupInfo3.hashCode(), comDayCqSecurityACLSetupInfo4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASComDayCqSecurityACLSetupInfo comDayCqSecurityACLSetupInfo = new OASComDayCqSecurityACLSetupInfo();
        Map<String, String> propertyMappings = comDayCqSecurityACLSetupInfo.getPropertyMappings();
        System.assertEquals('bundleLocation', propertyMappings.get('bundle_location'));
        System.assertEquals('serviceLocation', propertyMappings.get('service_location'));
    }
}
