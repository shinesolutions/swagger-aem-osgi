@isTest
private class OASOrgApacheSlingHcCoreImplScriptablTest {
    @isTest
    private static void equalsSameInstance() {
        OASOrgApacheSlingHcCoreImplScriptabl orgApacheSlingHcCoreImplScriptableHealthCheckProperties1 = OASOrgApacheSlingHcCoreImplScriptabl.getExample();
        OASOrgApacheSlingHcCoreImplScriptabl orgApacheSlingHcCoreImplScriptableHealthCheckProperties2 = orgApacheSlingHcCoreImplScriptableHealthCheckProperties1;
        OASOrgApacheSlingHcCoreImplScriptabl orgApacheSlingHcCoreImplScriptableHealthCheckProperties3 = new OASOrgApacheSlingHcCoreImplScriptabl();
        OASOrgApacheSlingHcCoreImplScriptabl orgApacheSlingHcCoreImplScriptableHealthCheckProperties4 = orgApacheSlingHcCoreImplScriptableHealthCheckProperties3;

        System.assert(orgApacheSlingHcCoreImplScriptableHealthCheckProperties1.equals(orgApacheSlingHcCoreImplScriptableHealthCheckProperties2));
        System.assert(orgApacheSlingHcCoreImplScriptableHealthCheckProperties2.equals(orgApacheSlingHcCoreImplScriptableHealthCheckProperties1));
        System.assert(orgApacheSlingHcCoreImplScriptableHealthCheckProperties1.equals(orgApacheSlingHcCoreImplScriptableHealthCheckProperties1));
        System.assert(orgApacheSlingHcCoreImplScriptableHealthCheckProperties3.equals(orgApacheSlingHcCoreImplScriptableHealthCheckProperties4));
        System.assert(orgApacheSlingHcCoreImplScriptableHealthCheckProperties4.equals(orgApacheSlingHcCoreImplScriptableHealthCheckProperties3));
        System.assert(orgApacheSlingHcCoreImplScriptableHealthCheckProperties3.equals(orgApacheSlingHcCoreImplScriptableHealthCheckProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASOrgApacheSlingHcCoreImplScriptabl orgApacheSlingHcCoreImplScriptableHealthCheckProperties1 = OASOrgApacheSlingHcCoreImplScriptabl.getExample();
        OASOrgApacheSlingHcCoreImplScriptabl orgApacheSlingHcCoreImplScriptableHealthCheckProperties2 = OASOrgApacheSlingHcCoreImplScriptabl.getExample();
        OASOrgApacheSlingHcCoreImplScriptabl orgApacheSlingHcCoreImplScriptableHealthCheckProperties3 = new OASOrgApacheSlingHcCoreImplScriptabl();
        OASOrgApacheSlingHcCoreImplScriptabl orgApacheSlingHcCoreImplScriptableHealthCheckProperties4 = new OASOrgApacheSlingHcCoreImplScriptabl();

        System.assert(orgApacheSlingHcCoreImplScriptableHealthCheckProperties1.equals(orgApacheSlingHcCoreImplScriptableHealthCheckProperties2));
        System.assert(orgApacheSlingHcCoreImplScriptableHealthCheckProperties2.equals(orgApacheSlingHcCoreImplScriptableHealthCheckProperties1));
        System.assert(orgApacheSlingHcCoreImplScriptableHealthCheckProperties3.equals(orgApacheSlingHcCoreImplScriptableHealthCheckProperties4));
        System.assert(orgApacheSlingHcCoreImplScriptableHealthCheckProperties4.equals(orgApacheSlingHcCoreImplScriptableHealthCheckProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASOrgApacheSlingHcCoreImplScriptabl orgApacheSlingHcCoreImplScriptableHealthCheckProperties1 = OASOrgApacheSlingHcCoreImplScriptabl.getExample();
        OASOrgApacheSlingHcCoreImplScriptabl orgApacheSlingHcCoreImplScriptableHealthCheckProperties2 = new OASOrgApacheSlingHcCoreImplScriptabl();

        System.assertEquals(false, orgApacheSlingHcCoreImplScriptableHealthCheckProperties1.equals('foo'));
        System.assertEquals(false, orgApacheSlingHcCoreImplScriptableHealthCheckProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASOrgApacheSlingHcCoreImplScriptabl orgApacheSlingHcCoreImplScriptableHealthCheckProperties1 = OASOrgApacheSlingHcCoreImplScriptabl.getExample();
        OASOrgApacheSlingHcCoreImplScriptabl orgApacheSlingHcCoreImplScriptableHealthCheckProperties2 = new OASOrgApacheSlingHcCoreImplScriptabl();
        OASOrgApacheSlingHcCoreImplScriptabl orgApacheSlingHcCoreImplScriptableHealthCheckProperties3;

        System.assertEquals(false, orgApacheSlingHcCoreImplScriptableHealthCheckProperties1.equals(orgApacheSlingHcCoreImplScriptableHealthCheckProperties3));
        System.assertEquals(false, orgApacheSlingHcCoreImplScriptableHealthCheckProperties2.equals(orgApacheSlingHcCoreImplScriptableHealthCheckProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASOrgApacheSlingHcCoreImplScriptabl orgApacheSlingHcCoreImplScriptableHealthCheckProperties1 = OASOrgApacheSlingHcCoreImplScriptabl.getExample();
        OASOrgApacheSlingHcCoreImplScriptabl orgApacheSlingHcCoreImplScriptableHealthCheckProperties2 = new OASOrgApacheSlingHcCoreImplScriptabl();

        System.assertEquals(orgApacheSlingHcCoreImplScriptableHealthCheckProperties1.hashCode(), orgApacheSlingHcCoreImplScriptableHealthCheckProperties1.hashCode());
        System.assertEquals(orgApacheSlingHcCoreImplScriptableHealthCheckProperties2.hashCode(), orgApacheSlingHcCoreImplScriptableHealthCheckProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASOrgApacheSlingHcCoreImplScriptabl orgApacheSlingHcCoreImplScriptableHealthCheckProperties1 = OASOrgApacheSlingHcCoreImplScriptabl.getExample();
        OASOrgApacheSlingHcCoreImplScriptabl orgApacheSlingHcCoreImplScriptableHealthCheckProperties2 = OASOrgApacheSlingHcCoreImplScriptabl.getExample();
        OASOrgApacheSlingHcCoreImplScriptabl orgApacheSlingHcCoreImplScriptableHealthCheckProperties3 = new OASOrgApacheSlingHcCoreImplScriptabl();
        OASOrgApacheSlingHcCoreImplScriptabl orgApacheSlingHcCoreImplScriptableHealthCheckProperties4 = new OASOrgApacheSlingHcCoreImplScriptabl();

        System.assert(orgApacheSlingHcCoreImplScriptableHealthCheckProperties1.equals(orgApacheSlingHcCoreImplScriptableHealthCheckProperties2));
        System.assert(orgApacheSlingHcCoreImplScriptableHealthCheckProperties3.equals(orgApacheSlingHcCoreImplScriptableHealthCheckProperties4));
        System.assertEquals(orgApacheSlingHcCoreImplScriptableHealthCheckProperties1.hashCode(), orgApacheSlingHcCoreImplScriptableHealthCheckProperties2.hashCode());
        System.assertEquals(orgApacheSlingHcCoreImplScriptableHealthCheckProperties3.hashCode(), orgApacheSlingHcCoreImplScriptableHealthCheckProperties4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASOrgApacheSlingHcCoreImplScriptabl orgApacheSlingHcCoreImplScriptableHealthCheckProperties = new OASOrgApacheSlingHcCoreImplScriptabl();
        Map<String, String> propertyMappings = orgApacheSlingHcCoreImplScriptableHealthCheckProperties.getPropertyMappings();
        System.assertEquals('hcName', propertyMappings.get('hc.name'));
        System.assertEquals('hcTags', propertyMappings.get('hc.tags'));
        System.assertEquals('hcMbeanName', propertyMappings.get('hc.mbean.name'));
        System.assertEquals('languageExtension', propertyMappings.get('language.extension'));
    }
}
