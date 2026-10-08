-module(openapi_com_day_cq_mcm_landingpage_parser_taghandlers_mbox_target_component_tag_h_properties).

-include("openapi.hrl").

-export([openapi_com_day_cq_mcm_landingpage_parser_taghandlers_mbox_target_component_tag_h_properties/0]).

-export([openapi_com_day_cq_mcm_landingpage_parser_taghandlers_mbox_target_component_tag_h_properties/1]).

-export_type([openapi_com_day_cq_mcm_landingpage_parser_taghandlers_mbox_target_component_tag_h_properties/0]).

-type openapi_com_day_cq_mcm_landingpage_parser_taghandlers_mbox_target_component_tag_h_properties() ::
  [ {'service_ranking', openapi_config_node_property_integer:openapi_config_node_property_integer() }
  | {'tagpattern', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'component_resourceType', openapi_config_node_property_string:openapi_config_node_property_string() }
  ].


openapi_com_day_cq_mcm_landingpage_parser_taghandlers_mbox_target_component_tag_h_properties() ->
    openapi_com_day_cq_mcm_landingpage_parser_taghandlers_mbox_target_component_tag_h_properties([]).

openapi_com_day_cq_mcm_landingpage_parser_taghandlers_mbox_target_component_tag_h_properties(Fields) ->
  Default = [ {'service.ranking', openapi_config_node_property_integer:openapi_config_node_property_integer() }
            , {'tagpattern', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'component.resourceType', openapi_config_node_property_string:openapi_config_node_property_string() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

