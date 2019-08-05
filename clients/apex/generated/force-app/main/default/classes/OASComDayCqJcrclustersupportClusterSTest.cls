@isTest
private class OASComDayCqJcrclustersupportClusterSTest {
    @isTest
    private static void equalsSameInstance() {
        OASComDayCqJcrclustersupportClusterS comDayCqJcrclustersupportClusterStartLevelControllerProperties1 = OASComDayCqJcrclustersupportClusterS.getExample();
        OASComDayCqJcrclustersupportClusterS comDayCqJcrclustersupportClusterStartLevelControllerProperties2 = comDayCqJcrclustersupportClusterStartLevelControllerProperties1;
        OASComDayCqJcrclustersupportClusterS comDayCqJcrclustersupportClusterStartLevelControllerProperties3 = new OASComDayCqJcrclustersupportClusterS();
        OASComDayCqJcrclustersupportClusterS comDayCqJcrclustersupportClusterStartLevelControllerProperties4 = comDayCqJcrclustersupportClusterStartLevelControllerProperties3;

        System.assert(comDayCqJcrclustersupportClusterStartLevelControllerProperties1.equals(comDayCqJcrclustersupportClusterStartLevelControllerProperties2));
        System.assert(comDayCqJcrclustersupportClusterStartLevelControllerProperties2.equals(comDayCqJcrclustersupportClusterStartLevelControllerProperties1));
        System.assert(comDayCqJcrclustersupportClusterStartLevelControllerProperties1.equals(comDayCqJcrclustersupportClusterStartLevelControllerProperties1));
        System.assert(comDayCqJcrclustersupportClusterStartLevelControllerProperties3.equals(comDayCqJcrclustersupportClusterStartLevelControllerProperties4));
        System.assert(comDayCqJcrclustersupportClusterStartLevelControllerProperties4.equals(comDayCqJcrclustersupportClusterStartLevelControllerProperties3));
        System.assert(comDayCqJcrclustersupportClusterStartLevelControllerProperties3.equals(comDayCqJcrclustersupportClusterStartLevelControllerProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASComDayCqJcrclustersupportClusterS comDayCqJcrclustersupportClusterStartLevelControllerProperties1 = OASComDayCqJcrclustersupportClusterS.getExample();
        OASComDayCqJcrclustersupportClusterS comDayCqJcrclustersupportClusterStartLevelControllerProperties2 = OASComDayCqJcrclustersupportClusterS.getExample();
        OASComDayCqJcrclustersupportClusterS comDayCqJcrclustersupportClusterStartLevelControllerProperties3 = new OASComDayCqJcrclustersupportClusterS();
        OASComDayCqJcrclustersupportClusterS comDayCqJcrclustersupportClusterStartLevelControllerProperties4 = new OASComDayCqJcrclustersupportClusterS();

        System.assert(comDayCqJcrclustersupportClusterStartLevelControllerProperties1.equals(comDayCqJcrclustersupportClusterStartLevelControllerProperties2));
        System.assert(comDayCqJcrclustersupportClusterStartLevelControllerProperties2.equals(comDayCqJcrclustersupportClusterStartLevelControllerProperties1));
        System.assert(comDayCqJcrclustersupportClusterStartLevelControllerProperties3.equals(comDayCqJcrclustersupportClusterStartLevelControllerProperties4));
        System.assert(comDayCqJcrclustersupportClusterStartLevelControllerProperties4.equals(comDayCqJcrclustersupportClusterStartLevelControllerProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASComDayCqJcrclustersupportClusterS comDayCqJcrclustersupportClusterStartLevelControllerProperties1 = OASComDayCqJcrclustersupportClusterS.getExample();
        OASComDayCqJcrclustersupportClusterS comDayCqJcrclustersupportClusterStartLevelControllerProperties2 = new OASComDayCqJcrclustersupportClusterS();

        System.assertEquals(false, comDayCqJcrclustersupportClusterStartLevelControllerProperties1.equals('foo'));
        System.assertEquals(false, comDayCqJcrclustersupportClusterStartLevelControllerProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASComDayCqJcrclustersupportClusterS comDayCqJcrclustersupportClusterStartLevelControllerProperties1 = OASComDayCqJcrclustersupportClusterS.getExample();
        OASComDayCqJcrclustersupportClusterS comDayCqJcrclustersupportClusterStartLevelControllerProperties2 = new OASComDayCqJcrclustersupportClusterS();
        OASComDayCqJcrclustersupportClusterS comDayCqJcrclustersupportClusterStartLevelControllerProperties3;

        System.assertEquals(false, comDayCqJcrclustersupportClusterStartLevelControllerProperties1.equals(comDayCqJcrclustersupportClusterStartLevelControllerProperties3));
        System.assertEquals(false, comDayCqJcrclustersupportClusterStartLevelControllerProperties2.equals(comDayCqJcrclustersupportClusterStartLevelControllerProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASComDayCqJcrclustersupportClusterS comDayCqJcrclustersupportClusterStartLevelControllerProperties1 = OASComDayCqJcrclustersupportClusterS.getExample();
        OASComDayCqJcrclustersupportClusterS comDayCqJcrclustersupportClusterStartLevelControllerProperties2 = new OASComDayCqJcrclustersupportClusterS();

        System.assertEquals(comDayCqJcrclustersupportClusterStartLevelControllerProperties1.hashCode(), comDayCqJcrclustersupportClusterStartLevelControllerProperties1.hashCode());
        System.assertEquals(comDayCqJcrclustersupportClusterStartLevelControllerProperties2.hashCode(), comDayCqJcrclustersupportClusterStartLevelControllerProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASComDayCqJcrclustersupportClusterS comDayCqJcrclustersupportClusterStartLevelControllerProperties1 = OASComDayCqJcrclustersupportClusterS.getExample();
        OASComDayCqJcrclustersupportClusterS comDayCqJcrclustersupportClusterStartLevelControllerProperties2 = OASComDayCqJcrclustersupportClusterS.getExample();
        OASComDayCqJcrclustersupportClusterS comDayCqJcrclustersupportClusterStartLevelControllerProperties3 = new OASComDayCqJcrclustersupportClusterS();
        OASComDayCqJcrclustersupportClusterS comDayCqJcrclustersupportClusterStartLevelControllerProperties4 = new OASComDayCqJcrclustersupportClusterS();

        System.assert(comDayCqJcrclustersupportClusterStartLevelControllerProperties1.equals(comDayCqJcrclustersupportClusterStartLevelControllerProperties2));
        System.assert(comDayCqJcrclustersupportClusterStartLevelControllerProperties3.equals(comDayCqJcrclustersupportClusterStartLevelControllerProperties4));
        System.assertEquals(comDayCqJcrclustersupportClusterStartLevelControllerProperties1.hashCode(), comDayCqJcrclustersupportClusterStartLevelControllerProperties2.hashCode());
        System.assertEquals(comDayCqJcrclustersupportClusterStartLevelControllerProperties3.hashCode(), comDayCqJcrclustersupportClusterStartLevelControllerProperties4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASComDayCqJcrclustersupportClusterS comDayCqJcrclustersupportClusterStartLevelControllerProperties = new OASComDayCqJcrclustersupportClusterS();
        Map<String, String> propertyMappings = comDayCqJcrclustersupportClusterStartLevelControllerProperties.getPropertyMappings();
        System.assertEquals('clusterLevelEnable', propertyMappings.get('cluster.level.enable'));
        System.assertEquals('clusterMasterLevel', propertyMappings.get('cluster.master.level'));
        System.assertEquals('clusterSlaveLevel', propertyMappings.get('cluster.slave.level'));
    }
}
