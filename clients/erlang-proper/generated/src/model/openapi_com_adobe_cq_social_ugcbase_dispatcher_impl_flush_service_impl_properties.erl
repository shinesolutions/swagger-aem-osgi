-module(openapi_com_adobe_cq_social_ugcbase_dispatcher_impl_flush_service_impl_properties).

-include("openapi.hrl").

-export([openapi_com_adobe_cq_social_ugcbase_dispatcher_impl_flush_service_impl_properties/0]).

-export([openapi_com_adobe_cq_social_ugcbase_dispatcher_impl_flush_service_impl_properties/1]).

-export_type([openapi_com_adobe_cq_social_ugcbase_dispatcher_impl_flush_service_impl_properties/0]).

-type openapi_com_adobe_cq_social_ugcbase_dispatcher_impl_flush_service_impl_properties() ::
  [ {'threadPoolSize', openapi_config_node_property_integer:openapi_config_node_property_integer() }
  | {'delayTime', openapi_config_node_property_integer:openapi_config_node_property_integer() }
  | {'workerSleepTime', openapi_config_node_property_integer:openapi_config_node_property_integer() }
  ].


openapi_com_adobe_cq_social_ugcbase_dispatcher_impl_flush_service_impl_properties() ->
    openapi_com_adobe_cq_social_ugcbase_dispatcher_impl_flush_service_impl_properties([]).

openapi_com_adobe_cq_social_ugcbase_dispatcher_impl_flush_service_impl_properties(Fields) ->
  Default = [ {'threadPoolSize', openapi_config_node_property_integer:openapi_config_node_property_integer() }
            , {'delayTime', openapi_config_node_property_integer:openapi_config_node_property_integer() }
            , {'workerSleepTime', openapi_config_node_property_integer:openapi_config_node_property_integer() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

