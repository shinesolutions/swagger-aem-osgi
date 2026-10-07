--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'orgApacheFelixWebconsoleInternalServletOsgiManagerProperties' definition.
--


--
-- SELECT template for table `orgApacheFelixWebconsoleInternalServletOsgiManagerProperties`
--
SELECT `manager.root`, `http.service.filter`, `default.render`, `realm`, `username`, `password`, `category`, `locale`, `loglevel`, `plugins` FROM `orgApacheFelixWebconsoleInternalServletOsgiManagerProperties` WHERE 1;

--
-- INSERT template for table `orgApacheFelixWebconsoleInternalServletOsgiManagerProperties`
--
INSERT INTO `orgApacheFelixWebconsoleInternalServletOsgiManagerProperties`(`manager.root`, `http.service.filter`, `default.render`, `realm`, `username`, `password`, `category`, `locale`, `loglevel`, `plugins`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `orgApacheFelixWebconsoleInternalServletOsgiManagerProperties`
--
UPDATE `orgApacheFelixWebconsoleInternalServletOsgiManagerProperties` SET `manager.root` = ?, `http.service.filter` = ?, `default.render` = ?, `realm` = ?, `username` = ?, `password` = ?, `category` = ?, `locale` = ?, `loglevel` = ?, `plugins` = ? WHERE 1;

--
-- DELETE template for table `orgApacheFelixWebconsoleInternalServletOsgiManagerProperties`
--
DELETE FROM `orgApacheFelixWebconsoleInternalServletOsgiManagerProperties` WHERE 0;

