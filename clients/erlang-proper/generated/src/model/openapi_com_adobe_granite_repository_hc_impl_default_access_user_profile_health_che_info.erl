-module(openapi_com_adobe_granite_repository_hc_impl_default_access_user_profile_health_che_info).

-include("openapi.hrl").

-export([openapi_com_adobe_granite_repository_hc_impl_default_access_user_profile_health_che_info/0]).

-export([openapi_com_adobe_granite_repository_hc_impl_default_access_user_profile_health_che_info/1]).

-export_type([openapi_com_adobe_granite_repository_hc_impl_default_access_user_profile_health_che_info/0]).

-type openapi_com_adobe_granite_repository_hc_impl_default_access_user_profile_health_che_info() ::
  [ {'pid', binary() }
  | {'title', binary() }
  | {'description', binary() }
  | {'properties', openapi_com_adobe_granite_repository_hc_impl_default_access_user_profile_health_che_properties:openapi_com_adobe_granite_repository_hc_impl_default_access_user_profile_health_che_properties() }
  ].


openapi_com_adobe_granite_repository_hc_impl_default_access_user_profile_health_che_info() ->
    openapi_com_adobe_granite_repository_hc_impl_default_access_user_profile_health_che_info([]).

openapi_com_adobe_granite_repository_hc_impl_default_access_user_profile_health_che_info(Fields) ->
  Default = [ {'pid', binary() }
            , {'title', binary() }
            , {'description', binary() }
            , {'properties', openapi_com_adobe_granite_repository_hc_impl_default_access_user_profile_health_che_properties:openapi_com_adobe_granite_repository_hc_impl_default_access_user_profile_health_che_properties() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

