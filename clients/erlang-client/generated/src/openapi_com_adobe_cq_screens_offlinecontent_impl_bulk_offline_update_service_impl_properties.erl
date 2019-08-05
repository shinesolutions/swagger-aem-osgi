-module(openapi_com_adobe_cq_screens_offlinecontent_impl_bulk_offline_update_service_impl_properties).

-export([encode/1]).

-export_type([openapi_com_adobe_cq_screens_offlinecontent_impl_bulk_offline_update_service_impl_properties/0]).

-type openapi_com_adobe_cq_screens_offlinecontent_impl_bulk_offline_update_service_impl_properties() ::
    #{ 'com_adobe_cq_screens_offlinecontent_impl_BulkOfflineUpdateServiceImpl_projectPath' => openapi_config_node_property_array:openapi_config_node_property_array(),
       'com_adobe_cq_screens_offlinecontent_impl_BulkOfflineUpdateServiceImpl_scheduleFrequency' => openapi_config_node_property_string:openapi_config_node_property_string()
     }.

encode(#{ 'com_adobe_cq_screens_offlinecontent_impl_BulkOfflineUpdateServiceImpl_projectPath' := ComAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplProjectPath,
          'com_adobe_cq_screens_offlinecontent_impl_BulkOfflineUpdateServiceImpl_scheduleFrequency' := ComAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplScheduleFrequency
        }) ->
    #{ 'com.adobe.cq.screens.offlinecontent.impl.BulkOfflineUpdateServiceImpl.projectPath' => ComAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplProjectPath,
       'com.adobe.cq.screens.offlinecontent.impl.BulkOfflineUpdateServiceImpl.scheduleFrequency' => ComAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplScheduleFrequency
     }.
