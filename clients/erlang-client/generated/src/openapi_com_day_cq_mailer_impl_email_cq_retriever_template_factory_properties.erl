-module(openapi_com_day_cq_mailer_impl_email_cq_retriever_template_factory_properties).

-export([encode/1]).

-export_type([openapi_com_day_cq_mailer_impl_email_cq_retriever_template_factory_properties/0]).

-type openapi_com_day_cq_mailer_impl_email_cq_retriever_template_factory_properties() ::
    #{ 'mailer_email_embed' => openapi_config_node_property_boolean:openapi_config_node_property_boolean(),
       'mailer_email_charset' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'mailer_email_retrieverUserID' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'mailer_email_retrieverUserPWD' => openapi_config_node_property_string:openapi_config_node_property_string()
     }.

encode(#{ 'mailer_email_embed' := MailerEmailEmbed,
          'mailer_email_charset' := MailerEmailCharset,
          'mailer_email_retrieverUserID' := MailerEmailRetrieverUserID,
          'mailer_email_retrieverUserPWD' := MailerEmailRetrieverUserPWD
        }) ->
    #{ 'mailer.email.embed' => MailerEmailEmbed,
       'mailer.email.charset' => MailerEmailCharset,
       'mailer.email.retrieverUserID' => MailerEmailRetrieverUserID,
       'mailer.email.retrieverUserPWD' => MailerEmailRetrieverUserPWD
     }.
