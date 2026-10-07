-module(openapi_com_day_cq_wcm_core_impl_authoring_ui_mode_service_impl_properties).

-export([encode/1]).

-export_type([openapi_com_day_cq_wcm_core_impl_authoring_ui_mode_service_impl_properties/0]).

-type openapi_com_day_cq_wcm_core_impl_authoring_ui_mode_service_impl_properties() ::
    #{ 'authoringUIModeService_default' => openapi_config_node_property_string:openapi_config_node_property_string()
     }.

encode(#{ 'authoringUIModeService_default' := AuthoringUIModeServiceDefault
        }) ->
    #{ 'authoringUIModeService.default' => AuthoringUIModeServiceDefault
     }.
