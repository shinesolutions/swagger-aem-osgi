-module(openapi_com_day_cq_dam_core_impl_foldermetadataschema_folder_metadata_schema_feat_properties).

-export([encode/1]).

-export_type([openapi_com_day_cq_dam_core_impl_foldermetadataschema_folder_metadata_schema_feat_properties/0]).

-type openapi_com_day_cq_dam_core_impl_foldermetadataschema_folder_metadata_schema_feat_properties() ::
    #{ 'isEnabled' => openapi_config_node_property_boolean:openapi_config_node_property_boolean()
     }.

encode(#{ 'isEnabled' := IsEnabled
        }) ->
    #{ 'isEnabled' => IsEnabled
     }.
