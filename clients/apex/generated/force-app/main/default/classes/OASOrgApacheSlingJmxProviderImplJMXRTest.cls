@isTest
private class OASOrgApacheSlingJmxProviderImplJMXRTest {
    @isTest
    private static void equalsSameInstance() {
        OASOrgApacheSlingJmxProviderImplJMXR orgApacheSlingJmxProviderImplJMXResourceProviderProperties1 = OASOrgApacheSlingJmxProviderImplJMXR.getExample();
        OASOrgApacheSlingJmxProviderImplJMXR orgApacheSlingJmxProviderImplJMXResourceProviderProperties2 = orgApacheSlingJmxProviderImplJMXResourceProviderProperties1;
        OASOrgApacheSlingJmxProviderImplJMXR orgApacheSlingJmxProviderImplJMXResourceProviderProperties3 = new OASOrgApacheSlingJmxProviderImplJMXR();
        OASOrgApacheSlingJmxProviderImplJMXR orgApacheSlingJmxProviderImplJMXResourceProviderProperties4 = orgApacheSlingJmxProviderImplJMXResourceProviderProperties3;

        System.assert(orgApacheSlingJmxProviderImplJMXResourceProviderProperties1.equals(orgApacheSlingJmxProviderImplJMXResourceProviderProperties2));
        System.assert(orgApacheSlingJmxProviderImplJMXResourceProviderProperties2.equals(orgApacheSlingJmxProviderImplJMXResourceProviderProperties1));
        System.assert(orgApacheSlingJmxProviderImplJMXResourceProviderProperties1.equals(orgApacheSlingJmxProviderImplJMXResourceProviderProperties1));
        System.assert(orgApacheSlingJmxProviderImplJMXResourceProviderProperties3.equals(orgApacheSlingJmxProviderImplJMXResourceProviderProperties4));
        System.assert(orgApacheSlingJmxProviderImplJMXResourceProviderProperties4.equals(orgApacheSlingJmxProviderImplJMXResourceProviderProperties3));
        System.assert(orgApacheSlingJmxProviderImplJMXResourceProviderProperties3.equals(orgApacheSlingJmxProviderImplJMXResourceProviderProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASOrgApacheSlingJmxProviderImplJMXR orgApacheSlingJmxProviderImplJMXResourceProviderProperties1 = OASOrgApacheSlingJmxProviderImplJMXR.getExample();
        OASOrgApacheSlingJmxProviderImplJMXR orgApacheSlingJmxProviderImplJMXResourceProviderProperties2 = OASOrgApacheSlingJmxProviderImplJMXR.getExample();
        OASOrgApacheSlingJmxProviderImplJMXR orgApacheSlingJmxProviderImplJMXResourceProviderProperties3 = new OASOrgApacheSlingJmxProviderImplJMXR();
        OASOrgApacheSlingJmxProviderImplJMXR orgApacheSlingJmxProviderImplJMXResourceProviderProperties4 = new OASOrgApacheSlingJmxProviderImplJMXR();

        System.assert(orgApacheSlingJmxProviderImplJMXResourceProviderProperties1.equals(orgApacheSlingJmxProviderImplJMXResourceProviderProperties2));
        System.assert(orgApacheSlingJmxProviderImplJMXResourceProviderProperties2.equals(orgApacheSlingJmxProviderImplJMXResourceProviderProperties1));
        System.assert(orgApacheSlingJmxProviderImplJMXResourceProviderProperties3.equals(orgApacheSlingJmxProviderImplJMXResourceProviderProperties4));
        System.assert(orgApacheSlingJmxProviderImplJMXResourceProviderProperties4.equals(orgApacheSlingJmxProviderImplJMXResourceProviderProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASOrgApacheSlingJmxProviderImplJMXR orgApacheSlingJmxProviderImplJMXResourceProviderProperties1 = OASOrgApacheSlingJmxProviderImplJMXR.getExample();
        OASOrgApacheSlingJmxProviderImplJMXR orgApacheSlingJmxProviderImplJMXResourceProviderProperties2 = new OASOrgApacheSlingJmxProviderImplJMXR();

        System.assertEquals(false, orgApacheSlingJmxProviderImplJMXResourceProviderProperties1.equals('foo'));
        System.assertEquals(false, orgApacheSlingJmxProviderImplJMXResourceProviderProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASOrgApacheSlingJmxProviderImplJMXR orgApacheSlingJmxProviderImplJMXResourceProviderProperties1 = OASOrgApacheSlingJmxProviderImplJMXR.getExample();
        OASOrgApacheSlingJmxProviderImplJMXR orgApacheSlingJmxProviderImplJMXResourceProviderProperties2 = new OASOrgApacheSlingJmxProviderImplJMXR();
        OASOrgApacheSlingJmxProviderImplJMXR orgApacheSlingJmxProviderImplJMXResourceProviderProperties3;

        System.assertEquals(false, orgApacheSlingJmxProviderImplJMXResourceProviderProperties1.equals(orgApacheSlingJmxProviderImplJMXResourceProviderProperties3));
        System.assertEquals(false, orgApacheSlingJmxProviderImplJMXResourceProviderProperties2.equals(orgApacheSlingJmxProviderImplJMXResourceProviderProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASOrgApacheSlingJmxProviderImplJMXR orgApacheSlingJmxProviderImplJMXResourceProviderProperties1 = OASOrgApacheSlingJmxProviderImplJMXR.getExample();
        OASOrgApacheSlingJmxProviderImplJMXR orgApacheSlingJmxProviderImplJMXResourceProviderProperties2 = new OASOrgApacheSlingJmxProviderImplJMXR();

        System.assertEquals(orgApacheSlingJmxProviderImplJMXResourceProviderProperties1.hashCode(), orgApacheSlingJmxProviderImplJMXResourceProviderProperties1.hashCode());
        System.assertEquals(orgApacheSlingJmxProviderImplJMXResourceProviderProperties2.hashCode(), orgApacheSlingJmxProviderImplJMXResourceProviderProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASOrgApacheSlingJmxProviderImplJMXR orgApacheSlingJmxProviderImplJMXResourceProviderProperties1 = OASOrgApacheSlingJmxProviderImplJMXR.getExample();
        OASOrgApacheSlingJmxProviderImplJMXR orgApacheSlingJmxProviderImplJMXResourceProviderProperties2 = OASOrgApacheSlingJmxProviderImplJMXR.getExample();
        OASOrgApacheSlingJmxProviderImplJMXR orgApacheSlingJmxProviderImplJMXResourceProviderProperties3 = new OASOrgApacheSlingJmxProviderImplJMXR();
        OASOrgApacheSlingJmxProviderImplJMXR orgApacheSlingJmxProviderImplJMXResourceProviderProperties4 = new OASOrgApacheSlingJmxProviderImplJMXR();

        System.assert(orgApacheSlingJmxProviderImplJMXResourceProviderProperties1.equals(orgApacheSlingJmxProviderImplJMXResourceProviderProperties2));
        System.assert(orgApacheSlingJmxProviderImplJMXResourceProviderProperties3.equals(orgApacheSlingJmxProviderImplJMXResourceProviderProperties4));
        System.assertEquals(orgApacheSlingJmxProviderImplJMXResourceProviderProperties1.hashCode(), orgApacheSlingJmxProviderImplJMXResourceProviderProperties2.hashCode());
        System.assertEquals(orgApacheSlingJmxProviderImplJMXResourceProviderProperties3.hashCode(), orgApacheSlingJmxProviderImplJMXResourceProviderProperties4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASOrgApacheSlingJmxProviderImplJMXR orgApacheSlingJmxProviderImplJMXResourceProviderProperties = new OASOrgApacheSlingJmxProviderImplJMXR();
        Map<String, String> propertyMappings = orgApacheSlingJmxProviderImplJMXResourceProviderProperties.getPropertyMappings();
        System.assertEquals('providerRoots', propertyMappings.get('provider.roots'));
    }
}
