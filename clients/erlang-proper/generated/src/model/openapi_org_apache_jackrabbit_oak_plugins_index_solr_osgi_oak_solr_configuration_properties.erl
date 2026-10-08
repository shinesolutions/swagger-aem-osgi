-module(openapi_org_apache_jackrabbit_oak_plugins_index_solr_osgi_oak_solr_configuration_properties).

-include("openapi.hrl").

-export([openapi_org_apache_jackrabbit_oak_plugins_index_solr_osgi_oak_solr_configuration_properties/0]).

-export([openapi_org_apache_jackrabbit_oak_plugins_index_solr_osgi_oak_solr_configuration_properties/1]).

-export_type([openapi_org_apache_jackrabbit_oak_plugins_index_solr_osgi_oak_solr_configuration_properties/0]).

-type openapi_org_apache_jackrabbit_oak_plugins_index_solr_osgi_oak_solr_configuration_properties() ::
  [ {'path_desc_field', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'path_child_field', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'path_parent_field', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'path_exact_field', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'catch_all_field', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'collapsed_path_field', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'path_depth_field', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'commit_policy', openapi_config_node_property_drop_down:openapi_config_node_property_drop_down() }
  | {'rows', openapi_config_node_property_integer:openapi_config_node_property_integer() }
  | {'path_restrictions', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
  | {'property_restrictions', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
  | {'primarytypes_restrictions', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
  | {'ignored_properties', openapi_config_node_property_array:openapi_config_node_property_array() }
  | {'used_properties', openapi_config_node_property_array:openapi_config_node_property_array() }
  | {'type_mappings', openapi_config_node_property_array:openapi_config_node_property_array() }
  | {'property_mappings', openapi_config_node_property_array:openapi_config_node_property_array() }
  | {'collapse_jcrcontent_nodes', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
  ].


openapi_org_apache_jackrabbit_oak_plugins_index_solr_osgi_oak_solr_configuration_properties() ->
    openapi_org_apache_jackrabbit_oak_plugins_index_solr_osgi_oak_solr_configuration_properties([]).

openapi_org_apache_jackrabbit_oak_plugins_index_solr_osgi_oak_solr_configuration_properties(Fields) ->
  Default = [ {'path.desc.field', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'path.child.field', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'path.parent.field', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'path.exact.field', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'catch.all.field', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'collapsed.path.field', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'path.depth.field', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'commit.policy', openapi_config_node_property_drop_down:openapi_config_node_property_drop_down() }
            , {'rows', openapi_config_node_property_integer:openapi_config_node_property_integer() }
            , {'path.restrictions', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
            , {'property.restrictions', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
            , {'primarytypes.restrictions', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
            , {'ignored.properties', openapi_config_node_property_array:openapi_config_node_property_array() }
            , {'used.properties', openapi_config_node_property_array:openapi_config_node_property_array() }
            , {'type.mappings', openapi_config_node_property_array:openapi_config_node_property_array() }
            , {'property.mappings', openapi_config_node_property_array:openapi_config_node_property_array() }
            , {'collapse.jcrcontent.nodes', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

