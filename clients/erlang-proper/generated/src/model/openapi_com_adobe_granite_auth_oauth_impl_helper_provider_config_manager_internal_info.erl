-module(openapi_com_adobe_granite_auth_oauth_impl_helper_provider_config_manager_internal_info).

-include("openapi.hrl").

-export([openapi_com_adobe_granite_auth_oauth_impl_helper_provider_config_manager_internal_info/0]).

-export([openapi_com_adobe_granite_auth_oauth_impl_helper_provider_config_manager_internal_info/1]).

-export_type([openapi_com_adobe_granite_auth_oauth_impl_helper_provider_config_manager_internal_info/0]).

-type openapi_com_adobe_granite_auth_oauth_impl_helper_provider_config_manager_internal_info() ::
  [ {'pid', binary() }
  | {'title', binary() }
  | {'description', binary() }
  | {'properties', openapi_com_adobe_granite_auth_oauth_impl_helper_provider_config_manager_internal_properties:openapi_com_adobe_granite_auth_oauth_impl_helper_provider_config_manager_internal_properties() }
  ].


openapi_com_adobe_granite_auth_oauth_impl_helper_provider_config_manager_internal_info() ->
    openapi_com_adobe_granite_auth_oauth_impl_helper_provider_config_manager_internal_info([]).

openapi_com_adobe_granite_auth_oauth_impl_helper_provider_config_manager_internal_info(Fields) ->
  Default = [ {'pid', binary() }
            , {'title', binary() }
            , {'description', binary() }
            , {'properties', openapi_com_adobe_granite_auth_oauth_impl_helper_provider_config_manager_internal_properties:openapi_com_adobe_granite_auth_oauth_impl_helper_provider_config_manager_internal_properties() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

