--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties' definition.
--


--
-- SELECT template for table `comAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties`
--
SELECT `service.ranking`, `global.size`, `max.disk.usage`, `persistence.enabled`, `thread.pool.max.size`, `scheduled.thread.pool.max.size`, `graceful.shutdown.timeout`, `queues`, `topics`, `addresses.max.delivery.attempts`, `addresses.expiry.delay`, `addresses.address.full.message.policy`, `addresses.max.size.bytes`, `addresses.page.size.bytes`, `addresses.page.cache.max.size`, `cluster.user`, `cluster.password`, `cluster.call.timeout`, `cluster.call.failover.timeout`, `cluster.client.failure.check.period`, `cluster.notification.attempts`, `cluster.notification.interval`, `id.cache.size`, `cluster.confirmation.window.size`, `cluster.connection.ttl`, `cluster.duplicate.detection`, `cluster.initial.connect.attempts`, `cluster.max.retry.interval`, `cluster.min.large.message.size`, `cluster.producer.window.size`, `cluster.reconnect.attempts`, `cluster.retry.interval`, `cluster.retry.interval.multiplier` FROM `comAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties` WHERE 1;

--
-- INSERT template for table `comAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties`
--
INSERT INTO `comAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties`(`service.ranking`, `global.size`, `max.disk.usage`, `persistence.enabled`, `thread.pool.max.size`, `scheduled.thread.pool.max.size`, `graceful.shutdown.timeout`, `queues`, `topics`, `addresses.max.delivery.attempts`, `addresses.expiry.delay`, `addresses.address.full.message.policy`, `addresses.max.size.bytes`, `addresses.page.size.bytes`, `addresses.page.cache.max.size`, `cluster.user`, `cluster.password`, `cluster.call.timeout`, `cluster.call.failover.timeout`, `cluster.client.failure.check.period`, `cluster.notification.attempts`, `cluster.notification.interval`, `id.cache.size`, `cluster.confirmation.window.size`, `cluster.connection.ttl`, `cluster.duplicate.detection`, `cluster.initial.connect.attempts`, `cluster.max.retry.interval`, `cluster.min.large.message.size`, `cluster.producer.window.size`, `cluster.reconnect.attempts`, `cluster.retry.interval`, `cluster.retry.interval.multiplier`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `comAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties`
--
UPDATE `comAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties` SET `service.ranking` = ?, `global.size` = ?, `max.disk.usage` = ?, `persistence.enabled` = ?, `thread.pool.max.size` = ?, `scheduled.thread.pool.max.size` = ?, `graceful.shutdown.timeout` = ?, `queues` = ?, `topics` = ?, `addresses.max.delivery.attempts` = ?, `addresses.expiry.delay` = ?, `addresses.address.full.message.policy` = ?, `addresses.max.size.bytes` = ?, `addresses.page.size.bytes` = ?, `addresses.page.cache.max.size` = ?, `cluster.user` = ?, `cluster.password` = ?, `cluster.call.timeout` = ?, `cluster.call.failover.timeout` = ?, `cluster.client.failure.check.period` = ?, `cluster.notification.attempts` = ?, `cluster.notification.interval` = ?, `id.cache.size` = ?, `cluster.confirmation.window.size` = ?, `cluster.connection.ttl` = ?, `cluster.duplicate.detection` = ?, `cluster.initial.connect.attempts` = ?, `cluster.max.retry.interval` = ?, `cluster.min.large.message.size` = ?, `cluster.producer.window.size` = ?, `cluster.reconnect.attempts` = ?, `cluster.retry.interval` = ?, `cluster.retry.interval.multiplier` = ? WHERE 1;

--
-- DELETE template for table `comAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties`
--
DELETE FROM `comAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties` WHERE 0;

