-module(openapi_com_day_cq_replication_impl_replication_content_factory_provider_impl_properties).

-include("openapi.hrl").

-export([openapi_com_day_cq_replication_impl_replication_content_factory_provider_impl_properties/0]).

-export([openapi_com_day_cq_replication_impl_replication_content_factory_provider_impl_properties/1]).

-export_type([openapi_com_day_cq_replication_impl_replication_content_factory_provider_impl_properties/0]).

-type openapi_com_day_cq_replication_impl_replication_content_factory_provider_impl_properties() ::
  [ {'replication_content_useFileStorage', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
  | {'replication_content_maxCommitAttempts', openapi_config_node_property_integer:openapi_config_node_property_integer() }
  ].


openapi_com_day_cq_replication_impl_replication_content_factory_provider_impl_properties() ->
    openapi_com_day_cq_replication_impl_replication_content_factory_provider_impl_properties([]).

openapi_com_day_cq_replication_impl_replication_content_factory_provider_impl_properties(Fields) ->
  Default = [ {'replication.content.useFileStorage', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
            , {'replication.content.maxCommitAttempts', openapi_config_node_property_integer:openapi_config_node_property_integer() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

