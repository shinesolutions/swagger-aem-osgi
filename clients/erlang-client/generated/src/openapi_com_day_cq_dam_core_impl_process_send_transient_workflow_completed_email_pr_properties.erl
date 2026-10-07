-module(openapi_com_day_cq_dam_core_impl_process_send_transient_workflow_completed_email_pr_properties).

-export([encode/1]).

-export_type([openapi_com_day_cq_dam_core_impl_process_send_transient_workflow_completed_email_pr_properties/0]).

-type openapi_com_day_cq_dam_core_impl_process_send_transient_workflow_completed_email_pr_properties() ::
    #{ 'process_label' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'Notify_on_Complete' => openapi_config_node_property_boolean:openapi_config_node_property_boolean()
     }.

encode(#{ 'process_label' := ProcessLabel,
          'Notify_on_Complete' := NotifyOnComplete
        }) ->
    #{ 'process.label' => ProcessLabel,
       'Notify on Complete' => NotifyOnComplete
     }.
