@isTest
private class OASComAdobeCqCloudconfigCoreImplConfTest {
    @isTest
    private static void equalsSameInstance() {
        OASComAdobeCqCloudconfigCoreImplConf comAdobeCqCloudconfigCoreImplConfigurationReplicationEventHandleProperties1 = OASComAdobeCqCloudconfigCoreImplConf.getExample();
        OASComAdobeCqCloudconfigCoreImplConf comAdobeCqCloudconfigCoreImplConfigurationReplicationEventHandleProperties2 = comAdobeCqCloudconfigCoreImplConfigurationReplicationEventHandleProperties1;
        OASComAdobeCqCloudconfigCoreImplConf comAdobeCqCloudconfigCoreImplConfigurationReplicationEventHandleProperties3 = new OASComAdobeCqCloudconfigCoreImplConf();
        OASComAdobeCqCloudconfigCoreImplConf comAdobeCqCloudconfigCoreImplConfigurationReplicationEventHandleProperties4 = comAdobeCqCloudconfigCoreImplConfigurationReplicationEventHandleProperties3;

        System.assert(comAdobeCqCloudconfigCoreImplConfigurationReplicationEventHandleProperties1.equals(comAdobeCqCloudconfigCoreImplConfigurationReplicationEventHandleProperties2));
        System.assert(comAdobeCqCloudconfigCoreImplConfigurationReplicationEventHandleProperties2.equals(comAdobeCqCloudconfigCoreImplConfigurationReplicationEventHandleProperties1));
        System.assert(comAdobeCqCloudconfigCoreImplConfigurationReplicationEventHandleProperties1.equals(comAdobeCqCloudconfigCoreImplConfigurationReplicationEventHandleProperties1));
        System.assert(comAdobeCqCloudconfigCoreImplConfigurationReplicationEventHandleProperties3.equals(comAdobeCqCloudconfigCoreImplConfigurationReplicationEventHandleProperties4));
        System.assert(comAdobeCqCloudconfigCoreImplConfigurationReplicationEventHandleProperties4.equals(comAdobeCqCloudconfigCoreImplConfigurationReplicationEventHandleProperties3));
        System.assert(comAdobeCqCloudconfigCoreImplConfigurationReplicationEventHandleProperties3.equals(comAdobeCqCloudconfigCoreImplConfigurationReplicationEventHandleProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASComAdobeCqCloudconfigCoreImplConf comAdobeCqCloudconfigCoreImplConfigurationReplicationEventHandleProperties1 = OASComAdobeCqCloudconfigCoreImplConf.getExample();
        OASComAdobeCqCloudconfigCoreImplConf comAdobeCqCloudconfigCoreImplConfigurationReplicationEventHandleProperties2 = OASComAdobeCqCloudconfigCoreImplConf.getExample();
        OASComAdobeCqCloudconfigCoreImplConf comAdobeCqCloudconfigCoreImplConfigurationReplicationEventHandleProperties3 = new OASComAdobeCqCloudconfigCoreImplConf();
        OASComAdobeCqCloudconfigCoreImplConf comAdobeCqCloudconfigCoreImplConfigurationReplicationEventHandleProperties4 = new OASComAdobeCqCloudconfigCoreImplConf();

        System.assert(comAdobeCqCloudconfigCoreImplConfigurationReplicationEventHandleProperties1.equals(comAdobeCqCloudconfigCoreImplConfigurationReplicationEventHandleProperties2));
        System.assert(comAdobeCqCloudconfigCoreImplConfigurationReplicationEventHandleProperties2.equals(comAdobeCqCloudconfigCoreImplConfigurationReplicationEventHandleProperties1));
        System.assert(comAdobeCqCloudconfigCoreImplConfigurationReplicationEventHandleProperties3.equals(comAdobeCqCloudconfigCoreImplConfigurationReplicationEventHandleProperties4));
        System.assert(comAdobeCqCloudconfigCoreImplConfigurationReplicationEventHandleProperties4.equals(comAdobeCqCloudconfigCoreImplConfigurationReplicationEventHandleProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASComAdobeCqCloudconfigCoreImplConf comAdobeCqCloudconfigCoreImplConfigurationReplicationEventHandleProperties1 = OASComAdobeCqCloudconfigCoreImplConf.getExample();
        OASComAdobeCqCloudconfigCoreImplConf comAdobeCqCloudconfigCoreImplConfigurationReplicationEventHandleProperties2 = new OASComAdobeCqCloudconfigCoreImplConf();

        System.assertEquals(false, comAdobeCqCloudconfigCoreImplConfigurationReplicationEventHandleProperties1.equals('foo'));
        System.assertEquals(false, comAdobeCqCloudconfigCoreImplConfigurationReplicationEventHandleProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASComAdobeCqCloudconfigCoreImplConf comAdobeCqCloudconfigCoreImplConfigurationReplicationEventHandleProperties1 = OASComAdobeCqCloudconfigCoreImplConf.getExample();
        OASComAdobeCqCloudconfigCoreImplConf comAdobeCqCloudconfigCoreImplConfigurationReplicationEventHandleProperties2 = new OASComAdobeCqCloudconfigCoreImplConf();
        OASComAdobeCqCloudconfigCoreImplConf comAdobeCqCloudconfigCoreImplConfigurationReplicationEventHandleProperties3;

        System.assertEquals(false, comAdobeCqCloudconfigCoreImplConfigurationReplicationEventHandleProperties1.equals(comAdobeCqCloudconfigCoreImplConfigurationReplicationEventHandleProperties3));
        System.assertEquals(false, comAdobeCqCloudconfigCoreImplConfigurationReplicationEventHandleProperties2.equals(comAdobeCqCloudconfigCoreImplConfigurationReplicationEventHandleProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASComAdobeCqCloudconfigCoreImplConf comAdobeCqCloudconfigCoreImplConfigurationReplicationEventHandleProperties1 = OASComAdobeCqCloudconfigCoreImplConf.getExample();
        OASComAdobeCqCloudconfigCoreImplConf comAdobeCqCloudconfigCoreImplConfigurationReplicationEventHandleProperties2 = new OASComAdobeCqCloudconfigCoreImplConf();

        System.assertEquals(comAdobeCqCloudconfigCoreImplConfigurationReplicationEventHandleProperties1.hashCode(), comAdobeCqCloudconfigCoreImplConfigurationReplicationEventHandleProperties1.hashCode());
        System.assertEquals(comAdobeCqCloudconfigCoreImplConfigurationReplicationEventHandleProperties2.hashCode(), comAdobeCqCloudconfigCoreImplConfigurationReplicationEventHandleProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASComAdobeCqCloudconfigCoreImplConf comAdobeCqCloudconfigCoreImplConfigurationReplicationEventHandleProperties1 = OASComAdobeCqCloudconfigCoreImplConf.getExample();
        OASComAdobeCqCloudconfigCoreImplConf comAdobeCqCloudconfigCoreImplConfigurationReplicationEventHandleProperties2 = OASComAdobeCqCloudconfigCoreImplConf.getExample();
        OASComAdobeCqCloudconfigCoreImplConf comAdobeCqCloudconfigCoreImplConfigurationReplicationEventHandleProperties3 = new OASComAdobeCqCloudconfigCoreImplConf();
        OASComAdobeCqCloudconfigCoreImplConf comAdobeCqCloudconfigCoreImplConfigurationReplicationEventHandleProperties4 = new OASComAdobeCqCloudconfigCoreImplConf();

        System.assert(comAdobeCqCloudconfigCoreImplConfigurationReplicationEventHandleProperties1.equals(comAdobeCqCloudconfigCoreImplConfigurationReplicationEventHandleProperties2));
        System.assert(comAdobeCqCloudconfigCoreImplConfigurationReplicationEventHandleProperties3.equals(comAdobeCqCloudconfigCoreImplConfigurationReplicationEventHandleProperties4));
        System.assertEquals(comAdobeCqCloudconfigCoreImplConfigurationReplicationEventHandleProperties1.hashCode(), comAdobeCqCloudconfigCoreImplConfigurationReplicationEventHandleProperties2.hashCode());
        System.assertEquals(comAdobeCqCloudconfigCoreImplConfigurationReplicationEventHandleProperties3.hashCode(), comAdobeCqCloudconfigCoreImplConfigurationReplicationEventHandleProperties4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASComAdobeCqCloudconfigCoreImplConf comAdobeCqCloudconfigCoreImplConfigurationReplicationEventHandleProperties = new OASComAdobeCqCloudconfigCoreImplConf();
        Map<String, String> propertyMappings = comAdobeCqCloudconfigCoreImplConfigurationReplicationEventHandleProperties.getPropertyMappings();
        System.assertEquals('flushAgents', propertyMappings.get('flush.agents'));
    }
}
