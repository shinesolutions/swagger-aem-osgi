@isTest
private class OASOrgApacheSlingJcrResourcesecurityTest {
    @isTest
    private static void equalsSameInstance() {
        OASOrgApacheSlingJcrResourcesecurity orgApacheSlingJcrResourcesecurityImplResourceAccessGateFactoryProperties1 = OASOrgApacheSlingJcrResourcesecurity.getExample();
        OASOrgApacheSlingJcrResourcesecurity orgApacheSlingJcrResourcesecurityImplResourceAccessGateFactoryProperties2 = orgApacheSlingJcrResourcesecurityImplResourceAccessGateFactoryProperties1;
        OASOrgApacheSlingJcrResourcesecurity orgApacheSlingJcrResourcesecurityImplResourceAccessGateFactoryProperties3 = new OASOrgApacheSlingJcrResourcesecurity();
        OASOrgApacheSlingJcrResourcesecurity orgApacheSlingJcrResourcesecurityImplResourceAccessGateFactoryProperties4 = orgApacheSlingJcrResourcesecurityImplResourceAccessGateFactoryProperties3;

        System.assert(orgApacheSlingJcrResourcesecurityImplResourceAccessGateFactoryProperties1.equals(orgApacheSlingJcrResourcesecurityImplResourceAccessGateFactoryProperties2));
        System.assert(orgApacheSlingJcrResourcesecurityImplResourceAccessGateFactoryProperties2.equals(orgApacheSlingJcrResourcesecurityImplResourceAccessGateFactoryProperties1));
        System.assert(orgApacheSlingJcrResourcesecurityImplResourceAccessGateFactoryProperties1.equals(orgApacheSlingJcrResourcesecurityImplResourceAccessGateFactoryProperties1));
        System.assert(orgApacheSlingJcrResourcesecurityImplResourceAccessGateFactoryProperties3.equals(orgApacheSlingJcrResourcesecurityImplResourceAccessGateFactoryProperties4));
        System.assert(orgApacheSlingJcrResourcesecurityImplResourceAccessGateFactoryProperties4.equals(orgApacheSlingJcrResourcesecurityImplResourceAccessGateFactoryProperties3));
        System.assert(orgApacheSlingJcrResourcesecurityImplResourceAccessGateFactoryProperties3.equals(orgApacheSlingJcrResourcesecurityImplResourceAccessGateFactoryProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASOrgApacheSlingJcrResourcesecurity orgApacheSlingJcrResourcesecurityImplResourceAccessGateFactoryProperties1 = OASOrgApacheSlingJcrResourcesecurity.getExample();
        OASOrgApacheSlingJcrResourcesecurity orgApacheSlingJcrResourcesecurityImplResourceAccessGateFactoryProperties2 = OASOrgApacheSlingJcrResourcesecurity.getExample();
        OASOrgApacheSlingJcrResourcesecurity orgApacheSlingJcrResourcesecurityImplResourceAccessGateFactoryProperties3 = new OASOrgApacheSlingJcrResourcesecurity();
        OASOrgApacheSlingJcrResourcesecurity orgApacheSlingJcrResourcesecurityImplResourceAccessGateFactoryProperties4 = new OASOrgApacheSlingJcrResourcesecurity();

        System.assert(orgApacheSlingJcrResourcesecurityImplResourceAccessGateFactoryProperties1.equals(orgApacheSlingJcrResourcesecurityImplResourceAccessGateFactoryProperties2));
        System.assert(orgApacheSlingJcrResourcesecurityImplResourceAccessGateFactoryProperties2.equals(orgApacheSlingJcrResourcesecurityImplResourceAccessGateFactoryProperties1));
        System.assert(orgApacheSlingJcrResourcesecurityImplResourceAccessGateFactoryProperties3.equals(orgApacheSlingJcrResourcesecurityImplResourceAccessGateFactoryProperties4));
        System.assert(orgApacheSlingJcrResourcesecurityImplResourceAccessGateFactoryProperties4.equals(orgApacheSlingJcrResourcesecurityImplResourceAccessGateFactoryProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASOrgApacheSlingJcrResourcesecurity orgApacheSlingJcrResourcesecurityImplResourceAccessGateFactoryProperties1 = OASOrgApacheSlingJcrResourcesecurity.getExample();
        OASOrgApacheSlingJcrResourcesecurity orgApacheSlingJcrResourcesecurityImplResourceAccessGateFactoryProperties2 = new OASOrgApacheSlingJcrResourcesecurity();

        System.assertEquals(false, orgApacheSlingJcrResourcesecurityImplResourceAccessGateFactoryProperties1.equals('foo'));
        System.assertEquals(false, orgApacheSlingJcrResourcesecurityImplResourceAccessGateFactoryProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASOrgApacheSlingJcrResourcesecurity orgApacheSlingJcrResourcesecurityImplResourceAccessGateFactoryProperties1 = OASOrgApacheSlingJcrResourcesecurity.getExample();
        OASOrgApacheSlingJcrResourcesecurity orgApacheSlingJcrResourcesecurityImplResourceAccessGateFactoryProperties2 = new OASOrgApacheSlingJcrResourcesecurity();
        OASOrgApacheSlingJcrResourcesecurity orgApacheSlingJcrResourcesecurityImplResourceAccessGateFactoryProperties3;

        System.assertEquals(false, orgApacheSlingJcrResourcesecurityImplResourceAccessGateFactoryProperties1.equals(orgApacheSlingJcrResourcesecurityImplResourceAccessGateFactoryProperties3));
        System.assertEquals(false, orgApacheSlingJcrResourcesecurityImplResourceAccessGateFactoryProperties2.equals(orgApacheSlingJcrResourcesecurityImplResourceAccessGateFactoryProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASOrgApacheSlingJcrResourcesecurity orgApacheSlingJcrResourcesecurityImplResourceAccessGateFactoryProperties1 = OASOrgApacheSlingJcrResourcesecurity.getExample();
        OASOrgApacheSlingJcrResourcesecurity orgApacheSlingJcrResourcesecurityImplResourceAccessGateFactoryProperties2 = new OASOrgApacheSlingJcrResourcesecurity();

        System.assertEquals(orgApacheSlingJcrResourcesecurityImplResourceAccessGateFactoryProperties1.hashCode(), orgApacheSlingJcrResourcesecurityImplResourceAccessGateFactoryProperties1.hashCode());
        System.assertEquals(orgApacheSlingJcrResourcesecurityImplResourceAccessGateFactoryProperties2.hashCode(), orgApacheSlingJcrResourcesecurityImplResourceAccessGateFactoryProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASOrgApacheSlingJcrResourcesecurity orgApacheSlingJcrResourcesecurityImplResourceAccessGateFactoryProperties1 = OASOrgApacheSlingJcrResourcesecurity.getExample();
        OASOrgApacheSlingJcrResourcesecurity orgApacheSlingJcrResourcesecurityImplResourceAccessGateFactoryProperties2 = OASOrgApacheSlingJcrResourcesecurity.getExample();
        OASOrgApacheSlingJcrResourcesecurity orgApacheSlingJcrResourcesecurityImplResourceAccessGateFactoryProperties3 = new OASOrgApacheSlingJcrResourcesecurity();
        OASOrgApacheSlingJcrResourcesecurity orgApacheSlingJcrResourcesecurityImplResourceAccessGateFactoryProperties4 = new OASOrgApacheSlingJcrResourcesecurity();

        System.assert(orgApacheSlingJcrResourcesecurityImplResourceAccessGateFactoryProperties1.equals(orgApacheSlingJcrResourcesecurityImplResourceAccessGateFactoryProperties2));
        System.assert(orgApacheSlingJcrResourcesecurityImplResourceAccessGateFactoryProperties3.equals(orgApacheSlingJcrResourcesecurityImplResourceAccessGateFactoryProperties4));
        System.assertEquals(orgApacheSlingJcrResourcesecurityImplResourceAccessGateFactoryProperties1.hashCode(), orgApacheSlingJcrResourcesecurityImplResourceAccessGateFactoryProperties2.hashCode());
        System.assertEquals(orgApacheSlingJcrResourcesecurityImplResourceAccessGateFactoryProperties3.hashCode(), orgApacheSlingJcrResourcesecurityImplResourceAccessGateFactoryProperties4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASOrgApacheSlingJcrResourcesecurity orgApacheSlingJcrResourcesecurityImplResourceAccessGateFactoryProperties = new OASOrgApacheSlingJcrResourcesecurity();
        Map<String, String> propertyMappings = orgApacheSlingJcrResourcesecurityImplResourceAccessGateFactoryProperties.getPropertyMappings();
        System.assertEquals('checkpathPrefix', propertyMappings.get('checkpath.prefix'));
    }
}
