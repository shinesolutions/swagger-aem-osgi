@isTest
private class OASComAdobeGraniteAuthImsInfoTest {
    @isTest
    private static void equalsSameInstance() {
        OASComAdobeGraniteAuthImsInfo comAdobeGraniteAuthImsInfo1 = OASComAdobeGraniteAuthImsInfo.getExample();
        OASComAdobeGraniteAuthImsInfo comAdobeGraniteAuthImsInfo2 = comAdobeGraniteAuthImsInfo1;
        OASComAdobeGraniteAuthImsInfo comAdobeGraniteAuthImsInfo3 = new OASComAdobeGraniteAuthImsInfo();
        OASComAdobeGraniteAuthImsInfo comAdobeGraniteAuthImsInfo4 = comAdobeGraniteAuthImsInfo3;

        System.assert(comAdobeGraniteAuthImsInfo1.equals(comAdobeGraniteAuthImsInfo2));
        System.assert(comAdobeGraniteAuthImsInfo2.equals(comAdobeGraniteAuthImsInfo1));
        System.assert(comAdobeGraniteAuthImsInfo1.equals(comAdobeGraniteAuthImsInfo1));
        System.assert(comAdobeGraniteAuthImsInfo3.equals(comAdobeGraniteAuthImsInfo4));
        System.assert(comAdobeGraniteAuthImsInfo4.equals(comAdobeGraniteAuthImsInfo3));
        System.assert(comAdobeGraniteAuthImsInfo3.equals(comAdobeGraniteAuthImsInfo3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASComAdobeGraniteAuthImsInfo comAdobeGraniteAuthImsInfo1 = OASComAdobeGraniteAuthImsInfo.getExample();
        OASComAdobeGraniteAuthImsInfo comAdobeGraniteAuthImsInfo2 = OASComAdobeGraniteAuthImsInfo.getExample();
        OASComAdobeGraniteAuthImsInfo comAdobeGraniteAuthImsInfo3 = new OASComAdobeGraniteAuthImsInfo();
        OASComAdobeGraniteAuthImsInfo comAdobeGraniteAuthImsInfo4 = new OASComAdobeGraniteAuthImsInfo();

        System.assert(comAdobeGraniteAuthImsInfo1.equals(comAdobeGraniteAuthImsInfo2));
        System.assert(comAdobeGraniteAuthImsInfo2.equals(comAdobeGraniteAuthImsInfo1));
        System.assert(comAdobeGraniteAuthImsInfo3.equals(comAdobeGraniteAuthImsInfo4));
        System.assert(comAdobeGraniteAuthImsInfo4.equals(comAdobeGraniteAuthImsInfo3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASComAdobeGraniteAuthImsInfo comAdobeGraniteAuthImsInfo1 = OASComAdobeGraniteAuthImsInfo.getExample();
        OASComAdobeGraniteAuthImsInfo comAdobeGraniteAuthImsInfo2 = new OASComAdobeGraniteAuthImsInfo();

        System.assertEquals(false, comAdobeGraniteAuthImsInfo1.equals('foo'));
        System.assertEquals(false, comAdobeGraniteAuthImsInfo2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASComAdobeGraniteAuthImsInfo comAdobeGraniteAuthImsInfo1 = OASComAdobeGraniteAuthImsInfo.getExample();
        OASComAdobeGraniteAuthImsInfo comAdobeGraniteAuthImsInfo2 = new OASComAdobeGraniteAuthImsInfo();
        OASComAdobeGraniteAuthImsInfo comAdobeGraniteAuthImsInfo3;

        System.assertEquals(false, comAdobeGraniteAuthImsInfo1.equals(comAdobeGraniteAuthImsInfo3));
        System.assertEquals(false, comAdobeGraniteAuthImsInfo2.equals(comAdobeGraniteAuthImsInfo3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASComAdobeGraniteAuthImsInfo comAdobeGraniteAuthImsInfo1 = OASComAdobeGraniteAuthImsInfo.getExample();
        OASComAdobeGraniteAuthImsInfo comAdobeGraniteAuthImsInfo2 = new OASComAdobeGraniteAuthImsInfo();

        System.assertEquals(comAdobeGraniteAuthImsInfo1.hashCode(), comAdobeGraniteAuthImsInfo1.hashCode());
        System.assertEquals(comAdobeGraniteAuthImsInfo2.hashCode(), comAdobeGraniteAuthImsInfo2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASComAdobeGraniteAuthImsInfo comAdobeGraniteAuthImsInfo1 = OASComAdobeGraniteAuthImsInfo.getExample();
        OASComAdobeGraniteAuthImsInfo comAdobeGraniteAuthImsInfo2 = OASComAdobeGraniteAuthImsInfo.getExample();
        OASComAdobeGraniteAuthImsInfo comAdobeGraniteAuthImsInfo3 = new OASComAdobeGraniteAuthImsInfo();
        OASComAdobeGraniteAuthImsInfo comAdobeGraniteAuthImsInfo4 = new OASComAdobeGraniteAuthImsInfo();

        System.assert(comAdobeGraniteAuthImsInfo1.equals(comAdobeGraniteAuthImsInfo2));
        System.assert(comAdobeGraniteAuthImsInfo3.equals(comAdobeGraniteAuthImsInfo4));
        System.assertEquals(comAdobeGraniteAuthImsInfo1.hashCode(), comAdobeGraniteAuthImsInfo2.hashCode());
        System.assertEquals(comAdobeGraniteAuthImsInfo3.hashCode(), comAdobeGraniteAuthImsInfo4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASComAdobeGraniteAuthImsInfo comAdobeGraniteAuthImsInfo = new OASComAdobeGraniteAuthImsInfo();
        Map<String, String> propertyMappings = comAdobeGraniteAuthImsInfo.getPropertyMappings();
        System.assertEquals('bundleLocation', propertyMappings.get('bundle_location'));
        System.assertEquals('serviceLocation', propertyMappings.get('service_location'));
    }
}
