--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'orgApacheSlingAuthCoreImplLogoutServletProperties' definition.
--


--
-- SELECT template for table `orgApacheSlingAuthCoreImplLogoutServletProperties`
--
SELECT `sling.servlet.methods`, `sling.servlet.paths` FROM `orgApacheSlingAuthCoreImplLogoutServletProperties` WHERE 1;

--
-- INSERT template for table `orgApacheSlingAuthCoreImplLogoutServletProperties`
--
INSERT INTO `orgApacheSlingAuthCoreImplLogoutServletProperties`(`sling.servlet.methods`, `sling.servlet.paths`) VALUES (?, ?);

--
-- UPDATE template for table `orgApacheSlingAuthCoreImplLogoutServletProperties`
--
UPDATE `orgApacheSlingAuthCoreImplLogoutServletProperties` SET `sling.servlet.methods` = ?, `sling.servlet.paths` = ? WHERE 1;

--
-- DELETE template for table `orgApacheSlingAuthCoreImplLogoutServletProperties`
--
DELETE FROM `orgApacheSlingAuthCoreImplLogoutServletProperties` WHERE 0;

