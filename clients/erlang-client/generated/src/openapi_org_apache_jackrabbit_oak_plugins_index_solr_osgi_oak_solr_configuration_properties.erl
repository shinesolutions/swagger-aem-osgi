-module(openapi_org_apache_jackrabbit_oak_plugins_index_solr_osgi_oak_solr_configuration_properties).

-export([encode/1]).

-export_type([openapi_org_apache_jackrabbit_oak_plugins_index_solr_osgi_oak_solr_configuration_properties/0]).

-type openapi_org_apache_jackrabbit_oak_plugins_index_solr_osgi_oak_solr_configuration_properties() ::
    #{ 'path_desc_field' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'path_child_field' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'path_parent_field' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'path_exact_field' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'catch_all_field' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'collapsed_path_field' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'path_depth_field' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'commit_policy' => openapi_config_node_property_drop_down:openapi_config_node_property_drop_down(),
       'rows' => openapi_config_node_property_integer:openapi_config_node_property_integer(),
       'path_restrictions' => openapi_config_node_property_boolean:openapi_config_node_property_boolean(),
       'property_restrictions' => openapi_config_node_property_boolean:openapi_config_node_property_boolean(),
       'primarytypes_restrictions' => openapi_config_node_property_boolean:openapi_config_node_property_boolean(),
       'ignored_properties' => openapi_config_node_property_array:openapi_config_node_property_array(),
       'used_properties' => openapi_config_node_property_array:openapi_config_node_property_array(),
       'type_mappings' => openapi_config_node_property_array:openapi_config_node_property_array(),
       'property_mappings' => openapi_config_node_property_array:openapi_config_node_property_array(),
       'collapse_jcrcontent_nodes' => openapi_config_node_property_boolean:openapi_config_node_property_boolean()
     }.

encode(#{ 'path_desc_field' := PathDescField,
          'path_child_field' := PathChildField,
          'path_parent_field' := PathParentField,
          'path_exact_field' := PathExactField,
          'catch_all_field' := CatchAllField,
          'collapsed_path_field' := CollapsedPathField,
          'path_depth_field' := PathDepthField,
          'commit_policy' := CommitPolicy,
          'rows' := Rows,
          'path_restrictions' := PathRestrictions,
          'property_restrictions' := PropertyRestrictions,
          'primarytypes_restrictions' := PrimarytypesRestrictions,
          'ignored_properties' := IgnoredProperties,
          'used_properties' := UsedProperties,
          'type_mappings' := TypeMappings,
          'property_mappings' := PropertyMappings,
          'collapse_jcrcontent_nodes' := CollapseJcrcontentNodes
        }) ->
    #{ 'path.desc.field' => PathDescField,
       'path.child.field' => PathChildField,
       'path.parent.field' => PathParentField,
       'path.exact.field' => PathExactField,
       'catch.all.field' => CatchAllField,
       'collapsed.path.field' => CollapsedPathField,
       'path.depth.field' => PathDepthField,
       'commit.policy' => CommitPolicy,
       'rows' => Rows,
       'path.restrictions' => PathRestrictions,
       'property.restrictions' => PropertyRestrictions,
       'primarytypes.restrictions' => PrimarytypesRestrictions,
       'ignored.properties' => IgnoredProperties,
       'used.properties' => UsedProperties,
       'type.mappings' => TypeMappings,
       'property.mappings' => PropertyMappings,
       'collapse.jcrcontent.nodes' => CollapseJcrcontentNodes
     }.
