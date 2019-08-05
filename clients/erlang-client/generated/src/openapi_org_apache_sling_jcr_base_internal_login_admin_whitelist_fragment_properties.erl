-module(openapi_org_apache_sling_jcr_base_internal_login_admin_whitelist_fragment_properties).

-export([encode/1]).

-export_type([openapi_org_apache_sling_jcr_base_internal_login_admin_whitelist_fragment_properties/0]).

-type openapi_org_apache_sling_jcr_base_internal_login_admin_whitelist_fragment_properties() ::
    #{ 'whitelist_name' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'whitelist_bundles' => openapi_config_node_property_array:openapi_config_node_property_array()
     }.

encode(#{ 'whitelist_name' := WhitelistName,
          'whitelist_bundles' := WhitelistBundles
        }) ->
    #{ 'whitelist.name' => WhitelistName,
       'whitelist.bundles' => WhitelistBundles
     }.
