@isTest
private class OASOrgApacheSlingDistributionAgentImTest {
    @isTest
    private static void equalsSameInstance() {
        OASOrgApacheSlingDistributionAgentIm orgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryProperties1 = OASOrgApacheSlingDistributionAgentIm.getExample();
        OASOrgApacheSlingDistributionAgentIm orgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryProperties2 = orgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryProperties1;
        OASOrgApacheSlingDistributionAgentIm orgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryProperties3 = new OASOrgApacheSlingDistributionAgentIm();
        OASOrgApacheSlingDistributionAgentIm orgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryProperties4 = orgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryProperties3;

        System.assert(orgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryProperties1.equals(orgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryProperties2));
        System.assert(orgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryProperties2.equals(orgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryProperties1));
        System.assert(orgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryProperties1.equals(orgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryProperties1));
        System.assert(orgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryProperties3.equals(orgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryProperties4));
        System.assert(orgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryProperties4.equals(orgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryProperties3));
        System.assert(orgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryProperties3.equals(orgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASOrgApacheSlingDistributionAgentIm orgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryProperties1 = OASOrgApacheSlingDistributionAgentIm.getExample();
        OASOrgApacheSlingDistributionAgentIm orgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryProperties2 = OASOrgApacheSlingDistributionAgentIm.getExample();
        OASOrgApacheSlingDistributionAgentIm orgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryProperties3 = new OASOrgApacheSlingDistributionAgentIm();
        OASOrgApacheSlingDistributionAgentIm orgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryProperties4 = new OASOrgApacheSlingDistributionAgentIm();

        System.assert(orgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryProperties1.equals(orgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryProperties2));
        System.assert(orgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryProperties2.equals(orgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryProperties1));
        System.assert(orgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryProperties3.equals(orgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryProperties4));
        System.assert(orgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryProperties4.equals(orgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASOrgApacheSlingDistributionAgentIm orgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryProperties1 = OASOrgApacheSlingDistributionAgentIm.getExample();
        OASOrgApacheSlingDistributionAgentIm orgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryProperties2 = new OASOrgApacheSlingDistributionAgentIm();

        System.assertEquals(false, orgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryProperties1.equals('foo'));
        System.assertEquals(false, orgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASOrgApacheSlingDistributionAgentIm orgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryProperties1 = OASOrgApacheSlingDistributionAgentIm.getExample();
        OASOrgApacheSlingDistributionAgentIm orgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryProperties2 = new OASOrgApacheSlingDistributionAgentIm();
        OASOrgApacheSlingDistributionAgentIm orgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryProperties3;

        System.assertEquals(false, orgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryProperties1.equals(orgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryProperties3));
        System.assertEquals(false, orgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryProperties2.equals(orgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASOrgApacheSlingDistributionAgentIm orgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryProperties1 = OASOrgApacheSlingDistributionAgentIm.getExample();
        OASOrgApacheSlingDistributionAgentIm orgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryProperties2 = new OASOrgApacheSlingDistributionAgentIm();

        System.assertEquals(orgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryProperties1.hashCode(), orgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryProperties1.hashCode());
        System.assertEquals(orgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryProperties2.hashCode(), orgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASOrgApacheSlingDistributionAgentIm orgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryProperties1 = OASOrgApacheSlingDistributionAgentIm.getExample();
        OASOrgApacheSlingDistributionAgentIm orgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryProperties2 = OASOrgApacheSlingDistributionAgentIm.getExample();
        OASOrgApacheSlingDistributionAgentIm orgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryProperties3 = new OASOrgApacheSlingDistributionAgentIm();
        OASOrgApacheSlingDistributionAgentIm orgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryProperties4 = new OASOrgApacheSlingDistributionAgentIm();

        System.assert(orgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryProperties1.equals(orgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryProperties2));
        System.assert(orgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryProperties3.equals(orgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryProperties4));
        System.assertEquals(orgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryProperties1.hashCode(), orgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryProperties2.hashCode());
        System.assertEquals(orgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryProperties3.hashCode(), orgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryProperties4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASOrgApacheSlingDistributionAgentIm orgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryProperties = new OASOrgApacheSlingDistributionAgentIm();
        Map<String, String> propertyMappings = orgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryProperties.getPropertyMappings();
        System.assertEquals('logLevel', propertyMappings.get('log.level'));
        System.assertEquals('queueProcessingEnabled', propertyMappings.get('queue.processing.enabled'));
        System.assertEquals('packageExporterEndpoints', propertyMappings.get('packageExporter.endpoints'));
        System.assertEquals('packageImporterEndpoints', propertyMappings.get('packageImporter.endpoints'));
        System.assertEquals('retryStrategy', propertyMappings.get('retry.strategy'));
        System.assertEquals('retryAttempts', propertyMappings.get('retry.attempts'));
        System.assertEquals('pullItems', propertyMappings.get('pull.items'));
        System.assertEquals('httpConnTimeout', propertyMappings.get('http.conn.timeout'));
        System.assertEquals('requestAuthorizationStrategyTarget', propertyMappings.get('requestAuthorizationStrategy.target'));
        System.assertEquals('transportSecretProviderTarget', propertyMappings.get('transportSecretProvider.target'));
        System.assertEquals('packageBuilderTarget', propertyMappings.get('packageBuilder.target'));
        System.assertEquals('triggersTarget', propertyMappings.get('triggers.target'));
    }
}
