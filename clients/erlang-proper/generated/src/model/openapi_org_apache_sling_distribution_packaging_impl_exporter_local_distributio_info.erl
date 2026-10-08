-module(openapi_org_apache_sling_distribution_packaging_impl_exporter_local_distributio_info).

-include("openapi.hrl").

-export([openapi_org_apache_sling_distribution_packaging_impl_exporter_local_distributio_info/0]).

-export([openapi_org_apache_sling_distribution_packaging_impl_exporter_local_distributio_info/1]).

-export_type([openapi_org_apache_sling_distribution_packaging_impl_exporter_local_distributio_info/0]).

-type openapi_org_apache_sling_distribution_packaging_impl_exporter_local_distributio_info() ::
  [ {'pid', binary() }
  | {'title', binary() }
  | {'description', binary() }
  | {'properties', openapi_org_apache_sling_distribution_packaging_impl_exporter_local_distributio_properties:openapi_org_apache_sling_distribution_packaging_impl_exporter_local_distributio_properties() }
  ].


openapi_org_apache_sling_distribution_packaging_impl_exporter_local_distributio_info() ->
    openapi_org_apache_sling_distribution_packaging_impl_exporter_local_distributio_info([]).

openapi_org_apache_sling_distribution_packaging_impl_exporter_local_distributio_info(Fields) ->
  Default = [ {'pid', binary() }
            , {'title', binary() }
            , {'description', binary() }
            , {'properties', openapi_org_apache_sling_distribution_packaging_impl_exporter_local_distributio_properties:openapi_org_apache_sling_distribution_packaging_impl_exporter_local_distributio_properties() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

