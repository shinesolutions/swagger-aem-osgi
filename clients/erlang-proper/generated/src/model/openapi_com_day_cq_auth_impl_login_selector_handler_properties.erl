-module(openapi_com_day_cq_auth_impl_login_selector_handler_properties).

-include("openapi.hrl").

-export([openapi_com_day_cq_auth_impl_login_selector_handler_properties/0]).

-export([openapi_com_day_cq_auth_impl_login_selector_handler_properties/1]).

-export_type([openapi_com_day_cq_auth_impl_login_selector_handler_properties/0]).

-type openapi_com_day_cq_auth_impl_login_selector_handler_properties() ::
  [ {'path', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'service_ranking', openapi_config_node_property_integer:openapi_config_node_property_integer() }
  | {'auth_loginselector_mappings', openapi_config_node_property_array:openapi_config_node_property_array() }
  | {'auth_loginselector_changepw_mappings', openapi_config_node_property_array:openapi_config_node_property_array() }
  | {'auth_loginselector_defaultloginpage', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'auth_loginselector_defaultchangepwpage', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'auth_loginselector_handle', openapi_config_node_property_array:openapi_config_node_property_array() }
  | {'auth_loginselector_handle_all_extensions', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
  ].


openapi_com_day_cq_auth_impl_login_selector_handler_properties() ->
    openapi_com_day_cq_auth_impl_login_selector_handler_properties([]).

openapi_com_day_cq_auth_impl_login_selector_handler_properties(Fields) ->
  Default = [ {'path', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'service.ranking', openapi_config_node_property_integer:openapi_config_node_property_integer() }
            , {'auth.loginselector.mappings', openapi_config_node_property_array:openapi_config_node_property_array() }
            , {'auth.loginselector.changepw.mappings', openapi_config_node_property_array:openapi_config_node_property_array() }
            , {'auth.loginselector.defaultloginpage', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'auth.loginselector.defaultchangepwpage', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'auth.loginselector.handle', openapi_config_node_property_array:openapi_config_node_property_array() }
            , {'auth.loginselector.handle.all.extensions', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

