@isTest
private class OASComAdobeCqCommerceImplPromotionPrTest {
    @isTest
    private static void equalsSameInstance() {
        OASComAdobeCqCommerceImplPromotionPr comAdobeCqCommerceImplPromotionPromotionManagerImplProperties1 = OASComAdobeCqCommerceImplPromotionPr.getExample();
        OASComAdobeCqCommerceImplPromotionPr comAdobeCqCommerceImplPromotionPromotionManagerImplProperties2 = comAdobeCqCommerceImplPromotionPromotionManagerImplProperties1;
        OASComAdobeCqCommerceImplPromotionPr comAdobeCqCommerceImplPromotionPromotionManagerImplProperties3 = new OASComAdobeCqCommerceImplPromotionPr();
        OASComAdobeCqCommerceImplPromotionPr comAdobeCqCommerceImplPromotionPromotionManagerImplProperties4 = comAdobeCqCommerceImplPromotionPromotionManagerImplProperties3;

        System.assert(comAdobeCqCommerceImplPromotionPromotionManagerImplProperties1.equals(comAdobeCqCommerceImplPromotionPromotionManagerImplProperties2));
        System.assert(comAdobeCqCommerceImplPromotionPromotionManagerImplProperties2.equals(comAdobeCqCommerceImplPromotionPromotionManagerImplProperties1));
        System.assert(comAdobeCqCommerceImplPromotionPromotionManagerImplProperties1.equals(comAdobeCqCommerceImplPromotionPromotionManagerImplProperties1));
        System.assert(comAdobeCqCommerceImplPromotionPromotionManagerImplProperties3.equals(comAdobeCqCommerceImplPromotionPromotionManagerImplProperties4));
        System.assert(comAdobeCqCommerceImplPromotionPromotionManagerImplProperties4.equals(comAdobeCqCommerceImplPromotionPromotionManagerImplProperties3));
        System.assert(comAdobeCqCommerceImplPromotionPromotionManagerImplProperties3.equals(comAdobeCqCommerceImplPromotionPromotionManagerImplProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASComAdobeCqCommerceImplPromotionPr comAdobeCqCommerceImplPromotionPromotionManagerImplProperties1 = OASComAdobeCqCommerceImplPromotionPr.getExample();
        OASComAdobeCqCommerceImplPromotionPr comAdobeCqCommerceImplPromotionPromotionManagerImplProperties2 = OASComAdobeCqCommerceImplPromotionPr.getExample();
        OASComAdobeCqCommerceImplPromotionPr comAdobeCqCommerceImplPromotionPromotionManagerImplProperties3 = new OASComAdobeCqCommerceImplPromotionPr();
        OASComAdobeCqCommerceImplPromotionPr comAdobeCqCommerceImplPromotionPromotionManagerImplProperties4 = new OASComAdobeCqCommerceImplPromotionPr();

        System.assert(comAdobeCqCommerceImplPromotionPromotionManagerImplProperties1.equals(comAdobeCqCommerceImplPromotionPromotionManagerImplProperties2));
        System.assert(comAdobeCqCommerceImplPromotionPromotionManagerImplProperties2.equals(comAdobeCqCommerceImplPromotionPromotionManagerImplProperties1));
        System.assert(comAdobeCqCommerceImplPromotionPromotionManagerImplProperties3.equals(comAdobeCqCommerceImplPromotionPromotionManagerImplProperties4));
        System.assert(comAdobeCqCommerceImplPromotionPromotionManagerImplProperties4.equals(comAdobeCqCommerceImplPromotionPromotionManagerImplProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASComAdobeCqCommerceImplPromotionPr comAdobeCqCommerceImplPromotionPromotionManagerImplProperties1 = OASComAdobeCqCommerceImplPromotionPr.getExample();
        OASComAdobeCqCommerceImplPromotionPr comAdobeCqCommerceImplPromotionPromotionManagerImplProperties2 = new OASComAdobeCqCommerceImplPromotionPr();

        System.assertEquals(false, comAdobeCqCommerceImplPromotionPromotionManagerImplProperties1.equals('foo'));
        System.assertEquals(false, comAdobeCqCommerceImplPromotionPromotionManagerImplProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASComAdobeCqCommerceImplPromotionPr comAdobeCqCommerceImplPromotionPromotionManagerImplProperties1 = OASComAdobeCqCommerceImplPromotionPr.getExample();
        OASComAdobeCqCommerceImplPromotionPr comAdobeCqCommerceImplPromotionPromotionManagerImplProperties2 = new OASComAdobeCqCommerceImplPromotionPr();
        OASComAdobeCqCommerceImplPromotionPr comAdobeCqCommerceImplPromotionPromotionManagerImplProperties3;

        System.assertEquals(false, comAdobeCqCommerceImplPromotionPromotionManagerImplProperties1.equals(comAdobeCqCommerceImplPromotionPromotionManagerImplProperties3));
        System.assertEquals(false, comAdobeCqCommerceImplPromotionPromotionManagerImplProperties2.equals(comAdobeCqCommerceImplPromotionPromotionManagerImplProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASComAdobeCqCommerceImplPromotionPr comAdobeCqCommerceImplPromotionPromotionManagerImplProperties1 = OASComAdobeCqCommerceImplPromotionPr.getExample();
        OASComAdobeCqCommerceImplPromotionPr comAdobeCqCommerceImplPromotionPromotionManagerImplProperties2 = new OASComAdobeCqCommerceImplPromotionPr();

        System.assertEquals(comAdobeCqCommerceImplPromotionPromotionManagerImplProperties1.hashCode(), comAdobeCqCommerceImplPromotionPromotionManagerImplProperties1.hashCode());
        System.assertEquals(comAdobeCqCommerceImplPromotionPromotionManagerImplProperties2.hashCode(), comAdobeCqCommerceImplPromotionPromotionManagerImplProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASComAdobeCqCommerceImplPromotionPr comAdobeCqCommerceImplPromotionPromotionManagerImplProperties1 = OASComAdobeCqCommerceImplPromotionPr.getExample();
        OASComAdobeCqCommerceImplPromotionPr comAdobeCqCommerceImplPromotionPromotionManagerImplProperties2 = OASComAdobeCqCommerceImplPromotionPr.getExample();
        OASComAdobeCqCommerceImplPromotionPr comAdobeCqCommerceImplPromotionPromotionManagerImplProperties3 = new OASComAdobeCqCommerceImplPromotionPr();
        OASComAdobeCqCommerceImplPromotionPr comAdobeCqCommerceImplPromotionPromotionManagerImplProperties4 = new OASComAdobeCqCommerceImplPromotionPr();

        System.assert(comAdobeCqCommerceImplPromotionPromotionManagerImplProperties1.equals(comAdobeCqCommerceImplPromotionPromotionManagerImplProperties2));
        System.assert(comAdobeCqCommerceImplPromotionPromotionManagerImplProperties3.equals(comAdobeCqCommerceImplPromotionPromotionManagerImplProperties4));
        System.assertEquals(comAdobeCqCommerceImplPromotionPromotionManagerImplProperties1.hashCode(), comAdobeCqCommerceImplPromotionPromotionManagerImplProperties2.hashCode());
        System.assertEquals(comAdobeCqCommerceImplPromotionPromotionManagerImplProperties3.hashCode(), comAdobeCqCommerceImplPromotionPromotionManagerImplProperties4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASComAdobeCqCommerceImplPromotionPr comAdobeCqCommerceImplPromotionPromotionManagerImplProperties = new OASComAdobeCqCommerceImplPromotionPr();
        Map<String, String> propertyMappings = comAdobeCqCommerceImplPromotionPromotionManagerImplProperties.getPropertyMappings();
        System.assertEquals('cqCommercePromotionRoot', propertyMappings.get('cq.commerce.promotion.root'));
    }
}
