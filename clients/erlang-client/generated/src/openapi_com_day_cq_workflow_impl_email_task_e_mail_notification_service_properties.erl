-module(openapi_com_day_cq_workflow_impl_email_task_e_mail_notification_service_properties).

-export([encode/1]).

-export_type([openapi_com_day_cq_workflow_impl_email_task_e_mail_notification_service_properties/0]).

-type openapi_com_day_cq_workflow_impl_email_task_e_mail_notification_service_properties() ::
    #{ 'notify_onupdate' => openapi_config_node_property_boolean:openapi_config_node_property_boolean(),
       'notify_oncomplete' => openapi_config_node_property_boolean:openapi_config_node_property_boolean()
     }.

encode(#{ 'notify_onupdate' := NotifyOnupdate,
          'notify_oncomplete' := NotifyOncomplete
        }) ->
    #{ 'notify.onupdate' => NotifyOnupdate,
       'notify.oncomplete' => NotifyOncomplete
     }.
