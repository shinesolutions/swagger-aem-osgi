-module(openapi_com_adobe_cq_social_serviceusers_internal_impl_service_user_wrapper_impl_properties).

-export([encode/1]).

-export_type([openapi_com_adobe_cq_social_serviceusers_internal_impl_service_user_wrapper_impl_properties/0]).

-type openapi_com_adobe_cq_social_serviceusers_internal_impl_service_user_wrapper_impl_properties() ::
    #{ 'enableFallback' => openapi_config_node_property_boolean:openapi_config_node_property_boolean()
     }.

encode(#{ 'enableFallback' := EnableFallback
        }) ->
    #{ 'enableFallback' => EnableFallback
     }.
