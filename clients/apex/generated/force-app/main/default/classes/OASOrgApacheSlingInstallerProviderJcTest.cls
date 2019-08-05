@isTest
private class OASOrgApacheSlingInstallerProviderJcTest {
    @isTest
    private static void equalsSameInstance() {
        OASOrgApacheSlingInstallerProviderJc orgApacheSlingInstallerProviderJcrImplJcrInstallerProperties1 = OASOrgApacheSlingInstallerProviderJc.getExample();
        OASOrgApacheSlingInstallerProviderJc orgApacheSlingInstallerProviderJcrImplJcrInstallerProperties2 = orgApacheSlingInstallerProviderJcrImplJcrInstallerProperties1;
        OASOrgApacheSlingInstallerProviderJc orgApacheSlingInstallerProviderJcrImplJcrInstallerProperties3 = new OASOrgApacheSlingInstallerProviderJc();
        OASOrgApacheSlingInstallerProviderJc orgApacheSlingInstallerProviderJcrImplJcrInstallerProperties4 = orgApacheSlingInstallerProviderJcrImplJcrInstallerProperties3;

        System.assert(orgApacheSlingInstallerProviderJcrImplJcrInstallerProperties1.equals(orgApacheSlingInstallerProviderJcrImplJcrInstallerProperties2));
        System.assert(orgApacheSlingInstallerProviderJcrImplJcrInstallerProperties2.equals(orgApacheSlingInstallerProviderJcrImplJcrInstallerProperties1));
        System.assert(orgApacheSlingInstallerProviderJcrImplJcrInstallerProperties1.equals(orgApacheSlingInstallerProviderJcrImplJcrInstallerProperties1));
        System.assert(orgApacheSlingInstallerProviderJcrImplJcrInstallerProperties3.equals(orgApacheSlingInstallerProviderJcrImplJcrInstallerProperties4));
        System.assert(orgApacheSlingInstallerProviderJcrImplJcrInstallerProperties4.equals(orgApacheSlingInstallerProviderJcrImplJcrInstallerProperties3));
        System.assert(orgApacheSlingInstallerProviderJcrImplJcrInstallerProperties3.equals(orgApacheSlingInstallerProviderJcrImplJcrInstallerProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASOrgApacheSlingInstallerProviderJc orgApacheSlingInstallerProviderJcrImplJcrInstallerProperties1 = OASOrgApacheSlingInstallerProviderJc.getExample();
        OASOrgApacheSlingInstallerProviderJc orgApacheSlingInstallerProviderJcrImplJcrInstallerProperties2 = OASOrgApacheSlingInstallerProviderJc.getExample();
        OASOrgApacheSlingInstallerProviderJc orgApacheSlingInstallerProviderJcrImplJcrInstallerProperties3 = new OASOrgApacheSlingInstallerProviderJc();
        OASOrgApacheSlingInstallerProviderJc orgApacheSlingInstallerProviderJcrImplJcrInstallerProperties4 = new OASOrgApacheSlingInstallerProviderJc();

        System.assert(orgApacheSlingInstallerProviderJcrImplJcrInstallerProperties1.equals(orgApacheSlingInstallerProviderJcrImplJcrInstallerProperties2));
        System.assert(orgApacheSlingInstallerProviderJcrImplJcrInstallerProperties2.equals(orgApacheSlingInstallerProviderJcrImplJcrInstallerProperties1));
        System.assert(orgApacheSlingInstallerProviderJcrImplJcrInstallerProperties3.equals(orgApacheSlingInstallerProviderJcrImplJcrInstallerProperties4));
        System.assert(orgApacheSlingInstallerProviderJcrImplJcrInstallerProperties4.equals(orgApacheSlingInstallerProviderJcrImplJcrInstallerProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASOrgApacheSlingInstallerProviderJc orgApacheSlingInstallerProviderJcrImplJcrInstallerProperties1 = OASOrgApacheSlingInstallerProviderJc.getExample();
        OASOrgApacheSlingInstallerProviderJc orgApacheSlingInstallerProviderJcrImplJcrInstallerProperties2 = new OASOrgApacheSlingInstallerProviderJc();

        System.assertEquals(false, orgApacheSlingInstallerProviderJcrImplJcrInstallerProperties1.equals('foo'));
        System.assertEquals(false, orgApacheSlingInstallerProviderJcrImplJcrInstallerProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASOrgApacheSlingInstallerProviderJc orgApacheSlingInstallerProviderJcrImplJcrInstallerProperties1 = OASOrgApacheSlingInstallerProviderJc.getExample();
        OASOrgApacheSlingInstallerProviderJc orgApacheSlingInstallerProviderJcrImplJcrInstallerProperties2 = new OASOrgApacheSlingInstallerProviderJc();
        OASOrgApacheSlingInstallerProviderJc orgApacheSlingInstallerProviderJcrImplJcrInstallerProperties3;

        System.assertEquals(false, orgApacheSlingInstallerProviderJcrImplJcrInstallerProperties1.equals(orgApacheSlingInstallerProviderJcrImplJcrInstallerProperties3));
        System.assertEquals(false, orgApacheSlingInstallerProviderJcrImplJcrInstallerProperties2.equals(orgApacheSlingInstallerProviderJcrImplJcrInstallerProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASOrgApacheSlingInstallerProviderJc orgApacheSlingInstallerProviderJcrImplJcrInstallerProperties1 = OASOrgApacheSlingInstallerProviderJc.getExample();
        OASOrgApacheSlingInstallerProviderJc orgApacheSlingInstallerProviderJcrImplJcrInstallerProperties2 = new OASOrgApacheSlingInstallerProviderJc();

        System.assertEquals(orgApacheSlingInstallerProviderJcrImplJcrInstallerProperties1.hashCode(), orgApacheSlingInstallerProviderJcrImplJcrInstallerProperties1.hashCode());
        System.assertEquals(orgApacheSlingInstallerProviderJcrImplJcrInstallerProperties2.hashCode(), orgApacheSlingInstallerProviderJcrImplJcrInstallerProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASOrgApacheSlingInstallerProviderJc orgApacheSlingInstallerProviderJcrImplJcrInstallerProperties1 = OASOrgApacheSlingInstallerProviderJc.getExample();
        OASOrgApacheSlingInstallerProviderJc orgApacheSlingInstallerProviderJcrImplJcrInstallerProperties2 = OASOrgApacheSlingInstallerProviderJc.getExample();
        OASOrgApacheSlingInstallerProviderJc orgApacheSlingInstallerProviderJcrImplJcrInstallerProperties3 = new OASOrgApacheSlingInstallerProviderJc();
        OASOrgApacheSlingInstallerProviderJc orgApacheSlingInstallerProviderJcrImplJcrInstallerProperties4 = new OASOrgApacheSlingInstallerProviderJc();

        System.assert(orgApacheSlingInstallerProviderJcrImplJcrInstallerProperties1.equals(orgApacheSlingInstallerProviderJcrImplJcrInstallerProperties2));
        System.assert(orgApacheSlingInstallerProviderJcrImplJcrInstallerProperties3.equals(orgApacheSlingInstallerProviderJcrImplJcrInstallerProperties4));
        System.assertEquals(orgApacheSlingInstallerProviderJcrImplJcrInstallerProperties1.hashCode(), orgApacheSlingInstallerProviderJcrImplJcrInstallerProperties2.hashCode());
        System.assertEquals(orgApacheSlingInstallerProviderJcrImplJcrInstallerProperties3.hashCode(), orgApacheSlingInstallerProviderJcrImplJcrInstallerProperties4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASOrgApacheSlingInstallerProviderJc orgApacheSlingInstallerProviderJcrImplJcrInstallerProperties = new OASOrgApacheSlingInstallerProviderJc();
        Map<String, String> propertyMappings = orgApacheSlingInstallerProviderJcrImplJcrInstallerProperties.getPropertyMappings();
        System.assertEquals('handlerSchemes', propertyMappings.get('handler.schemes'));
        System.assertEquals('slingJcrinstallFolderNameRegexp', propertyMappings.get('sling.jcrinstall.folder.name.regexp'));
        System.assertEquals('slingJcrinstallFolderMaxDepth', propertyMappings.get('sling.jcrinstall.folder.max.depth'));
        System.assertEquals('slingJcrinstallSearchPath', propertyMappings.get('sling.jcrinstall.search.path'));
        System.assertEquals('slingJcrinstallNewConfigPath', propertyMappings.get('sling.jcrinstall.new.config.path'));
        System.assertEquals('slingJcrinstallSignalPath', propertyMappings.get('sling.jcrinstall.signal.path'));
        System.assertEquals('slingJcrinstallEnableWriteback', propertyMappings.get('sling.jcrinstall.enable.writeback'));
    }
}
