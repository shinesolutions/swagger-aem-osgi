-module(openapi_com_day_cq_auth_impl_login_selector_handler_properties).

-export([encode/1]).

-export_type([openapi_com_day_cq_auth_impl_login_selector_handler_properties/0]).

-type openapi_com_day_cq_auth_impl_login_selector_handler_properties() ::
    #{ 'path' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'service_ranking' => openapi_config_node_property_integer:openapi_config_node_property_integer(),
       'auth_loginselector_mappings' => openapi_config_node_property_array:openapi_config_node_property_array(),
       'auth_loginselector_changepw_mappings' => openapi_config_node_property_array:openapi_config_node_property_array(),
       'auth_loginselector_defaultloginpage' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'auth_loginselector_defaultchangepwpage' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'auth_loginselector_handle' => openapi_config_node_property_array:openapi_config_node_property_array(),
       'auth_loginselector_handle_all_extensions' => openapi_config_node_property_boolean:openapi_config_node_property_boolean()
     }.

encode(#{ 'path' := Path,
          'service_ranking' := ServiceRanking,
          'auth_loginselector_mappings' := AuthLoginselectorMappings,
          'auth_loginselector_changepw_mappings' := AuthLoginselectorChangepwMappings,
          'auth_loginselector_defaultloginpage' := AuthLoginselectorDefaultloginpage,
          'auth_loginselector_defaultchangepwpage' := AuthLoginselectorDefaultchangepwpage,
          'auth_loginselector_handle' := AuthLoginselectorHandle,
          'auth_loginselector_handle_all_extensions' := AuthLoginselectorHandleAllExtensions
        }) ->
    #{ 'path' => Path,
       'service.ranking' => ServiceRanking,
       'auth.loginselector.mappings' => AuthLoginselectorMappings,
       'auth.loginselector.changepw.mappings' => AuthLoginselectorChangepwMappings,
       'auth.loginselector.defaultloginpage' => AuthLoginselectorDefaultloginpage,
       'auth.loginselector.defaultchangepwpage' => AuthLoginselectorDefaultchangepwpage,
       'auth.loginselector.handle' => AuthLoginselectorHandle,
       'auth.loginselector.handle.all.extensions' => AuthLoginselectorHandleAllExtensions
     }.
