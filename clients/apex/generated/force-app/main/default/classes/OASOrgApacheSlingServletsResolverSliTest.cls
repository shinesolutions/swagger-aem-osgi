@isTest
private class OASOrgApacheSlingServletsResolverSliTest {
    @isTest
    private static void equalsSameInstance() {
        OASOrgApacheSlingServletsResolverSli orgApacheSlingServletsResolverSlingServletResolverProperties1 = OASOrgApacheSlingServletsResolverSli.getExample();
        OASOrgApacheSlingServletsResolverSli orgApacheSlingServletsResolverSlingServletResolverProperties2 = orgApacheSlingServletsResolverSlingServletResolverProperties1;
        OASOrgApacheSlingServletsResolverSli orgApacheSlingServletsResolverSlingServletResolverProperties3 = new OASOrgApacheSlingServletsResolverSli();
        OASOrgApacheSlingServletsResolverSli orgApacheSlingServletsResolverSlingServletResolverProperties4 = orgApacheSlingServletsResolverSlingServletResolverProperties3;

        System.assert(orgApacheSlingServletsResolverSlingServletResolverProperties1.equals(orgApacheSlingServletsResolverSlingServletResolverProperties2));
        System.assert(orgApacheSlingServletsResolverSlingServletResolverProperties2.equals(orgApacheSlingServletsResolverSlingServletResolverProperties1));
        System.assert(orgApacheSlingServletsResolverSlingServletResolverProperties1.equals(orgApacheSlingServletsResolverSlingServletResolverProperties1));
        System.assert(orgApacheSlingServletsResolverSlingServletResolverProperties3.equals(orgApacheSlingServletsResolverSlingServletResolverProperties4));
        System.assert(orgApacheSlingServletsResolverSlingServletResolverProperties4.equals(orgApacheSlingServletsResolverSlingServletResolverProperties3));
        System.assert(orgApacheSlingServletsResolverSlingServletResolverProperties3.equals(orgApacheSlingServletsResolverSlingServletResolverProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASOrgApacheSlingServletsResolverSli orgApacheSlingServletsResolverSlingServletResolverProperties1 = OASOrgApacheSlingServletsResolverSli.getExample();
        OASOrgApacheSlingServletsResolverSli orgApacheSlingServletsResolverSlingServletResolverProperties2 = OASOrgApacheSlingServletsResolverSli.getExample();
        OASOrgApacheSlingServletsResolverSli orgApacheSlingServletsResolverSlingServletResolverProperties3 = new OASOrgApacheSlingServletsResolverSli();
        OASOrgApacheSlingServletsResolverSli orgApacheSlingServletsResolverSlingServletResolverProperties4 = new OASOrgApacheSlingServletsResolverSli();

        System.assert(orgApacheSlingServletsResolverSlingServletResolverProperties1.equals(orgApacheSlingServletsResolverSlingServletResolverProperties2));
        System.assert(orgApacheSlingServletsResolverSlingServletResolverProperties2.equals(orgApacheSlingServletsResolverSlingServletResolverProperties1));
        System.assert(orgApacheSlingServletsResolverSlingServletResolverProperties3.equals(orgApacheSlingServletsResolverSlingServletResolverProperties4));
        System.assert(orgApacheSlingServletsResolverSlingServletResolverProperties4.equals(orgApacheSlingServletsResolverSlingServletResolverProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASOrgApacheSlingServletsResolverSli orgApacheSlingServletsResolverSlingServletResolverProperties1 = OASOrgApacheSlingServletsResolverSli.getExample();
        OASOrgApacheSlingServletsResolverSli orgApacheSlingServletsResolverSlingServletResolverProperties2 = new OASOrgApacheSlingServletsResolverSli();

        System.assertEquals(false, orgApacheSlingServletsResolverSlingServletResolverProperties1.equals('foo'));
        System.assertEquals(false, orgApacheSlingServletsResolverSlingServletResolverProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASOrgApacheSlingServletsResolverSli orgApacheSlingServletsResolverSlingServletResolverProperties1 = OASOrgApacheSlingServletsResolverSli.getExample();
        OASOrgApacheSlingServletsResolverSli orgApacheSlingServletsResolverSlingServletResolverProperties2 = new OASOrgApacheSlingServletsResolverSli();
        OASOrgApacheSlingServletsResolverSli orgApacheSlingServletsResolverSlingServletResolverProperties3;

        System.assertEquals(false, orgApacheSlingServletsResolverSlingServletResolverProperties1.equals(orgApacheSlingServletsResolverSlingServletResolverProperties3));
        System.assertEquals(false, orgApacheSlingServletsResolverSlingServletResolverProperties2.equals(orgApacheSlingServletsResolverSlingServletResolverProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASOrgApacheSlingServletsResolverSli orgApacheSlingServletsResolverSlingServletResolverProperties1 = OASOrgApacheSlingServletsResolverSli.getExample();
        OASOrgApacheSlingServletsResolverSli orgApacheSlingServletsResolverSlingServletResolverProperties2 = new OASOrgApacheSlingServletsResolverSli();

        System.assertEquals(orgApacheSlingServletsResolverSlingServletResolverProperties1.hashCode(), orgApacheSlingServletsResolverSlingServletResolverProperties1.hashCode());
        System.assertEquals(orgApacheSlingServletsResolverSlingServletResolverProperties2.hashCode(), orgApacheSlingServletsResolverSlingServletResolverProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASOrgApacheSlingServletsResolverSli orgApacheSlingServletsResolverSlingServletResolverProperties1 = OASOrgApacheSlingServletsResolverSli.getExample();
        OASOrgApacheSlingServletsResolverSli orgApacheSlingServletsResolverSlingServletResolverProperties2 = OASOrgApacheSlingServletsResolverSli.getExample();
        OASOrgApacheSlingServletsResolverSli orgApacheSlingServletsResolverSlingServletResolverProperties3 = new OASOrgApacheSlingServletsResolverSli();
        OASOrgApacheSlingServletsResolverSli orgApacheSlingServletsResolverSlingServletResolverProperties4 = new OASOrgApacheSlingServletsResolverSli();

        System.assert(orgApacheSlingServletsResolverSlingServletResolverProperties1.equals(orgApacheSlingServletsResolverSlingServletResolverProperties2));
        System.assert(orgApacheSlingServletsResolverSlingServletResolverProperties3.equals(orgApacheSlingServletsResolverSlingServletResolverProperties4));
        System.assertEquals(orgApacheSlingServletsResolverSlingServletResolverProperties1.hashCode(), orgApacheSlingServletsResolverSlingServletResolverProperties2.hashCode());
        System.assertEquals(orgApacheSlingServletsResolverSlingServletResolverProperties3.hashCode(), orgApacheSlingServletsResolverSlingServletResolverProperties4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASOrgApacheSlingServletsResolverSli orgApacheSlingServletsResolverSlingServletResolverProperties = new OASOrgApacheSlingServletsResolverSli();
        Map<String, String> propertyMappings = orgApacheSlingServletsResolverSlingServletResolverProperties.getPropertyMappings();
        System.assertEquals('servletresolverServletRoot', propertyMappings.get('servletresolver.servletRoot'));
        System.assertEquals('servletresolverCacheSize', propertyMappings.get('servletresolver.cacheSize'));
        System.assertEquals('servletresolverPaths', propertyMappings.get('servletresolver.paths'));
        System.assertEquals('servletresolverDefaultExtensions', propertyMappings.get('servletresolver.defaultExtensions'));
    }
}
