-module(openapi_com_day_cq_dam_core_impl_expiry_notification_job_impl_properties).

-export([encode/1]).

-export_type([openapi_com_day_cq_dam_core_impl_expiry_notification_job_impl_properties/0]).

-type openapi_com_day_cq_dam_core_impl_expiry_notification_job_impl_properties() ::
    #{ 'cq_dam_expiry_notification_scheduler_istimebased' => openapi_config_node_property_boolean:openapi_config_node_property_boolean(),
       'cq_dam_expiry_notification_scheduler_timebased_rule' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'cq_dam_expiry_notification_scheduler_period_rule' => openapi_config_node_property_integer:openapi_config_node_property_integer(),
       'send_email' => openapi_config_node_property_boolean:openapi_config_node_property_boolean(),
       'asset_expired_limit' => openapi_config_node_property_integer:openapi_config_node_property_integer(),
       'prior_notification_seconds' => openapi_config_node_property_integer:openapi_config_node_property_integer(),
       'cq_dam_expiry_notification_url_protocol' => openapi_config_node_property_string:openapi_config_node_property_string()
     }.

encode(#{ 'cq_dam_expiry_notification_scheduler_istimebased' := CqDamExpiryNotificationSchedulerIstimebased,
          'cq_dam_expiry_notification_scheduler_timebased_rule' := CqDamExpiryNotificationSchedulerTimebasedRule,
          'cq_dam_expiry_notification_scheduler_period_rule' := CqDamExpiryNotificationSchedulerPeriodRule,
          'send_email' := SendEmail,
          'asset_expired_limit' := AssetExpiredLimit,
          'prior_notification_seconds' := PriorNotificationSeconds,
          'cq_dam_expiry_notification_url_protocol' := CqDamExpiryNotificationUrlProtocol
        }) ->
    #{ 'cq.dam.expiry.notification.scheduler.istimebased' => CqDamExpiryNotificationSchedulerIstimebased,
       'cq.dam.expiry.notification.scheduler.timebased.rule' => CqDamExpiryNotificationSchedulerTimebasedRule,
       'cq.dam.expiry.notification.scheduler.period.rule' => CqDamExpiryNotificationSchedulerPeriodRule,
       'send_email' => SendEmail,
       'asset_expired_limit' => AssetExpiredLimit,
       'prior_notification_seconds' => PriorNotificationSeconds,
       'cq.dam.expiry.notification.url.protocol' => CqDamExpiryNotificationUrlProtocol
     }.
