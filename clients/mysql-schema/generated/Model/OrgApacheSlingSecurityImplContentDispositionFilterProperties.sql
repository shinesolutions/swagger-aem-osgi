--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'orgApacheSlingSecurityImplContentDispositionFilterProperties' definition.
--


--
-- SELECT template for table `orgApacheSlingSecurityImplContentDispositionFilterProperties`
--
SELECT `sling.content.disposition.paths`, `sling.content.disposition.excluded.paths`, `sling.content.disposition.all.paths` FROM `orgApacheSlingSecurityImplContentDispositionFilterProperties` WHERE 1;

--
-- INSERT template for table `orgApacheSlingSecurityImplContentDispositionFilterProperties`
--
INSERT INTO `orgApacheSlingSecurityImplContentDispositionFilterProperties`(`sling.content.disposition.paths`, `sling.content.disposition.excluded.paths`, `sling.content.disposition.all.paths`) VALUES (?, ?, ?);

--
-- UPDATE template for table `orgApacheSlingSecurityImplContentDispositionFilterProperties`
--
UPDATE `orgApacheSlingSecurityImplContentDispositionFilterProperties` SET `sling.content.disposition.paths` = ?, `sling.content.disposition.excluded.paths` = ?, `sling.content.disposition.all.paths` = ? WHERE 1;

--
-- DELETE template for table `orgApacheSlingSecurityImplContentDispositionFilterProperties`
--
DELETE FROM `orgApacheSlingSecurityImplContentDispositionFilterProperties` WHERE 0;

