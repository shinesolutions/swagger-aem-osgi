--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comAdobeGraniteCsrfImplCSRFFilterProperties' definition.
--


--
-- SELECT template for table `comAdobeGraniteCsrfImplCSRFFilterProperties`
--
SELECT `filter.methods`, `filter.enable.safe.user.agents`, `filter.safe.user.agents`, `filter.excluded.paths` FROM `comAdobeGraniteCsrfImplCSRFFilterProperties` WHERE 1;

--
-- INSERT template for table `comAdobeGraniteCsrfImplCSRFFilterProperties`
--
INSERT INTO `comAdobeGraniteCsrfImplCSRFFilterProperties`(`filter.methods`, `filter.enable.safe.user.agents`, `filter.safe.user.agents`, `filter.excluded.paths`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `comAdobeGraniteCsrfImplCSRFFilterProperties`
--
UPDATE `comAdobeGraniteCsrfImplCSRFFilterProperties` SET `filter.methods` = ?, `filter.enable.safe.user.agents` = ?, `filter.safe.user.agents` = ?, `filter.excluded.paths` = ? WHERE 1;

--
-- DELETE template for table `comAdobeGraniteCsrfImplCSRFFilterProperties`
--
DELETE FROM `comAdobeGraniteCsrfImplCSRFFilterProperties` WHERE 0;

