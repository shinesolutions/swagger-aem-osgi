--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comAdobeGraniteCompatrouterImplCompatSwitchingServiceImplProperties' definition.
--


--
-- SELECT template for table `comAdobeGraniteCompatrouterImplCompatSwitchingServiceImplPropert`
--
SELECT `compatgroups`, `enabled` FROM `comAdobeGraniteCompatrouterImplCompatSwitchingServiceImplPropert` WHERE 1;

--
-- INSERT template for table `comAdobeGraniteCompatrouterImplCompatSwitchingServiceImplPropert`
--
INSERT INTO `comAdobeGraniteCompatrouterImplCompatSwitchingServiceImplPropert`(`compatgroups`, `enabled`) VALUES (?, ?);

--
-- UPDATE template for table `comAdobeGraniteCompatrouterImplCompatSwitchingServiceImplPropert`
--
UPDATE `comAdobeGraniteCompatrouterImplCompatSwitchingServiceImplPropert` SET `compatgroups` = ?, `enabled` = ? WHERE 1;

--
-- DELETE template for table `comAdobeGraniteCompatrouterImplCompatSwitchingServiceImplPropert`
--
DELETE FROM `comAdobeGraniteCompatrouterImplCompatSwitchingServiceImplPropert` WHERE 0;

