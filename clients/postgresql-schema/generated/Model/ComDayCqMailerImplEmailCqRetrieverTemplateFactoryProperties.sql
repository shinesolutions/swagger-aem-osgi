--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comDayCqMailerImplEmailCqRetrieverTemplateFactoryProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_day_cq_mailer_impl_email_cq_retriever_template_factory_prop'
--
SELECT mailer/email/embed, mailer/email/charset, mailer/email/retriever_user_id, mailer/email/retriever_user_pwd FROM com_day_cq_mailer_impl_email_cq_retriever_template_factory_prop WHERE 1=1;

--
-- INSERT template for table 'com_day_cq_mailer_impl_email_cq_retriever_template_factory_prop'
--
INSERT INTO com_day_cq_mailer_impl_email_cq_retriever_template_factory_prop (mailer/email/embed, mailer/email/charset, mailer/email/retriever_user_id, mailer/email/retriever_user_pwd) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table 'com_day_cq_mailer_impl_email_cq_retriever_template_factory_prop'
--
UPDATE com_day_cq_mailer_impl_email_cq_retriever_template_factory_prop SET mailer/email/embed = ?, mailer/email/charset = ?, mailer/email/retriever_user_id = ?, mailer/email/retriever_user_pwd = ? WHERE 1=2;

--
-- DELETE template for table 'com_day_cq_mailer_impl_email_cq_retriever_template_factory_prop'
--
DELETE FROM com_day_cq_mailer_impl_email_cq_retriever_template_factory_prop WHERE 1=2;

