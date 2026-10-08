-module(openapi_com_day_cq_dam_s7dam_common_process_video_thumbnail_download_process_properties).

-include("openapi.hrl").

-export([openapi_com_day_cq_dam_s7dam_common_process_video_thumbnail_download_process_properties/0]).

-export([openapi_com_day_cq_dam_s7dam_common_process_video_thumbnail_download_process_properties/1]).

-export_type([openapi_com_day_cq_dam_s7dam_common_process_video_thumbnail_download_process_properties/0]).

-type openapi_com_day_cq_dam_s7dam_common_process_video_thumbnail_download_process_properties() ::
  [ {'process_label', openapi_config_node_property_string:openapi_config_node_property_string() }
  ].


openapi_com_day_cq_dam_s7dam_common_process_video_thumbnail_download_process_properties() ->
    openapi_com_day_cq_dam_s7dam_common_process_video_thumbnail_download_process_properties([]).

openapi_com_day_cq_dam_s7dam_common_process_video_thumbnail_download_process_properties(Fields) ->
  Default = [ {'process.label', openapi_config_node_property_string:openapi_config_node_property_string() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

