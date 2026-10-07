-module(openapi_org_apache_sling_hc_core_impl_scriptable_health_check_properties).

-include("openapi.hrl").

-export([openapi_org_apache_sling_hc_core_impl_scriptable_health_check_properties/0]).

-export([openapi_org_apache_sling_hc_core_impl_scriptable_health_check_properties/1]).

-export_type([openapi_org_apache_sling_hc_core_impl_scriptable_health_check_properties/0]).

-type openapi_org_apache_sling_hc_core_impl_scriptable_health_check_properties() ::
  [ {'hc_name', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'hc_tags', openapi_config_node_property_array:openapi_config_node_property_array() }
  | {'hc_mbean_name', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'expression', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'language_extension', openapi_config_node_property_string:openapi_config_node_property_string() }
  ].


openapi_org_apache_sling_hc_core_impl_scriptable_health_check_properties() ->
    openapi_org_apache_sling_hc_core_impl_scriptable_health_check_properties([]).

openapi_org_apache_sling_hc_core_impl_scriptable_health_check_properties(Fields) ->
  Default = [ {'hc.name', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'hc.tags', openapi_config_node_property_array:openapi_config_node_property_array() }
            , {'hc.mbean.name', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'expression', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'language.extension', openapi_config_node_property_string:openapi_config_node_property_string() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

