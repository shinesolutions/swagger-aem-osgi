--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comDayCqDamCommonsHandlerStandardImageHandlerProperties' definition.
--


--
-- SELECT template for table `comDayCqDamCommonsHandlerStandardImageHandlerProperties`
--
SELECT `large_file_threshold`, `large_comment_threshold`, `cq.dam.enable.ext.meta.extraction` FROM `comDayCqDamCommonsHandlerStandardImageHandlerProperties` WHERE 1;

--
-- INSERT template for table `comDayCqDamCommonsHandlerStandardImageHandlerProperties`
--
INSERT INTO `comDayCqDamCommonsHandlerStandardImageHandlerProperties`(`large_file_threshold`, `large_comment_threshold`, `cq.dam.enable.ext.meta.extraction`) VALUES (?, ?, ?);

--
-- UPDATE template for table `comDayCqDamCommonsHandlerStandardImageHandlerProperties`
--
UPDATE `comDayCqDamCommonsHandlerStandardImageHandlerProperties` SET `large_file_threshold` = ?, `large_comment_threshold` = ?, `cq.dam.enable.ext.meta.extraction` = ? WHERE 1;

--
-- DELETE template for table `comDayCqDamCommonsHandlerStandardImageHandlerProperties`
--
DELETE FROM `comDayCqDamCommonsHandlerStandardImageHandlerProperties` WHERE 0;

