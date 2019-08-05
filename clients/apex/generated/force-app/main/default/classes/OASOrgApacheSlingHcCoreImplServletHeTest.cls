@isTest
private class OASOrgApacheSlingHcCoreImplServletHeTest {
    @isTest
    private static void equalsSameInstance() {
        OASOrgApacheSlingHcCoreImplServletHe orgApacheSlingHcCoreImplServletHealthCheckExecutorServletProperties1 = OASOrgApacheSlingHcCoreImplServletHe.getExample();
        OASOrgApacheSlingHcCoreImplServletHe orgApacheSlingHcCoreImplServletHealthCheckExecutorServletProperties2 = orgApacheSlingHcCoreImplServletHealthCheckExecutorServletProperties1;
        OASOrgApacheSlingHcCoreImplServletHe orgApacheSlingHcCoreImplServletHealthCheckExecutorServletProperties3 = new OASOrgApacheSlingHcCoreImplServletHe();
        OASOrgApacheSlingHcCoreImplServletHe orgApacheSlingHcCoreImplServletHealthCheckExecutorServletProperties4 = orgApacheSlingHcCoreImplServletHealthCheckExecutorServletProperties3;

        System.assert(orgApacheSlingHcCoreImplServletHealthCheckExecutorServletProperties1.equals(orgApacheSlingHcCoreImplServletHealthCheckExecutorServletProperties2));
        System.assert(orgApacheSlingHcCoreImplServletHealthCheckExecutorServletProperties2.equals(orgApacheSlingHcCoreImplServletHealthCheckExecutorServletProperties1));
        System.assert(orgApacheSlingHcCoreImplServletHealthCheckExecutorServletProperties1.equals(orgApacheSlingHcCoreImplServletHealthCheckExecutorServletProperties1));
        System.assert(orgApacheSlingHcCoreImplServletHealthCheckExecutorServletProperties3.equals(orgApacheSlingHcCoreImplServletHealthCheckExecutorServletProperties4));
        System.assert(orgApacheSlingHcCoreImplServletHealthCheckExecutorServletProperties4.equals(orgApacheSlingHcCoreImplServletHealthCheckExecutorServletProperties3));
        System.assert(orgApacheSlingHcCoreImplServletHealthCheckExecutorServletProperties3.equals(orgApacheSlingHcCoreImplServletHealthCheckExecutorServletProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASOrgApacheSlingHcCoreImplServletHe orgApacheSlingHcCoreImplServletHealthCheckExecutorServletProperties1 = OASOrgApacheSlingHcCoreImplServletHe.getExample();
        OASOrgApacheSlingHcCoreImplServletHe orgApacheSlingHcCoreImplServletHealthCheckExecutorServletProperties2 = OASOrgApacheSlingHcCoreImplServletHe.getExample();
        OASOrgApacheSlingHcCoreImplServletHe orgApacheSlingHcCoreImplServletHealthCheckExecutorServletProperties3 = new OASOrgApacheSlingHcCoreImplServletHe();
        OASOrgApacheSlingHcCoreImplServletHe orgApacheSlingHcCoreImplServletHealthCheckExecutorServletProperties4 = new OASOrgApacheSlingHcCoreImplServletHe();

        System.assert(orgApacheSlingHcCoreImplServletHealthCheckExecutorServletProperties1.equals(orgApacheSlingHcCoreImplServletHealthCheckExecutorServletProperties2));
        System.assert(orgApacheSlingHcCoreImplServletHealthCheckExecutorServletProperties2.equals(orgApacheSlingHcCoreImplServletHealthCheckExecutorServletProperties1));
        System.assert(orgApacheSlingHcCoreImplServletHealthCheckExecutorServletProperties3.equals(orgApacheSlingHcCoreImplServletHealthCheckExecutorServletProperties4));
        System.assert(orgApacheSlingHcCoreImplServletHealthCheckExecutorServletProperties4.equals(orgApacheSlingHcCoreImplServletHealthCheckExecutorServletProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASOrgApacheSlingHcCoreImplServletHe orgApacheSlingHcCoreImplServletHealthCheckExecutorServletProperties1 = OASOrgApacheSlingHcCoreImplServletHe.getExample();
        OASOrgApacheSlingHcCoreImplServletHe orgApacheSlingHcCoreImplServletHealthCheckExecutorServletProperties2 = new OASOrgApacheSlingHcCoreImplServletHe();

        System.assertEquals(false, orgApacheSlingHcCoreImplServletHealthCheckExecutorServletProperties1.equals('foo'));
        System.assertEquals(false, orgApacheSlingHcCoreImplServletHealthCheckExecutorServletProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASOrgApacheSlingHcCoreImplServletHe orgApacheSlingHcCoreImplServletHealthCheckExecutorServletProperties1 = OASOrgApacheSlingHcCoreImplServletHe.getExample();
        OASOrgApacheSlingHcCoreImplServletHe orgApacheSlingHcCoreImplServletHealthCheckExecutorServletProperties2 = new OASOrgApacheSlingHcCoreImplServletHe();
        OASOrgApacheSlingHcCoreImplServletHe orgApacheSlingHcCoreImplServletHealthCheckExecutorServletProperties3;

        System.assertEquals(false, orgApacheSlingHcCoreImplServletHealthCheckExecutorServletProperties1.equals(orgApacheSlingHcCoreImplServletHealthCheckExecutorServletProperties3));
        System.assertEquals(false, orgApacheSlingHcCoreImplServletHealthCheckExecutorServletProperties2.equals(orgApacheSlingHcCoreImplServletHealthCheckExecutorServletProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASOrgApacheSlingHcCoreImplServletHe orgApacheSlingHcCoreImplServletHealthCheckExecutorServletProperties1 = OASOrgApacheSlingHcCoreImplServletHe.getExample();
        OASOrgApacheSlingHcCoreImplServletHe orgApacheSlingHcCoreImplServletHealthCheckExecutorServletProperties2 = new OASOrgApacheSlingHcCoreImplServletHe();

        System.assertEquals(orgApacheSlingHcCoreImplServletHealthCheckExecutorServletProperties1.hashCode(), orgApacheSlingHcCoreImplServletHealthCheckExecutorServletProperties1.hashCode());
        System.assertEquals(orgApacheSlingHcCoreImplServletHealthCheckExecutorServletProperties2.hashCode(), orgApacheSlingHcCoreImplServletHealthCheckExecutorServletProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASOrgApacheSlingHcCoreImplServletHe orgApacheSlingHcCoreImplServletHealthCheckExecutorServletProperties1 = OASOrgApacheSlingHcCoreImplServletHe.getExample();
        OASOrgApacheSlingHcCoreImplServletHe orgApacheSlingHcCoreImplServletHealthCheckExecutorServletProperties2 = OASOrgApacheSlingHcCoreImplServletHe.getExample();
        OASOrgApacheSlingHcCoreImplServletHe orgApacheSlingHcCoreImplServletHealthCheckExecutorServletProperties3 = new OASOrgApacheSlingHcCoreImplServletHe();
        OASOrgApacheSlingHcCoreImplServletHe orgApacheSlingHcCoreImplServletHealthCheckExecutorServletProperties4 = new OASOrgApacheSlingHcCoreImplServletHe();

        System.assert(orgApacheSlingHcCoreImplServletHealthCheckExecutorServletProperties1.equals(orgApacheSlingHcCoreImplServletHealthCheckExecutorServletProperties2));
        System.assert(orgApacheSlingHcCoreImplServletHealthCheckExecutorServletProperties3.equals(orgApacheSlingHcCoreImplServletHealthCheckExecutorServletProperties4));
        System.assertEquals(orgApacheSlingHcCoreImplServletHealthCheckExecutorServletProperties1.hashCode(), orgApacheSlingHcCoreImplServletHealthCheckExecutorServletProperties2.hashCode());
        System.assertEquals(orgApacheSlingHcCoreImplServletHealthCheckExecutorServletProperties3.hashCode(), orgApacheSlingHcCoreImplServletHealthCheckExecutorServletProperties4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASOrgApacheSlingHcCoreImplServletHe orgApacheSlingHcCoreImplServletHealthCheckExecutorServletProperties = new OASOrgApacheSlingHcCoreImplServletHe();
        Map<String, String> propertyMappings = orgApacheSlingHcCoreImplServletHealthCheckExecutorServletProperties.getPropertyMappings();
        System.assertEquals('corsAccessControlAllowOrigin', propertyMappings.get('cors.accessControlAllowOrigin'));
    }
}
