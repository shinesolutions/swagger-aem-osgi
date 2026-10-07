-module(openapi_com_day_cq_wcm_foundation_impl_page_impressions_tracker_properties).

-include("openapi.hrl").

-export([openapi_com_day_cq_wcm_foundation_impl_page_impressions_tracker_properties/0]).

-export([openapi_com_day_cq_wcm_foundation_impl_page_impressions_tracker_properties/1]).

-export_type([openapi_com_day_cq_wcm_foundation_impl_page_impressions_tracker_properties/0]).

-type openapi_com_day_cq_wcm_foundation_impl_page_impressions_tracker_properties() ::
  [ {'sling_auth_requirements', openapi_config_node_property_string:openapi_config_node_property_string() }
  ].


openapi_com_day_cq_wcm_foundation_impl_page_impressions_tracker_properties() ->
    openapi_com_day_cq_wcm_foundation_impl_page_impressions_tracker_properties([]).

openapi_com_day_cq_wcm_foundation_impl_page_impressions_tracker_properties(Fields) ->
  Default = [ {'sling.auth.requirements', openapi_config_node_property_string:openapi_config_node_property_string() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

