-module(openapi_org_apache_sling_jcr_base_internal_login_admin_whitelist_properties).

-export([encode/1]).

-export_type([openapi_org_apache_sling_jcr_base_internal_login_admin_whitelist_properties/0]).

-type openapi_org_apache_sling_jcr_base_internal_login_admin_whitelist_properties() ::
    #{ 'whitelist_bypass' => openapi_config_node_property_boolean:openapi_config_node_property_boolean(),
       'whitelist_bundles_regexp' => openapi_config_node_property_string:openapi_config_node_property_string()
     }.

encode(#{ 'whitelist_bypass' := WhitelistBypass,
          'whitelist_bundles_regexp' := WhitelistBundlesRegexp
        }) ->
    #{ 'whitelist.bypass' => WhitelistBypass,
       'whitelist.bundles.regexp' => WhitelistBundlesRegexp
     }.
