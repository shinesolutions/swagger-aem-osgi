-module(openapi_com_day_cq_wcm_designimporter_parser_taghandlers_factory_default_tag_han_info).

-include("openapi.hrl").

-export([openapi_com_day_cq_wcm_designimporter_parser_taghandlers_factory_default_tag_han_info/0]).

-export([openapi_com_day_cq_wcm_designimporter_parser_taghandlers_factory_default_tag_han_info/1]).

-export_type([openapi_com_day_cq_wcm_designimporter_parser_taghandlers_factory_default_tag_han_info/0]).

-type openapi_com_day_cq_wcm_designimporter_parser_taghandlers_factory_default_tag_han_info() ::
  [ {'pid', binary() }
  | {'title', binary() }
  | {'description', binary() }
  | {'properties', openapi_com_day_cq_wcm_designimporter_parser_taghandlers_factory_default_tag_han_properties:openapi_com_day_cq_wcm_designimporter_parser_taghandlers_factory_default_tag_han_properties() }
  ].


openapi_com_day_cq_wcm_designimporter_parser_taghandlers_factory_default_tag_han_info() ->
    openapi_com_day_cq_wcm_designimporter_parser_taghandlers_factory_default_tag_han_info([]).

openapi_com_day_cq_wcm_designimporter_parser_taghandlers_factory_default_tag_han_info(Fields) ->
  Default = [ {'pid', binary() }
            , {'title', binary() }
            , {'description', binary() }
            , {'properties', openapi_com_day_cq_wcm_designimporter_parser_taghandlers_factory_default_tag_han_properties:openapi_com_day_cq_wcm_designimporter_parser_taghandlers_factory_default_tag_han_properties() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

