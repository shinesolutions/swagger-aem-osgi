--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_adobe_cq_screens_mq_activemq_impl_artemis_jms_provider_prop'
--
SELECT service/ranking, global/size, max/disk/usage, persistence/enabled, thread/pool/max/size, scheduled/thread/pool/max/size, graceful/shutdown/timeout, queues, topics, addresses/max/delivery/attempts, addresses/expiry/delay, addresses/address/full/message/policy, addresses/max/size/bytes, addresses/page/size/bytes, addresses/page/cache/max/size, cluster/user, cluster/password, cluster/call/timeout, cluster/call/failover/timeout, cluster/client/failure/check/period, cluster/notification/attempts, cluster/notification/interval, id/cache/size, cluster/confirmation/window/size, cluster/connection/ttl, cluster/duplicate/detection, cluster/initial/connect/attempts, cluster/max/retry/interval, cluster/min/large/message/size, cluster/producer/window/size, cluster/reconnect/attempts, cluster/retry/interval, cluster/retry/interval/multiplier FROM com_adobe_cq_screens_mq_activemq_impl_artemis_jms_provider_prop WHERE 1=1;

--
-- INSERT template for table 'com_adobe_cq_screens_mq_activemq_impl_artemis_jms_provider_prop'
--
INSERT INTO com_adobe_cq_screens_mq_activemq_impl_artemis_jms_provider_prop (service/ranking, global/size, max/disk/usage, persistence/enabled, thread/pool/max/size, scheduled/thread/pool/max/size, graceful/shutdown/timeout, queues, topics, addresses/max/delivery/attempts, addresses/expiry/delay, addresses/address/full/message/policy, addresses/max/size/bytes, addresses/page/size/bytes, addresses/page/cache/max/size, cluster/user, cluster/password, cluster/call/timeout, cluster/call/failover/timeout, cluster/client/failure/check/period, cluster/notification/attempts, cluster/notification/interval, id/cache/size, cluster/confirmation/window/size, cluster/connection/ttl, cluster/duplicate/detection, cluster/initial/connect/attempts, cluster/max/retry/interval, cluster/min/large/message/size, cluster/producer/window/size, cluster/reconnect/attempts, cluster/retry/interval, cluster/retry/interval/multiplier) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table 'com_adobe_cq_screens_mq_activemq_impl_artemis_jms_provider_prop'
--
UPDATE com_adobe_cq_screens_mq_activemq_impl_artemis_jms_provider_prop SET service/ranking = ?, global/size = ?, max/disk/usage = ?, persistence/enabled = ?, thread/pool/max/size = ?, scheduled/thread/pool/max/size = ?, graceful/shutdown/timeout = ?, queues = ?, topics = ?, addresses/max/delivery/attempts = ?, addresses/expiry/delay = ?, addresses/address/full/message/policy = ?, addresses/max/size/bytes = ?, addresses/page/size/bytes = ?, addresses/page/cache/max/size = ?, cluster/user = ?, cluster/password = ?, cluster/call/timeout = ?, cluster/call/failover/timeout = ?, cluster/client/failure/check/period = ?, cluster/notification/attempts = ?, cluster/notification/interval = ?, id/cache/size = ?, cluster/confirmation/window/size = ?, cluster/connection/ttl = ?, cluster/duplicate/detection = ?, cluster/initial/connect/attempts = ?, cluster/max/retry/interval = ?, cluster/min/large/message/size = ?, cluster/producer/window/size = ?, cluster/reconnect/attempts = ?, cluster/retry/interval = ?, cluster/retry/interval/multiplier = ? WHERE 1=2;

--
-- DELETE template for table 'com_adobe_cq_screens_mq_activemq_impl_artemis_jms_provider_prop'
--
DELETE FROM com_adobe_cq_screens_mq_activemq_impl_artemis_jms_provider_prop WHERE 1=2;

