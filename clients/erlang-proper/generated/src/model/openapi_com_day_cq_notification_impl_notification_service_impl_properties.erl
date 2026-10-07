-module(openapi_com_day_cq_notification_impl_notification_service_impl_properties).

-include("openapi.hrl").

-export([openapi_com_day_cq_notification_impl_notification_service_impl_properties/0]).

-export([openapi_com_day_cq_notification_impl_notification_service_impl_properties/1]).

-export_type([openapi_com_day_cq_notification_impl_notification_service_impl_properties/0]).

-type openapi_com_day_cq_notification_impl_notification_service_impl_properties() ::
  [ {'event_filter', openapi_config_node_property_string:openapi_config_node_property_string() }
  ].


openapi_com_day_cq_notification_impl_notification_service_impl_properties() ->
    openapi_com_day_cq_notification_impl_notification_service_impl_properties([]).

openapi_com_day_cq_notification_impl_notification_service_impl_properties(Fields) ->
  Default = [ {'event.filter', openapi_config_node_property_string:openapi_config_node_property_string() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

