-module(openapi_com_adobe_cq_screens_impl_handler_channels_update_handler_properties).

-include("openapi.hrl").

-export([openapi_com_adobe_cq_screens_impl_handler_channels_update_handler_properties/0]).

-export([openapi_com_adobe_cq_screens_impl_handler_channels_update_handler_properties/1]).

-export_type([openapi_com_adobe_cq_screens_impl_handler_channels_update_handler_properties/0]).

-type openapi_com_adobe_cq_screens_impl_handler_channels_update_handler_properties() ::
  [ {'cq_pagesupdatehandler_imageresourcetypes', openapi_config_node_property_array:openapi_config_node_property_array() }
  | {'cq_pagesupdatehandler_productresourcetypes', openapi_config_node_property_array:openapi_config_node_property_array() }
  | {'cq_pagesupdatehandler_videoresourcetypes', openapi_config_node_property_array:openapi_config_node_property_array() }
  | {'cq_pagesupdatehandler_dynamicsequenceresourcetypes', openapi_config_node_property_array:openapi_config_node_property_array() }
  | {'cq_pagesupdatehandler_previewmodepaths', openapi_config_node_property_array:openapi_config_node_property_array() }
  ].


openapi_com_adobe_cq_screens_impl_handler_channels_update_handler_properties() ->
    openapi_com_adobe_cq_screens_impl_handler_channels_update_handler_properties([]).

openapi_com_adobe_cq_screens_impl_handler_channels_update_handler_properties(Fields) ->
  Default = [ {'cq.pagesupdatehandler.imageresourcetypes', openapi_config_node_property_array:openapi_config_node_property_array() }
            , {'cq.pagesupdatehandler.productresourcetypes', openapi_config_node_property_array:openapi_config_node_property_array() }
            , {'cq.pagesupdatehandler.videoresourcetypes', openapi_config_node_property_array:openapi_config_node_property_array() }
            , {'cq.pagesupdatehandler.dynamicsequenceresourcetypes', openapi_config_node_property_array:openapi_config_node_property_array() }
            , {'cq.pagesupdatehandler.previewmodepaths', openapi_config_node_property_array:openapi_config_node_property_array() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

