-module(openapi_com_day_cq_dam_scene7_impl_scene7_upload_service_impl_properties).

-export([encode/1]).

-export_type([openapi_com_day_cq_dam_scene7_impl_scene7_upload_service_impl_properties/0]).

-type openapi_com_day_cq_dam_scene7_impl_scene7_upload_service_impl_properties() ::
    #{ 'cq_dam_scene7_uploadservice_activejobtimeout_label' => openapi_config_node_property_integer:openapi_config_node_property_integer(),
       'cq_dam_scene7_uploadservice_connectionmaxperroute_label' => openapi_config_node_property_integer:openapi_config_node_property_integer()
     }.

encode(#{ 'cq_dam_scene7_uploadservice_activejobtimeout_label' := CqDamScene7UploadserviceActivejobtimeoutLabel,
          'cq_dam_scene7_uploadservice_connectionmaxperroute_label' := CqDamScene7UploadserviceConnectionmaxperrouteLabel
        }) ->
    #{ 'cq.dam.scene7.uploadservice.activejobtimeout.label' => CqDamScene7UploadserviceActivejobtimeoutLabel,
       'cq.dam.scene7.uploadservice.connectionmaxperroute.label' => CqDamScene7UploadserviceConnectionmaxperrouteLabel
     }.
