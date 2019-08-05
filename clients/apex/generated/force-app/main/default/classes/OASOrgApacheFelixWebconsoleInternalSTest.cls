@isTest
private class OASOrgApacheFelixWebconsoleInternalSTest {
    @isTest
    private static void equalsSameInstance() {
        OASOrgApacheFelixWebconsoleInternalS orgApacheFelixWebconsoleInternalServletOsgiManagerProperties1 = OASOrgApacheFelixWebconsoleInternalS.getExample();
        OASOrgApacheFelixWebconsoleInternalS orgApacheFelixWebconsoleInternalServletOsgiManagerProperties2 = orgApacheFelixWebconsoleInternalServletOsgiManagerProperties1;
        OASOrgApacheFelixWebconsoleInternalS orgApacheFelixWebconsoleInternalServletOsgiManagerProperties3 = new OASOrgApacheFelixWebconsoleInternalS();
        OASOrgApacheFelixWebconsoleInternalS orgApacheFelixWebconsoleInternalServletOsgiManagerProperties4 = orgApacheFelixWebconsoleInternalServletOsgiManagerProperties3;

        System.assert(orgApacheFelixWebconsoleInternalServletOsgiManagerProperties1.equals(orgApacheFelixWebconsoleInternalServletOsgiManagerProperties2));
        System.assert(orgApacheFelixWebconsoleInternalServletOsgiManagerProperties2.equals(orgApacheFelixWebconsoleInternalServletOsgiManagerProperties1));
        System.assert(orgApacheFelixWebconsoleInternalServletOsgiManagerProperties1.equals(orgApacheFelixWebconsoleInternalServletOsgiManagerProperties1));
        System.assert(orgApacheFelixWebconsoleInternalServletOsgiManagerProperties3.equals(orgApacheFelixWebconsoleInternalServletOsgiManagerProperties4));
        System.assert(orgApacheFelixWebconsoleInternalServletOsgiManagerProperties4.equals(orgApacheFelixWebconsoleInternalServletOsgiManagerProperties3));
        System.assert(orgApacheFelixWebconsoleInternalServletOsgiManagerProperties3.equals(orgApacheFelixWebconsoleInternalServletOsgiManagerProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASOrgApacheFelixWebconsoleInternalS orgApacheFelixWebconsoleInternalServletOsgiManagerProperties1 = OASOrgApacheFelixWebconsoleInternalS.getExample();
        OASOrgApacheFelixWebconsoleInternalS orgApacheFelixWebconsoleInternalServletOsgiManagerProperties2 = OASOrgApacheFelixWebconsoleInternalS.getExample();
        OASOrgApacheFelixWebconsoleInternalS orgApacheFelixWebconsoleInternalServletOsgiManagerProperties3 = new OASOrgApacheFelixWebconsoleInternalS();
        OASOrgApacheFelixWebconsoleInternalS orgApacheFelixWebconsoleInternalServletOsgiManagerProperties4 = new OASOrgApacheFelixWebconsoleInternalS();

        System.assert(orgApacheFelixWebconsoleInternalServletOsgiManagerProperties1.equals(orgApacheFelixWebconsoleInternalServletOsgiManagerProperties2));
        System.assert(orgApacheFelixWebconsoleInternalServletOsgiManagerProperties2.equals(orgApacheFelixWebconsoleInternalServletOsgiManagerProperties1));
        System.assert(orgApacheFelixWebconsoleInternalServletOsgiManagerProperties3.equals(orgApacheFelixWebconsoleInternalServletOsgiManagerProperties4));
        System.assert(orgApacheFelixWebconsoleInternalServletOsgiManagerProperties4.equals(orgApacheFelixWebconsoleInternalServletOsgiManagerProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASOrgApacheFelixWebconsoleInternalS orgApacheFelixWebconsoleInternalServletOsgiManagerProperties1 = OASOrgApacheFelixWebconsoleInternalS.getExample();
        OASOrgApacheFelixWebconsoleInternalS orgApacheFelixWebconsoleInternalServletOsgiManagerProperties2 = new OASOrgApacheFelixWebconsoleInternalS();

        System.assertEquals(false, orgApacheFelixWebconsoleInternalServletOsgiManagerProperties1.equals('foo'));
        System.assertEquals(false, orgApacheFelixWebconsoleInternalServletOsgiManagerProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASOrgApacheFelixWebconsoleInternalS orgApacheFelixWebconsoleInternalServletOsgiManagerProperties1 = OASOrgApacheFelixWebconsoleInternalS.getExample();
        OASOrgApacheFelixWebconsoleInternalS orgApacheFelixWebconsoleInternalServletOsgiManagerProperties2 = new OASOrgApacheFelixWebconsoleInternalS();
        OASOrgApacheFelixWebconsoleInternalS orgApacheFelixWebconsoleInternalServletOsgiManagerProperties3;

        System.assertEquals(false, orgApacheFelixWebconsoleInternalServletOsgiManagerProperties1.equals(orgApacheFelixWebconsoleInternalServletOsgiManagerProperties3));
        System.assertEquals(false, orgApacheFelixWebconsoleInternalServletOsgiManagerProperties2.equals(orgApacheFelixWebconsoleInternalServletOsgiManagerProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASOrgApacheFelixWebconsoleInternalS orgApacheFelixWebconsoleInternalServletOsgiManagerProperties1 = OASOrgApacheFelixWebconsoleInternalS.getExample();
        OASOrgApacheFelixWebconsoleInternalS orgApacheFelixWebconsoleInternalServletOsgiManagerProperties2 = new OASOrgApacheFelixWebconsoleInternalS();

        System.assertEquals(orgApacheFelixWebconsoleInternalServletOsgiManagerProperties1.hashCode(), orgApacheFelixWebconsoleInternalServletOsgiManagerProperties1.hashCode());
        System.assertEquals(orgApacheFelixWebconsoleInternalServletOsgiManagerProperties2.hashCode(), orgApacheFelixWebconsoleInternalServletOsgiManagerProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASOrgApacheFelixWebconsoleInternalS orgApacheFelixWebconsoleInternalServletOsgiManagerProperties1 = OASOrgApacheFelixWebconsoleInternalS.getExample();
        OASOrgApacheFelixWebconsoleInternalS orgApacheFelixWebconsoleInternalServletOsgiManagerProperties2 = OASOrgApacheFelixWebconsoleInternalS.getExample();
        OASOrgApacheFelixWebconsoleInternalS orgApacheFelixWebconsoleInternalServletOsgiManagerProperties3 = new OASOrgApacheFelixWebconsoleInternalS();
        OASOrgApacheFelixWebconsoleInternalS orgApacheFelixWebconsoleInternalServletOsgiManagerProperties4 = new OASOrgApacheFelixWebconsoleInternalS();

        System.assert(orgApacheFelixWebconsoleInternalServletOsgiManagerProperties1.equals(orgApacheFelixWebconsoleInternalServletOsgiManagerProperties2));
        System.assert(orgApacheFelixWebconsoleInternalServletOsgiManagerProperties3.equals(orgApacheFelixWebconsoleInternalServletOsgiManagerProperties4));
        System.assertEquals(orgApacheFelixWebconsoleInternalServletOsgiManagerProperties1.hashCode(), orgApacheFelixWebconsoleInternalServletOsgiManagerProperties2.hashCode());
        System.assertEquals(orgApacheFelixWebconsoleInternalServletOsgiManagerProperties3.hashCode(), orgApacheFelixWebconsoleInternalServletOsgiManagerProperties4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASOrgApacheFelixWebconsoleInternalS orgApacheFelixWebconsoleInternalServletOsgiManagerProperties = new OASOrgApacheFelixWebconsoleInternalS();
        Map<String, String> propertyMappings = orgApacheFelixWebconsoleInternalServletOsgiManagerProperties.getPropertyMappings();
        System.assertEquals('managerRoot', propertyMappings.get('manager.root'));
        System.assertEquals('httpServiceFilter', propertyMappings.get('http.service.filter'));
        System.assertEquals('defaultRender', propertyMappings.get('default.render'));
    }
}
