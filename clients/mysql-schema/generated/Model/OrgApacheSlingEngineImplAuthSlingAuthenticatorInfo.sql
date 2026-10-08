--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'orgApacheSlingEngineImplAuthSlingAuthenticatorInfo' definition.
--


--
-- SELECT template for table `orgApacheSlingEngineImplAuthSlingAuthenticatorInfo`
--
SELECT `pid`, `title`, `description`, `properties`, `bundle_location`, `service_location` FROM `orgApacheSlingEngineImplAuthSlingAuthenticatorInfo` WHERE 1;

--
-- INSERT template for table `orgApacheSlingEngineImplAuthSlingAuthenticatorInfo`
--
INSERT INTO `orgApacheSlingEngineImplAuthSlingAuthenticatorInfo`(`pid`, `title`, `description`, `properties`, `bundle_location`, `service_location`) VALUES (?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `orgApacheSlingEngineImplAuthSlingAuthenticatorInfo`
--
UPDATE `orgApacheSlingEngineImplAuthSlingAuthenticatorInfo` SET `pid` = ?, `title` = ?, `description` = ?, `properties` = ?, `bundle_location` = ?, `service_location` = ? WHERE 1;

--
-- DELETE template for table `orgApacheSlingEngineImplAuthSlingAuthenticatorInfo`
--
DELETE FROM `orgApacheSlingEngineImplAuthSlingAuthenticatorInfo` WHERE 0;

