--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comDayCqSearchpromoteImplSearchPromoteServiceImplInfo' definition.
--


--
-- SELECT template for table `comDayCqSearchpromoteImplSearchPromoteServiceImplInfo`
--
SELECT `pid`, `title`, `description`, `properties`, `bundle_location`, `service_location` FROM `comDayCqSearchpromoteImplSearchPromoteServiceImplInfo` WHERE 1;

--
-- INSERT template for table `comDayCqSearchpromoteImplSearchPromoteServiceImplInfo`
--
INSERT INTO `comDayCqSearchpromoteImplSearchPromoteServiceImplInfo`(`pid`, `title`, `description`, `properties`, `bundle_location`, `service_location`) VALUES (?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `comDayCqSearchpromoteImplSearchPromoteServiceImplInfo`
--
UPDATE `comDayCqSearchpromoteImplSearchPromoteServiceImplInfo` SET `pid` = ?, `title` = ?, `description` = ?, `properties` = ?, `bundle_location` = ?, `service_location` = ? WHERE 1;

--
-- DELETE template for table `comDayCqSearchpromoteImplSearchPromoteServiceImplInfo`
--
DELETE FROM `comDayCqSearchpromoteImplSearchPromoteServiceImplInfo` WHERE 0;

