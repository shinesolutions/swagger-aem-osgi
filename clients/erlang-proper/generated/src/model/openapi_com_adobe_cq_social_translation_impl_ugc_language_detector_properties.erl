-module(openapi_com_adobe_cq_social_translation_impl_ugc_language_detector_properties).

-include("openapi.hrl").

-export([openapi_com_adobe_cq_social_translation_impl_ugc_language_detector_properties/0]).

-export([openapi_com_adobe_cq_social_translation_impl_ugc_language_detector_properties/1]).

-export_type([openapi_com_adobe_cq_social_translation_impl_ugc_language_detector_properties/0]).

-type openapi_com_adobe_cq_social_translation_impl_ugc_language_detector_properties() ::
  [ {'event_topics', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'event_filter', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'translate_listener_type', openapi_config_node_property_array:openapi_config_node_property_array() }
  | {'translate_property_list', openapi_config_node_property_array:openapi_config_node_property_array() }
  | {'poolSize', openapi_config_node_property_integer:openapi_config_node_property_integer() }
  | {'maxPoolSize', openapi_config_node_property_integer:openapi_config_node_property_integer() }
  | {'queueSize', openapi_config_node_property_integer:openapi_config_node_property_integer() }
  | {'keepAliveTime', openapi_config_node_property_integer:openapi_config_node_property_integer() }
  ].


openapi_com_adobe_cq_social_translation_impl_ugc_language_detector_properties() ->
    openapi_com_adobe_cq_social_translation_impl_ugc_language_detector_properties([]).

openapi_com_adobe_cq_social_translation_impl_ugc_language_detector_properties(Fields) ->
  Default = [ {'event.topics', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'event.filter', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'translate.listener.type', openapi_config_node_property_array:openapi_config_node_property_array() }
            , {'translate.property.list', openapi_config_node_property_array:openapi_config_node_property_array() }
            , {'poolSize', openapi_config_node_property_integer:openapi_config_node_property_integer() }
            , {'maxPoolSize', openapi_config_node_property_integer:openapi_config_node_property_integer() }
            , {'queueSize', openapi_config_node_property_integer:openapi_config_node_property_integer() }
            , {'keepAliveTime', openapi_config_node_property_integer:openapi_config_node_property_integer() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

