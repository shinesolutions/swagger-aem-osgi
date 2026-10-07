--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comAdobeCqDamIpsImplReplicationTriggerReplicateOnModifyWorkerProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_adobe_cq_dam_ips_impl_replication_trigger_replicate_on_modi'
--
SELECT dmreplicateonmodify/enabled, dmreplicateonmodify/forcesyncdeletes FROM com_adobe_cq_dam_ips_impl_replication_trigger_replicate_on_modi WHERE 1=1;

--
-- INSERT template for table 'com_adobe_cq_dam_ips_impl_replication_trigger_replicate_on_modi'
--
INSERT INTO com_adobe_cq_dam_ips_impl_replication_trigger_replicate_on_modi (dmreplicateonmodify/enabled, dmreplicateonmodify/forcesyncdeletes) VALUES (?, ?);

--
-- UPDATE template for table 'com_adobe_cq_dam_ips_impl_replication_trigger_replicate_on_modi'
--
UPDATE com_adobe_cq_dam_ips_impl_replication_trigger_replicate_on_modi SET dmreplicateonmodify/enabled = ?, dmreplicateonmodify/forcesyncdeletes = ? WHERE 1=2;

--
-- DELETE template for table 'com_adobe_cq_dam_ips_impl_replication_trigger_replicate_on_modi'
--
DELETE FROM com_adobe_cq_dam_ips_impl_replication_trigger_replicate_on_modi WHERE 1=2;

