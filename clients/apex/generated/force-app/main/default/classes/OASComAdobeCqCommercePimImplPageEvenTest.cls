@isTest
private class OASComAdobeCqCommercePimImplPageEvenTest {
    @isTest
    private static void equalsSameInstance() {
        OASComAdobeCqCommercePimImplPageEven comAdobeCqCommercePimImplPageEventListenerProperties1 = OASComAdobeCqCommercePimImplPageEven.getExample();
        OASComAdobeCqCommercePimImplPageEven comAdobeCqCommercePimImplPageEventListenerProperties2 = comAdobeCqCommercePimImplPageEventListenerProperties1;
        OASComAdobeCqCommercePimImplPageEven comAdobeCqCommercePimImplPageEventListenerProperties3 = new OASComAdobeCqCommercePimImplPageEven();
        OASComAdobeCqCommercePimImplPageEven comAdobeCqCommercePimImplPageEventListenerProperties4 = comAdobeCqCommercePimImplPageEventListenerProperties3;

        System.assert(comAdobeCqCommercePimImplPageEventListenerProperties1.equals(comAdobeCqCommercePimImplPageEventListenerProperties2));
        System.assert(comAdobeCqCommercePimImplPageEventListenerProperties2.equals(comAdobeCqCommercePimImplPageEventListenerProperties1));
        System.assert(comAdobeCqCommercePimImplPageEventListenerProperties1.equals(comAdobeCqCommercePimImplPageEventListenerProperties1));
        System.assert(comAdobeCqCommercePimImplPageEventListenerProperties3.equals(comAdobeCqCommercePimImplPageEventListenerProperties4));
        System.assert(comAdobeCqCommercePimImplPageEventListenerProperties4.equals(comAdobeCqCommercePimImplPageEventListenerProperties3));
        System.assert(comAdobeCqCommercePimImplPageEventListenerProperties3.equals(comAdobeCqCommercePimImplPageEventListenerProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASComAdobeCqCommercePimImplPageEven comAdobeCqCommercePimImplPageEventListenerProperties1 = OASComAdobeCqCommercePimImplPageEven.getExample();
        OASComAdobeCqCommercePimImplPageEven comAdobeCqCommercePimImplPageEventListenerProperties2 = OASComAdobeCqCommercePimImplPageEven.getExample();
        OASComAdobeCqCommercePimImplPageEven comAdobeCqCommercePimImplPageEventListenerProperties3 = new OASComAdobeCqCommercePimImplPageEven();
        OASComAdobeCqCommercePimImplPageEven comAdobeCqCommercePimImplPageEventListenerProperties4 = new OASComAdobeCqCommercePimImplPageEven();

        System.assert(comAdobeCqCommercePimImplPageEventListenerProperties1.equals(comAdobeCqCommercePimImplPageEventListenerProperties2));
        System.assert(comAdobeCqCommercePimImplPageEventListenerProperties2.equals(comAdobeCqCommercePimImplPageEventListenerProperties1));
        System.assert(comAdobeCqCommercePimImplPageEventListenerProperties3.equals(comAdobeCqCommercePimImplPageEventListenerProperties4));
        System.assert(comAdobeCqCommercePimImplPageEventListenerProperties4.equals(comAdobeCqCommercePimImplPageEventListenerProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASComAdobeCqCommercePimImplPageEven comAdobeCqCommercePimImplPageEventListenerProperties1 = OASComAdobeCqCommercePimImplPageEven.getExample();
        OASComAdobeCqCommercePimImplPageEven comAdobeCqCommercePimImplPageEventListenerProperties2 = new OASComAdobeCqCommercePimImplPageEven();

        System.assertEquals(false, comAdobeCqCommercePimImplPageEventListenerProperties1.equals('foo'));
        System.assertEquals(false, comAdobeCqCommercePimImplPageEventListenerProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASComAdobeCqCommercePimImplPageEven comAdobeCqCommercePimImplPageEventListenerProperties1 = OASComAdobeCqCommercePimImplPageEven.getExample();
        OASComAdobeCqCommercePimImplPageEven comAdobeCqCommercePimImplPageEventListenerProperties2 = new OASComAdobeCqCommercePimImplPageEven();
        OASComAdobeCqCommercePimImplPageEven comAdobeCqCommercePimImplPageEventListenerProperties3;

        System.assertEquals(false, comAdobeCqCommercePimImplPageEventListenerProperties1.equals(comAdobeCqCommercePimImplPageEventListenerProperties3));
        System.assertEquals(false, comAdobeCqCommercePimImplPageEventListenerProperties2.equals(comAdobeCqCommercePimImplPageEventListenerProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASComAdobeCqCommercePimImplPageEven comAdobeCqCommercePimImplPageEventListenerProperties1 = OASComAdobeCqCommercePimImplPageEven.getExample();
        OASComAdobeCqCommercePimImplPageEven comAdobeCqCommercePimImplPageEventListenerProperties2 = new OASComAdobeCqCommercePimImplPageEven();

        System.assertEquals(comAdobeCqCommercePimImplPageEventListenerProperties1.hashCode(), comAdobeCqCommercePimImplPageEventListenerProperties1.hashCode());
        System.assertEquals(comAdobeCqCommercePimImplPageEventListenerProperties2.hashCode(), comAdobeCqCommercePimImplPageEventListenerProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASComAdobeCqCommercePimImplPageEven comAdobeCqCommercePimImplPageEventListenerProperties1 = OASComAdobeCqCommercePimImplPageEven.getExample();
        OASComAdobeCqCommercePimImplPageEven comAdobeCqCommercePimImplPageEventListenerProperties2 = OASComAdobeCqCommercePimImplPageEven.getExample();
        OASComAdobeCqCommercePimImplPageEven comAdobeCqCommercePimImplPageEventListenerProperties3 = new OASComAdobeCqCommercePimImplPageEven();
        OASComAdobeCqCommercePimImplPageEven comAdobeCqCommercePimImplPageEventListenerProperties4 = new OASComAdobeCqCommercePimImplPageEven();

        System.assert(comAdobeCqCommercePimImplPageEventListenerProperties1.equals(comAdobeCqCommercePimImplPageEventListenerProperties2));
        System.assert(comAdobeCqCommercePimImplPageEventListenerProperties3.equals(comAdobeCqCommercePimImplPageEventListenerProperties4));
        System.assertEquals(comAdobeCqCommercePimImplPageEventListenerProperties1.hashCode(), comAdobeCqCommercePimImplPageEventListenerProperties2.hashCode());
        System.assertEquals(comAdobeCqCommercePimImplPageEventListenerProperties3.hashCode(), comAdobeCqCommercePimImplPageEventListenerProperties4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASComAdobeCqCommercePimImplPageEven comAdobeCqCommercePimImplPageEventListenerProperties = new OASComAdobeCqCommercePimImplPageEven();
        Map<String, String> propertyMappings = comAdobeCqCommercePimImplPageEventListenerProperties.getPropertyMappings();
        System.assertEquals('cqCommercePageeventlistenerEnabled', propertyMappings.get('cq.commerce.pageeventlistener.enabled'));
    }
}
