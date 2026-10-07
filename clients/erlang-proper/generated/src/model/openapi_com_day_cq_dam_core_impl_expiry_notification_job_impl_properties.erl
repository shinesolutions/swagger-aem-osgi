-module(openapi_com_day_cq_dam_core_impl_expiry_notification_job_impl_properties).

-include("openapi.hrl").

-export([openapi_com_day_cq_dam_core_impl_expiry_notification_job_impl_properties/0]).

-export([openapi_com_day_cq_dam_core_impl_expiry_notification_job_impl_properties/1]).

-export_type([openapi_com_day_cq_dam_core_impl_expiry_notification_job_impl_properties/0]).

-type openapi_com_day_cq_dam_core_impl_expiry_notification_job_impl_properties() ::
  [ {'cq_dam_expiry_notification_scheduler_istimebased', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
  | {'cq_dam_expiry_notification_scheduler_timebased_rule', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'cq_dam_expiry_notification_scheduler_period_rule', openapi_config_node_property_integer:openapi_config_node_property_integer() }
  | {'send_email', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
  | {'asset_expired_limit', openapi_config_node_property_integer:openapi_config_node_property_integer() }
  | {'prior_notification_seconds', openapi_config_node_property_integer:openapi_config_node_property_integer() }
  | {'cq_dam_expiry_notification_url_protocol', openapi_config_node_property_string:openapi_config_node_property_string() }
  ].


openapi_com_day_cq_dam_core_impl_expiry_notification_job_impl_properties() ->
    openapi_com_day_cq_dam_core_impl_expiry_notification_job_impl_properties([]).

openapi_com_day_cq_dam_core_impl_expiry_notification_job_impl_properties(Fields) ->
  Default = [ {'cq.dam.expiry.notification.scheduler.istimebased', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
            , {'cq.dam.expiry.notification.scheduler.timebased.rule', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'cq.dam.expiry.notification.scheduler.period.rule', openapi_config_node_property_integer:openapi_config_node_property_integer() }
            , {'send_email', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
            , {'asset_expired_limit', openapi_config_node_property_integer:openapi_config_node_property_integer() }
            , {'prior_notification_seconds', openapi_config_node_property_integer:openapi_config_node_property_integer() }
            , {'cq.dam.expiry.notification.url.protocol', openapi_config_node_property_string:openapi_config_node_property_string() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

