--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'orgApacheSlingJcrBaseInternalLoginAdminWhitelistProperties' definition.
--


--
-- SELECT template for table `orgApacheSlingJcrBaseInternalLoginAdminWhitelistProperties`
--
SELECT `whitelist.bypass`, `whitelist.bundles.regexp` FROM `orgApacheSlingJcrBaseInternalLoginAdminWhitelistProperties` WHERE 1;

--
-- INSERT template for table `orgApacheSlingJcrBaseInternalLoginAdminWhitelistProperties`
--
INSERT INTO `orgApacheSlingJcrBaseInternalLoginAdminWhitelistProperties`(`whitelist.bypass`, `whitelist.bundles.regexp`) VALUES (?, ?);

--
-- UPDATE template for table `orgApacheSlingJcrBaseInternalLoginAdminWhitelistProperties`
--
UPDATE `orgApacheSlingJcrBaseInternalLoginAdminWhitelistProperties` SET `whitelist.bypass` = ?, `whitelist.bundles.regexp` = ? WHERE 1;

--
-- DELETE template for table `orgApacheSlingJcrBaseInternalLoginAdminWhitelistProperties`
--
DELETE FROM `orgApacheSlingJcrBaseInternalLoginAdminWhitelistProperties` WHERE 0;

