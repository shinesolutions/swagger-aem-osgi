@isTest
private class OASComAdobeCqCommerceImplAssetStaticTest {
    @isTest
    private static void equalsSameInstance() {
        OASComAdobeCqCommerceImplAssetStatic comAdobeCqCommerceImplAssetStaticImageHandlerProperties1 = OASComAdobeCqCommerceImplAssetStatic.getExample();
        OASComAdobeCqCommerceImplAssetStatic comAdobeCqCommerceImplAssetStaticImageHandlerProperties2 = comAdobeCqCommerceImplAssetStaticImageHandlerProperties1;
        OASComAdobeCqCommerceImplAssetStatic comAdobeCqCommerceImplAssetStaticImageHandlerProperties3 = new OASComAdobeCqCommerceImplAssetStatic();
        OASComAdobeCqCommerceImplAssetStatic comAdobeCqCommerceImplAssetStaticImageHandlerProperties4 = comAdobeCqCommerceImplAssetStaticImageHandlerProperties3;

        System.assert(comAdobeCqCommerceImplAssetStaticImageHandlerProperties1.equals(comAdobeCqCommerceImplAssetStaticImageHandlerProperties2));
        System.assert(comAdobeCqCommerceImplAssetStaticImageHandlerProperties2.equals(comAdobeCqCommerceImplAssetStaticImageHandlerProperties1));
        System.assert(comAdobeCqCommerceImplAssetStaticImageHandlerProperties1.equals(comAdobeCqCommerceImplAssetStaticImageHandlerProperties1));
        System.assert(comAdobeCqCommerceImplAssetStaticImageHandlerProperties3.equals(comAdobeCqCommerceImplAssetStaticImageHandlerProperties4));
        System.assert(comAdobeCqCommerceImplAssetStaticImageHandlerProperties4.equals(comAdobeCqCommerceImplAssetStaticImageHandlerProperties3));
        System.assert(comAdobeCqCommerceImplAssetStaticImageHandlerProperties3.equals(comAdobeCqCommerceImplAssetStaticImageHandlerProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASComAdobeCqCommerceImplAssetStatic comAdobeCqCommerceImplAssetStaticImageHandlerProperties1 = OASComAdobeCqCommerceImplAssetStatic.getExample();
        OASComAdobeCqCommerceImplAssetStatic comAdobeCqCommerceImplAssetStaticImageHandlerProperties2 = OASComAdobeCqCommerceImplAssetStatic.getExample();
        OASComAdobeCqCommerceImplAssetStatic comAdobeCqCommerceImplAssetStaticImageHandlerProperties3 = new OASComAdobeCqCommerceImplAssetStatic();
        OASComAdobeCqCommerceImplAssetStatic comAdobeCqCommerceImplAssetStaticImageHandlerProperties4 = new OASComAdobeCqCommerceImplAssetStatic();

        System.assert(comAdobeCqCommerceImplAssetStaticImageHandlerProperties1.equals(comAdobeCqCommerceImplAssetStaticImageHandlerProperties2));
        System.assert(comAdobeCqCommerceImplAssetStaticImageHandlerProperties2.equals(comAdobeCqCommerceImplAssetStaticImageHandlerProperties1));
        System.assert(comAdobeCqCommerceImplAssetStaticImageHandlerProperties3.equals(comAdobeCqCommerceImplAssetStaticImageHandlerProperties4));
        System.assert(comAdobeCqCommerceImplAssetStaticImageHandlerProperties4.equals(comAdobeCqCommerceImplAssetStaticImageHandlerProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASComAdobeCqCommerceImplAssetStatic comAdobeCqCommerceImplAssetStaticImageHandlerProperties1 = OASComAdobeCqCommerceImplAssetStatic.getExample();
        OASComAdobeCqCommerceImplAssetStatic comAdobeCqCommerceImplAssetStaticImageHandlerProperties2 = new OASComAdobeCqCommerceImplAssetStatic();

        System.assertEquals(false, comAdobeCqCommerceImplAssetStaticImageHandlerProperties1.equals('foo'));
        System.assertEquals(false, comAdobeCqCommerceImplAssetStaticImageHandlerProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASComAdobeCqCommerceImplAssetStatic comAdobeCqCommerceImplAssetStaticImageHandlerProperties1 = OASComAdobeCqCommerceImplAssetStatic.getExample();
        OASComAdobeCqCommerceImplAssetStatic comAdobeCqCommerceImplAssetStaticImageHandlerProperties2 = new OASComAdobeCqCommerceImplAssetStatic();
        OASComAdobeCqCommerceImplAssetStatic comAdobeCqCommerceImplAssetStaticImageHandlerProperties3;

        System.assertEquals(false, comAdobeCqCommerceImplAssetStaticImageHandlerProperties1.equals(comAdobeCqCommerceImplAssetStaticImageHandlerProperties3));
        System.assertEquals(false, comAdobeCqCommerceImplAssetStaticImageHandlerProperties2.equals(comAdobeCqCommerceImplAssetStaticImageHandlerProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASComAdobeCqCommerceImplAssetStatic comAdobeCqCommerceImplAssetStaticImageHandlerProperties1 = OASComAdobeCqCommerceImplAssetStatic.getExample();
        OASComAdobeCqCommerceImplAssetStatic comAdobeCqCommerceImplAssetStaticImageHandlerProperties2 = new OASComAdobeCqCommerceImplAssetStatic();

        System.assertEquals(comAdobeCqCommerceImplAssetStaticImageHandlerProperties1.hashCode(), comAdobeCqCommerceImplAssetStaticImageHandlerProperties1.hashCode());
        System.assertEquals(comAdobeCqCommerceImplAssetStaticImageHandlerProperties2.hashCode(), comAdobeCqCommerceImplAssetStaticImageHandlerProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASComAdobeCqCommerceImplAssetStatic comAdobeCqCommerceImplAssetStaticImageHandlerProperties1 = OASComAdobeCqCommerceImplAssetStatic.getExample();
        OASComAdobeCqCommerceImplAssetStatic comAdobeCqCommerceImplAssetStaticImageHandlerProperties2 = OASComAdobeCqCommerceImplAssetStatic.getExample();
        OASComAdobeCqCommerceImplAssetStatic comAdobeCqCommerceImplAssetStaticImageHandlerProperties3 = new OASComAdobeCqCommerceImplAssetStatic();
        OASComAdobeCqCommerceImplAssetStatic comAdobeCqCommerceImplAssetStaticImageHandlerProperties4 = new OASComAdobeCqCommerceImplAssetStatic();

        System.assert(comAdobeCqCommerceImplAssetStaticImageHandlerProperties1.equals(comAdobeCqCommerceImplAssetStaticImageHandlerProperties2));
        System.assert(comAdobeCqCommerceImplAssetStaticImageHandlerProperties3.equals(comAdobeCqCommerceImplAssetStaticImageHandlerProperties4));
        System.assertEquals(comAdobeCqCommerceImplAssetStaticImageHandlerProperties1.hashCode(), comAdobeCqCommerceImplAssetStaticImageHandlerProperties2.hashCode());
        System.assertEquals(comAdobeCqCommerceImplAssetStaticImageHandlerProperties3.hashCode(), comAdobeCqCommerceImplAssetStaticImageHandlerProperties4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASComAdobeCqCommerceImplAssetStatic comAdobeCqCommerceImplAssetStaticImageHandlerProperties = new OASComAdobeCqCommerceImplAssetStatic();
        Map<String, String> propertyMappings = comAdobeCqCommerceImplAssetStaticImageHandlerProperties.getPropertyMappings();
        System.assertEquals('cqCommerceAssetHandlerActive', propertyMappings.get('cq.commerce.asset.handler.active'));
        System.assertEquals('cqCommerceAssetHandlerName', propertyMappings.get('cq.commerce.asset.handler.name'));
    }
}
