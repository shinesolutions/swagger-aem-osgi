-module(openapi_com_adobe_cq_dam_ips_impl_replication_trigger_replicate_on_modify_worker_info).

-export([encode/1]).

-export_type([openapi_com_adobe_cq_dam_ips_impl_replication_trigger_replicate_on_modify_worker_info/0]).

-type openapi_com_adobe_cq_dam_ips_impl_replication_trigger_replicate_on_modify_worker_info() ::
    #{ 'pid' => binary(),
       'title' => binary(),
       'description' => binary(),
       'properties' => openapi_com_adobe_cq_dam_ips_impl_replication_trigger_replicate_on_modify_worker_properties:openapi_com_adobe_cq_dam_ips_impl_replication_trigger_replicate_on_modify_worker_properties()
     }.

encode(#{ 'pid' := Pid,
          'title' := Title,
          'description' := Description,
          'properties' := Properties
        }) ->
    #{ 'pid' => Pid,
       'title' => Title,
       'description' => Description,
       'properties' => Properties
     }.
