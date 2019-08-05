@isTest
private class OASComAdobeCqScreensDeviceImplDeviceTest {
    @isTest
    private static void equalsSameInstance() {
        OASComAdobeCqScreensDeviceImplDevice comAdobeCqScreensDeviceImplDeviceServiceProperties1 = OASComAdobeCqScreensDeviceImplDevice.getExample();
        OASComAdobeCqScreensDeviceImplDevice comAdobeCqScreensDeviceImplDeviceServiceProperties2 = comAdobeCqScreensDeviceImplDeviceServiceProperties1;
        OASComAdobeCqScreensDeviceImplDevice comAdobeCqScreensDeviceImplDeviceServiceProperties3 = new OASComAdobeCqScreensDeviceImplDevice();
        OASComAdobeCqScreensDeviceImplDevice comAdobeCqScreensDeviceImplDeviceServiceProperties4 = comAdobeCqScreensDeviceImplDeviceServiceProperties3;

        System.assert(comAdobeCqScreensDeviceImplDeviceServiceProperties1.equals(comAdobeCqScreensDeviceImplDeviceServiceProperties2));
        System.assert(comAdobeCqScreensDeviceImplDeviceServiceProperties2.equals(comAdobeCqScreensDeviceImplDeviceServiceProperties1));
        System.assert(comAdobeCqScreensDeviceImplDeviceServiceProperties1.equals(comAdobeCqScreensDeviceImplDeviceServiceProperties1));
        System.assert(comAdobeCqScreensDeviceImplDeviceServiceProperties3.equals(comAdobeCqScreensDeviceImplDeviceServiceProperties4));
        System.assert(comAdobeCqScreensDeviceImplDeviceServiceProperties4.equals(comAdobeCqScreensDeviceImplDeviceServiceProperties3));
        System.assert(comAdobeCqScreensDeviceImplDeviceServiceProperties3.equals(comAdobeCqScreensDeviceImplDeviceServiceProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASComAdobeCqScreensDeviceImplDevice comAdobeCqScreensDeviceImplDeviceServiceProperties1 = OASComAdobeCqScreensDeviceImplDevice.getExample();
        OASComAdobeCqScreensDeviceImplDevice comAdobeCqScreensDeviceImplDeviceServiceProperties2 = OASComAdobeCqScreensDeviceImplDevice.getExample();
        OASComAdobeCqScreensDeviceImplDevice comAdobeCqScreensDeviceImplDeviceServiceProperties3 = new OASComAdobeCqScreensDeviceImplDevice();
        OASComAdobeCqScreensDeviceImplDevice comAdobeCqScreensDeviceImplDeviceServiceProperties4 = new OASComAdobeCqScreensDeviceImplDevice();

        System.assert(comAdobeCqScreensDeviceImplDeviceServiceProperties1.equals(comAdobeCqScreensDeviceImplDeviceServiceProperties2));
        System.assert(comAdobeCqScreensDeviceImplDeviceServiceProperties2.equals(comAdobeCqScreensDeviceImplDeviceServiceProperties1));
        System.assert(comAdobeCqScreensDeviceImplDeviceServiceProperties3.equals(comAdobeCqScreensDeviceImplDeviceServiceProperties4));
        System.assert(comAdobeCqScreensDeviceImplDeviceServiceProperties4.equals(comAdobeCqScreensDeviceImplDeviceServiceProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASComAdobeCqScreensDeviceImplDevice comAdobeCqScreensDeviceImplDeviceServiceProperties1 = OASComAdobeCqScreensDeviceImplDevice.getExample();
        OASComAdobeCqScreensDeviceImplDevice comAdobeCqScreensDeviceImplDeviceServiceProperties2 = new OASComAdobeCqScreensDeviceImplDevice();

        System.assertEquals(false, comAdobeCqScreensDeviceImplDeviceServiceProperties1.equals('foo'));
        System.assertEquals(false, comAdobeCqScreensDeviceImplDeviceServiceProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASComAdobeCqScreensDeviceImplDevice comAdobeCqScreensDeviceImplDeviceServiceProperties1 = OASComAdobeCqScreensDeviceImplDevice.getExample();
        OASComAdobeCqScreensDeviceImplDevice comAdobeCqScreensDeviceImplDeviceServiceProperties2 = new OASComAdobeCqScreensDeviceImplDevice();
        OASComAdobeCqScreensDeviceImplDevice comAdobeCqScreensDeviceImplDeviceServiceProperties3;

        System.assertEquals(false, comAdobeCqScreensDeviceImplDeviceServiceProperties1.equals(comAdobeCqScreensDeviceImplDeviceServiceProperties3));
        System.assertEquals(false, comAdobeCqScreensDeviceImplDeviceServiceProperties2.equals(comAdobeCqScreensDeviceImplDeviceServiceProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASComAdobeCqScreensDeviceImplDevice comAdobeCqScreensDeviceImplDeviceServiceProperties1 = OASComAdobeCqScreensDeviceImplDevice.getExample();
        OASComAdobeCqScreensDeviceImplDevice comAdobeCqScreensDeviceImplDeviceServiceProperties2 = new OASComAdobeCqScreensDeviceImplDevice();

        System.assertEquals(comAdobeCqScreensDeviceImplDeviceServiceProperties1.hashCode(), comAdobeCqScreensDeviceImplDeviceServiceProperties1.hashCode());
        System.assertEquals(comAdobeCqScreensDeviceImplDeviceServiceProperties2.hashCode(), comAdobeCqScreensDeviceImplDeviceServiceProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASComAdobeCqScreensDeviceImplDevice comAdobeCqScreensDeviceImplDeviceServiceProperties1 = OASComAdobeCqScreensDeviceImplDevice.getExample();
        OASComAdobeCqScreensDeviceImplDevice comAdobeCqScreensDeviceImplDeviceServiceProperties2 = OASComAdobeCqScreensDeviceImplDevice.getExample();
        OASComAdobeCqScreensDeviceImplDevice comAdobeCqScreensDeviceImplDeviceServiceProperties3 = new OASComAdobeCqScreensDeviceImplDevice();
        OASComAdobeCqScreensDeviceImplDevice comAdobeCqScreensDeviceImplDeviceServiceProperties4 = new OASComAdobeCqScreensDeviceImplDevice();

        System.assert(comAdobeCqScreensDeviceImplDeviceServiceProperties1.equals(comAdobeCqScreensDeviceImplDeviceServiceProperties2));
        System.assert(comAdobeCqScreensDeviceImplDeviceServiceProperties3.equals(comAdobeCqScreensDeviceImplDeviceServiceProperties4));
        System.assertEquals(comAdobeCqScreensDeviceImplDeviceServiceProperties1.hashCode(), comAdobeCqScreensDeviceImplDeviceServiceProperties2.hashCode());
        System.assertEquals(comAdobeCqScreensDeviceImplDeviceServiceProperties3.hashCode(), comAdobeCqScreensDeviceImplDeviceServiceProperties4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASComAdobeCqScreensDeviceImplDevice comAdobeCqScreensDeviceImplDeviceServiceProperties = new OASComAdobeCqScreensDeviceImplDevice();
        Map<String, String> propertyMappings = comAdobeCqScreensDeviceImplDeviceServiceProperties.getPropertyMappings();
        System.assertEquals('comAdobeAemScreensPlayerPingfrequency', propertyMappings.get('com.adobe.aem.screens.player.pingfrequency'));
        System.assertEquals('comAdobeAemScreensDevicePaswordSpecialchars', propertyMappings.get('com.adobe.aem.screens.device.pasword.specialchars'));
        System.assertEquals('comAdobeAemScreensDevicePaswordMinlowercasechars', propertyMappings.get('com.adobe.aem.screens.device.pasword.minlowercasechars'));
        System.assertEquals('comAdobeAemScreensDevicePaswordMinuppercasechars', propertyMappings.get('com.adobe.aem.screens.device.pasword.minuppercasechars'));
        System.assertEquals('comAdobeAemScreensDevicePaswordMinnumberchars', propertyMappings.get('com.adobe.aem.screens.device.pasword.minnumberchars'));
        System.assertEquals('comAdobeAemScreensDevicePaswordMinspecialchars', propertyMappings.get('com.adobe.aem.screens.device.pasword.minspecialchars'));
        System.assertEquals('comAdobeAemScreensDevicePaswordMinlength', propertyMappings.get('com.adobe.aem.screens.device.pasword.minlength'));
    }
}
