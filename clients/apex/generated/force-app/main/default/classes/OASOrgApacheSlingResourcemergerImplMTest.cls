@isTest
private class OASOrgApacheSlingResourcemergerImplMTest {
    @isTest
    private static void equalsSameInstance() {
        OASOrgApacheSlingResourcemergerImplM orgApacheSlingResourcemergerImplMergedResourceProviderFactoryProperties1 = OASOrgApacheSlingResourcemergerImplM.getExample();
        OASOrgApacheSlingResourcemergerImplM orgApacheSlingResourcemergerImplMergedResourceProviderFactoryProperties2 = orgApacheSlingResourcemergerImplMergedResourceProviderFactoryProperties1;
        OASOrgApacheSlingResourcemergerImplM orgApacheSlingResourcemergerImplMergedResourceProviderFactoryProperties3 = new OASOrgApacheSlingResourcemergerImplM();
        OASOrgApacheSlingResourcemergerImplM orgApacheSlingResourcemergerImplMergedResourceProviderFactoryProperties4 = orgApacheSlingResourcemergerImplMergedResourceProviderFactoryProperties3;

        System.assert(orgApacheSlingResourcemergerImplMergedResourceProviderFactoryProperties1.equals(orgApacheSlingResourcemergerImplMergedResourceProviderFactoryProperties2));
        System.assert(orgApacheSlingResourcemergerImplMergedResourceProviderFactoryProperties2.equals(orgApacheSlingResourcemergerImplMergedResourceProviderFactoryProperties1));
        System.assert(orgApacheSlingResourcemergerImplMergedResourceProviderFactoryProperties1.equals(orgApacheSlingResourcemergerImplMergedResourceProviderFactoryProperties1));
        System.assert(orgApacheSlingResourcemergerImplMergedResourceProviderFactoryProperties3.equals(orgApacheSlingResourcemergerImplMergedResourceProviderFactoryProperties4));
        System.assert(orgApacheSlingResourcemergerImplMergedResourceProviderFactoryProperties4.equals(orgApacheSlingResourcemergerImplMergedResourceProviderFactoryProperties3));
        System.assert(orgApacheSlingResourcemergerImplMergedResourceProviderFactoryProperties3.equals(orgApacheSlingResourcemergerImplMergedResourceProviderFactoryProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASOrgApacheSlingResourcemergerImplM orgApacheSlingResourcemergerImplMergedResourceProviderFactoryProperties1 = OASOrgApacheSlingResourcemergerImplM.getExample();
        OASOrgApacheSlingResourcemergerImplM orgApacheSlingResourcemergerImplMergedResourceProviderFactoryProperties2 = OASOrgApacheSlingResourcemergerImplM.getExample();
        OASOrgApacheSlingResourcemergerImplM orgApacheSlingResourcemergerImplMergedResourceProviderFactoryProperties3 = new OASOrgApacheSlingResourcemergerImplM();
        OASOrgApacheSlingResourcemergerImplM orgApacheSlingResourcemergerImplMergedResourceProviderFactoryProperties4 = new OASOrgApacheSlingResourcemergerImplM();

        System.assert(orgApacheSlingResourcemergerImplMergedResourceProviderFactoryProperties1.equals(orgApacheSlingResourcemergerImplMergedResourceProviderFactoryProperties2));
        System.assert(orgApacheSlingResourcemergerImplMergedResourceProviderFactoryProperties2.equals(orgApacheSlingResourcemergerImplMergedResourceProviderFactoryProperties1));
        System.assert(orgApacheSlingResourcemergerImplMergedResourceProviderFactoryProperties3.equals(orgApacheSlingResourcemergerImplMergedResourceProviderFactoryProperties4));
        System.assert(orgApacheSlingResourcemergerImplMergedResourceProviderFactoryProperties4.equals(orgApacheSlingResourcemergerImplMergedResourceProviderFactoryProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASOrgApacheSlingResourcemergerImplM orgApacheSlingResourcemergerImplMergedResourceProviderFactoryProperties1 = OASOrgApacheSlingResourcemergerImplM.getExample();
        OASOrgApacheSlingResourcemergerImplM orgApacheSlingResourcemergerImplMergedResourceProviderFactoryProperties2 = new OASOrgApacheSlingResourcemergerImplM();

        System.assertEquals(false, orgApacheSlingResourcemergerImplMergedResourceProviderFactoryProperties1.equals('foo'));
        System.assertEquals(false, orgApacheSlingResourcemergerImplMergedResourceProviderFactoryProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASOrgApacheSlingResourcemergerImplM orgApacheSlingResourcemergerImplMergedResourceProviderFactoryProperties1 = OASOrgApacheSlingResourcemergerImplM.getExample();
        OASOrgApacheSlingResourcemergerImplM orgApacheSlingResourcemergerImplMergedResourceProviderFactoryProperties2 = new OASOrgApacheSlingResourcemergerImplM();
        OASOrgApacheSlingResourcemergerImplM orgApacheSlingResourcemergerImplMergedResourceProviderFactoryProperties3;

        System.assertEquals(false, orgApacheSlingResourcemergerImplMergedResourceProviderFactoryProperties1.equals(orgApacheSlingResourcemergerImplMergedResourceProviderFactoryProperties3));
        System.assertEquals(false, orgApacheSlingResourcemergerImplMergedResourceProviderFactoryProperties2.equals(orgApacheSlingResourcemergerImplMergedResourceProviderFactoryProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASOrgApacheSlingResourcemergerImplM orgApacheSlingResourcemergerImplMergedResourceProviderFactoryProperties1 = OASOrgApacheSlingResourcemergerImplM.getExample();
        OASOrgApacheSlingResourcemergerImplM orgApacheSlingResourcemergerImplMergedResourceProviderFactoryProperties2 = new OASOrgApacheSlingResourcemergerImplM();

        System.assertEquals(orgApacheSlingResourcemergerImplMergedResourceProviderFactoryProperties1.hashCode(), orgApacheSlingResourcemergerImplMergedResourceProviderFactoryProperties1.hashCode());
        System.assertEquals(orgApacheSlingResourcemergerImplMergedResourceProviderFactoryProperties2.hashCode(), orgApacheSlingResourcemergerImplMergedResourceProviderFactoryProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASOrgApacheSlingResourcemergerImplM orgApacheSlingResourcemergerImplMergedResourceProviderFactoryProperties1 = OASOrgApacheSlingResourcemergerImplM.getExample();
        OASOrgApacheSlingResourcemergerImplM orgApacheSlingResourcemergerImplMergedResourceProviderFactoryProperties2 = OASOrgApacheSlingResourcemergerImplM.getExample();
        OASOrgApacheSlingResourcemergerImplM orgApacheSlingResourcemergerImplMergedResourceProviderFactoryProperties3 = new OASOrgApacheSlingResourcemergerImplM();
        OASOrgApacheSlingResourcemergerImplM orgApacheSlingResourcemergerImplMergedResourceProviderFactoryProperties4 = new OASOrgApacheSlingResourcemergerImplM();

        System.assert(orgApacheSlingResourcemergerImplMergedResourceProviderFactoryProperties1.equals(orgApacheSlingResourcemergerImplMergedResourceProviderFactoryProperties2));
        System.assert(orgApacheSlingResourcemergerImplMergedResourceProviderFactoryProperties3.equals(orgApacheSlingResourcemergerImplMergedResourceProviderFactoryProperties4));
        System.assertEquals(orgApacheSlingResourcemergerImplMergedResourceProviderFactoryProperties1.hashCode(), orgApacheSlingResourcemergerImplMergedResourceProviderFactoryProperties2.hashCode());
        System.assertEquals(orgApacheSlingResourcemergerImplMergedResourceProviderFactoryProperties3.hashCode(), orgApacheSlingResourcemergerImplMergedResourceProviderFactoryProperties4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASOrgApacheSlingResourcemergerImplM orgApacheSlingResourcemergerImplMergedResourceProviderFactoryProperties = new OASOrgApacheSlingResourcemergerImplM();
        Map<String, String> propertyMappings = orgApacheSlingResourcemergerImplMergedResourceProviderFactoryProperties.getPropertyMappings();
        System.assertEquals('mergeRoot', propertyMappings.get('merge.root'));
        System.assertEquals('mergeReadOnly', propertyMappings.get('merge.readOnly'));
    }
}
