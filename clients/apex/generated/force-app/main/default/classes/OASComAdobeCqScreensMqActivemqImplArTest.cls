@isTest
private class OASComAdobeCqScreensMqActivemqImplArTest {
    @isTest
    private static void equalsSameInstance() {
        OASComAdobeCqScreensMqActivemqImplAr comAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties1 = OASComAdobeCqScreensMqActivemqImplAr.getExample();
        OASComAdobeCqScreensMqActivemqImplAr comAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties2 = comAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties1;
        OASComAdobeCqScreensMqActivemqImplAr comAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties3 = new OASComAdobeCqScreensMqActivemqImplAr();
        OASComAdobeCqScreensMqActivemqImplAr comAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties4 = comAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties3;

        System.assert(comAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties1.equals(comAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties2));
        System.assert(comAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties2.equals(comAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties1));
        System.assert(comAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties1.equals(comAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties1));
        System.assert(comAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties3.equals(comAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties4));
        System.assert(comAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties4.equals(comAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties3));
        System.assert(comAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties3.equals(comAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASComAdobeCqScreensMqActivemqImplAr comAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties1 = OASComAdobeCqScreensMqActivemqImplAr.getExample();
        OASComAdobeCqScreensMqActivemqImplAr comAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties2 = OASComAdobeCqScreensMqActivemqImplAr.getExample();
        OASComAdobeCqScreensMqActivemqImplAr comAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties3 = new OASComAdobeCqScreensMqActivemqImplAr();
        OASComAdobeCqScreensMqActivemqImplAr comAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties4 = new OASComAdobeCqScreensMqActivemqImplAr();

        System.assert(comAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties1.equals(comAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties2));
        System.assert(comAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties2.equals(comAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties1));
        System.assert(comAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties3.equals(comAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties4));
        System.assert(comAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties4.equals(comAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASComAdobeCqScreensMqActivemqImplAr comAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties1 = OASComAdobeCqScreensMqActivemqImplAr.getExample();
        OASComAdobeCqScreensMqActivemqImplAr comAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties2 = new OASComAdobeCqScreensMqActivemqImplAr();

        System.assertEquals(false, comAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties1.equals('foo'));
        System.assertEquals(false, comAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASComAdobeCqScreensMqActivemqImplAr comAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties1 = OASComAdobeCqScreensMqActivemqImplAr.getExample();
        OASComAdobeCqScreensMqActivemqImplAr comAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties2 = new OASComAdobeCqScreensMqActivemqImplAr();
        OASComAdobeCqScreensMqActivemqImplAr comAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties3;

        System.assertEquals(false, comAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties1.equals(comAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties3));
        System.assertEquals(false, comAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties2.equals(comAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASComAdobeCqScreensMqActivemqImplAr comAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties1 = OASComAdobeCqScreensMqActivemqImplAr.getExample();
        OASComAdobeCqScreensMqActivemqImplAr comAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties2 = new OASComAdobeCqScreensMqActivemqImplAr();

        System.assertEquals(comAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties1.hashCode(), comAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties1.hashCode());
        System.assertEquals(comAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties2.hashCode(), comAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASComAdobeCqScreensMqActivemqImplAr comAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties1 = OASComAdobeCqScreensMqActivemqImplAr.getExample();
        OASComAdobeCqScreensMqActivemqImplAr comAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties2 = OASComAdobeCqScreensMqActivemqImplAr.getExample();
        OASComAdobeCqScreensMqActivemqImplAr comAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties3 = new OASComAdobeCqScreensMqActivemqImplAr();
        OASComAdobeCqScreensMqActivemqImplAr comAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties4 = new OASComAdobeCqScreensMqActivemqImplAr();

        System.assert(comAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties1.equals(comAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties2));
        System.assert(comAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties3.equals(comAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties4));
        System.assertEquals(comAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties1.hashCode(), comAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties2.hashCode());
        System.assertEquals(comAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties3.hashCode(), comAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASComAdobeCqScreensMqActivemqImplAr comAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties = new OASComAdobeCqScreensMqActivemqImplAr();
        Map<String, String> propertyMappings = comAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties.getPropertyMappings();
        System.assertEquals('serviceRanking', propertyMappings.get('service.ranking'));
        System.assertEquals('globalSize', propertyMappings.get('global.size'));
        System.assertEquals('maxDiskUsage', propertyMappings.get('max.disk.usage'));
        System.assertEquals('persistenceEnabled', propertyMappings.get('persistence.enabled'));
        System.assertEquals('threadPoolMaxSize', propertyMappings.get('thread.pool.max.size'));
        System.assertEquals('scheduledThreadPoolMaxSize', propertyMappings.get('scheduled.thread.pool.max.size'));
        System.assertEquals('gracefulShutdownTimeout', propertyMappings.get('graceful.shutdown.timeout'));
        System.assertEquals('addressesMaxDeliveryAttempts', propertyMappings.get('addresses.max.delivery.attempts'));
        System.assertEquals('addressesExpiryDelay', propertyMappings.get('addresses.expiry.delay'));
        System.assertEquals('addressesAddressFullMessagePolicy', propertyMappings.get('addresses.address.full.message.policy'));
        System.assertEquals('addressesMaxSizeBytes', propertyMappings.get('addresses.max.size.bytes'));
        System.assertEquals('addressesPageSizeBytes', propertyMappings.get('addresses.page.size.bytes'));
        System.assertEquals('addressesPageCacheMaxSize', propertyMappings.get('addresses.page.cache.max.size'));
        System.assertEquals('clusterUser', propertyMappings.get('cluster.user'));
        System.assertEquals('clusterPassword', propertyMappings.get('cluster.password'));
        System.assertEquals('clusterCallTimeout', propertyMappings.get('cluster.call.timeout'));
        System.assertEquals('clusterCallFailoverTimeout', propertyMappings.get('cluster.call.failover.timeout'));
        System.assertEquals('clusterClientFailureCheckPeriod', propertyMappings.get('cluster.client.failure.check.period'));
        System.assertEquals('clusterNotificationAttempts', propertyMappings.get('cluster.notification.attempts'));
        System.assertEquals('clusterNotificationInterval', propertyMappings.get('cluster.notification.interval'));
        System.assertEquals('idCacheSize', propertyMappings.get('id.cache.size'));
        System.assertEquals('clusterConfirmationWindowSize', propertyMappings.get('cluster.confirmation.window.size'));
        System.assertEquals('clusterConnectionTtl', propertyMappings.get('cluster.connection.ttl'));
        System.assertEquals('clusterDuplicateDetection', propertyMappings.get('cluster.duplicate.detection'));
        System.assertEquals('clusterInitialConnectAttempts', propertyMappings.get('cluster.initial.connect.attempts'));
        System.assertEquals('clusterMaxRetryInterval', propertyMappings.get('cluster.max.retry.interval'));
        System.assertEquals('clusterMinLargeMessageSize', propertyMappings.get('cluster.min.large.message.size'));
        System.assertEquals('clusterProducerWindowSize', propertyMappings.get('cluster.producer.window.size'));
        System.assertEquals('clusterReconnectAttempts', propertyMappings.get('cluster.reconnect.attempts'));
        System.assertEquals('clusterRetryInterval', propertyMappings.get('cluster.retry.interval'));
        System.assertEquals('clusterRetryIntervalMultiplier', propertyMappings.get('cluster.retry.interval.multiplier'));
    }
}
