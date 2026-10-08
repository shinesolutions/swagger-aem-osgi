-module(openapi_com_adobe_granite_oauth_server_impl_o_auth2_client_revocation_servlet_info).

-include("openapi.hrl").

-export([openapi_com_adobe_granite_oauth_server_impl_o_auth2_client_revocation_servlet_info/0]).

-export([openapi_com_adobe_granite_oauth_server_impl_o_auth2_client_revocation_servlet_info/1]).

-export_type([openapi_com_adobe_granite_oauth_server_impl_o_auth2_client_revocation_servlet_info/0]).

-type openapi_com_adobe_granite_oauth_server_impl_o_auth2_client_revocation_servlet_info() ::
  [ {'pid', binary() }
  | {'title', binary() }
  | {'description', binary() }
  | {'properties', openapi_com_adobe_granite_oauth_server_impl_o_auth2_client_revocation_servlet_properties:openapi_com_adobe_granite_oauth_server_impl_o_auth2_client_revocation_servlet_properties() }
  ].


openapi_com_adobe_granite_oauth_server_impl_o_auth2_client_revocation_servlet_info() ->
    openapi_com_adobe_granite_oauth_server_impl_o_auth2_client_revocation_servlet_info([]).

openapi_com_adobe_granite_oauth_server_impl_o_auth2_client_revocation_servlet_info(Fields) ->
  Default = [ {'pid', binary() }
            , {'title', binary() }
            , {'description', binary() }
            , {'properties', openapi_com_adobe_granite_oauth_server_impl_o_auth2_client_revocation_servlet_properties:openapi_com_adobe_granite_oauth_server_impl_o_auth2_client_revocation_servlet_properties() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

