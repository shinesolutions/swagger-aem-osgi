@isTest
private class OASComAdobeCqAddressImplLocationLocaTest {
    @isTest
    private static void equalsSameInstance() {
        OASComAdobeCqAddressImplLocationLoca comAdobeCqAddressImplLocationLocationListServletProperties1 = OASComAdobeCqAddressImplLocationLoca.getExample();
        OASComAdobeCqAddressImplLocationLoca comAdobeCqAddressImplLocationLocationListServletProperties2 = comAdobeCqAddressImplLocationLocationListServletProperties1;
        OASComAdobeCqAddressImplLocationLoca comAdobeCqAddressImplLocationLocationListServletProperties3 = new OASComAdobeCqAddressImplLocationLoca();
        OASComAdobeCqAddressImplLocationLoca comAdobeCqAddressImplLocationLocationListServletProperties4 = comAdobeCqAddressImplLocationLocationListServletProperties3;

        System.assert(comAdobeCqAddressImplLocationLocationListServletProperties1.equals(comAdobeCqAddressImplLocationLocationListServletProperties2));
        System.assert(comAdobeCqAddressImplLocationLocationListServletProperties2.equals(comAdobeCqAddressImplLocationLocationListServletProperties1));
        System.assert(comAdobeCqAddressImplLocationLocationListServletProperties1.equals(comAdobeCqAddressImplLocationLocationListServletProperties1));
        System.assert(comAdobeCqAddressImplLocationLocationListServletProperties3.equals(comAdobeCqAddressImplLocationLocationListServletProperties4));
        System.assert(comAdobeCqAddressImplLocationLocationListServletProperties4.equals(comAdobeCqAddressImplLocationLocationListServletProperties3));
        System.assert(comAdobeCqAddressImplLocationLocationListServletProperties3.equals(comAdobeCqAddressImplLocationLocationListServletProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASComAdobeCqAddressImplLocationLoca comAdobeCqAddressImplLocationLocationListServletProperties1 = OASComAdobeCqAddressImplLocationLoca.getExample();
        OASComAdobeCqAddressImplLocationLoca comAdobeCqAddressImplLocationLocationListServletProperties2 = OASComAdobeCqAddressImplLocationLoca.getExample();
        OASComAdobeCqAddressImplLocationLoca comAdobeCqAddressImplLocationLocationListServletProperties3 = new OASComAdobeCqAddressImplLocationLoca();
        OASComAdobeCqAddressImplLocationLoca comAdobeCqAddressImplLocationLocationListServletProperties4 = new OASComAdobeCqAddressImplLocationLoca();

        System.assert(comAdobeCqAddressImplLocationLocationListServletProperties1.equals(comAdobeCqAddressImplLocationLocationListServletProperties2));
        System.assert(comAdobeCqAddressImplLocationLocationListServletProperties2.equals(comAdobeCqAddressImplLocationLocationListServletProperties1));
        System.assert(comAdobeCqAddressImplLocationLocationListServletProperties3.equals(comAdobeCqAddressImplLocationLocationListServletProperties4));
        System.assert(comAdobeCqAddressImplLocationLocationListServletProperties4.equals(comAdobeCqAddressImplLocationLocationListServletProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASComAdobeCqAddressImplLocationLoca comAdobeCqAddressImplLocationLocationListServletProperties1 = OASComAdobeCqAddressImplLocationLoca.getExample();
        OASComAdobeCqAddressImplLocationLoca comAdobeCqAddressImplLocationLocationListServletProperties2 = new OASComAdobeCqAddressImplLocationLoca();

        System.assertEquals(false, comAdobeCqAddressImplLocationLocationListServletProperties1.equals('foo'));
        System.assertEquals(false, comAdobeCqAddressImplLocationLocationListServletProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASComAdobeCqAddressImplLocationLoca comAdobeCqAddressImplLocationLocationListServletProperties1 = OASComAdobeCqAddressImplLocationLoca.getExample();
        OASComAdobeCqAddressImplLocationLoca comAdobeCqAddressImplLocationLocationListServletProperties2 = new OASComAdobeCqAddressImplLocationLoca();
        OASComAdobeCqAddressImplLocationLoca comAdobeCqAddressImplLocationLocationListServletProperties3;

        System.assertEquals(false, comAdobeCqAddressImplLocationLocationListServletProperties1.equals(comAdobeCqAddressImplLocationLocationListServletProperties3));
        System.assertEquals(false, comAdobeCqAddressImplLocationLocationListServletProperties2.equals(comAdobeCqAddressImplLocationLocationListServletProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASComAdobeCqAddressImplLocationLoca comAdobeCqAddressImplLocationLocationListServletProperties1 = OASComAdobeCqAddressImplLocationLoca.getExample();
        OASComAdobeCqAddressImplLocationLoca comAdobeCqAddressImplLocationLocationListServletProperties2 = new OASComAdobeCqAddressImplLocationLoca();

        System.assertEquals(comAdobeCqAddressImplLocationLocationListServletProperties1.hashCode(), comAdobeCqAddressImplLocationLocationListServletProperties1.hashCode());
        System.assertEquals(comAdobeCqAddressImplLocationLocationListServletProperties2.hashCode(), comAdobeCqAddressImplLocationLocationListServletProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASComAdobeCqAddressImplLocationLoca comAdobeCqAddressImplLocationLocationListServletProperties1 = OASComAdobeCqAddressImplLocationLoca.getExample();
        OASComAdobeCqAddressImplLocationLoca comAdobeCqAddressImplLocationLocationListServletProperties2 = OASComAdobeCqAddressImplLocationLoca.getExample();
        OASComAdobeCqAddressImplLocationLoca comAdobeCqAddressImplLocationLocationListServletProperties3 = new OASComAdobeCqAddressImplLocationLoca();
        OASComAdobeCqAddressImplLocationLoca comAdobeCqAddressImplLocationLocationListServletProperties4 = new OASComAdobeCqAddressImplLocationLoca();

        System.assert(comAdobeCqAddressImplLocationLocationListServletProperties1.equals(comAdobeCqAddressImplLocationLocationListServletProperties2));
        System.assert(comAdobeCqAddressImplLocationLocationListServletProperties3.equals(comAdobeCqAddressImplLocationLocationListServletProperties4));
        System.assertEquals(comAdobeCqAddressImplLocationLocationListServletProperties1.hashCode(), comAdobeCqAddressImplLocationLocationListServletProperties2.hashCode());
        System.assertEquals(comAdobeCqAddressImplLocationLocationListServletProperties3.hashCode(), comAdobeCqAddressImplLocationLocationListServletProperties4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASComAdobeCqAddressImplLocationLoca comAdobeCqAddressImplLocationLocationListServletProperties = new OASComAdobeCqAddressImplLocationLoca();
        Map<String, String> propertyMappings = comAdobeCqAddressImplLocationLocationListServletProperties.getPropertyMappings();
        System.assertEquals('cqAddressLocationDefaultMaxResults', propertyMappings.get('cq.address.location.default.maxResults'));
    }
}
