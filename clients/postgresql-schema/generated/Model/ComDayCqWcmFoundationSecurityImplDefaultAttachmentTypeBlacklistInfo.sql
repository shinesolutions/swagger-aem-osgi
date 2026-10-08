--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comDayCqWcmFoundationSecurityImplDefaultAttachmentTypeBlacklistInfo' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_day_cq_wcm_foundation_security_impl_default_attachment_type'
--
SELECT pid, title, description, properties FROM com_day_cq_wcm_foundation_security_impl_default_attachment_type WHERE 1=1;

--
-- INSERT template for table 'com_day_cq_wcm_foundation_security_impl_default_attachment_type'
--
INSERT INTO com_day_cq_wcm_foundation_security_impl_default_attachment_type (pid, title, description, properties) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table 'com_day_cq_wcm_foundation_security_impl_default_attachment_type'
--
UPDATE com_day_cq_wcm_foundation_security_impl_default_attachment_type SET pid = ?, title = ?, description = ?, properties = ? WHERE 1=2;

--
-- DELETE template for table 'com_day_cq_wcm_foundation_security_impl_default_attachment_type'
--
DELETE FROM com_day_cq_wcm_foundation_security_impl_default_attachment_type WHERE 1=2;

