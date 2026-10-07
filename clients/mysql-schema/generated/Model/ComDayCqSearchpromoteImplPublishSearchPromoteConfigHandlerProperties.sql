--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comDayCqSearchpromoteImplPublishSearchPromoteConfigHandlerProperties' definition.
--


--
-- SELECT template for table `comDayCqSearchpromoteImplPublishSearchPromoteConfigHandlerProper`
--
SELECT `cq.searchpromote.confighandler.enabled` FROM `comDayCqSearchpromoteImplPublishSearchPromoteConfigHandlerProper` WHERE 1;

--
-- INSERT template for table `comDayCqSearchpromoteImplPublishSearchPromoteConfigHandlerProper`
--
INSERT INTO `comDayCqSearchpromoteImplPublishSearchPromoteConfigHandlerProper`(`cq.searchpromote.confighandler.enabled`) VALUES (?);

--
-- UPDATE template for table `comDayCqSearchpromoteImplPublishSearchPromoteConfigHandlerProper`
--
UPDATE `comDayCqSearchpromoteImplPublishSearchPromoteConfigHandlerProper` SET `cq.searchpromote.confighandler.enabled` = ? WHERE 1;

--
-- DELETE template for table `comDayCqSearchpromoteImplPublishSearchPromoteConfigHandlerProper`
--
DELETE FROM `comDayCqSearchpromoteImplPublishSearchPromoteConfigHandlerProper` WHERE 0;

