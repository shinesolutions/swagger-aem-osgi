-module(openapi_com_adobe_forms_common_service_impl_default_data_provider_properties).

-export([encode/1]).

-export_type([openapi_com_adobe_forms_common_service_impl_default_data_provider_properties/0]).

-type openapi_com_adobe_forms_common_service_impl_default_data_provider_properties() ::
    #{ 'alloweddataFileLocations' => openapi_config_node_property_array:openapi_config_node_property_array()
     }.

encode(#{ 'alloweddataFileLocations' := AlloweddataFileLocations
        }) ->
    #{ 'alloweddataFileLocations' => AlloweddataFileLocations
     }.
