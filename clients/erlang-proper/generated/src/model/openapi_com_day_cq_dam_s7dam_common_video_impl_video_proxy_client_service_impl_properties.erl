-module(openapi_com_day_cq_dam_s7dam_common_video_impl_video_proxy_client_service_impl_properties).

-include("openapi.hrl").

-export([openapi_com_day_cq_dam_s7dam_common_video_impl_video_proxy_client_service_impl_properties/0]).

-export([openapi_com_day_cq_dam_s7dam_common_video_impl_video_proxy_client_service_impl_properties/1]).

-export_type([openapi_com_day_cq_dam_s7dam_common_video_impl_video_proxy_client_service_impl_properties/0]).

-type openapi_com_day_cq_dam_s7dam_common_video_impl_video_proxy_client_service_impl_properties() ::
  [ {'cq_dam_s7dam_videoproxyclientservice_multipartupload_minsize_name', openapi_config_node_property_integer:openapi_config_node_property_integer() }
  | {'cq_dam_s7dam_videoproxyclientservice_multipartupload_partsize_name', openapi_config_node_property_integer:openapi_config_node_property_integer() }
  | {'cq_dam_s7dam_videoproxyclientservice_multipartupload_numthread_name', openapi_config_node_property_integer:openapi_config_node_property_integer() }
  | {'cq_dam_s7dam_videoproxyclientservice_http_readtimeout_name', openapi_config_node_property_integer:openapi_config_node_property_integer() }
  | {'cq_dam_s7dam_videoproxyclientservice_http_connectiontimeout_name', openapi_config_node_property_integer:openapi_config_node_property_integer() }
  | {'cq_dam_s7dam_videoproxyclientservice_http_maxretrycount_name', openapi_config_node_property_integer:openapi_config_node_property_integer() }
  | {'cq_dam_s7dam_videoproxyclientservice_uploadprogress_interval_name', openapi_config_node_property_integer:openapi_config_node_property_integer() }
  ].


openapi_com_day_cq_dam_s7dam_common_video_impl_video_proxy_client_service_impl_properties() ->
    openapi_com_day_cq_dam_s7dam_common_video_impl_video_proxy_client_service_impl_properties([]).

openapi_com_day_cq_dam_s7dam_common_video_impl_video_proxy_client_service_impl_properties(Fields) ->
  Default = [ {'cq.dam.s7dam.videoproxyclientservice.multipartupload.minsize.name', openapi_config_node_property_integer:openapi_config_node_property_integer() }
            , {'cq.dam.s7dam.videoproxyclientservice.multipartupload.partsize.name', openapi_config_node_property_integer:openapi_config_node_property_integer() }
            , {'cq.dam.s7dam.videoproxyclientservice.multipartupload.numthread.name', openapi_config_node_property_integer:openapi_config_node_property_integer() }
            , {'cq.dam.s7dam.videoproxyclientservice.http.readtimeout.name', openapi_config_node_property_integer:openapi_config_node_property_integer() }
            , {'cq.dam.s7dam.videoproxyclientservice.http.connectiontimeout.name', openapi_config_node_property_integer:openapi_config_node_property_integer() }
            , {'cq.dam.s7dam.videoproxyclientservice.http.maxretrycount.name', openapi_config_node_property_integer:openapi_config_node_property_integer() }
            , {'cq.dam.s7dam.videoproxyclientservice.uploadprogress.interval.name', openapi_config_node_property_integer:openapi_config_node_property_integer() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

