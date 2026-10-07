--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comDayCqRewriterLinkcheckerImplLinkInfoStorageImplInfo' definition.
--


--
-- SELECT template for table `comDayCqRewriterLinkcheckerImplLinkInfoStorageImplInfo`
--
SELECT `pid`, `title`, `description`, `properties`, `bundle_location`, `service_location` FROM `comDayCqRewriterLinkcheckerImplLinkInfoStorageImplInfo` WHERE 1;

--
-- INSERT template for table `comDayCqRewriterLinkcheckerImplLinkInfoStorageImplInfo`
--
INSERT INTO `comDayCqRewriterLinkcheckerImplLinkInfoStorageImplInfo`(`pid`, `title`, `description`, `properties`, `bundle_location`, `service_location`) VALUES (?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `comDayCqRewriterLinkcheckerImplLinkInfoStorageImplInfo`
--
UPDATE `comDayCqRewriterLinkcheckerImplLinkInfoStorageImplInfo` SET `pid` = ?, `title` = ?, `description` = ?, `properties` = ?, `bundle_location` = ?, `service_location` = ? WHERE 1;

--
-- DELETE template for table `comDayCqRewriterLinkcheckerImplLinkInfoStorageImplInfo`
--
DELETE FROM `comDayCqRewriterLinkcheckerImplLinkInfoStorageImplInfo` WHERE 0;

