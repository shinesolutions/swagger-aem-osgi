--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'orgApacheSlingJcrWebdavImplServletsSimpleWebDavServletInfo' definition.
--


--
-- SELECT template for table `orgApacheSlingJcrWebdavImplServletsSimpleWebDavServletInfo`
--
SELECT `pid`, `title`, `description`, `properties`, `bundle_location`, `service_location` FROM `orgApacheSlingJcrWebdavImplServletsSimpleWebDavServletInfo` WHERE 1;

--
-- INSERT template for table `orgApacheSlingJcrWebdavImplServletsSimpleWebDavServletInfo`
--
INSERT INTO `orgApacheSlingJcrWebdavImplServletsSimpleWebDavServletInfo`(`pid`, `title`, `description`, `properties`, `bundle_location`, `service_location`) VALUES (?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `orgApacheSlingJcrWebdavImplServletsSimpleWebDavServletInfo`
--
UPDATE `orgApacheSlingJcrWebdavImplServletsSimpleWebDavServletInfo` SET `pid` = ?, `title` = ?, `description` = ?, `properties` = ?, `bundle_location` = ?, `service_location` = ? WHERE 1;

--
-- DELETE template for table `orgApacheSlingJcrWebdavImplServletsSimpleWebDavServletInfo`
--
DELETE FROM `orgApacheSlingJcrWebdavImplServletsSimpleWebDavServletInfo` WHERE 0;

