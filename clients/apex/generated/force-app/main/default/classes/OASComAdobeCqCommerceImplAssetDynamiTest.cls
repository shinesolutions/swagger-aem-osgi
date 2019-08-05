@isTest
private class OASComAdobeCqCommerceImplAssetDynamiTest {
    @isTest
    private static void equalsSameInstance() {
        OASComAdobeCqCommerceImplAssetDynami comAdobeCqCommerceImplAssetDynamicImageHandlerProperties1 = OASComAdobeCqCommerceImplAssetDynami.getExample();
        OASComAdobeCqCommerceImplAssetDynami comAdobeCqCommerceImplAssetDynamicImageHandlerProperties2 = comAdobeCqCommerceImplAssetDynamicImageHandlerProperties1;
        OASComAdobeCqCommerceImplAssetDynami comAdobeCqCommerceImplAssetDynamicImageHandlerProperties3 = new OASComAdobeCqCommerceImplAssetDynami();
        OASComAdobeCqCommerceImplAssetDynami comAdobeCqCommerceImplAssetDynamicImageHandlerProperties4 = comAdobeCqCommerceImplAssetDynamicImageHandlerProperties3;

        System.assert(comAdobeCqCommerceImplAssetDynamicImageHandlerProperties1.equals(comAdobeCqCommerceImplAssetDynamicImageHandlerProperties2));
        System.assert(comAdobeCqCommerceImplAssetDynamicImageHandlerProperties2.equals(comAdobeCqCommerceImplAssetDynamicImageHandlerProperties1));
        System.assert(comAdobeCqCommerceImplAssetDynamicImageHandlerProperties1.equals(comAdobeCqCommerceImplAssetDynamicImageHandlerProperties1));
        System.assert(comAdobeCqCommerceImplAssetDynamicImageHandlerProperties3.equals(comAdobeCqCommerceImplAssetDynamicImageHandlerProperties4));
        System.assert(comAdobeCqCommerceImplAssetDynamicImageHandlerProperties4.equals(comAdobeCqCommerceImplAssetDynamicImageHandlerProperties3));
        System.assert(comAdobeCqCommerceImplAssetDynamicImageHandlerProperties3.equals(comAdobeCqCommerceImplAssetDynamicImageHandlerProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASComAdobeCqCommerceImplAssetDynami comAdobeCqCommerceImplAssetDynamicImageHandlerProperties1 = OASComAdobeCqCommerceImplAssetDynami.getExample();
        OASComAdobeCqCommerceImplAssetDynami comAdobeCqCommerceImplAssetDynamicImageHandlerProperties2 = OASComAdobeCqCommerceImplAssetDynami.getExample();
        OASComAdobeCqCommerceImplAssetDynami comAdobeCqCommerceImplAssetDynamicImageHandlerProperties3 = new OASComAdobeCqCommerceImplAssetDynami();
        OASComAdobeCqCommerceImplAssetDynami comAdobeCqCommerceImplAssetDynamicImageHandlerProperties4 = new OASComAdobeCqCommerceImplAssetDynami();

        System.assert(comAdobeCqCommerceImplAssetDynamicImageHandlerProperties1.equals(comAdobeCqCommerceImplAssetDynamicImageHandlerProperties2));
        System.assert(comAdobeCqCommerceImplAssetDynamicImageHandlerProperties2.equals(comAdobeCqCommerceImplAssetDynamicImageHandlerProperties1));
        System.assert(comAdobeCqCommerceImplAssetDynamicImageHandlerProperties3.equals(comAdobeCqCommerceImplAssetDynamicImageHandlerProperties4));
        System.assert(comAdobeCqCommerceImplAssetDynamicImageHandlerProperties4.equals(comAdobeCqCommerceImplAssetDynamicImageHandlerProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASComAdobeCqCommerceImplAssetDynami comAdobeCqCommerceImplAssetDynamicImageHandlerProperties1 = OASComAdobeCqCommerceImplAssetDynami.getExample();
        OASComAdobeCqCommerceImplAssetDynami comAdobeCqCommerceImplAssetDynamicImageHandlerProperties2 = new OASComAdobeCqCommerceImplAssetDynami();

        System.assertEquals(false, comAdobeCqCommerceImplAssetDynamicImageHandlerProperties1.equals('foo'));
        System.assertEquals(false, comAdobeCqCommerceImplAssetDynamicImageHandlerProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASComAdobeCqCommerceImplAssetDynami comAdobeCqCommerceImplAssetDynamicImageHandlerProperties1 = OASComAdobeCqCommerceImplAssetDynami.getExample();
        OASComAdobeCqCommerceImplAssetDynami comAdobeCqCommerceImplAssetDynamicImageHandlerProperties2 = new OASComAdobeCqCommerceImplAssetDynami();
        OASComAdobeCqCommerceImplAssetDynami comAdobeCqCommerceImplAssetDynamicImageHandlerProperties3;

        System.assertEquals(false, comAdobeCqCommerceImplAssetDynamicImageHandlerProperties1.equals(comAdobeCqCommerceImplAssetDynamicImageHandlerProperties3));
        System.assertEquals(false, comAdobeCqCommerceImplAssetDynamicImageHandlerProperties2.equals(comAdobeCqCommerceImplAssetDynamicImageHandlerProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASComAdobeCqCommerceImplAssetDynami comAdobeCqCommerceImplAssetDynamicImageHandlerProperties1 = OASComAdobeCqCommerceImplAssetDynami.getExample();
        OASComAdobeCqCommerceImplAssetDynami comAdobeCqCommerceImplAssetDynamicImageHandlerProperties2 = new OASComAdobeCqCommerceImplAssetDynami();

        System.assertEquals(comAdobeCqCommerceImplAssetDynamicImageHandlerProperties1.hashCode(), comAdobeCqCommerceImplAssetDynamicImageHandlerProperties1.hashCode());
        System.assertEquals(comAdobeCqCommerceImplAssetDynamicImageHandlerProperties2.hashCode(), comAdobeCqCommerceImplAssetDynamicImageHandlerProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASComAdobeCqCommerceImplAssetDynami comAdobeCqCommerceImplAssetDynamicImageHandlerProperties1 = OASComAdobeCqCommerceImplAssetDynami.getExample();
        OASComAdobeCqCommerceImplAssetDynami comAdobeCqCommerceImplAssetDynamicImageHandlerProperties2 = OASComAdobeCqCommerceImplAssetDynami.getExample();
        OASComAdobeCqCommerceImplAssetDynami comAdobeCqCommerceImplAssetDynamicImageHandlerProperties3 = new OASComAdobeCqCommerceImplAssetDynami();
        OASComAdobeCqCommerceImplAssetDynami comAdobeCqCommerceImplAssetDynamicImageHandlerProperties4 = new OASComAdobeCqCommerceImplAssetDynami();

        System.assert(comAdobeCqCommerceImplAssetDynamicImageHandlerProperties1.equals(comAdobeCqCommerceImplAssetDynamicImageHandlerProperties2));
        System.assert(comAdobeCqCommerceImplAssetDynamicImageHandlerProperties3.equals(comAdobeCqCommerceImplAssetDynamicImageHandlerProperties4));
        System.assertEquals(comAdobeCqCommerceImplAssetDynamicImageHandlerProperties1.hashCode(), comAdobeCqCommerceImplAssetDynamicImageHandlerProperties2.hashCode());
        System.assertEquals(comAdobeCqCommerceImplAssetDynamicImageHandlerProperties3.hashCode(), comAdobeCqCommerceImplAssetDynamicImageHandlerProperties4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASComAdobeCqCommerceImplAssetDynami comAdobeCqCommerceImplAssetDynamicImageHandlerProperties = new OASComAdobeCqCommerceImplAssetDynami();
        Map<String, String> propertyMappings = comAdobeCqCommerceImplAssetDynamicImageHandlerProperties.getPropertyMappings();
        System.assertEquals('cqCommerceAssetHandlerActive', propertyMappings.get('cq.commerce.asset.handler.active'));
        System.assertEquals('cqCommerceAssetHandlerName', propertyMappings.get('cq.commerce.asset.handler.name'));
    }
}
