-module(openapi_com_adobe_cq_dam_webdav_impl_io_special_files_handler_properties).

-export([encode/1]).

-export_type([openapi_com_adobe_cq_dam_webdav_impl_io_special_files_handler_properties/0]).

-type openapi_com_adobe_cq_dam_webdav_impl_io_special_files_handler_properties() ::
    #{ 'com_day_cq_dam_core_impl_io_SpecialFilesHandler_filepatters' => openapi_config_node_property_array:openapi_config_node_property_array()
     }.

encode(#{ 'com_day_cq_dam_core_impl_io_SpecialFilesHandler_filepatters' := ComDayCqDamCoreImplIoSpecialFilesHandlerFilepatters
        }) ->
    #{ 'com.day.cq.dam.core.impl.io.SpecialFilesHandler.filepatters' => ComDayCqDamCoreImplIoSpecialFilesHandlerFilepatters
     }.
