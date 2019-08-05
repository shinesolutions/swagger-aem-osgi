@isTest
private class OASOrgApacheSlingSecurityImplContentTest {
    @isTest
    private static void equalsSameInstance() {
        OASOrgApacheSlingSecurityImplContent orgApacheSlingSecurityImplContentDispositionFilterProperties1 = OASOrgApacheSlingSecurityImplContent.getExample();
        OASOrgApacheSlingSecurityImplContent orgApacheSlingSecurityImplContentDispositionFilterProperties2 = orgApacheSlingSecurityImplContentDispositionFilterProperties1;
        OASOrgApacheSlingSecurityImplContent orgApacheSlingSecurityImplContentDispositionFilterProperties3 = new OASOrgApacheSlingSecurityImplContent();
        OASOrgApacheSlingSecurityImplContent orgApacheSlingSecurityImplContentDispositionFilterProperties4 = orgApacheSlingSecurityImplContentDispositionFilterProperties3;

        System.assert(orgApacheSlingSecurityImplContentDispositionFilterProperties1.equals(orgApacheSlingSecurityImplContentDispositionFilterProperties2));
        System.assert(orgApacheSlingSecurityImplContentDispositionFilterProperties2.equals(orgApacheSlingSecurityImplContentDispositionFilterProperties1));
        System.assert(orgApacheSlingSecurityImplContentDispositionFilterProperties1.equals(orgApacheSlingSecurityImplContentDispositionFilterProperties1));
        System.assert(orgApacheSlingSecurityImplContentDispositionFilterProperties3.equals(orgApacheSlingSecurityImplContentDispositionFilterProperties4));
        System.assert(orgApacheSlingSecurityImplContentDispositionFilterProperties4.equals(orgApacheSlingSecurityImplContentDispositionFilterProperties3));
        System.assert(orgApacheSlingSecurityImplContentDispositionFilterProperties3.equals(orgApacheSlingSecurityImplContentDispositionFilterProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASOrgApacheSlingSecurityImplContent orgApacheSlingSecurityImplContentDispositionFilterProperties1 = OASOrgApacheSlingSecurityImplContent.getExample();
        OASOrgApacheSlingSecurityImplContent orgApacheSlingSecurityImplContentDispositionFilterProperties2 = OASOrgApacheSlingSecurityImplContent.getExample();
        OASOrgApacheSlingSecurityImplContent orgApacheSlingSecurityImplContentDispositionFilterProperties3 = new OASOrgApacheSlingSecurityImplContent();
        OASOrgApacheSlingSecurityImplContent orgApacheSlingSecurityImplContentDispositionFilterProperties4 = new OASOrgApacheSlingSecurityImplContent();

        System.assert(orgApacheSlingSecurityImplContentDispositionFilterProperties1.equals(orgApacheSlingSecurityImplContentDispositionFilterProperties2));
        System.assert(orgApacheSlingSecurityImplContentDispositionFilterProperties2.equals(orgApacheSlingSecurityImplContentDispositionFilterProperties1));
        System.assert(orgApacheSlingSecurityImplContentDispositionFilterProperties3.equals(orgApacheSlingSecurityImplContentDispositionFilterProperties4));
        System.assert(orgApacheSlingSecurityImplContentDispositionFilterProperties4.equals(orgApacheSlingSecurityImplContentDispositionFilterProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASOrgApacheSlingSecurityImplContent orgApacheSlingSecurityImplContentDispositionFilterProperties1 = OASOrgApacheSlingSecurityImplContent.getExample();
        OASOrgApacheSlingSecurityImplContent orgApacheSlingSecurityImplContentDispositionFilterProperties2 = new OASOrgApacheSlingSecurityImplContent();

        System.assertEquals(false, orgApacheSlingSecurityImplContentDispositionFilterProperties1.equals('foo'));
        System.assertEquals(false, orgApacheSlingSecurityImplContentDispositionFilterProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASOrgApacheSlingSecurityImplContent orgApacheSlingSecurityImplContentDispositionFilterProperties1 = OASOrgApacheSlingSecurityImplContent.getExample();
        OASOrgApacheSlingSecurityImplContent orgApacheSlingSecurityImplContentDispositionFilterProperties2 = new OASOrgApacheSlingSecurityImplContent();
        OASOrgApacheSlingSecurityImplContent orgApacheSlingSecurityImplContentDispositionFilterProperties3;

        System.assertEquals(false, orgApacheSlingSecurityImplContentDispositionFilterProperties1.equals(orgApacheSlingSecurityImplContentDispositionFilterProperties3));
        System.assertEquals(false, orgApacheSlingSecurityImplContentDispositionFilterProperties2.equals(orgApacheSlingSecurityImplContentDispositionFilterProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASOrgApacheSlingSecurityImplContent orgApacheSlingSecurityImplContentDispositionFilterProperties1 = OASOrgApacheSlingSecurityImplContent.getExample();
        OASOrgApacheSlingSecurityImplContent orgApacheSlingSecurityImplContentDispositionFilterProperties2 = new OASOrgApacheSlingSecurityImplContent();

        System.assertEquals(orgApacheSlingSecurityImplContentDispositionFilterProperties1.hashCode(), orgApacheSlingSecurityImplContentDispositionFilterProperties1.hashCode());
        System.assertEquals(orgApacheSlingSecurityImplContentDispositionFilterProperties2.hashCode(), orgApacheSlingSecurityImplContentDispositionFilterProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASOrgApacheSlingSecurityImplContent orgApacheSlingSecurityImplContentDispositionFilterProperties1 = OASOrgApacheSlingSecurityImplContent.getExample();
        OASOrgApacheSlingSecurityImplContent orgApacheSlingSecurityImplContentDispositionFilterProperties2 = OASOrgApacheSlingSecurityImplContent.getExample();
        OASOrgApacheSlingSecurityImplContent orgApacheSlingSecurityImplContentDispositionFilterProperties3 = new OASOrgApacheSlingSecurityImplContent();
        OASOrgApacheSlingSecurityImplContent orgApacheSlingSecurityImplContentDispositionFilterProperties4 = new OASOrgApacheSlingSecurityImplContent();

        System.assert(orgApacheSlingSecurityImplContentDispositionFilterProperties1.equals(orgApacheSlingSecurityImplContentDispositionFilterProperties2));
        System.assert(orgApacheSlingSecurityImplContentDispositionFilterProperties3.equals(orgApacheSlingSecurityImplContentDispositionFilterProperties4));
        System.assertEquals(orgApacheSlingSecurityImplContentDispositionFilterProperties1.hashCode(), orgApacheSlingSecurityImplContentDispositionFilterProperties2.hashCode());
        System.assertEquals(orgApacheSlingSecurityImplContentDispositionFilterProperties3.hashCode(), orgApacheSlingSecurityImplContentDispositionFilterProperties4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASOrgApacheSlingSecurityImplContent orgApacheSlingSecurityImplContentDispositionFilterProperties = new OASOrgApacheSlingSecurityImplContent();
        Map<String, String> propertyMappings = orgApacheSlingSecurityImplContentDispositionFilterProperties.getPropertyMappings();
        System.assertEquals('slingContentDispositionPaths', propertyMappings.get('sling.content.disposition.paths'));
        System.assertEquals('slingContentDispositionExcludedPaths', propertyMappings.get('sling.content.disposition.excluded.paths'));
        System.assertEquals('slingContentDispositionAllPaths', propertyMappings.get('sling.content.disposition.all.paths'));
    }
}
