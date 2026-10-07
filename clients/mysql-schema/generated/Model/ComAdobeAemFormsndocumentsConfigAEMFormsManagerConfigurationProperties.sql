--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comAdobeAemFormsndocumentsConfigAEMFormsManagerConfigurationProperties' definition.
--


--
-- SELECT template for table `comAdobeAemFormsndocumentsConfigAEMFormsManagerConfigurationProp`
--
SELECT `formsManagerConfig.includeOOTBTemplates`, `formsManagerConfig.includeDeprecatedTemplates` FROM `comAdobeAemFormsndocumentsConfigAEMFormsManagerConfigurationProp` WHERE 1;

--
-- INSERT template for table `comAdobeAemFormsndocumentsConfigAEMFormsManagerConfigurationProp`
--
INSERT INTO `comAdobeAemFormsndocumentsConfigAEMFormsManagerConfigurationProp`(`formsManagerConfig.includeOOTBTemplates`, `formsManagerConfig.includeDeprecatedTemplates`) VALUES (?, ?);

--
-- UPDATE template for table `comAdobeAemFormsndocumentsConfigAEMFormsManagerConfigurationProp`
--
UPDATE `comAdobeAemFormsndocumentsConfigAEMFormsManagerConfigurationProp` SET `formsManagerConfig.includeOOTBTemplates` = ?, `formsManagerConfig.includeDeprecatedTemplates` = ? WHERE 1;

--
-- DELETE template for table `comAdobeAemFormsndocumentsConfigAEMFormsManagerConfigurationProp`
--
DELETE FROM `comAdobeAemFormsndocumentsConfigAEMFormsManagerConfigurationProp` WHERE 0;

