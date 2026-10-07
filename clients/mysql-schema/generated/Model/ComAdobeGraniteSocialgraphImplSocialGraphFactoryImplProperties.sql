--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comAdobeGraniteSocialgraphImplSocialGraphFactoryImplProperties' definition.
--


--
-- SELECT template for table `comAdobeGraniteSocialgraphImplSocialGraphFactoryImplProperties`
--
SELECT `group2member.relationship.outgoing`, `group2member.excluded.outgoing`, `group2member.relationship.incoming`, `group2member.excluded.incoming` FROM `comAdobeGraniteSocialgraphImplSocialGraphFactoryImplProperties` WHERE 1;

--
-- INSERT template for table `comAdobeGraniteSocialgraphImplSocialGraphFactoryImplProperties`
--
INSERT INTO `comAdobeGraniteSocialgraphImplSocialGraphFactoryImplProperties`(`group2member.relationship.outgoing`, `group2member.excluded.outgoing`, `group2member.relationship.incoming`, `group2member.excluded.incoming`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `comAdobeGraniteSocialgraphImplSocialGraphFactoryImplProperties`
--
UPDATE `comAdobeGraniteSocialgraphImplSocialGraphFactoryImplProperties` SET `group2member.relationship.outgoing` = ?, `group2member.excluded.outgoing` = ?, `group2member.relationship.incoming` = ?, `group2member.excluded.incoming` = ? WHERE 1;

--
-- DELETE template for table `comAdobeGraniteSocialgraphImplSocialGraphFactoryImplProperties`
--
DELETE FROM `comAdobeGraniteSocialgraphImplSocialGraphFactoryImplProperties` WHERE 0;

