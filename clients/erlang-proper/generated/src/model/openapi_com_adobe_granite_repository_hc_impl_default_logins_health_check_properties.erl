-module(openapi_com_adobe_granite_repository_hc_impl_default_logins_health_check_properties).

-include("openapi.hrl").

-export([openapi_com_adobe_granite_repository_hc_impl_default_logins_health_check_properties/0]).

-export([openapi_com_adobe_granite_repository_hc_impl_default_logins_health_check_properties/1]).

-export_type([openapi_com_adobe_granite_repository_hc_impl_default_logins_health_check_properties/0]).

-type openapi_com_adobe_granite_repository_hc_impl_default_logins_health_check_properties() ::
  [ {'hc_tags', openapi_config_node_property_array:openapi_config_node_property_array() }
  | {'account_logins', openapi_config_node_property_array:openapi_config_node_property_array() }
  | {'console_logins', openapi_config_node_property_array:openapi_config_node_property_array() }
  ].


openapi_com_adobe_granite_repository_hc_impl_default_logins_health_check_properties() ->
    openapi_com_adobe_granite_repository_hc_impl_default_logins_health_check_properties([]).

openapi_com_adobe_granite_repository_hc_impl_default_logins_health_check_properties(Fields) ->
  Default = [ {'hc.tags', openapi_config_node_property_array:openapi_config_node_property_array() }
            , {'account.logins', openapi_config_node_property_array:openapi_config_node_property_array() }
            , {'console.logins', openapi_config_node_property_array:openapi_config_node_property_array() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

