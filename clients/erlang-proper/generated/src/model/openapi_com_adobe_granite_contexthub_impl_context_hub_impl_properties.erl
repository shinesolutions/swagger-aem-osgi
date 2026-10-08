-module(openapi_com_adobe_granite_contexthub_impl_context_hub_impl_properties).

-include("openapi.hrl").

-export([openapi_com_adobe_granite_contexthub_impl_context_hub_impl_properties/0]).

-export([openapi_com_adobe_granite_contexthub_impl_context_hub_impl_properties/1]).

-export_type([openapi_com_adobe_granite_contexthub_impl_context_hub_impl_properties/0]).

-type openapi_com_adobe_granite_contexthub_impl_context_hub_impl_properties() ::
  [ {'com_adobe_granite_contexthub_silent_mode', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
  | {'com_adobe_granite_contexthub_show_ui', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
  ].


openapi_com_adobe_granite_contexthub_impl_context_hub_impl_properties() ->
    openapi_com_adobe_granite_contexthub_impl_context_hub_impl_properties([]).

openapi_com_adobe_granite_contexthub_impl_context_hub_impl_properties(Fields) ->
  Default = [ {'com.adobe.granite.contexthub.silent_mode', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
            , {'com.adobe.granite.contexthub.show_ui', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

