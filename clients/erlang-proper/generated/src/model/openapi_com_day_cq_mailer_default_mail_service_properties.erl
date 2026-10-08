-module(openapi_com_day_cq_mailer_default_mail_service_properties).

-include("openapi.hrl").

-export([openapi_com_day_cq_mailer_default_mail_service_properties/0]).

-export([openapi_com_day_cq_mailer_default_mail_service_properties/1]).

-export_type([openapi_com_day_cq_mailer_default_mail_service_properties/0]).

-type openapi_com_day_cq_mailer_default_mail_service_properties() ::
  [ {'smtp_host', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'smtp_port', openapi_config_node_property_integer:openapi_config_node_property_integer() }
  | {'smtp_user', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'smtp_password', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'from_address', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'smtp_ssl', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
  | {'smtp_starttls', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
  | {'debug_email', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
  ].


openapi_com_day_cq_mailer_default_mail_service_properties() ->
    openapi_com_day_cq_mailer_default_mail_service_properties([]).

openapi_com_day_cq_mailer_default_mail_service_properties(Fields) ->
  Default = [ {'smtp.host', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'smtp.port', openapi_config_node_property_integer:openapi_config_node_property_integer() }
            , {'smtp.user', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'smtp.password', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'from.address', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'smtp.ssl', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
            , {'smtp.starttls', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
            , {'debug.email', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

