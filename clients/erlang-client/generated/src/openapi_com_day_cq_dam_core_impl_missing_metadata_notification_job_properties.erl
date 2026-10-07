-module(openapi_com_day_cq_dam_core_impl_missing_metadata_notification_job_properties).

-export([encode/1]).

-export_type([openapi_com_day_cq_dam_core_impl_missing_metadata_notification_job_properties/0]).

-type openapi_com_day_cq_dam_core_impl_missing_metadata_notification_job_properties() ::
    #{ 'cq_dam_missingmetadata_notification_scheduler_istimebased' => openapi_config_node_property_boolean:openapi_config_node_property_boolean(),
       'cq_dam_missingmetadata_notification_scheduler_timebased_rule' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'cq_dam_missingmetadata_notification_scheduler_period_rule' => openapi_config_node_property_integer:openapi_config_node_property_integer(),
       'cq_dam_missingmetadata_notification_recipient' => openapi_config_node_property_string:openapi_config_node_property_string()
     }.

encode(#{ 'cq_dam_missingmetadata_notification_scheduler_istimebased' := CqDamMissingmetadataNotificationSchedulerIstimebased,
          'cq_dam_missingmetadata_notification_scheduler_timebased_rule' := CqDamMissingmetadataNotificationSchedulerTimebasedRule,
          'cq_dam_missingmetadata_notification_scheduler_period_rule' := CqDamMissingmetadataNotificationSchedulerPeriodRule,
          'cq_dam_missingmetadata_notification_recipient' := CqDamMissingmetadataNotificationRecipient
        }) ->
    #{ 'cq.dam.missingmetadata.notification.scheduler.istimebased' => CqDamMissingmetadataNotificationSchedulerIstimebased,
       'cq.dam.missingmetadata.notification.scheduler.timebased.rule' => CqDamMissingmetadataNotificationSchedulerTimebasedRule,
       'cq.dam.missingmetadata.notification.scheduler.period.rule' => CqDamMissingmetadataNotificationSchedulerPeriodRule,
       'cq.dam.missingmetadata.notification.recipient' => CqDamMissingmetadataNotificationRecipient
     }.
