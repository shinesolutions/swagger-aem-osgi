-module(openapi_com_adobe_granite_oauth_server_auth_impl_o_auth2_server_authentication_han_info).

-include("openapi.hrl").

-export([openapi_com_adobe_granite_oauth_server_auth_impl_o_auth2_server_authentication_han_info/0]).

-export([openapi_com_adobe_granite_oauth_server_auth_impl_o_auth2_server_authentication_han_info/1]).

-export_type([openapi_com_adobe_granite_oauth_server_auth_impl_o_auth2_server_authentication_han_info/0]).

-type openapi_com_adobe_granite_oauth_server_auth_impl_o_auth2_server_authentication_han_info() ::
  [ {'pid', binary() }
  | {'title', binary() }
  | {'description', binary() }
  | {'properties', openapi_com_adobe_granite_oauth_server_auth_impl_o_auth2_server_authentication_han_properties:openapi_com_adobe_granite_oauth_server_auth_impl_o_auth2_server_authentication_han_properties() }
  ].


openapi_com_adobe_granite_oauth_server_auth_impl_o_auth2_server_authentication_han_info() ->
    openapi_com_adobe_granite_oauth_server_auth_impl_o_auth2_server_authentication_han_info([]).

openapi_com_adobe_granite_oauth_server_auth_impl_o_auth2_server_authentication_han_info(Fields) ->
  Default = [ {'pid', binary() }
            , {'title', binary() }
            , {'description', binary() }
            , {'properties', openapi_com_adobe_granite_oauth_server_auth_impl_o_auth2_server_authentication_han_properties:openapi_com_adobe_granite_oauth_server_auth_impl_o_auth2_server_authentication_han_properties() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

