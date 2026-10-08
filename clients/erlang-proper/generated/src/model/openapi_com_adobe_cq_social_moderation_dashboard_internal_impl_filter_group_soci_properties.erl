-module(openapi_com_adobe_cq_social_moderation_dashboard_internal_impl_filter_group_soci_properties).

-include("openapi.hrl").

-export([openapi_com_adobe_cq_social_moderation_dashboard_internal_impl_filter_group_soci_properties/0]).

-export([openapi_com_adobe_cq_social_moderation_dashboard_internal_impl_filter_group_soci_properties/1]).

-export_type([openapi_com_adobe_cq_social_moderation_dashboard_internal_impl_filter_group_soci_properties/0]).

-type openapi_com_adobe_cq_social_moderation_dashboard_internal_impl_filter_group_soci_properties() ::
  [ {'resourceType_filters', openapi_config_node_property_array:openapi_config_node_property_array() }
  | {'priority', openapi_config_node_property_integer:openapi_config_node_property_integer() }
  ].


openapi_com_adobe_cq_social_moderation_dashboard_internal_impl_filter_group_soci_properties() ->
    openapi_com_adobe_cq_social_moderation_dashboard_internal_impl_filter_group_soci_properties([]).

openapi_com_adobe_cq_social_moderation_dashboard_internal_impl_filter_group_soci_properties(Fields) ->
  Default = [ {'resourceType.filters', openapi_config_node_property_array:openapi_config_node_property_array() }
            , {'priority', openapi_config_node_property_integer:openapi_config_node_property_integer() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

