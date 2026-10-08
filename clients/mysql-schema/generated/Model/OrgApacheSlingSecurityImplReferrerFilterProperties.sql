--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'orgApacheSlingSecurityImplReferrerFilterProperties' definition.
--


--
-- SELECT template for table `orgApacheSlingSecurityImplReferrerFilterProperties`
--
SELECT `allow.empty`, `allow.hosts`, `allow.hosts.regexp`, `filter.methods`, `exclude.agents.regexp` FROM `orgApacheSlingSecurityImplReferrerFilterProperties` WHERE 1;

--
-- INSERT template for table `orgApacheSlingSecurityImplReferrerFilterProperties`
--
INSERT INTO `orgApacheSlingSecurityImplReferrerFilterProperties`(`allow.empty`, `allow.hosts`, `allow.hosts.regexp`, `filter.methods`, `exclude.agents.regexp`) VALUES (?, ?, ?, ?, ?);

--
-- UPDATE template for table `orgApacheSlingSecurityImplReferrerFilterProperties`
--
UPDATE `orgApacheSlingSecurityImplReferrerFilterProperties` SET `allow.empty` = ?, `allow.hosts` = ?, `allow.hosts.regexp` = ?, `filter.methods` = ?, `exclude.agents.regexp` = ? WHERE 1;

--
-- DELETE template for table `orgApacheSlingSecurityImplReferrerFilterProperties`
--
DELETE FROM `orgApacheSlingSecurityImplReferrerFilterProperties` WHERE 0;

