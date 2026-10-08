-module(openapi_com_day_crx_security_token_impl_impl_token_authentication_handler_properties).

-include("openapi.hrl").

-export([openapi_com_day_crx_security_token_impl_impl_token_authentication_handler_properties/0]).

-export([openapi_com_day_crx_security_token_impl_impl_token_authentication_handler_properties/1]).

-export_type([openapi_com_day_crx_security_token_impl_impl_token_authentication_handler_properties/0]).

-type openapi_com_day_crx_security_token_impl_impl_token_authentication_handler_properties() ::
  [ {'path', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'token_required_attr', openapi_config_node_property_drop_down:openapi_config_node_property_drop_down() }
  | {'token_alternate_url', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'token_encapsulated', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
  | {'skip_token_refresh', openapi_config_node_property_array:openapi_config_node_property_array() }
  ].


openapi_com_day_crx_security_token_impl_impl_token_authentication_handler_properties() ->
    openapi_com_day_crx_security_token_impl_impl_token_authentication_handler_properties([]).

openapi_com_day_crx_security_token_impl_impl_token_authentication_handler_properties(Fields) ->
  Default = [ {'path', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'token.required.attr', openapi_config_node_property_drop_down:openapi_config_node_property_drop_down() }
            , {'token.alternate.url', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'token.encapsulated', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
            , {'skip.token.refresh', openapi_config_node_property_array:openapi_config_node_property_array() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

