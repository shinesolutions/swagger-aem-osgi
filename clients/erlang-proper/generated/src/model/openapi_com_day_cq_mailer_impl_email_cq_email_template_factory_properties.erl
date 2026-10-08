-module(openapi_com_day_cq_mailer_impl_email_cq_email_template_factory_properties).

-include("openapi.hrl").

-export([openapi_com_day_cq_mailer_impl_email_cq_email_template_factory_properties/0]).

-export([openapi_com_day_cq_mailer_impl_email_cq_email_template_factory_properties/1]).

-export_type([openapi_com_day_cq_mailer_impl_email_cq_email_template_factory_properties/0]).

-type openapi_com_day_cq_mailer_impl_email_cq_email_template_factory_properties() ::
  [ {'mailer_email_charset', openapi_config_node_property_string:openapi_config_node_property_string() }
  ].


openapi_com_day_cq_mailer_impl_email_cq_email_template_factory_properties() ->
    openapi_com_day_cq_mailer_impl_email_cq_email_template_factory_properties([]).

openapi_com_day_cq_mailer_impl_email_cq_email_template_factory_properties(Fields) ->
  Default = [ {'mailer.email.charset', openapi_config_node_property_string:openapi_config_node_property_string() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

