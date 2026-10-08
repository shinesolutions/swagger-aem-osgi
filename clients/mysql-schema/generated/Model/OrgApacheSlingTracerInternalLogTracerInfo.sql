--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'orgApacheSlingTracerInternalLogTracerInfo' definition.
--


--
-- SELECT template for table `orgApacheSlingTracerInternalLogTracerInfo`
--
SELECT `pid`, `title`, `description`, `properties` FROM `orgApacheSlingTracerInternalLogTracerInfo` WHERE 1;

--
-- INSERT template for table `orgApacheSlingTracerInternalLogTracerInfo`
--
INSERT INTO `orgApacheSlingTracerInternalLogTracerInfo`(`pid`, `title`, `description`, `properties`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `orgApacheSlingTracerInternalLogTracerInfo`
--
UPDATE `orgApacheSlingTracerInternalLogTracerInfo` SET `pid` = ?, `title` = ?, `description` = ?, `properties` = ? WHERE 1;

--
-- DELETE template for table `orgApacheSlingTracerInternalLogTracerInfo`
--
DELETE FROM `orgApacheSlingTracerInternalLogTracerInfo` WHERE 0;

