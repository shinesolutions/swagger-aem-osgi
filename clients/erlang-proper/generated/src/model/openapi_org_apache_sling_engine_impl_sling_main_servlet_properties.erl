-module(openapi_org_apache_sling_engine_impl_sling_main_servlet_properties).

-include("openapi.hrl").

-export([openapi_org_apache_sling_engine_impl_sling_main_servlet_properties/0]).

-export([openapi_org_apache_sling_engine_impl_sling_main_servlet_properties/1]).

-export_type([openapi_org_apache_sling_engine_impl_sling_main_servlet_properties/0]).

-type openapi_org_apache_sling_engine_impl_sling_main_servlet_properties() ::
  [ {'sling_max_calls', openapi_config_node_property_integer:openapi_config_node_property_integer() }
  | {'sling_max_inclusions', openapi_config_node_property_integer:openapi_config_node_property_integer() }
  | {'sling_trace_allow', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
  | {'sling_max_record_requests', openapi_config_node_property_integer:openapi_config_node_property_integer() }
  | {'sling_store_pattern_requests', openapi_config_node_property_array:openapi_config_node_property_array() }
  | {'sling_serverinfo', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'sling_additional_response_headers', openapi_config_node_property_array:openapi_config_node_property_array() }
  ].


openapi_org_apache_sling_engine_impl_sling_main_servlet_properties() ->
    openapi_org_apache_sling_engine_impl_sling_main_servlet_properties([]).

openapi_org_apache_sling_engine_impl_sling_main_servlet_properties(Fields) ->
  Default = [ {'sling.max.calls', openapi_config_node_property_integer:openapi_config_node_property_integer() }
            , {'sling.max.inclusions', openapi_config_node_property_integer:openapi_config_node_property_integer() }
            , {'sling.trace.allow', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
            , {'sling.max.record.requests', openapi_config_node_property_integer:openapi_config_node_property_integer() }
            , {'sling.store.pattern.requests', openapi_config_node_property_array:openapi_config_node_property_array() }
            , {'sling.serverinfo', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'sling.additional.response.headers', openapi_config_node_property_array:openapi_config_node_property_array() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

