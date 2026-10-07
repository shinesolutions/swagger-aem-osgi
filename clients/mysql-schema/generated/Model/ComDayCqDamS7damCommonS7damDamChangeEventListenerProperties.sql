--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comDayCqDamS7damCommonS7damDamChangeEventListenerProperties' definition.
--


--
-- SELECT template for table `comDayCqDamS7damCommonS7damDamChangeEventListenerProperties`
--
SELECT `cq.dam.s7dam.damchangeeventlistener.enabled` FROM `comDayCqDamS7damCommonS7damDamChangeEventListenerProperties` WHERE 1;

--
-- INSERT template for table `comDayCqDamS7damCommonS7damDamChangeEventListenerProperties`
--
INSERT INTO `comDayCqDamS7damCommonS7damDamChangeEventListenerProperties`(`cq.dam.s7dam.damchangeeventlistener.enabled`) VALUES (?);

--
-- UPDATE template for table `comDayCqDamS7damCommonS7damDamChangeEventListenerProperties`
--
UPDATE `comDayCqDamS7damCommonS7damDamChangeEventListenerProperties` SET `cq.dam.s7dam.damchangeeventlistener.enabled` = ? WHERE 1;

--
-- DELETE template for table `comDayCqDamS7damCommonS7damDamChangeEventListenerProperties`
--
DELETE FROM `comDayCqDamS7damCommonS7damDamChangeEventListenerProperties` WHERE 0;

