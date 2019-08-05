@isTest
private class OASOrgApacheFelixWebconsolePluginsEvTest {
    @isTest
    private static void equalsSameInstance() {
        OASOrgApacheFelixWebconsolePluginsEv orgApacheFelixWebconsolePluginsEventInternalPluginServletProperties1 = OASOrgApacheFelixWebconsolePluginsEv.getExample();
        OASOrgApacheFelixWebconsolePluginsEv orgApacheFelixWebconsolePluginsEventInternalPluginServletProperties2 = orgApacheFelixWebconsolePluginsEventInternalPluginServletProperties1;
        OASOrgApacheFelixWebconsolePluginsEv orgApacheFelixWebconsolePluginsEventInternalPluginServletProperties3 = new OASOrgApacheFelixWebconsolePluginsEv();
        OASOrgApacheFelixWebconsolePluginsEv orgApacheFelixWebconsolePluginsEventInternalPluginServletProperties4 = orgApacheFelixWebconsolePluginsEventInternalPluginServletProperties3;

        System.assert(orgApacheFelixWebconsolePluginsEventInternalPluginServletProperties1.equals(orgApacheFelixWebconsolePluginsEventInternalPluginServletProperties2));
        System.assert(orgApacheFelixWebconsolePluginsEventInternalPluginServletProperties2.equals(orgApacheFelixWebconsolePluginsEventInternalPluginServletProperties1));
        System.assert(orgApacheFelixWebconsolePluginsEventInternalPluginServletProperties1.equals(orgApacheFelixWebconsolePluginsEventInternalPluginServletProperties1));
        System.assert(orgApacheFelixWebconsolePluginsEventInternalPluginServletProperties3.equals(orgApacheFelixWebconsolePluginsEventInternalPluginServletProperties4));
        System.assert(orgApacheFelixWebconsolePluginsEventInternalPluginServletProperties4.equals(orgApacheFelixWebconsolePluginsEventInternalPluginServletProperties3));
        System.assert(orgApacheFelixWebconsolePluginsEventInternalPluginServletProperties3.equals(orgApacheFelixWebconsolePluginsEventInternalPluginServletProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASOrgApacheFelixWebconsolePluginsEv orgApacheFelixWebconsolePluginsEventInternalPluginServletProperties1 = OASOrgApacheFelixWebconsolePluginsEv.getExample();
        OASOrgApacheFelixWebconsolePluginsEv orgApacheFelixWebconsolePluginsEventInternalPluginServletProperties2 = OASOrgApacheFelixWebconsolePluginsEv.getExample();
        OASOrgApacheFelixWebconsolePluginsEv orgApacheFelixWebconsolePluginsEventInternalPluginServletProperties3 = new OASOrgApacheFelixWebconsolePluginsEv();
        OASOrgApacheFelixWebconsolePluginsEv orgApacheFelixWebconsolePluginsEventInternalPluginServletProperties4 = new OASOrgApacheFelixWebconsolePluginsEv();

        System.assert(orgApacheFelixWebconsolePluginsEventInternalPluginServletProperties1.equals(orgApacheFelixWebconsolePluginsEventInternalPluginServletProperties2));
        System.assert(orgApacheFelixWebconsolePluginsEventInternalPluginServletProperties2.equals(orgApacheFelixWebconsolePluginsEventInternalPluginServletProperties1));
        System.assert(orgApacheFelixWebconsolePluginsEventInternalPluginServletProperties3.equals(orgApacheFelixWebconsolePluginsEventInternalPluginServletProperties4));
        System.assert(orgApacheFelixWebconsolePluginsEventInternalPluginServletProperties4.equals(orgApacheFelixWebconsolePluginsEventInternalPluginServletProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASOrgApacheFelixWebconsolePluginsEv orgApacheFelixWebconsolePluginsEventInternalPluginServletProperties1 = OASOrgApacheFelixWebconsolePluginsEv.getExample();
        OASOrgApacheFelixWebconsolePluginsEv orgApacheFelixWebconsolePluginsEventInternalPluginServletProperties2 = new OASOrgApacheFelixWebconsolePluginsEv();

        System.assertEquals(false, orgApacheFelixWebconsolePluginsEventInternalPluginServletProperties1.equals('foo'));
        System.assertEquals(false, orgApacheFelixWebconsolePluginsEventInternalPluginServletProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASOrgApacheFelixWebconsolePluginsEv orgApacheFelixWebconsolePluginsEventInternalPluginServletProperties1 = OASOrgApacheFelixWebconsolePluginsEv.getExample();
        OASOrgApacheFelixWebconsolePluginsEv orgApacheFelixWebconsolePluginsEventInternalPluginServletProperties2 = new OASOrgApacheFelixWebconsolePluginsEv();
        OASOrgApacheFelixWebconsolePluginsEv orgApacheFelixWebconsolePluginsEventInternalPluginServletProperties3;

        System.assertEquals(false, orgApacheFelixWebconsolePluginsEventInternalPluginServletProperties1.equals(orgApacheFelixWebconsolePluginsEventInternalPluginServletProperties3));
        System.assertEquals(false, orgApacheFelixWebconsolePluginsEventInternalPluginServletProperties2.equals(orgApacheFelixWebconsolePluginsEventInternalPluginServletProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASOrgApacheFelixWebconsolePluginsEv orgApacheFelixWebconsolePluginsEventInternalPluginServletProperties1 = OASOrgApacheFelixWebconsolePluginsEv.getExample();
        OASOrgApacheFelixWebconsolePluginsEv orgApacheFelixWebconsolePluginsEventInternalPluginServletProperties2 = new OASOrgApacheFelixWebconsolePluginsEv();

        System.assertEquals(orgApacheFelixWebconsolePluginsEventInternalPluginServletProperties1.hashCode(), orgApacheFelixWebconsolePluginsEventInternalPluginServletProperties1.hashCode());
        System.assertEquals(orgApacheFelixWebconsolePluginsEventInternalPluginServletProperties2.hashCode(), orgApacheFelixWebconsolePluginsEventInternalPluginServletProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASOrgApacheFelixWebconsolePluginsEv orgApacheFelixWebconsolePluginsEventInternalPluginServletProperties1 = OASOrgApacheFelixWebconsolePluginsEv.getExample();
        OASOrgApacheFelixWebconsolePluginsEv orgApacheFelixWebconsolePluginsEventInternalPluginServletProperties2 = OASOrgApacheFelixWebconsolePluginsEv.getExample();
        OASOrgApacheFelixWebconsolePluginsEv orgApacheFelixWebconsolePluginsEventInternalPluginServletProperties3 = new OASOrgApacheFelixWebconsolePluginsEv();
        OASOrgApacheFelixWebconsolePluginsEv orgApacheFelixWebconsolePluginsEventInternalPluginServletProperties4 = new OASOrgApacheFelixWebconsolePluginsEv();

        System.assert(orgApacheFelixWebconsolePluginsEventInternalPluginServletProperties1.equals(orgApacheFelixWebconsolePluginsEventInternalPluginServletProperties2));
        System.assert(orgApacheFelixWebconsolePluginsEventInternalPluginServletProperties3.equals(orgApacheFelixWebconsolePluginsEventInternalPluginServletProperties4));
        System.assertEquals(orgApacheFelixWebconsolePluginsEventInternalPluginServletProperties1.hashCode(), orgApacheFelixWebconsolePluginsEventInternalPluginServletProperties2.hashCode());
        System.assertEquals(orgApacheFelixWebconsolePluginsEventInternalPluginServletProperties3.hashCode(), orgApacheFelixWebconsolePluginsEventInternalPluginServletProperties4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASOrgApacheFelixWebconsolePluginsEv orgApacheFelixWebconsolePluginsEventInternalPluginServletProperties = new OASOrgApacheFelixWebconsolePluginsEv();
        Map<String, String> propertyMappings = orgApacheFelixWebconsolePluginsEventInternalPluginServletProperties.getPropertyMappings();
        System.assertEquals('maxSize', propertyMappings.get('max.size'));
    }
}
