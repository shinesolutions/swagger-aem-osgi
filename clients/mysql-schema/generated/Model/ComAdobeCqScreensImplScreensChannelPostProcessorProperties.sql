--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comAdobeCqScreensImplScreensChannelPostProcessorProperties' definition.
--


--
-- SELECT template for table `comAdobeCqScreensImplScreensChannelPostProcessorProperties`
--
SELECT `screens.channels.properties.to.remove` FROM `comAdobeCqScreensImplScreensChannelPostProcessorProperties` WHERE 1;

--
-- INSERT template for table `comAdobeCqScreensImplScreensChannelPostProcessorProperties`
--
INSERT INTO `comAdobeCqScreensImplScreensChannelPostProcessorProperties`(`screens.channels.properties.to.remove`) VALUES (?);

--
-- UPDATE template for table `comAdobeCqScreensImplScreensChannelPostProcessorProperties`
--
UPDATE `comAdobeCqScreensImplScreensChannelPostProcessorProperties` SET `screens.channels.properties.to.remove` = ? WHERE 1;

--
-- DELETE template for table `comAdobeCqScreensImplScreensChannelPostProcessorProperties`
--
DELETE FROM `comAdobeCqScreensImplScreensChannelPostProcessorProperties` WHERE 0;

