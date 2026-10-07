-module(openapi_com_day_cq_mailer_impl_email_cq_email_template_factory_properties).

-export([encode/1]).

-export_type([openapi_com_day_cq_mailer_impl_email_cq_email_template_factory_properties/0]).

-type openapi_com_day_cq_mailer_impl_email_cq_email_template_factory_properties() ::
    #{ 'mailer_email_charset' => openapi_config_node_property_string:openapi_config_node_property_string()
     }.

encode(#{ 'mailer_email_charset' := MailerEmailCharset
        }) ->
    #{ 'mailer.email.charset' => MailerEmailCharset
     }.
