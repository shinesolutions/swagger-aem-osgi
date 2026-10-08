-module(openapi_org_apache_sling_jcr_base_internal_login_admin_whitelist_properties).

-include("openapi.hrl").

-export([openapi_org_apache_sling_jcr_base_internal_login_admin_whitelist_properties/0]).

-export([openapi_org_apache_sling_jcr_base_internal_login_admin_whitelist_properties/1]).

-export_type([openapi_org_apache_sling_jcr_base_internal_login_admin_whitelist_properties/0]).

-type openapi_org_apache_sling_jcr_base_internal_login_admin_whitelist_properties() ::
  [ {'whitelist_bypass', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
  | {'whitelist_bundles_regexp', openapi_config_node_property_string:openapi_config_node_property_string() }
  ].


openapi_org_apache_sling_jcr_base_internal_login_admin_whitelist_properties() ->
    openapi_org_apache_sling_jcr_base_internal_login_admin_whitelist_properties([]).

openapi_org_apache_sling_jcr_base_internal_login_admin_whitelist_properties(Fields) ->
  Default = [ {'whitelist.bypass', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
            , {'whitelist.bundles.regexp', openapi_config_node_property_string:openapi_config_node_property_string() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

