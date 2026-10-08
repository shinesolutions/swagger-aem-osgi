-module(openapi_com_adobe_granite_translation_connector_msft_core_impl_microsoft_transl_properties).

-include("openapi.hrl").

-export([openapi_com_adobe_granite_translation_connector_msft_core_impl_microsoft_transl_properties/0]).

-export([openapi_com_adobe_granite_translation_connector_msft_core_impl_microsoft_transl_properties/1]).

-export_type([openapi_com_adobe_granite_translation_connector_msft_core_impl_microsoft_transl_properties/0]).

-type openapi_com_adobe_granite_translation_connector_msft_core_impl_microsoft_transl_properties() ::
  [ {'translationFactory', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'defaultConnectorLabel', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'defaultConnectorAttribution', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'defaultConnectorWorkspaceId', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'defaultConnectorSubscriptionKey', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'languageMapLocation', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'categoryMapLocation', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'retryAttempts', openapi_config_node_property_integer:openapi_config_node_property_integer() }
  | {'timeoutCount', openapi_config_node_property_integer:openapi_config_node_property_integer() }
  ].


openapi_com_adobe_granite_translation_connector_msft_core_impl_microsoft_transl_properties() ->
    openapi_com_adobe_granite_translation_connector_msft_core_impl_microsoft_transl_properties([]).

openapi_com_adobe_granite_translation_connector_msft_core_impl_microsoft_transl_properties(Fields) ->
  Default = [ {'translationFactory', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'defaultConnectorLabel', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'defaultConnectorAttribution', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'defaultConnectorWorkspaceId', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'defaultConnectorSubscriptionKey', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'languageMapLocation', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'categoryMapLocation', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'retryAttempts', openapi_config_node_property_integer:openapi_config_node_property_integer() }
            , {'timeoutCount', openapi_config_node_property_integer:openapi_config_node_property_integer() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

