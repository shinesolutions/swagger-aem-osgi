--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comDayCqWcmFoundationFormsImplMailServletProperties' definition.
--


--
-- SELECT template for table `comDayCqWcmFoundationFormsImplMailServletProperties`
--
SELECT `sling.servlet.resourceTypes`, `sling.servlet.selectors`, `resource.whitelist`, `resource.blacklist` FROM `comDayCqWcmFoundationFormsImplMailServletProperties` WHERE 1;

--
-- INSERT template for table `comDayCqWcmFoundationFormsImplMailServletProperties`
--
INSERT INTO `comDayCqWcmFoundationFormsImplMailServletProperties`(`sling.servlet.resourceTypes`, `sling.servlet.selectors`, `resource.whitelist`, `resource.blacklist`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `comDayCqWcmFoundationFormsImplMailServletProperties`
--
UPDATE `comDayCqWcmFoundationFormsImplMailServletProperties` SET `sling.servlet.resourceTypes` = ?, `sling.servlet.selectors` = ?, `resource.whitelist` = ?, `resource.blacklist` = ? WHERE 1;

--
-- DELETE template for table `comDayCqWcmFoundationFormsImplMailServletProperties`
--
DELETE FROM `comDayCqWcmFoundationFormsImplMailServletProperties` WHERE 0;

