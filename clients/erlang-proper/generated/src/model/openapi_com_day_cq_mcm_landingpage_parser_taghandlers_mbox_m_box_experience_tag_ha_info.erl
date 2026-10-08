-module(openapi_com_day_cq_mcm_landingpage_parser_taghandlers_mbox_m_box_experience_tag_ha_info).

-include("openapi.hrl").

-export([openapi_com_day_cq_mcm_landingpage_parser_taghandlers_mbox_m_box_experience_tag_ha_info/0]).

-export([openapi_com_day_cq_mcm_landingpage_parser_taghandlers_mbox_m_box_experience_tag_ha_info/1]).

-export_type([openapi_com_day_cq_mcm_landingpage_parser_taghandlers_mbox_m_box_experience_tag_ha_info/0]).

-type openapi_com_day_cq_mcm_landingpage_parser_taghandlers_mbox_m_box_experience_tag_ha_info() ::
  [ {'pid', binary() }
  | {'title', binary() }
  | {'description', binary() }
  | {'properties', openapi_com_day_cq_mcm_landingpage_parser_taghandlers_mbox_m_box_experience_tag_ha_properties:openapi_com_day_cq_mcm_landingpage_parser_taghandlers_mbox_m_box_experience_tag_ha_properties() }
  ].


openapi_com_day_cq_mcm_landingpage_parser_taghandlers_mbox_m_box_experience_tag_ha_info() ->
    openapi_com_day_cq_mcm_landingpage_parser_taghandlers_mbox_m_box_experience_tag_ha_info([]).

openapi_com_day_cq_mcm_landingpage_parser_taghandlers_mbox_m_box_experience_tag_ha_info(Fields) ->
  Default = [ {'pid', binary() }
            , {'title', binary() }
            , {'description', binary() }
            , {'properties', openapi_com_day_cq_mcm_landingpage_parser_taghandlers_mbox_m_box_experience_tag_ha_properties:openapi_com_day_cq_mcm_landingpage_parser_taghandlers_mbox_m_box_experience_tag_ha_properties() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

