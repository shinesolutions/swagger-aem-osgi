-module(openapi_com_adobe_granite_security_user_user_properties_service_properties).

-export([encode/1]).

-export_type([openapi_com_adobe_granite_security_user_user_properties_service_properties/0]).

-type openapi_com_adobe_granite_security_user_user_properties_service_properties() ::
    #{ 'adapter_condition' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'granite_userproperties_nodetypes' => openapi_config_node_property_array:openapi_config_node_property_array(),
       'granite_userproperties_resourcetypes' => openapi_config_node_property_array:openapi_config_node_property_array()
     }.

encode(#{ 'adapter_condition' := AdapterCondition,
          'granite_userproperties_nodetypes' := GraniteUserpropertiesNodetypes,
          'granite_userproperties_resourcetypes' := GraniteUserpropertiesResourcetypes
        }) ->
    #{ 'adapter.condition' => AdapterCondition,
       'granite.userproperties.nodetypes' => GraniteUserpropertiesNodetypes,
       'granite.userproperties.resourcetypes' => GraniteUserpropertiesResourcetypes
     }.
