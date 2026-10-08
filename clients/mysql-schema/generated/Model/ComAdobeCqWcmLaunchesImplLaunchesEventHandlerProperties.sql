--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comAdobeCqWcmLaunchesImplLaunchesEventHandlerProperties' definition.
--


--
-- SELECT template for table `comAdobeCqWcmLaunchesImplLaunchesEventHandlerProperties`
--
SELECT `event.filter`, `launches.eventhandler.threadpool.maxsize`, `launches.eventhandler.threadpool.priority`, `launches.eventhandler.updatelastmodification` FROM `comAdobeCqWcmLaunchesImplLaunchesEventHandlerProperties` WHERE 1;

--
-- INSERT template for table `comAdobeCqWcmLaunchesImplLaunchesEventHandlerProperties`
--
INSERT INTO `comAdobeCqWcmLaunchesImplLaunchesEventHandlerProperties`(`event.filter`, `launches.eventhandler.threadpool.maxsize`, `launches.eventhandler.threadpool.priority`, `launches.eventhandler.updatelastmodification`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `comAdobeCqWcmLaunchesImplLaunchesEventHandlerProperties`
--
UPDATE `comAdobeCqWcmLaunchesImplLaunchesEventHandlerProperties` SET `event.filter` = ?, `launches.eventhandler.threadpool.maxsize` = ?, `launches.eventhandler.threadpool.priority` = ?, `launches.eventhandler.updatelastmodification` = ? WHERE 1;

--
-- DELETE template for table `comAdobeCqWcmLaunchesImplLaunchesEventHandlerProperties`
--
DELETE FROM `comAdobeCqWcmLaunchesImplLaunchesEventHandlerProperties` WHERE 0;

