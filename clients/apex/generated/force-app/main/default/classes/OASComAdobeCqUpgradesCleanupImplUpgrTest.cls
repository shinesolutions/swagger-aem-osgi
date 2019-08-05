@isTest
private class OASComAdobeCqUpgradesCleanupImplUpgrTest {
    @isTest
    private static void equalsSameInstance() {
        OASComAdobeCqUpgradesCleanupImplUpgr comAdobeCqUpgradesCleanupImplUpgradeInstallFolderCleanupProperties1 = OASComAdobeCqUpgradesCleanupImplUpgr.getExample();
        OASComAdobeCqUpgradesCleanupImplUpgr comAdobeCqUpgradesCleanupImplUpgradeInstallFolderCleanupProperties2 = comAdobeCqUpgradesCleanupImplUpgradeInstallFolderCleanupProperties1;
        OASComAdobeCqUpgradesCleanupImplUpgr comAdobeCqUpgradesCleanupImplUpgradeInstallFolderCleanupProperties3 = new OASComAdobeCqUpgradesCleanupImplUpgr();
        OASComAdobeCqUpgradesCleanupImplUpgr comAdobeCqUpgradesCleanupImplUpgradeInstallFolderCleanupProperties4 = comAdobeCqUpgradesCleanupImplUpgradeInstallFolderCleanupProperties3;

        System.assert(comAdobeCqUpgradesCleanupImplUpgradeInstallFolderCleanupProperties1.equals(comAdobeCqUpgradesCleanupImplUpgradeInstallFolderCleanupProperties2));
        System.assert(comAdobeCqUpgradesCleanupImplUpgradeInstallFolderCleanupProperties2.equals(comAdobeCqUpgradesCleanupImplUpgradeInstallFolderCleanupProperties1));
        System.assert(comAdobeCqUpgradesCleanupImplUpgradeInstallFolderCleanupProperties1.equals(comAdobeCqUpgradesCleanupImplUpgradeInstallFolderCleanupProperties1));
        System.assert(comAdobeCqUpgradesCleanupImplUpgradeInstallFolderCleanupProperties3.equals(comAdobeCqUpgradesCleanupImplUpgradeInstallFolderCleanupProperties4));
        System.assert(comAdobeCqUpgradesCleanupImplUpgradeInstallFolderCleanupProperties4.equals(comAdobeCqUpgradesCleanupImplUpgradeInstallFolderCleanupProperties3));
        System.assert(comAdobeCqUpgradesCleanupImplUpgradeInstallFolderCleanupProperties3.equals(comAdobeCqUpgradesCleanupImplUpgradeInstallFolderCleanupProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASComAdobeCqUpgradesCleanupImplUpgr comAdobeCqUpgradesCleanupImplUpgradeInstallFolderCleanupProperties1 = OASComAdobeCqUpgradesCleanupImplUpgr.getExample();
        OASComAdobeCqUpgradesCleanupImplUpgr comAdobeCqUpgradesCleanupImplUpgradeInstallFolderCleanupProperties2 = OASComAdobeCqUpgradesCleanupImplUpgr.getExample();
        OASComAdobeCqUpgradesCleanupImplUpgr comAdobeCqUpgradesCleanupImplUpgradeInstallFolderCleanupProperties3 = new OASComAdobeCqUpgradesCleanupImplUpgr();
        OASComAdobeCqUpgradesCleanupImplUpgr comAdobeCqUpgradesCleanupImplUpgradeInstallFolderCleanupProperties4 = new OASComAdobeCqUpgradesCleanupImplUpgr();

        System.assert(comAdobeCqUpgradesCleanupImplUpgradeInstallFolderCleanupProperties1.equals(comAdobeCqUpgradesCleanupImplUpgradeInstallFolderCleanupProperties2));
        System.assert(comAdobeCqUpgradesCleanupImplUpgradeInstallFolderCleanupProperties2.equals(comAdobeCqUpgradesCleanupImplUpgradeInstallFolderCleanupProperties1));
        System.assert(comAdobeCqUpgradesCleanupImplUpgradeInstallFolderCleanupProperties3.equals(comAdobeCqUpgradesCleanupImplUpgradeInstallFolderCleanupProperties4));
        System.assert(comAdobeCqUpgradesCleanupImplUpgradeInstallFolderCleanupProperties4.equals(comAdobeCqUpgradesCleanupImplUpgradeInstallFolderCleanupProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASComAdobeCqUpgradesCleanupImplUpgr comAdobeCqUpgradesCleanupImplUpgradeInstallFolderCleanupProperties1 = OASComAdobeCqUpgradesCleanupImplUpgr.getExample();
        OASComAdobeCqUpgradesCleanupImplUpgr comAdobeCqUpgradesCleanupImplUpgradeInstallFolderCleanupProperties2 = new OASComAdobeCqUpgradesCleanupImplUpgr();

        System.assertEquals(false, comAdobeCqUpgradesCleanupImplUpgradeInstallFolderCleanupProperties1.equals('foo'));
        System.assertEquals(false, comAdobeCqUpgradesCleanupImplUpgradeInstallFolderCleanupProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASComAdobeCqUpgradesCleanupImplUpgr comAdobeCqUpgradesCleanupImplUpgradeInstallFolderCleanupProperties1 = OASComAdobeCqUpgradesCleanupImplUpgr.getExample();
        OASComAdobeCqUpgradesCleanupImplUpgr comAdobeCqUpgradesCleanupImplUpgradeInstallFolderCleanupProperties2 = new OASComAdobeCqUpgradesCleanupImplUpgr();
        OASComAdobeCqUpgradesCleanupImplUpgr comAdobeCqUpgradesCleanupImplUpgradeInstallFolderCleanupProperties3;

        System.assertEquals(false, comAdobeCqUpgradesCleanupImplUpgradeInstallFolderCleanupProperties1.equals(comAdobeCqUpgradesCleanupImplUpgradeInstallFolderCleanupProperties3));
        System.assertEquals(false, comAdobeCqUpgradesCleanupImplUpgradeInstallFolderCleanupProperties2.equals(comAdobeCqUpgradesCleanupImplUpgradeInstallFolderCleanupProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASComAdobeCqUpgradesCleanupImplUpgr comAdobeCqUpgradesCleanupImplUpgradeInstallFolderCleanupProperties1 = OASComAdobeCqUpgradesCleanupImplUpgr.getExample();
        OASComAdobeCqUpgradesCleanupImplUpgr comAdobeCqUpgradesCleanupImplUpgradeInstallFolderCleanupProperties2 = new OASComAdobeCqUpgradesCleanupImplUpgr();

        System.assertEquals(comAdobeCqUpgradesCleanupImplUpgradeInstallFolderCleanupProperties1.hashCode(), comAdobeCqUpgradesCleanupImplUpgradeInstallFolderCleanupProperties1.hashCode());
        System.assertEquals(comAdobeCqUpgradesCleanupImplUpgradeInstallFolderCleanupProperties2.hashCode(), comAdobeCqUpgradesCleanupImplUpgradeInstallFolderCleanupProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASComAdobeCqUpgradesCleanupImplUpgr comAdobeCqUpgradesCleanupImplUpgradeInstallFolderCleanupProperties1 = OASComAdobeCqUpgradesCleanupImplUpgr.getExample();
        OASComAdobeCqUpgradesCleanupImplUpgr comAdobeCqUpgradesCleanupImplUpgradeInstallFolderCleanupProperties2 = OASComAdobeCqUpgradesCleanupImplUpgr.getExample();
        OASComAdobeCqUpgradesCleanupImplUpgr comAdobeCqUpgradesCleanupImplUpgradeInstallFolderCleanupProperties3 = new OASComAdobeCqUpgradesCleanupImplUpgr();
        OASComAdobeCqUpgradesCleanupImplUpgr comAdobeCqUpgradesCleanupImplUpgradeInstallFolderCleanupProperties4 = new OASComAdobeCqUpgradesCleanupImplUpgr();

        System.assert(comAdobeCqUpgradesCleanupImplUpgradeInstallFolderCleanupProperties1.equals(comAdobeCqUpgradesCleanupImplUpgradeInstallFolderCleanupProperties2));
        System.assert(comAdobeCqUpgradesCleanupImplUpgradeInstallFolderCleanupProperties3.equals(comAdobeCqUpgradesCleanupImplUpgradeInstallFolderCleanupProperties4));
        System.assertEquals(comAdobeCqUpgradesCleanupImplUpgradeInstallFolderCleanupProperties1.hashCode(), comAdobeCqUpgradesCleanupImplUpgradeInstallFolderCleanupProperties2.hashCode());
        System.assertEquals(comAdobeCqUpgradesCleanupImplUpgradeInstallFolderCleanupProperties3.hashCode(), comAdobeCqUpgradesCleanupImplUpgradeInstallFolderCleanupProperties4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASComAdobeCqUpgradesCleanupImplUpgr comAdobeCqUpgradesCleanupImplUpgradeInstallFolderCleanupProperties = new OASComAdobeCqUpgradesCleanupImplUpgr();
        Map<String, String> propertyMappings = comAdobeCqUpgradesCleanupImplUpgradeInstallFolderCleanupProperties.getPropertyMappings();
        System.assertEquals('deleteNameRegexps', propertyMappings.get('delete.name.regexps'));
    }
}
