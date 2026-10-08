-module(openapi_org_apache_sling_commons_metrics_rrd4j_impl_codahale_metrics_reporter_info).

-include("openapi.hrl").

-export([openapi_org_apache_sling_commons_metrics_rrd4j_impl_codahale_metrics_reporter_info/0]).

-export([openapi_org_apache_sling_commons_metrics_rrd4j_impl_codahale_metrics_reporter_info/1]).

-export_type([openapi_org_apache_sling_commons_metrics_rrd4j_impl_codahale_metrics_reporter_info/0]).

-type openapi_org_apache_sling_commons_metrics_rrd4j_impl_codahale_metrics_reporter_info() ::
  [ {'pid', binary() }
  | {'title', binary() }
  | {'description', binary() }
  | {'properties', openapi_org_apache_sling_commons_metrics_rrd4j_impl_codahale_metrics_reporter_properties:openapi_org_apache_sling_commons_metrics_rrd4j_impl_codahale_metrics_reporter_properties() }
  | {'bundle_location', binary() }
  | {'service_location', binary() }
  ].


openapi_org_apache_sling_commons_metrics_rrd4j_impl_codahale_metrics_reporter_info() ->
    openapi_org_apache_sling_commons_metrics_rrd4j_impl_codahale_metrics_reporter_info([]).

openapi_org_apache_sling_commons_metrics_rrd4j_impl_codahale_metrics_reporter_info(Fields) ->
  Default = [ {'pid', binary() }
            , {'title', binary() }
            , {'description', binary() }
            , {'properties', openapi_org_apache_sling_commons_metrics_rrd4j_impl_codahale_metrics_reporter_properties:openapi_org_apache_sling_commons_metrics_rrd4j_impl_codahale_metrics_reporter_properties() }
            , {'bundle_location', binary() }
            , {'service_location', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

