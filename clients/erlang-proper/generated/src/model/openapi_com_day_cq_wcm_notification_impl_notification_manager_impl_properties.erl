-module(openapi_com_day_cq_wcm_notification_impl_notification_manager_impl_properties).

-include("openapi.hrl").

-export([openapi_com_day_cq_wcm_notification_impl_notification_manager_impl_properties/0]).

-export([openapi_com_day_cq_wcm_notification_impl_notification_manager_impl_properties/1]).

-export_type([openapi_com_day_cq_wcm_notification_impl_notification_manager_impl_properties/0]).

-type openapi_com_day_cq_wcm_notification_impl_notification_manager_impl_properties() ::
  [ {'event_topics', openapi_config_node_property_array:openapi_config_node_property_array() }
  ].


openapi_com_day_cq_wcm_notification_impl_notification_manager_impl_properties() ->
    openapi_com_day_cq_wcm_notification_impl_notification_manager_impl_properties([]).

openapi_com_day_cq_wcm_notification_impl_notification_manager_impl_properties(Fields) ->
  Default = [ {'event.topics', openapi_config_node_property_array:openapi_config_node_property_array() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

