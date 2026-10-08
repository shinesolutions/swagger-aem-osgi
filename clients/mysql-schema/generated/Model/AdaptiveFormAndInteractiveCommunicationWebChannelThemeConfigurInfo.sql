--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'adaptiveFormAndInteractiveCommunicationWebChannelThemeConfigurInfo' definition.
--


--
-- SELECT template for table `adaptiveFormAndInteractiveCommunicationWebChannelThemeConfigurIn`
--
SELECT `pid`, `title`, `description`, `properties` FROM `adaptiveFormAndInteractiveCommunicationWebChannelThemeConfigurIn` WHERE 1;

--
-- INSERT template for table `adaptiveFormAndInteractiveCommunicationWebChannelThemeConfigurIn`
--
INSERT INTO `adaptiveFormAndInteractiveCommunicationWebChannelThemeConfigurIn`(`pid`, `title`, `description`, `properties`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `adaptiveFormAndInteractiveCommunicationWebChannelThemeConfigurIn`
--
UPDATE `adaptiveFormAndInteractiveCommunicationWebChannelThemeConfigurIn` SET `pid` = ?, `title` = ?, `description` = ?, `properties` = ? WHERE 1;

--
-- DELETE template for table `adaptiveFormAndInteractiveCommunicationWebChannelThemeConfigurIn`
--
DELETE FROM `adaptiveFormAndInteractiveCommunicationWebChannelThemeConfigurIn` WHERE 0;

