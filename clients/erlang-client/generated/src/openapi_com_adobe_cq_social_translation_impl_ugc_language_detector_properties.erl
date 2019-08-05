-module(openapi_com_adobe_cq_social_translation_impl_ugc_language_detector_properties).

-export([encode/1]).

-export_type([openapi_com_adobe_cq_social_translation_impl_ugc_language_detector_properties/0]).

-type openapi_com_adobe_cq_social_translation_impl_ugc_language_detector_properties() ::
    #{ 'event_topics' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'event_filter' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'translate_listener_type' => openapi_config_node_property_array:openapi_config_node_property_array(),
       'translate_property_list' => openapi_config_node_property_array:openapi_config_node_property_array(),
       'poolSize' => openapi_config_node_property_integer:openapi_config_node_property_integer(),
       'maxPoolSize' => openapi_config_node_property_integer:openapi_config_node_property_integer(),
       'queueSize' => openapi_config_node_property_integer:openapi_config_node_property_integer(),
       'keepAliveTime' => openapi_config_node_property_integer:openapi_config_node_property_integer()
     }.

encode(#{ 'event_topics' := EventTopics,
          'event_filter' := EventFilter,
          'translate_listener_type' := TranslateListenerType,
          'translate_property_list' := TranslatePropertyList,
          'poolSize' := PoolSize,
          'maxPoolSize' := MaxPoolSize,
          'queueSize' := QueueSize,
          'keepAliveTime' := KeepAliveTime
        }) ->
    #{ 'event.topics' => EventTopics,
       'event.filter' => EventFilter,
       'translate.listener.type' => TranslateListenerType,
       'translate.property.list' => TranslatePropertyList,
       'poolSize' => PoolSize,
       'maxPoolSize' => MaxPoolSize,
       'queueSize' => QueueSize,
       'keepAliveTime' => KeepAliveTime
     }.
