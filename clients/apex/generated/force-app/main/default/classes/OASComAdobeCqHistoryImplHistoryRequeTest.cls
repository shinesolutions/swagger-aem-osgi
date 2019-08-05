@isTest
private class OASComAdobeCqHistoryImplHistoryRequeTest {
    @isTest
    private static void equalsSameInstance() {
        OASComAdobeCqHistoryImplHistoryReque comAdobeCqHistoryImplHistoryRequestFilterProperties1 = OASComAdobeCqHistoryImplHistoryReque.getExample();
        OASComAdobeCqHistoryImplHistoryReque comAdobeCqHistoryImplHistoryRequestFilterProperties2 = comAdobeCqHistoryImplHistoryRequestFilterProperties1;
        OASComAdobeCqHistoryImplHistoryReque comAdobeCqHistoryImplHistoryRequestFilterProperties3 = new OASComAdobeCqHistoryImplHistoryReque();
        OASComAdobeCqHistoryImplHistoryReque comAdobeCqHistoryImplHistoryRequestFilterProperties4 = comAdobeCqHistoryImplHistoryRequestFilterProperties3;

        System.assert(comAdobeCqHistoryImplHistoryRequestFilterProperties1.equals(comAdobeCqHistoryImplHistoryRequestFilterProperties2));
        System.assert(comAdobeCqHistoryImplHistoryRequestFilterProperties2.equals(comAdobeCqHistoryImplHistoryRequestFilterProperties1));
        System.assert(comAdobeCqHistoryImplHistoryRequestFilterProperties1.equals(comAdobeCqHistoryImplHistoryRequestFilterProperties1));
        System.assert(comAdobeCqHistoryImplHistoryRequestFilterProperties3.equals(comAdobeCqHistoryImplHistoryRequestFilterProperties4));
        System.assert(comAdobeCqHistoryImplHistoryRequestFilterProperties4.equals(comAdobeCqHistoryImplHistoryRequestFilterProperties3));
        System.assert(comAdobeCqHistoryImplHistoryRequestFilterProperties3.equals(comAdobeCqHistoryImplHistoryRequestFilterProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASComAdobeCqHistoryImplHistoryReque comAdobeCqHistoryImplHistoryRequestFilterProperties1 = OASComAdobeCqHistoryImplHistoryReque.getExample();
        OASComAdobeCqHistoryImplHistoryReque comAdobeCqHistoryImplHistoryRequestFilterProperties2 = OASComAdobeCqHistoryImplHistoryReque.getExample();
        OASComAdobeCqHistoryImplHistoryReque comAdobeCqHistoryImplHistoryRequestFilterProperties3 = new OASComAdobeCqHistoryImplHistoryReque();
        OASComAdobeCqHistoryImplHistoryReque comAdobeCqHistoryImplHistoryRequestFilterProperties4 = new OASComAdobeCqHistoryImplHistoryReque();

        System.assert(comAdobeCqHistoryImplHistoryRequestFilterProperties1.equals(comAdobeCqHistoryImplHistoryRequestFilterProperties2));
        System.assert(comAdobeCqHistoryImplHistoryRequestFilterProperties2.equals(comAdobeCqHistoryImplHistoryRequestFilterProperties1));
        System.assert(comAdobeCqHistoryImplHistoryRequestFilterProperties3.equals(comAdobeCqHistoryImplHistoryRequestFilterProperties4));
        System.assert(comAdobeCqHistoryImplHistoryRequestFilterProperties4.equals(comAdobeCqHistoryImplHistoryRequestFilterProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASComAdobeCqHistoryImplHistoryReque comAdobeCqHistoryImplHistoryRequestFilterProperties1 = OASComAdobeCqHistoryImplHistoryReque.getExample();
        OASComAdobeCqHistoryImplHistoryReque comAdobeCqHistoryImplHistoryRequestFilterProperties2 = new OASComAdobeCqHistoryImplHistoryReque();

        System.assertEquals(false, comAdobeCqHistoryImplHistoryRequestFilterProperties1.equals('foo'));
        System.assertEquals(false, comAdobeCqHistoryImplHistoryRequestFilterProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASComAdobeCqHistoryImplHistoryReque comAdobeCqHistoryImplHistoryRequestFilterProperties1 = OASComAdobeCqHistoryImplHistoryReque.getExample();
        OASComAdobeCqHistoryImplHistoryReque comAdobeCqHistoryImplHistoryRequestFilterProperties2 = new OASComAdobeCqHistoryImplHistoryReque();
        OASComAdobeCqHistoryImplHistoryReque comAdobeCqHistoryImplHistoryRequestFilterProperties3;

        System.assertEquals(false, comAdobeCqHistoryImplHistoryRequestFilterProperties1.equals(comAdobeCqHistoryImplHistoryRequestFilterProperties3));
        System.assertEquals(false, comAdobeCqHistoryImplHistoryRequestFilterProperties2.equals(comAdobeCqHistoryImplHistoryRequestFilterProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASComAdobeCqHistoryImplHistoryReque comAdobeCqHistoryImplHistoryRequestFilterProperties1 = OASComAdobeCqHistoryImplHistoryReque.getExample();
        OASComAdobeCqHistoryImplHistoryReque comAdobeCqHistoryImplHistoryRequestFilterProperties2 = new OASComAdobeCqHistoryImplHistoryReque();

        System.assertEquals(comAdobeCqHistoryImplHistoryRequestFilterProperties1.hashCode(), comAdobeCqHistoryImplHistoryRequestFilterProperties1.hashCode());
        System.assertEquals(comAdobeCqHistoryImplHistoryRequestFilterProperties2.hashCode(), comAdobeCqHistoryImplHistoryRequestFilterProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASComAdobeCqHistoryImplHistoryReque comAdobeCqHistoryImplHistoryRequestFilterProperties1 = OASComAdobeCqHistoryImplHistoryReque.getExample();
        OASComAdobeCqHistoryImplHistoryReque comAdobeCqHistoryImplHistoryRequestFilterProperties2 = OASComAdobeCqHistoryImplHistoryReque.getExample();
        OASComAdobeCqHistoryImplHistoryReque comAdobeCqHistoryImplHistoryRequestFilterProperties3 = new OASComAdobeCqHistoryImplHistoryReque();
        OASComAdobeCqHistoryImplHistoryReque comAdobeCqHistoryImplHistoryRequestFilterProperties4 = new OASComAdobeCqHistoryImplHistoryReque();

        System.assert(comAdobeCqHistoryImplHistoryRequestFilterProperties1.equals(comAdobeCqHistoryImplHistoryRequestFilterProperties2));
        System.assert(comAdobeCqHistoryImplHistoryRequestFilterProperties3.equals(comAdobeCqHistoryImplHistoryRequestFilterProperties4));
        System.assertEquals(comAdobeCqHistoryImplHistoryRequestFilterProperties1.hashCode(), comAdobeCqHistoryImplHistoryRequestFilterProperties2.hashCode());
        System.assertEquals(comAdobeCqHistoryImplHistoryRequestFilterProperties3.hashCode(), comAdobeCqHistoryImplHistoryRequestFilterProperties4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASComAdobeCqHistoryImplHistoryReque comAdobeCqHistoryImplHistoryRequestFilterProperties = new OASComAdobeCqHistoryImplHistoryReque();
        Map<String, String> propertyMappings = comAdobeCqHistoryImplHistoryRequestFilterProperties.getPropertyMappings();
        System.assertEquals('historyRequestFilterExcludedSelectors', propertyMappings.get('history.requestFilter.excludedSelectors'));
        System.assertEquals('historyRequestFilterExcludedExtensions', propertyMappings.get('history.requestFilter.excludedExtensions'));
    }
}
