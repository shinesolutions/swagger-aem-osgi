-module(openapi_org_apache_sling_jcr_jackrabbit_server_rmi_registration_support_properties).

-export([encode/1]).

-export_type([openapi_org_apache_sling_jcr_jackrabbit_server_rmi_registration_support_properties/0]).

-type openapi_org_apache_sling_jcr_jackrabbit_server_rmi_registration_support_properties() ::
    #{ 'port' => openapi_config_node_property_integer:openapi_config_node_property_integer()
     }.

encode(#{ 'port' := Port
        }) ->
    #{ 'port' => Port
     }.
