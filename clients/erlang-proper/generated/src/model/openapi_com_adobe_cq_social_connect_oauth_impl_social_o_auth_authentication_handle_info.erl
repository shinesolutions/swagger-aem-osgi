-module(openapi_com_adobe_cq_social_connect_oauth_impl_social_o_auth_authentication_handle_info).

-include("openapi.hrl").

-export([openapi_com_adobe_cq_social_connect_oauth_impl_social_o_auth_authentication_handle_info/0]).

-export([openapi_com_adobe_cq_social_connect_oauth_impl_social_o_auth_authentication_handle_info/1]).

-export_type([openapi_com_adobe_cq_social_connect_oauth_impl_social_o_auth_authentication_handle_info/0]).

-type openapi_com_adobe_cq_social_connect_oauth_impl_social_o_auth_authentication_handle_info() ::
  [ {'pid', binary() }
  | {'title', binary() }
  | {'description', binary() }
  | {'properties', openapi_com_adobe_cq_social_connect_oauth_impl_social_o_auth_authentication_handle_properties:openapi_com_adobe_cq_social_connect_oauth_impl_social_o_auth_authentication_handle_properties() }
  ].


openapi_com_adobe_cq_social_connect_oauth_impl_social_o_auth_authentication_handle_info() ->
    openapi_com_adobe_cq_social_connect_oauth_impl_social_o_auth_authentication_handle_info([]).

openapi_com_adobe_cq_social_connect_oauth_impl_social_o_auth_authentication_handle_info(Fields) ->
  Default = [ {'pid', binary() }
            , {'title', binary() }
            , {'description', binary() }
            , {'properties', openapi_com_adobe_cq_social_connect_oauth_impl_social_o_auth_authentication_handle_properties:openapi_com_adobe_cq_social_connect_oauth_impl_social_o_auth_authentication_handle_properties() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

