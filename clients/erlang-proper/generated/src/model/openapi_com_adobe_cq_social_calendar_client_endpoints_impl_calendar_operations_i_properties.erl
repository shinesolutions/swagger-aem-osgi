-module(openapi_com_adobe_cq_social_calendar_client_endpoints_impl_calendar_operations_i_properties).

-include("openapi.hrl").

-export([openapi_com_adobe_cq_social_calendar_client_endpoints_impl_calendar_operations_i_properties/0]).

-export([openapi_com_adobe_cq_social_calendar_client_endpoints_impl_calendar_operations_i_properties/1]).

-export_type([openapi_com_adobe_cq_social_calendar_client_endpoints_impl_calendar_operations_i_properties/0]).

-type openapi_com_adobe_cq_social_calendar_client_endpoints_impl_calendar_operations_i_properties() ::
  [ {'MaxRetry', openapi_config_node_property_integer:openapi_config_node_property_integer() }
  | {'fieldWhitelist', openapi_config_node_property_array:openapi_config_node_property_array() }
  | {'attachmentTypeBlacklist', openapi_config_node_property_array:openapi_config_node_property_array() }
  ].


openapi_com_adobe_cq_social_calendar_client_endpoints_impl_calendar_operations_i_properties() ->
    openapi_com_adobe_cq_social_calendar_client_endpoints_impl_calendar_operations_i_properties([]).

openapi_com_adobe_cq_social_calendar_client_endpoints_impl_calendar_operations_i_properties(Fields) ->
  Default = [ {'MaxRetry', openapi_config_node_property_integer:openapi_config_node_property_integer() }
            , {'fieldWhitelist', openapi_config_node_property_array:openapi_config_node_property_array() }
            , {'attachmentTypeBlacklist', openapi_config_node_property_array:openapi_config_node_property_array() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

