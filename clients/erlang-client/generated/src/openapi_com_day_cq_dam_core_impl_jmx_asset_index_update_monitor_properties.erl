-module(openapi_com_day_cq_dam_core_impl_jmx_asset_index_update_monitor_properties).

-export([encode/1]).

-export_type([openapi_com_day_cq_dam_core_impl_jmx_asset_index_update_monitor_properties/0]).

-type openapi_com_day_cq_dam_core_impl_jmx_asset_index_update_monitor_properties() ::
    #{ 'jmx_objectname' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'property_measure_enabled' => openapi_config_node_property_boolean:openapi_config_node_property_boolean(),
       'property_name' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'property_max_wait_ms' => openapi_config_node_property_integer:openapi_config_node_property_integer(),
       'property_max_rate' => openapi_config_node_property_float:openapi_config_node_property_float(),
       'fulltext_measure_enabled' => openapi_config_node_property_boolean:openapi_config_node_property_boolean(),
       'fulltext_name' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'fulltext_max_wait_ms' => openapi_config_node_property_integer:openapi_config_node_property_integer(),
       'fulltext_max_rate' => openapi_config_node_property_float:openapi_config_node_property_float()
     }.

encode(#{ 'jmx_objectname' := JmxObjectname,
          'property_measure_enabled' := PropertyMeasureEnabled,
          'property_name' := PropertyName,
          'property_max_wait_ms' := PropertyMaxWaitMs,
          'property_max_rate' := PropertyMaxRate,
          'fulltext_measure_enabled' := FulltextMeasureEnabled,
          'fulltext_name' := FulltextName,
          'fulltext_max_wait_ms' := FulltextMaxWaitMs,
          'fulltext_max_rate' := FulltextMaxRate
        }) ->
    #{ 'jmx.objectname' => JmxObjectname,
       'property.measure.enabled' => PropertyMeasureEnabled,
       'property.name' => PropertyName,
       'property.max.wait.ms' => PropertyMaxWaitMs,
       'property.max.rate' => PropertyMaxRate,
       'fulltext.measure.enabled' => FulltextMeasureEnabled,
       'fulltext.name' => FulltextName,
       'fulltext.max.wait.ms' => FulltextMaxWaitMs,
       'fulltext.max.rate' => FulltextMaxRate
     }.
