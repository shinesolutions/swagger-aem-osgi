@isTest
private class OASOrgApacheSlingSettingsImplSlingSeTest {
    @isTest
    private static void equalsSameInstance() {
        OASOrgApacheSlingSettingsImplSlingSe orgApacheSlingSettingsImplSlingSettingsServiceImplProperties1 = OASOrgApacheSlingSettingsImplSlingSe.getExample();
        OASOrgApacheSlingSettingsImplSlingSe orgApacheSlingSettingsImplSlingSettingsServiceImplProperties2 = orgApacheSlingSettingsImplSlingSettingsServiceImplProperties1;
        OASOrgApacheSlingSettingsImplSlingSe orgApacheSlingSettingsImplSlingSettingsServiceImplProperties3 = new OASOrgApacheSlingSettingsImplSlingSe();
        OASOrgApacheSlingSettingsImplSlingSe orgApacheSlingSettingsImplSlingSettingsServiceImplProperties4 = orgApacheSlingSettingsImplSlingSettingsServiceImplProperties3;

        System.assert(orgApacheSlingSettingsImplSlingSettingsServiceImplProperties1.equals(orgApacheSlingSettingsImplSlingSettingsServiceImplProperties2));
        System.assert(orgApacheSlingSettingsImplSlingSettingsServiceImplProperties2.equals(orgApacheSlingSettingsImplSlingSettingsServiceImplProperties1));
        System.assert(orgApacheSlingSettingsImplSlingSettingsServiceImplProperties1.equals(orgApacheSlingSettingsImplSlingSettingsServiceImplProperties1));
        System.assert(orgApacheSlingSettingsImplSlingSettingsServiceImplProperties3.equals(orgApacheSlingSettingsImplSlingSettingsServiceImplProperties4));
        System.assert(orgApacheSlingSettingsImplSlingSettingsServiceImplProperties4.equals(orgApacheSlingSettingsImplSlingSettingsServiceImplProperties3));
        System.assert(orgApacheSlingSettingsImplSlingSettingsServiceImplProperties3.equals(orgApacheSlingSettingsImplSlingSettingsServiceImplProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASOrgApacheSlingSettingsImplSlingSe orgApacheSlingSettingsImplSlingSettingsServiceImplProperties1 = OASOrgApacheSlingSettingsImplSlingSe.getExample();
        OASOrgApacheSlingSettingsImplSlingSe orgApacheSlingSettingsImplSlingSettingsServiceImplProperties2 = OASOrgApacheSlingSettingsImplSlingSe.getExample();
        OASOrgApacheSlingSettingsImplSlingSe orgApacheSlingSettingsImplSlingSettingsServiceImplProperties3 = new OASOrgApacheSlingSettingsImplSlingSe();
        OASOrgApacheSlingSettingsImplSlingSe orgApacheSlingSettingsImplSlingSettingsServiceImplProperties4 = new OASOrgApacheSlingSettingsImplSlingSe();

        System.assert(orgApacheSlingSettingsImplSlingSettingsServiceImplProperties1.equals(orgApacheSlingSettingsImplSlingSettingsServiceImplProperties2));
        System.assert(orgApacheSlingSettingsImplSlingSettingsServiceImplProperties2.equals(orgApacheSlingSettingsImplSlingSettingsServiceImplProperties1));
        System.assert(orgApacheSlingSettingsImplSlingSettingsServiceImplProperties3.equals(orgApacheSlingSettingsImplSlingSettingsServiceImplProperties4));
        System.assert(orgApacheSlingSettingsImplSlingSettingsServiceImplProperties4.equals(orgApacheSlingSettingsImplSlingSettingsServiceImplProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASOrgApacheSlingSettingsImplSlingSe orgApacheSlingSettingsImplSlingSettingsServiceImplProperties1 = OASOrgApacheSlingSettingsImplSlingSe.getExample();
        OASOrgApacheSlingSettingsImplSlingSe orgApacheSlingSettingsImplSlingSettingsServiceImplProperties2 = new OASOrgApacheSlingSettingsImplSlingSe();

        System.assertEquals(false, orgApacheSlingSettingsImplSlingSettingsServiceImplProperties1.equals('foo'));
        System.assertEquals(false, orgApacheSlingSettingsImplSlingSettingsServiceImplProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASOrgApacheSlingSettingsImplSlingSe orgApacheSlingSettingsImplSlingSettingsServiceImplProperties1 = OASOrgApacheSlingSettingsImplSlingSe.getExample();
        OASOrgApacheSlingSettingsImplSlingSe orgApacheSlingSettingsImplSlingSettingsServiceImplProperties2 = new OASOrgApacheSlingSettingsImplSlingSe();
        OASOrgApacheSlingSettingsImplSlingSe orgApacheSlingSettingsImplSlingSettingsServiceImplProperties3;

        System.assertEquals(false, orgApacheSlingSettingsImplSlingSettingsServiceImplProperties1.equals(orgApacheSlingSettingsImplSlingSettingsServiceImplProperties3));
        System.assertEquals(false, orgApacheSlingSettingsImplSlingSettingsServiceImplProperties2.equals(orgApacheSlingSettingsImplSlingSettingsServiceImplProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASOrgApacheSlingSettingsImplSlingSe orgApacheSlingSettingsImplSlingSettingsServiceImplProperties1 = OASOrgApacheSlingSettingsImplSlingSe.getExample();
        OASOrgApacheSlingSettingsImplSlingSe orgApacheSlingSettingsImplSlingSettingsServiceImplProperties2 = new OASOrgApacheSlingSettingsImplSlingSe();

        System.assertEquals(orgApacheSlingSettingsImplSlingSettingsServiceImplProperties1.hashCode(), orgApacheSlingSettingsImplSlingSettingsServiceImplProperties1.hashCode());
        System.assertEquals(orgApacheSlingSettingsImplSlingSettingsServiceImplProperties2.hashCode(), orgApacheSlingSettingsImplSlingSettingsServiceImplProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASOrgApacheSlingSettingsImplSlingSe orgApacheSlingSettingsImplSlingSettingsServiceImplProperties1 = OASOrgApacheSlingSettingsImplSlingSe.getExample();
        OASOrgApacheSlingSettingsImplSlingSe orgApacheSlingSettingsImplSlingSettingsServiceImplProperties2 = OASOrgApacheSlingSettingsImplSlingSe.getExample();
        OASOrgApacheSlingSettingsImplSlingSe orgApacheSlingSettingsImplSlingSettingsServiceImplProperties3 = new OASOrgApacheSlingSettingsImplSlingSe();
        OASOrgApacheSlingSettingsImplSlingSe orgApacheSlingSettingsImplSlingSettingsServiceImplProperties4 = new OASOrgApacheSlingSettingsImplSlingSe();

        System.assert(orgApacheSlingSettingsImplSlingSettingsServiceImplProperties1.equals(orgApacheSlingSettingsImplSlingSettingsServiceImplProperties2));
        System.assert(orgApacheSlingSettingsImplSlingSettingsServiceImplProperties3.equals(orgApacheSlingSettingsImplSlingSettingsServiceImplProperties4));
        System.assertEquals(orgApacheSlingSettingsImplSlingSettingsServiceImplProperties1.hashCode(), orgApacheSlingSettingsImplSlingSettingsServiceImplProperties2.hashCode());
        System.assertEquals(orgApacheSlingSettingsImplSlingSettingsServiceImplProperties3.hashCode(), orgApacheSlingSettingsImplSlingSettingsServiceImplProperties4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASOrgApacheSlingSettingsImplSlingSe orgApacheSlingSettingsImplSlingSettingsServiceImplProperties = new OASOrgApacheSlingSettingsImplSlingSe();
        Map<String, String> propertyMappings = orgApacheSlingSettingsImplSlingSettingsServiceImplProperties.getPropertyMappings();
        System.assertEquals('slingName', propertyMappings.get('sling.name'));
        System.assertEquals('slingDescription', propertyMappings.get('sling.description'));
    }
}
