-module(openapi_com_day_cq_mcm_landingpage_parser_taghandlers_cta_graphical_click_throug_info).

-include("openapi.hrl").

-export([openapi_com_day_cq_mcm_landingpage_parser_taghandlers_cta_graphical_click_throug_info/0]).

-export([openapi_com_day_cq_mcm_landingpage_parser_taghandlers_cta_graphical_click_throug_info/1]).

-export_type([openapi_com_day_cq_mcm_landingpage_parser_taghandlers_cta_graphical_click_throug_info/0]).

-type openapi_com_day_cq_mcm_landingpage_parser_taghandlers_cta_graphical_click_throug_info() ::
  [ {'pid', binary() }
  | {'title', binary() }
  | {'description', binary() }
  | {'properties', openapi_com_day_cq_mcm_landingpage_parser_taghandlers_cta_graphical_click_throug_properties:openapi_com_day_cq_mcm_landingpage_parser_taghandlers_cta_graphical_click_throug_properties() }
  ].


openapi_com_day_cq_mcm_landingpage_parser_taghandlers_cta_graphical_click_throug_info() ->
    openapi_com_day_cq_mcm_landingpage_parser_taghandlers_cta_graphical_click_throug_info([]).

openapi_com_day_cq_mcm_landingpage_parser_taghandlers_cta_graphical_click_throug_info(Fields) ->
  Default = [ {'pid', binary() }
            , {'title', binary() }
            , {'description', binary() }
            , {'properties', openapi_com_day_cq_mcm_landingpage_parser_taghandlers_cta_graphical_click_throug_properties:openapi_com_day_cq_mcm_landingpage_parser_taghandlers_cta_graphical_click_throug_properties() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

