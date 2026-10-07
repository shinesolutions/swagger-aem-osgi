--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comAdobeCqSocialUgcbaseSecurityImplDefaultAttachmentTypeBlackliProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_adobe_cq_social_ugcbase_security_impl_default_attachment_ty'
--
SELECT default/attachment/type/blacklist, baseline/attachment/type/blacklist FROM com_adobe_cq_social_ugcbase_security_impl_default_attachment_ty WHERE 1=1;

--
-- INSERT template for table 'com_adobe_cq_social_ugcbase_security_impl_default_attachment_ty'
--
INSERT INTO com_adobe_cq_social_ugcbase_security_impl_default_attachment_ty (default/attachment/type/blacklist, baseline/attachment/type/blacklist) VALUES (?, ?);

--
-- UPDATE template for table 'com_adobe_cq_social_ugcbase_security_impl_default_attachment_ty'
--
UPDATE com_adobe_cq_social_ugcbase_security_impl_default_attachment_ty SET default/attachment/type/blacklist = ?, baseline/attachment/type/blacklist = ? WHERE 1=2;

--
-- DELETE template for table 'com_adobe_cq_social_ugcbase_security_impl_default_attachment_ty'
--
DELETE FROM com_adobe_cq_social_ugcbase_security_impl_default_attachment_ty WHERE 1=2;

