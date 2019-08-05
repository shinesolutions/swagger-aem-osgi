-module(openapi_com_day_cq_dam_core_impl_foldermetadataschema_folder_metadata_schema_feat_info).

-export([encode/1]).

-export_type([openapi_com_day_cq_dam_core_impl_foldermetadataschema_folder_metadata_schema_feat_info/0]).

-type openapi_com_day_cq_dam_core_impl_foldermetadataschema_folder_metadata_schema_feat_info() ::
    #{ 'pid' => binary(),
       'title' => binary(),
       'description' => binary(),
       'properties' => openapi_com_day_cq_dam_core_impl_foldermetadataschema_folder_metadata_schema_feat_properties:openapi_com_day_cq_dam_core_impl_foldermetadataschema_folder_metadata_schema_feat_properties()
     }.

encode(#{ 'pid' := Pid,
          'title' := Title,
          'description' := Description,
          'properties' := Properties
        }) ->
    #{ 'pid' => Pid,
       'title' => Title,
       'description' => Description,
       'properties' => Properties
     }.
