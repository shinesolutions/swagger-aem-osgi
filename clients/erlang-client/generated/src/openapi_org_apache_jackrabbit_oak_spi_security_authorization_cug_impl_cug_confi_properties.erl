-module(openapi_org_apache_jackrabbit_oak_spi_security_authorization_cug_impl_cug_confi_properties).

-export([encode/1]).

-export_type([openapi_org_apache_jackrabbit_oak_spi_security_authorization_cug_impl_cug_confi_properties/0]).

-type openapi_org_apache_jackrabbit_oak_spi_security_authorization_cug_impl_cug_confi_properties() ::
    #{ 'cugSupportedPaths' => openapi_config_node_property_array:openapi_config_node_property_array(),
       'cugEnabled' => openapi_config_node_property_boolean:openapi_config_node_property_boolean(),
       'configurationRanking' => openapi_config_node_property_integer:openapi_config_node_property_integer()
     }.

encode(#{ 'cugSupportedPaths' := CugSupportedPaths,
          'cugEnabled' := CugEnabled,
          'configurationRanking' := ConfigurationRanking
        }) ->
    #{ 'cugSupportedPaths' => CugSupportedPaths,
       'cugEnabled' => CugEnabled,
       'configurationRanking' => ConfigurationRanking
     }.
