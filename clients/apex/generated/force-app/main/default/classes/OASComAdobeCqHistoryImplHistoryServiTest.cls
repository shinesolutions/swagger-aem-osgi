@isTest
private class OASComAdobeCqHistoryImplHistoryServiTest {
    @isTest
    private static void equalsSameInstance() {
        OASComAdobeCqHistoryImplHistoryServi comAdobeCqHistoryImplHistoryServiceImplProperties1 = OASComAdobeCqHistoryImplHistoryServi.getExample();
        OASComAdobeCqHistoryImplHistoryServi comAdobeCqHistoryImplHistoryServiceImplProperties2 = comAdobeCqHistoryImplHistoryServiceImplProperties1;
        OASComAdobeCqHistoryImplHistoryServi comAdobeCqHistoryImplHistoryServiceImplProperties3 = new OASComAdobeCqHistoryImplHistoryServi();
        OASComAdobeCqHistoryImplHistoryServi comAdobeCqHistoryImplHistoryServiceImplProperties4 = comAdobeCqHistoryImplHistoryServiceImplProperties3;

        System.assert(comAdobeCqHistoryImplHistoryServiceImplProperties1.equals(comAdobeCqHistoryImplHistoryServiceImplProperties2));
        System.assert(comAdobeCqHistoryImplHistoryServiceImplProperties2.equals(comAdobeCqHistoryImplHistoryServiceImplProperties1));
        System.assert(comAdobeCqHistoryImplHistoryServiceImplProperties1.equals(comAdobeCqHistoryImplHistoryServiceImplProperties1));
        System.assert(comAdobeCqHistoryImplHistoryServiceImplProperties3.equals(comAdobeCqHistoryImplHistoryServiceImplProperties4));
        System.assert(comAdobeCqHistoryImplHistoryServiceImplProperties4.equals(comAdobeCqHistoryImplHistoryServiceImplProperties3));
        System.assert(comAdobeCqHistoryImplHistoryServiceImplProperties3.equals(comAdobeCqHistoryImplHistoryServiceImplProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASComAdobeCqHistoryImplHistoryServi comAdobeCqHistoryImplHistoryServiceImplProperties1 = OASComAdobeCqHistoryImplHistoryServi.getExample();
        OASComAdobeCqHistoryImplHistoryServi comAdobeCqHistoryImplHistoryServiceImplProperties2 = OASComAdobeCqHistoryImplHistoryServi.getExample();
        OASComAdobeCqHistoryImplHistoryServi comAdobeCqHistoryImplHistoryServiceImplProperties3 = new OASComAdobeCqHistoryImplHistoryServi();
        OASComAdobeCqHistoryImplHistoryServi comAdobeCqHistoryImplHistoryServiceImplProperties4 = new OASComAdobeCqHistoryImplHistoryServi();

        System.assert(comAdobeCqHistoryImplHistoryServiceImplProperties1.equals(comAdobeCqHistoryImplHistoryServiceImplProperties2));
        System.assert(comAdobeCqHistoryImplHistoryServiceImplProperties2.equals(comAdobeCqHistoryImplHistoryServiceImplProperties1));
        System.assert(comAdobeCqHistoryImplHistoryServiceImplProperties3.equals(comAdobeCqHistoryImplHistoryServiceImplProperties4));
        System.assert(comAdobeCqHistoryImplHistoryServiceImplProperties4.equals(comAdobeCqHistoryImplHistoryServiceImplProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASComAdobeCqHistoryImplHistoryServi comAdobeCqHistoryImplHistoryServiceImplProperties1 = OASComAdobeCqHistoryImplHistoryServi.getExample();
        OASComAdobeCqHistoryImplHistoryServi comAdobeCqHistoryImplHistoryServiceImplProperties2 = new OASComAdobeCqHistoryImplHistoryServi();

        System.assertEquals(false, comAdobeCqHistoryImplHistoryServiceImplProperties1.equals('foo'));
        System.assertEquals(false, comAdobeCqHistoryImplHistoryServiceImplProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASComAdobeCqHistoryImplHistoryServi comAdobeCqHistoryImplHistoryServiceImplProperties1 = OASComAdobeCqHistoryImplHistoryServi.getExample();
        OASComAdobeCqHistoryImplHistoryServi comAdobeCqHistoryImplHistoryServiceImplProperties2 = new OASComAdobeCqHistoryImplHistoryServi();
        OASComAdobeCqHistoryImplHistoryServi comAdobeCqHistoryImplHistoryServiceImplProperties3;

        System.assertEquals(false, comAdobeCqHistoryImplHistoryServiceImplProperties1.equals(comAdobeCqHistoryImplHistoryServiceImplProperties3));
        System.assertEquals(false, comAdobeCqHistoryImplHistoryServiceImplProperties2.equals(comAdobeCqHistoryImplHistoryServiceImplProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASComAdobeCqHistoryImplHistoryServi comAdobeCqHistoryImplHistoryServiceImplProperties1 = OASComAdobeCqHistoryImplHistoryServi.getExample();
        OASComAdobeCqHistoryImplHistoryServi comAdobeCqHistoryImplHistoryServiceImplProperties2 = new OASComAdobeCqHistoryImplHistoryServi();

        System.assertEquals(comAdobeCqHistoryImplHistoryServiceImplProperties1.hashCode(), comAdobeCqHistoryImplHistoryServiceImplProperties1.hashCode());
        System.assertEquals(comAdobeCqHistoryImplHistoryServiceImplProperties2.hashCode(), comAdobeCqHistoryImplHistoryServiceImplProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASComAdobeCqHistoryImplHistoryServi comAdobeCqHistoryImplHistoryServiceImplProperties1 = OASComAdobeCqHistoryImplHistoryServi.getExample();
        OASComAdobeCqHistoryImplHistoryServi comAdobeCqHistoryImplHistoryServiceImplProperties2 = OASComAdobeCqHistoryImplHistoryServi.getExample();
        OASComAdobeCqHistoryImplHistoryServi comAdobeCqHistoryImplHistoryServiceImplProperties3 = new OASComAdobeCqHistoryImplHistoryServi();
        OASComAdobeCqHistoryImplHistoryServi comAdobeCqHistoryImplHistoryServiceImplProperties4 = new OASComAdobeCqHistoryImplHistoryServi();

        System.assert(comAdobeCqHistoryImplHistoryServiceImplProperties1.equals(comAdobeCqHistoryImplHistoryServiceImplProperties2));
        System.assert(comAdobeCqHistoryImplHistoryServiceImplProperties3.equals(comAdobeCqHistoryImplHistoryServiceImplProperties4));
        System.assertEquals(comAdobeCqHistoryImplHistoryServiceImplProperties1.hashCode(), comAdobeCqHistoryImplHistoryServiceImplProperties2.hashCode());
        System.assertEquals(comAdobeCqHistoryImplHistoryServiceImplProperties3.hashCode(), comAdobeCqHistoryImplHistoryServiceImplProperties4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASComAdobeCqHistoryImplHistoryServi comAdobeCqHistoryImplHistoryServiceImplProperties = new OASComAdobeCqHistoryImplHistoryServi();
        Map<String, String> propertyMappings = comAdobeCqHistoryImplHistoryServiceImplProperties.getPropertyMappings();
        System.assertEquals('historyServiceResourceTypes', propertyMappings.get('history.service.resourceTypes'));
        System.assertEquals('historyServicePathFilter', propertyMappings.get('history.service.pathFilter'));
    }
}
