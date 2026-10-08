-module(openapi_com_day_cq_commons_impl_externalizer_impl_properties).

-include("openapi.hrl").

-export([openapi_com_day_cq_commons_impl_externalizer_impl_properties/0]).

-export([openapi_com_day_cq_commons_impl_externalizer_impl_properties/1]).

-export_type([openapi_com_day_cq_commons_impl_externalizer_impl_properties/0]).

-type openapi_com_day_cq_commons_impl_externalizer_impl_properties() ::
  [ {'externalizer_domains', openapi_config_node_property_array:openapi_config_node_property_array() }
  | {'externalizer_host', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'externalizer_contextpath', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'externalizer_encodedpath', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
  ].


openapi_com_day_cq_commons_impl_externalizer_impl_properties() ->
    openapi_com_day_cq_commons_impl_externalizer_impl_properties([]).

openapi_com_day_cq_commons_impl_externalizer_impl_properties(Fields) ->
  Default = [ {'externalizer.domains', openapi_config_node_property_array:openapi_config_node_property_array() }
            , {'externalizer.host', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'externalizer.contextpath', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'externalizer.encodedpath', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

