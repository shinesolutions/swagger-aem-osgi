--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comDayCqWcmFoundationSecurityImplDefaultAttachmentTypeBlacklistProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_day_cq_wcm_foundation_security_impl_default_attachment_type'
--
SELECT default/attachment/type/blacklist, baseline/attachment/type/blacklist FROM com_day_cq_wcm_foundation_security_impl_default_attachment_type WHERE 1=1;

--
-- INSERT template for table 'com_day_cq_wcm_foundation_security_impl_default_attachment_type'
--
INSERT INTO com_day_cq_wcm_foundation_security_impl_default_attachment_type (default/attachment/type/blacklist, baseline/attachment/type/blacklist) VALUES (?, ?);

--
-- UPDATE template for table 'com_day_cq_wcm_foundation_security_impl_default_attachment_type'
--
UPDATE com_day_cq_wcm_foundation_security_impl_default_attachment_type SET default/attachment/type/blacklist = ?, baseline/attachment/type/blacklist = ? WHERE 1=2;

--
-- DELETE template for table 'com_day_cq_wcm_foundation_security_impl_default_attachment_type'
--
DELETE FROM com_day_cq_wcm_foundation_security_impl_default_attachment_type WHERE 1=2;

