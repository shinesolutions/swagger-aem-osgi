-module(openapi_com_day_cq_analytics_sitecatalyst_impl_importer_report_importer_properties).

-include("openapi.hrl").

-export([openapi_com_day_cq_analytics_sitecatalyst_impl_importer_report_importer_properties/0]).

-export([openapi_com_day_cq_analytics_sitecatalyst_impl_importer_report_importer_properties/1]).

-export_type([openapi_com_day_cq_analytics_sitecatalyst_impl_importer_report_importer_properties/0]).

-type openapi_com_day_cq_analytics_sitecatalyst_impl_importer_report_importer_properties() ::
  [ {'report_fetch_attempts', openapi_config_node_property_integer:openapi_config_node_property_integer() }
  | {'report_fetch_delay', openapi_config_node_property_integer:openapi_config_node_property_integer() }
  ].


openapi_com_day_cq_analytics_sitecatalyst_impl_importer_report_importer_properties() ->
    openapi_com_day_cq_analytics_sitecatalyst_impl_importer_report_importer_properties([]).

openapi_com_day_cq_analytics_sitecatalyst_impl_importer_report_importer_properties(Fields) ->
  Default = [ {'report.fetch.attempts', openapi_config_node_property_integer:openapi_config_node_property_integer() }
            , {'report.fetch.delay', openapi_config_node_property_integer:openapi_config_node_property_integer() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

