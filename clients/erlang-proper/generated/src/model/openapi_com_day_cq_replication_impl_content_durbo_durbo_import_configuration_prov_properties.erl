-module(openapi_com_day_cq_replication_impl_content_durbo_durbo_import_configuration_prov_properties).

-include("openapi.hrl").

-export([openapi_com_day_cq_replication_impl_content_durbo_durbo_import_configuration_prov_properties/0]).

-export([openapi_com_day_cq_replication_impl_content_durbo_durbo_import_configuration_prov_properties/1]).

-export_type([openapi_com_day_cq_replication_impl_content_durbo_durbo_import_configuration_prov_properties/0]).

-type openapi_com_day_cq_replication_impl_content_durbo_durbo_import_configuration_prov_properties() ::
  [ {'preserve_hierarchy_nodes', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
  | {'ignore_versioning', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
  | {'import_acl', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
  | {'save_threshold', openapi_config_node_property_integer:openapi_config_node_property_integer() }
  | {'preserve_user_paths', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
  | {'preserve_uuid', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
  | {'preserve_uuid_nodetypes', openapi_config_node_property_array:openapi_config_node_property_array() }
  | {'preserve_uuid_subtrees', openapi_config_node_property_array:openapi_config_node_property_array() }
  | {'auto_commit', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
  ].


openapi_com_day_cq_replication_impl_content_durbo_durbo_import_configuration_prov_properties() ->
    openapi_com_day_cq_replication_impl_content_durbo_durbo_import_configuration_prov_properties([]).

openapi_com_day_cq_replication_impl_content_durbo_durbo_import_configuration_prov_properties(Fields) ->
  Default = [ {'preserve.hierarchy.nodes', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
            , {'ignore.versioning', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
            , {'import.acl', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
            , {'save.threshold', openapi_config_node_property_integer:openapi_config_node_property_integer() }
            , {'preserve.user.paths', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
            , {'preserve.uuid', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
            , {'preserve.uuid.nodetypes', openapi_config_node_property_array:openapi_config_node_property_array() }
            , {'preserve.uuid.subtrees', openapi_config_node_property_array:openapi_config_node_property_array() }
            , {'auto.commit', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

