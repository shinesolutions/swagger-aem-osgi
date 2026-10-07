-module(openapi_com_day_cq_dam_core_process_metadata_processor_process_info).

-include("openapi.hrl").

-export([openapi_com_day_cq_dam_core_process_metadata_processor_process_info/0]).

-export([openapi_com_day_cq_dam_core_process_metadata_processor_process_info/1]).

-export_type([openapi_com_day_cq_dam_core_process_metadata_processor_process_info/0]).

-type openapi_com_day_cq_dam_core_process_metadata_processor_process_info() ::
  [ {'pid', binary() }
  | {'title', binary() }
  | {'description', binary() }
  | {'properties', openapi_com_day_cq_dam_core_process_metadata_processor_process_properties:openapi_com_day_cq_dam_core_process_metadata_processor_process_properties() }
  ].


openapi_com_day_cq_dam_core_process_metadata_processor_process_info() ->
    openapi_com_day_cq_dam_core_process_metadata_processor_process_info([]).

openapi_com_day_cq_dam_core_process_metadata_processor_process_info(Fields) ->
  Default = [ {'pid', binary() }
            , {'title', binary() }
            , {'description', binary() }
            , {'properties', openapi_com_day_cq_dam_core_process_metadata_processor_process_properties:openapi_com_day_cq_dam_core_process_metadata_processor_process_properties() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

