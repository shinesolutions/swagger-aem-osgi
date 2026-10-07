-module(openapi_com_day_cq_analytics_sitecatalyst_impl_exporter_classifications_exporte_info).

-include("openapi.hrl").

-export([openapi_com_day_cq_analytics_sitecatalyst_impl_exporter_classifications_exporte_info/0]).

-export([openapi_com_day_cq_analytics_sitecatalyst_impl_exporter_classifications_exporte_info/1]).

-export_type([openapi_com_day_cq_analytics_sitecatalyst_impl_exporter_classifications_exporte_info/0]).

-type openapi_com_day_cq_analytics_sitecatalyst_impl_exporter_classifications_exporte_info() ::
  [ {'pid', binary() }
  | {'title', binary() }
  | {'description', binary() }
  | {'properties', openapi_com_day_cq_analytics_sitecatalyst_impl_exporter_classifications_exporte_properties:openapi_com_day_cq_analytics_sitecatalyst_impl_exporter_classifications_exporte_properties() }
  ].


openapi_com_day_cq_analytics_sitecatalyst_impl_exporter_classifications_exporte_info() ->
    openapi_com_day_cq_analytics_sitecatalyst_impl_exporter_classifications_exporte_info([]).

openapi_com_day_cq_analytics_sitecatalyst_impl_exporter_classifications_exporte_info(Fields) ->
  Default = [ {'pid', binary() }
            , {'title', binary() }
            , {'description', binary() }
            , {'properties', openapi_com_day_cq_analytics_sitecatalyst_impl_exporter_classifications_exporte_properties:openapi_com_day_cq_analytics_sitecatalyst_impl_exporter_classifications_exporte_properties() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

