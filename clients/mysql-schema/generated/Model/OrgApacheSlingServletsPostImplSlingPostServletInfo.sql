--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'orgApacheSlingServletsPostImplSlingPostServletInfo' definition.
--


--
-- SELECT template for table `orgApacheSlingServletsPostImplSlingPostServletInfo`
--
SELECT `pid`, `title`, `description`, `properties` FROM `orgApacheSlingServletsPostImplSlingPostServletInfo` WHERE 1;

--
-- INSERT template for table `orgApacheSlingServletsPostImplSlingPostServletInfo`
--
INSERT INTO `orgApacheSlingServletsPostImplSlingPostServletInfo`(`pid`, `title`, `description`, `properties`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `orgApacheSlingServletsPostImplSlingPostServletInfo`
--
UPDATE `orgApacheSlingServletsPostImplSlingPostServletInfo` SET `pid` = ?, `title` = ?, `description` = ?, `properties` = ? WHERE 1;

--
-- DELETE template for table `orgApacheSlingServletsPostImplSlingPostServletInfo`
--
DELETE FROM `orgApacheSlingServletsPostImplSlingPostServletInfo` WHERE 0;

