--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comAdobeFormsCommonServletTempCleanUpTaskProperties' definition.
--


--
-- SELECT template for table `comAdobeFormsCommonServletTempCleanUpTaskProperties`
--
SELECT `scheduler.expression`, `Duration for Temporary Storage`, `Duration for Anonymous Storage` FROM `comAdobeFormsCommonServletTempCleanUpTaskProperties` WHERE 1;

--
-- INSERT template for table `comAdobeFormsCommonServletTempCleanUpTaskProperties`
--
INSERT INTO `comAdobeFormsCommonServletTempCleanUpTaskProperties`(`scheduler.expression`, `Duration for Temporary Storage`, `Duration for Anonymous Storage`) VALUES (?, ?, ?);

--
-- UPDATE template for table `comAdobeFormsCommonServletTempCleanUpTaskProperties`
--
UPDATE `comAdobeFormsCommonServletTempCleanUpTaskProperties` SET `scheduler.expression` = ?, `Duration for Temporary Storage` = ?, `Duration for Anonymous Storage` = ? WHERE 1;

--
-- DELETE template for table `comAdobeFormsCommonServletTempCleanUpTaskProperties`
--
DELETE FROM `comAdobeFormsCommonServletTempCleanUpTaskProperties` WHERE 0;

