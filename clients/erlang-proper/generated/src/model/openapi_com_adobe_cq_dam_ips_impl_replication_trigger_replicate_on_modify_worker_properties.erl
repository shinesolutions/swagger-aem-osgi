-module(openapi_com_adobe_cq_dam_ips_impl_replication_trigger_replicate_on_modify_worker_properties).

-include("openapi.hrl").

-export([openapi_com_adobe_cq_dam_ips_impl_replication_trigger_replicate_on_modify_worker_properties/0]).

-export([openapi_com_adobe_cq_dam_ips_impl_replication_trigger_replicate_on_modify_worker_properties/1]).

-export_type([openapi_com_adobe_cq_dam_ips_impl_replication_trigger_replicate_on_modify_worker_properties/0]).

-type openapi_com_adobe_cq_dam_ips_impl_replication_trigger_replicate_on_modify_worker_properties() ::
  [ {'dmreplicateonmodify_enabled', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
  | {'dmreplicateonmodify_forcesyncdeletes', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
  ].


openapi_com_adobe_cq_dam_ips_impl_replication_trigger_replicate_on_modify_worker_properties() ->
    openapi_com_adobe_cq_dam_ips_impl_replication_trigger_replicate_on_modify_worker_properties([]).

openapi_com_adobe_cq_dam_ips_impl_replication_trigger_replicate_on_modify_worker_properties(Fields) ->
  Default = [ {'dmreplicateonmodify.enabled', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
            , {'dmreplicateonmodify.forcesyncdeletes', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

