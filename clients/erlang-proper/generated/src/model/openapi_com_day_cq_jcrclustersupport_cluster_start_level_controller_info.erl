-module(openapi_com_day_cq_jcrclustersupport_cluster_start_level_controller_info).

-include("openapi.hrl").

-export([openapi_com_day_cq_jcrclustersupport_cluster_start_level_controller_info/0]).

-export([openapi_com_day_cq_jcrclustersupport_cluster_start_level_controller_info/1]).

-export_type([openapi_com_day_cq_jcrclustersupport_cluster_start_level_controller_info/0]).

-type openapi_com_day_cq_jcrclustersupport_cluster_start_level_controller_info() ::
  [ {'pid', binary() }
  | {'title', binary() }
  | {'description', binary() }
  | {'properties', openapi_com_day_cq_jcrclustersupport_cluster_start_level_controller_properties:openapi_com_day_cq_jcrclustersupport_cluster_start_level_controller_properties() }
  ].


openapi_com_day_cq_jcrclustersupport_cluster_start_level_controller_info() ->
    openapi_com_day_cq_jcrclustersupport_cluster_start_level_controller_info([]).

openapi_com_day_cq_jcrclustersupport_cluster_start_level_controller_info(Fields) ->
  Default = [ {'pid', binary() }
            , {'title', binary() }
            , {'description', binary() }
            , {'properties', openapi_com_day_cq_jcrclustersupport_cluster_start_level_controller_properties:openapi_com_day_cq_jcrclustersupport_cluster_start_level_controller_properties() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

