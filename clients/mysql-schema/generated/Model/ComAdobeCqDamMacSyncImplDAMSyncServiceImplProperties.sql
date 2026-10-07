--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comAdobeCqDamMacSyncImplDAMSyncServiceImplProperties' definition.
--


--
-- SELECT template for table `comAdobeCqDamMacSyncImplDAMSyncServiceImplProperties`
--
SELECT `com.adobe.cq.dam.mac.sync.damsyncservice.registered_paths`, `com.adobe.cq.dam.mac.sync.damsyncservice.sync.renditions`, `com.adobe.cq.dam.mac.sync.damsyncservice.replicate.thread.wait.m`, `com.adobe.cq.dam.mac.sync.damsyncservice.platform` FROM `comAdobeCqDamMacSyncImplDAMSyncServiceImplProperties` WHERE 1;

--
-- INSERT template for table `comAdobeCqDamMacSyncImplDAMSyncServiceImplProperties`
--
INSERT INTO `comAdobeCqDamMacSyncImplDAMSyncServiceImplProperties`(`com.adobe.cq.dam.mac.sync.damsyncservice.registered_paths`, `com.adobe.cq.dam.mac.sync.damsyncservice.sync.renditions`, `com.adobe.cq.dam.mac.sync.damsyncservice.replicate.thread.wait.m`, `com.adobe.cq.dam.mac.sync.damsyncservice.platform`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `comAdobeCqDamMacSyncImplDAMSyncServiceImplProperties`
--
UPDATE `comAdobeCqDamMacSyncImplDAMSyncServiceImplProperties` SET `com.adobe.cq.dam.mac.sync.damsyncservice.registered_paths` = ?, `com.adobe.cq.dam.mac.sync.damsyncservice.sync.renditions` = ?, `com.adobe.cq.dam.mac.sync.damsyncservice.replicate.thread.wait.m` = ?, `com.adobe.cq.dam.mac.sync.damsyncservice.platform` = ? WHERE 1;

--
-- DELETE template for table `comAdobeCqDamMacSyncImplDAMSyncServiceImplProperties`
--
DELETE FROM `comAdobeCqDamMacSyncImplDAMSyncServiceImplProperties` WHERE 0;

