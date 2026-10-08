--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comDayCqRewriterLinkcheckerImplLinkCheckerImplProperties' definition.
--


--
-- SELECT template for table `comDayCqRewriterLinkcheckerImplLinkCheckerImplProperties`
--
SELECT `scheduler.period`, `scheduler.concurrent`, `service.bad_link_tolerance_interval`, `service.check_override_patterns`, `service.cache_broken_internal_links`, `service.special_link_prefix`, `service.special_link_patterns` FROM `comDayCqRewriterLinkcheckerImplLinkCheckerImplProperties` WHERE 1;

--
-- INSERT template for table `comDayCqRewriterLinkcheckerImplLinkCheckerImplProperties`
--
INSERT INTO `comDayCqRewriterLinkcheckerImplLinkCheckerImplProperties`(`scheduler.period`, `scheduler.concurrent`, `service.bad_link_tolerance_interval`, `service.check_override_patterns`, `service.cache_broken_internal_links`, `service.special_link_prefix`, `service.special_link_patterns`) VALUES (?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `comDayCqRewriterLinkcheckerImplLinkCheckerImplProperties`
--
UPDATE `comDayCqRewriterLinkcheckerImplLinkCheckerImplProperties` SET `scheduler.period` = ?, `scheduler.concurrent` = ?, `service.bad_link_tolerance_interval` = ?, `service.check_override_patterns` = ?, `service.cache_broken_internal_links` = ?, `service.special_link_prefix` = ?, `service.special_link_patterns` = ? WHERE 1;

--
-- DELETE template for table `comDayCqRewriterLinkcheckerImplLinkCheckerImplProperties`
--
DELETE FROM `comDayCqRewriterLinkcheckerImplLinkCheckerImplProperties` WHERE 0;

