--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'orgApacheJackrabbitOakSegmentStandbyStoreStandbyStoreServiceProperties' definition.
--


--
-- SELECT template for table `orgApacheJackrabbitOakSegmentStandbyStoreStandbyStoreServiceProp`
--
SELECT `org.apache.sling.installer.configuration.persist`, `mode`, `port`, `primary.host`, `interval`, `primary.allowed-client-ip-ranges`, `secure`, `standby.readtimeout`, `standby.autoclean` FROM `orgApacheJackrabbitOakSegmentStandbyStoreStandbyStoreServiceProp` WHERE 1;

--
-- INSERT template for table `orgApacheJackrabbitOakSegmentStandbyStoreStandbyStoreServiceProp`
--
INSERT INTO `orgApacheJackrabbitOakSegmentStandbyStoreStandbyStoreServiceProp`(`org.apache.sling.installer.configuration.persist`, `mode`, `port`, `primary.host`, `interval`, `primary.allowed-client-ip-ranges`, `secure`, `standby.readtimeout`, `standby.autoclean`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `orgApacheJackrabbitOakSegmentStandbyStoreStandbyStoreServiceProp`
--
UPDATE `orgApacheJackrabbitOakSegmentStandbyStoreStandbyStoreServiceProp` SET `org.apache.sling.installer.configuration.persist` = ?, `mode` = ?, `port` = ?, `primary.host` = ?, `interval` = ?, `primary.allowed-client-ip-ranges` = ?, `secure` = ?, `standby.readtimeout` = ?, `standby.autoclean` = ? WHERE 1;

--
-- DELETE template for table `orgApacheJackrabbitOakSegmentStandbyStoreStandbyStoreServiceProp`
--
DELETE FROM `orgApacheJackrabbitOakSegmentStandbyStoreStandbyStoreServiceProp` WHERE 0;

