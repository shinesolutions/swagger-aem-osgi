--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comDayCqDamCoreImplExpiryNotificationJobImplProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_day_cq_dam_core_impl_expiry_notification_job_impl_propertie'
--
SELECT cq/dam/expiry/notification/scheduler/istimebased, cq/dam/expiry/notification/scheduler/timebased/rule, cq/dam/expiry/notification/scheduler/period/rule, send_email, asset_expired_limit, prior_notification_seconds, cq/dam/expiry/notification/url/protocol FROM com_day_cq_dam_core_impl_expiry_notification_job_impl_propertie WHERE 1=1;

--
-- INSERT template for table 'com_day_cq_dam_core_impl_expiry_notification_job_impl_propertie'
--
INSERT INTO com_day_cq_dam_core_impl_expiry_notification_job_impl_propertie (cq/dam/expiry/notification/scheduler/istimebased, cq/dam/expiry/notification/scheduler/timebased/rule, cq/dam/expiry/notification/scheduler/period/rule, send_email, asset_expired_limit, prior_notification_seconds, cq/dam/expiry/notification/url/protocol) VALUES (?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table 'com_day_cq_dam_core_impl_expiry_notification_job_impl_propertie'
--
UPDATE com_day_cq_dam_core_impl_expiry_notification_job_impl_propertie SET cq/dam/expiry/notification/scheduler/istimebased = ?, cq/dam/expiry/notification/scheduler/timebased/rule = ?, cq/dam/expiry/notification/scheduler/period/rule = ?, send_email = ?, asset_expired_limit = ?, prior_notification_seconds = ?, cq/dam/expiry/notification/url/protocol = ? WHERE 1=2;

--
-- DELETE template for table 'com_day_cq_dam_core_impl_expiry_notification_job_impl_propertie'
--
DELETE FROM com_day_cq_dam_core_impl_expiry_notification_job_impl_propertie WHERE 1=2;

