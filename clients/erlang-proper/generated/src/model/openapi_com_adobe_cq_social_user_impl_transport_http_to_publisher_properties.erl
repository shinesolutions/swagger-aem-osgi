-module(openapi_com_adobe_cq_social_user_impl_transport_http_to_publisher_properties).

-include("openapi.hrl").

-export([openapi_com_adobe_cq_social_user_impl_transport_http_to_publisher_properties/0]).

-export([openapi_com_adobe_cq_social_user_impl_transport_http_to_publisher_properties/1]).

-export_type([openapi_com_adobe_cq_social_user_impl_transport_http_to_publisher_properties/0]).

-type openapi_com_adobe_cq_social_user_impl_transport_http_to_publisher_properties() ::
  [ {'enable', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
  | {'agent_configuration', openapi_config_node_property_array:openapi_config_node_property_array() }
  | {'context_path', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'disabled_cipher_suites', openapi_config_node_property_array:openapi_config_node_property_array() }
  | {'enabled_cipher_suites', openapi_config_node_property_array:openapi_config_node_property_array() }
  ].


openapi_com_adobe_cq_social_user_impl_transport_http_to_publisher_properties() ->
    openapi_com_adobe_cq_social_user_impl_transport_http_to_publisher_properties([]).

openapi_com_adobe_cq_social_user_impl_transport_http_to_publisher_properties(Fields) ->
  Default = [ {'enable', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
            , {'agent.configuration', openapi_config_node_property_array:openapi_config_node_property_array() }
            , {'context.path', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'disabled.cipher.suites', openapi_config_node_property_array:openapi_config_node_property_array() }
            , {'enabled.cipher.suites', openapi_config_node_property_array:openapi_config_node_property_array() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

