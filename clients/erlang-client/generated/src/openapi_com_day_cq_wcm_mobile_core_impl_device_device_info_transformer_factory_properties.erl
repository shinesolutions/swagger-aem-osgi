-module(openapi_com_day_cq_wcm_mobile_core_impl_device_device_info_transformer_factory_properties).

-export([encode/1]).

-export_type([openapi_com_day_cq_wcm_mobile_core_impl_device_device_info_transformer_factory_properties/0]).

-type openapi_com_day_cq_wcm_mobile_core_impl_device_device_info_transformer_factory_properties() ::
    #{ 'device_info_transformer_enabled' => openapi_config_node_property_boolean:openapi_config_node_property_boolean(),
       'device_info_transformer_css_style' => openapi_config_node_property_string:openapi_config_node_property_string()
     }.

encode(#{ 'device_info_transformer_enabled' := DeviceInfoTransformerEnabled,
          'device_info_transformer_css_style' := DeviceInfoTransformerCssStyle
        }) ->
    #{ 'device.info.transformer.enabled' => DeviceInfoTransformerEnabled,
       'device.info.transformer.css.style' => DeviceInfoTransformerCssStyle
     }.
