-module(openapi_com_day_cq_wcm_core_impl_devicedetection_device_identification_mode_impl_properties).

-include("openapi.hrl").

-export([openapi_com_day_cq_wcm_core_impl_devicedetection_device_identification_mode_impl_properties/0]).

-export([openapi_com_day_cq_wcm_core_impl_devicedetection_device_identification_mode_impl_properties/1]).

-export_type([openapi_com_day_cq_wcm_core_impl_devicedetection_device_identification_mode_impl_properties/0]).

-type openapi_com_day_cq_wcm_core_impl_devicedetection_device_identification_mode_impl_properties() ::
  [ {'dim_default_mode', openapi_config_node_property_drop_down:openapi_config_node_property_drop_down() }
  | {'dim_appcache_enabled', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
  ].


openapi_com_day_cq_wcm_core_impl_devicedetection_device_identification_mode_impl_properties() ->
    openapi_com_day_cq_wcm_core_impl_devicedetection_device_identification_mode_impl_properties([]).

openapi_com_day_cq_wcm_core_impl_devicedetection_device_identification_mode_impl_properties(Fields) ->
  Default = [ {'dim.default.mode', openapi_config_node_property_drop_down:openapi_config_node_property_drop_down() }
            , {'dim.appcache.enabled', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

