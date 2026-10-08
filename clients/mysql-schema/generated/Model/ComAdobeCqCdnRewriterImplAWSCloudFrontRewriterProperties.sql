--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comAdobeCqCdnRewriterImplAWSCloudFrontRewriterProperties' definition.
--


--
-- SELECT template for table `comAdobeCqCdnRewriterImplAWSCloudFrontRewriterProperties`
--
SELECT `service.ranking`, `keypair.id`, `keypair.alias`, `cdnrewriter.attributes`, `cdn.rewriter.distribution.domain` FROM `comAdobeCqCdnRewriterImplAWSCloudFrontRewriterProperties` WHERE 1;

--
-- INSERT template for table `comAdobeCqCdnRewriterImplAWSCloudFrontRewriterProperties`
--
INSERT INTO `comAdobeCqCdnRewriterImplAWSCloudFrontRewriterProperties`(`service.ranking`, `keypair.id`, `keypair.alias`, `cdnrewriter.attributes`, `cdn.rewriter.distribution.domain`) VALUES (?, ?, ?, ?, ?);

--
-- UPDATE template for table `comAdobeCqCdnRewriterImplAWSCloudFrontRewriterProperties`
--
UPDATE `comAdobeCqCdnRewriterImplAWSCloudFrontRewriterProperties` SET `service.ranking` = ?, `keypair.id` = ?, `keypair.alias` = ?, `cdnrewriter.attributes` = ?, `cdn.rewriter.distribution.domain` = ? WHERE 1;

--
-- DELETE template for table `comAdobeCqCdnRewriterImplAWSCloudFrontRewriterProperties`
--
DELETE FROM `comAdobeCqCdnRewriterImplAWSCloudFrontRewriterProperties` WHERE 0;

