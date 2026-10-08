--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comDayCqSearchpromoteImplPublishSearchPromoteConfigHandlerInfo' definition.
--


--
-- SELECT template for table `comDayCqSearchpromoteImplPublishSearchPromoteConfigHandlerInfo`
--
SELECT `pid`, `title`, `description`, `properties`, `bundle_location`, `service_location` FROM `comDayCqSearchpromoteImplPublishSearchPromoteConfigHandlerInfo` WHERE 1;

--
-- INSERT template for table `comDayCqSearchpromoteImplPublishSearchPromoteConfigHandlerInfo`
--
INSERT INTO `comDayCqSearchpromoteImplPublishSearchPromoteConfigHandlerInfo`(`pid`, `title`, `description`, `properties`, `bundle_location`, `service_location`) VALUES (?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `comDayCqSearchpromoteImplPublishSearchPromoteConfigHandlerInfo`
--
UPDATE `comDayCqSearchpromoteImplPublishSearchPromoteConfigHandlerInfo` SET `pid` = ?, `title` = ?, `description` = ?, `properties` = ?, `bundle_location` = ?, `service_location` = ? WHERE 1;

--
-- DELETE template for table `comDayCqSearchpromoteImplPublishSearchPromoteConfigHandlerInfo`
--
DELETE FROM `comDayCqSearchpromoteImplPublishSearchPromoteConfigHandlerInfo` WHERE 0;

