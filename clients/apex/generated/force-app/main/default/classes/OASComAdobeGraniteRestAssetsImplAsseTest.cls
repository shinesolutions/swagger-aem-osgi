@isTest
private class OASComAdobeGraniteRestAssetsImplAsseTest {
    @isTest
    private static void equalsSameInstance() {
        OASComAdobeGraniteRestAssetsImplAsse comAdobeGraniteRestAssetsImplAssetContentDispositionFilterProperties1 = OASComAdobeGraniteRestAssetsImplAsse.getExample();
        OASComAdobeGraniteRestAssetsImplAsse comAdobeGraniteRestAssetsImplAssetContentDispositionFilterProperties2 = comAdobeGraniteRestAssetsImplAssetContentDispositionFilterProperties1;
        OASComAdobeGraniteRestAssetsImplAsse comAdobeGraniteRestAssetsImplAssetContentDispositionFilterProperties3 = new OASComAdobeGraniteRestAssetsImplAsse();
        OASComAdobeGraniteRestAssetsImplAsse comAdobeGraniteRestAssetsImplAssetContentDispositionFilterProperties4 = comAdobeGraniteRestAssetsImplAssetContentDispositionFilterProperties3;

        System.assert(comAdobeGraniteRestAssetsImplAssetContentDispositionFilterProperties1.equals(comAdobeGraniteRestAssetsImplAssetContentDispositionFilterProperties2));
        System.assert(comAdobeGraniteRestAssetsImplAssetContentDispositionFilterProperties2.equals(comAdobeGraniteRestAssetsImplAssetContentDispositionFilterProperties1));
        System.assert(comAdobeGraniteRestAssetsImplAssetContentDispositionFilterProperties1.equals(comAdobeGraniteRestAssetsImplAssetContentDispositionFilterProperties1));
        System.assert(comAdobeGraniteRestAssetsImplAssetContentDispositionFilterProperties3.equals(comAdobeGraniteRestAssetsImplAssetContentDispositionFilterProperties4));
        System.assert(comAdobeGraniteRestAssetsImplAssetContentDispositionFilterProperties4.equals(comAdobeGraniteRestAssetsImplAssetContentDispositionFilterProperties3));
        System.assert(comAdobeGraniteRestAssetsImplAssetContentDispositionFilterProperties3.equals(comAdobeGraniteRestAssetsImplAssetContentDispositionFilterProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASComAdobeGraniteRestAssetsImplAsse comAdobeGraniteRestAssetsImplAssetContentDispositionFilterProperties1 = OASComAdobeGraniteRestAssetsImplAsse.getExample();
        OASComAdobeGraniteRestAssetsImplAsse comAdobeGraniteRestAssetsImplAssetContentDispositionFilterProperties2 = OASComAdobeGraniteRestAssetsImplAsse.getExample();
        OASComAdobeGraniteRestAssetsImplAsse comAdobeGraniteRestAssetsImplAssetContentDispositionFilterProperties3 = new OASComAdobeGraniteRestAssetsImplAsse();
        OASComAdobeGraniteRestAssetsImplAsse comAdobeGraniteRestAssetsImplAssetContentDispositionFilterProperties4 = new OASComAdobeGraniteRestAssetsImplAsse();

        System.assert(comAdobeGraniteRestAssetsImplAssetContentDispositionFilterProperties1.equals(comAdobeGraniteRestAssetsImplAssetContentDispositionFilterProperties2));
        System.assert(comAdobeGraniteRestAssetsImplAssetContentDispositionFilterProperties2.equals(comAdobeGraniteRestAssetsImplAssetContentDispositionFilterProperties1));
        System.assert(comAdobeGraniteRestAssetsImplAssetContentDispositionFilterProperties3.equals(comAdobeGraniteRestAssetsImplAssetContentDispositionFilterProperties4));
        System.assert(comAdobeGraniteRestAssetsImplAssetContentDispositionFilterProperties4.equals(comAdobeGraniteRestAssetsImplAssetContentDispositionFilterProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASComAdobeGraniteRestAssetsImplAsse comAdobeGraniteRestAssetsImplAssetContentDispositionFilterProperties1 = OASComAdobeGraniteRestAssetsImplAsse.getExample();
        OASComAdobeGraniteRestAssetsImplAsse comAdobeGraniteRestAssetsImplAssetContentDispositionFilterProperties2 = new OASComAdobeGraniteRestAssetsImplAsse();

        System.assertEquals(false, comAdobeGraniteRestAssetsImplAssetContentDispositionFilterProperties1.equals('foo'));
        System.assertEquals(false, comAdobeGraniteRestAssetsImplAssetContentDispositionFilterProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASComAdobeGraniteRestAssetsImplAsse comAdobeGraniteRestAssetsImplAssetContentDispositionFilterProperties1 = OASComAdobeGraniteRestAssetsImplAsse.getExample();
        OASComAdobeGraniteRestAssetsImplAsse comAdobeGraniteRestAssetsImplAssetContentDispositionFilterProperties2 = new OASComAdobeGraniteRestAssetsImplAsse();
        OASComAdobeGraniteRestAssetsImplAsse comAdobeGraniteRestAssetsImplAssetContentDispositionFilterProperties3;

        System.assertEquals(false, comAdobeGraniteRestAssetsImplAssetContentDispositionFilterProperties1.equals(comAdobeGraniteRestAssetsImplAssetContentDispositionFilterProperties3));
        System.assertEquals(false, comAdobeGraniteRestAssetsImplAssetContentDispositionFilterProperties2.equals(comAdobeGraniteRestAssetsImplAssetContentDispositionFilterProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASComAdobeGraniteRestAssetsImplAsse comAdobeGraniteRestAssetsImplAssetContentDispositionFilterProperties1 = OASComAdobeGraniteRestAssetsImplAsse.getExample();
        OASComAdobeGraniteRestAssetsImplAsse comAdobeGraniteRestAssetsImplAssetContentDispositionFilterProperties2 = new OASComAdobeGraniteRestAssetsImplAsse();

        System.assertEquals(comAdobeGraniteRestAssetsImplAssetContentDispositionFilterProperties1.hashCode(), comAdobeGraniteRestAssetsImplAssetContentDispositionFilterProperties1.hashCode());
        System.assertEquals(comAdobeGraniteRestAssetsImplAssetContentDispositionFilterProperties2.hashCode(), comAdobeGraniteRestAssetsImplAssetContentDispositionFilterProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASComAdobeGraniteRestAssetsImplAsse comAdobeGraniteRestAssetsImplAssetContentDispositionFilterProperties1 = OASComAdobeGraniteRestAssetsImplAsse.getExample();
        OASComAdobeGraniteRestAssetsImplAsse comAdobeGraniteRestAssetsImplAssetContentDispositionFilterProperties2 = OASComAdobeGraniteRestAssetsImplAsse.getExample();
        OASComAdobeGraniteRestAssetsImplAsse comAdobeGraniteRestAssetsImplAssetContentDispositionFilterProperties3 = new OASComAdobeGraniteRestAssetsImplAsse();
        OASComAdobeGraniteRestAssetsImplAsse comAdobeGraniteRestAssetsImplAssetContentDispositionFilterProperties4 = new OASComAdobeGraniteRestAssetsImplAsse();

        System.assert(comAdobeGraniteRestAssetsImplAssetContentDispositionFilterProperties1.equals(comAdobeGraniteRestAssetsImplAssetContentDispositionFilterProperties2));
        System.assert(comAdobeGraniteRestAssetsImplAssetContentDispositionFilterProperties3.equals(comAdobeGraniteRestAssetsImplAssetContentDispositionFilterProperties4));
        System.assertEquals(comAdobeGraniteRestAssetsImplAssetContentDispositionFilterProperties1.hashCode(), comAdobeGraniteRestAssetsImplAssetContentDispositionFilterProperties2.hashCode());
        System.assertEquals(comAdobeGraniteRestAssetsImplAssetContentDispositionFilterProperties3.hashCode(), comAdobeGraniteRestAssetsImplAssetContentDispositionFilterProperties4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASComAdobeGraniteRestAssetsImplAsse comAdobeGraniteRestAssetsImplAssetContentDispositionFilterProperties = new OASComAdobeGraniteRestAssetsImplAsse();
        Map<String, String> propertyMappings = comAdobeGraniteRestAssetsImplAssetContentDispositionFilterProperties.getPropertyMappings();
        System.assertEquals('mimeAllowEmpty', propertyMappings.get('mime.allowEmpty'));
        System.assertEquals('mimeAllowed', propertyMappings.get('mime.allowed'));
    }
}
