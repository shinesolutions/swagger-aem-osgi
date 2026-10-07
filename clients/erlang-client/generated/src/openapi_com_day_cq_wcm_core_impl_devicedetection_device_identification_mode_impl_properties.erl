-module(openapi_com_day_cq_wcm_core_impl_devicedetection_device_identification_mode_impl_properties).

-export([encode/1]).

-export_type([openapi_com_day_cq_wcm_core_impl_devicedetection_device_identification_mode_impl_properties/0]).

-type openapi_com_day_cq_wcm_core_impl_devicedetection_device_identification_mode_impl_properties() ::
    #{ 'dim_default_mode' => openapi_config_node_property_drop_down:openapi_config_node_property_drop_down(),
       'dim_appcache_enabled' => openapi_config_node_property_boolean:openapi_config_node_property_boolean()
     }.

encode(#{ 'dim_default_mode' := DimDefaultMode,
          'dim_appcache_enabled' := DimAppcacheEnabled
        }) ->
    #{ 'dim.default.mode' => DimDefaultMode,
       'dim.appcache.enabled' => DimAppcacheEnabled
     }.
