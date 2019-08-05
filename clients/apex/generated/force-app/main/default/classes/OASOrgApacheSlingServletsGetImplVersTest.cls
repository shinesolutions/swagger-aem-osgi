@isTest
private class OASOrgApacheSlingServletsGetImplVersTest {
    @isTest
    private static void equalsSameInstance() {
        OASOrgApacheSlingServletsGetImplVers orgApacheSlingServletsGetImplVersionVersionInfoServletProperties1 = OASOrgApacheSlingServletsGetImplVers.getExample();
        OASOrgApacheSlingServletsGetImplVers orgApacheSlingServletsGetImplVersionVersionInfoServletProperties2 = orgApacheSlingServletsGetImplVersionVersionInfoServletProperties1;
        OASOrgApacheSlingServletsGetImplVers orgApacheSlingServletsGetImplVersionVersionInfoServletProperties3 = new OASOrgApacheSlingServletsGetImplVers();
        OASOrgApacheSlingServletsGetImplVers orgApacheSlingServletsGetImplVersionVersionInfoServletProperties4 = orgApacheSlingServletsGetImplVersionVersionInfoServletProperties3;

        System.assert(orgApacheSlingServletsGetImplVersionVersionInfoServletProperties1.equals(orgApacheSlingServletsGetImplVersionVersionInfoServletProperties2));
        System.assert(orgApacheSlingServletsGetImplVersionVersionInfoServletProperties2.equals(orgApacheSlingServletsGetImplVersionVersionInfoServletProperties1));
        System.assert(orgApacheSlingServletsGetImplVersionVersionInfoServletProperties1.equals(orgApacheSlingServletsGetImplVersionVersionInfoServletProperties1));
        System.assert(orgApacheSlingServletsGetImplVersionVersionInfoServletProperties3.equals(orgApacheSlingServletsGetImplVersionVersionInfoServletProperties4));
        System.assert(orgApacheSlingServletsGetImplVersionVersionInfoServletProperties4.equals(orgApacheSlingServletsGetImplVersionVersionInfoServletProperties3));
        System.assert(orgApacheSlingServletsGetImplVersionVersionInfoServletProperties3.equals(orgApacheSlingServletsGetImplVersionVersionInfoServletProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASOrgApacheSlingServletsGetImplVers orgApacheSlingServletsGetImplVersionVersionInfoServletProperties1 = OASOrgApacheSlingServletsGetImplVers.getExample();
        OASOrgApacheSlingServletsGetImplVers orgApacheSlingServletsGetImplVersionVersionInfoServletProperties2 = OASOrgApacheSlingServletsGetImplVers.getExample();
        OASOrgApacheSlingServletsGetImplVers orgApacheSlingServletsGetImplVersionVersionInfoServletProperties3 = new OASOrgApacheSlingServletsGetImplVers();
        OASOrgApacheSlingServletsGetImplVers orgApacheSlingServletsGetImplVersionVersionInfoServletProperties4 = new OASOrgApacheSlingServletsGetImplVers();

        System.assert(orgApacheSlingServletsGetImplVersionVersionInfoServletProperties1.equals(orgApacheSlingServletsGetImplVersionVersionInfoServletProperties2));
        System.assert(orgApacheSlingServletsGetImplVersionVersionInfoServletProperties2.equals(orgApacheSlingServletsGetImplVersionVersionInfoServletProperties1));
        System.assert(orgApacheSlingServletsGetImplVersionVersionInfoServletProperties3.equals(orgApacheSlingServletsGetImplVersionVersionInfoServletProperties4));
        System.assert(orgApacheSlingServletsGetImplVersionVersionInfoServletProperties4.equals(orgApacheSlingServletsGetImplVersionVersionInfoServletProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASOrgApacheSlingServletsGetImplVers orgApacheSlingServletsGetImplVersionVersionInfoServletProperties1 = OASOrgApacheSlingServletsGetImplVers.getExample();
        OASOrgApacheSlingServletsGetImplVers orgApacheSlingServletsGetImplVersionVersionInfoServletProperties2 = new OASOrgApacheSlingServletsGetImplVers();

        System.assertEquals(false, orgApacheSlingServletsGetImplVersionVersionInfoServletProperties1.equals('foo'));
        System.assertEquals(false, orgApacheSlingServletsGetImplVersionVersionInfoServletProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASOrgApacheSlingServletsGetImplVers orgApacheSlingServletsGetImplVersionVersionInfoServletProperties1 = OASOrgApacheSlingServletsGetImplVers.getExample();
        OASOrgApacheSlingServletsGetImplVers orgApacheSlingServletsGetImplVersionVersionInfoServletProperties2 = new OASOrgApacheSlingServletsGetImplVers();
        OASOrgApacheSlingServletsGetImplVers orgApacheSlingServletsGetImplVersionVersionInfoServletProperties3;

        System.assertEquals(false, orgApacheSlingServletsGetImplVersionVersionInfoServletProperties1.equals(orgApacheSlingServletsGetImplVersionVersionInfoServletProperties3));
        System.assertEquals(false, orgApacheSlingServletsGetImplVersionVersionInfoServletProperties2.equals(orgApacheSlingServletsGetImplVersionVersionInfoServletProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASOrgApacheSlingServletsGetImplVers orgApacheSlingServletsGetImplVersionVersionInfoServletProperties1 = OASOrgApacheSlingServletsGetImplVers.getExample();
        OASOrgApacheSlingServletsGetImplVers orgApacheSlingServletsGetImplVersionVersionInfoServletProperties2 = new OASOrgApacheSlingServletsGetImplVers();

        System.assertEquals(orgApacheSlingServletsGetImplVersionVersionInfoServletProperties1.hashCode(), orgApacheSlingServletsGetImplVersionVersionInfoServletProperties1.hashCode());
        System.assertEquals(orgApacheSlingServletsGetImplVersionVersionInfoServletProperties2.hashCode(), orgApacheSlingServletsGetImplVersionVersionInfoServletProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASOrgApacheSlingServletsGetImplVers orgApacheSlingServletsGetImplVersionVersionInfoServletProperties1 = OASOrgApacheSlingServletsGetImplVers.getExample();
        OASOrgApacheSlingServletsGetImplVers orgApacheSlingServletsGetImplVersionVersionInfoServletProperties2 = OASOrgApacheSlingServletsGetImplVers.getExample();
        OASOrgApacheSlingServletsGetImplVers orgApacheSlingServletsGetImplVersionVersionInfoServletProperties3 = new OASOrgApacheSlingServletsGetImplVers();
        OASOrgApacheSlingServletsGetImplVers orgApacheSlingServletsGetImplVersionVersionInfoServletProperties4 = new OASOrgApacheSlingServletsGetImplVers();

        System.assert(orgApacheSlingServletsGetImplVersionVersionInfoServletProperties1.equals(orgApacheSlingServletsGetImplVersionVersionInfoServletProperties2));
        System.assert(orgApacheSlingServletsGetImplVersionVersionInfoServletProperties3.equals(orgApacheSlingServletsGetImplVersionVersionInfoServletProperties4));
        System.assertEquals(orgApacheSlingServletsGetImplVersionVersionInfoServletProperties1.hashCode(), orgApacheSlingServletsGetImplVersionVersionInfoServletProperties2.hashCode());
        System.assertEquals(orgApacheSlingServletsGetImplVersionVersionInfoServletProperties3.hashCode(), orgApacheSlingServletsGetImplVersionVersionInfoServletProperties4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASOrgApacheSlingServletsGetImplVers orgApacheSlingServletsGetImplVersionVersionInfoServletProperties = new OASOrgApacheSlingServletsGetImplVers();
        Map<String, String> propertyMappings = orgApacheSlingServletsGetImplVersionVersionInfoServletProperties.getPropertyMappings();
        System.assertEquals('slingServletSelectors', propertyMappings.get('sling.servlet.selectors'));
    }
}
