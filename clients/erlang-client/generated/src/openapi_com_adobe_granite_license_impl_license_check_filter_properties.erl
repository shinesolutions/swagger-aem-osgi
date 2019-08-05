-module(openapi_com_adobe_granite_license_impl_license_check_filter_properties).

-export([encode/1]).

-export_type([openapi_com_adobe_granite_license_impl_license_check_filter_properties/0]).

-type openapi_com_adobe_granite_license_impl_license_check_filter_properties() ::
    #{ 'checkInternval' => openapi_config_node_property_integer:openapi_config_node_property_integer(),
       'excludeIds' => openapi_config_node_property_array:openapi_config_node_property_array(),
       'encryptPing' => openapi_config_node_property_boolean:openapi_config_node_property_boolean()
     }.

encode(#{ 'checkInternval' := CheckInternval,
          'excludeIds' := ExcludeIds,
          'encryptPing' := EncryptPing
        }) ->
    #{ 'checkInternval' => CheckInternval,
       'excludeIds' => ExcludeIds,
       'encryptPing' => EncryptPing
     }.
