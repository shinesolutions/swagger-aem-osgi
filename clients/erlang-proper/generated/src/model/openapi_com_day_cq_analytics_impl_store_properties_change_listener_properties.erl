-module(openapi_com_day_cq_analytics_impl_store_properties_change_listener_properties).

-include("openapi.hrl").

-export([openapi_com_day_cq_analytics_impl_store_properties_change_listener_properties/0]).

-export([openapi_com_day_cq_analytics_impl_store_properties_change_listener_properties/1]).

-export_type([openapi_com_day_cq_analytics_impl_store_properties_change_listener_properties/0]).

-type openapi_com_day_cq_analytics_impl_store_properties_change_listener_properties() ::
  [ {'cq_store_listener_additionalStorePaths', openapi_config_node_property_array:openapi_config_node_property_array() }
  ].


openapi_com_day_cq_analytics_impl_store_properties_change_listener_properties() ->
    openapi_com_day_cq_analytics_impl_store_properties_change_listener_properties([]).

openapi_com_day_cq_analytics_impl_store_properties_change_listener_properties(Fields) ->
  Default = [ {'cq.store.listener.additionalStorePaths', openapi_config_node_property_array:openapi_config_node_property_array() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

