--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comDayCqWidgetImplHtmlLibraryManagerImplProperties' definition.
--


--
-- SELECT template for table `comDayCqWidgetImplHtmlLibraryManagerImplProperties`
--
SELECT `htmllibmanager.clientmanager`, `htmllibmanager.debug`, `htmllibmanager.debug.console`, `htmllibmanager.debug.init.js`, `htmllibmanager.defaultthemename`, `htmllibmanager.defaultuserthemename`, `htmllibmanager.firebuglite.path`, `htmllibmanager.forceCQUrlInfo`, `htmllibmanager.gzip`, `htmllibmanager.maxage`, `htmllibmanager.maxDataUriSize`, `htmllibmanager.minify`, `htmllibmanager.path.list`, `htmllibmanager.timing` FROM `comDayCqWidgetImplHtmlLibraryManagerImplProperties` WHERE 1;

--
-- INSERT template for table `comDayCqWidgetImplHtmlLibraryManagerImplProperties`
--
INSERT INTO `comDayCqWidgetImplHtmlLibraryManagerImplProperties`(`htmllibmanager.clientmanager`, `htmllibmanager.debug`, `htmllibmanager.debug.console`, `htmllibmanager.debug.init.js`, `htmllibmanager.defaultthemename`, `htmllibmanager.defaultuserthemename`, `htmllibmanager.firebuglite.path`, `htmllibmanager.forceCQUrlInfo`, `htmllibmanager.gzip`, `htmllibmanager.maxage`, `htmllibmanager.maxDataUriSize`, `htmllibmanager.minify`, `htmllibmanager.path.list`, `htmllibmanager.timing`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `comDayCqWidgetImplHtmlLibraryManagerImplProperties`
--
UPDATE `comDayCqWidgetImplHtmlLibraryManagerImplProperties` SET `htmllibmanager.clientmanager` = ?, `htmllibmanager.debug` = ?, `htmllibmanager.debug.console` = ?, `htmllibmanager.debug.init.js` = ?, `htmllibmanager.defaultthemename` = ?, `htmllibmanager.defaultuserthemename` = ?, `htmllibmanager.firebuglite.path` = ?, `htmllibmanager.forceCQUrlInfo` = ?, `htmllibmanager.gzip` = ?, `htmllibmanager.maxage` = ?, `htmllibmanager.maxDataUriSize` = ?, `htmllibmanager.minify` = ?, `htmllibmanager.path.list` = ?, `htmllibmanager.timing` = ? WHERE 1;

--
-- DELETE template for table `comDayCqWidgetImplHtmlLibraryManagerImplProperties`
--
DELETE FROM `comDayCqWidgetImplHtmlLibraryManagerImplProperties` WHERE 0;

