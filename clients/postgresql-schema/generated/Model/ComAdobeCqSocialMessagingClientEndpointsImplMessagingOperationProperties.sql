--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_adobe_cq_social_messaging_client_endpoints_impl_messaging_o'
--
SELECT message/properties, message_box_size_limit, message_count_limit, notify_failure, failure_message_from, failure_template_path, max_retries, min_wait_between_retries, count_update_pool_size, inbox/path, sentitems/path, support_attachments, support_group_messaging, max_total_recipients, batch_size, max_total_attachment_size, attachment_type_blacklist, allowed_attachment_types, service_selector, field_whitelist FROM com_adobe_cq_social_messaging_client_endpoints_impl_messaging_o WHERE 1=1;

--
-- INSERT template for table 'com_adobe_cq_social_messaging_client_endpoints_impl_messaging_o'
--
INSERT INTO com_adobe_cq_social_messaging_client_endpoints_impl_messaging_o (message/properties, message_box_size_limit, message_count_limit, notify_failure, failure_message_from, failure_template_path, max_retries, min_wait_between_retries, count_update_pool_size, inbox/path, sentitems/path, support_attachments, support_group_messaging, max_total_recipients, batch_size, max_total_attachment_size, attachment_type_blacklist, allowed_attachment_types, service_selector, field_whitelist) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table 'com_adobe_cq_social_messaging_client_endpoints_impl_messaging_o'
--
UPDATE com_adobe_cq_social_messaging_client_endpoints_impl_messaging_o SET message/properties = ?, message_box_size_limit = ?, message_count_limit = ?, notify_failure = ?, failure_message_from = ?, failure_template_path = ?, max_retries = ?, min_wait_between_retries = ?, count_update_pool_size = ?, inbox/path = ?, sentitems/path = ?, support_attachments = ?, support_group_messaging = ?, max_total_recipients = ?, batch_size = ?, max_total_attachment_size = ?, attachment_type_blacklist = ?, allowed_attachment_types = ?, service_selector = ?, field_whitelist = ? WHERE 1=2;

--
-- DELETE template for table 'com_adobe_cq_social_messaging_client_endpoints_impl_messaging_o'
--
DELETE FROM com_adobe_cq_social_messaging_client_endpoints_impl_messaging_o WHERE 1=2;

