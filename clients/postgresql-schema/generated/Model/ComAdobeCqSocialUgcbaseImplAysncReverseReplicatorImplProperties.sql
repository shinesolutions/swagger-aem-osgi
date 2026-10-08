--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comAdobeCqSocialUgcbaseImplAysncReverseReplicatorImplProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_adobe_cq_social_ugcbase_impl_aysnc_reverse_replicator_impl_'
--
SELECT pool_size, max_pool_size, queue_size, keep_alive_time FROM com_adobe_cq_social_ugcbase_impl_aysnc_reverse_replicator_impl_ WHERE 1=1;

--
-- INSERT template for table 'com_adobe_cq_social_ugcbase_impl_aysnc_reverse_replicator_impl_'
--
INSERT INTO com_adobe_cq_social_ugcbase_impl_aysnc_reverse_replicator_impl_ (pool_size, max_pool_size, queue_size, keep_alive_time) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table 'com_adobe_cq_social_ugcbase_impl_aysnc_reverse_replicator_impl_'
--
UPDATE com_adobe_cq_social_ugcbase_impl_aysnc_reverse_replicator_impl_ SET pool_size = ?, max_pool_size = ?, queue_size = ?, keep_alive_time = ? WHERE 1=2;

--
-- DELETE template for table 'com_adobe_cq_social_ugcbase_impl_aysnc_reverse_replicator_impl_'
--
DELETE FROM com_adobe_cq_social_ugcbase_impl_aysnc_reverse_replicator_impl_ WHERE 1=2;

