--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comAdobeCqCdnRewriterImplCDNConfigServiceImplProperties' definition.
--


--
-- SELECT template for table `comAdobeCqCdnRewriterImplCDNConfigServiceImplProperties`
--
SELECT `cdn.config.distribution.domain`, `cdn.config.enable.rewriting`, `cdn.config.path.prefixes`, `cdn.config.cdnttl`, `cdn.config.application.protocol` FROM `comAdobeCqCdnRewriterImplCDNConfigServiceImplProperties` WHERE 1;

--
-- INSERT template for table `comAdobeCqCdnRewriterImplCDNConfigServiceImplProperties`
--
INSERT INTO `comAdobeCqCdnRewriterImplCDNConfigServiceImplProperties`(`cdn.config.distribution.domain`, `cdn.config.enable.rewriting`, `cdn.config.path.prefixes`, `cdn.config.cdnttl`, `cdn.config.application.protocol`) VALUES (?, ?, ?, ?, ?);

--
-- UPDATE template for table `comAdobeCqCdnRewriterImplCDNConfigServiceImplProperties`
--
UPDATE `comAdobeCqCdnRewriterImplCDNConfigServiceImplProperties` SET `cdn.config.distribution.domain` = ?, `cdn.config.enable.rewriting` = ?, `cdn.config.path.prefixes` = ?, `cdn.config.cdnttl` = ?, `cdn.config.application.protocol` = ? WHERE 1;

--
-- DELETE template for table `comAdobeCqCdnRewriterImplCDNConfigServiceImplProperties`
--
DELETE FROM `comAdobeCqCdnRewriterImplCDNConfigServiceImplProperties` WHERE 0;

