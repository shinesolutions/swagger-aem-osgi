-module(openapi_com_day_cq_widget_impl_widget_extension_provider_impl_properties).

-export([encode/1]).

-export_type([openapi_com_day_cq_widget_impl_widget_extension_provider_impl_properties/0]).

-type openapi_com_day_cq_widget_impl_widget_extension_provider_impl_properties() ::
    #{ 'extendable_widgets' => openapi_config_node_property_array:openapi_config_node_property_array(),
       'widgetextensionprovider_debug' => openapi_config_node_property_boolean:openapi_config_node_property_boolean()
     }.

encode(#{ 'extendable_widgets' := ExtendableWidgets,
          'widgetextensionprovider_debug' := WidgetextensionproviderDebug
        }) ->
    #{ 'extendable.widgets' => ExtendableWidgets,
       'widgetextensionprovider.debug' => WidgetextensionproviderDebug
     }.
