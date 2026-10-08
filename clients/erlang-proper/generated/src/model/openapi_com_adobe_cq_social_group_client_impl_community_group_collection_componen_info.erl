-module(openapi_com_adobe_cq_social_group_client_impl_community_group_collection_componen_info).

-include("openapi.hrl").

-export([openapi_com_adobe_cq_social_group_client_impl_community_group_collection_componen_info/0]).

-export([openapi_com_adobe_cq_social_group_client_impl_community_group_collection_componen_info/1]).

-export_type([openapi_com_adobe_cq_social_group_client_impl_community_group_collection_componen_info/0]).

-type openapi_com_adobe_cq_social_group_client_impl_community_group_collection_componen_info() ::
  [ {'pid', binary() }
  | {'title', binary() }
  | {'description', binary() }
  | {'properties', openapi_com_adobe_cq_social_group_client_impl_community_group_collection_componen_properties:openapi_com_adobe_cq_social_group_client_impl_community_group_collection_componen_properties() }
  ].


openapi_com_adobe_cq_social_group_client_impl_community_group_collection_componen_info() ->
    openapi_com_adobe_cq_social_group_client_impl_community_group_collection_componen_info([]).

openapi_com_adobe_cq_social_group_client_impl_community_group_collection_componen_info(Fields) ->
  Default = [ {'pid', binary() }
            , {'title', binary() }
            , {'description', binary() }
            , {'properties', openapi_com_adobe_cq_social_group_client_impl_community_group_collection_componen_properties:openapi_com_adobe_cq_social_group_client_impl_community_group_collection_componen_properties() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

