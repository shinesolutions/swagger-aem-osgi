--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comDayCqMailerImplCqMailingServiceProperties' definition.
--


--
-- SELECT template for table `comDayCqMailerImplCqMailingServiceProperties`
--
SELECT `max.recipient.count` FROM `comDayCqMailerImplCqMailingServiceProperties` WHERE 1;

--
-- INSERT template for table `comDayCqMailerImplCqMailingServiceProperties`
--
INSERT INTO `comDayCqMailerImplCqMailingServiceProperties`(`max.recipient.count`) VALUES (?);

--
-- UPDATE template for table `comDayCqMailerImplCqMailingServiceProperties`
--
UPDATE `comDayCqMailerImplCqMailingServiceProperties` SET `max.recipient.count` = ? WHERE 1;

--
-- DELETE template for table `comDayCqMailerImplCqMailingServiceProperties`
--
DELETE FROM `comDayCqMailerImplCqMailingServiceProperties` WHERE 0;

