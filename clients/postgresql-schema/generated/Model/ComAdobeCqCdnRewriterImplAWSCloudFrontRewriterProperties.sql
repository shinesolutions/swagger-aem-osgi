--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comAdobeCqCdnRewriterImplAWSCloudFrontRewriterProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_adobe_cq_cdn_rewriter_impl_aws_cloud_front_rewriter_propert'
--
SELECT service/ranking, keypair/id, keypair/alias, cdnrewriter/attributes, cdn/rewriter/distribution/domain FROM com_adobe_cq_cdn_rewriter_impl_aws_cloud_front_rewriter_propert WHERE 1=1;

--
-- INSERT template for table 'com_adobe_cq_cdn_rewriter_impl_aws_cloud_front_rewriter_propert'
--
INSERT INTO com_adobe_cq_cdn_rewriter_impl_aws_cloud_front_rewriter_propert (service/ranking, keypair/id, keypair/alias, cdnrewriter/attributes, cdn/rewriter/distribution/domain) VALUES (?, ?, ?, ?, ?);

--
-- UPDATE template for table 'com_adobe_cq_cdn_rewriter_impl_aws_cloud_front_rewriter_propert'
--
UPDATE com_adobe_cq_cdn_rewriter_impl_aws_cloud_front_rewriter_propert SET service/ranking = ?, keypair/id = ?, keypair/alias = ?, cdnrewriter/attributes = ?, cdn/rewriter/distribution/domain = ? WHERE 1=2;

--
-- DELETE template for table 'com_adobe_cq_cdn_rewriter_impl_aws_cloud_front_rewriter_propert'
--
DELETE FROM com_adobe_cq_cdn_rewriter_impl_aws_cloud_front_rewriter_propert WHERE 1=2;

