--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comAdobeGraniteCompatrouterImplRoutingConfigProperties' definition.
--


--
-- SELECT template for table `comAdobeGraniteCompatrouterImplRoutingConfigProperties`
--
SELECT `id`, `compatPath`, `newPath` FROM `comAdobeGraniteCompatrouterImplRoutingConfigProperties` WHERE 1;

--
-- INSERT template for table `comAdobeGraniteCompatrouterImplRoutingConfigProperties`
--
INSERT INTO `comAdobeGraniteCompatrouterImplRoutingConfigProperties`(`id`, `compatPath`, `newPath`) VALUES (?, ?, ?);

--
-- UPDATE template for table `comAdobeGraniteCompatrouterImplRoutingConfigProperties`
--
UPDATE `comAdobeGraniteCompatrouterImplRoutingConfigProperties` SET `id` = ?, `compatPath` = ?, `newPath` = ? WHERE 1;

--
-- DELETE template for table `comAdobeGraniteCompatrouterImplRoutingConfigProperties`
--
DELETE FROM `comAdobeGraniteCompatrouterImplRoutingConfigProperties` WHERE 0;

