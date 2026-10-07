-module(openapi_com_day_cq_wcm_designimporter_parser_taghandlers_factory_non_script_tag_h_info).

-export([encode/1]).

-export_type([openapi_com_day_cq_wcm_designimporter_parser_taghandlers_factory_non_script_tag_h_info/0]).

-type openapi_com_day_cq_wcm_designimporter_parser_taghandlers_factory_non_script_tag_h_info() ::
    #{ 'pid' => binary(),
       'title' => binary(),
       'description' => binary(),
       'properties' => openapi_com_day_cq_wcm_designimporter_parser_taghandlers_factory_non_script_tag_h_properties:openapi_com_day_cq_wcm_designimporter_parser_taghandlers_factory_non_script_tag_h_properties()
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
