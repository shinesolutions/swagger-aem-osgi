-module(openapi_com_day_cq_wcm_mobile_core_impl_device_device_info_transformer_factory_properties).

-include("openapi.hrl").

-export([openapi_com_day_cq_wcm_mobile_core_impl_device_device_info_transformer_factory_properties/0]).

-export([openapi_com_day_cq_wcm_mobile_core_impl_device_device_info_transformer_factory_properties/1]).

-export_type([openapi_com_day_cq_wcm_mobile_core_impl_device_device_info_transformer_factory_properties/0]).

-type openapi_com_day_cq_wcm_mobile_core_impl_device_device_info_transformer_factory_properties() ::
  [ {'device_info_transformer_enabled', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
  | {'device_info_transformer_css_style', openapi_config_node_property_string:openapi_config_node_property_string() }
  ].


openapi_com_day_cq_wcm_mobile_core_impl_device_device_info_transformer_factory_properties() ->
    openapi_com_day_cq_wcm_mobile_core_impl_device_device_info_transformer_factory_properties([]).

openapi_com_day_cq_wcm_mobile_core_impl_device_device_info_transformer_factory_properties(Fields) ->
  Default = [ {'device.info.transformer.enabled', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
            , {'device.info.transformer.css.style', openapi_config_node_property_string:openapi_config_node_property_string() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

