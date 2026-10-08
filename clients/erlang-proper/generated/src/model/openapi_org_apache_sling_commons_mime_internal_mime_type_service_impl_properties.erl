-module(openapi_org_apache_sling_commons_mime_internal_mime_type_service_impl_properties).

-include("openapi.hrl").

-export([openapi_org_apache_sling_commons_mime_internal_mime_type_service_impl_properties/0]).

-export([openapi_org_apache_sling_commons_mime_internal_mime_type_service_impl_properties/1]).

-export_type([openapi_org_apache_sling_commons_mime_internal_mime_type_service_impl_properties/0]).

-type openapi_org_apache_sling_commons_mime_internal_mime_type_service_impl_properties() ::
  [ {'mime_types', openapi_config_node_property_array:openapi_config_node_property_array() }
  ].


openapi_org_apache_sling_commons_mime_internal_mime_type_service_impl_properties() ->
    openapi_org_apache_sling_commons_mime_internal_mime_type_service_impl_properties([]).

openapi_org_apache_sling_commons_mime_internal_mime_type_service_impl_properties(Fields) ->
  Default = [ {'mime.types', openapi_config_node_property_array:openapi_config_node_property_array() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

