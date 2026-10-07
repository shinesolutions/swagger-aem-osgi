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
        Map<String, String> x-property-mappings = comAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties.getx-property-mappings();
        System.assertEquals('serviceRanking', x-property-mappings.get('service.ranking'));
        System.assertEquals('globalSize', x-property-mappings.get('global.size'));
        System.assertEquals('maxDiskUsage', x-property-mappings.get('max.disk.usage'));
        System.assertEquals('persistenceEnabled', x-property-mappings.get('persistence.enabled'));
        System.assertEquals('threadPoolMaxSize', x-property-mappings.get('thread.pool.max.size'));
        System.assertEquals('scheduledThreadPoolMaxSize', x-property-mappings.get('scheduled.thread.pool.max.size'));
        System.assertEquals('gracefulShutdownTimeout', x-property-mappings.get('graceful.shutdown.timeout'));
        System.assertEquals('addressesMaxDeliveryAttempts', x-property-mappings.get('addresses.max.delivery.attempts'));
        System.assertEquals('addressesExpiryDelay', x-property-mappings.get('addresses.expiry.delay'));
        System.assertEquals('addressesAddressFullMessagePolicy', x-property-mappings.get('addresses.address.full.message.policy'));
        System.assertEquals('addressesMaxSizeBytes', x-property-mappings.get('addresses.max.size.bytes'));
        System.assertEquals('addressesPageSizeBytes', x-property-mappings.get('addresses.page.size.bytes'));
        System.assertEquals('addressesPageCacheMaxSize', x-property-mappings.get('addresses.page.cache.max.size'));
        System.assertEquals('clusterUser', x-property-mappings.get('cluster.user'));
        System.assertEquals('clusterPassword', x-property-mappings.get('cluster.password'));
        System.assertEquals('clusterCallTimeout', x-property-mappings.get('cluster.call.timeout'));
        System.assertEquals('clusterCallFailoverTimeout', x-property-mappings.get('cluster.call.failover.timeout'));
        System.assertEquals('clusterClientFailureCheckPeriod', x-property-mappings.get('cluster.client.failure.check.period'));
        System.assertEquals('clusterNotificationAttempts', x-property-mappings.get('cluster.notification.attempts'));
        System.assertEquals('clusterNotificationInterval', x-property-mappings.get('cluster.notification.interval'));
        System.assertEquals('idCacheSize', x-property-mappings.get('id.cache.size'));
        System.assertEquals('clusterConfirmationWindowSize', x-property-mappings.get('cluster.confirmation.window.size'));
        System.assertEquals('clusterConnectionTtl', x-property-mappings.get('cluster.connection.ttl'));
        System.assertEquals('clusterDuplicateDetection', x-property-mappings.get('cluster.duplicate.detection'));
        System.assertEquals('clusterInitialConnectAttempts', x-property-mappings.get('cluster.initial.connect.attempts'));
        System.assertEquals('clusterMaxRetryInterval', x-property-mappings.get('cluster.max.retry.interval'));
        System.assertEquals('clusterMinLargeMessageSize', x-property-mappings.get('cluster.min.large.message.size'));
        System.assertEquals('clusterProducerWindowSize', x-property-mappings.get('cluster.producer.window.size'));
        System.assertEquals('clusterReconnectAttempts', x-property-mappings.get('cluster.reconnect.attempts'));
        System.assertEquals('clusterRetryInterval', x-property-mappings.get('cluster.retry.interval'));
        System.assertEquals('clusterRetryIntervalMultiplier', x-property-mappings.get('cluster.retry.interval.multiplier'));
    }
}
