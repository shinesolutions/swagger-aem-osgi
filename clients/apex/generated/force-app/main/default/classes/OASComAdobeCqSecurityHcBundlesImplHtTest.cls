@isTest
private class OASComAdobeCqSecurityHcBundlesImplHtTest {
    @isTest
    private static void equalsSameInstance() {
        OASComAdobeCqSecurityHcBundlesImplHt comAdobeCqSecurityHcBundlesImplHtmlLibraryManagerConfigHealthChProperties1 = OASComAdobeCqSecurityHcBundlesImplHt.getExample();
        OASComAdobeCqSecurityHcBundlesImplHt comAdobeCqSecurityHcBundlesImplHtmlLibraryManagerConfigHealthChProperties2 = comAdobeCqSecurityHcBundlesImplHtmlLibraryManagerConfigHealthChProperties1;
        OASComAdobeCqSecurityHcBundlesImplHt comAdobeCqSecurityHcBundlesImplHtmlLibraryManagerConfigHealthChProperties3 = new OASComAdobeCqSecurityHcBundlesImplHt();
        OASComAdobeCqSecurityHcBundlesImplHt comAdobeCqSecurityHcBundlesImplHtmlLibraryManagerConfigHealthChProperties4 = comAdobeCqSecurityHcBundlesImplHtmlLibraryManagerConfigHealthChProperties3;

        System.assert(comAdobeCqSecurityHcBundlesImplHtmlLibraryManagerConfigHealthChProperties1.equals(comAdobeCqSecurityHcBundlesImplHtmlLibraryManagerConfigHealthChProperties2));
        System.assert(comAdobeCqSecurityHcBundlesImplHtmlLibraryManagerConfigHealthChProperties2.equals(comAdobeCqSecurityHcBundlesImplHtmlLibraryManagerConfigHealthChProperties1));
        System.assert(comAdobeCqSecurityHcBundlesImplHtmlLibraryManagerConfigHealthChProperties1.equals(comAdobeCqSecurityHcBundlesImplHtmlLibraryManagerConfigHealthChProperties1));
        System.assert(comAdobeCqSecurityHcBundlesImplHtmlLibraryManagerConfigHealthChProperties3.equals(comAdobeCqSecurityHcBundlesImplHtmlLibraryManagerConfigHealthChProperties4));
        System.assert(comAdobeCqSecurityHcBundlesImplHtmlLibraryManagerConfigHealthChProperties4.equals(comAdobeCqSecurityHcBundlesImplHtmlLibraryManagerConfigHealthChProperties3));
        System.assert(comAdobeCqSecurityHcBundlesImplHtmlLibraryManagerConfigHealthChProperties3.equals(comAdobeCqSecurityHcBundlesImplHtmlLibraryManagerConfigHealthChProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASComAdobeCqSecurityHcBundlesImplHt comAdobeCqSecurityHcBundlesImplHtmlLibraryManagerConfigHealthChProperties1 = OASComAdobeCqSecurityHcBundlesImplHt.getExample();
        OASComAdobeCqSecurityHcBundlesImplHt comAdobeCqSecurityHcBundlesImplHtmlLibraryManagerConfigHealthChProperties2 = OASComAdobeCqSecurityHcBundlesImplHt.getExample();
        OASComAdobeCqSecurityHcBundlesImplHt comAdobeCqSecurityHcBundlesImplHtmlLibraryManagerConfigHealthChProperties3 = new OASComAdobeCqSecurityHcBundlesImplHt();
        OASComAdobeCqSecurityHcBundlesImplHt comAdobeCqSecurityHcBundlesImplHtmlLibraryManagerConfigHealthChProperties4 = new OASComAdobeCqSecurityHcBundlesImplHt();

        System.assert(comAdobeCqSecurityHcBundlesImplHtmlLibraryManagerConfigHealthChProperties1.equals(comAdobeCqSecurityHcBundlesImplHtmlLibraryManagerConfigHealthChProperties2));
        System.assert(comAdobeCqSecurityHcBundlesImplHtmlLibraryManagerConfigHealthChProperties2.equals(comAdobeCqSecurityHcBundlesImplHtmlLibraryManagerConfigHealthChProperties1));
        System.assert(comAdobeCqSecurityHcBundlesImplHtmlLibraryManagerConfigHealthChProperties3.equals(comAdobeCqSecurityHcBundlesImplHtmlLibraryManagerConfigHealthChProperties4));
        System.assert(comAdobeCqSecurityHcBundlesImplHtmlLibraryManagerConfigHealthChProperties4.equals(comAdobeCqSecurityHcBundlesImplHtmlLibraryManagerConfigHealthChProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASComAdobeCqSecurityHcBundlesImplHt comAdobeCqSecurityHcBundlesImplHtmlLibraryManagerConfigHealthChProperties1 = OASComAdobeCqSecurityHcBundlesImplHt.getExample();
        OASComAdobeCqSecurityHcBundlesImplHt comAdobeCqSecurityHcBundlesImplHtmlLibraryManagerConfigHealthChProperties2 = new OASComAdobeCqSecurityHcBundlesImplHt();

        System.assertEquals(false, comAdobeCqSecurityHcBundlesImplHtmlLibraryManagerConfigHealthChProperties1.equals('foo'));
        System.assertEquals(false, comAdobeCqSecurityHcBundlesImplHtmlLibraryManagerConfigHealthChProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASComAdobeCqSecurityHcBundlesImplHt comAdobeCqSecurityHcBundlesImplHtmlLibraryManagerConfigHealthChProperties1 = OASComAdobeCqSecurityHcBundlesImplHt.getExample();
        OASComAdobeCqSecurityHcBundlesImplHt comAdobeCqSecurityHcBundlesImplHtmlLibraryManagerConfigHealthChProperties2 = new OASComAdobeCqSecurityHcBundlesImplHt();
        OASComAdobeCqSecurityHcBundlesImplHt comAdobeCqSecurityHcBundlesImplHtmlLibraryManagerConfigHealthChProperties3;

        System.assertEquals(false, comAdobeCqSecurityHcBundlesImplHtmlLibraryManagerConfigHealthChProperties1.equals(comAdobeCqSecurityHcBundlesImplHtmlLibraryManagerConfigHealthChProperties3));
        System.assertEquals(false, comAdobeCqSecurityHcBundlesImplHtmlLibraryManagerConfigHealthChProperties2.equals(comAdobeCqSecurityHcBundlesImplHtmlLibraryManagerConfigHealthChProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASComAdobeCqSecurityHcBundlesImplHt comAdobeCqSecurityHcBundlesImplHtmlLibraryManagerConfigHealthChProperties1 = OASComAdobeCqSecurityHcBundlesImplHt.getExample();
        OASComAdobeCqSecurityHcBundlesImplHt comAdobeCqSecurityHcBundlesImplHtmlLibraryManagerConfigHealthChProperties2 = new OASComAdobeCqSecurityHcBundlesImplHt();

        System.assertEquals(comAdobeCqSecurityHcBundlesImplHtmlLibraryManagerConfigHealthChProperties1.hashCode(), comAdobeCqSecurityHcBundlesImplHtmlLibraryManagerConfigHealthChProperties1.hashCode());
        System.assertEquals(comAdobeCqSecurityHcBundlesImplHtmlLibraryManagerConfigHealthChProperties2.hashCode(), comAdobeCqSecurityHcBundlesImplHtmlLibraryManagerConfigHealthChProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASComAdobeCqSecurityHcBundlesImplHt comAdobeCqSecurityHcBundlesImplHtmlLibraryManagerConfigHealthChProperties1 = OASComAdobeCqSecurityHcBundlesImplHt.getExample();
        OASComAdobeCqSecurityHcBundlesImplHt comAdobeCqSecurityHcBundlesImplHtmlLibraryManagerConfigHealthChProperties2 = OASComAdobeCqSecurityHcBundlesImplHt.getExample();
        OASComAdobeCqSecurityHcBundlesImplHt comAdobeCqSecurityHcBundlesImplHtmlLibraryManagerConfigHealthChProperties3 = new OASComAdobeCqSecurityHcBundlesImplHt();
        OASComAdobeCqSecurityHcBundlesImplHt comAdobeCqSecurityHcBundlesImplHtmlLibraryManagerConfigHealthChProperties4 = new OASComAdobeCqSecurityHcBundlesImplHt();

        System.assert(comAdobeCqSecurityHcBundlesImplHtmlLibraryManagerConfigHealthChProperties1.equals(comAdobeCqSecurityHcBundlesImplHtmlLibraryManagerConfigHealthChProperties2));
        System.assert(comAdobeCqSecurityHcBundlesImplHtmlLibraryManagerConfigHealthChProperties3.equals(comAdobeCqSecurityHcBundlesImplHtmlLibraryManagerConfigHealthChProperties4));
        System.assertEquals(comAdobeCqSecurityHcBundlesImplHtmlLibraryManagerConfigHealthChProperties1.hashCode(), comAdobeCqSecurityHcBundlesImplHtmlLibraryManagerConfigHealthChProperties2.hashCode());
        System.assertEquals(comAdobeCqSecurityHcBundlesImplHtmlLibraryManagerConfigHealthChProperties3.hashCode(), comAdobeCqSecurityHcBundlesImplHtmlLibraryManagerConfigHealthChProperties4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASComAdobeCqSecurityHcBundlesImplHt comAdobeCqSecurityHcBundlesImplHtmlLibraryManagerConfigHealthChProperties = new OASComAdobeCqSecurityHcBundlesImplHt();
        Map<String, String> propertyMappings = comAdobeCqSecurityHcBundlesImplHtmlLibraryManagerConfigHealthChProperties.getPropertyMappings();
        System.assertEquals('hcTags', propertyMappings.get('hc.tags'));
    }
}
