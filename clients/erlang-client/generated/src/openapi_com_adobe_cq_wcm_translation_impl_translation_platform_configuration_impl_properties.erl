-module(openapi_com_adobe_cq_wcm_translation_impl_translation_platform_configuration_impl_properties).

-export([encode/1]).

-export_type([openapi_com_adobe_cq_wcm_translation_impl_translation_platform_configuration_impl_properties/0]).

-type openapi_com_adobe_cq_wcm_translation_impl_translation_platform_configuration_impl_properties() ::
    #{ 'syncTranslationState_schedulingFormat' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'schedulingRepeatTranslation_schedulingFormat' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'syncTranslationState_lockTimeoutInMinutes' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'export_format' => openapi_config_node_property_drop_down:openapi_config_node_property_drop_down()
     }.

encode(#{ 'syncTranslationState_schedulingFormat' := SyncTranslationStateSchedulingFormat,
          'schedulingRepeatTranslation_schedulingFormat' := SchedulingRepeatTranslationSchedulingFormat,
          'syncTranslationState_lockTimeoutInMinutes' := SyncTranslationStateLockTimeoutInMinutes,
          'export_format' := ExportFormat
        }) ->
    #{ 'syncTranslationState.schedulingFormat' => SyncTranslationStateSchedulingFormat,
       'schedulingRepeatTranslation.schedulingFormat' => SchedulingRepeatTranslationSchedulingFormat,
       'syncTranslationState.lockTimeoutInMinutes' => SyncTranslationStateLockTimeoutInMinutes,
       'export.format' => ExportFormat
     }.
