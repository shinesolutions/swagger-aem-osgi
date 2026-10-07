--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comAdobeCqSocialUgcbaseModerationImplSentimentProcessProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_adobe_cq_social_ugcbase_moderation_impl_sentiment_process_p'
--
SELECT watchwords/positive, watchwords/negative, watchwords/path, sentiment/path FROM com_adobe_cq_social_ugcbase_moderation_impl_sentiment_process_p WHERE 1=1;

--
-- INSERT template for table 'com_adobe_cq_social_ugcbase_moderation_impl_sentiment_process_p'
--
INSERT INTO com_adobe_cq_social_ugcbase_moderation_impl_sentiment_process_p (watchwords/positive, watchwords/negative, watchwords/path, sentiment/path) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table 'com_adobe_cq_social_ugcbase_moderation_impl_sentiment_process_p'
--
UPDATE com_adobe_cq_social_ugcbase_moderation_impl_sentiment_process_p SET watchwords/positive = ?, watchwords/negative = ?, watchwords/path = ?, sentiment/path = ? WHERE 1=2;

--
-- DELETE template for table 'com_adobe_cq_social_ugcbase_moderation_impl_sentiment_process_p'
--
DELETE FROM com_adobe_cq_social_ugcbase_moderation_impl_sentiment_process_p WHERE 1=2;

