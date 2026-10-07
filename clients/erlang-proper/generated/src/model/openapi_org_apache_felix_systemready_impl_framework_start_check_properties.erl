-module(openapi_org_apache_felix_systemready_impl_framework_start_check_properties).

-include("openapi.hrl").

-export([openapi_org_apache_felix_systemready_impl_framework_start_check_properties/0]).

-export([openapi_org_apache_felix_systemready_impl_framework_start_check_properties/1]).

-export_type([openapi_org_apache_felix_systemready_impl_framework_start_check_properties/0]).

-type openapi_org_apache_felix_systemready_impl_framework_start_check_properties() ::
  [ {'timeout', openapi_config_node_property_integer:openapi_config_node_property_integer() }
  | {'target_start_level', openapi_config_node_property_integer:openapi_config_node_property_integer() }
  | {'target_start_level_prop_name', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'type', openapi_config_node_property_drop_down:openapi_config_node_property_drop_down() }
  ].


openapi_org_apache_felix_systemready_impl_framework_start_check_properties() ->
    openapi_org_apache_felix_systemready_impl_framework_start_check_properties([]).

openapi_org_apache_felix_systemready_impl_framework_start_check_properties(Fields) ->
  Default = [ {'timeout', openapi_config_node_property_integer:openapi_config_node_property_integer() }
            , {'target.start.level', openapi_config_node_property_integer:openapi_config_node_property_integer() }
            , {'target.start.level.prop.name', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'type', openapi_config_node_property_drop_down:openapi_config_node_property_drop_down() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

