--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comDayCqDamCoreImplServletHealthCheckServletProperties' definition.
--


--
-- SELECT template for table `comDayCqDamCoreImplServletHealthCheckServletProperties`
--
SELECT `cq.dam.sync.workflow.id`, `cq.dam.sync.folder.types` FROM `comDayCqDamCoreImplServletHealthCheckServletProperties` WHERE 1;

--
-- INSERT template for table `comDayCqDamCoreImplServletHealthCheckServletProperties`
--
INSERT INTO `comDayCqDamCoreImplServletHealthCheckServletProperties`(`cq.dam.sync.workflow.id`, `cq.dam.sync.folder.types`) VALUES (?, ?);

--
-- UPDATE template for table `comDayCqDamCoreImplServletHealthCheckServletProperties`
--
UPDATE `comDayCqDamCoreImplServletHealthCheckServletProperties` SET `cq.dam.sync.workflow.id` = ?, `cq.dam.sync.folder.types` = ? WHERE 1;

--
-- DELETE template for table `comDayCqDamCoreImplServletHealthCheckServletProperties`
--
DELETE FROM `comDayCqDamCoreImplServletHealthCheckServletProperties` WHERE 0;

