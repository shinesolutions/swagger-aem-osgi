-module(openapi_com_adobe_granite_repository_hc_impl_default_logins_health_check_properties).

-export([encode/1]).

-export_type([openapi_com_adobe_granite_repository_hc_impl_default_logins_health_check_properties/0]).

-type openapi_com_adobe_granite_repository_hc_impl_default_logins_health_check_properties() ::
    #{ 'hc_tags' => openapi_config_node_property_array:openapi_config_node_property_array(),
       'account_logins' => openapi_config_node_property_array:openapi_config_node_property_array(),
       'console_logins' => openapi_config_node_property_array:openapi_config_node_property_array()
     }.

encode(#{ 'hc_tags' := HcTags,
          'account_logins' := AccountLogins,
          'console_logins' := ConsoleLogins
        }) ->
    #{ 'hc.tags' => HcTags,
       'account.logins' => AccountLogins,
       'console.logins' => ConsoleLogins
     }.
