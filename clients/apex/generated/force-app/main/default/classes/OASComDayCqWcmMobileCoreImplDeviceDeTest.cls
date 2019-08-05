@isTest
private class OASComDayCqWcmMobileCoreImplDeviceDeTest {
    @isTest
    private static void equalsSameInstance() {
        OASComDayCqWcmMobileCoreImplDeviceDe comDayCqWcmMobileCoreImplDeviceDeviceInfoTransformerFactoryProperties1 = OASComDayCqWcmMobileCoreImplDeviceDe.getExample();
        OASComDayCqWcmMobileCoreImplDeviceDe comDayCqWcmMobileCoreImplDeviceDeviceInfoTransformerFactoryProperties2 = comDayCqWcmMobileCoreImplDeviceDeviceInfoTransformerFactoryProperties1;
        OASComDayCqWcmMobileCoreImplDeviceDe comDayCqWcmMobileCoreImplDeviceDeviceInfoTransformerFactoryProperties3 = new OASComDayCqWcmMobileCoreImplDeviceDe();
        OASComDayCqWcmMobileCoreImplDeviceDe comDayCqWcmMobileCoreImplDeviceDeviceInfoTransformerFactoryProperties4 = comDayCqWcmMobileCoreImplDeviceDeviceInfoTransformerFactoryProperties3;

        System.assert(comDayCqWcmMobileCoreImplDeviceDeviceInfoTransformerFactoryProperties1.equals(comDayCqWcmMobileCoreImplDeviceDeviceInfoTransformerFactoryProperties2));
        System.assert(comDayCqWcmMobileCoreImplDeviceDeviceInfoTransformerFactoryProperties2.equals(comDayCqWcmMobileCoreImplDeviceDeviceInfoTransformerFactoryProperties1));
        System.assert(comDayCqWcmMobileCoreImplDeviceDeviceInfoTransformerFactoryProperties1.equals(comDayCqWcmMobileCoreImplDeviceDeviceInfoTransformerFactoryProperties1));
        System.assert(comDayCqWcmMobileCoreImplDeviceDeviceInfoTransformerFactoryProperties3.equals(comDayCqWcmMobileCoreImplDeviceDeviceInfoTransformerFactoryProperties4));
        System.assert(comDayCqWcmMobileCoreImplDeviceDeviceInfoTransformerFactoryProperties4.equals(comDayCqWcmMobileCoreImplDeviceDeviceInfoTransformerFactoryProperties3));
        System.assert(comDayCqWcmMobileCoreImplDeviceDeviceInfoTransformerFactoryProperties3.equals(comDayCqWcmMobileCoreImplDeviceDeviceInfoTransformerFactoryProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASComDayCqWcmMobileCoreImplDeviceDe comDayCqWcmMobileCoreImplDeviceDeviceInfoTransformerFactoryProperties1 = OASComDayCqWcmMobileCoreImplDeviceDe.getExample();
        OASComDayCqWcmMobileCoreImplDeviceDe comDayCqWcmMobileCoreImplDeviceDeviceInfoTransformerFactoryProperties2 = OASComDayCqWcmMobileCoreImplDeviceDe.getExample();
        OASComDayCqWcmMobileCoreImplDeviceDe comDayCqWcmMobileCoreImplDeviceDeviceInfoTransformerFactoryProperties3 = new OASComDayCqWcmMobileCoreImplDeviceDe();
        OASComDayCqWcmMobileCoreImplDeviceDe comDayCqWcmMobileCoreImplDeviceDeviceInfoTransformerFactoryProperties4 = new OASComDayCqWcmMobileCoreImplDeviceDe();

        System.assert(comDayCqWcmMobileCoreImplDeviceDeviceInfoTransformerFactoryProperties1.equals(comDayCqWcmMobileCoreImplDeviceDeviceInfoTransformerFactoryProperties2));
        System.assert(comDayCqWcmMobileCoreImplDeviceDeviceInfoTransformerFactoryProperties2.equals(comDayCqWcmMobileCoreImplDeviceDeviceInfoTransformerFactoryProperties1));
        System.assert(comDayCqWcmMobileCoreImplDeviceDeviceInfoTransformerFactoryProperties3.equals(comDayCqWcmMobileCoreImplDeviceDeviceInfoTransformerFactoryProperties4));
        System.assert(comDayCqWcmMobileCoreImplDeviceDeviceInfoTransformerFactoryProperties4.equals(comDayCqWcmMobileCoreImplDeviceDeviceInfoTransformerFactoryProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASComDayCqWcmMobileCoreImplDeviceDe comDayCqWcmMobileCoreImplDeviceDeviceInfoTransformerFactoryProperties1 = OASComDayCqWcmMobileCoreImplDeviceDe.getExample();
        OASComDayCqWcmMobileCoreImplDeviceDe comDayCqWcmMobileCoreImplDeviceDeviceInfoTransformerFactoryProperties2 = new OASComDayCqWcmMobileCoreImplDeviceDe();

        System.assertEquals(false, comDayCqWcmMobileCoreImplDeviceDeviceInfoTransformerFactoryProperties1.equals('foo'));
        System.assertEquals(false, comDayCqWcmMobileCoreImplDeviceDeviceInfoTransformerFactoryProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASComDayCqWcmMobileCoreImplDeviceDe comDayCqWcmMobileCoreImplDeviceDeviceInfoTransformerFactoryProperties1 = OASComDayCqWcmMobileCoreImplDeviceDe.getExample();
        OASComDayCqWcmMobileCoreImplDeviceDe comDayCqWcmMobileCoreImplDeviceDeviceInfoTransformerFactoryProperties2 = new OASComDayCqWcmMobileCoreImplDeviceDe();
        OASComDayCqWcmMobileCoreImplDeviceDe comDayCqWcmMobileCoreImplDeviceDeviceInfoTransformerFactoryProperties3;

        System.assertEquals(false, comDayCqWcmMobileCoreImplDeviceDeviceInfoTransformerFactoryProperties1.equals(comDayCqWcmMobileCoreImplDeviceDeviceInfoTransformerFactoryProperties3));
        System.assertEquals(false, comDayCqWcmMobileCoreImplDeviceDeviceInfoTransformerFactoryProperties2.equals(comDayCqWcmMobileCoreImplDeviceDeviceInfoTransformerFactoryProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASComDayCqWcmMobileCoreImplDeviceDe comDayCqWcmMobileCoreImplDeviceDeviceInfoTransformerFactoryProperties1 = OASComDayCqWcmMobileCoreImplDeviceDe.getExample();
        OASComDayCqWcmMobileCoreImplDeviceDe comDayCqWcmMobileCoreImplDeviceDeviceInfoTransformerFactoryProperties2 = new OASComDayCqWcmMobileCoreImplDeviceDe();

        System.assertEquals(comDayCqWcmMobileCoreImplDeviceDeviceInfoTransformerFactoryProperties1.hashCode(), comDayCqWcmMobileCoreImplDeviceDeviceInfoTransformerFactoryProperties1.hashCode());
        System.assertEquals(comDayCqWcmMobileCoreImplDeviceDeviceInfoTransformerFactoryProperties2.hashCode(), comDayCqWcmMobileCoreImplDeviceDeviceInfoTransformerFactoryProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASComDayCqWcmMobileCoreImplDeviceDe comDayCqWcmMobileCoreImplDeviceDeviceInfoTransformerFactoryProperties1 = OASComDayCqWcmMobileCoreImplDeviceDe.getExample();
        OASComDayCqWcmMobileCoreImplDeviceDe comDayCqWcmMobileCoreImplDeviceDeviceInfoTransformerFactoryProperties2 = OASComDayCqWcmMobileCoreImplDeviceDe.getExample();
        OASComDayCqWcmMobileCoreImplDeviceDe comDayCqWcmMobileCoreImplDeviceDeviceInfoTransformerFactoryProperties3 = new OASComDayCqWcmMobileCoreImplDeviceDe();
        OASComDayCqWcmMobileCoreImplDeviceDe comDayCqWcmMobileCoreImplDeviceDeviceInfoTransformerFactoryProperties4 = new OASComDayCqWcmMobileCoreImplDeviceDe();

        System.assert(comDayCqWcmMobileCoreImplDeviceDeviceInfoTransformerFactoryProperties1.equals(comDayCqWcmMobileCoreImplDeviceDeviceInfoTransformerFactoryProperties2));
        System.assert(comDayCqWcmMobileCoreImplDeviceDeviceInfoTransformerFactoryProperties3.equals(comDayCqWcmMobileCoreImplDeviceDeviceInfoTransformerFactoryProperties4));
        System.assertEquals(comDayCqWcmMobileCoreImplDeviceDeviceInfoTransformerFactoryProperties1.hashCode(), comDayCqWcmMobileCoreImplDeviceDeviceInfoTransformerFactoryProperties2.hashCode());
        System.assertEquals(comDayCqWcmMobileCoreImplDeviceDeviceInfoTransformerFactoryProperties3.hashCode(), comDayCqWcmMobileCoreImplDeviceDeviceInfoTransformerFactoryProperties4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASComDayCqWcmMobileCoreImplDeviceDe comDayCqWcmMobileCoreImplDeviceDeviceInfoTransformerFactoryProperties = new OASComDayCqWcmMobileCoreImplDeviceDe();
        Map<String, String> propertyMappings = comDayCqWcmMobileCoreImplDeviceDeviceInfoTransformerFactoryProperties.getPropertyMappings();
        System.assertEquals('deviceInfoTransformerEnabled', propertyMappings.get('device.info.transformer.enabled'));
        System.assertEquals('deviceInfoTransformerCssStyle', propertyMappings.get('device.info.transformer.css.style'));
    }
}
