--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comAdobeCqSocialCommonsMaintainanceImplDeleteTempUGCImageUploadProperties' definition.
--


--
-- SELECT template for table `comAdobeCqSocialCommonsMaintainanceImplDeleteTempUGCImageUploadP`
--
SELECT `numberOfDays`, `ageOfFile` FROM `comAdobeCqSocialCommonsMaintainanceImplDeleteTempUGCImageUploadP` WHERE 1;

--
-- INSERT template for table `comAdobeCqSocialCommonsMaintainanceImplDeleteTempUGCImageUploadP`
--
INSERT INTO `comAdobeCqSocialCommonsMaintainanceImplDeleteTempUGCImageUploadP`(`numberOfDays`, `ageOfFile`) VALUES (?, ?);

--
-- UPDATE template for table `comAdobeCqSocialCommonsMaintainanceImplDeleteTempUGCImageUploadP`
--
UPDATE `comAdobeCqSocialCommonsMaintainanceImplDeleteTempUGCImageUploadP` SET `numberOfDays` = ?, `ageOfFile` = ? WHERE 1;

--
-- DELETE template for table `comAdobeCqSocialCommonsMaintainanceImplDeleteTempUGCImageUploadP`
--
DELETE FROM `comAdobeCqSocialCommonsMaintainanceImplDeleteTempUGCImageUploadP` WHERE 0;

