-module(openapi_org_apache_sling_distribution_packaging_impl_importer_local_distributio_properties).

-include("openapi.hrl").

-export([openapi_org_apache_sling_distribution_packaging_impl_importer_local_distributio_properties/0]).

-export([openapi_org_apache_sling_distribution_packaging_impl_importer_local_distributio_properties/1]).

-export_type([openapi_org_apache_sling_distribution_packaging_impl_importer_local_distributio_properties/0]).

-type openapi_org_apache_sling_distribution_packaging_impl_importer_local_distributio_properties() ::
  [ {'name', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'packageBuilder_target', openapi_config_node_property_string:openapi_config_node_property_string() }
  ].


openapi_org_apache_sling_distribution_packaging_impl_importer_local_distributio_properties() ->
    openapi_org_apache_sling_distribution_packaging_impl_importer_local_distributio_properties([]).

openapi_org_apache_sling_distribution_packaging_impl_importer_local_distributio_properties(Fields) ->
  Default = [ {'name', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'packageBuilder.target', openapi_config_node_property_string:openapi_config_node_property_string() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

