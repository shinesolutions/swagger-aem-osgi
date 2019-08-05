@isTest
private class OASOrgApacheFelixSystemreadyImplCompTest {
    @isTest
    private static void equalsSameInstance() {
        OASOrgApacheFelixSystemreadyImplComp orgApacheFelixSystemreadyImplComponentsCheckProperties1 = OASOrgApacheFelixSystemreadyImplComp.getExample();
        OASOrgApacheFelixSystemreadyImplComp orgApacheFelixSystemreadyImplComponentsCheckProperties2 = orgApacheFelixSystemreadyImplComponentsCheckProperties1;
        OASOrgApacheFelixSystemreadyImplComp orgApacheFelixSystemreadyImplComponentsCheckProperties3 = new OASOrgApacheFelixSystemreadyImplComp();
        OASOrgApacheFelixSystemreadyImplComp orgApacheFelixSystemreadyImplComponentsCheckProperties4 = orgApacheFelixSystemreadyImplComponentsCheckProperties3;

        System.assert(orgApacheFelixSystemreadyImplComponentsCheckProperties1.equals(orgApacheFelixSystemreadyImplComponentsCheckProperties2));
        System.assert(orgApacheFelixSystemreadyImplComponentsCheckProperties2.equals(orgApacheFelixSystemreadyImplComponentsCheckProperties1));
        System.assert(orgApacheFelixSystemreadyImplComponentsCheckProperties1.equals(orgApacheFelixSystemreadyImplComponentsCheckProperties1));
        System.assert(orgApacheFelixSystemreadyImplComponentsCheckProperties3.equals(orgApacheFelixSystemreadyImplComponentsCheckProperties4));
        System.assert(orgApacheFelixSystemreadyImplComponentsCheckProperties4.equals(orgApacheFelixSystemreadyImplComponentsCheckProperties3));
        System.assert(orgApacheFelixSystemreadyImplComponentsCheckProperties3.equals(orgApacheFelixSystemreadyImplComponentsCheckProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASOrgApacheFelixSystemreadyImplComp orgApacheFelixSystemreadyImplComponentsCheckProperties1 = OASOrgApacheFelixSystemreadyImplComp.getExample();
        OASOrgApacheFelixSystemreadyImplComp orgApacheFelixSystemreadyImplComponentsCheckProperties2 = OASOrgApacheFelixSystemreadyImplComp.getExample();
        OASOrgApacheFelixSystemreadyImplComp orgApacheFelixSystemreadyImplComponentsCheckProperties3 = new OASOrgApacheFelixSystemreadyImplComp();
        OASOrgApacheFelixSystemreadyImplComp orgApacheFelixSystemreadyImplComponentsCheckProperties4 = new OASOrgApacheFelixSystemreadyImplComp();

        System.assert(orgApacheFelixSystemreadyImplComponentsCheckProperties1.equals(orgApacheFelixSystemreadyImplComponentsCheckProperties2));
        System.assert(orgApacheFelixSystemreadyImplComponentsCheckProperties2.equals(orgApacheFelixSystemreadyImplComponentsCheckProperties1));
        System.assert(orgApacheFelixSystemreadyImplComponentsCheckProperties3.equals(orgApacheFelixSystemreadyImplComponentsCheckProperties4));
        System.assert(orgApacheFelixSystemreadyImplComponentsCheckProperties4.equals(orgApacheFelixSystemreadyImplComponentsCheckProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASOrgApacheFelixSystemreadyImplComp orgApacheFelixSystemreadyImplComponentsCheckProperties1 = OASOrgApacheFelixSystemreadyImplComp.getExample();
        OASOrgApacheFelixSystemreadyImplComp orgApacheFelixSystemreadyImplComponentsCheckProperties2 = new OASOrgApacheFelixSystemreadyImplComp();

        System.assertEquals(false, orgApacheFelixSystemreadyImplComponentsCheckProperties1.equals('foo'));
        System.assertEquals(false, orgApacheFelixSystemreadyImplComponentsCheckProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASOrgApacheFelixSystemreadyImplComp orgApacheFelixSystemreadyImplComponentsCheckProperties1 = OASOrgApacheFelixSystemreadyImplComp.getExample();
        OASOrgApacheFelixSystemreadyImplComp orgApacheFelixSystemreadyImplComponentsCheckProperties2 = new OASOrgApacheFelixSystemreadyImplComp();
        OASOrgApacheFelixSystemreadyImplComp orgApacheFelixSystemreadyImplComponentsCheckProperties3;

        System.assertEquals(false, orgApacheFelixSystemreadyImplComponentsCheckProperties1.equals(orgApacheFelixSystemreadyImplComponentsCheckProperties3));
        System.assertEquals(false, orgApacheFelixSystemreadyImplComponentsCheckProperties2.equals(orgApacheFelixSystemreadyImplComponentsCheckProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASOrgApacheFelixSystemreadyImplComp orgApacheFelixSystemreadyImplComponentsCheckProperties1 = OASOrgApacheFelixSystemreadyImplComp.getExample();
        OASOrgApacheFelixSystemreadyImplComp orgApacheFelixSystemreadyImplComponentsCheckProperties2 = new OASOrgApacheFelixSystemreadyImplComp();

        System.assertEquals(orgApacheFelixSystemreadyImplComponentsCheckProperties1.hashCode(), orgApacheFelixSystemreadyImplComponentsCheckProperties1.hashCode());
        System.assertEquals(orgApacheFelixSystemreadyImplComponentsCheckProperties2.hashCode(), orgApacheFelixSystemreadyImplComponentsCheckProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASOrgApacheFelixSystemreadyImplComp orgApacheFelixSystemreadyImplComponentsCheckProperties1 = OASOrgApacheFelixSystemreadyImplComp.getExample();
        OASOrgApacheFelixSystemreadyImplComp orgApacheFelixSystemreadyImplComponentsCheckProperties2 = OASOrgApacheFelixSystemreadyImplComp.getExample();
        OASOrgApacheFelixSystemreadyImplComp orgApacheFelixSystemreadyImplComponentsCheckProperties3 = new OASOrgApacheFelixSystemreadyImplComp();
        OASOrgApacheFelixSystemreadyImplComp orgApacheFelixSystemreadyImplComponentsCheckProperties4 = new OASOrgApacheFelixSystemreadyImplComp();

        System.assert(orgApacheFelixSystemreadyImplComponentsCheckProperties1.equals(orgApacheFelixSystemreadyImplComponentsCheckProperties2));
        System.assert(orgApacheFelixSystemreadyImplComponentsCheckProperties3.equals(orgApacheFelixSystemreadyImplComponentsCheckProperties4));
        System.assertEquals(orgApacheFelixSystemreadyImplComponentsCheckProperties1.hashCode(), orgApacheFelixSystemreadyImplComponentsCheckProperties2.hashCode());
        System.assertEquals(orgApacheFelixSystemreadyImplComponentsCheckProperties3.hashCode(), orgApacheFelixSystemreadyImplComponentsCheckProperties4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASOrgApacheFelixSystemreadyImplComp orgApacheFelixSystemreadyImplComponentsCheckProperties = new OASOrgApacheFelixSystemreadyImplComp();
        Map<String, String> propertyMappings = orgApacheFelixSystemreadyImplComponentsCheckProperties.getPropertyMappings();
        System.assertEquals('componentsList', propertyMappings.get('components.list'));
        System.assertEquals('r_type', propertyMappings.get('type'));
    }
}
