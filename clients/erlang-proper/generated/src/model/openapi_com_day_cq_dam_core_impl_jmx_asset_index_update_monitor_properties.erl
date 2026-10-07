-module(openapi_com_day_cq_dam_core_impl_jmx_asset_index_update_monitor_properties).

-include("openapi.hrl").

-export([openapi_com_day_cq_dam_core_impl_jmx_asset_index_update_monitor_properties/0]).

-export([openapi_com_day_cq_dam_core_impl_jmx_asset_index_update_monitor_properties/1]).

-export_type([openapi_com_day_cq_dam_core_impl_jmx_asset_index_update_monitor_properties/0]).

-type openapi_com_day_cq_dam_core_impl_jmx_asset_index_update_monitor_properties() ::
  [ {'jmx_objectname', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'property_measure_enabled', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
  | {'property_name', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'property_max_wait_ms', openapi_config_node_property_integer:openapi_config_node_property_integer() }
  | {'property_max_rate', openapi_config_node_property_float:openapi_config_node_property_float() }
  | {'fulltext_measure_enabled', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
  | {'fulltext_name', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'fulltext_max_wait_ms', openapi_config_node_property_integer:openapi_config_node_property_integer() }
  | {'fulltext_max_rate', openapi_config_node_property_float:openapi_config_node_property_float() }
  ].


openapi_com_day_cq_dam_core_impl_jmx_asset_index_update_monitor_properties() ->
    openapi_com_day_cq_dam_core_impl_jmx_asset_index_update_monitor_properties([]).

openapi_com_day_cq_dam_core_impl_jmx_asset_index_update_monitor_properties(Fields) ->
  Default = [ {'jmx.objectname', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'property.measure.enabled', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
            , {'property.name', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'property.max.wait.ms', openapi_config_node_property_integer:openapi_config_node_property_integer() }
            , {'property.max.rate', openapi_config_node_property_float:openapi_config_node_property_float() }
            , {'fulltext.measure.enabled', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
            , {'fulltext.name', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'fulltext.max.wait.ms', openapi_config_node_property_integer:openapi_config_node_property_integer() }
            , {'fulltext.max.rate', openapi_config_node_property_float:openapi_config_node_property_float() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

