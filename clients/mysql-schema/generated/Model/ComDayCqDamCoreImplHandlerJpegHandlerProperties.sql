--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comDayCqDamCoreImplHandlerJpegHandlerProperties' definition.
--


--
-- SELECT template for table `comDayCqDamCoreImplHandlerJpegHandlerProperties`
--
SELECT `cq.dam.enable.ext.meta.extraction`, `large_file_threshold`, `large_comment_threshold` FROM `comDayCqDamCoreImplHandlerJpegHandlerProperties` WHERE 1;

--
-- INSERT template for table `comDayCqDamCoreImplHandlerJpegHandlerProperties`
--
INSERT INTO `comDayCqDamCoreImplHandlerJpegHandlerProperties`(`cq.dam.enable.ext.meta.extraction`, `large_file_threshold`, `large_comment_threshold`) VALUES (?, ?, ?);

--
-- UPDATE template for table `comDayCqDamCoreImplHandlerJpegHandlerProperties`
--
UPDATE `comDayCqDamCoreImplHandlerJpegHandlerProperties` SET `cq.dam.enable.ext.meta.extraction` = ?, `large_file_threshold` = ?, `large_comment_threshold` = ? WHERE 1;

--
-- DELETE template for table `comDayCqDamCoreImplHandlerJpegHandlerProperties`
--
DELETE FROM `comDayCqDamCoreImplHandlerJpegHandlerProperties` WHERE 0;

