-module(openapi_org_apache_jackrabbit_oak_security_authentication_authentication_config_properties).

-export([encode/1]).

-export_type([openapi_org_apache_jackrabbit_oak_security_authentication_authentication_config_properties/0]).

-type openapi_org_apache_jackrabbit_oak_security_authentication_authentication_config_properties() ::
    #{ 'org_apache_jackrabbit_oak_authentication_appName' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'org_apache_jackrabbit_oak_authentication_configSpiName' => openapi_config_node_property_string:openapi_config_node_property_string()
     }.

encode(#{ 'org_apache_jackrabbit_oak_authentication_appName' := OrgApacheJackrabbitOakAuthenticationAppName,
          'org_apache_jackrabbit_oak_authentication_configSpiName' := OrgApacheJackrabbitOakAuthenticationConfigSpiName
        }) ->
    #{ 'org.apache.jackrabbit.oak.authentication.appName' => OrgApacheJackrabbitOakAuthenticationAppName,
       'org.apache.jackrabbit.oak.authentication.configSpiName' => OrgApacheJackrabbitOakAuthenticationConfigSpiName
     }.
