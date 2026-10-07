--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comAdobeCqCdnRewriterImplCDNRewriterProperties' definition.
--


--
-- SELECT template for table `comAdobeCqCdnRewriterImplCDNRewriterProperties`
--
SELECT `service.ranking`, `cdnrewriter.attributes`, `cdn.rewriter.distribution.domain` FROM `comAdobeCqCdnRewriterImplCDNRewriterProperties` WHERE 1;

--
-- INSERT template for table `comAdobeCqCdnRewriterImplCDNRewriterProperties`
--
INSERT INTO `comAdobeCqCdnRewriterImplCDNRewriterProperties`(`service.ranking`, `cdnrewriter.attributes`, `cdn.rewriter.distribution.domain`) VALUES (?, ?, ?);

--
-- UPDATE template for table `comAdobeCqCdnRewriterImplCDNRewriterProperties`
--
UPDATE `comAdobeCqCdnRewriterImplCDNRewriterProperties` SET `service.ranking` = ?, `cdnrewriter.attributes` = ?, `cdn.rewriter.distribution.domain` = ? WHERE 1;

--
-- DELETE template for table `comAdobeCqCdnRewriterImplCDNRewriterProperties`
--
DELETE FROM `comAdobeCqCdnRewriterImplCDNRewriterProperties` WHERE 0;

