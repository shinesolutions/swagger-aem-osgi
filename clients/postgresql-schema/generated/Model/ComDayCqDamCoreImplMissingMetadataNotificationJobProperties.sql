--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comDayCqDamCoreImplMissingMetadataNotificationJobProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_day_cq_dam_core_impl_missing_metadata_notification_job_prop'
--
SELECT cq/dam/missingmetadata/notification/scheduler/istimebased, cq/dam/missingmetadata/notification/scheduler/timebased/rule, cq/dam/missingmetadata/notification/scheduler/period/rule, cq/dam/missingmetadata/notification/recipient FROM com_day_cq_dam_core_impl_missing_metadata_notification_job_prop WHERE 1=1;

--
-- INSERT template for table 'com_day_cq_dam_core_impl_missing_metadata_notification_job_prop'
--
INSERT INTO com_day_cq_dam_core_impl_missing_metadata_notification_job_prop (cq/dam/missingmetadata/notification/scheduler/istimebased, cq/dam/missingmetadata/notification/scheduler/timebased/rule, cq/dam/missingmetadata/notification/scheduler/period/rule, cq/dam/missingmetadata/notification/recipient) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table 'com_day_cq_dam_core_impl_missing_metadata_notification_job_prop'
--
UPDATE com_day_cq_dam_core_impl_missing_metadata_notification_job_prop SET cq/dam/missingmetadata/notification/scheduler/istimebased = ?, cq/dam/missingmetadata/notification/scheduler/timebased/rule = ?, cq/dam/missingmetadata/notification/scheduler/period/rule = ?, cq/dam/missingmetadata/notification/recipient = ? WHERE 1=2;

--
-- DELETE template for table 'com_day_cq_dam_core_impl_missing_metadata_notification_job_prop'
--
DELETE FROM com_day_cq_dam_core_impl_missing_metadata_notification_job_prop WHERE 1=2;

