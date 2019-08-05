-module(openapi_com_day_cq_replication_impl_content_durbo_durbo_import_configuration_prov_properties).

-export([encode/1]).

-export_type([openapi_com_day_cq_replication_impl_content_durbo_durbo_import_configuration_prov_properties/0]).

-type openapi_com_day_cq_replication_impl_content_durbo_durbo_import_configuration_prov_properties() ::
    #{ 'preserve_hierarchy_nodes' => openapi_config_node_property_boolean:openapi_config_node_property_boolean(),
       'ignore_versioning' => openapi_config_node_property_boolean:openapi_config_node_property_boolean(),
       'import_acl' => openapi_config_node_property_boolean:openapi_config_node_property_boolean(),
       'save_threshold' => openapi_config_node_property_integer:openapi_config_node_property_integer(),
       'preserve_user_paths' => openapi_config_node_property_boolean:openapi_config_node_property_boolean(),
       'preserve_uuid' => openapi_config_node_property_boolean:openapi_config_node_property_boolean(),
       'preserve_uuid_nodetypes' => openapi_config_node_property_array:openapi_config_node_property_array(),
       'preserve_uuid_subtrees' => openapi_config_node_property_array:openapi_config_node_property_array(),
       'auto_commit' => openapi_config_node_property_boolean:openapi_config_node_property_boolean()
     }.

encode(#{ 'preserve_hierarchy_nodes' := PreserveHierarchyNodes,
          'ignore_versioning' := IgnoreVersioning,
          'import_acl' := ImportAcl,
          'save_threshold' := SaveThreshold,
          'preserve_user_paths' := PreserveUserPaths,
          'preserve_uuid' := PreserveUuid,
          'preserve_uuid_nodetypes' := PreserveUuidNodetypes,
          'preserve_uuid_subtrees' := PreserveUuidSubtrees,
          'auto_commit' := AutoCommit
        }) ->
    #{ 'preserve.hierarchy.nodes' => PreserveHierarchyNodes,
       'ignore.versioning' => IgnoreVersioning,
       'import.acl' => ImportAcl,
       'save.threshold' => SaveThreshold,
       'preserve.user.paths' => PreserveUserPaths,
       'preserve.uuid' => PreserveUuid,
       'preserve.uuid.nodetypes' => PreserveUuidNodetypes,
       'preserve.uuid.subtrees' => PreserveUuidSubtrees,
       'auto.commit' => AutoCommit
     }.
