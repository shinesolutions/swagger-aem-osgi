-module(openapi_com_adobe_granite_i18n_impl_preferences_locale_resolver_service_properties).

-include("openapi.hrl").

-export([openapi_com_adobe_granite_i18n_impl_preferences_locale_resolver_service_properties/0]).

-export([openapi_com_adobe_granite_i18n_impl_preferences_locale_resolver_service_properties/1]).

-export_type([openapi_com_adobe_granite_i18n_impl_preferences_locale_resolver_service_properties/0]).

-type openapi_com_adobe_granite_i18n_impl_preferences_locale_resolver_service_properties() ::
  [ {'security_preferences_name', openapi_config_node_property_string:openapi_config_node_property_string() }
  ].


openapi_com_adobe_granite_i18n_impl_preferences_locale_resolver_service_properties() ->
    openapi_com_adobe_granite_i18n_impl_preferences_locale_resolver_service_properties([]).

openapi_com_adobe_granite_i18n_impl_preferences_locale_resolver_service_properties(Fields) ->
  Default = [ {'security.preferences.name', openapi_config_node_property_string:openapi_config_node_property_string() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

