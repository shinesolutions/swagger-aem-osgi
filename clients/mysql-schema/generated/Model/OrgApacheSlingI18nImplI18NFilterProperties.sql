--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'orgApacheSlingI18nImplI18NFilterProperties' definition.
--


--
-- SELECT template for table `orgApacheSlingI18nImplI18NFilterProperties`
--
SELECT `service.ranking`, `sling.filter.scope` FROM `orgApacheSlingI18nImplI18NFilterProperties` WHERE 1;

--
-- INSERT template for table `orgApacheSlingI18nImplI18NFilterProperties`
--
INSERT INTO `orgApacheSlingI18nImplI18NFilterProperties`(`service.ranking`, `sling.filter.scope`) VALUES (?, ?);

--
-- UPDATE template for table `orgApacheSlingI18nImplI18NFilterProperties`
--
UPDATE `orgApacheSlingI18nImplI18NFilterProperties` SET `service.ranking` = ?, `sling.filter.scope` = ? WHERE 1;

--
-- DELETE template for table `orgApacheSlingI18nImplI18NFilterProperties`
--
DELETE FROM `orgApacheSlingI18nImplI18NFilterProperties` WHERE 0;

