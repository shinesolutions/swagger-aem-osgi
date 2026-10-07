--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comAdobeCqCdnRewriterImplCDNRewriterProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_adobe_cq_cdn_rewriter_impl_cdn_rewriter_properties'
--
SELECT service/ranking, cdnrewriter/attributes, cdn/rewriter/distribution/domain FROM com_adobe_cq_cdn_rewriter_impl_cdn_rewriter_properties WHERE 1=1;

--
-- INSERT template for table 'com_adobe_cq_cdn_rewriter_impl_cdn_rewriter_properties'
--
INSERT INTO com_adobe_cq_cdn_rewriter_impl_cdn_rewriter_properties (service/ranking, cdnrewriter/attributes, cdn/rewriter/distribution/domain) VALUES (?, ?, ?);

--
-- UPDATE template for table 'com_adobe_cq_cdn_rewriter_impl_cdn_rewriter_properties'
--
UPDATE com_adobe_cq_cdn_rewriter_impl_cdn_rewriter_properties SET service/ranking = ?, cdnrewriter/attributes = ?, cdn/rewriter/distribution/domain = ? WHERE 1=2;

--
-- DELETE template for table 'com_adobe_cq_cdn_rewriter_impl_cdn_rewriter_properties'
--
DELETE FROM com_adobe_cq_cdn_rewriter_impl_cdn_rewriter_properties WHERE 1=2;

