-module(openapi_com_adobe_granite_translation_connector_msft_core_impl_microsoft_transl_properties).

-export([encode/1]).

-export_type([openapi_com_adobe_granite_translation_connector_msft_core_impl_microsoft_transl_properties/0]).

-type openapi_com_adobe_granite_translation_connector_msft_core_impl_microsoft_transl_properties() ::
    #{ 'translationFactory' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'defaultConnectorLabel' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'defaultConnectorAttribution' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'defaultConnectorWorkspaceId' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'defaultConnectorSubscriptionKey' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'languageMapLocation' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'categoryMapLocation' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'retryAttempts' => openapi_config_node_property_integer:openapi_config_node_property_integer(),
       'timeoutCount' => openapi_config_node_property_integer:openapi_config_node_property_integer()
     }.

encode(#{ 'translationFactory' := TranslationFactory,
          'defaultConnectorLabel' := DefaultConnectorLabel,
          'defaultConnectorAttribution' := DefaultConnectorAttribution,
          'defaultConnectorWorkspaceId' := DefaultConnectorWorkspaceId,
          'defaultConnectorSubscriptionKey' := DefaultConnectorSubscriptionKey,
          'languageMapLocation' := LanguageMapLocation,
          'categoryMapLocation' := CategoryMapLocation,
          'retryAttempts' := RetryAttempts,
          'timeoutCount' := TimeoutCount
        }) ->
    #{ 'translationFactory' => TranslationFactory,
       'defaultConnectorLabel' => DefaultConnectorLabel,
       'defaultConnectorAttribution' => DefaultConnectorAttribution,
       'defaultConnectorWorkspaceId' => DefaultConnectorWorkspaceId,
       'defaultConnectorSubscriptionKey' => DefaultConnectorSubscriptionKey,
       'languageMapLocation' => LanguageMapLocation,
       'categoryMapLocation' => CategoryMapLocation,
       'retryAttempts' => RetryAttempts,
       'timeoutCount' => TimeoutCount
     }.
