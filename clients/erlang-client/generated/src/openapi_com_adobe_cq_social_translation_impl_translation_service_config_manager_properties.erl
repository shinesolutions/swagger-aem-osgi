-module(openapi_com_adobe_cq_social_translation_impl_translation_service_config_manager_properties).

-export([encode/1]).

-export_type([openapi_com_adobe_cq_social_translation_impl_translation_service_config_manager_properties/0]).

-type openapi_com_adobe_cq_social_translation_impl_translation_service_config_manager_properties() ::
    #{ 'translate_language' => openapi_config_node_property_drop_down:openapi_config_node_property_drop_down(),
       'translate_display' => openapi_config_node_property_drop_down:openapi_config_node_property_drop_down(),
       'translate_attribution' => openapi_config_node_property_boolean:openapi_config_node_property_boolean(),
       'translate_caching' => openapi_config_node_property_drop_down:openapi_config_node_property_drop_down(),
       'translate_smart_rendering' => openapi_config_node_property_drop_down:openapi_config_node_property_drop_down(),
       'translate_caching_duration' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'translate_session_save_interval' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'translate_session_save_batchLimit' => openapi_config_node_property_string:openapi_config_node_property_string()
     }.

encode(#{ 'translate_language' := TranslateLanguage,
          'translate_display' := TranslateDisplay,
          'translate_attribution' := TranslateAttribution,
          'translate_caching' := TranslateCaching,
          'translate_smart_rendering' := TranslateSmartRendering,
          'translate_caching_duration' := TranslateCachingDuration,
          'translate_session_save_interval' := TranslateSessionSaveInterval,
          'translate_session_save_batchLimit' := TranslateSessionSaveBatchLimit
        }) ->
    #{ 'translate.language' => TranslateLanguage,
       'translate.display' => TranslateDisplay,
       'translate.attribution' => TranslateAttribution,
       'translate.caching' => TranslateCaching,
       'translate.smart.rendering' => TranslateSmartRendering,
       'translate.caching.duration' => TranslateCachingDuration,
       'translate.session.save.interval' => TranslateSessionSaveInterval,
       'translate.session.save.batchLimit' => TranslateSessionSaveBatchLimit
     }.
