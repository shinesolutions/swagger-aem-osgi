-module(openapi_org_apache_sling_distribution_agent_impl_privilege_distribution_request_a_properties).

-export([encode/1]).

-export_type([openapi_org_apache_sling_distribution_agent_impl_privilege_distribution_request_a_properties/0]).

-type openapi_org_apache_sling_distribution_agent_impl_privilege_distribution_request_a_properties() ::
    #{ 'name' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'jcrPrivilege' => openapi_config_node_property_string:openapi_config_node_property_string()
     }.

encode(#{ 'name' := Name,
          'jcrPrivilege' := JcrPrivilege
        }) ->
    #{ 'name' => Name,
       'jcrPrivilege' => JcrPrivilege
     }.
