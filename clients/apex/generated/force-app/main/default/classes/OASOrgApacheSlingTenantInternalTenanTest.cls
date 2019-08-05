@isTest
private class OASOrgApacheSlingTenantInternalTenanTest {
    @isTest
    private static void equalsSameInstance() {
        OASOrgApacheSlingTenantInternalTenan orgApacheSlingTenantInternalTenantProviderImplProperties1 = OASOrgApacheSlingTenantInternalTenan.getExample();
        OASOrgApacheSlingTenantInternalTenan orgApacheSlingTenantInternalTenantProviderImplProperties2 = orgApacheSlingTenantInternalTenantProviderImplProperties1;
        OASOrgApacheSlingTenantInternalTenan orgApacheSlingTenantInternalTenantProviderImplProperties3 = new OASOrgApacheSlingTenantInternalTenan();
        OASOrgApacheSlingTenantInternalTenan orgApacheSlingTenantInternalTenantProviderImplProperties4 = orgApacheSlingTenantInternalTenantProviderImplProperties3;

        System.assert(orgApacheSlingTenantInternalTenantProviderImplProperties1.equals(orgApacheSlingTenantInternalTenantProviderImplProperties2));
        System.assert(orgApacheSlingTenantInternalTenantProviderImplProperties2.equals(orgApacheSlingTenantInternalTenantProviderImplProperties1));
        System.assert(orgApacheSlingTenantInternalTenantProviderImplProperties1.equals(orgApacheSlingTenantInternalTenantProviderImplProperties1));
        System.assert(orgApacheSlingTenantInternalTenantProviderImplProperties3.equals(orgApacheSlingTenantInternalTenantProviderImplProperties4));
        System.assert(orgApacheSlingTenantInternalTenantProviderImplProperties4.equals(orgApacheSlingTenantInternalTenantProviderImplProperties3));
        System.assert(orgApacheSlingTenantInternalTenantProviderImplProperties3.equals(orgApacheSlingTenantInternalTenantProviderImplProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASOrgApacheSlingTenantInternalTenan orgApacheSlingTenantInternalTenantProviderImplProperties1 = OASOrgApacheSlingTenantInternalTenan.getExample();
        OASOrgApacheSlingTenantInternalTenan orgApacheSlingTenantInternalTenantProviderImplProperties2 = OASOrgApacheSlingTenantInternalTenan.getExample();
        OASOrgApacheSlingTenantInternalTenan orgApacheSlingTenantInternalTenantProviderImplProperties3 = new OASOrgApacheSlingTenantInternalTenan();
        OASOrgApacheSlingTenantInternalTenan orgApacheSlingTenantInternalTenantProviderImplProperties4 = new OASOrgApacheSlingTenantInternalTenan();

        System.assert(orgApacheSlingTenantInternalTenantProviderImplProperties1.equals(orgApacheSlingTenantInternalTenantProviderImplProperties2));
        System.assert(orgApacheSlingTenantInternalTenantProviderImplProperties2.equals(orgApacheSlingTenantInternalTenantProviderImplProperties1));
        System.assert(orgApacheSlingTenantInternalTenantProviderImplProperties3.equals(orgApacheSlingTenantInternalTenantProviderImplProperties4));
        System.assert(orgApacheSlingTenantInternalTenantProviderImplProperties4.equals(orgApacheSlingTenantInternalTenantProviderImplProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASOrgApacheSlingTenantInternalTenan orgApacheSlingTenantInternalTenantProviderImplProperties1 = OASOrgApacheSlingTenantInternalTenan.getExample();
        OASOrgApacheSlingTenantInternalTenan orgApacheSlingTenantInternalTenantProviderImplProperties2 = new OASOrgApacheSlingTenantInternalTenan();

        System.assertEquals(false, orgApacheSlingTenantInternalTenantProviderImplProperties1.equals('foo'));
        System.assertEquals(false, orgApacheSlingTenantInternalTenantProviderImplProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASOrgApacheSlingTenantInternalTenan orgApacheSlingTenantInternalTenantProviderImplProperties1 = OASOrgApacheSlingTenantInternalTenan.getExample();
        OASOrgApacheSlingTenantInternalTenan orgApacheSlingTenantInternalTenantProviderImplProperties2 = new OASOrgApacheSlingTenantInternalTenan();
        OASOrgApacheSlingTenantInternalTenan orgApacheSlingTenantInternalTenantProviderImplProperties3;

        System.assertEquals(false, orgApacheSlingTenantInternalTenantProviderImplProperties1.equals(orgApacheSlingTenantInternalTenantProviderImplProperties3));
        System.assertEquals(false, orgApacheSlingTenantInternalTenantProviderImplProperties2.equals(orgApacheSlingTenantInternalTenantProviderImplProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASOrgApacheSlingTenantInternalTenan orgApacheSlingTenantInternalTenantProviderImplProperties1 = OASOrgApacheSlingTenantInternalTenan.getExample();
        OASOrgApacheSlingTenantInternalTenan orgApacheSlingTenantInternalTenantProviderImplProperties2 = new OASOrgApacheSlingTenantInternalTenan();

        System.assertEquals(orgApacheSlingTenantInternalTenantProviderImplProperties1.hashCode(), orgApacheSlingTenantInternalTenantProviderImplProperties1.hashCode());
        System.assertEquals(orgApacheSlingTenantInternalTenantProviderImplProperties2.hashCode(), orgApacheSlingTenantInternalTenantProviderImplProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASOrgApacheSlingTenantInternalTenan orgApacheSlingTenantInternalTenantProviderImplProperties1 = OASOrgApacheSlingTenantInternalTenan.getExample();
        OASOrgApacheSlingTenantInternalTenan orgApacheSlingTenantInternalTenantProviderImplProperties2 = OASOrgApacheSlingTenantInternalTenan.getExample();
        OASOrgApacheSlingTenantInternalTenan orgApacheSlingTenantInternalTenantProviderImplProperties3 = new OASOrgApacheSlingTenantInternalTenan();
        OASOrgApacheSlingTenantInternalTenan orgApacheSlingTenantInternalTenantProviderImplProperties4 = new OASOrgApacheSlingTenantInternalTenan();

        System.assert(orgApacheSlingTenantInternalTenantProviderImplProperties1.equals(orgApacheSlingTenantInternalTenantProviderImplProperties2));
        System.assert(orgApacheSlingTenantInternalTenantProviderImplProperties3.equals(orgApacheSlingTenantInternalTenantProviderImplProperties4));
        System.assertEquals(orgApacheSlingTenantInternalTenantProviderImplProperties1.hashCode(), orgApacheSlingTenantInternalTenantProviderImplProperties2.hashCode());
        System.assertEquals(orgApacheSlingTenantInternalTenantProviderImplProperties3.hashCode(), orgApacheSlingTenantInternalTenantProviderImplProperties4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASOrgApacheSlingTenantInternalTenan orgApacheSlingTenantInternalTenantProviderImplProperties = new OASOrgApacheSlingTenantInternalTenan();
        Map<String, String> propertyMappings = orgApacheSlingTenantInternalTenantProviderImplProperties.getPropertyMappings();
        System.assertEquals('tenantRoot', propertyMappings.get('tenant.root'));
        System.assertEquals('tenantPathMatcher', propertyMappings.get('tenant.path.matcher'));
    }
}
