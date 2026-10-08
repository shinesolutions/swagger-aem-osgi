-module(openapi_org_apache_sling_distribution_packaging_impl_importer_repository_distri_properties).

-include("openapi.hrl").

-export([openapi_org_apache_sling_distribution_packaging_impl_importer_repository_distri_properties/0]).

-export([openapi_org_apache_sling_distribution_packaging_impl_importer_repository_distri_properties/1]).

-export_type([openapi_org_apache_sling_distribution_packaging_impl_importer_repository_distri_properties/0]).

-type openapi_org_apache_sling_distribution_packaging_impl_importer_repository_distri_properties() ::
  [ {'name', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'service_name', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'path', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'privilege_name', openapi_config_node_property_string:openapi_config_node_property_string() }
  ].


openapi_org_apache_sling_distribution_packaging_impl_importer_repository_distri_properties() ->
    openapi_org_apache_sling_distribution_packaging_impl_importer_repository_distri_properties([]).

openapi_org_apache_sling_distribution_packaging_impl_importer_repository_distri_properties(Fields) ->
  Default = [ {'name', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'service.name', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'path', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'privilege.name', openapi_config_node_property_string:openapi_config_node_property_string() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

