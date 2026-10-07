--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'orgApacheSlingServletsGetImplVersionVersionInfoServletProperties' definition.
--


--
-- SELECT template for table `orgApacheSlingServletsGetImplVersionVersionInfoServletProperties`
--
SELECT `sling.servlet.selectors`, `ecmaSuport` FROM `orgApacheSlingServletsGetImplVersionVersionInfoServletProperties` WHERE 1;

--
-- INSERT template for table `orgApacheSlingServletsGetImplVersionVersionInfoServletProperties`
--
INSERT INTO `orgApacheSlingServletsGetImplVersionVersionInfoServletProperties`(`sling.servlet.selectors`, `ecmaSuport`) VALUES (?, ?);

--
-- UPDATE template for table `orgApacheSlingServletsGetImplVersionVersionInfoServletProperties`
--
UPDATE `orgApacheSlingServletsGetImplVersionVersionInfoServletProperties` SET `sling.servlet.selectors` = ?, `ecmaSuport` = ? WHERE 1;

--
-- DELETE template for table `orgApacheSlingServletsGetImplVersionVersionInfoServletProperties`
--
DELETE FROM `orgApacheSlingServletsGetImplVersionVersionInfoServletProperties` WHERE 0;

