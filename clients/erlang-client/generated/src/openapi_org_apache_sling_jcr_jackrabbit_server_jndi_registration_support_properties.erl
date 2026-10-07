-module(openapi_org_apache_sling_jcr_jackrabbit_server_jndi_registration_support_properties).

-export([encode/1]).

-export_type([openapi_org_apache_sling_jcr_jackrabbit_server_jndi_registration_support_properties/0]).

-type openapi_org_apache_sling_jcr_jackrabbit_server_jndi_registration_support_properties() ::
    #{ 'java_naming_factory_initial' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'java_naming_provider_url' => openapi_config_node_property_string:openapi_config_node_property_string()
     }.

encode(#{ 'java_naming_factory_initial' := JavaNamingFactoryInitial,
          'java_naming_provider_url' := JavaNamingProviderUrl
        }) ->
    #{ 'java.naming.factory.initial' => JavaNamingFactoryInitial,
       'java.naming.provider.url' => JavaNamingProviderUrl
     }.
