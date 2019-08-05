-module(openapi_org_apache_sling_distribution_transport_impl_user_credentials_distributi_properties).

-export([encode/1]).

-export_type([openapi_org_apache_sling_distribution_transport_impl_user_credentials_distributi_properties/0]).

-type openapi_org_apache_sling_distribution_transport_impl_user_credentials_distributi_properties() ::
    #{ 'name' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'username' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'password' => openapi_config_node_property_string:openapi_config_node_property_string()
     }.

encode(#{ 'name' := Name,
          'username' := Username,
          'password' := Password
        }) ->
    #{ 'name' => Name,
       'username' => Username,
       'password' => Password
     }.
