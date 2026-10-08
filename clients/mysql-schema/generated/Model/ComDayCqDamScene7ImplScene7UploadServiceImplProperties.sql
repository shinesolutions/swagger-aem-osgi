--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comDayCqDamScene7ImplScene7UploadServiceImplProperties' definition.
--


--
-- SELECT template for table `comDayCqDamScene7ImplScene7UploadServiceImplProperties`
--
SELECT `cq.dam.scene7.uploadservice.activejobtimeout.label`, `cq.dam.scene7.uploadservice.connectionmaxperroute.label` FROM `comDayCqDamScene7ImplScene7UploadServiceImplProperties` WHERE 1;

--
-- INSERT template for table `comDayCqDamScene7ImplScene7UploadServiceImplProperties`
--
INSERT INTO `comDayCqDamScene7ImplScene7UploadServiceImplProperties`(`cq.dam.scene7.uploadservice.activejobtimeout.label`, `cq.dam.scene7.uploadservice.connectionmaxperroute.label`) VALUES (?, ?);

--
-- UPDATE template for table `comDayCqDamScene7ImplScene7UploadServiceImplProperties`
--
UPDATE `comDayCqDamScene7ImplScene7UploadServiceImplProperties` SET `cq.dam.scene7.uploadservice.activejobtimeout.label` = ?, `cq.dam.scene7.uploadservice.connectionmaxperroute.label` = ? WHERE 1;

--
-- DELETE template for table `comDayCqDamScene7ImplScene7UploadServiceImplProperties`
--
DELETE FROM `comDayCqDamScene7ImplScene7UploadServiceImplProperties` WHERE 0;

