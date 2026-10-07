-module(openapi_com_day_cq_dam_core_impl_foldermetadataschema_folder_metadata_schema_feat_info).

-include("openapi.hrl").

-export([openapi_com_day_cq_dam_core_impl_foldermetadataschema_folder_metadata_schema_feat_info/0]).

-export([openapi_com_day_cq_dam_core_impl_foldermetadataschema_folder_metadata_schema_feat_info/1]).

-export_type([openapi_com_day_cq_dam_core_impl_foldermetadataschema_folder_metadata_schema_feat_info/0]).

-type openapi_com_day_cq_dam_core_impl_foldermetadataschema_folder_metadata_schema_feat_info() ::
  [ {'pid', binary() }
  | {'title', binary() }
  | {'description', binary() }
  | {'properties', openapi_com_day_cq_dam_core_impl_foldermetadataschema_folder_metadata_schema_feat_properties:openapi_com_day_cq_dam_core_impl_foldermetadataschema_folder_metadata_schema_feat_properties() }
  ].


openapi_com_day_cq_dam_core_impl_foldermetadataschema_folder_metadata_schema_feat_info() ->
    openapi_com_day_cq_dam_core_impl_foldermetadataschema_folder_metadata_schema_feat_info([]).

openapi_com_day_cq_dam_core_impl_foldermetadataschema_folder_metadata_schema_feat_info(Fields) ->
  Default = [ {'pid', binary() }
            , {'title', binary() }
            , {'description', binary() }
            , {'properties', openapi_com_day_cq_dam_core_impl_foldermetadataschema_folder_metadata_schema_feat_properties:openapi_com_day_cq_dam_core_impl_foldermetadataschema_folder_metadata_schema_feat_properties() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

