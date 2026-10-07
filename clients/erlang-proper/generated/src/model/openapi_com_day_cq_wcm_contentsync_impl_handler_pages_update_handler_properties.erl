-module(openapi_com_day_cq_wcm_contentsync_impl_handler_pages_update_handler_properties).

-include("openapi.hrl").

-export([openapi_com_day_cq_wcm_contentsync_impl_handler_pages_update_handler_properties/0]).

-export([openapi_com_day_cq_wcm_contentsync_impl_handler_pages_update_handler_properties/1]).

-export_type([openapi_com_day_cq_wcm_contentsync_impl_handler_pages_update_handler_properties/0]).

-type openapi_com_day_cq_wcm_contentsync_impl_handler_pages_update_handler_properties() ::
  [ {'cq_pagesupdatehandler_imageresourcetypes', openapi_config_node_property_array:openapi_config_node_property_array() }
  ].


openapi_com_day_cq_wcm_contentsync_impl_handler_pages_update_handler_properties() ->
    openapi_com_day_cq_wcm_contentsync_impl_handler_pages_update_handler_properties([]).

openapi_com_day_cq_wcm_contentsync_impl_handler_pages_update_handler_properties(Fields) ->
  Default = [ {'cq.pagesupdatehandler.imageresourcetypes', openapi_config_node_property_array:openapi_config_node_property_array() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

