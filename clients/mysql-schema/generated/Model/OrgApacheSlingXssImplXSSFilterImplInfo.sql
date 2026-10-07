--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'orgApacheSlingXssImplXSSFilterImplInfo' definition.
--


--
-- SELECT template for table `orgApacheSlingXssImplXSSFilterImplInfo`
--
SELECT `pid`, `title`, `description`, `properties`, `bundle_location`, `service_location` FROM `orgApacheSlingXssImplXSSFilterImplInfo` WHERE 1;

--
-- INSERT template for table `orgApacheSlingXssImplXSSFilterImplInfo`
--
INSERT INTO `orgApacheSlingXssImplXSSFilterImplInfo`(`pid`, `title`, `description`, `properties`, `bundle_location`, `service_location`) VALUES (?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `orgApacheSlingXssImplXSSFilterImplInfo`
--
UPDATE `orgApacheSlingXssImplXSSFilterImplInfo` SET `pid` = ?, `title` = ?, `description` = ?, `properties` = ?, `bundle_location` = ?, `service_location` = ? WHERE 1;

--
-- DELETE template for table `orgApacheSlingXssImplXSSFilterImplInfo`
--
DELETE FROM `orgApacheSlingXssImplXSSFilterImplInfo` WHERE 0;

