-module(openapi_com_day_cq_dam_core_impl_missing_metadata_notification_job_properties).

-include("openapi.hrl").

-export([openapi_com_day_cq_dam_core_impl_missing_metadata_notification_job_properties/0]).

-export([openapi_com_day_cq_dam_core_impl_missing_metadata_notification_job_properties/1]).

-export_type([openapi_com_day_cq_dam_core_impl_missing_metadata_notification_job_properties/0]).

-type openapi_com_day_cq_dam_core_impl_missing_metadata_notification_job_properties() ::
  [ {'cq_dam_missingmetadata_notification_scheduler_istimebased', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
  | {'cq_dam_missingmetadata_notification_scheduler_timebased_rule', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'cq_dam_missingmetadata_notification_scheduler_period_rule', openapi_config_node_property_integer:openapi_config_node_property_integer() }
  | {'cq_dam_missingmetadata_notification_recipient', openapi_config_node_property_string:openapi_config_node_property_string() }
  ].


openapi_com_day_cq_dam_core_impl_missing_metadata_notification_job_properties() ->
    openapi_com_day_cq_dam_core_impl_missing_metadata_notification_job_properties([]).

openapi_com_day_cq_dam_core_impl_missing_metadata_notification_job_properties(Fields) ->
  Default = [ {'cq.dam.missingmetadata.notification.scheduler.istimebased', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
            , {'cq.dam.missingmetadata.notification.scheduler.timebased.rule', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'cq.dam.missingmetadata.notification.scheduler.period.rule', openapi_config_node_property_integer:openapi_config_node_property_integer() }
            , {'cq.dam.missingmetadata.notification.recipient', openapi_config_node_property_string:openapi_config_node_property_string() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

