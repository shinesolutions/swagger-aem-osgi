--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comDayCqRewriterLinkcheckerImplLinkCheckerImplInfo' definition.
--


--
-- SELECT template for table `comDayCqRewriterLinkcheckerImplLinkCheckerImplInfo`
--
SELECT `pid`, `title`, `description`, `properties`, `bundle_location`, `service_location` FROM `comDayCqRewriterLinkcheckerImplLinkCheckerImplInfo` WHERE 1;

--
-- INSERT template for table `comDayCqRewriterLinkcheckerImplLinkCheckerImplInfo`
--
INSERT INTO `comDayCqRewriterLinkcheckerImplLinkCheckerImplInfo`(`pid`, `title`, `description`, `properties`, `bundle_location`, `service_location`) VALUES (?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `comDayCqRewriterLinkcheckerImplLinkCheckerImplInfo`
--
UPDATE `comDayCqRewriterLinkcheckerImplLinkCheckerImplInfo` SET `pid` = ?, `title` = ?, `description` = ?, `properties` = ?, `bundle_location` = ?, `service_location` = ? WHERE 1;

--
-- DELETE template for table `comDayCqRewriterLinkcheckerImplLinkCheckerImplInfo`
--
DELETE FROM `comDayCqRewriterLinkcheckerImplLinkCheckerImplInfo` WHERE 0;

