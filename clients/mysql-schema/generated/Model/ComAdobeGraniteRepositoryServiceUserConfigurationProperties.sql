--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comAdobeGraniteRepositoryServiceUserConfigurationProperties' definition.
--


--
-- SELECT template for table `comAdobeGraniteRepositoryServiceUserConfigurationProperties`
--
SELECT `service.ranking`, `serviceusers.simpleSubjectPopulation`, `serviceusers.list` FROM `comAdobeGraniteRepositoryServiceUserConfigurationProperties` WHERE 1;

--
-- INSERT template for table `comAdobeGraniteRepositoryServiceUserConfigurationProperties`
--
INSERT INTO `comAdobeGraniteRepositoryServiceUserConfigurationProperties`(`service.ranking`, `serviceusers.simpleSubjectPopulation`, `serviceusers.list`) VALUES (?, ?, ?);

--
-- UPDATE template for table `comAdobeGraniteRepositoryServiceUserConfigurationProperties`
--
UPDATE `comAdobeGraniteRepositoryServiceUserConfigurationProperties` SET `service.ranking` = ?, `serviceusers.simpleSubjectPopulation` = ?, `serviceusers.list` = ? WHERE 1;

--
-- DELETE template for table `comAdobeGraniteRepositoryServiceUserConfigurationProperties`
--
DELETE FROM `comAdobeGraniteRepositoryServiceUserConfigurationProperties` WHERE 0;

