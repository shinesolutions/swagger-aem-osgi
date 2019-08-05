@isTest
private class OASOrgApacheSlingJcrResourceInternalTest {
    @isTest
    private static void equalsSameInstance() {
        OASOrgApacheSlingJcrResourceInternal orgApacheSlingJcrResourceInternalJcrSystemUserValidatorProperties1 = OASOrgApacheSlingJcrResourceInternal.getExample();
        OASOrgApacheSlingJcrResourceInternal orgApacheSlingJcrResourceInternalJcrSystemUserValidatorProperties2 = orgApacheSlingJcrResourceInternalJcrSystemUserValidatorProperties1;
        OASOrgApacheSlingJcrResourceInternal orgApacheSlingJcrResourceInternalJcrSystemUserValidatorProperties3 = new OASOrgApacheSlingJcrResourceInternal();
        OASOrgApacheSlingJcrResourceInternal orgApacheSlingJcrResourceInternalJcrSystemUserValidatorProperties4 = orgApacheSlingJcrResourceInternalJcrSystemUserValidatorProperties3;

        System.assert(orgApacheSlingJcrResourceInternalJcrSystemUserValidatorProperties1.equals(orgApacheSlingJcrResourceInternalJcrSystemUserValidatorProperties2));
        System.assert(orgApacheSlingJcrResourceInternalJcrSystemUserValidatorProperties2.equals(orgApacheSlingJcrResourceInternalJcrSystemUserValidatorProperties1));
        System.assert(orgApacheSlingJcrResourceInternalJcrSystemUserValidatorProperties1.equals(orgApacheSlingJcrResourceInternalJcrSystemUserValidatorProperties1));
        System.assert(orgApacheSlingJcrResourceInternalJcrSystemUserValidatorProperties3.equals(orgApacheSlingJcrResourceInternalJcrSystemUserValidatorProperties4));
        System.assert(orgApacheSlingJcrResourceInternalJcrSystemUserValidatorProperties4.equals(orgApacheSlingJcrResourceInternalJcrSystemUserValidatorProperties3));
        System.assert(orgApacheSlingJcrResourceInternalJcrSystemUserValidatorProperties3.equals(orgApacheSlingJcrResourceInternalJcrSystemUserValidatorProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASOrgApacheSlingJcrResourceInternal orgApacheSlingJcrResourceInternalJcrSystemUserValidatorProperties1 = OASOrgApacheSlingJcrResourceInternal.getExample();
        OASOrgApacheSlingJcrResourceInternal orgApacheSlingJcrResourceInternalJcrSystemUserValidatorProperties2 = OASOrgApacheSlingJcrResourceInternal.getExample();
        OASOrgApacheSlingJcrResourceInternal orgApacheSlingJcrResourceInternalJcrSystemUserValidatorProperties3 = new OASOrgApacheSlingJcrResourceInternal();
        OASOrgApacheSlingJcrResourceInternal orgApacheSlingJcrResourceInternalJcrSystemUserValidatorProperties4 = new OASOrgApacheSlingJcrResourceInternal();

        System.assert(orgApacheSlingJcrResourceInternalJcrSystemUserValidatorProperties1.equals(orgApacheSlingJcrResourceInternalJcrSystemUserValidatorProperties2));
        System.assert(orgApacheSlingJcrResourceInternalJcrSystemUserValidatorProperties2.equals(orgApacheSlingJcrResourceInternalJcrSystemUserValidatorProperties1));
        System.assert(orgApacheSlingJcrResourceInternalJcrSystemUserValidatorProperties3.equals(orgApacheSlingJcrResourceInternalJcrSystemUserValidatorProperties4));
        System.assert(orgApacheSlingJcrResourceInternalJcrSystemUserValidatorProperties4.equals(orgApacheSlingJcrResourceInternalJcrSystemUserValidatorProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASOrgApacheSlingJcrResourceInternal orgApacheSlingJcrResourceInternalJcrSystemUserValidatorProperties1 = OASOrgApacheSlingJcrResourceInternal.getExample();
        OASOrgApacheSlingJcrResourceInternal orgApacheSlingJcrResourceInternalJcrSystemUserValidatorProperties2 = new OASOrgApacheSlingJcrResourceInternal();

        System.assertEquals(false, orgApacheSlingJcrResourceInternalJcrSystemUserValidatorProperties1.equals('foo'));
        System.assertEquals(false, orgApacheSlingJcrResourceInternalJcrSystemUserValidatorProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASOrgApacheSlingJcrResourceInternal orgApacheSlingJcrResourceInternalJcrSystemUserValidatorProperties1 = OASOrgApacheSlingJcrResourceInternal.getExample();
        OASOrgApacheSlingJcrResourceInternal orgApacheSlingJcrResourceInternalJcrSystemUserValidatorProperties2 = new OASOrgApacheSlingJcrResourceInternal();
        OASOrgApacheSlingJcrResourceInternal orgApacheSlingJcrResourceInternalJcrSystemUserValidatorProperties3;

        System.assertEquals(false, orgApacheSlingJcrResourceInternalJcrSystemUserValidatorProperties1.equals(orgApacheSlingJcrResourceInternalJcrSystemUserValidatorProperties3));
        System.assertEquals(false, orgApacheSlingJcrResourceInternalJcrSystemUserValidatorProperties2.equals(orgApacheSlingJcrResourceInternalJcrSystemUserValidatorProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASOrgApacheSlingJcrResourceInternal orgApacheSlingJcrResourceInternalJcrSystemUserValidatorProperties1 = OASOrgApacheSlingJcrResourceInternal.getExample();
        OASOrgApacheSlingJcrResourceInternal orgApacheSlingJcrResourceInternalJcrSystemUserValidatorProperties2 = new OASOrgApacheSlingJcrResourceInternal();

        System.assertEquals(orgApacheSlingJcrResourceInternalJcrSystemUserValidatorProperties1.hashCode(), orgApacheSlingJcrResourceInternalJcrSystemUserValidatorProperties1.hashCode());
        System.assertEquals(orgApacheSlingJcrResourceInternalJcrSystemUserValidatorProperties2.hashCode(), orgApacheSlingJcrResourceInternalJcrSystemUserValidatorProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASOrgApacheSlingJcrResourceInternal orgApacheSlingJcrResourceInternalJcrSystemUserValidatorProperties1 = OASOrgApacheSlingJcrResourceInternal.getExample();
        OASOrgApacheSlingJcrResourceInternal orgApacheSlingJcrResourceInternalJcrSystemUserValidatorProperties2 = OASOrgApacheSlingJcrResourceInternal.getExample();
        OASOrgApacheSlingJcrResourceInternal orgApacheSlingJcrResourceInternalJcrSystemUserValidatorProperties3 = new OASOrgApacheSlingJcrResourceInternal();
        OASOrgApacheSlingJcrResourceInternal orgApacheSlingJcrResourceInternalJcrSystemUserValidatorProperties4 = new OASOrgApacheSlingJcrResourceInternal();

        System.assert(orgApacheSlingJcrResourceInternalJcrSystemUserValidatorProperties1.equals(orgApacheSlingJcrResourceInternalJcrSystemUserValidatorProperties2));
        System.assert(orgApacheSlingJcrResourceInternalJcrSystemUserValidatorProperties3.equals(orgApacheSlingJcrResourceInternalJcrSystemUserValidatorProperties4));
        System.assertEquals(orgApacheSlingJcrResourceInternalJcrSystemUserValidatorProperties1.hashCode(), orgApacheSlingJcrResourceInternalJcrSystemUserValidatorProperties2.hashCode());
        System.assertEquals(orgApacheSlingJcrResourceInternalJcrSystemUserValidatorProperties3.hashCode(), orgApacheSlingJcrResourceInternalJcrSystemUserValidatorProperties4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASOrgApacheSlingJcrResourceInternal orgApacheSlingJcrResourceInternalJcrSystemUserValidatorProperties = new OASOrgApacheSlingJcrResourceInternal();
        Map<String, String> propertyMappings = orgApacheSlingJcrResourceInternalJcrSystemUserValidatorProperties.getPropertyMappings();
        System.assertEquals('allowOnlySystemUser', propertyMappings.get('allow.only.system.user'));
    }
}
