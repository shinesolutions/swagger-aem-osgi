-module(openapi_com_adobe_cq_screens_device_registration_impl_registration_service_impl_properties).

-export([encode/1]).

-export_type([openapi_com_adobe_cq_screens_device_registration_impl_registration_service_impl_properties/0]).

-type openapi_com_adobe_cq_screens_device_registration_impl_registration_service_impl_properties() ::
    #{ 'deviceRegistrationTimeout' => openapi_config_node_property_integer:openapi_config_node_property_integer()
     }.

encode(#{ 'deviceRegistrationTimeout' := DeviceRegistrationTimeout
        }) ->
    #{ 'deviceRegistrationTimeout' => DeviceRegistrationTimeout
     }.
