-module(openapi_org_apache_sling_commons_metrics_rrd4j_impl_codahale_metrics_reporter_properties).

-include("openapi.hrl").

-export([openapi_org_apache_sling_commons_metrics_rrd4j_impl_codahale_metrics_reporter_properties/0]).

-export([openapi_org_apache_sling_commons_metrics_rrd4j_impl_codahale_metrics_reporter_properties/1]).

-export_type([openapi_org_apache_sling_commons_metrics_rrd4j_impl_codahale_metrics_reporter_properties/0]).

-type openapi_org_apache_sling_commons_metrics_rrd4j_impl_codahale_metrics_reporter_properties() ::
  [ {'datasources', openapi_config_node_property_array:openapi_config_node_property_array() }
  | {'step', openapi_config_node_property_integer:openapi_config_node_property_integer() }
  | {'archives', openapi_config_node_property_array:openapi_config_node_property_array() }
  | {'path', openapi_config_node_property_string:openapi_config_node_property_string() }
  ].


openapi_org_apache_sling_commons_metrics_rrd4j_impl_codahale_metrics_reporter_properties() ->
    openapi_org_apache_sling_commons_metrics_rrd4j_impl_codahale_metrics_reporter_properties([]).

openapi_org_apache_sling_commons_metrics_rrd4j_impl_codahale_metrics_reporter_properties(Fields) ->
  Default = [ {'datasources', openapi_config_node_property_array:openapi_config_node_property_array() }
            , {'step', openapi_config_node_property_integer:openapi_config_node_property_integer() }
            , {'archives', openapi_config_node_property_array:openapi_config_node_property_array() }
            , {'path', openapi_config_node_property_string:openapi_config_node_property_string() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

