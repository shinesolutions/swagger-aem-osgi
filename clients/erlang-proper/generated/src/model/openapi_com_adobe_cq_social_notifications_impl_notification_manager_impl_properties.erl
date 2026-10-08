-module(openapi_com_adobe_cq_social_notifications_impl_notification_manager_impl_properties).

-include("openapi.hrl").

-export([openapi_com_adobe_cq_social_notifications_impl_notification_manager_impl_properties/0]).

-export([openapi_com_adobe_cq_social_notifications_impl_notification_manager_impl_properties/1]).

-export_type([openapi_com_adobe_cq_social_notifications_impl_notification_manager_impl_properties/0]).

-type openapi_com_adobe_cq_social_notifications_impl_notification_manager_impl_properties() ::
  [ {'max_unread_notification_count', openapi_config_node_property_integer:openapi_config_node_property_integer() }
  ].


openapi_com_adobe_cq_social_notifications_impl_notification_manager_impl_properties() ->
    openapi_com_adobe_cq_social_notifications_impl_notification_manager_impl_properties([]).

openapi_com_adobe_cq_social_notifications_impl_notification_manager_impl_properties(Fields) ->
  Default = [ {'max.unread.notification.count', openapi_config_node_property_integer:openapi_config_node_property_integer() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

