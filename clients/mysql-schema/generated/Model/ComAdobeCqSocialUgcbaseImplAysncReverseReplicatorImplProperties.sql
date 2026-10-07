--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comAdobeCqSocialUgcbaseImplAysncReverseReplicatorImplProperties' definition.
--


--
-- SELECT template for table `comAdobeCqSocialUgcbaseImplAysncReverseReplicatorImplProperties`
--
SELECT `poolSize`, `maxPoolSize`, `queueSize`, `keepAliveTime` FROM `comAdobeCqSocialUgcbaseImplAysncReverseReplicatorImplProperties` WHERE 1;

--
-- INSERT template for table `comAdobeCqSocialUgcbaseImplAysncReverseReplicatorImplProperties`
--
INSERT INTO `comAdobeCqSocialUgcbaseImplAysncReverseReplicatorImplProperties`(`poolSize`, `maxPoolSize`, `queueSize`, `keepAliveTime`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `comAdobeCqSocialUgcbaseImplAysncReverseReplicatorImplProperties`
--
UPDATE `comAdobeCqSocialUgcbaseImplAysncReverseReplicatorImplProperties` SET `poolSize` = ?, `maxPoolSize` = ?, `queueSize` = ?, `keepAliveTime` = ? WHERE 1;

--
-- DELETE template for table `comAdobeCqSocialUgcbaseImplAysncReverseReplicatorImplProperties`
--
DELETE FROM `comAdobeCqSocialUgcbaseImplAysncReverseReplicatorImplProperties` WHERE 0;

