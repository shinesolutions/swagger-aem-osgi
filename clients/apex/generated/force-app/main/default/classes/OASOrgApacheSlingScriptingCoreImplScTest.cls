@isTest
private class OASOrgApacheSlingScriptingCoreImplScTest {
    @isTest
    private static void equalsSameInstance() {
        OASOrgApacheSlingScriptingCoreImplSc orgApacheSlingScriptingCoreImplScriptingResourceResolverProviderProperties1 = OASOrgApacheSlingScriptingCoreImplSc.getExample();
        OASOrgApacheSlingScriptingCoreImplSc orgApacheSlingScriptingCoreImplScriptingResourceResolverProviderProperties2 = orgApacheSlingScriptingCoreImplScriptingResourceResolverProviderProperties1;
        OASOrgApacheSlingScriptingCoreImplSc orgApacheSlingScriptingCoreImplScriptingResourceResolverProviderProperties3 = new OASOrgApacheSlingScriptingCoreImplSc();
        OASOrgApacheSlingScriptingCoreImplSc orgApacheSlingScriptingCoreImplScriptingResourceResolverProviderProperties4 = orgApacheSlingScriptingCoreImplScriptingResourceResolverProviderProperties3;

        System.assert(orgApacheSlingScriptingCoreImplScriptingResourceResolverProviderProperties1.equals(orgApacheSlingScriptingCoreImplScriptingResourceResolverProviderProperties2));
        System.assert(orgApacheSlingScriptingCoreImplScriptingResourceResolverProviderProperties2.equals(orgApacheSlingScriptingCoreImplScriptingResourceResolverProviderProperties1));
        System.assert(orgApacheSlingScriptingCoreImplScriptingResourceResolverProviderProperties1.equals(orgApacheSlingScriptingCoreImplScriptingResourceResolverProviderProperties1));
        System.assert(orgApacheSlingScriptingCoreImplScriptingResourceResolverProviderProperties3.equals(orgApacheSlingScriptingCoreImplScriptingResourceResolverProviderProperties4));
        System.assert(orgApacheSlingScriptingCoreImplScriptingResourceResolverProviderProperties4.equals(orgApacheSlingScriptingCoreImplScriptingResourceResolverProviderProperties3));
        System.assert(orgApacheSlingScriptingCoreImplScriptingResourceResolverProviderProperties3.equals(orgApacheSlingScriptingCoreImplScriptingResourceResolverProviderProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASOrgApacheSlingScriptingCoreImplSc orgApacheSlingScriptingCoreImplScriptingResourceResolverProviderProperties1 = OASOrgApacheSlingScriptingCoreImplSc.getExample();
        OASOrgApacheSlingScriptingCoreImplSc orgApacheSlingScriptingCoreImplScriptingResourceResolverProviderProperties2 = OASOrgApacheSlingScriptingCoreImplSc.getExample();
        OASOrgApacheSlingScriptingCoreImplSc orgApacheSlingScriptingCoreImplScriptingResourceResolverProviderProperties3 = new OASOrgApacheSlingScriptingCoreImplSc();
        OASOrgApacheSlingScriptingCoreImplSc orgApacheSlingScriptingCoreImplScriptingResourceResolverProviderProperties4 = new OASOrgApacheSlingScriptingCoreImplSc();

        System.assert(orgApacheSlingScriptingCoreImplScriptingResourceResolverProviderProperties1.equals(orgApacheSlingScriptingCoreImplScriptingResourceResolverProviderProperties2));
        System.assert(orgApacheSlingScriptingCoreImplScriptingResourceResolverProviderProperties2.equals(orgApacheSlingScriptingCoreImplScriptingResourceResolverProviderProperties1));
        System.assert(orgApacheSlingScriptingCoreImplScriptingResourceResolverProviderProperties3.equals(orgApacheSlingScriptingCoreImplScriptingResourceResolverProviderProperties4));
        System.assert(orgApacheSlingScriptingCoreImplScriptingResourceResolverProviderProperties4.equals(orgApacheSlingScriptingCoreImplScriptingResourceResolverProviderProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASOrgApacheSlingScriptingCoreImplSc orgApacheSlingScriptingCoreImplScriptingResourceResolverProviderProperties1 = OASOrgApacheSlingScriptingCoreImplSc.getExample();
        OASOrgApacheSlingScriptingCoreImplSc orgApacheSlingScriptingCoreImplScriptingResourceResolverProviderProperties2 = new OASOrgApacheSlingScriptingCoreImplSc();

        System.assertEquals(false, orgApacheSlingScriptingCoreImplScriptingResourceResolverProviderProperties1.equals('foo'));
        System.assertEquals(false, orgApacheSlingScriptingCoreImplScriptingResourceResolverProviderProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASOrgApacheSlingScriptingCoreImplSc orgApacheSlingScriptingCoreImplScriptingResourceResolverProviderProperties1 = OASOrgApacheSlingScriptingCoreImplSc.getExample();
        OASOrgApacheSlingScriptingCoreImplSc orgApacheSlingScriptingCoreImplScriptingResourceResolverProviderProperties2 = new OASOrgApacheSlingScriptingCoreImplSc();
        OASOrgApacheSlingScriptingCoreImplSc orgApacheSlingScriptingCoreImplScriptingResourceResolverProviderProperties3;

        System.assertEquals(false, orgApacheSlingScriptingCoreImplScriptingResourceResolverProviderProperties1.equals(orgApacheSlingScriptingCoreImplScriptingResourceResolverProviderProperties3));
        System.assertEquals(false, orgApacheSlingScriptingCoreImplScriptingResourceResolverProviderProperties2.equals(orgApacheSlingScriptingCoreImplScriptingResourceResolverProviderProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASOrgApacheSlingScriptingCoreImplSc orgApacheSlingScriptingCoreImplScriptingResourceResolverProviderProperties1 = OASOrgApacheSlingScriptingCoreImplSc.getExample();
        OASOrgApacheSlingScriptingCoreImplSc orgApacheSlingScriptingCoreImplScriptingResourceResolverProviderProperties2 = new OASOrgApacheSlingScriptingCoreImplSc();

        System.assertEquals(orgApacheSlingScriptingCoreImplScriptingResourceResolverProviderProperties1.hashCode(), orgApacheSlingScriptingCoreImplScriptingResourceResolverProviderProperties1.hashCode());
        System.assertEquals(orgApacheSlingScriptingCoreImplScriptingResourceResolverProviderProperties2.hashCode(), orgApacheSlingScriptingCoreImplScriptingResourceResolverProviderProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASOrgApacheSlingScriptingCoreImplSc orgApacheSlingScriptingCoreImplScriptingResourceResolverProviderProperties1 = OASOrgApacheSlingScriptingCoreImplSc.getExample();
        OASOrgApacheSlingScriptingCoreImplSc orgApacheSlingScriptingCoreImplScriptingResourceResolverProviderProperties2 = OASOrgApacheSlingScriptingCoreImplSc.getExample();
        OASOrgApacheSlingScriptingCoreImplSc orgApacheSlingScriptingCoreImplScriptingResourceResolverProviderProperties3 = new OASOrgApacheSlingScriptingCoreImplSc();
        OASOrgApacheSlingScriptingCoreImplSc orgApacheSlingScriptingCoreImplScriptingResourceResolverProviderProperties4 = new OASOrgApacheSlingScriptingCoreImplSc();

        System.assert(orgApacheSlingScriptingCoreImplScriptingResourceResolverProviderProperties1.equals(orgApacheSlingScriptingCoreImplScriptingResourceResolverProviderProperties2));
        System.assert(orgApacheSlingScriptingCoreImplScriptingResourceResolverProviderProperties3.equals(orgApacheSlingScriptingCoreImplScriptingResourceResolverProviderProperties4));
        System.assertEquals(orgApacheSlingScriptingCoreImplScriptingResourceResolverProviderProperties1.hashCode(), orgApacheSlingScriptingCoreImplScriptingResourceResolverProviderProperties2.hashCode());
        System.assertEquals(orgApacheSlingScriptingCoreImplScriptingResourceResolverProviderProperties3.hashCode(), orgApacheSlingScriptingCoreImplScriptingResourceResolverProviderProperties4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASOrgApacheSlingScriptingCoreImplSc orgApacheSlingScriptingCoreImplScriptingResourceResolverProviderProperties = new OASOrgApacheSlingScriptingCoreImplSc();
        Map<String, String> propertyMappings = orgApacheSlingScriptingCoreImplScriptingResourceResolverProviderProperties.getPropertyMappings();
        System.assertEquals('logStacktraceOnclose', propertyMappings.get('log.stacktrace.onclose'));
    }
}
