-module(openapi_org_apache_jackrabbit_oak_security_user_random_authorizable_node_name_properties).

-export([encode/1]).

-export_type([openapi_org_apache_jackrabbit_oak_security_user_random_authorizable_node_name_properties/0]).

-type openapi_org_apache_jackrabbit_oak_security_user_random_authorizable_node_name_properties() ::
    #{ 'length' => openapi_config_node_property_integer:openapi_config_node_property_integer()
     }.

encode(#{ 'length' := Length
        }) ->
    #{ 'length' => Length
     }.
