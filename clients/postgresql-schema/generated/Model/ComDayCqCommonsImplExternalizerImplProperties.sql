--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comDayCqCommonsImplExternalizerImplProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_day_cq_commons_impl_externalizer_impl_properties'
--
SELECT externalizer/domains, externalizer/host, externalizer/contextpath, externalizer/encodedpath FROM com_day_cq_commons_impl_externalizer_impl_properties WHERE 1=1;

--
-- INSERT template for table 'com_day_cq_commons_impl_externalizer_impl_properties'
--
INSERT INTO com_day_cq_commons_impl_externalizer_impl_properties (externalizer/domains, externalizer/host, externalizer/contextpath, externalizer/encodedpath) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table 'com_day_cq_commons_impl_externalizer_impl_properties'
--
UPDATE com_day_cq_commons_impl_externalizer_impl_properties SET externalizer/domains = ?, externalizer/host = ?, externalizer/contextpath = ?, externalizer/encodedpath = ? WHERE 1=2;

--
-- DELETE template for table 'com_day_cq_commons_impl_externalizer_impl_properties'
--
DELETE FROM com_day_cq_commons_impl_externalizer_impl_properties WHERE 1=2;

