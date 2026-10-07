-module(openapi_com_adobe_cq_social_ugcbase_impl_aysnc_reverse_replicator_impl_properties).

-include("openapi.hrl").

-export([openapi_com_adobe_cq_social_ugcbase_impl_aysnc_reverse_replicator_impl_properties/0]).

-export([openapi_com_adobe_cq_social_ugcbase_impl_aysnc_reverse_replicator_impl_properties/1]).

-export_type([openapi_com_adobe_cq_social_ugcbase_impl_aysnc_reverse_replicator_impl_properties/0]).

-type openapi_com_adobe_cq_social_ugcbase_impl_aysnc_reverse_replicator_impl_properties() ::
  [ {'poolSize', openapi_config_node_property_integer:openapi_config_node_property_integer() }
  | {'maxPoolSize', openapi_config_node_property_integer:openapi_config_node_property_integer() }
  | {'queueSize', openapi_config_node_property_integer:openapi_config_node_property_integer() }
  | {'keepAliveTime', openapi_config_node_property_integer:openapi_config_node_property_integer() }
  ].


openapi_com_adobe_cq_social_ugcbase_impl_aysnc_reverse_replicator_impl_properties() ->
    openapi_com_adobe_cq_social_ugcbase_impl_aysnc_reverse_replicator_impl_properties([]).

openapi_com_adobe_cq_social_ugcbase_impl_aysnc_reverse_replicator_impl_properties(Fields) ->
  Default = [ {'poolSize', openapi_config_node_property_integer:openapi_config_node_property_integer() }
            , {'maxPoolSize', openapi_config_node_property_integer:openapi_config_node_property_integer() }
            , {'queueSize', openapi_config_node_property_integer:openapi_config_node_property_integer() }
            , {'keepAliveTime', openapi_config_node_property_integer:openapi_config_node_property_integer() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

