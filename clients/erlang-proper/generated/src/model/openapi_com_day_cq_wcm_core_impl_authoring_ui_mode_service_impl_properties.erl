-module(openapi_com_day_cq_wcm_core_impl_authoring_ui_mode_service_impl_properties).

-include("openapi.hrl").

-export([openapi_com_day_cq_wcm_core_impl_authoring_ui_mode_service_impl_properties/0]).

-export([openapi_com_day_cq_wcm_core_impl_authoring_ui_mode_service_impl_properties/1]).

-export_type([openapi_com_day_cq_wcm_core_impl_authoring_ui_mode_service_impl_properties/0]).

-type openapi_com_day_cq_wcm_core_impl_authoring_ui_mode_service_impl_properties() ::
  [ {'authoringUIModeService_default', openapi_config_node_property_string:openapi_config_node_property_string() }
  ].


openapi_com_day_cq_wcm_core_impl_authoring_ui_mode_service_impl_properties() ->
    openapi_com_day_cq_wcm_core_impl_authoring_ui_mode_service_impl_properties([]).

openapi_com_day_cq_wcm_core_impl_authoring_ui_mode_service_impl_properties(Fields) ->
  Default = [ {'authoringUIModeService.default', openapi_config_node_property_string:openapi_config_node_property_string() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

