-module(openapi_com_day_cq_dam_core_impl_jmx_asset_update_monitor_impl_properties).

-include("openapi.hrl").

-export([openapi_com_day_cq_dam_core_impl_jmx_asset_update_monitor_impl_properties/0]).

-export([openapi_com_day_cq_dam_core_impl_jmx_asset_update_monitor_impl_properties/1]).

-export_type([openapi_com_day_cq_dam_core_impl_jmx_asset_update_monitor_impl_properties/0]).

-type openapi_com_day_cq_dam_core_impl_jmx_asset_update_monitor_impl_properties() ::
  [ {'jmx_objectname', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'active', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
  ].


openapi_com_day_cq_dam_core_impl_jmx_asset_update_monitor_impl_properties() ->
    openapi_com_day_cq_dam_core_impl_jmx_asset_update_monitor_impl_properties([]).

openapi_com_day_cq_dam_core_impl_jmx_asset_update_monitor_impl_properties(Fields) ->
  Default = [ {'jmx.objectname', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'active', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

