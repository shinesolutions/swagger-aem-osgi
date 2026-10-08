-module(openapi_com_adobe_granite_csrf_impl_csrf_servlet_properties).

-include("openapi.hrl").

-export([openapi_com_adobe_granite_csrf_impl_csrf_servlet_properties/0]).

-export([openapi_com_adobe_granite_csrf_impl_csrf_servlet_properties/1]).

-export_type([openapi_com_adobe_granite_csrf_impl_csrf_servlet_properties/0]).

-type openapi_com_adobe_granite_csrf_impl_csrf_servlet_properties() ::
  [ {'csrf_token_expires_in', openapi_config_node_property_integer:openapi_config_node_property_integer() }
  | {'sling_auth_requirements', openapi_config_node_property_string:openapi_config_node_property_string() }
  ].


openapi_com_adobe_granite_csrf_impl_csrf_servlet_properties() ->
    openapi_com_adobe_granite_csrf_impl_csrf_servlet_properties([]).

openapi_com_adobe_granite_csrf_impl_csrf_servlet_properties(Fields) ->
  Default = [ {'csrf.token.expires.in', openapi_config_node_property_integer:openapi_config_node_property_integer() }
            , {'sling.auth.requirements', openapi_config_node_property_string:openapi_config_node_property_string() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

