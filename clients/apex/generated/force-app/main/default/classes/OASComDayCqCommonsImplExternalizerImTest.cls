@isTest
private class OASComDayCqCommonsImplExternalizerImTest {
    @isTest
    private static void equalsSameInstance() {
        OASComDayCqCommonsImplExternalizerIm comDayCqCommonsImplExternalizerImplProperties1 = OASComDayCqCommonsImplExternalizerIm.getExample();
        OASComDayCqCommonsImplExternalizerIm comDayCqCommonsImplExternalizerImplProperties2 = comDayCqCommonsImplExternalizerImplProperties1;
        OASComDayCqCommonsImplExternalizerIm comDayCqCommonsImplExternalizerImplProperties3 = new OASComDayCqCommonsImplExternalizerIm();
        OASComDayCqCommonsImplExternalizerIm comDayCqCommonsImplExternalizerImplProperties4 = comDayCqCommonsImplExternalizerImplProperties3;

        System.assert(comDayCqCommonsImplExternalizerImplProperties1.equals(comDayCqCommonsImplExternalizerImplProperties2));
        System.assert(comDayCqCommonsImplExternalizerImplProperties2.equals(comDayCqCommonsImplExternalizerImplProperties1));
        System.assert(comDayCqCommonsImplExternalizerImplProperties1.equals(comDayCqCommonsImplExternalizerImplProperties1));
        System.assert(comDayCqCommonsImplExternalizerImplProperties3.equals(comDayCqCommonsImplExternalizerImplProperties4));
        System.assert(comDayCqCommonsImplExternalizerImplProperties4.equals(comDayCqCommonsImplExternalizerImplProperties3));
        System.assert(comDayCqCommonsImplExternalizerImplProperties3.equals(comDayCqCommonsImplExternalizerImplProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASComDayCqCommonsImplExternalizerIm comDayCqCommonsImplExternalizerImplProperties1 = OASComDayCqCommonsImplExternalizerIm.getExample();
        OASComDayCqCommonsImplExternalizerIm comDayCqCommonsImplExternalizerImplProperties2 = OASComDayCqCommonsImplExternalizerIm.getExample();
        OASComDayCqCommonsImplExternalizerIm comDayCqCommonsImplExternalizerImplProperties3 = new OASComDayCqCommonsImplExternalizerIm();
        OASComDayCqCommonsImplExternalizerIm comDayCqCommonsImplExternalizerImplProperties4 = new OASComDayCqCommonsImplExternalizerIm();

        System.assert(comDayCqCommonsImplExternalizerImplProperties1.equals(comDayCqCommonsImplExternalizerImplProperties2));
        System.assert(comDayCqCommonsImplExternalizerImplProperties2.equals(comDayCqCommonsImplExternalizerImplProperties1));
        System.assert(comDayCqCommonsImplExternalizerImplProperties3.equals(comDayCqCommonsImplExternalizerImplProperties4));
        System.assert(comDayCqCommonsImplExternalizerImplProperties4.equals(comDayCqCommonsImplExternalizerImplProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASComDayCqCommonsImplExternalizerIm comDayCqCommonsImplExternalizerImplProperties1 = OASComDayCqCommonsImplExternalizerIm.getExample();
        OASComDayCqCommonsImplExternalizerIm comDayCqCommonsImplExternalizerImplProperties2 = new OASComDayCqCommonsImplExternalizerIm();

        System.assertEquals(false, comDayCqCommonsImplExternalizerImplProperties1.equals('foo'));
        System.assertEquals(false, comDayCqCommonsImplExternalizerImplProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASComDayCqCommonsImplExternalizerIm comDayCqCommonsImplExternalizerImplProperties1 = OASComDayCqCommonsImplExternalizerIm.getExample();
        OASComDayCqCommonsImplExternalizerIm comDayCqCommonsImplExternalizerImplProperties2 = new OASComDayCqCommonsImplExternalizerIm();
        OASComDayCqCommonsImplExternalizerIm comDayCqCommonsImplExternalizerImplProperties3;

        System.assertEquals(false, comDayCqCommonsImplExternalizerImplProperties1.equals(comDayCqCommonsImplExternalizerImplProperties3));
        System.assertEquals(false, comDayCqCommonsImplExternalizerImplProperties2.equals(comDayCqCommonsImplExternalizerImplProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASComDayCqCommonsImplExternalizerIm comDayCqCommonsImplExternalizerImplProperties1 = OASComDayCqCommonsImplExternalizerIm.getExample();
        OASComDayCqCommonsImplExternalizerIm comDayCqCommonsImplExternalizerImplProperties2 = new OASComDayCqCommonsImplExternalizerIm();

        System.assertEquals(comDayCqCommonsImplExternalizerImplProperties1.hashCode(), comDayCqCommonsImplExternalizerImplProperties1.hashCode());
        System.assertEquals(comDayCqCommonsImplExternalizerImplProperties2.hashCode(), comDayCqCommonsImplExternalizerImplProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASComDayCqCommonsImplExternalizerIm comDayCqCommonsImplExternalizerImplProperties1 = OASComDayCqCommonsImplExternalizerIm.getExample();
        OASComDayCqCommonsImplExternalizerIm comDayCqCommonsImplExternalizerImplProperties2 = OASComDayCqCommonsImplExternalizerIm.getExample();
        OASComDayCqCommonsImplExternalizerIm comDayCqCommonsImplExternalizerImplProperties3 = new OASComDayCqCommonsImplExternalizerIm();
        OASComDayCqCommonsImplExternalizerIm comDayCqCommonsImplExternalizerImplProperties4 = new OASComDayCqCommonsImplExternalizerIm();

        System.assert(comDayCqCommonsImplExternalizerImplProperties1.equals(comDayCqCommonsImplExternalizerImplProperties2));
        System.assert(comDayCqCommonsImplExternalizerImplProperties3.equals(comDayCqCommonsImplExternalizerImplProperties4));
        System.assertEquals(comDayCqCommonsImplExternalizerImplProperties1.hashCode(), comDayCqCommonsImplExternalizerImplProperties2.hashCode());
        System.assertEquals(comDayCqCommonsImplExternalizerImplProperties3.hashCode(), comDayCqCommonsImplExternalizerImplProperties4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASComDayCqCommonsImplExternalizerIm comDayCqCommonsImplExternalizerImplProperties = new OASComDayCqCommonsImplExternalizerIm();
        Map<String, String> propertyMappings = comDayCqCommonsImplExternalizerImplProperties.getPropertyMappings();
        System.assertEquals('externalizerDomains', propertyMappings.get('externalizer.domains'));
        System.assertEquals('externalizerHost', propertyMappings.get('externalizer.host'));
        System.assertEquals('externalizerContextpath', propertyMappings.get('externalizer.contextpath'));
        System.assertEquals('externalizerEncodedpath', propertyMappings.get('externalizer.encodedpath'));
    }
}
