--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'adaptiveFormAndInteractiveCommunicationWebChannelConfigurationInfo' definition.
--


--
-- SELECT template for table `adaptiveFormAndInteractiveCommunicationWebChannelConfigurationIn`
--
SELECT `pid`, `title`, `description`, `properties` FROM `adaptiveFormAndInteractiveCommunicationWebChannelConfigurationIn` WHERE 1;

--
-- INSERT template for table `adaptiveFormAndInteractiveCommunicationWebChannelConfigurationIn`
--
INSERT INTO `adaptiveFormAndInteractiveCommunicationWebChannelConfigurationIn`(`pid`, `title`, `description`, `properties`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `adaptiveFormAndInteractiveCommunicationWebChannelConfigurationIn`
--
UPDATE `adaptiveFormAndInteractiveCommunicationWebChannelConfigurationIn` SET `pid` = ?, `title` = ?, `description` = ?, `properties` = ? WHERE 1;

--
-- DELETE template for table `adaptiveFormAndInteractiveCommunicationWebChannelConfigurationIn`
--
DELETE FROM `adaptiveFormAndInteractiveCommunicationWebChannelConfigurationIn` WHERE 0;

