--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'orgApacheSlingJcrJackrabbitServerJndiRegistrationSupportProperties' definition.
--


--
-- SELECT template for table `orgApacheSlingJcrJackrabbitServerJndiRegistrationSupportProperti`
--
SELECT `java.naming.factory.initial`, `java.naming.provider.url` FROM `orgApacheSlingJcrJackrabbitServerJndiRegistrationSupportProperti` WHERE 1;

--
-- INSERT template for table `orgApacheSlingJcrJackrabbitServerJndiRegistrationSupportProperti`
--
INSERT INTO `orgApacheSlingJcrJackrabbitServerJndiRegistrationSupportProperti`(`java.naming.factory.initial`, `java.naming.provider.url`) VALUES (?, ?);

--
-- UPDATE template for table `orgApacheSlingJcrJackrabbitServerJndiRegistrationSupportProperti`
--
UPDATE `orgApacheSlingJcrJackrabbitServerJndiRegistrationSupportProperti` SET `java.naming.factory.initial` = ?, `java.naming.provider.url` = ? WHERE 1;

--
-- DELETE template for table `orgApacheSlingJcrJackrabbitServerJndiRegistrationSupportProperti`
--
DELETE FROM `orgApacheSlingJcrJackrabbitServerJndiRegistrationSupportProperti` WHERE 0;

