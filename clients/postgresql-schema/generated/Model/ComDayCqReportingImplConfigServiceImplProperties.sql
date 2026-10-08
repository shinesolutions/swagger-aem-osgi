--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comDayCqReportingImplConfigServiceImplProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_day_cq_reporting_impl_config_service_impl_properties'
--
SELECT repconf/timezone, repconf/locale, repconf/snapshots, repconf/repdir, repconf/hourofday, repconf/minofhour, repconf/maxrows, repconf/fakedata, repconf/snapshotuser, repconf/enforcesnapshotuser FROM com_day_cq_reporting_impl_config_service_impl_properties WHERE 1=1;

--
-- INSERT template for table 'com_day_cq_reporting_impl_config_service_impl_properties'
--
INSERT INTO com_day_cq_reporting_impl_config_service_impl_properties (repconf/timezone, repconf/locale, repconf/snapshots, repconf/repdir, repconf/hourofday, repconf/minofhour, repconf/maxrows, repconf/fakedata, repconf/snapshotuser, repconf/enforcesnapshotuser) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table 'com_day_cq_reporting_impl_config_service_impl_properties'
--
UPDATE com_day_cq_reporting_impl_config_service_impl_properties SET repconf/timezone = ?, repconf/locale = ?, repconf/snapshots = ?, repconf/repdir = ?, repconf/hourofday = ?, repconf/minofhour = ?, repconf/maxrows = ?, repconf/fakedata = ?, repconf/snapshotuser = ?, repconf/enforcesnapshotuser = ? WHERE 1=2;

--
-- DELETE template for table 'com_day_cq_reporting_impl_config_service_impl_properties'
--
DELETE FROM com_day_cq_reporting_impl_config_service_impl_properties WHERE 1=2;

