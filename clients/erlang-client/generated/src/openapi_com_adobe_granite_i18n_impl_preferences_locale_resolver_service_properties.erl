-module(openapi_com_adobe_granite_i18n_impl_preferences_locale_resolver_service_properties).

-export([encode/1]).

-export_type([openapi_com_adobe_granite_i18n_impl_preferences_locale_resolver_service_properties/0]).

-type openapi_com_adobe_granite_i18n_impl_preferences_locale_resolver_service_properties() ::
    #{ 'security_preferences_name' => openapi_config_node_property_string:openapi_config_node_property_string()
     }.

encode(#{ 'security_preferences_name' := SecurityPreferencesName
        }) ->
    #{ 'security.preferences.name' => SecurityPreferencesName
     }.
