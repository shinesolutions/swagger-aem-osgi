-module(openapi_org_apache_sling_jcr_base_internal_login_admin_whitelist_fragment_properties).

-include("openapi.hrl").

-export([openapi_org_apache_sling_jcr_base_internal_login_admin_whitelist_fragment_properties/0]).

-export([openapi_org_apache_sling_jcr_base_internal_login_admin_whitelist_fragment_properties/1]).

-export_type([openapi_org_apache_sling_jcr_base_internal_login_admin_whitelist_fragment_properties/0]).

-type openapi_org_apache_sling_jcr_base_internal_login_admin_whitelist_fragment_properties() ::
  [ {'whitelist_name', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'whitelist_bundles', openapi_config_node_property_array:openapi_config_node_property_array() }
  ].


openapi_org_apache_sling_jcr_base_internal_login_admin_whitelist_fragment_properties() ->
    openapi_org_apache_sling_jcr_base_internal_login_admin_whitelist_fragment_properties([]).

openapi_org_apache_sling_jcr_base_internal_login_admin_whitelist_fragment_properties(Fields) ->
  Default = [ {'whitelist.name', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'whitelist.bundles', openapi_config_node_property_array:openapi_config_node_property_array() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

