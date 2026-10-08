-module(openapi_com_adobe_granite_repository_hc_impl_content_sling_sling_content_health_c_properties).

-include("openapi.hrl").

-export([openapi_com_adobe_granite_repository_hc_impl_content_sling_sling_content_health_c_properties/0]).

-export([openapi_com_adobe_granite_repository_hc_impl_content_sling_sling_content_health_c_properties/1]).

-export_type([openapi_com_adobe_granite_repository_hc_impl_content_sling_sling_content_health_c_properties/0]).

-type openapi_com_adobe_granite_repository_hc_impl_content_sling_sling_content_health_c_properties() ::
  [ {'hc_tags', openapi_config_node_property_array:openapi_config_node_property_array() }
  | {'exclude_search_path', openapi_config_node_property_array:openapi_config_node_property_array() }
  ].


openapi_com_adobe_granite_repository_hc_impl_content_sling_sling_content_health_c_properties() ->
    openapi_com_adobe_granite_repository_hc_impl_content_sling_sling_content_health_c_properties([]).

openapi_com_adobe_granite_repository_hc_impl_content_sling_sling_content_health_c_properties(Fields) ->
  Default = [ {'hc.tags', openapi_config_node_property_array:openapi_config_node_property_array() }
            , {'exclude.search.path', openapi_config_node_property_array:openapi_config_node_property_array() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

