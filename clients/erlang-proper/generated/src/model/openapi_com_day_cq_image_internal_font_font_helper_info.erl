-module(openapi_com_day_cq_image_internal_font_font_helper_info).

-include("openapi.hrl").

-export([openapi_com_day_cq_image_internal_font_font_helper_info/0]).

-export([openapi_com_day_cq_image_internal_font_font_helper_info/1]).

-export_type([openapi_com_day_cq_image_internal_font_font_helper_info/0]).

-type openapi_com_day_cq_image_internal_font_font_helper_info() ::
  [ {'pid', binary() }
  | {'title', binary() }
  | {'description', binary() }
  | {'properties', openapi_com_day_cq_image_internal_font_font_helper_properties:openapi_com_day_cq_image_internal_font_font_helper_properties() }
  ].


openapi_com_day_cq_image_internal_font_font_helper_info() ->
    openapi_com_day_cq_image_internal_font_font_helper_info([]).

openapi_com_day_cq_image_internal_font_font_helper_info(Fields) ->
  Default = [ {'pid', binary() }
            , {'title', binary() }
            , {'description', binary() }
            , {'properties', openapi_com_day_cq_image_internal_font_font_helper_properties:openapi_com_day_cq_image_internal_font_font_helper_properties() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

