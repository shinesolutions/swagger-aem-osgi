-module(openapi_com_day_cq_workflow_impl_email_task_e_mail_notification_service_properties).

-include("openapi.hrl").

-export([openapi_com_day_cq_workflow_impl_email_task_e_mail_notification_service_properties/0]).

-export([openapi_com_day_cq_workflow_impl_email_task_e_mail_notification_service_properties/1]).

-export_type([openapi_com_day_cq_workflow_impl_email_task_e_mail_notification_service_properties/0]).

-type openapi_com_day_cq_workflow_impl_email_task_e_mail_notification_service_properties() ::
  [ {'notify_onupdate', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
  | {'notify_oncomplete', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
  ].


openapi_com_day_cq_workflow_impl_email_task_e_mail_notification_service_properties() ->
    openapi_com_day_cq_workflow_impl_email_task_e_mail_notification_service_properties([]).

openapi_com_day_cq_workflow_impl_email_task_e_mail_notification_service_properties(Fields) ->
  Default = [ {'notify.onupdate', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
            , {'notify.oncomplete', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

