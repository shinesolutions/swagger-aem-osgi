-module(openapi_org_apache_jackrabbit_oak_spi_security_authentication_external_impl_pr_properties).

-export([encode/1]).

-export_type([openapi_org_apache_jackrabbit_oak_spi_security_authentication_external_impl_pr_properties/0]).

-type openapi_org_apache_jackrabbit_oak_spi_security_authentication_external_impl_pr_properties() ::
    #{ 'protectExternalId' => openapi_config_node_property_boolean:openapi_config_node_property_boolean()
     }.

encode(#{ 'protectExternalId' := ProtectExternalId
        }) ->
    #{ 'protectExternalId' => ProtectExternalId
     }.
