--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'orgApacheSlingEngineImplSlingMainServletInfo' definition.
--


--
-- SELECT template for table `orgApacheSlingEngineImplSlingMainServletInfo`
--
SELECT `pid`, `title`, `description`, `properties`, `bundle_location`, `service_location` FROM `orgApacheSlingEngineImplSlingMainServletInfo` WHERE 1;

--
-- INSERT template for table `orgApacheSlingEngineImplSlingMainServletInfo`
--
INSERT INTO `orgApacheSlingEngineImplSlingMainServletInfo`(`pid`, `title`, `description`, `properties`, `bundle_location`, `service_location`) VALUES (?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `orgApacheSlingEngineImplSlingMainServletInfo`
--
UPDATE `orgApacheSlingEngineImplSlingMainServletInfo` SET `pid` = ?, `title` = ?, `description` = ?, `properties` = ?, `bundle_location` = ?, `service_location` = ? WHERE 1;

--
-- DELETE template for table `orgApacheSlingEngineImplSlingMainServletInfo`
--
DELETE FROM `orgApacheSlingEngineImplSlingMainServletInfo` WHERE 0;

