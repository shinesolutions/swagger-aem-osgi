--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comAdobeCqDamS7imagingImplIsImageServerComponentProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_adobe_cq_dam_s7imaging_impl_is_image_server_component_prope'
--
SELECT tcp_port, allow_remote_access, max_render_rgn_pixels, max_message_size, random_access_url_timeout, worker_threads FROM com_adobe_cq_dam_s7imaging_impl_is_image_server_component_prope WHERE 1=1;

--
-- INSERT template for table 'com_adobe_cq_dam_s7imaging_impl_is_image_server_component_prope'
--
INSERT INTO com_adobe_cq_dam_s7imaging_impl_is_image_server_component_prope (tcp_port, allow_remote_access, max_render_rgn_pixels, max_message_size, random_access_url_timeout, worker_threads) VALUES (?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table 'com_adobe_cq_dam_s7imaging_impl_is_image_server_component_prope'
--
UPDATE com_adobe_cq_dam_s7imaging_impl_is_image_server_component_prope SET tcp_port = ?, allow_remote_access = ?, max_render_rgn_pixels = ?, max_message_size = ?, random_access_url_timeout = ?, worker_threads = ? WHERE 1=2;

--
-- DELETE template for table 'com_adobe_cq_dam_s7imaging_impl_is_image_server_component_prope'
--
DELETE FROM com_adobe_cq_dam_s7imaging_impl_is_image_server_component_prope WHERE 1=2;

