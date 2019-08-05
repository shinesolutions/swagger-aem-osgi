@isTest
private class OASComAdobeAemUpgradePrechecksMbeanITest {
    @isTest
    private static void equalsSameInstance() {
        OASComAdobeAemUpgradePrechecksMbeanI comAdobeAemUpgradePrechecksMbeanImplPreUpgradeTasksMBeanImplProperties1 = OASComAdobeAemUpgradePrechecksMbeanI.getExample();
        OASComAdobeAemUpgradePrechecksMbeanI comAdobeAemUpgradePrechecksMbeanImplPreUpgradeTasksMBeanImplProperties2 = comAdobeAemUpgradePrechecksMbeanImplPreUpgradeTasksMBeanImplProperties1;
        OASComAdobeAemUpgradePrechecksMbeanI comAdobeAemUpgradePrechecksMbeanImplPreUpgradeTasksMBeanImplProperties3 = new OASComAdobeAemUpgradePrechecksMbeanI();
        OASComAdobeAemUpgradePrechecksMbeanI comAdobeAemUpgradePrechecksMbeanImplPreUpgradeTasksMBeanImplProperties4 = comAdobeAemUpgradePrechecksMbeanImplPreUpgradeTasksMBeanImplProperties3;

        System.assert(comAdobeAemUpgradePrechecksMbeanImplPreUpgradeTasksMBeanImplProperties1.equals(comAdobeAemUpgradePrechecksMbeanImplPreUpgradeTasksMBeanImplProperties2));
        System.assert(comAdobeAemUpgradePrechecksMbeanImplPreUpgradeTasksMBeanImplProperties2.equals(comAdobeAemUpgradePrechecksMbeanImplPreUpgradeTasksMBeanImplProperties1));
        System.assert(comAdobeAemUpgradePrechecksMbeanImplPreUpgradeTasksMBeanImplProperties1.equals(comAdobeAemUpgradePrechecksMbeanImplPreUpgradeTasksMBeanImplProperties1));
        System.assert(comAdobeAemUpgradePrechecksMbeanImplPreUpgradeTasksMBeanImplProperties3.equals(comAdobeAemUpgradePrechecksMbeanImplPreUpgradeTasksMBeanImplProperties4));
        System.assert(comAdobeAemUpgradePrechecksMbeanImplPreUpgradeTasksMBeanImplProperties4.equals(comAdobeAemUpgradePrechecksMbeanImplPreUpgradeTasksMBeanImplProperties3));
        System.assert(comAdobeAemUpgradePrechecksMbeanImplPreUpgradeTasksMBeanImplProperties3.equals(comAdobeAemUpgradePrechecksMbeanImplPreUpgradeTasksMBeanImplProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASComAdobeAemUpgradePrechecksMbeanI comAdobeAemUpgradePrechecksMbeanImplPreUpgradeTasksMBeanImplProperties1 = OASComAdobeAemUpgradePrechecksMbeanI.getExample();
        OASComAdobeAemUpgradePrechecksMbeanI comAdobeAemUpgradePrechecksMbeanImplPreUpgradeTasksMBeanImplProperties2 = OASComAdobeAemUpgradePrechecksMbeanI.getExample();
        OASComAdobeAemUpgradePrechecksMbeanI comAdobeAemUpgradePrechecksMbeanImplPreUpgradeTasksMBeanImplProperties3 = new OASComAdobeAemUpgradePrechecksMbeanI();
        OASComAdobeAemUpgradePrechecksMbeanI comAdobeAemUpgradePrechecksMbeanImplPreUpgradeTasksMBeanImplProperties4 = new OASComAdobeAemUpgradePrechecksMbeanI();

        System.assert(comAdobeAemUpgradePrechecksMbeanImplPreUpgradeTasksMBeanImplProperties1.equals(comAdobeAemUpgradePrechecksMbeanImplPreUpgradeTasksMBeanImplProperties2));
        System.assert(comAdobeAemUpgradePrechecksMbeanImplPreUpgradeTasksMBeanImplProperties2.equals(comAdobeAemUpgradePrechecksMbeanImplPreUpgradeTasksMBeanImplProperties1));
        System.assert(comAdobeAemUpgradePrechecksMbeanImplPreUpgradeTasksMBeanImplProperties3.equals(comAdobeAemUpgradePrechecksMbeanImplPreUpgradeTasksMBeanImplProperties4));
        System.assert(comAdobeAemUpgradePrechecksMbeanImplPreUpgradeTasksMBeanImplProperties4.equals(comAdobeAemUpgradePrechecksMbeanImplPreUpgradeTasksMBeanImplProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASComAdobeAemUpgradePrechecksMbeanI comAdobeAemUpgradePrechecksMbeanImplPreUpgradeTasksMBeanImplProperties1 = OASComAdobeAemUpgradePrechecksMbeanI.getExample();
        OASComAdobeAemUpgradePrechecksMbeanI comAdobeAemUpgradePrechecksMbeanImplPreUpgradeTasksMBeanImplProperties2 = new OASComAdobeAemUpgradePrechecksMbeanI();

        System.assertEquals(false, comAdobeAemUpgradePrechecksMbeanImplPreUpgradeTasksMBeanImplProperties1.equals('foo'));
        System.assertEquals(false, comAdobeAemUpgradePrechecksMbeanImplPreUpgradeTasksMBeanImplProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASComAdobeAemUpgradePrechecksMbeanI comAdobeAemUpgradePrechecksMbeanImplPreUpgradeTasksMBeanImplProperties1 = OASComAdobeAemUpgradePrechecksMbeanI.getExample();
        OASComAdobeAemUpgradePrechecksMbeanI comAdobeAemUpgradePrechecksMbeanImplPreUpgradeTasksMBeanImplProperties2 = new OASComAdobeAemUpgradePrechecksMbeanI();
        OASComAdobeAemUpgradePrechecksMbeanI comAdobeAemUpgradePrechecksMbeanImplPreUpgradeTasksMBeanImplProperties3;

        System.assertEquals(false, comAdobeAemUpgradePrechecksMbeanImplPreUpgradeTasksMBeanImplProperties1.equals(comAdobeAemUpgradePrechecksMbeanImplPreUpgradeTasksMBeanImplProperties3));
        System.assertEquals(false, comAdobeAemUpgradePrechecksMbeanImplPreUpgradeTasksMBeanImplProperties2.equals(comAdobeAemUpgradePrechecksMbeanImplPreUpgradeTasksMBeanImplProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASComAdobeAemUpgradePrechecksMbeanI comAdobeAemUpgradePrechecksMbeanImplPreUpgradeTasksMBeanImplProperties1 = OASComAdobeAemUpgradePrechecksMbeanI.getExample();
        OASComAdobeAemUpgradePrechecksMbeanI comAdobeAemUpgradePrechecksMbeanImplPreUpgradeTasksMBeanImplProperties2 = new OASComAdobeAemUpgradePrechecksMbeanI();

        System.assertEquals(comAdobeAemUpgradePrechecksMbeanImplPreUpgradeTasksMBeanImplProperties1.hashCode(), comAdobeAemUpgradePrechecksMbeanImplPreUpgradeTasksMBeanImplProperties1.hashCode());
        System.assertEquals(comAdobeAemUpgradePrechecksMbeanImplPreUpgradeTasksMBeanImplProperties2.hashCode(), comAdobeAemUpgradePrechecksMbeanImplPreUpgradeTasksMBeanImplProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASComAdobeAemUpgradePrechecksMbeanI comAdobeAemUpgradePrechecksMbeanImplPreUpgradeTasksMBeanImplProperties1 = OASComAdobeAemUpgradePrechecksMbeanI.getExample();
        OASComAdobeAemUpgradePrechecksMbeanI comAdobeAemUpgradePrechecksMbeanImplPreUpgradeTasksMBeanImplProperties2 = OASComAdobeAemUpgradePrechecksMbeanI.getExample();
        OASComAdobeAemUpgradePrechecksMbeanI comAdobeAemUpgradePrechecksMbeanImplPreUpgradeTasksMBeanImplProperties3 = new OASComAdobeAemUpgradePrechecksMbeanI();
        OASComAdobeAemUpgradePrechecksMbeanI comAdobeAemUpgradePrechecksMbeanImplPreUpgradeTasksMBeanImplProperties4 = new OASComAdobeAemUpgradePrechecksMbeanI();

        System.assert(comAdobeAemUpgradePrechecksMbeanImplPreUpgradeTasksMBeanImplProperties1.equals(comAdobeAemUpgradePrechecksMbeanImplPreUpgradeTasksMBeanImplProperties2));
        System.assert(comAdobeAemUpgradePrechecksMbeanImplPreUpgradeTasksMBeanImplProperties3.equals(comAdobeAemUpgradePrechecksMbeanImplPreUpgradeTasksMBeanImplProperties4));
        System.assertEquals(comAdobeAemUpgradePrechecksMbeanImplPreUpgradeTasksMBeanImplProperties1.hashCode(), comAdobeAemUpgradePrechecksMbeanImplPreUpgradeTasksMBeanImplProperties2.hashCode());
        System.assertEquals(comAdobeAemUpgradePrechecksMbeanImplPreUpgradeTasksMBeanImplProperties3.hashCode(), comAdobeAemUpgradePrechecksMbeanImplPreUpgradeTasksMBeanImplProperties4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASComAdobeAemUpgradePrechecksMbeanI comAdobeAemUpgradePrechecksMbeanImplPreUpgradeTasksMBeanImplProperties = new OASComAdobeAemUpgradePrechecksMbeanI();
        Map<String, String> propertyMappings = comAdobeAemUpgradePrechecksMbeanImplPreUpgradeTasksMBeanImplProperties.getPropertyMappings();
        System.assertEquals('preUpgradeMaintenanceTasks', propertyMappings.get('pre-upgrade.maintenance.tasks'));
        System.assertEquals('preUpgradeHcTags', propertyMappings.get('pre-upgrade.hc.tags'));
    }
}
