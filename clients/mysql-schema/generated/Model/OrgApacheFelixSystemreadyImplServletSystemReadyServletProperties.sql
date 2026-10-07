--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'orgApacheFelixSystemreadyImplServletSystemReadyServletProperties' definition.
--


--
-- SELECT template for table `orgApacheFelixSystemreadyImplServletSystemReadyServletProperties`
--
SELECT `osgi.http.whiteboard.servlet.pattern`, `osgi.http.whiteboard.context.select` FROM `orgApacheFelixSystemreadyImplServletSystemReadyServletProperties` WHERE 1;

--
-- INSERT template for table `orgApacheFelixSystemreadyImplServletSystemReadyServletProperties`
--
INSERT INTO `orgApacheFelixSystemreadyImplServletSystemReadyServletProperties`(`osgi.http.whiteboard.servlet.pattern`, `osgi.http.whiteboard.context.select`) VALUES (?, ?);

--
-- UPDATE template for table `orgApacheFelixSystemreadyImplServletSystemReadyServletProperties`
--
UPDATE `orgApacheFelixSystemreadyImplServletSystemReadyServletProperties` SET `osgi.http.whiteboard.servlet.pattern` = ?, `osgi.http.whiteboard.context.select` = ? WHERE 1;

--
-- DELETE template for table `orgApacheFelixSystemreadyImplServletSystemReadyServletProperties`
--
DELETE FROM `orgApacheFelixSystemreadyImplServletSystemReadyServletProperties` WHERE 0;

