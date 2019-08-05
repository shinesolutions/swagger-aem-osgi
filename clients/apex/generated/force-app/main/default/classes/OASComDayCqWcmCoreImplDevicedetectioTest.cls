@isTest
private class OASComDayCqWcmCoreImplDevicedetectioTest {
    @isTest
    private static void equalsSameInstance() {
        OASComDayCqWcmCoreImplDevicedetectio comDayCqWcmCoreImplDevicedetectionDeviceIdentificationModeImplProperties1 = OASComDayCqWcmCoreImplDevicedetectio.getExample();
        OASComDayCqWcmCoreImplDevicedetectio comDayCqWcmCoreImplDevicedetectionDeviceIdentificationModeImplProperties2 = comDayCqWcmCoreImplDevicedetectionDeviceIdentificationModeImplProperties1;
        OASComDayCqWcmCoreImplDevicedetectio comDayCqWcmCoreImplDevicedetectionDeviceIdentificationModeImplProperties3 = new OASComDayCqWcmCoreImplDevicedetectio();
        OASComDayCqWcmCoreImplDevicedetectio comDayCqWcmCoreImplDevicedetectionDeviceIdentificationModeImplProperties4 = comDayCqWcmCoreImplDevicedetectionDeviceIdentificationModeImplProperties3;

        System.assert(comDayCqWcmCoreImplDevicedetectionDeviceIdentificationModeImplProperties1.equals(comDayCqWcmCoreImplDevicedetectionDeviceIdentificationModeImplProperties2));
        System.assert(comDayCqWcmCoreImplDevicedetectionDeviceIdentificationModeImplProperties2.equals(comDayCqWcmCoreImplDevicedetectionDeviceIdentificationModeImplProperties1));
        System.assert(comDayCqWcmCoreImplDevicedetectionDeviceIdentificationModeImplProperties1.equals(comDayCqWcmCoreImplDevicedetectionDeviceIdentificationModeImplProperties1));
        System.assert(comDayCqWcmCoreImplDevicedetectionDeviceIdentificationModeImplProperties3.equals(comDayCqWcmCoreImplDevicedetectionDeviceIdentificationModeImplProperties4));
        System.assert(comDayCqWcmCoreImplDevicedetectionDeviceIdentificationModeImplProperties4.equals(comDayCqWcmCoreImplDevicedetectionDeviceIdentificationModeImplProperties3));
        System.assert(comDayCqWcmCoreImplDevicedetectionDeviceIdentificationModeImplProperties3.equals(comDayCqWcmCoreImplDevicedetectionDeviceIdentificationModeImplProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASComDayCqWcmCoreImplDevicedetectio comDayCqWcmCoreImplDevicedetectionDeviceIdentificationModeImplProperties1 = OASComDayCqWcmCoreImplDevicedetectio.getExample();
        OASComDayCqWcmCoreImplDevicedetectio comDayCqWcmCoreImplDevicedetectionDeviceIdentificationModeImplProperties2 = OASComDayCqWcmCoreImplDevicedetectio.getExample();
        OASComDayCqWcmCoreImplDevicedetectio comDayCqWcmCoreImplDevicedetectionDeviceIdentificationModeImplProperties3 = new OASComDayCqWcmCoreImplDevicedetectio();
        OASComDayCqWcmCoreImplDevicedetectio comDayCqWcmCoreImplDevicedetectionDeviceIdentificationModeImplProperties4 = new OASComDayCqWcmCoreImplDevicedetectio();

        System.assert(comDayCqWcmCoreImplDevicedetectionDeviceIdentificationModeImplProperties1.equals(comDayCqWcmCoreImplDevicedetectionDeviceIdentificationModeImplProperties2));
        System.assert(comDayCqWcmCoreImplDevicedetectionDeviceIdentificationModeImplProperties2.equals(comDayCqWcmCoreImplDevicedetectionDeviceIdentificationModeImplProperties1));
        System.assert(comDayCqWcmCoreImplDevicedetectionDeviceIdentificationModeImplProperties3.equals(comDayCqWcmCoreImplDevicedetectionDeviceIdentificationModeImplProperties4));
        System.assert(comDayCqWcmCoreImplDevicedetectionDeviceIdentificationModeImplProperties4.equals(comDayCqWcmCoreImplDevicedetectionDeviceIdentificationModeImplProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASComDayCqWcmCoreImplDevicedetectio comDayCqWcmCoreImplDevicedetectionDeviceIdentificationModeImplProperties1 = OASComDayCqWcmCoreImplDevicedetectio.getExample();
        OASComDayCqWcmCoreImplDevicedetectio comDayCqWcmCoreImplDevicedetectionDeviceIdentificationModeImplProperties2 = new OASComDayCqWcmCoreImplDevicedetectio();

        System.assertEquals(false, comDayCqWcmCoreImplDevicedetectionDeviceIdentificationModeImplProperties1.equals('foo'));
        System.assertEquals(false, comDayCqWcmCoreImplDevicedetectionDeviceIdentificationModeImplProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASComDayCqWcmCoreImplDevicedetectio comDayCqWcmCoreImplDevicedetectionDeviceIdentificationModeImplProperties1 = OASComDayCqWcmCoreImplDevicedetectio.getExample();
        OASComDayCqWcmCoreImplDevicedetectio comDayCqWcmCoreImplDevicedetectionDeviceIdentificationModeImplProperties2 = new OASComDayCqWcmCoreImplDevicedetectio();
        OASComDayCqWcmCoreImplDevicedetectio comDayCqWcmCoreImplDevicedetectionDeviceIdentificationModeImplProperties3;

        System.assertEquals(false, comDayCqWcmCoreImplDevicedetectionDeviceIdentificationModeImplProperties1.equals(comDayCqWcmCoreImplDevicedetectionDeviceIdentificationModeImplProperties3));
        System.assertEquals(false, comDayCqWcmCoreImplDevicedetectionDeviceIdentificationModeImplProperties2.equals(comDayCqWcmCoreImplDevicedetectionDeviceIdentificationModeImplProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASComDayCqWcmCoreImplDevicedetectio comDayCqWcmCoreImplDevicedetectionDeviceIdentificationModeImplProperties1 = OASComDayCqWcmCoreImplDevicedetectio.getExample();
        OASComDayCqWcmCoreImplDevicedetectio comDayCqWcmCoreImplDevicedetectionDeviceIdentificationModeImplProperties2 = new OASComDayCqWcmCoreImplDevicedetectio();

        System.assertEquals(comDayCqWcmCoreImplDevicedetectionDeviceIdentificationModeImplProperties1.hashCode(), comDayCqWcmCoreImplDevicedetectionDeviceIdentificationModeImplProperties1.hashCode());
        System.assertEquals(comDayCqWcmCoreImplDevicedetectionDeviceIdentificationModeImplProperties2.hashCode(), comDayCqWcmCoreImplDevicedetectionDeviceIdentificationModeImplProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASComDayCqWcmCoreImplDevicedetectio comDayCqWcmCoreImplDevicedetectionDeviceIdentificationModeImplProperties1 = OASComDayCqWcmCoreImplDevicedetectio.getExample();
        OASComDayCqWcmCoreImplDevicedetectio comDayCqWcmCoreImplDevicedetectionDeviceIdentificationModeImplProperties2 = OASComDayCqWcmCoreImplDevicedetectio.getExample();
        OASComDayCqWcmCoreImplDevicedetectio comDayCqWcmCoreImplDevicedetectionDeviceIdentificationModeImplProperties3 = new OASComDayCqWcmCoreImplDevicedetectio();
        OASComDayCqWcmCoreImplDevicedetectio comDayCqWcmCoreImplDevicedetectionDeviceIdentificationModeImplProperties4 = new OASComDayCqWcmCoreImplDevicedetectio();

        System.assert(comDayCqWcmCoreImplDevicedetectionDeviceIdentificationModeImplProperties1.equals(comDayCqWcmCoreImplDevicedetectionDeviceIdentificationModeImplProperties2));
        System.assert(comDayCqWcmCoreImplDevicedetectionDeviceIdentificationModeImplProperties3.equals(comDayCqWcmCoreImplDevicedetectionDeviceIdentificationModeImplProperties4));
        System.assertEquals(comDayCqWcmCoreImplDevicedetectionDeviceIdentificationModeImplProperties1.hashCode(), comDayCqWcmCoreImplDevicedetectionDeviceIdentificationModeImplProperties2.hashCode());
        System.assertEquals(comDayCqWcmCoreImplDevicedetectionDeviceIdentificationModeImplProperties3.hashCode(), comDayCqWcmCoreImplDevicedetectionDeviceIdentificationModeImplProperties4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASComDayCqWcmCoreImplDevicedetectio comDayCqWcmCoreImplDevicedetectionDeviceIdentificationModeImplProperties = new OASComDayCqWcmCoreImplDevicedetectio();
        Map<String, String> propertyMappings = comDayCqWcmCoreImplDevicedetectionDeviceIdentificationModeImplProperties.getPropertyMappings();
        System.assertEquals('dimDefaultMode', propertyMappings.get('dim.default.mode'));
        System.assertEquals('dimAppcacheEnabled', propertyMappings.get('dim.appcache.enabled'));
    }
}
