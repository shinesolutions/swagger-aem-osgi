--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comAdobeCqSocialUgcbaseDispatcherImplFlushServiceImplProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_adobe_cq_social_ugcbase_dispatcher_impl_flush_service_impl_'
--
SELECT thread_pool_size, delay_time, worker_sleep_time FROM com_adobe_cq_social_ugcbase_dispatcher_impl_flush_service_impl_ WHERE 1=1;

--
-- INSERT template for table 'com_adobe_cq_social_ugcbase_dispatcher_impl_flush_service_impl_'
--
INSERT INTO com_adobe_cq_social_ugcbase_dispatcher_impl_flush_service_impl_ (thread_pool_size, delay_time, worker_sleep_time) VALUES (?, ?, ?);

--
-- UPDATE template for table 'com_adobe_cq_social_ugcbase_dispatcher_impl_flush_service_impl_'
--
UPDATE com_adobe_cq_social_ugcbase_dispatcher_impl_flush_service_impl_ SET thread_pool_size = ?, delay_time = ?, worker_sleep_time = ? WHERE 1=2;

--
-- DELETE template for table 'com_adobe_cq_social_ugcbase_dispatcher_impl_flush_service_impl_'
--
DELETE FROM com_adobe_cq_social_ugcbase_dispatcher_impl_flush_service_impl_ WHERE 1=2;

