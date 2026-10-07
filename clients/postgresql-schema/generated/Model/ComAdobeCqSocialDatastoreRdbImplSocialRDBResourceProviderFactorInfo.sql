--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comAdobeCqSocialDatastoreRdbImplSocialRDBResourceProviderFactorInfo' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_adobe_cq_social_datastore_rdb_impl_social_rdb_resource_prov'
--
SELECT pid, title, description, properties FROM com_adobe_cq_social_datastore_rdb_impl_social_rdb_resource_prov WHERE 1=1;

--
-- INSERT template for table 'com_adobe_cq_social_datastore_rdb_impl_social_rdb_resource_prov'
--
INSERT INTO com_adobe_cq_social_datastore_rdb_impl_social_rdb_resource_prov (pid, title, description, properties) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table 'com_adobe_cq_social_datastore_rdb_impl_social_rdb_resource_prov'
--
UPDATE com_adobe_cq_social_datastore_rdb_impl_social_rdb_resource_prov SET pid = ?, title = ?, description = ?, properties = ? WHERE 1=2;

--
-- DELETE template for table 'com_adobe_cq_social_datastore_rdb_impl_social_rdb_resource_prov'
--
DELETE FROM com_adobe_cq_social_datastore_rdb_impl_social_rdb_resource_prov WHERE 1=2;

