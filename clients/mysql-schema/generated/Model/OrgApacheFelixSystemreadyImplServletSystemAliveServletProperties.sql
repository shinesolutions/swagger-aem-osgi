--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'orgApacheFelixSystemreadyImplServletSystemAliveServletProperties' definition.
--


--
-- SELECT template for table `orgApacheFelixSystemreadyImplServletSystemAliveServletProperties`
--
SELECT `osgi.http.whiteboard.servlet.pattern`, `osgi.http.whiteboard.context.select` FROM `orgApacheFelixSystemreadyImplServletSystemAliveServletProperties` WHERE 1;

--
-- INSERT template for table `orgApacheFelixSystemreadyImplServletSystemAliveServletProperties`
--
INSERT INTO `orgApacheFelixSystemreadyImplServletSystemAliveServletProperties`(`osgi.http.whiteboard.servlet.pattern`, `osgi.http.whiteboard.context.select`) VALUES (?, ?);

--
-- UPDATE template for table `orgApacheFelixSystemreadyImplServletSystemAliveServletProperties`
--
UPDATE `orgApacheFelixSystemreadyImplServletSystemAliveServletProperties` SET `osgi.http.whiteboard.servlet.pattern` = ?, `osgi.http.whiteboard.context.select` = ? WHERE 1;

--
-- DELETE template for table `orgApacheFelixSystemreadyImplServletSystemAliveServletProperties`
--
DELETE FROM `orgApacheFelixSystemreadyImplServletSystemAliveServletProperties` WHERE 0;

