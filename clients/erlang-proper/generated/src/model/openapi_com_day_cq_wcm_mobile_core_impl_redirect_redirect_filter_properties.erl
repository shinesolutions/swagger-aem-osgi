-module(openapi_com_day_cq_wcm_mobile_core_impl_redirect_redirect_filter_properties).

-include("openapi.hrl").

-export([openapi_com_day_cq_wcm_mobile_core_impl_redirect_redirect_filter_properties/0]).

-export([openapi_com_day_cq_wcm_mobile_core_impl_redirect_redirect_filter_properties/1]).

-export_type([openapi_com_day_cq_wcm_mobile_core_impl_redirect_redirect_filter_properties/0]).

-type openapi_com_day_cq_wcm_mobile_core_impl_redirect_redirect_filter_properties() ::
  [ {'redirect_enabled', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
  | {'redirect_stats_enabled', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
  | {'redirect_extensions', openapi_config_node_property_array:openapi_config_node_property_array() }
  | {'redirect_paths', openapi_config_node_property_array:openapi_config_node_property_array() }
  ].


openapi_com_day_cq_wcm_mobile_core_impl_redirect_redirect_filter_properties() ->
    openapi_com_day_cq_wcm_mobile_core_impl_redirect_redirect_filter_properties([]).

openapi_com_day_cq_wcm_mobile_core_impl_redirect_redirect_filter_properties(Fields) ->
  Default = [ {'redirect.enabled', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
            , {'redirect.stats.enabled', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
            , {'redirect.extensions', openapi_config_node_property_array:openapi_config_node_property_array() }
            , {'redirect.paths', openapi_config_node_property_array:openapi_config_node_property_array() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

