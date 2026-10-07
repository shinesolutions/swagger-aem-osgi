-module(openapi_com_adobe_cq_social_content_fragments_services_impl_communities_fragmen_info).

-include("openapi.hrl").

-export([openapi_com_adobe_cq_social_content_fragments_services_impl_communities_fragmen_info/0]).

-export([openapi_com_adobe_cq_social_content_fragments_services_impl_communities_fragmen_info/1]).

-export_type([openapi_com_adobe_cq_social_content_fragments_services_impl_communities_fragmen_info/0]).

-type openapi_com_adobe_cq_social_content_fragments_services_impl_communities_fragmen_info() ::
  [ {'pid', binary() }
  | {'title', binary() }
  | {'description', binary() }
  | {'properties', openapi_com_adobe_cq_social_content_fragments_services_impl_communities_fragmen_properties:openapi_com_adobe_cq_social_content_fragments_services_impl_communities_fragmen_properties() }
  ].


openapi_com_adobe_cq_social_content_fragments_services_impl_communities_fragmen_info() ->
    openapi_com_adobe_cq_social_content_fragments_services_impl_communities_fragmen_info([]).

openapi_com_adobe_cq_social_content_fragments_services_impl_communities_fragmen_info(Fields) ->
  Default = [ {'pid', binary() }
            , {'title', binary() }
            , {'description', binary() }
            , {'properties', openapi_com_adobe_cq_social_content_fragments_services_impl_communities_fragmen_properties:openapi_com_adobe_cq_social_content_fragments_services_impl_communities_fragmen_properties() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

