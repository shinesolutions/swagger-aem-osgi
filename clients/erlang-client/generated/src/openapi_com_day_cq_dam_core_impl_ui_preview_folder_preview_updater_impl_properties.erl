-module(openapi_com_day_cq_dam_core_impl_ui_preview_folder_preview_updater_impl_properties).

-export([encode/1]).

-export_type([openapi_com_day_cq_dam_core_impl_ui_preview_folder_preview_updater_impl_properties/0]).

-type openapi_com_day_cq_dam_core_impl_ui_preview_folder_preview_updater_impl_properties() ::
    #{ 'createPreviewEnabled' => openapi_config_node_property_boolean:openapi_config_node_property_boolean(),
       'updatePreviewEnabled' => openapi_config_node_property_boolean:openapi_config_node_property_boolean(),
       'queueSize' => openapi_config_node_property_integer:openapi_config_node_property_integer(),
       'folderPreviewRenditionRegex' => openapi_config_node_property_string:openapi_config_node_property_string()
     }.

encode(#{ 'createPreviewEnabled' := CreatePreviewEnabled,
          'updatePreviewEnabled' := UpdatePreviewEnabled,
          'queueSize' := QueueSize,
          'folderPreviewRenditionRegex' := FolderPreviewRenditionRegex
        }) ->
    #{ 'createPreviewEnabled' => CreatePreviewEnabled,
       'updatePreviewEnabled' => UpdatePreviewEnabled,
       'queueSize' => QueueSize,
       'folderPreviewRenditionRegex' => FolderPreviewRenditionRegex
     }.
