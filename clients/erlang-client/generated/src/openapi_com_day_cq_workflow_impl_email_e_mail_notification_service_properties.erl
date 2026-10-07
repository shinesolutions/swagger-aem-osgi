-module(openapi_com_day_cq_workflow_impl_email_e_mail_notification_service_properties).

-export([encode/1]).

-export_type([openapi_com_day_cq_workflow_impl_email_e_mail_notification_service_properties/0]).

-type openapi_com_day_cq_workflow_impl_email_e_mail_notification_service_properties() ::
    #{ 'from_address' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'host_prefix' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'notify_onabort' => openapi_config_node_property_boolean:openapi_config_node_property_boolean(),
       'notify_oncomplete' => openapi_config_node_property_boolean:openapi_config_node_property_boolean(),
       'notify_oncontainercomplete' => openapi_config_node_property_boolean:openapi_config_node_property_boolean(),
       'notify_useronly' => openapi_config_node_property_boolean:openapi_config_node_property_boolean()
     }.

encode(#{ 'from_address' := FromAddress,
          'host_prefix' := HostPrefix,
          'notify_onabort' := NotifyOnabort,
          'notify_oncomplete' := NotifyOncomplete,
          'notify_oncontainercomplete' := NotifyOncontainercomplete,
          'notify_useronly' := NotifyUseronly
        }) ->
    #{ 'from.address' => FromAddress,
       'host.prefix' => HostPrefix,
       'notify.onabort' => NotifyOnabort,
       'notify.oncomplete' => NotifyOncomplete,
       'notify.oncontainercomplete' => NotifyOncontainercomplete,
       'notify.useronly' => NotifyUseronly
     }.
