-module(openapi_org_apache_jackrabbit_oak_spi_security_authorization_cug_impl_cug_exclu_properties).

-export([encode/1]).

-export_type([openapi_org_apache_jackrabbit_oak_spi_security_authorization_cug_impl_cug_exclu_properties/0]).

-type openapi_org_apache_jackrabbit_oak_spi_security_authorization_cug_impl_cug_exclu_properties() ::
    #{ 'principalNames' => openapi_config_node_property_array:openapi_config_node_property_array()
     }.

encode(#{ 'principalNames' := PrincipalNames
        }) ->
    #{ 'principalNames' => PrincipalNames
     }.
