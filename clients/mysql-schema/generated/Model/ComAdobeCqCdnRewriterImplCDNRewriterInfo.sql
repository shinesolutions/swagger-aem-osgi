--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comAdobeCqCdnRewriterImplCDNRewriterInfo' definition.
--


--
-- SELECT template for table `comAdobeCqCdnRewriterImplCDNRewriterInfo`
--
SELECT `pid`, `title`, `description`, `properties` FROM `comAdobeCqCdnRewriterImplCDNRewriterInfo` WHERE 1;

--
-- INSERT template for table `comAdobeCqCdnRewriterImplCDNRewriterInfo`
--
INSERT INTO `comAdobeCqCdnRewriterImplCDNRewriterInfo`(`pid`, `title`, `description`, `properties`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `comAdobeCqCdnRewriterImplCDNRewriterInfo`
--
UPDATE `comAdobeCqCdnRewriterImplCDNRewriterInfo` SET `pid` = ?, `title` = ?, `description` = ?, `properties` = ? WHERE 1;

--
-- DELETE template for table `comAdobeCqCdnRewriterImplCDNRewriterInfo`
--
DELETE FROM `comAdobeCqCdnRewriterImplCDNRewriterInfo` WHERE 0;

