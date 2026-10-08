-module(openapi_com_adobe_cq_social_group_client_impl_community_group_collection_componen_properties).

-include("openapi.hrl").

-export([openapi_com_adobe_cq_social_group_client_impl_community_group_collection_componen_properties/0]).

-export([openapi_com_adobe_cq_social_group_client_impl_community_group_collection_componen_properties/1]).

-export_type([openapi_com_adobe_cq_social_group_client_impl_community_group_collection_componen_properties/0]).

-type openapi_com_adobe_cq_social_group_client_impl_community_group_collection_componen_properties() ::
  [ {'group_listing_pagination_enable', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
  | {'group_listing_lazyloading_enable', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
  | {'page_size', openapi_config_node_property_integer:openapi_config_node_property_integer() }
  | {'priority', openapi_config_node_property_integer:openapi_config_node_property_integer() }
  ].


openapi_com_adobe_cq_social_group_client_impl_community_group_collection_componen_properties() ->
    openapi_com_adobe_cq_social_group_client_impl_community_group_collection_componen_properties([]).

openapi_com_adobe_cq_social_group_client_impl_community_group_collection_componen_properties(Fields) ->
  Default = [ {'group.listing.pagination.enable', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
            , {'group.listing.lazyloading.enable', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
            , {'page.size', openapi_config_node_property_integer:openapi_config_node_property_integer() }
            , {'priority', openapi_config_node_property_integer:openapi_config_node_property_integer() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

