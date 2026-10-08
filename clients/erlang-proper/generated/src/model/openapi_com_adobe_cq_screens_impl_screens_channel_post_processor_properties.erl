-module(openapi_com_adobe_cq_screens_impl_screens_channel_post_processor_properties).

-include("openapi.hrl").

-export([openapi_com_adobe_cq_screens_impl_screens_channel_post_processor_properties/0]).

-export([openapi_com_adobe_cq_screens_impl_screens_channel_post_processor_properties/1]).

-export_type([openapi_com_adobe_cq_screens_impl_screens_channel_post_processor_properties/0]).

-type openapi_com_adobe_cq_screens_impl_screens_channel_post_processor_properties() ::
  [ {'screens_channels_properties_to_remove', openapi_config_node_property_array:openapi_config_node_property_array() }
  ].


openapi_com_adobe_cq_screens_impl_screens_channel_post_processor_properties() ->
    openapi_com_adobe_cq_screens_impl_screens_channel_post_processor_properties([]).

openapi_com_adobe_cq_screens_impl_screens_channel_post_processor_properties(Fields) ->
  Default = [ {'screens.channels.properties.to.remove', openapi_config_node_property_array:openapi_config_node_property_array() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

