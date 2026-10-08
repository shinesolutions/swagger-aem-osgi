-module(openapi_com_day_cq_mcm_landingpage_parser_taghandlers_cta_lead_form_cta_component_info).

-include("openapi.hrl").

-export([openapi_com_day_cq_mcm_landingpage_parser_taghandlers_cta_lead_form_cta_component_info/0]).

-export([openapi_com_day_cq_mcm_landingpage_parser_taghandlers_cta_lead_form_cta_component_info/1]).

-export_type([openapi_com_day_cq_mcm_landingpage_parser_taghandlers_cta_lead_form_cta_component_info/0]).

-type openapi_com_day_cq_mcm_landingpage_parser_taghandlers_cta_lead_form_cta_component_info() ::
  [ {'pid', binary() }
  | {'title', binary() }
  | {'description', binary() }
  | {'properties', openapi_com_day_cq_mcm_landingpage_parser_taghandlers_cta_lead_form_cta_component_properties:openapi_com_day_cq_mcm_landingpage_parser_taghandlers_cta_lead_form_cta_component_properties() }
  ].


openapi_com_day_cq_mcm_landingpage_parser_taghandlers_cta_lead_form_cta_component_info() ->
    openapi_com_day_cq_mcm_landingpage_parser_taghandlers_cta_lead_form_cta_component_info([]).

openapi_com_day_cq_mcm_landingpage_parser_taghandlers_cta_lead_form_cta_component_info(Fields) ->
  Default = [ {'pid', binary() }
            , {'title', binary() }
            , {'description', binary() }
            , {'properties', openapi_com_day_cq_mcm_landingpage_parser_taghandlers_cta_lead_form_cta_component_properties:openapi_com_day_cq_mcm_landingpage_parser_taghandlers_cta_lead_form_cta_component_properties() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

