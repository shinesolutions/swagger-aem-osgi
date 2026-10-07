-module(openapi_com_day_cq_mcm_landingpage_parser_taghandlers_mbox_m_box_experience_tag_ha_info).

-export([encode/1]).

-export_type([openapi_com_day_cq_mcm_landingpage_parser_taghandlers_mbox_m_box_experience_tag_ha_info/0]).

-type openapi_com_day_cq_mcm_landingpage_parser_taghandlers_mbox_m_box_experience_tag_ha_info() ::
    #{ 'pid' => binary(),
       'title' => binary(),
       'description' => binary(),
       'properties' => openapi_com_day_cq_mcm_landingpage_parser_taghandlers_mbox_m_box_experience_tag_ha_properties:openapi_com_day_cq_mcm_landingpage_parser_taghandlers_mbox_m_box_experience_tag_ha_properties()
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
