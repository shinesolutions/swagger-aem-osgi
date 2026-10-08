-module(openapi_com_day_cq_dam_s7dam_common_analytics_impl_s7dam_dynamic_media_config_even_info).

-include("openapi.hrl").

-export([openapi_com_day_cq_dam_s7dam_common_analytics_impl_s7dam_dynamic_media_config_even_info/0]).

-export([openapi_com_day_cq_dam_s7dam_common_analytics_impl_s7dam_dynamic_media_config_even_info/1]).

-export_type([openapi_com_day_cq_dam_s7dam_common_analytics_impl_s7dam_dynamic_media_config_even_info/0]).

-type openapi_com_day_cq_dam_s7dam_common_analytics_impl_s7dam_dynamic_media_config_even_info() ::
  [ {'pid', binary() }
  | {'title', binary() }
  | {'description', binary() }
  | {'properties', openapi_com_day_cq_dam_s7dam_common_analytics_impl_s7dam_dynamic_media_config_even_properties:openapi_com_day_cq_dam_s7dam_common_analytics_impl_s7dam_dynamic_media_config_even_properties() }
  ].


openapi_com_day_cq_dam_s7dam_common_analytics_impl_s7dam_dynamic_media_config_even_info() ->
    openapi_com_day_cq_dam_s7dam_common_analytics_impl_s7dam_dynamic_media_config_even_info([]).

openapi_com_day_cq_dam_s7dam_common_analytics_impl_s7dam_dynamic_media_config_even_info(Fields) ->
  Default = [ {'pid', binary() }
            , {'title', binary() }
            , {'description', binary() }
            , {'properties', openapi_com_day_cq_dam_s7dam_common_analytics_impl_s7dam_dynamic_media_config_even_properties:openapi_com_day_cq_dam_s7dam_common_analytics_impl_s7dam_dynamic_media_config_even_properties() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

