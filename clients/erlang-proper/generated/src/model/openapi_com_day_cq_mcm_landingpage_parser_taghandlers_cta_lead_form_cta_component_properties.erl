-module(openapi_com_day_cq_mcm_landingpage_parser_taghandlers_cta_lead_form_cta_component_properties).

-include("openapi.hrl").

-export([openapi_com_day_cq_mcm_landingpage_parser_taghandlers_cta_lead_form_cta_component_properties/0]).

-export([openapi_com_day_cq_mcm_landingpage_parser_taghandlers_cta_lead_form_cta_component_properties/1]).

-export_type([openapi_com_day_cq_mcm_landingpage_parser_taghandlers_cta_lead_form_cta_component_properties/0]).

-type openapi_com_day_cq_mcm_landingpage_parser_taghandlers_cta_lead_form_cta_component_properties() ::
  [ {'service_ranking', openapi_config_node_property_integer:openapi_config_node_property_integer() }
  | {'tagpattern', openapi_config_node_property_string:openapi_config_node_property_string() }
  ].


openapi_com_day_cq_mcm_landingpage_parser_taghandlers_cta_lead_form_cta_component_properties() ->
    openapi_com_day_cq_mcm_landingpage_parser_taghandlers_cta_lead_form_cta_component_properties([]).

openapi_com_day_cq_mcm_landingpage_parser_taghandlers_cta_lead_form_cta_component_properties(Fields) ->
  Default = [ {'service.ranking', openapi_config_node_property_integer:openapi_config_node_property_integer() }
            , {'tagpattern', openapi_config_node_property_string:openapi_config_node_property_string() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

