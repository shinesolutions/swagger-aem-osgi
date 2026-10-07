--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comAdobeCqSocialUgcbaseSecurityImplDefaultAttachmentTypeBlackliInfo' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_adobe_cq_social_ugcbase_security_impl_default_attachment_ty'
--
SELECT pid, title, description, properties FROM com_adobe_cq_social_ugcbase_security_impl_default_attachment_ty WHERE 1=1;

--
-- INSERT template for table 'com_adobe_cq_social_ugcbase_security_impl_default_attachment_ty'
--
INSERT INTO com_adobe_cq_social_ugcbase_security_impl_default_attachment_ty (pid, title, description, properties) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table 'com_adobe_cq_social_ugcbase_security_impl_default_attachment_ty'
--
UPDATE com_adobe_cq_social_ugcbase_security_impl_default_attachment_ty SET pid = ?, title = ?, description = ?, properties = ? WHERE 1=2;

--
-- DELETE template for table 'com_adobe_cq_social_ugcbase_security_impl_default_attachment_ty'
--
DELETE FROM com_adobe_cq_social_ugcbase_security_impl_default_attachment_ty WHERE 1=2;

