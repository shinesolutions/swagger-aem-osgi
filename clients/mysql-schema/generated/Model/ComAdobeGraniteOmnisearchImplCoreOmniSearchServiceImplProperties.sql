--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comAdobeGraniteOmnisearchImplCoreOmniSearchServiceImplProperties' definition.
--


--
-- SELECT template for table `comAdobeGraniteOmnisearchImplCoreOmniSearchServiceImplProperties`
--
SELECT `omnisearch.suggestion.requiretext.min`, `omnisearch.suggestion.spellcheck.require` FROM `comAdobeGraniteOmnisearchImplCoreOmniSearchServiceImplProperties` WHERE 1;

--
-- INSERT template for table `comAdobeGraniteOmnisearchImplCoreOmniSearchServiceImplProperties`
--
INSERT INTO `comAdobeGraniteOmnisearchImplCoreOmniSearchServiceImplProperties`(`omnisearch.suggestion.requiretext.min`, `omnisearch.suggestion.spellcheck.require`) VALUES (?, ?);

--
-- UPDATE template for table `comAdobeGraniteOmnisearchImplCoreOmniSearchServiceImplProperties`
--
UPDATE `comAdobeGraniteOmnisearchImplCoreOmniSearchServiceImplProperties` SET `omnisearch.suggestion.requiretext.min` = ?, `omnisearch.suggestion.spellcheck.require` = ? WHERE 1;

--
-- DELETE template for table `comAdobeGraniteOmnisearchImplCoreOmniSearchServiceImplProperties`
--
DELETE FROM `comAdobeGraniteOmnisearchImplCoreOmniSearchServiceImplProperties` WHERE 0;

