-module(openapi_com_day_cq_dam_commons_metadata_xmp_filter_black_white_info).

-include("openapi.hrl").

-export([openapi_com_day_cq_dam_commons_metadata_xmp_filter_black_white_info/0]).

-export([openapi_com_day_cq_dam_commons_metadata_xmp_filter_black_white_info/1]).

-export_type([openapi_com_day_cq_dam_commons_metadata_xmp_filter_black_white_info/0]).

-type openapi_com_day_cq_dam_commons_metadata_xmp_filter_black_white_info() ::
  [ {'pid', binary() }
  | {'title', binary() }
  | {'description', binary() }
  | {'properties', openapi_com_day_cq_dam_commons_metadata_xmp_filter_black_white_properties:openapi_com_day_cq_dam_commons_metadata_xmp_filter_black_white_properties() }
  ].


openapi_com_day_cq_dam_commons_metadata_xmp_filter_black_white_info() ->
    openapi_com_day_cq_dam_commons_metadata_xmp_filter_black_white_info([]).

openapi_com_day_cq_dam_commons_metadata_xmp_filter_black_white_info(Fields) ->
  Default = [ {'pid', binary() }
            , {'title', binary() }
            , {'description', binary() }
            , {'properties', openapi_com_day_cq_dam_commons_metadata_xmp_filter_black_white_properties:openapi_com_day_cq_dam_commons_metadata_xmp_filter_black_white_properties() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

