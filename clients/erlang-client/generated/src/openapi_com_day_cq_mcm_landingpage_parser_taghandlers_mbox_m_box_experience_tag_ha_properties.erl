-module(openapi_com_day_cq_mcm_landingpage_parser_taghandlers_mbox_m_box_experience_tag_ha_properties).

-export([encode/1]).

-export_type([openapi_com_day_cq_mcm_landingpage_parser_taghandlers_mbox_m_box_experience_tag_ha_properties/0]).

-type openapi_com_day_cq_mcm_landingpage_parser_taghandlers_mbox_m_box_experience_tag_ha_properties() ::
    #{ 'service_ranking' => openapi_config_node_property_integer:openapi_config_node_property_integer(),
       'tagpattern' => openapi_config_node_property_string:openapi_config_node_property_string()
     }.

encode(#{ 'service_ranking' := ServiceRanking,
          'tagpattern' := Tagpattern
        }) ->
    #{ 'service.ranking' => ServiceRanking,
       'tagpattern' => Tagpattern
     }.
