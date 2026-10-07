-module(openapi_com_day_cq_replication_impl_replication_receiver_impl_properties).

-include("openapi.hrl").

-export([openapi_com_day_cq_replication_impl_replication_receiver_impl_properties/0]).

-export([openapi_com_day_cq_replication_impl_replication_receiver_impl_properties/1]).

-export_type([openapi_com_day_cq_replication_impl_replication_receiver_impl_properties/0]).

-type openapi_com_day_cq_replication_impl_replication_receiver_impl_properties() ::
  [ {'receiver_tmpfile_threshold', openapi_config_node_property_integer:openapi_config_node_property_integer() }
  | {'receiver_packages_use_install', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
  ].


openapi_com_day_cq_replication_impl_replication_receiver_impl_properties() ->
    openapi_com_day_cq_replication_impl_replication_receiver_impl_properties([]).

openapi_com_day_cq_replication_impl_replication_receiver_impl_properties(Fields) ->
  Default = [ {'receiver.tmpfile.threshold', openapi_config_node_property_integer:openapi_config_node_property_integer() }
            , {'receiver.packages.use.install', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

