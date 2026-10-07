--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comDayCqDamScene7ImplScene7APIClientImplProperties' definition.
--


--
-- SELECT template for table `comDayCqDamScene7ImplScene7APIClientImplProperties`
--
SELECT `cq.dam.scene7.apiclient.recordsperpage.nofilter.name`, `cq.dam.scene7.apiclient.recordsperpage.withfilter.name` FROM `comDayCqDamScene7ImplScene7APIClientImplProperties` WHERE 1;

--
-- INSERT template for table `comDayCqDamScene7ImplScene7APIClientImplProperties`
--
INSERT INTO `comDayCqDamScene7ImplScene7APIClientImplProperties`(`cq.dam.scene7.apiclient.recordsperpage.nofilter.name`, `cq.dam.scene7.apiclient.recordsperpage.withfilter.name`) VALUES (?, ?);

--
-- UPDATE template for table `comDayCqDamScene7ImplScene7APIClientImplProperties`
--
UPDATE `comDayCqDamScene7ImplScene7APIClientImplProperties` SET `cq.dam.scene7.apiclient.recordsperpage.nofilter.name` = ?, `cq.dam.scene7.apiclient.recordsperpage.withfilter.name` = ? WHERE 1;

--
-- DELETE template for table `comDayCqDamScene7ImplScene7APIClientImplProperties`
--
DELETE FROM `comDayCqDamScene7ImplScene7APIClientImplProperties` WHERE 0;

