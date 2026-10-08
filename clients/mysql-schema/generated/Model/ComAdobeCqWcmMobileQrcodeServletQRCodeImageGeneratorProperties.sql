--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comAdobeCqWcmMobileQrcodeServletQRCodeImageGeneratorProperties' definition.
--


--
-- SELECT template for table `comAdobeCqWcmMobileQrcodeServletQRCodeImageGeneratorProperties`
--
SELECT `cq.wcm.qrcode.servlet.whitelist` FROM `comAdobeCqWcmMobileQrcodeServletQRCodeImageGeneratorProperties` WHERE 1;

--
-- INSERT template for table `comAdobeCqWcmMobileQrcodeServletQRCodeImageGeneratorProperties`
--
INSERT INTO `comAdobeCqWcmMobileQrcodeServletQRCodeImageGeneratorProperties`(`cq.wcm.qrcode.servlet.whitelist`) VALUES (?);

--
-- UPDATE template for table `comAdobeCqWcmMobileQrcodeServletQRCodeImageGeneratorProperties`
--
UPDATE `comAdobeCqWcmMobileQrcodeServletQRCodeImageGeneratorProperties` SET `cq.wcm.qrcode.servlet.whitelist` = ? WHERE 1;

--
-- DELETE template for table `comAdobeCqWcmMobileQrcodeServletQRCodeImageGeneratorProperties`
--
DELETE FROM `comAdobeCqWcmMobileQrcodeServletQRCodeImageGeneratorProperties` WHERE 0;

