-module(openapi_com_day_cq_dam_core_impl_foldermetadataschema_folder_metadata_schema_feat_properties).

-include("openapi.hrl").

-export([openapi_com_day_cq_dam_core_impl_foldermetadataschema_folder_metadata_schema_feat_properties/0]).

-export([openapi_com_day_cq_dam_core_impl_foldermetadataschema_folder_metadata_schema_feat_properties/1]).

-export_type([openapi_com_day_cq_dam_core_impl_foldermetadataschema_folder_metadata_schema_feat_properties/0]).

-type openapi_com_day_cq_dam_core_impl_foldermetadataschema_folder_metadata_schema_feat_properties() ::
  [ {'isEnabled', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
  ].


openapi_com_day_cq_dam_core_impl_foldermetadataschema_folder_metadata_schema_feat_properties() ->
    openapi_com_day_cq_dam_core_impl_foldermetadataschema_folder_metadata_schema_feat_properties([]).

openapi_com_day_cq_dam_core_impl_foldermetadataschema_folder_metadata_schema_feat_properties(Fields) ->
  Default = [ {'isEnabled', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

