--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comAdobeCqDamS7imagingImplIsImageServerComponentProperties' definition.
--


--
-- SELECT template for table `comAdobeCqDamS7imagingImplIsImageServerComponentProperties`
--
SELECT `TcpPort`, `AllowRemoteAccess`, `MaxRenderRgnPixels`, `MaxMessageSize`, `RandomAccessUrlTimeout`, `WorkerThreads` FROM `comAdobeCqDamS7imagingImplIsImageServerComponentProperties` WHERE 1;

--
-- INSERT template for table `comAdobeCqDamS7imagingImplIsImageServerComponentProperties`
--
INSERT INTO `comAdobeCqDamS7imagingImplIsImageServerComponentProperties`(`TcpPort`, `AllowRemoteAccess`, `MaxRenderRgnPixels`, `MaxMessageSize`, `RandomAccessUrlTimeout`, `WorkerThreads`) VALUES (?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `comAdobeCqDamS7imagingImplIsImageServerComponentProperties`
--
UPDATE `comAdobeCqDamS7imagingImplIsImageServerComponentProperties` SET `TcpPort` = ?, `AllowRemoteAccess` = ?, `MaxRenderRgnPixels` = ?, `MaxMessageSize` = ?, `RandomAccessUrlTimeout` = ?, `WorkerThreads` = ? WHERE 1;

--
-- DELETE template for table `comAdobeCqDamS7imagingImplIsImageServerComponentProperties`
--
DELETE FROM `comAdobeCqDamS7imagingImplIsImageServerComponentProperties` WHERE 0;

