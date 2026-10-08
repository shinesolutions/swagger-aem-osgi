--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'orgApacheSlingJcrBaseInternalLoginAdminWhitelistFragmentProperties' definition.
--


--
-- SELECT template for table `orgApacheSlingJcrBaseInternalLoginAdminWhitelistFragmentProperti`
--
SELECT `whitelist.name`, `whitelist.bundles` FROM `orgApacheSlingJcrBaseInternalLoginAdminWhitelistFragmentProperti` WHERE 1;

--
-- INSERT template for table `orgApacheSlingJcrBaseInternalLoginAdminWhitelistFragmentProperti`
--
INSERT INTO `orgApacheSlingJcrBaseInternalLoginAdminWhitelistFragmentProperti`(`whitelist.name`, `whitelist.bundles`) VALUES (?, ?);

--
-- UPDATE template for table `orgApacheSlingJcrBaseInternalLoginAdminWhitelistFragmentProperti`
--
UPDATE `orgApacheSlingJcrBaseInternalLoginAdminWhitelistFragmentProperti` SET `whitelist.name` = ?, `whitelist.bundles` = ? WHERE 1;

--
-- DELETE template for table `orgApacheSlingJcrBaseInternalLoginAdminWhitelistFragmentProperti`
--
DELETE FROM `orgApacheSlingJcrBaseInternalLoginAdminWhitelistFragmentProperti` WHERE 0;

