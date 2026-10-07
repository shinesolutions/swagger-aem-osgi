-module(openapi_com_day_cq_contentsync_impl_content_sync_manager_impl_properties).

-include("openapi.hrl").

-export([openapi_com_day_cq_contentsync_impl_content_sync_manager_impl_properties/0]).

-export([openapi_com_day_cq_contentsync_impl_content_sync_manager_impl_properties/1]).

-export_type([openapi_com_day_cq_contentsync_impl_content_sync_manager_impl_properties/0]).

-type openapi_com_day_cq_contentsync_impl_content_sync_manager_impl_properties() ::
  [ {'contentsync_fallback_authorizable', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'contentsync_fallback_updateuser', openapi_config_node_property_string:openapi_config_node_property_string() }
  ].


openapi_com_day_cq_contentsync_impl_content_sync_manager_impl_properties() ->
    openapi_com_day_cq_contentsync_impl_content_sync_manager_impl_properties([]).

openapi_com_day_cq_contentsync_impl_content_sync_manager_impl_properties(Fields) ->
  Default = [ {'contentsync.fallback.authorizable', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'contentsync.fallback.updateuser', openapi_config_node_property_string:openapi_config_node_property_string() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

