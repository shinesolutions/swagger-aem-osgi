-module(openapi_org_apache_jackrabbit_oak_security_internal_security_provider_registrati_properties).

-export([encode/1]).

-export_type([openapi_org_apache_jackrabbit_oak_security_internal_security_provider_registrati_properties/0]).

-type openapi_org_apache_jackrabbit_oak_security_internal_security_provider_registrati_properties() ::
    #{ 'requiredServicePids' => openapi_config_node_property_array:openapi_config_node_property_array(),
       'authorizationCompositionType' => openapi_config_node_property_drop_down:openapi_config_node_property_drop_down()
     }.

encode(#{ 'requiredServicePids' := RequiredServicePids,
          'authorizationCompositionType' := AuthorizationCompositionType
        }) ->
    #{ 'requiredServicePids' => RequiredServicePids,
       'authorizationCompositionType' => AuthorizationCompositionType
     }.
