--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'apacheSlingHealthCheckResultHTMLSerializerInfo' definition.
--


--
-- SELECT template for table `apacheSlingHealthCheckResultHTMLSerializerInfo`
--
SELECT `pid`, `title`, `description`, `properties` FROM `apacheSlingHealthCheckResultHTMLSerializerInfo` WHERE 1;

--
-- INSERT template for table `apacheSlingHealthCheckResultHTMLSerializerInfo`
--
INSERT INTO `apacheSlingHealthCheckResultHTMLSerializerInfo`(`pid`, `title`, `description`, `properties`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `apacheSlingHealthCheckResultHTMLSerializerInfo`
--
UPDATE `apacheSlingHealthCheckResultHTMLSerializerInfo` SET `pid` = ?, `title` = ?, `description` = ?, `properties` = ? WHERE 1;

--
-- DELETE template for table `apacheSlingHealthCheckResultHTMLSerializerInfo`
--
DELETE FROM `apacheSlingHealthCheckResultHTMLSerializerInfo` WHERE 0;

