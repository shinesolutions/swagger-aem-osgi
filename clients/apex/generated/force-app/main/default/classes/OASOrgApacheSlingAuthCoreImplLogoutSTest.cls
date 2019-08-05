@isTest
private class OASOrgApacheSlingAuthCoreImplLogoutSTest {
    @isTest
    private static void equalsSameInstance() {
        OASOrgApacheSlingAuthCoreImplLogoutS orgApacheSlingAuthCoreImplLogoutServletProperties1 = OASOrgApacheSlingAuthCoreImplLogoutS.getExample();
        OASOrgApacheSlingAuthCoreImplLogoutS orgApacheSlingAuthCoreImplLogoutServletProperties2 = orgApacheSlingAuthCoreImplLogoutServletProperties1;
        OASOrgApacheSlingAuthCoreImplLogoutS orgApacheSlingAuthCoreImplLogoutServletProperties3 = new OASOrgApacheSlingAuthCoreImplLogoutS();
        OASOrgApacheSlingAuthCoreImplLogoutS orgApacheSlingAuthCoreImplLogoutServletProperties4 = orgApacheSlingAuthCoreImplLogoutServletProperties3;

        System.assert(orgApacheSlingAuthCoreImplLogoutServletProperties1.equals(orgApacheSlingAuthCoreImplLogoutServletProperties2));
        System.assert(orgApacheSlingAuthCoreImplLogoutServletProperties2.equals(orgApacheSlingAuthCoreImplLogoutServletProperties1));
        System.assert(orgApacheSlingAuthCoreImplLogoutServletProperties1.equals(orgApacheSlingAuthCoreImplLogoutServletProperties1));
        System.assert(orgApacheSlingAuthCoreImplLogoutServletProperties3.equals(orgApacheSlingAuthCoreImplLogoutServletProperties4));
        System.assert(orgApacheSlingAuthCoreImplLogoutServletProperties4.equals(orgApacheSlingAuthCoreImplLogoutServletProperties3));
        System.assert(orgApacheSlingAuthCoreImplLogoutServletProperties3.equals(orgApacheSlingAuthCoreImplLogoutServletProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASOrgApacheSlingAuthCoreImplLogoutS orgApacheSlingAuthCoreImplLogoutServletProperties1 = OASOrgApacheSlingAuthCoreImplLogoutS.getExample();
        OASOrgApacheSlingAuthCoreImplLogoutS orgApacheSlingAuthCoreImplLogoutServletProperties2 = OASOrgApacheSlingAuthCoreImplLogoutS.getExample();
        OASOrgApacheSlingAuthCoreImplLogoutS orgApacheSlingAuthCoreImplLogoutServletProperties3 = new OASOrgApacheSlingAuthCoreImplLogoutS();
        OASOrgApacheSlingAuthCoreImplLogoutS orgApacheSlingAuthCoreImplLogoutServletProperties4 = new OASOrgApacheSlingAuthCoreImplLogoutS();

        System.assert(orgApacheSlingAuthCoreImplLogoutServletProperties1.equals(orgApacheSlingAuthCoreImplLogoutServletProperties2));
        System.assert(orgApacheSlingAuthCoreImplLogoutServletProperties2.equals(orgApacheSlingAuthCoreImplLogoutServletProperties1));
        System.assert(orgApacheSlingAuthCoreImplLogoutServletProperties3.equals(orgApacheSlingAuthCoreImplLogoutServletProperties4));
        System.assert(orgApacheSlingAuthCoreImplLogoutServletProperties4.equals(orgApacheSlingAuthCoreImplLogoutServletProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASOrgApacheSlingAuthCoreImplLogoutS orgApacheSlingAuthCoreImplLogoutServletProperties1 = OASOrgApacheSlingAuthCoreImplLogoutS.getExample();
        OASOrgApacheSlingAuthCoreImplLogoutS orgApacheSlingAuthCoreImplLogoutServletProperties2 = new OASOrgApacheSlingAuthCoreImplLogoutS();

        System.assertEquals(false, orgApacheSlingAuthCoreImplLogoutServletProperties1.equals('foo'));
        System.assertEquals(false, orgApacheSlingAuthCoreImplLogoutServletProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASOrgApacheSlingAuthCoreImplLogoutS orgApacheSlingAuthCoreImplLogoutServletProperties1 = OASOrgApacheSlingAuthCoreImplLogoutS.getExample();
        OASOrgApacheSlingAuthCoreImplLogoutS orgApacheSlingAuthCoreImplLogoutServletProperties2 = new OASOrgApacheSlingAuthCoreImplLogoutS();
        OASOrgApacheSlingAuthCoreImplLogoutS orgApacheSlingAuthCoreImplLogoutServletProperties3;

        System.assertEquals(false, orgApacheSlingAuthCoreImplLogoutServletProperties1.equals(orgApacheSlingAuthCoreImplLogoutServletProperties3));
        System.assertEquals(false, orgApacheSlingAuthCoreImplLogoutServletProperties2.equals(orgApacheSlingAuthCoreImplLogoutServletProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASOrgApacheSlingAuthCoreImplLogoutS orgApacheSlingAuthCoreImplLogoutServletProperties1 = OASOrgApacheSlingAuthCoreImplLogoutS.getExample();
        OASOrgApacheSlingAuthCoreImplLogoutS orgApacheSlingAuthCoreImplLogoutServletProperties2 = new OASOrgApacheSlingAuthCoreImplLogoutS();

        System.assertEquals(orgApacheSlingAuthCoreImplLogoutServletProperties1.hashCode(), orgApacheSlingAuthCoreImplLogoutServletProperties1.hashCode());
        System.assertEquals(orgApacheSlingAuthCoreImplLogoutServletProperties2.hashCode(), orgApacheSlingAuthCoreImplLogoutServletProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASOrgApacheSlingAuthCoreImplLogoutS orgApacheSlingAuthCoreImplLogoutServletProperties1 = OASOrgApacheSlingAuthCoreImplLogoutS.getExample();
        OASOrgApacheSlingAuthCoreImplLogoutS orgApacheSlingAuthCoreImplLogoutServletProperties2 = OASOrgApacheSlingAuthCoreImplLogoutS.getExample();
        OASOrgApacheSlingAuthCoreImplLogoutS orgApacheSlingAuthCoreImplLogoutServletProperties3 = new OASOrgApacheSlingAuthCoreImplLogoutS();
        OASOrgApacheSlingAuthCoreImplLogoutS orgApacheSlingAuthCoreImplLogoutServletProperties4 = new OASOrgApacheSlingAuthCoreImplLogoutS();

        System.assert(orgApacheSlingAuthCoreImplLogoutServletProperties1.equals(orgApacheSlingAuthCoreImplLogoutServletProperties2));
        System.assert(orgApacheSlingAuthCoreImplLogoutServletProperties3.equals(orgApacheSlingAuthCoreImplLogoutServletProperties4));
        System.assertEquals(orgApacheSlingAuthCoreImplLogoutServletProperties1.hashCode(), orgApacheSlingAuthCoreImplLogoutServletProperties2.hashCode());
        System.assertEquals(orgApacheSlingAuthCoreImplLogoutServletProperties3.hashCode(), orgApacheSlingAuthCoreImplLogoutServletProperties4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASOrgApacheSlingAuthCoreImplLogoutS orgApacheSlingAuthCoreImplLogoutServletProperties = new OASOrgApacheSlingAuthCoreImplLogoutS();
        Map<String, String> propertyMappings = orgApacheSlingAuthCoreImplLogoutServletProperties.getPropertyMappings();
        System.assertEquals('slingServletMethods', propertyMappings.get('sling.servlet.methods'));
        System.assertEquals('slingServletPaths', propertyMappings.get('sling.servlet.paths'));
    }
}
