@isTest
private class OASComDayCqDamHandlerFfmpegLocatorImTest {
    @isTest
    private static void equalsSameInstance() {
        OASComDayCqDamHandlerFfmpegLocatorIm comDayCqDamHandlerFfmpegLocatorImplProperties1 = OASComDayCqDamHandlerFfmpegLocatorIm.getExample();
        OASComDayCqDamHandlerFfmpegLocatorIm comDayCqDamHandlerFfmpegLocatorImplProperties2 = comDayCqDamHandlerFfmpegLocatorImplProperties1;
        OASComDayCqDamHandlerFfmpegLocatorIm comDayCqDamHandlerFfmpegLocatorImplProperties3 = new OASComDayCqDamHandlerFfmpegLocatorIm();
        OASComDayCqDamHandlerFfmpegLocatorIm comDayCqDamHandlerFfmpegLocatorImplProperties4 = comDayCqDamHandlerFfmpegLocatorImplProperties3;

        System.assert(comDayCqDamHandlerFfmpegLocatorImplProperties1.equals(comDayCqDamHandlerFfmpegLocatorImplProperties2));
        System.assert(comDayCqDamHandlerFfmpegLocatorImplProperties2.equals(comDayCqDamHandlerFfmpegLocatorImplProperties1));
        System.assert(comDayCqDamHandlerFfmpegLocatorImplProperties1.equals(comDayCqDamHandlerFfmpegLocatorImplProperties1));
        System.assert(comDayCqDamHandlerFfmpegLocatorImplProperties3.equals(comDayCqDamHandlerFfmpegLocatorImplProperties4));
        System.assert(comDayCqDamHandlerFfmpegLocatorImplProperties4.equals(comDayCqDamHandlerFfmpegLocatorImplProperties3));
        System.assert(comDayCqDamHandlerFfmpegLocatorImplProperties3.equals(comDayCqDamHandlerFfmpegLocatorImplProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASComDayCqDamHandlerFfmpegLocatorIm comDayCqDamHandlerFfmpegLocatorImplProperties1 = OASComDayCqDamHandlerFfmpegLocatorIm.getExample();
        OASComDayCqDamHandlerFfmpegLocatorIm comDayCqDamHandlerFfmpegLocatorImplProperties2 = OASComDayCqDamHandlerFfmpegLocatorIm.getExample();
        OASComDayCqDamHandlerFfmpegLocatorIm comDayCqDamHandlerFfmpegLocatorImplProperties3 = new OASComDayCqDamHandlerFfmpegLocatorIm();
        OASComDayCqDamHandlerFfmpegLocatorIm comDayCqDamHandlerFfmpegLocatorImplProperties4 = new OASComDayCqDamHandlerFfmpegLocatorIm();

        System.assert(comDayCqDamHandlerFfmpegLocatorImplProperties1.equals(comDayCqDamHandlerFfmpegLocatorImplProperties2));
        System.assert(comDayCqDamHandlerFfmpegLocatorImplProperties2.equals(comDayCqDamHandlerFfmpegLocatorImplProperties1));
        System.assert(comDayCqDamHandlerFfmpegLocatorImplProperties3.equals(comDayCqDamHandlerFfmpegLocatorImplProperties4));
        System.assert(comDayCqDamHandlerFfmpegLocatorImplProperties4.equals(comDayCqDamHandlerFfmpegLocatorImplProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASComDayCqDamHandlerFfmpegLocatorIm comDayCqDamHandlerFfmpegLocatorImplProperties1 = OASComDayCqDamHandlerFfmpegLocatorIm.getExample();
        OASComDayCqDamHandlerFfmpegLocatorIm comDayCqDamHandlerFfmpegLocatorImplProperties2 = new OASComDayCqDamHandlerFfmpegLocatorIm();

        System.assertEquals(false, comDayCqDamHandlerFfmpegLocatorImplProperties1.equals('foo'));
        System.assertEquals(false, comDayCqDamHandlerFfmpegLocatorImplProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASComDayCqDamHandlerFfmpegLocatorIm comDayCqDamHandlerFfmpegLocatorImplProperties1 = OASComDayCqDamHandlerFfmpegLocatorIm.getExample();
        OASComDayCqDamHandlerFfmpegLocatorIm comDayCqDamHandlerFfmpegLocatorImplProperties2 = new OASComDayCqDamHandlerFfmpegLocatorIm();
        OASComDayCqDamHandlerFfmpegLocatorIm comDayCqDamHandlerFfmpegLocatorImplProperties3;

        System.assertEquals(false, comDayCqDamHandlerFfmpegLocatorImplProperties1.equals(comDayCqDamHandlerFfmpegLocatorImplProperties3));
        System.assertEquals(false, comDayCqDamHandlerFfmpegLocatorImplProperties2.equals(comDayCqDamHandlerFfmpegLocatorImplProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASComDayCqDamHandlerFfmpegLocatorIm comDayCqDamHandlerFfmpegLocatorImplProperties1 = OASComDayCqDamHandlerFfmpegLocatorIm.getExample();
        OASComDayCqDamHandlerFfmpegLocatorIm comDayCqDamHandlerFfmpegLocatorImplProperties2 = new OASComDayCqDamHandlerFfmpegLocatorIm();

        System.assertEquals(comDayCqDamHandlerFfmpegLocatorImplProperties1.hashCode(), comDayCqDamHandlerFfmpegLocatorImplProperties1.hashCode());
        System.assertEquals(comDayCqDamHandlerFfmpegLocatorImplProperties2.hashCode(), comDayCqDamHandlerFfmpegLocatorImplProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASComDayCqDamHandlerFfmpegLocatorIm comDayCqDamHandlerFfmpegLocatorImplProperties1 = OASComDayCqDamHandlerFfmpegLocatorIm.getExample();
        OASComDayCqDamHandlerFfmpegLocatorIm comDayCqDamHandlerFfmpegLocatorImplProperties2 = OASComDayCqDamHandlerFfmpegLocatorIm.getExample();
        OASComDayCqDamHandlerFfmpegLocatorIm comDayCqDamHandlerFfmpegLocatorImplProperties3 = new OASComDayCqDamHandlerFfmpegLocatorIm();
        OASComDayCqDamHandlerFfmpegLocatorIm comDayCqDamHandlerFfmpegLocatorImplProperties4 = new OASComDayCqDamHandlerFfmpegLocatorIm();

        System.assert(comDayCqDamHandlerFfmpegLocatorImplProperties1.equals(comDayCqDamHandlerFfmpegLocatorImplProperties2));
        System.assert(comDayCqDamHandlerFfmpegLocatorImplProperties3.equals(comDayCqDamHandlerFfmpegLocatorImplProperties4));
        System.assertEquals(comDayCqDamHandlerFfmpegLocatorImplProperties1.hashCode(), comDayCqDamHandlerFfmpegLocatorImplProperties2.hashCode());
        System.assertEquals(comDayCqDamHandlerFfmpegLocatorImplProperties3.hashCode(), comDayCqDamHandlerFfmpegLocatorImplProperties4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASComDayCqDamHandlerFfmpegLocatorIm comDayCqDamHandlerFfmpegLocatorImplProperties = new OASComDayCqDamHandlerFfmpegLocatorIm();
        Map<String, String> propertyMappings = comDayCqDamHandlerFfmpegLocatorImplProperties.getPropertyMappings();
        System.assertEquals('executableSearchpath', propertyMappings.get('executable.searchpath'));
    }
}
