--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comAdobeGraniteCompatrouterImplRoutingConfigInfo' definition.
--


--
-- SELECT template for table `comAdobeGraniteCompatrouterImplRoutingConfigInfo`
--
SELECT `pid`, `title`, `description`, `properties` FROM `comAdobeGraniteCompatrouterImplRoutingConfigInfo` WHERE 1;

--
-- INSERT template for table `comAdobeGraniteCompatrouterImplRoutingConfigInfo`
--
INSERT INTO `comAdobeGraniteCompatrouterImplRoutingConfigInfo`(`pid`, `title`, `description`, `properties`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `comAdobeGraniteCompatrouterImplRoutingConfigInfo`
--
UPDATE `comAdobeGraniteCompatrouterImplRoutingConfigInfo` SET `pid` = ?, `title` = ?, `description` = ?, `properties` = ? WHERE 1;

--
-- DELETE template for table `comAdobeGraniteCompatrouterImplRoutingConfigInfo`
--
DELETE FROM `comAdobeGraniteCompatrouterImplRoutingConfigInfo` WHERE 0;

