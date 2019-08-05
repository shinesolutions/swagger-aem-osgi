@isTest
private class OASComAdobeCqProjectsPurgeSchedulerPTest {
    @isTest
    private static void equalsSameInstance() {
        OASComAdobeCqProjectsPurgeSchedulerP comAdobeCqProjectsPurgeSchedulerProperties1 = OASComAdobeCqProjectsPurgeSchedulerP.getExample();
        OASComAdobeCqProjectsPurgeSchedulerP comAdobeCqProjectsPurgeSchedulerProperties2 = comAdobeCqProjectsPurgeSchedulerProperties1;
        OASComAdobeCqProjectsPurgeSchedulerP comAdobeCqProjectsPurgeSchedulerProperties3 = new OASComAdobeCqProjectsPurgeSchedulerP();
        OASComAdobeCqProjectsPurgeSchedulerP comAdobeCqProjectsPurgeSchedulerProperties4 = comAdobeCqProjectsPurgeSchedulerProperties3;

        System.assert(comAdobeCqProjectsPurgeSchedulerProperties1.equals(comAdobeCqProjectsPurgeSchedulerProperties2));
        System.assert(comAdobeCqProjectsPurgeSchedulerProperties2.equals(comAdobeCqProjectsPurgeSchedulerProperties1));
        System.assert(comAdobeCqProjectsPurgeSchedulerProperties1.equals(comAdobeCqProjectsPurgeSchedulerProperties1));
        System.assert(comAdobeCqProjectsPurgeSchedulerProperties3.equals(comAdobeCqProjectsPurgeSchedulerProperties4));
        System.assert(comAdobeCqProjectsPurgeSchedulerProperties4.equals(comAdobeCqProjectsPurgeSchedulerProperties3));
        System.assert(comAdobeCqProjectsPurgeSchedulerProperties3.equals(comAdobeCqProjectsPurgeSchedulerProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASComAdobeCqProjectsPurgeSchedulerP comAdobeCqProjectsPurgeSchedulerProperties1 = OASComAdobeCqProjectsPurgeSchedulerP.getExample();
        OASComAdobeCqProjectsPurgeSchedulerP comAdobeCqProjectsPurgeSchedulerProperties2 = OASComAdobeCqProjectsPurgeSchedulerP.getExample();
        OASComAdobeCqProjectsPurgeSchedulerP comAdobeCqProjectsPurgeSchedulerProperties3 = new OASComAdobeCqProjectsPurgeSchedulerP();
        OASComAdobeCqProjectsPurgeSchedulerP comAdobeCqProjectsPurgeSchedulerProperties4 = new OASComAdobeCqProjectsPurgeSchedulerP();

        System.assert(comAdobeCqProjectsPurgeSchedulerProperties1.equals(comAdobeCqProjectsPurgeSchedulerProperties2));
        System.assert(comAdobeCqProjectsPurgeSchedulerProperties2.equals(comAdobeCqProjectsPurgeSchedulerProperties1));
        System.assert(comAdobeCqProjectsPurgeSchedulerProperties3.equals(comAdobeCqProjectsPurgeSchedulerProperties4));
        System.assert(comAdobeCqProjectsPurgeSchedulerProperties4.equals(comAdobeCqProjectsPurgeSchedulerProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASComAdobeCqProjectsPurgeSchedulerP comAdobeCqProjectsPurgeSchedulerProperties1 = OASComAdobeCqProjectsPurgeSchedulerP.getExample();
        OASComAdobeCqProjectsPurgeSchedulerP comAdobeCqProjectsPurgeSchedulerProperties2 = new OASComAdobeCqProjectsPurgeSchedulerP();

        System.assertEquals(false, comAdobeCqProjectsPurgeSchedulerProperties1.equals('foo'));
        System.assertEquals(false, comAdobeCqProjectsPurgeSchedulerProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASComAdobeCqProjectsPurgeSchedulerP comAdobeCqProjectsPurgeSchedulerProperties1 = OASComAdobeCqProjectsPurgeSchedulerP.getExample();
        OASComAdobeCqProjectsPurgeSchedulerP comAdobeCqProjectsPurgeSchedulerProperties2 = new OASComAdobeCqProjectsPurgeSchedulerP();
        OASComAdobeCqProjectsPurgeSchedulerP comAdobeCqProjectsPurgeSchedulerProperties3;

        System.assertEquals(false, comAdobeCqProjectsPurgeSchedulerProperties1.equals(comAdobeCqProjectsPurgeSchedulerProperties3));
        System.assertEquals(false, comAdobeCqProjectsPurgeSchedulerProperties2.equals(comAdobeCqProjectsPurgeSchedulerProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASComAdobeCqProjectsPurgeSchedulerP comAdobeCqProjectsPurgeSchedulerProperties1 = OASComAdobeCqProjectsPurgeSchedulerP.getExample();
        OASComAdobeCqProjectsPurgeSchedulerP comAdobeCqProjectsPurgeSchedulerProperties2 = new OASComAdobeCqProjectsPurgeSchedulerP();

        System.assertEquals(comAdobeCqProjectsPurgeSchedulerProperties1.hashCode(), comAdobeCqProjectsPurgeSchedulerProperties1.hashCode());
        System.assertEquals(comAdobeCqProjectsPurgeSchedulerProperties2.hashCode(), comAdobeCqProjectsPurgeSchedulerProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASComAdobeCqProjectsPurgeSchedulerP comAdobeCqProjectsPurgeSchedulerProperties1 = OASComAdobeCqProjectsPurgeSchedulerP.getExample();
        OASComAdobeCqProjectsPurgeSchedulerP comAdobeCqProjectsPurgeSchedulerProperties2 = OASComAdobeCqProjectsPurgeSchedulerP.getExample();
        OASComAdobeCqProjectsPurgeSchedulerP comAdobeCqProjectsPurgeSchedulerProperties3 = new OASComAdobeCqProjectsPurgeSchedulerP();
        OASComAdobeCqProjectsPurgeSchedulerP comAdobeCqProjectsPurgeSchedulerProperties4 = new OASComAdobeCqProjectsPurgeSchedulerP();

        System.assert(comAdobeCqProjectsPurgeSchedulerProperties1.equals(comAdobeCqProjectsPurgeSchedulerProperties2));
        System.assert(comAdobeCqProjectsPurgeSchedulerProperties3.equals(comAdobeCqProjectsPurgeSchedulerProperties4));
        System.assertEquals(comAdobeCqProjectsPurgeSchedulerProperties1.hashCode(), comAdobeCqProjectsPurgeSchedulerProperties2.hashCode());
        System.assertEquals(comAdobeCqProjectsPurgeSchedulerProperties3.hashCode(), comAdobeCqProjectsPurgeSchedulerProperties4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASComAdobeCqProjectsPurgeSchedulerP comAdobeCqProjectsPurgeSchedulerProperties = new OASComAdobeCqProjectsPurgeSchedulerP();
        Map<String, String> propertyMappings = comAdobeCqProjectsPurgeSchedulerProperties.getPropertyMappings();
        System.assertEquals('scheduledpurgeName', propertyMappings.get('scheduledpurge.name'));
        System.assertEquals('scheduledpurgePurgeActive', propertyMappings.get('scheduledpurge.purgeActive'));
        System.assertEquals('scheduledpurgeTemplates', propertyMappings.get('scheduledpurge.templates'));
        System.assertEquals('scheduledpurgePurgeGroups', propertyMappings.get('scheduledpurge.purgeGroups'));
        System.assertEquals('scheduledpurgePurgeAssets', propertyMappings.get('scheduledpurge.purgeAssets'));
        System.assertEquals('scheduledpurgeTerminateRunningWorkflows', propertyMappings.get('scheduledpurge.terminateRunningWorkflows'));
        System.assertEquals('scheduledpurgeDaysold', propertyMappings.get('scheduledpurge.daysold'));
        System.assertEquals('scheduledpurgeSaveThreshold', propertyMappings.get('scheduledpurge.saveThreshold'));
    }
}
