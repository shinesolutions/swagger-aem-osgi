-module(openapi_com_adobe_cq_wcm_launches_impl_launches_event_handler_properties).

-include("openapi.hrl").

-export([openapi_com_adobe_cq_wcm_launches_impl_launches_event_handler_properties/0]).

-export([openapi_com_adobe_cq_wcm_launches_impl_launches_event_handler_properties/1]).

-export_type([openapi_com_adobe_cq_wcm_launches_impl_launches_event_handler_properties/0]).

-type openapi_com_adobe_cq_wcm_launches_impl_launches_event_handler_properties() ::
  [ {'event_filter', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'launches_eventhandler_threadpool_maxsize', openapi_config_node_property_integer:openapi_config_node_property_integer() }
  | {'launches_eventhandler_threadpool_priority', openapi_config_node_property_drop_down:openapi_config_node_property_drop_down() }
  | {'launches_eventhandler_updatelastmodification', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
  ].


openapi_com_adobe_cq_wcm_launches_impl_launches_event_handler_properties() ->
    openapi_com_adobe_cq_wcm_launches_impl_launches_event_handler_properties([]).

openapi_com_adobe_cq_wcm_launches_impl_launches_event_handler_properties(Fields) ->
  Default = [ {'event.filter', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'launches.eventhandler.threadpool.maxsize', openapi_config_node_property_integer:openapi_config_node_property_integer() }
            , {'launches.eventhandler.threadpool.priority', openapi_config_node_property_drop_down:openapi_config_node_property_drop_down() }
            , {'launches.eventhandler.updatelastmodification', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

