-module(openapi_com_adobe_granite_contexthub_impl_context_hub_impl_properties).

-export([encode/1]).

-export_type([openapi_com_adobe_granite_contexthub_impl_context_hub_impl_properties/0]).

-type openapi_com_adobe_granite_contexthub_impl_context_hub_impl_properties() ::
    #{ 'com_adobe_granite_contexthub_silent_mode' => openapi_config_node_property_boolean:openapi_config_node_property_boolean(),
       'com_adobe_granite_contexthub_show_ui' => openapi_config_node_property_boolean:openapi_config_node_property_boolean()
     }.

encode(#{ 'com_adobe_granite_contexthub_silent_mode' := ComAdobeGraniteContexthubSilentMode,
          'com_adobe_granite_contexthub_show_ui' := ComAdobeGraniteContexthubShowUi
        }) ->
    #{ 'com.adobe.granite.contexthub.silent_mode' => ComAdobeGraniteContexthubSilentMode,
       'com.adobe.granite.contexthub.show_ui' => ComAdobeGraniteContexthubShowUi
     }.
