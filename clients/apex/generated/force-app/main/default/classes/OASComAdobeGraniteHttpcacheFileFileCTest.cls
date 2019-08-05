@isTest
private class OASComAdobeGraniteHttpcacheFileFileCTest {
    @isTest
    private static void equalsSameInstance() {
        OASComAdobeGraniteHttpcacheFileFileC comAdobeGraniteHttpcacheFileFileCacheStoreProperties1 = OASComAdobeGraniteHttpcacheFileFileC.getExample();
        OASComAdobeGraniteHttpcacheFileFileC comAdobeGraniteHttpcacheFileFileCacheStoreProperties2 = comAdobeGraniteHttpcacheFileFileCacheStoreProperties1;
        OASComAdobeGraniteHttpcacheFileFileC comAdobeGraniteHttpcacheFileFileCacheStoreProperties3 = new OASComAdobeGraniteHttpcacheFileFileC();
        OASComAdobeGraniteHttpcacheFileFileC comAdobeGraniteHttpcacheFileFileCacheStoreProperties4 = comAdobeGraniteHttpcacheFileFileCacheStoreProperties3;

        System.assert(comAdobeGraniteHttpcacheFileFileCacheStoreProperties1.equals(comAdobeGraniteHttpcacheFileFileCacheStoreProperties2));
        System.assert(comAdobeGraniteHttpcacheFileFileCacheStoreProperties2.equals(comAdobeGraniteHttpcacheFileFileCacheStoreProperties1));
        System.assert(comAdobeGraniteHttpcacheFileFileCacheStoreProperties1.equals(comAdobeGraniteHttpcacheFileFileCacheStoreProperties1));
        System.assert(comAdobeGraniteHttpcacheFileFileCacheStoreProperties3.equals(comAdobeGraniteHttpcacheFileFileCacheStoreProperties4));
        System.assert(comAdobeGraniteHttpcacheFileFileCacheStoreProperties4.equals(comAdobeGraniteHttpcacheFileFileCacheStoreProperties3));
        System.assert(comAdobeGraniteHttpcacheFileFileCacheStoreProperties3.equals(comAdobeGraniteHttpcacheFileFileCacheStoreProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASComAdobeGraniteHttpcacheFileFileC comAdobeGraniteHttpcacheFileFileCacheStoreProperties1 = OASComAdobeGraniteHttpcacheFileFileC.getExample();
        OASComAdobeGraniteHttpcacheFileFileC comAdobeGraniteHttpcacheFileFileCacheStoreProperties2 = OASComAdobeGraniteHttpcacheFileFileC.getExample();
        OASComAdobeGraniteHttpcacheFileFileC comAdobeGraniteHttpcacheFileFileCacheStoreProperties3 = new OASComAdobeGraniteHttpcacheFileFileC();
        OASComAdobeGraniteHttpcacheFileFileC comAdobeGraniteHttpcacheFileFileCacheStoreProperties4 = new OASComAdobeGraniteHttpcacheFileFileC();

        System.assert(comAdobeGraniteHttpcacheFileFileCacheStoreProperties1.equals(comAdobeGraniteHttpcacheFileFileCacheStoreProperties2));
        System.assert(comAdobeGraniteHttpcacheFileFileCacheStoreProperties2.equals(comAdobeGraniteHttpcacheFileFileCacheStoreProperties1));
        System.assert(comAdobeGraniteHttpcacheFileFileCacheStoreProperties3.equals(comAdobeGraniteHttpcacheFileFileCacheStoreProperties4));
        System.assert(comAdobeGraniteHttpcacheFileFileCacheStoreProperties4.equals(comAdobeGraniteHttpcacheFileFileCacheStoreProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASComAdobeGraniteHttpcacheFileFileC comAdobeGraniteHttpcacheFileFileCacheStoreProperties1 = OASComAdobeGraniteHttpcacheFileFileC.getExample();
        OASComAdobeGraniteHttpcacheFileFileC comAdobeGraniteHttpcacheFileFileCacheStoreProperties2 = new OASComAdobeGraniteHttpcacheFileFileC();

        System.assertEquals(false, comAdobeGraniteHttpcacheFileFileCacheStoreProperties1.equals('foo'));
        System.assertEquals(false, comAdobeGraniteHttpcacheFileFileCacheStoreProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASComAdobeGraniteHttpcacheFileFileC comAdobeGraniteHttpcacheFileFileCacheStoreProperties1 = OASComAdobeGraniteHttpcacheFileFileC.getExample();
        OASComAdobeGraniteHttpcacheFileFileC comAdobeGraniteHttpcacheFileFileCacheStoreProperties2 = new OASComAdobeGraniteHttpcacheFileFileC();
        OASComAdobeGraniteHttpcacheFileFileC comAdobeGraniteHttpcacheFileFileCacheStoreProperties3;

        System.assertEquals(false, comAdobeGraniteHttpcacheFileFileCacheStoreProperties1.equals(comAdobeGraniteHttpcacheFileFileCacheStoreProperties3));
        System.assertEquals(false, comAdobeGraniteHttpcacheFileFileCacheStoreProperties2.equals(comAdobeGraniteHttpcacheFileFileCacheStoreProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASComAdobeGraniteHttpcacheFileFileC comAdobeGraniteHttpcacheFileFileCacheStoreProperties1 = OASComAdobeGraniteHttpcacheFileFileC.getExample();
        OASComAdobeGraniteHttpcacheFileFileC comAdobeGraniteHttpcacheFileFileCacheStoreProperties2 = new OASComAdobeGraniteHttpcacheFileFileC();

        System.assertEquals(comAdobeGraniteHttpcacheFileFileCacheStoreProperties1.hashCode(), comAdobeGraniteHttpcacheFileFileCacheStoreProperties1.hashCode());
        System.assertEquals(comAdobeGraniteHttpcacheFileFileCacheStoreProperties2.hashCode(), comAdobeGraniteHttpcacheFileFileCacheStoreProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASComAdobeGraniteHttpcacheFileFileC comAdobeGraniteHttpcacheFileFileCacheStoreProperties1 = OASComAdobeGraniteHttpcacheFileFileC.getExample();
        OASComAdobeGraniteHttpcacheFileFileC comAdobeGraniteHttpcacheFileFileCacheStoreProperties2 = OASComAdobeGraniteHttpcacheFileFileC.getExample();
        OASComAdobeGraniteHttpcacheFileFileC comAdobeGraniteHttpcacheFileFileCacheStoreProperties3 = new OASComAdobeGraniteHttpcacheFileFileC();
        OASComAdobeGraniteHttpcacheFileFileC comAdobeGraniteHttpcacheFileFileCacheStoreProperties4 = new OASComAdobeGraniteHttpcacheFileFileC();

        System.assert(comAdobeGraniteHttpcacheFileFileCacheStoreProperties1.equals(comAdobeGraniteHttpcacheFileFileCacheStoreProperties2));
        System.assert(comAdobeGraniteHttpcacheFileFileCacheStoreProperties3.equals(comAdobeGraniteHttpcacheFileFileCacheStoreProperties4));
        System.assertEquals(comAdobeGraniteHttpcacheFileFileCacheStoreProperties1.hashCode(), comAdobeGraniteHttpcacheFileFileCacheStoreProperties2.hashCode());
        System.assertEquals(comAdobeGraniteHttpcacheFileFileCacheStoreProperties3.hashCode(), comAdobeGraniteHttpcacheFileFileCacheStoreProperties4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASComAdobeGraniteHttpcacheFileFileC comAdobeGraniteHttpcacheFileFileCacheStoreProperties = new OASComAdobeGraniteHttpcacheFileFileC();
        Map<String, String> propertyMappings = comAdobeGraniteHttpcacheFileFileCacheStoreProperties.getPropertyMappings();
        System.assertEquals('comAdobeGraniteHttpcacheFileDocumentRoot', propertyMappings.get('com.adobe.granite.httpcache.file.documentRoot'));
        System.assertEquals('comAdobeGraniteHttpcacheFileIncludeHost', propertyMappings.get('com.adobe.granite.httpcache.file.includeHost'));
    }
}
