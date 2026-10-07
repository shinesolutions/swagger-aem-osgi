--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comAdobeCqScreensDeviceImplDeviceServiceProperties' definition.
--


--
-- SELECT template for table `comAdobeCqScreensDeviceImplDeviceServiceProperties`
--
SELECT `com.adobe.aem.screens.player.pingfrequency`, `com.adobe.aem.screens.device.pasword.specialchars`, `com.adobe.aem.screens.device.pasword.minlowercasechars`, `com.adobe.aem.screens.device.pasword.minuppercasechars`, `com.adobe.aem.screens.device.pasword.minnumberchars`, `com.adobe.aem.screens.device.pasword.minspecialchars`, `com.adobe.aem.screens.device.pasword.minlength` FROM `comAdobeCqScreensDeviceImplDeviceServiceProperties` WHERE 1;

--
-- INSERT template for table `comAdobeCqScreensDeviceImplDeviceServiceProperties`
--
INSERT INTO `comAdobeCqScreensDeviceImplDeviceServiceProperties`(`com.adobe.aem.screens.player.pingfrequency`, `com.adobe.aem.screens.device.pasword.specialchars`, `com.adobe.aem.screens.device.pasword.minlowercasechars`, `com.adobe.aem.screens.device.pasword.minuppercasechars`, `com.adobe.aem.screens.device.pasword.minnumberchars`, `com.adobe.aem.screens.device.pasword.minspecialchars`, `com.adobe.aem.screens.device.pasword.minlength`) VALUES (?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `comAdobeCqScreensDeviceImplDeviceServiceProperties`
--
UPDATE `comAdobeCqScreensDeviceImplDeviceServiceProperties` SET `com.adobe.aem.screens.player.pingfrequency` = ?, `com.adobe.aem.screens.device.pasword.specialchars` = ?, `com.adobe.aem.screens.device.pasword.minlowercasechars` = ?, `com.adobe.aem.screens.device.pasword.minuppercasechars` = ?, `com.adobe.aem.screens.device.pasword.minnumberchars` = ?, `com.adobe.aem.screens.device.pasword.minspecialchars` = ?, `com.adobe.aem.screens.device.pasword.minlength` = ? WHERE 1;

--
-- DELETE template for table `comAdobeCqScreensDeviceImplDeviceServiceProperties`
--
DELETE FROM `comAdobeCqScreensDeviceImplDeviceServiceProperties` WHERE 0;

