-module(openapi_com_day_cq_workflow_impl_email_e_mail_notification_service_properties).

-include("openapi.hrl").

-export([openapi_com_day_cq_workflow_impl_email_e_mail_notification_service_properties/0]).

-export([openapi_com_day_cq_workflow_impl_email_e_mail_notification_service_properties/1]).

-export_type([openapi_com_day_cq_workflow_impl_email_e_mail_notification_service_properties/0]).

-type openapi_com_day_cq_workflow_impl_email_e_mail_notification_service_properties() ::
  [ {'from_address', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'host_prefix', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'notify_onabort', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
  | {'notify_oncomplete', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
  | {'notify_oncontainercomplete', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
  | {'notify_useronly', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
  ].


openapi_com_day_cq_workflow_impl_email_e_mail_notification_service_properties() ->
    openapi_com_day_cq_workflow_impl_email_e_mail_notification_service_properties([]).

openapi_com_day_cq_workflow_impl_email_e_mail_notification_service_properties(Fields) ->
  Default = [ {'from.address', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'host.prefix', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'notify.onabort', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
            , {'notify.oncomplete', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
            , {'notify.oncontainercomplete', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
            , {'notify.useronly', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

