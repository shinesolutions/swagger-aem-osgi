-module(openapi_com_adobe_granite_repository_hc_impl_default_access_user_profile_health_che_properties).

-include("openapi.hrl").

-export([openapi_com_adobe_granite_repository_hc_impl_default_access_user_profile_health_che_properties/0]).

-export([openapi_com_adobe_granite_repository_hc_impl_default_access_user_profile_health_che_properties/1]).

-export_type([openapi_com_adobe_granite_repository_hc_impl_default_access_user_profile_health_che_properties/0]).

-type openapi_com_adobe_granite_repository_hc_impl_default_access_user_profile_health_che_properties() ::
  [ {'hc_tags', openapi_config_node_property_array:openapi_config_node_property_array() }
  ].


openapi_com_adobe_granite_repository_hc_impl_default_access_user_profile_health_che_properties() ->
    openapi_com_adobe_granite_repository_hc_impl_default_access_user_profile_health_che_properties([]).

openapi_com_adobe_granite_repository_hc_impl_default_access_user_profile_health_che_properties(Fields) ->
  Default = [ {'hc.tags', openapi_config_node_property_array:openapi_config_node_property_array() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

