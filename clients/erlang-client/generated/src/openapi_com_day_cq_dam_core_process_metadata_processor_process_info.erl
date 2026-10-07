-module(openapi_com_day_cq_dam_core_process_metadata_processor_process_info).

-export([encode/1]).

-export_type([openapi_com_day_cq_dam_core_process_metadata_processor_process_info/0]).

-type openapi_com_day_cq_dam_core_process_metadata_processor_process_info() ::
    #{ 'pid' => binary(),
       'title' => binary(),
       'description' => binary(),
       'properties' => openapi_com_day_cq_dam_core_process_metadata_processor_process_properties:openapi_com_day_cq_dam_core_process_metadata_processor_process_properties()
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
