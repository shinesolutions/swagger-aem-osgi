@isTest
private class OASComAdobeCqCommerceImplAssetVideoHTest {
    @isTest
    private static void equalsSameInstance() {
        OASComAdobeCqCommerceImplAssetVideoH comAdobeCqCommerceImplAssetVideoHandlerProperties1 = OASComAdobeCqCommerceImplAssetVideoH.getExample();
        OASComAdobeCqCommerceImplAssetVideoH comAdobeCqCommerceImplAssetVideoHandlerProperties2 = comAdobeCqCommerceImplAssetVideoHandlerProperties1;
        OASComAdobeCqCommerceImplAssetVideoH comAdobeCqCommerceImplAssetVideoHandlerProperties3 = new OASComAdobeCqCommerceImplAssetVideoH();
        OASComAdobeCqCommerceImplAssetVideoH comAdobeCqCommerceImplAssetVideoHandlerProperties4 = comAdobeCqCommerceImplAssetVideoHandlerProperties3;

        System.assert(comAdobeCqCommerceImplAssetVideoHandlerProperties1.equals(comAdobeCqCommerceImplAssetVideoHandlerProperties2));
        System.assert(comAdobeCqCommerceImplAssetVideoHandlerProperties2.equals(comAdobeCqCommerceImplAssetVideoHandlerProperties1));
        System.assert(comAdobeCqCommerceImplAssetVideoHandlerProperties1.equals(comAdobeCqCommerceImplAssetVideoHandlerProperties1));
        System.assert(comAdobeCqCommerceImplAssetVideoHandlerProperties3.equals(comAdobeCqCommerceImplAssetVideoHandlerProperties4));
        System.assert(comAdobeCqCommerceImplAssetVideoHandlerProperties4.equals(comAdobeCqCommerceImplAssetVideoHandlerProperties3));
        System.assert(comAdobeCqCommerceImplAssetVideoHandlerProperties3.equals(comAdobeCqCommerceImplAssetVideoHandlerProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASComAdobeCqCommerceImplAssetVideoH comAdobeCqCommerceImplAssetVideoHandlerProperties1 = OASComAdobeCqCommerceImplAssetVideoH.getExample();
        OASComAdobeCqCommerceImplAssetVideoH comAdobeCqCommerceImplAssetVideoHandlerProperties2 = OASComAdobeCqCommerceImplAssetVideoH.getExample();
        OASComAdobeCqCommerceImplAssetVideoH comAdobeCqCommerceImplAssetVideoHandlerProperties3 = new OASComAdobeCqCommerceImplAssetVideoH();
        OASComAdobeCqCommerceImplAssetVideoH comAdobeCqCommerceImplAssetVideoHandlerProperties4 = new OASComAdobeCqCommerceImplAssetVideoH();

        System.assert(comAdobeCqCommerceImplAssetVideoHandlerProperties1.equals(comAdobeCqCommerceImplAssetVideoHandlerProperties2));
        System.assert(comAdobeCqCommerceImplAssetVideoHandlerProperties2.equals(comAdobeCqCommerceImplAssetVideoHandlerProperties1));
        System.assert(comAdobeCqCommerceImplAssetVideoHandlerProperties3.equals(comAdobeCqCommerceImplAssetVideoHandlerProperties4));
        System.assert(comAdobeCqCommerceImplAssetVideoHandlerProperties4.equals(comAdobeCqCommerceImplAssetVideoHandlerProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASComAdobeCqCommerceImplAssetVideoH comAdobeCqCommerceImplAssetVideoHandlerProperties1 = OASComAdobeCqCommerceImplAssetVideoH.getExample();
        OASComAdobeCqCommerceImplAssetVideoH comAdobeCqCommerceImplAssetVideoHandlerProperties2 = new OASComAdobeCqCommerceImplAssetVideoH();

        System.assertEquals(false, comAdobeCqCommerceImplAssetVideoHandlerProperties1.equals('foo'));
        System.assertEquals(false, comAdobeCqCommerceImplAssetVideoHandlerProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASComAdobeCqCommerceImplAssetVideoH comAdobeCqCommerceImplAssetVideoHandlerProperties1 = OASComAdobeCqCommerceImplAssetVideoH.getExample();
        OASComAdobeCqCommerceImplAssetVideoH comAdobeCqCommerceImplAssetVideoHandlerProperties2 = new OASComAdobeCqCommerceImplAssetVideoH();
        OASComAdobeCqCommerceImplAssetVideoH comAdobeCqCommerceImplAssetVideoHandlerProperties3;

        System.assertEquals(false, comAdobeCqCommerceImplAssetVideoHandlerProperties1.equals(comAdobeCqCommerceImplAssetVideoHandlerProperties3));
        System.assertEquals(false, comAdobeCqCommerceImplAssetVideoHandlerProperties2.equals(comAdobeCqCommerceImplAssetVideoHandlerProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASComAdobeCqCommerceImplAssetVideoH comAdobeCqCommerceImplAssetVideoHandlerProperties1 = OASComAdobeCqCommerceImplAssetVideoH.getExample();
        OASComAdobeCqCommerceImplAssetVideoH comAdobeCqCommerceImplAssetVideoHandlerProperties2 = new OASComAdobeCqCommerceImplAssetVideoH();

        System.assertEquals(comAdobeCqCommerceImplAssetVideoHandlerProperties1.hashCode(), comAdobeCqCommerceImplAssetVideoHandlerProperties1.hashCode());
        System.assertEquals(comAdobeCqCommerceImplAssetVideoHandlerProperties2.hashCode(), comAdobeCqCommerceImplAssetVideoHandlerProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASComAdobeCqCommerceImplAssetVideoH comAdobeCqCommerceImplAssetVideoHandlerProperties1 = OASComAdobeCqCommerceImplAssetVideoH.getExample();
        OASComAdobeCqCommerceImplAssetVideoH comAdobeCqCommerceImplAssetVideoHandlerProperties2 = OASComAdobeCqCommerceImplAssetVideoH.getExample();
        OASComAdobeCqCommerceImplAssetVideoH comAdobeCqCommerceImplAssetVideoHandlerProperties3 = new OASComAdobeCqCommerceImplAssetVideoH();
        OASComAdobeCqCommerceImplAssetVideoH comAdobeCqCommerceImplAssetVideoHandlerProperties4 = new OASComAdobeCqCommerceImplAssetVideoH();

        System.assert(comAdobeCqCommerceImplAssetVideoHandlerProperties1.equals(comAdobeCqCommerceImplAssetVideoHandlerProperties2));
        System.assert(comAdobeCqCommerceImplAssetVideoHandlerProperties3.equals(comAdobeCqCommerceImplAssetVideoHandlerProperties4));
        System.assertEquals(comAdobeCqCommerceImplAssetVideoHandlerProperties1.hashCode(), comAdobeCqCommerceImplAssetVideoHandlerProperties2.hashCode());
        System.assertEquals(comAdobeCqCommerceImplAssetVideoHandlerProperties3.hashCode(), comAdobeCqCommerceImplAssetVideoHandlerProperties4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASComAdobeCqCommerceImplAssetVideoH comAdobeCqCommerceImplAssetVideoHandlerProperties = new OASComAdobeCqCommerceImplAssetVideoH();
        Map<String, String> propertyMappings = comAdobeCqCommerceImplAssetVideoHandlerProperties.getPropertyMappings();
        System.assertEquals('cqCommerceAssetHandlerActive', propertyMappings.get('cq.commerce.asset.handler.active'));
        System.assertEquals('cqCommerceAssetHandlerName', propertyMappings.get('cq.commerce.asset.handler.name'));
    }
}
