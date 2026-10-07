--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comAdobeCqCdnRewriterImplCDNConfigServiceImplProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_adobe_cq_cdn_rewriter_impl_cdn_config_service_impl_properti'
--
SELECT cdn/config/distribution/domain, cdn/config/enable/rewriting, cdn/config/path/prefixes, cdn/config/cdnttl, cdn/config/application/protocol FROM com_adobe_cq_cdn_rewriter_impl_cdn_config_service_impl_properti WHERE 1=1;

--
-- INSERT template for table 'com_adobe_cq_cdn_rewriter_impl_cdn_config_service_impl_properti'
--
INSERT INTO com_adobe_cq_cdn_rewriter_impl_cdn_config_service_impl_properti (cdn/config/distribution/domain, cdn/config/enable/rewriting, cdn/config/path/prefixes, cdn/config/cdnttl, cdn/config/application/protocol) VALUES (?, ?, ?, ?, ?);

--
-- UPDATE template for table 'com_adobe_cq_cdn_rewriter_impl_cdn_config_service_impl_properti'
--
UPDATE com_adobe_cq_cdn_rewriter_impl_cdn_config_service_impl_properti SET cdn/config/distribution/domain = ?, cdn/config/enable/rewriting = ?, cdn/config/path/prefixes = ?, cdn/config/cdnttl = ?, cdn/config/application/protocol = ? WHERE 1=2;

--
-- DELETE template for table 'com_adobe_cq_cdn_rewriter_impl_cdn_config_service_impl_properti'
--
DELETE FROM com_adobe_cq_cdn_rewriter_impl_cdn_config_service_impl_properti WHERE 1=2;

