-module(openapi_com_day_cq_replication_impl_transport_http_info).

-export([encode/1]).

-export_type([openapi_com_day_cq_replication_impl_transport_http_info/0]).

-type openapi_com_day_cq_replication_impl_transport_http_info() ::
    #{ 'pid' => binary(),
       'title' => binary(),
       'description' => binary(),
       'properties' => openapi_com_day_cq_replication_impl_transport_http_properties:openapi_com_day_cq_replication_impl_transport_http_properties()
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
