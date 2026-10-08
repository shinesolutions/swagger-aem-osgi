--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'orgApacheSlingJcrBaseInternalLoginAdminWhitelistInfo' definition.
--


--
-- SELECT template for table `orgApacheSlingJcrBaseInternalLoginAdminWhitelistInfo`
--
SELECT `pid`, `title`, `description`, `properties` FROM `orgApacheSlingJcrBaseInternalLoginAdminWhitelistInfo` WHERE 1;

--
-- INSERT template for table `orgApacheSlingJcrBaseInternalLoginAdminWhitelistInfo`
--
INSERT INTO `orgApacheSlingJcrBaseInternalLoginAdminWhitelistInfo`(`pid`, `title`, `description`, `properties`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `orgApacheSlingJcrBaseInternalLoginAdminWhitelistInfo`
--
UPDATE `orgApacheSlingJcrBaseInternalLoginAdminWhitelistInfo` SET `pid` = ?, `title` = ?, `description` = ?, `properties` = ? WHERE 1;

--
-- DELETE template for table `orgApacheSlingJcrBaseInternalLoginAdminWhitelistInfo`
--
DELETE FROM `orgApacheSlingJcrBaseInternalLoginAdminWhitelistInfo` WHERE 0;

