-module(openapi_com_day_cq_widget_impl_widget_extension_provider_impl_properties).

-include("openapi.hrl").

-export([openapi_com_day_cq_widget_impl_widget_extension_provider_impl_properties/0]).

-export([openapi_com_day_cq_widget_impl_widget_extension_provider_impl_properties/1]).

-export_type([openapi_com_day_cq_widget_impl_widget_extension_provider_impl_properties/0]).

-type openapi_com_day_cq_widget_impl_widget_extension_provider_impl_properties() ::
  [ {'extendable_widgets', openapi_config_node_property_array:openapi_config_node_property_array() }
  | {'widgetextensionprovider_debug', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
  ].


openapi_com_day_cq_widget_impl_widget_extension_provider_impl_properties() ->
    openapi_com_day_cq_widget_impl_widget_extension_provider_impl_properties([]).

openapi_com_day_cq_widget_impl_widget_extension_provider_impl_properties(Fields) ->
  Default = [ {'extendable.widgets', openapi_config_node_property_array:openapi_config_node_property_array() }
            , {'widgetextensionprovider.debug', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

