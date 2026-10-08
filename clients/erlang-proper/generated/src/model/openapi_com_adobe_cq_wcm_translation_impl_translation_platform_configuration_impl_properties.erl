-module(openapi_com_adobe_cq_wcm_translation_impl_translation_platform_configuration_impl_properties).

-include("openapi.hrl").

-export([openapi_com_adobe_cq_wcm_translation_impl_translation_platform_configuration_impl_properties/0]).

-export([openapi_com_adobe_cq_wcm_translation_impl_translation_platform_configuration_impl_properties/1]).

-export_type([openapi_com_adobe_cq_wcm_translation_impl_translation_platform_configuration_impl_properties/0]).

-type openapi_com_adobe_cq_wcm_translation_impl_translation_platform_configuration_impl_properties() ::
  [ {'syncTranslationState_schedulingFormat', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'schedulingRepeatTranslation_schedulingFormat', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'syncTranslationState_lockTimeoutInMinutes', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'export_format', openapi_config_node_property_drop_down:openapi_config_node_property_drop_down() }
  ].


openapi_com_adobe_cq_wcm_translation_impl_translation_platform_configuration_impl_properties() ->
    openapi_com_adobe_cq_wcm_translation_impl_translation_platform_configuration_impl_properties([]).

openapi_com_adobe_cq_wcm_translation_impl_translation_platform_configuration_impl_properties(Fields) ->
  Default = [ {'syncTranslationState.schedulingFormat', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'schedulingRepeatTranslation.schedulingFormat', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'syncTranslationState.lockTimeoutInMinutes', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'export.format', openapi_config_node_property_drop_down:openapi_config_node_property_drop_down() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

