-module(openapi_org_apache_sling_extensions_webconsolesecurityprovider_internal_sling_w_properties).

-export([encode/1]).

-export_type([openapi_org_apache_sling_extensions_webconsolesecurityprovider_internal_sling_w_properties/0]).

-type openapi_org_apache_sling_extensions_webconsolesecurityprovider_internal_sling_w_properties() ::
    #{ 'users' => openapi_config_node_property_array:openapi_config_node_property_array(),
       'groups' => openapi_config_node_property_array:openapi_config_node_property_array()
     }.

encode(#{ 'users' := Users,
          'groups' := Groups
        }) ->
    #{ 'users' => Users,
       'groups' => Groups
     }.
