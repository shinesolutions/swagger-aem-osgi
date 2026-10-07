-module(openapi_com_day_cq_analytics_sitecatalyst_impl_exporter_classifications_exporte_properties).

-include("openapi.hrl").

-export([openapi_com_day_cq_analytics_sitecatalyst_impl_exporter_classifications_exporte_properties/0]).

-export([openapi_com_day_cq_analytics_sitecatalyst_impl_exporter_classifications_exporte_properties/1]).

-export_type([openapi_com_day_cq_analytics_sitecatalyst_impl_exporter_classifications_exporte_properties/0]).

-type openapi_com_day_cq_analytics_sitecatalyst_impl_exporter_classifications_exporte_properties() ::
  [ {'allowed_paths', openapi_config_node_property_array:openapi_config_node_property_array() }
  | {'cq_analytics_saint_exporter_pagesize', openapi_config_node_property_integer:openapi_config_node_property_integer() }
  ].


openapi_com_day_cq_analytics_sitecatalyst_impl_exporter_classifications_exporte_properties() ->
    openapi_com_day_cq_analytics_sitecatalyst_impl_exporter_classifications_exporte_properties([]).

openapi_com_day_cq_analytics_sitecatalyst_impl_exporter_classifications_exporte_properties(Fields) ->
  Default = [ {'allowed.paths', openapi_config_node_property_array:openapi_config_node_property_array() }
            , {'cq.analytics.saint.exporter.pagesize', openapi_config_node_property_integer:openapi_config_node_property_integer() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

