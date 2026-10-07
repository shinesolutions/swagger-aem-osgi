-module(openapi_com_adobe_cq_dam_ips_impl_replication_trigger_replicate_on_modify_worker_info).

-include("openapi.hrl").

-export([openapi_com_adobe_cq_dam_ips_impl_replication_trigger_replicate_on_modify_worker_info/0]).

-export([openapi_com_adobe_cq_dam_ips_impl_replication_trigger_replicate_on_modify_worker_info/1]).

-export_type([openapi_com_adobe_cq_dam_ips_impl_replication_trigger_replicate_on_modify_worker_info/0]).

-type openapi_com_adobe_cq_dam_ips_impl_replication_trigger_replicate_on_modify_worker_info() ::
  [ {'pid', binary() }
  | {'title', binary() }
  | {'description', binary() }
  | {'properties', openapi_com_adobe_cq_dam_ips_impl_replication_trigger_replicate_on_modify_worker_properties:openapi_com_adobe_cq_dam_ips_impl_replication_trigger_replicate_on_modify_worker_properties() }
  ].


openapi_com_adobe_cq_dam_ips_impl_replication_trigger_replicate_on_modify_worker_info() ->
    openapi_com_adobe_cq_dam_ips_impl_replication_trigger_replicate_on_modify_worker_info([]).

openapi_com_adobe_cq_dam_ips_impl_replication_trigger_replicate_on_modify_worker_info(Fields) ->
  Default = [ {'pid', binary() }
            , {'title', binary() }
            , {'description', binary() }
            , {'properties', openapi_com_adobe_cq_dam_ips_impl_replication_trigger_replicate_on_modify_worker_properties:openapi_com_adobe_cq_dam_ips_impl_replication_trigger_replicate_on_modify_worker_properties() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

