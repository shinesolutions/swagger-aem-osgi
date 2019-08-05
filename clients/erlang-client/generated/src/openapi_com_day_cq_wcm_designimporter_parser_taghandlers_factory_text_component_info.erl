-module(openapi_com_day_cq_wcm_designimporter_parser_taghandlers_factory_text_component_info).

-export([encode/1]).

-export_type([openapi_com_day_cq_wcm_designimporter_parser_taghandlers_factory_text_component_info/0]).

-type openapi_com_day_cq_wcm_designimporter_parser_taghandlers_factory_text_component_info() ::
    #{ 'pid' => binary(),
       'title' => binary(),
       'description' => binary(),
       'properties' => openapi_com_day_cq_wcm_designimporter_parser_taghandlers_factory_text_component_properties:openapi_com_day_cq_wcm_designimporter_parser_taghandlers_factory_text_component_properties()
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
