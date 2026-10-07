--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comAdobeCqSocialSrpImplSocialSolrConnectorProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_adobe_cq_social_srp_impl_social_solr_connector_properties'
--
SELECT srp/type FROM com_adobe_cq_social_srp_impl_social_solr_connector_properties WHERE 1=1;

--
-- INSERT template for table 'com_adobe_cq_social_srp_impl_social_solr_connector_properties'
--
INSERT INTO com_adobe_cq_social_srp_impl_social_solr_connector_properties (srp/type) VALUES (?);

--
-- UPDATE template for table 'com_adobe_cq_social_srp_impl_social_solr_connector_properties'
--
UPDATE com_adobe_cq_social_srp_impl_social_solr_connector_properties SET srp/type = ? WHERE 1=2;

--
-- DELETE template for table 'com_adobe_cq_social_srp_impl_social_solr_connector_properties'
--
DELETE FROM com_adobe_cq_social_srp_impl_social_solr_connector_properties WHERE 1=2;

