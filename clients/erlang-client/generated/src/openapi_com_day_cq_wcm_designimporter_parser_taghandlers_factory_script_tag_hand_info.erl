-module(openapi_com_day_cq_wcm_designimporter_parser_taghandlers_factory_script_tag_hand_info).

-export([encode/1]).

-export_type([openapi_com_day_cq_wcm_designimporter_parser_taghandlers_factory_script_tag_hand_info/0]).

-type openapi_com_day_cq_wcm_designimporter_parser_taghandlers_factory_script_tag_hand_info() ::
    #{ 'pid' => binary(),
       'title' => binary(),
       'description' => binary(),
       'properties' => openapi_com_day_cq_wcm_designimporter_parser_taghandlers_factory_script_tag_hand_properties:openapi_com_day_cq_wcm_designimporter_parser_taghandlers_factory_script_tag_hand_properties()
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
