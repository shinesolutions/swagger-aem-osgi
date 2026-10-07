--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comAdobeGraniteCommentsInternalCommentReplicationContentFilterFacProperties' definition.
--


--
-- SELECT template for table `comAdobeGraniteCommentsInternalCommentReplicationContentFilterFa`
--
SELECT `replicate.comment.resourceTypes` FROM `comAdobeGraniteCommentsInternalCommentReplicationContentFilterFa` WHERE 1;

--
-- INSERT template for table `comAdobeGraniteCommentsInternalCommentReplicationContentFilterFa`
--
INSERT INTO `comAdobeGraniteCommentsInternalCommentReplicationContentFilterFa`(`replicate.comment.resourceTypes`) VALUES (?);

--
-- UPDATE template for table `comAdobeGraniteCommentsInternalCommentReplicationContentFilterFa`
--
UPDATE `comAdobeGraniteCommentsInternalCommentReplicationContentFilterFa` SET `replicate.comment.resourceTypes` = ? WHERE 1;

--
-- DELETE template for table `comAdobeGraniteCommentsInternalCommentReplicationContentFilterFa`
--
DELETE FROM `comAdobeGraniteCommentsInternalCommentReplicationContentFilterFa` WHERE 0;

