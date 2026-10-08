--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comDayCqRewriterLinkcheckerImplLinkCheckerTaskProperties' definition.
--


--
-- SELECT template for table `comDayCqRewriterLinkcheckerImplLinkCheckerTaskProperties`
--
SELECT `scheduler.period`, `scheduler.concurrent`, `good_link_test_interval`, `bad_link_test_interval`, `link_unused_interval`, `connection.timeout` FROM `comDayCqRewriterLinkcheckerImplLinkCheckerTaskProperties` WHERE 1;

--
-- INSERT template for table `comDayCqRewriterLinkcheckerImplLinkCheckerTaskProperties`
--
INSERT INTO `comDayCqRewriterLinkcheckerImplLinkCheckerTaskProperties`(`scheduler.period`, `scheduler.concurrent`, `good_link_test_interval`, `bad_link_test_interval`, `link_unused_interval`, `connection.timeout`) VALUES (?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `comDayCqRewriterLinkcheckerImplLinkCheckerTaskProperties`
--
UPDATE `comDayCqRewriterLinkcheckerImplLinkCheckerTaskProperties` SET `scheduler.period` = ?, `scheduler.concurrent` = ?, `good_link_test_interval` = ?, `bad_link_test_interval` = ?, `link_unused_interval` = ?, `connection.timeout` = ? WHERE 1;

--
-- DELETE template for table `comDayCqRewriterLinkcheckerImplLinkCheckerTaskProperties`
--
DELETE FROM `comDayCqRewriterLinkcheckerImplLinkCheckerTaskProperties` WHERE 0;

