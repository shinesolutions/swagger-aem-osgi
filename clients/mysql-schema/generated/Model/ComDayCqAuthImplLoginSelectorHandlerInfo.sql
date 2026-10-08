--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comDayCqAuthImplLoginSelectorHandlerInfo' definition.
--


--
-- SELECT template for table `comDayCqAuthImplLoginSelectorHandlerInfo`
--
SELECT `pid`, `title`, `description`, `properties`, `bundle_location`, `service_location` FROM `comDayCqAuthImplLoginSelectorHandlerInfo` WHERE 1;

--
-- INSERT template for table `comDayCqAuthImplLoginSelectorHandlerInfo`
--
INSERT INTO `comDayCqAuthImplLoginSelectorHandlerInfo`(`pid`, `title`, `description`, `properties`, `bundle_location`, `service_location`) VALUES (?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `comDayCqAuthImplLoginSelectorHandlerInfo`
--
UPDATE `comDayCqAuthImplLoginSelectorHandlerInfo` SET `pid` = ?, `title` = ?, `description` = ?, `properties` = ?, `bundle_location` = ?, `service_location` = ? WHERE 1;

--
-- DELETE template for table `comDayCqAuthImplLoginSelectorHandlerInfo`
--
DELETE FROM `comDayCqAuthImplLoginSelectorHandlerInfo` WHERE 0;

