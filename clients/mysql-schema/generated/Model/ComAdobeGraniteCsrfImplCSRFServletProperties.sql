--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comAdobeGraniteCsrfImplCSRFServletProperties' definition.
--


--
-- SELECT template for table `comAdobeGraniteCsrfImplCSRFServletProperties`
--
SELECT `csrf.token.expires.in`, `sling.auth.requirements` FROM `comAdobeGraniteCsrfImplCSRFServletProperties` WHERE 1;

--
-- INSERT template for table `comAdobeGraniteCsrfImplCSRFServletProperties`
--
INSERT INTO `comAdobeGraniteCsrfImplCSRFServletProperties`(`csrf.token.expires.in`, `sling.auth.requirements`) VALUES (?, ?);

--
-- UPDATE template for table `comAdobeGraniteCsrfImplCSRFServletProperties`
--
UPDATE `comAdobeGraniteCsrfImplCSRFServletProperties` SET `csrf.token.expires.in` = ?, `sling.auth.requirements` = ? WHERE 1;

--
-- DELETE template for table `comAdobeGraniteCsrfImplCSRFServletProperties`
--
DELETE FROM `comAdobeGraniteCsrfImplCSRFServletProperties` WHERE 0;

