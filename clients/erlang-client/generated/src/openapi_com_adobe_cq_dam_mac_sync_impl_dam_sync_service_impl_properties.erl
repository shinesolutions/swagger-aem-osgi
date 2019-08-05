-module(openapi_com_adobe_cq_dam_mac_sync_impl_dam_sync_service_impl_properties).

-export([encode/1]).

-export_type([openapi_com_adobe_cq_dam_mac_sync_impl_dam_sync_service_impl_properties/0]).

-type openapi_com_adobe_cq_dam_mac_sync_impl_dam_sync_service_impl_properties() ::
    #{ 'com_adobe_cq_dam_mac_sync_damsyncservice_registered_paths' => openapi_config_node_property_array:openapi_config_node_property_array(),
       'com_adobe_cq_dam_mac_sync_damsyncservice_sync_renditions' => openapi_config_node_property_boolean:openapi_config_node_property_boolean(),
       'com_adobe_cq_dam_mac_sync_damsyncservice_replicate_thread_wait_ms' => openapi_config_node_property_integer:openapi_config_node_property_integer(),
       'com_adobe_cq_dam_mac_sync_damsyncservice_platform' => openapi_config_node_property_drop_down:openapi_config_node_property_drop_down()
     }.

encode(#{ 'com_adobe_cq_dam_mac_sync_damsyncservice_registered_paths' := ComAdobeCqDamMacSyncDamsyncserviceRegisteredPaths,
          'com_adobe_cq_dam_mac_sync_damsyncservice_sync_renditions' := ComAdobeCqDamMacSyncDamsyncserviceSyncRenditions,
          'com_adobe_cq_dam_mac_sync_damsyncservice_replicate_thread_wait_ms' := ComAdobeCqDamMacSyncDamsyncserviceReplicateThreadWaitMs,
          'com_adobe_cq_dam_mac_sync_damsyncservice_platform' := ComAdobeCqDamMacSyncDamsyncservicePlatform
        }) ->
    #{ 'com.adobe.cq.dam.mac.sync.damsyncservice.registered_paths' => ComAdobeCqDamMacSyncDamsyncserviceRegisteredPaths,
       'com.adobe.cq.dam.mac.sync.damsyncservice.sync.renditions' => ComAdobeCqDamMacSyncDamsyncserviceSyncRenditions,
       'com.adobe.cq.dam.mac.sync.damsyncservice.replicate.thread.wait.ms' => ComAdobeCqDamMacSyncDamsyncserviceReplicateThreadWaitMs,
       'com.adobe.cq.dam.mac.sync.damsyncservice.platform' => ComAdobeCqDamMacSyncDamsyncservicePlatform
     }.
