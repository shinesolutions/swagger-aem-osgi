--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comDayCqDamScene7ImplScene7DamChangeEventListenerProperties' definition.
--


--
-- SELECT template for table `comDayCqDamScene7ImplScene7DamChangeEventListenerProperties`
--
SELECT `cq.dam.scene7.damchangeeventlistener.enabled`, `cq.dam.scene7.damchangeeventlistener.observed.paths` FROM `comDayCqDamScene7ImplScene7DamChangeEventListenerProperties` WHERE 1;

--
-- INSERT template for table `comDayCqDamScene7ImplScene7DamChangeEventListenerProperties`
--
INSERT INTO `comDayCqDamScene7ImplScene7DamChangeEventListenerProperties`(`cq.dam.scene7.damchangeeventlistener.enabled`, `cq.dam.scene7.damchangeeventlistener.observed.paths`) VALUES (?, ?);

--
-- UPDATE template for table `comDayCqDamScene7ImplScene7DamChangeEventListenerProperties`
--
UPDATE `comDayCqDamScene7ImplScene7DamChangeEventListenerProperties` SET `cq.dam.scene7.damchangeeventlistener.enabled` = ?, `cq.dam.scene7.damchangeeventlistener.observed.paths` = ? WHERE 1;

--
-- DELETE template for table `comDayCqDamScene7ImplScene7DamChangeEventListenerProperties`
--
DELETE FROM `comDayCqDamScene7ImplScene7DamChangeEventListenerProperties` WHERE 0;

