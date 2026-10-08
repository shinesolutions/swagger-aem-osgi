-module(openapi_com_adobe_cq_social_translation_impl_translation_service_config_manager_properties).

-include("openapi.hrl").

-export([openapi_com_adobe_cq_social_translation_impl_translation_service_config_manager_properties/0]).

-export([openapi_com_adobe_cq_social_translation_impl_translation_service_config_manager_properties/1]).

-export_type([openapi_com_adobe_cq_social_translation_impl_translation_service_config_manager_properties/0]).

-type openapi_com_adobe_cq_social_translation_impl_translation_service_config_manager_properties() ::
  [ {'translate_language', openapi_config_node_property_drop_down:openapi_config_node_property_drop_down() }
  | {'translate_display', openapi_config_node_property_drop_down:openapi_config_node_property_drop_down() }
  | {'translate_attribution', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
  | {'translate_caching', openapi_config_node_property_drop_down:openapi_config_node_property_drop_down() }
  | {'translate_smart_rendering', openapi_config_node_property_drop_down:openapi_config_node_property_drop_down() }
  | {'translate_caching_duration', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'translate_session_save_interval', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'translate_session_save_batchLimit', openapi_config_node_property_string:openapi_config_node_property_string() }
  ].


openapi_com_adobe_cq_social_translation_impl_translation_service_config_manager_properties() ->
    openapi_com_adobe_cq_social_translation_impl_translation_service_config_manager_properties([]).

openapi_com_adobe_cq_social_translation_impl_translation_service_config_manager_properties(Fields) ->
  Default = [ {'translate.language', openapi_config_node_property_drop_down:openapi_config_node_property_drop_down() }
            , {'translate.display', openapi_config_node_property_drop_down:openapi_config_node_property_drop_down() }
            , {'translate.attribution', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
            , {'translate.caching', openapi_config_node_property_drop_down:openapi_config_node_property_drop_down() }
            , {'translate.smart.rendering', openapi_config_node_property_drop_down:openapi_config_node_property_drop_down() }
            , {'translate.caching.duration', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'translate.session.save.interval', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'translate.session.save.batchLimit', openapi_config_node_property_string:openapi_config_node_property_string() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

