-module(openapi_com_day_cq_mcm_core_newsletter_newsletter_email_service_impl_properties).

-include("openapi.hrl").

-export([openapi_com_day_cq_mcm_core_newsletter_newsletter_email_service_impl_properties/0]).

-export([openapi_com_day_cq_mcm_core_newsletter_newsletter_email_service_impl_properties/1]).

-export_type([openapi_com_day_cq_mcm_core_newsletter_newsletter_email_service_impl_properties/0]).

-type openapi_com_day_cq_mcm_core_newsletter_newsletter_email_service_impl_properties() ::
  [ {'from_address', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'sender_host', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'max_bounce_count', openapi_config_node_property_string:openapi_config_node_property_string() }
  ].


openapi_com_day_cq_mcm_core_newsletter_newsletter_email_service_impl_properties() ->
    openapi_com_day_cq_mcm_core_newsletter_newsletter_email_service_impl_properties([]).

openapi_com_day_cq_mcm_core_newsletter_newsletter_email_service_impl_properties(Fields) ->
  Default = [ {'from.address', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'sender.host', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'max.bounce.count', openapi_config_node_property_string:openapi_config_node_property_string() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

