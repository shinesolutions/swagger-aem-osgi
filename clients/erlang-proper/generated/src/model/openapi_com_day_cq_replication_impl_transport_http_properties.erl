-module(openapi_com_day_cq_replication_impl_transport_http_properties).

-include("openapi.hrl").

-export([openapi_com_day_cq_replication_impl_transport_http_properties/0]).

-export([openapi_com_day_cq_replication_impl_transport_http_properties/1]).

-export_type([openapi_com_day_cq_replication_impl_transport_http_properties/0]).

-type openapi_com_day_cq_replication_impl_transport_http_properties() ::
  [ {'disabled_cipher_suites', openapi_config_node_property_array:openapi_config_node_property_array() }
  | {'enabled_cipher_suites', openapi_config_node_property_array:openapi_config_node_property_array() }
  ].


openapi_com_day_cq_replication_impl_transport_http_properties() ->
    openapi_com_day_cq_replication_impl_transport_http_properties([]).

openapi_com_day_cq_replication_impl_transport_http_properties(Fields) ->
  Default = [ {'disabled.cipher.suites', openapi_config_node_property_array:openapi_config_node_property_array() }
            , {'enabled.cipher.suites', openapi_config_node_property_array:openapi_config_node_property_array() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

