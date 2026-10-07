-module(openapi_com_adobe_cq_social_connect_oauth_impl_social_o_auth_user_profile_mapper_info).

-include("openapi.hrl").

-export([openapi_com_adobe_cq_social_connect_oauth_impl_social_o_auth_user_profile_mapper_info/0]).

-export([openapi_com_adobe_cq_social_connect_oauth_impl_social_o_auth_user_profile_mapper_info/1]).

-export_type([openapi_com_adobe_cq_social_connect_oauth_impl_social_o_auth_user_profile_mapper_info/0]).

-type openapi_com_adobe_cq_social_connect_oauth_impl_social_o_auth_user_profile_mapper_info() ::
  [ {'pid', binary() }
  | {'title', binary() }
  | {'description', binary() }
  | {'properties', openapi_com_adobe_cq_social_connect_oauth_impl_social_o_auth_user_profile_mapper_properties:openapi_com_adobe_cq_social_connect_oauth_impl_social_o_auth_user_profile_mapper_properties() }
  ].


openapi_com_adobe_cq_social_connect_oauth_impl_social_o_auth_user_profile_mapper_info() ->
    openapi_com_adobe_cq_social_connect_oauth_impl_social_o_auth_user_profile_mapper_info([]).

openapi_com_adobe_cq_social_connect_oauth_impl_social_o_auth_user_profile_mapper_info(Fields) ->
  Default = [ {'pid', binary() }
            , {'title', binary() }
            , {'description', binary() }
            , {'properties', openapi_com_adobe_cq_social_connect_oauth_impl_social_o_auth_user_profile_mapper_properties:openapi_com_adobe_cq_social_connect_oauth_impl_social_o_auth_user_profile_mapper_properties() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

