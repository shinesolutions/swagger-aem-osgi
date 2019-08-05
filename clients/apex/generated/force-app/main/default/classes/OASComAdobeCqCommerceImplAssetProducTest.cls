@isTest
private class OASComAdobeCqCommerceImplAssetProducTest {
    @isTest
    private static void equalsSameInstance() {
        OASComAdobeCqCommerceImplAssetProduc comAdobeCqCommerceImplAssetProductAssetHandlerProviderImplProperties1 = OASComAdobeCqCommerceImplAssetProduc.getExample();
        OASComAdobeCqCommerceImplAssetProduc comAdobeCqCommerceImplAssetProductAssetHandlerProviderImplProperties2 = comAdobeCqCommerceImplAssetProductAssetHandlerProviderImplProperties1;
        OASComAdobeCqCommerceImplAssetProduc comAdobeCqCommerceImplAssetProductAssetHandlerProviderImplProperties3 = new OASComAdobeCqCommerceImplAssetProduc();
        OASComAdobeCqCommerceImplAssetProduc comAdobeCqCommerceImplAssetProductAssetHandlerProviderImplProperties4 = comAdobeCqCommerceImplAssetProductAssetHandlerProviderImplProperties3;

        System.assert(comAdobeCqCommerceImplAssetProductAssetHandlerProviderImplProperties1.equals(comAdobeCqCommerceImplAssetProductAssetHandlerProviderImplProperties2));
        System.assert(comAdobeCqCommerceImplAssetProductAssetHandlerProviderImplProperties2.equals(comAdobeCqCommerceImplAssetProductAssetHandlerProviderImplProperties1));
        System.assert(comAdobeCqCommerceImplAssetProductAssetHandlerProviderImplProperties1.equals(comAdobeCqCommerceImplAssetProductAssetHandlerProviderImplProperties1));
        System.assert(comAdobeCqCommerceImplAssetProductAssetHandlerProviderImplProperties3.equals(comAdobeCqCommerceImplAssetProductAssetHandlerProviderImplProperties4));
        System.assert(comAdobeCqCommerceImplAssetProductAssetHandlerProviderImplProperties4.equals(comAdobeCqCommerceImplAssetProductAssetHandlerProviderImplProperties3));
        System.assert(comAdobeCqCommerceImplAssetProductAssetHandlerProviderImplProperties3.equals(comAdobeCqCommerceImplAssetProductAssetHandlerProviderImplProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASComAdobeCqCommerceImplAssetProduc comAdobeCqCommerceImplAssetProductAssetHandlerProviderImplProperties1 = OASComAdobeCqCommerceImplAssetProduc.getExample();
        OASComAdobeCqCommerceImplAssetProduc comAdobeCqCommerceImplAssetProductAssetHandlerProviderImplProperties2 = OASComAdobeCqCommerceImplAssetProduc.getExample();
        OASComAdobeCqCommerceImplAssetProduc comAdobeCqCommerceImplAssetProductAssetHandlerProviderImplProperties3 = new OASComAdobeCqCommerceImplAssetProduc();
        OASComAdobeCqCommerceImplAssetProduc comAdobeCqCommerceImplAssetProductAssetHandlerProviderImplProperties4 = new OASComAdobeCqCommerceImplAssetProduc();

        System.assert(comAdobeCqCommerceImplAssetProductAssetHandlerProviderImplProperties1.equals(comAdobeCqCommerceImplAssetProductAssetHandlerProviderImplProperties2));
        System.assert(comAdobeCqCommerceImplAssetProductAssetHandlerProviderImplProperties2.equals(comAdobeCqCommerceImplAssetProductAssetHandlerProviderImplProperties1));
        System.assert(comAdobeCqCommerceImplAssetProductAssetHandlerProviderImplProperties3.equals(comAdobeCqCommerceImplAssetProductAssetHandlerProviderImplProperties4));
        System.assert(comAdobeCqCommerceImplAssetProductAssetHandlerProviderImplProperties4.equals(comAdobeCqCommerceImplAssetProductAssetHandlerProviderImplProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASComAdobeCqCommerceImplAssetProduc comAdobeCqCommerceImplAssetProductAssetHandlerProviderImplProperties1 = OASComAdobeCqCommerceImplAssetProduc.getExample();
        OASComAdobeCqCommerceImplAssetProduc comAdobeCqCommerceImplAssetProductAssetHandlerProviderImplProperties2 = new OASComAdobeCqCommerceImplAssetProduc();

        System.assertEquals(false, comAdobeCqCommerceImplAssetProductAssetHandlerProviderImplProperties1.equals('foo'));
        System.assertEquals(false, comAdobeCqCommerceImplAssetProductAssetHandlerProviderImplProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASComAdobeCqCommerceImplAssetProduc comAdobeCqCommerceImplAssetProductAssetHandlerProviderImplProperties1 = OASComAdobeCqCommerceImplAssetProduc.getExample();
        OASComAdobeCqCommerceImplAssetProduc comAdobeCqCommerceImplAssetProductAssetHandlerProviderImplProperties2 = new OASComAdobeCqCommerceImplAssetProduc();
        OASComAdobeCqCommerceImplAssetProduc comAdobeCqCommerceImplAssetProductAssetHandlerProviderImplProperties3;

        System.assertEquals(false, comAdobeCqCommerceImplAssetProductAssetHandlerProviderImplProperties1.equals(comAdobeCqCommerceImplAssetProductAssetHandlerProviderImplProperties3));
        System.assertEquals(false, comAdobeCqCommerceImplAssetProductAssetHandlerProviderImplProperties2.equals(comAdobeCqCommerceImplAssetProductAssetHandlerProviderImplProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASComAdobeCqCommerceImplAssetProduc comAdobeCqCommerceImplAssetProductAssetHandlerProviderImplProperties1 = OASComAdobeCqCommerceImplAssetProduc.getExample();
        OASComAdobeCqCommerceImplAssetProduc comAdobeCqCommerceImplAssetProductAssetHandlerProviderImplProperties2 = new OASComAdobeCqCommerceImplAssetProduc();

        System.assertEquals(comAdobeCqCommerceImplAssetProductAssetHandlerProviderImplProperties1.hashCode(), comAdobeCqCommerceImplAssetProductAssetHandlerProviderImplProperties1.hashCode());
        System.assertEquals(comAdobeCqCommerceImplAssetProductAssetHandlerProviderImplProperties2.hashCode(), comAdobeCqCommerceImplAssetProductAssetHandlerProviderImplProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASComAdobeCqCommerceImplAssetProduc comAdobeCqCommerceImplAssetProductAssetHandlerProviderImplProperties1 = OASComAdobeCqCommerceImplAssetProduc.getExample();
        OASComAdobeCqCommerceImplAssetProduc comAdobeCqCommerceImplAssetProductAssetHandlerProviderImplProperties2 = OASComAdobeCqCommerceImplAssetProduc.getExample();
        OASComAdobeCqCommerceImplAssetProduc comAdobeCqCommerceImplAssetProductAssetHandlerProviderImplProperties3 = new OASComAdobeCqCommerceImplAssetProduc();
        OASComAdobeCqCommerceImplAssetProduc comAdobeCqCommerceImplAssetProductAssetHandlerProviderImplProperties4 = new OASComAdobeCqCommerceImplAssetProduc();

        System.assert(comAdobeCqCommerceImplAssetProductAssetHandlerProviderImplProperties1.equals(comAdobeCqCommerceImplAssetProductAssetHandlerProviderImplProperties2));
        System.assert(comAdobeCqCommerceImplAssetProductAssetHandlerProviderImplProperties3.equals(comAdobeCqCommerceImplAssetProductAssetHandlerProviderImplProperties4));
        System.assertEquals(comAdobeCqCommerceImplAssetProductAssetHandlerProviderImplProperties1.hashCode(), comAdobeCqCommerceImplAssetProductAssetHandlerProviderImplProperties2.hashCode());
        System.assertEquals(comAdobeCqCommerceImplAssetProductAssetHandlerProviderImplProperties3.hashCode(), comAdobeCqCommerceImplAssetProductAssetHandlerProviderImplProperties4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASComAdobeCqCommerceImplAssetProduc comAdobeCqCommerceImplAssetProductAssetHandlerProviderImplProperties = new OASComAdobeCqCommerceImplAssetProduc();
        Map<String, String> propertyMappings = comAdobeCqCommerceImplAssetProductAssetHandlerProviderImplProperties.getPropertyMappings();
        System.assertEquals('cqCommerceAssetHandlerFallback', propertyMappings.get('cq.commerce.asset.handler.fallback'));
    }
}
