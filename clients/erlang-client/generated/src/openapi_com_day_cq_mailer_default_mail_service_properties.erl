-module(openapi_com_day_cq_mailer_default_mail_service_properties).

-export([encode/1]).

-export_type([openapi_com_day_cq_mailer_default_mail_service_properties/0]).

-type openapi_com_day_cq_mailer_default_mail_service_properties() ::
    #{ 'smtp_host' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'smtp_port' => openapi_config_node_property_integer:openapi_config_node_property_integer(),
       'smtp_user' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'smtp_password' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'from_address' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'smtp_ssl' => openapi_config_node_property_boolean:openapi_config_node_property_boolean(),
       'smtp_starttls' => openapi_config_node_property_boolean:openapi_config_node_property_boolean(),
       'debug_email' => openapi_config_node_property_boolean:openapi_config_node_property_boolean()
     }.

encode(#{ 'smtp_host' := SmtpHost,
          'smtp_port' := SmtpPort,
          'smtp_user' := SmtpUser,
          'smtp_password' := SmtpPassword,
          'from_address' := FromAddress,
          'smtp_ssl' := SmtpSsl,
          'smtp_starttls' := SmtpStarttls,
          'debug_email' := DebugEmail
        }) ->
    #{ 'smtp.host' => SmtpHost,
       'smtp.port' => SmtpPort,
       'smtp.user' => SmtpUser,
       'smtp.password' => SmtpPassword,
       'from.address' => FromAddress,
       'smtp.ssl' => SmtpSsl,
       'smtp.starttls' => SmtpStarttls,
       'debug.email' => DebugEmail
     }.
