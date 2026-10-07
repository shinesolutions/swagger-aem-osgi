--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comAdobeCqScreensImplHandlerChannelsUpdateHandlerProperties' definition.
--


--
-- SELECT template for table `comAdobeCqScreensImplHandlerChannelsUpdateHandlerProperties`
--
SELECT `cq.pagesupdatehandler.imageresourcetypes`, `cq.pagesupdatehandler.productresourcetypes`, `cq.pagesupdatehandler.videoresourcetypes`, `cq.pagesupdatehandler.dynamicsequenceresourcetypes`, `cq.pagesupdatehandler.previewmodepaths` FROM `comAdobeCqScreensImplHandlerChannelsUpdateHandlerProperties` WHERE 1;

--
-- INSERT template for table `comAdobeCqScreensImplHandlerChannelsUpdateHandlerProperties`
--
INSERT INTO `comAdobeCqScreensImplHandlerChannelsUpdateHandlerProperties`(`cq.pagesupdatehandler.imageresourcetypes`, `cq.pagesupdatehandler.productresourcetypes`, `cq.pagesupdatehandler.videoresourcetypes`, `cq.pagesupdatehandler.dynamicsequenceresourcetypes`, `cq.pagesupdatehandler.previewmodepaths`) VALUES (?, ?, ?, ?, ?);

--
-- UPDATE template for table `comAdobeCqScreensImplHandlerChannelsUpdateHandlerProperties`
--
UPDATE `comAdobeCqScreensImplHandlerChannelsUpdateHandlerProperties` SET `cq.pagesupdatehandler.imageresourcetypes` = ?, `cq.pagesupdatehandler.productresourcetypes` = ?, `cq.pagesupdatehandler.videoresourcetypes` = ?, `cq.pagesupdatehandler.dynamicsequenceresourcetypes` = ?, `cq.pagesupdatehandler.previewmodepaths` = ? WHERE 1;

--
-- DELETE template for table `comAdobeCqScreensImplHandlerChannelsUpdateHandlerProperties`
--
DELETE FROM `comAdobeCqScreensImplHandlerChannelsUpdateHandlerProperties` WHERE 0;

