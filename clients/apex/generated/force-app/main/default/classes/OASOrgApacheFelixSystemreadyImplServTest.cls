@isTest
private class OASOrgApacheFelixSystemreadyImplServTest {
    @isTest
    private static void equalsSameInstance() {
        OASOrgApacheFelixSystemreadyImplServ orgApacheFelixSystemreadyImplServletSystemReadyServletProperties1 = OASOrgApacheFelixSystemreadyImplServ.getExample();
        OASOrgApacheFelixSystemreadyImplServ orgApacheFelixSystemreadyImplServletSystemReadyServletProperties2 = orgApacheFelixSystemreadyImplServletSystemReadyServletProperties1;
        OASOrgApacheFelixSystemreadyImplServ orgApacheFelixSystemreadyImplServletSystemReadyServletProperties3 = new OASOrgApacheFelixSystemreadyImplServ();
        OASOrgApacheFelixSystemreadyImplServ orgApacheFelixSystemreadyImplServletSystemReadyServletProperties4 = orgApacheFelixSystemreadyImplServletSystemReadyServletProperties3;

        System.assert(orgApacheFelixSystemreadyImplServletSystemReadyServletProperties1.equals(orgApacheFelixSystemreadyImplServletSystemReadyServletProperties2));
        System.assert(orgApacheFelixSystemreadyImplServletSystemReadyServletProperties2.equals(orgApacheFelixSystemreadyImplServletSystemReadyServletProperties1));
        System.assert(orgApacheFelixSystemreadyImplServletSystemReadyServletProperties1.equals(orgApacheFelixSystemreadyImplServletSystemReadyServletProperties1));
        System.assert(orgApacheFelixSystemreadyImplServletSystemReadyServletProperties3.equals(orgApacheFelixSystemreadyImplServletSystemReadyServletProperties4));
        System.assert(orgApacheFelixSystemreadyImplServletSystemReadyServletProperties4.equals(orgApacheFelixSystemreadyImplServletSystemReadyServletProperties3));
        System.assert(orgApacheFelixSystemreadyImplServletSystemReadyServletProperties3.equals(orgApacheFelixSystemreadyImplServletSystemReadyServletProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASOrgApacheFelixSystemreadyImplServ orgApacheFelixSystemreadyImplServletSystemReadyServletProperties1 = OASOrgApacheFelixSystemreadyImplServ.getExample();
        OASOrgApacheFelixSystemreadyImplServ orgApacheFelixSystemreadyImplServletSystemReadyServletProperties2 = OASOrgApacheFelixSystemreadyImplServ.getExample();
        OASOrgApacheFelixSystemreadyImplServ orgApacheFelixSystemreadyImplServletSystemReadyServletProperties3 = new OASOrgApacheFelixSystemreadyImplServ();
        OASOrgApacheFelixSystemreadyImplServ orgApacheFelixSystemreadyImplServletSystemReadyServletProperties4 = new OASOrgApacheFelixSystemreadyImplServ();

        System.assert(orgApacheFelixSystemreadyImplServletSystemReadyServletProperties1.equals(orgApacheFelixSystemreadyImplServletSystemReadyServletProperties2));
        System.assert(orgApacheFelixSystemreadyImplServletSystemReadyServletProperties2.equals(orgApacheFelixSystemreadyImplServletSystemReadyServletProperties1));
        System.assert(orgApacheFelixSystemreadyImplServletSystemReadyServletProperties3.equals(orgApacheFelixSystemreadyImplServletSystemReadyServletProperties4));
        System.assert(orgApacheFelixSystemreadyImplServletSystemReadyServletProperties4.equals(orgApacheFelixSystemreadyImplServletSystemReadyServletProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASOrgApacheFelixSystemreadyImplServ orgApacheFelixSystemreadyImplServletSystemReadyServletProperties1 = OASOrgApacheFelixSystemreadyImplServ.getExample();
        OASOrgApacheFelixSystemreadyImplServ orgApacheFelixSystemreadyImplServletSystemReadyServletProperties2 = new OASOrgApacheFelixSystemreadyImplServ();

        System.assertEquals(false, orgApacheFelixSystemreadyImplServletSystemReadyServletProperties1.equals('foo'));
        System.assertEquals(false, orgApacheFelixSystemreadyImplServletSystemReadyServletProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASOrgApacheFelixSystemreadyImplServ orgApacheFelixSystemreadyImplServletSystemReadyServletProperties1 = OASOrgApacheFelixSystemreadyImplServ.getExample();
        OASOrgApacheFelixSystemreadyImplServ orgApacheFelixSystemreadyImplServletSystemReadyServletProperties2 = new OASOrgApacheFelixSystemreadyImplServ();
        OASOrgApacheFelixSystemreadyImplServ orgApacheFelixSystemreadyImplServletSystemReadyServletProperties3;

        System.assertEquals(false, orgApacheFelixSystemreadyImplServletSystemReadyServletProperties1.equals(orgApacheFelixSystemreadyImplServletSystemReadyServletProperties3));
        System.assertEquals(false, orgApacheFelixSystemreadyImplServletSystemReadyServletProperties2.equals(orgApacheFelixSystemreadyImplServletSystemReadyServletProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASOrgApacheFelixSystemreadyImplServ orgApacheFelixSystemreadyImplServletSystemReadyServletProperties1 = OASOrgApacheFelixSystemreadyImplServ.getExample();
        OASOrgApacheFelixSystemreadyImplServ orgApacheFelixSystemreadyImplServletSystemReadyServletProperties2 = new OASOrgApacheFelixSystemreadyImplServ();

        System.assertEquals(orgApacheFelixSystemreadyImplServletSystemReadyServletProperties1.hashCode(), orgApacheFelixSystemreadyImplServletSystemReadyServletProperties1.hashCode());
        System.assertEquals(orgApacheFelixSystemreadyImplServletSystemReadyServletProperties2.hashCode(), orgApacheFelixSystemreadyImplServletSystemReadyServletProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASOrgApacheFelixSystemreadyImplServ orgApacheFelixSystemreadyImplServletSystemReadyServletProperties1 = OASOrgApacheFelixSystemreadyImplServ.getExample();
        OASOrgApacheFelixSystemreadyImplServ orgApacheFelixSystemreadyImplServletSystemReadyServletProperties2 = OASOrgApacheFelixSystemreadyImplServ.getExample();
        OASOrgApacheFelixSystemreadyImplServ orgApacheFelixSystemreadyImplServletSystemReadyServletProperties3 = new OASOrgApacheFelixSystemreadyImplServ();
        OASOrgApacheFelixSystemreadyImplServ orgApacheFelixSystemreadyImplServletSystemReadyServletProperties4 = new OASOrgApacheFelixSystemreadyImplServ();

        System.assert(orgApacheFelixSystemreadyImplServletSystemReadyServletProperties1.equals(orgApacheFelixSystemreadyImplServletSystemReadyServletProperties2));
        System.assert(orgApacheFelixSystemreadyImplServletSystemReadyServletProperties3.equals(orgApacheFelixSystemreadyImplServletSystemReadyServletProperties4));
        System.assertEquals(orgApacheFelixSystemreadyImplServletSystemReadyServletProperties1.hashCode(), orgApacheFelixSystemreadyImplServletSystemReadyServletProperties2.hashCode());
        System.assertEquals(orgApacheFelixSystemreadyImplServletSystemReadyServletProperties3.hashCode(), orgApacheFelixSystemreadyImplServletSystemReadyServletProperties4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASOrgApacheFelixSystemreadyImplServ orgApacheFelixSystemreadyImplServletSystemReadyServletProperties = new OASOrgApacheFelixSystemreadyImplServ();
        Map<String, String> propertyMappings = orgApacheFelixSystemreadyImplServletSystemReadyServletProperties.getPropertyMappings();
        System.assertEquals('osgiHttpWhiteboardServletPattern', propertyMappings.get('osgi.http.whiteboard.servlet.pattern'));
        System.assertEquals('osgiHttpWhiteboardContextSelect', propertyMappings.get('osgi.http.whiteboard.context.select'));
    }
}
