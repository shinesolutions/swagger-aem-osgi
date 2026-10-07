--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comDayCqDamCoreImplServletResourceCollectionServletProperties' definition.
--


--
-- SELECT template for table `comDayCqDamCoreImplServletResourceCollectionServletProperties`
--
SELECT `sling.servlet.resourceTypes`, `sling.servlet.methods`, `sling.servlet.selectors`, `download.config`, `view.selector`, `send_email` FROM `comDayCqDamCoreImplServletResourceCollectionServletProperties` WHERE 1;

--
-- INSERT template for table `comDayCqDamCoreImplServletResourceCollectionServletProperties`
--
INSERT INTO `comDayCqDamCoreImplServletResourceCollectionServletProperties`(`sling.servlet.resourceTypes`, `sling.servlet.methods`, `sling.servlet.selectors`, `download.config`, `view.selector`, `send_email`) VALUES (?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `comDayCqDamCoreImplServletResourceCollectionServletProperties`
--
UPDATE `comDayCqDamCoreImplServletResourceCollectionServletProperties` SET `sling.servlet.resourceTypes` = ?, `sling.servlet.methods` = ?, `sling.servlet.selectors` = ?, `download.config` = ?, `view.selector` = ?, `send_email` = ? WHERE 1;

--
-- DELETE template for table `comDayCqDamCoreImplServletResourceCollectionServletProperties`
--
DELETE FROM `comDayCqDamCoreImplServletResourceCollectionServletProperties` WHERE 0;

