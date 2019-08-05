@isTest
private class OASOrgApacheSlingResourcemergerPickeTest {
    @isTest
    private static void equalsSameInstance() {
        OASOrgApacheSlingResourcemergerPicke orgApacheSlingResourcemergerPickerOverridingProperties1 = OASOrgApacheSlingResourcemergerPicke.getExample();
        OASOrgApacheSlingResourcemergerPicke orgApacheSlingResourcemergerPickerOverridingProperties2 = orgApacheSlingResourcemergerPickerOverridingProperties1;
        OASOrgApacheSlingResourcemergerPicke orgApacheSlingResourcemergerPickerOverridingProperties3 = new OASOrgApacheSlingResourcemergerPicke();
        OASOrgApacheSlingResourcemergerPicke orgApacheSlingResourcemergerPickerOverridingProperties4 = orgApacheSlingResourcemergerPickerOverridingProperties3;

        System.assert(orgApacheSlingResourcemergerPickerOverridingProperties1.equals(orgApacheSlingResourcemergerPickerOverridingProperties2));
        System.assert(orgApacheSlingResourcemergerPickerOverridingProperties2.equals(orgApacheSlingResourcemergerPickerOverridingProperties1));
        System.assert(orgApacheSlingResourcemergerPickerOverridingProperties1.equals(orgApacheSlingResourcemergerPickerOverridingProperties1));
        System.assert(orgApacheSlingResourcemergerPickerOverridingProperties3.equals(orgApacheSlingResourcemergerPickerOverridingProperties4));
        System.assert(orgApacheSlingResourcemergerPickerOverridingProperties4.equals(orgApacheSlingResourcemergerPickerOverridingProperties3));
        System.assert(orgApacheSlingResourcemergerPickerOverridingProperties3.equals(orgApacheSlingResourcemergerPickerOverridingProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASOrgApacheSlingResourcemergerPicke orgApacheSlingResourcemergerPickerOverridingProperties1 = OASOrgApacheSlingResourcemergerPicke.getExample();
        OASOrgApacheSlingResourcemergerPicke orgApacheSlingResourcemergerPickerOverridingProperties2 = OASOrgApacheSlingResourcemergerPicke.getExample();
        OASOrgApacheSlingResourcemergerPicke orgApacheSlingResourcemergerPickerOverridingProperties3 = new OASOrgApacheSlingResourcemergerPicke();
        OASOrgApacheSlingResourcemergerPicke orgApacheSlingResourcemergerPickerOverridingProperties4 = new OASOrgApacheSlingResourcemergerPicke();

        System.assert(orgApacheSlingResourcemergerPickerOverridingProperties1.equals(orgApacheSlingResourcemergerPickerOverridingProperties2));
        System.assert(orgApacheSlingResourcemergerPickerOverridingProperties2.equals(orgApacheSlingResourcemergerPickerOverridingProperties1));
        System.assert(orgApacheSlingResourcemergerPickerOverridingProperties3.equals(orgApacheSlingResourcemergerPickerOverridingProperties4));
        System.assert(orgApacheSlingResourcemergerPickerOverridingProperties4.equals(orgApacheSlingResourcemergerPickerOverridingProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASOrgApacheSlingResourcemergerPicke orgApacheSlingResourcemergerPickerOverridingProperties1 = OASOrgApacheSlingResourcemergerPicke.getExample();
        OASOrgApacheSlingResourcemergerPicke orgApacheSlingResourcemergerPickerOverridingProperties2 = new OASOrgApacheSlingResourcemergerPicke();

        System.assertEquals(false, orgApacheSlingResourcemergerPickerOverridingProperties1.equals('foo'));
        System.assertEquals(false, orgApacheSlingResourcemergerPickerOverridingProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASOrgApacheSlingResourcemergerPicke orgApacheSlingResourcemergerPickerOverridingProperties1 = OASOrgApacheSlingResourcemergerPicke.getExample();
        OASOrgApacheSlingResourcemergerPicke orgApacheSlingResourcemergerPickerOverridingProperties2 = new OASOrgApacheSlingResourcemergerPicke();
        OASOrgApacheSlingResourcemergerPicke orgApacheSlingResourcemergerPickerOverridingProperties3;

        System.assertEquals(false, orgApacheSlingResourcemergerPickerOverridingProperties1.equals(orgApacheSlingResourcemergerPickerOverridingProperties3));
        System.assertEquals(false, orgApacheSlingResourcemergerPickerOverridingProperties2.equals(orgApacheSlingResourcemergerPickerOverridingProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASOrgApacheSlingResourcemergerPicke orgApacheSlingResourcemergerPickerOverridingProperties1 = OASOrgApacheSlingResourcemergerPicke.getExample();
        OASOrgApacheSlingResourcemergerPicke orgApacheSlingResourcemergerPickerOverridingProperties2 = new OASOrgApacheSlingResourcemergerPicke();

        System.assertEquals(orgApacheSlingResourcemergerPickerOverridingProperties1.hashCode(), orgApacheSlingResourcemergerPickerOverridingProperties1.hashCode());
        System.assertEquals(orgApacheSlingResourcemergerPickerOverridingProperties2.hashCode(), orgApacheSlingResourcemergerPickerOverridingProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASOrgApacheSlingResourcemergerPicke orgApacheSlingResourcemergerPickerOverridingProperties1 = OASOrgApacheSlingResourcemergerPicke.getExample();
        OASOrgApacheSlingResourcemergerPicke orgApacheSlingResourcemergerPickerOverridingProperties2 = OASOrgApacheSlingResourcemergerPicke.getExample();
        OASOrgApacheSlingResourcemergerPicke orgApacheSlingResourcemergerPickerOverridingProperties3 = new OASOrgApacheSlingResourcemergerPicke();
        OASOrgApacheSlingResourcemergerPicke orgApacheSlingResourcemergerPickerOverridingProperties4 = new OASOrgApacheSlingResourcemergerPicke();

        System.assert(orgApacheSlingResourcemergerPickerOverridingProperties1.equals(orgApacheSlingResourcemergerPickerOverridingProperties2));
        System.assert(orgApacheSlingResourcemergerPickerOverridingProperties3.equals(orgApacheSlingResourcemergerPickerOverridingProperties4));
        System.assertEquals(orgApacheSlingResourcemergerPickerOverridingProperties1.hashCode(), orgApacheSlingResourcemergerPickerOverridingProperties2.hashCode());
        System.assertEquals(orgApacheSlingResourcemergerPickerOverridingProperties3.hashCode(), orgApacheSlingResourcemergerPickerOverridingProperties4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASOrgApacheSlingResourcemergerPicke orgApacheSlingResourcemergerPickerOverridingProperties = new OASOrgApacheSlingResourcemergerPicke();
        Map<String, String> propertyMappings = orgApacheSlingResourcemergerPickerOverridingProperties.getPropertyMappings();
        System.assertEquals('mergeRoot', propertyMappings.get('merge.root'));
        System.assertEquals('mergeReadOnly', propertyMappings.get('merge.readOnly'));
    }
}
