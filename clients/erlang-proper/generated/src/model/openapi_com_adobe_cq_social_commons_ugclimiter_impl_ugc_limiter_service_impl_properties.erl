-module(openapi_com_adobe_cq_social_commons_ugclimiter_impl_ugc_limiter_service_impl_properties).

-include("openapi.hrl").

-export([openapi_com_adobe_cq_social_commons_ugclimiter_impl_ugc_limiter_service_impl_properties/0]).

-export([openapi_com_adobe_cq_social_commons_ugclimiter_impl_ugc_limiter_service_impl_properties/1]).

-export_type([openapi_com_adobe_cq_social_commons_ugclimiter_impl_ugc_limiter_service_impl_properties/0]).

-type openapi_com_adobe_cq_social_commons_ugclimiter_impl_ugc_limiter_service_impl_properties() ::
  [ {'event_topics', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'event_filter', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'verbs', openapi_config_node_property_array:openapi_config_node_property_array() }
  ].


openapi_com_adobe_cq_social_commons_ugclimiter_impl_ugc_limiter_service_impl_properties() ->
    openapi_com_adobe_cq_social_commons_ugclimiter_impl_ugc_limiter_service_impl_properties([]).

openapi_com_adobe_cq_social_commons_ugclimiter_impl_ugc_limiter_service_impl_properties(Fields) ->
  Default = [ {'event.topics', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'event.filter', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'verbs', openapi_config_node_property_array:openapi_config_node_property_array() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

