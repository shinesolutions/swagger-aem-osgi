--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'adaptiveFormAndInteractiveCommunicationWebChannelConfigurationProperties' definition.
--


--
-- SELECT template for table `adaptiveFormAndInteractiveCommunicationWebChannelConfigurationPr`
--
SELECT `showPlaceholder`, `maximumCacheEntries`, `af.scripting.compatversion`, `makeFileNameUnique`, `generatingCompliantData` FROM `adaptiveFormAndInteractiveCommunicationWebChannelConfigurationPr` WHERE 1;

--
-- INSERT template for table `adaptiveFormAndInteractiveCommunicationWebChannelConfigurationPr`
--
INSERT INTO `adaptiveFormAndInteractiveCommunicationWebChannelConfigurationPr`(`showPlaceholder`, `maximumCacheEntries`, `af.scripting.compatversion`, `makeFileNameUnique`, `generatingCompliantData`) VALUES (?, ?, ?, ?, ?);

--
-- UPDATE template for table `adaptiveFormAndInteractiveCommunicationWebChannelConfigurationPr`
--
UPDATE `adaptiveFormAndInteractiveCommunicationWebChannelConfigurationPr` SET `showPlaceholder` = ?, `maximumCacheEntries` = ?, `af.scripting.compatversion` = ?, `makeFileNameUnique` = ?, `generatingCompliantData` = ? WHERE 1;

--
-- DELETE template for table `adaptiveFormAndInteractiveCommunicationWebChannelConfigurationPr`
--
DELETE FROM `adaptiveFormAndInteractiveCommunicationWebChannelConfigurationPr` WHERE 0;

