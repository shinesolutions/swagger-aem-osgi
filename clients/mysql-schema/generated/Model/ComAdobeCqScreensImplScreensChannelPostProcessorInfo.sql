--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comAdobeCqScreensImplScreensChannelPostProcessorInfo' definition.
--


--
-- SELECT template for table `comAdobeCqScreensImplScreensChannelPostProcessorInfo`
--
SELECT `pid`, `title`, `description`, `properties` FROM `comAdobeCqScreensImplScreensChannelPostProcessorInfo` WHERE 1;

--
-- INSERT template for table `comAdobeCqScreensImplScreensChannelPostProcessorInfo`
--
INSERT INTO `comAdobeCqScreensImplScreensChannelPostProcessorInfo`(`pid`, `title`, `description`, `properties`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `comAdobeCqScreensImplScreensChannelPostProcessorInfo`
--
UPDATE `comAdobeCqScreensImplScreensChannelPostProcessorInfo` SET `pid` = ?, `title` = ?, `description` = ?, `properties` = ? WHERE 1;

--
-- DELETE template for table `comAdobeCqScreensImplScreensChannelPostProcessorInfo`
--
DELETE FROM `comAdobeCqScreensImplScreensChannelPostProcessorInfo` WHERE 0;

