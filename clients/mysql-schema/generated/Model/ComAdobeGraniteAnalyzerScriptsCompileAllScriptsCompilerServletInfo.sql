--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comAdobeGraniteAnalyzerScriptsCompileAllScriptsCompilerServletInfo' definition.
--


--
-- SELECT template for table `comAdobeGraniteAnalyzerScriptsCompileAllScriptsCompilerServletIn`
--
SELECT `pid`, `title`, `description`, `properties`, `bundle_location`, `service_location` FROM `comAdobeGraniteAnalyzerScriptsCompileAllScriptsCompilerServletIn` WHERE 1;

--
-- INSERT template for table `comAdobeGraniteAnalyzerScriptsCompileAllScriptsCompilerServletIn`
--
INSERT INTO `comAdobeGraniteAnalyzerScriptsCompileAllScriptsCompilerServletIn`(`pid`, `title`, `description`, `properties`, `bundle_location`, `service_location`) VALUES (?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `comAdobeGraniteAnalyzerScriptsCompileAllScriptsCompilerServletIn`
--
UPDATE `comAdobeGraniteAnalyzerScriptsCompileAllScriptsCompilerServletIn` SET `pid` = ?, `title` = ?, `description` = ?, `properties` = ?, `bundle_location` = ?, `service_location` = ? WHERE 1;

--
-- DELETE template for table `comAdobeGraniteAnalyzerScriptsCompileAllScriptsCompilerServletIn`
--
DELETE FROM `comAdobeGraniteAnalyzerScriptsCompileAllScriptsCompilerServletIn` WHERE 0;

