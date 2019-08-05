@isTest
private class OASOrgApacheSlingJcrDavexImplServletTest {
    @isTest
    private static void equalsSameInstance() {
        OASOrgApacheSlingJcrDavexImplServlet orgApacheSlingJcrDavexImplServletsSlingDavExServletProperties1 = OASOrgApacheSlingJcrDavexImplServlet.getExample();
        OASOrgApacheSlingJcrDavexImplServlet orgApacheSlingJcrDavexImplServletsSlingDavExServletProperties2 = orgApacheSlingJcrDavexImplServletsSlingDavExServletProperties1;
        OASOrgApacheSlingJcrDavexImplServlet orgApacheSlingJcrDavexImplServletsSlingDavExServletProperties3 = new OASOrgApacheSlingJcrDavexImplServlet();
        OASOrgApacheSlingJcrDavexImplServlet orgApacheSlingJcrDavexImplServletsSlingDavExServletProperties4 = orgApacheSlingJcrDavexImplServletsSlingDavExServletProperties3;

        System.assert(orgApacheSlingJcrDavexImplServletsSlingDavExServletProperties1.equals(orgApacheSlingJcrDavexImplServletsSlingDavExServletProperties2));
        System.assert(orgApacheSlingJcrDavexImplServletsSlingDavExServletProperties2.equals(orgApacheSlingJcrDavexImplServletsSlingDavExServletProperties1));
        System.assert(orgApacheSlingJcrDavexImplServletsSlingDavExServletProperties1.equals(orgApacheSlingJcrDavexImplServletsSlingDavExServletProperties1));
        System.assert(orgApacheSlingJcrDavexImplServletsSlingDavExServletProperties3.equals(orgApacheSlingJcrDavexImplServletsSlingDavExServletProperties4));
        System.assert(orgApacheSlingJcrDavexImplServletsSlingDavExServletProperties4.equals(orgApacheSlingJcrDavexImplServletsSlingDavExServletProperties3));
        System.assert(orgApacheSlingJcrDavexImplServletsSlingDavExServletProperties3.equals(orgApacheSlingJcrDavexImplServletsSlingDavExServletProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASOrgApacheSlingJcrDavexImplServlet orgApacheSlingJcrDavexImplServletsSlingDavExServletProperties1 = OASOrgApacheSlingJcrDavexImplServlet.getExample();
        OASOrgApacheSlingJcrDavexImplServlet orgApacheSlingJcrDavexImplServletsSlingDavExServletProperties2 = OASOrgApacheSlingJcrDavexImplServlet.getExample();
        OASOrgApacheSlingJcrDavexImplServlet orgApacheSlingJcrDavexImplServletsSlingDavExServletProperties3 = new OASOrgApacheSlingJcrDavexImplServlet();
        OASOrgApacheSlingJcrDavexImplServlet orgApacheSlingJcrDavexImplServletsSlingDavExServletProperties4 = new OASOrgApacheSlingJcrDavexImplServlet();

        System.assert(orgApacheSlingJcrDavexImplServletsSlingDavExServletProperties1.equals(orgApacheSlingJcrDavexImplServletsSlingDavExServletProperties2));
        System.assert(orgApacheSlingJcrDavexImplServletsSlingDavExServletProperties2.equals(orgApacheSlingJcrDavexImplServletsSlingDavExServletProperties1));
        System.assert(orgApacheSlingJcrDavexImplServletsSlingDavExServletProperties3.equals(orgApacheSlingJcrDavexImplServletsSlingDavExServletProperties4));
        System.assert(orgApacheSlingJcrDavexImplServletsSlingDavExServletProperties4.equals(orgApacheSlingJcrDavexImplServletsSlingDavExServletProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASOrgApacheSlingJcrDavexImplServlet orgApacheSlingJcrDavexImplServletsSlingDavExServletProperties1 = OASOrgApacheSlingJcrDavexImplServlet.getExample();
        OASOrgApacheSlingJcrDavexImplServlet orgApacheSlingJcrDavexImplServletsSlingDavExServletProperties2 = new OASOrgApacheSlingJcrDavexImplServlet();

        System.assertEquals(false, orgApacheSlingJcrDavexImplServletsSlingDavExServletProperties1.equals('foo'));
        System.assertEquals(false, orgApacheSlingJcrDavexImplServletsSlingDavExServletProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASOrgApacheSlingJcrDavexImplServlet orgApacheSlingJcrDavexImplServletsSlingDavExServletProperties1 = OASOrgApacheSlingJcrDavexImplServlet.getExample();
        OASOrgApacheSlingJcrDavexImplServlet orgApacheSlingJcrDavexImplServletsSlingDavExServletProperties2 = new OASOrgApacheSlingJcrDavexImplServlet();
        OASOrgApacheSlingJcrDavexImplServlet orgApacheSlingJcrDavexImplServletsSlingDavExServletProperties3;

        System.assertEquals(false, orgApacheSlingJcrDavexImplServletsSlingDavExServletProperties1.equals(orgApacheSlingJcrDavexImplServletsSlingDavExServletProperties3));
        System.assertEquals(false, orgApacheSlingJcrDavexImplServletsSlingDavExServletProperties2.equals(orgApacheSlingJcrDavexImplServletsSlingDavExServletProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASOrgApacheSlingJcrDavexImplServlet orgApacheSlingJcrDavexImplServletsSlingDavExServletProperties1 = OASOrgApacheSlingJcrDavexImplServlet.getExample();
        OASOrgApacheSlingJcrDavexImplServlet orgApacheSlingJcrDavexImplServletsSlingDavExServletProperties2 = new OASOrgApacheSlingJcrDavexImplServlet();

        System.assertEquals(orgApacheSlingJcrDavexImplServletsSlingDavExServletProperties1.hashCode(), orgApacheSlingJcrDavexImplServletsSlingDavExServletProperties1.hashCode());
        System.assertEquals(orgApacheSlingJcrDavexImplServletsSlingDavExServletProperties2.hashCode(), orgApacheSlingJcrDavexImplServletsSlingDavExServletProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASOrgApacheSlingJcrDavexImplServlet orgApacheSlingJcrDavexImplServletsSlingDavExServletProperties1 = OASOrgApacheSlingJcrDavexImplServlet.getExample();
        OASOrgApacheSlingJcrDavexImplServlet orgApacheSlingJcrDavexImplServletsSlingDavExServletProperties2 = OASOrgApacheSlingJcrDavexImplServlet.getExample();
        OASOrgApacheSlingJcrDavexImplServlet orgApacheSlingJcrDavexImplServletsSlingDavExServletProperties3 = new OASOrgApacheSlingJcrDavexImplServlet();
        OASOrgApacheSlingJcrDavexImplServlet orgApacheSlingJcrDavexImplServletsSlingDavExServletProperties4 = new OASOrgApacheSlingJcrDavexImplServlet();

        System.assert(orgApacheSlingJcrDavexImplServletsSlingDavExServletProperties1.equals(orgApacheSlingJcrDavexImplServletsSlingDavExServletProperties2));
        System.assert(orgApacheSlingJcrDavexImplServletsSlingDavExServletProperties3.equals(orgApacheSlingJcrDavexImplServletsSlingDavExServletProperties4));
        System.assertEquals(orgApacheSlingJcrDavexImplServletsSlingDavExServletProperties1.hashCode(), orgApacheSlingJcrDavexImplServletsSlingDavExServletProperties2.hashCode());
        System.assertEquals(orgApacheSlingJcrDavexImplServletsSlingDavExServletProperties3.hashCode(), orgApacheSlingJcrDavexImplServletsSlingDavExServletProperties4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASOrgApacheSlingJcrDavexImplServlet orgApacheSlingJcrDavexImplServletsSlingDavExServletProperties = new OASOrgApacheSlingJcrDavexImplServlet();
        Map<String, String> propertyMappings = orgApacheSlingJcrDavexImplServletsSlingDavExServletProperties.getPropertyMappings();
        System.assertEquals('davCreateAbsoluteUri', propertyMappings.get('dav.create-absolute-uri'));
        System.assertEquals('davProtectedhandlers', propertyMappings.get('dav.protectedhandlers'));
    }
}
