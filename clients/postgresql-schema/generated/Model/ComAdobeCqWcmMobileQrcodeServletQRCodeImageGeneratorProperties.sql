--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comAdobeCqWcmMobileQrcodeServletQRCodeImageGeneratorProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_adobe_cq_wcm_mobile_qrcode_servlet_qr_code_image_generator_'
--
SELECT cq/wcm/qrcode/servlet/whitelist FROM com_adobe_cq_wcm_mobile_qrcode_servlet_qr_code_image_generator_ WHERE 1=1;

--
-- INSERT template for table 'com_adobe_cq_wcm_mobile_qrcode_servlet_qr_code_image_generator_'
--
INSERT INTO com_adobe_cq_wcm_mobile_qrcode_servlet_qr_code_image_generator_ (cq/wcm/qrcode/servlet/whitelist) VALUES (?);

--
-- UPDATE template for table 'com_adobe_cq_wcm_mobile_qrcode_servlet_qr_code_image_generator_'
--
UPDATE com_adobe_cq_wcm_mobile_qrcode_servlet_qr_code_image_generator_ SET cq/wcm/qrcode/servlet/whitelist = ? WHERE 1=2;

--
-- DELETE template for table 'com_adobe_cq_wcm_mobile_qrcode_servlet_qr_code_image_generator_'
--
DELETE FROM com_adobe_cq_wcm_mobile_qrcode_servlet_qr_code_image_generator_ WHERE 1=2;

