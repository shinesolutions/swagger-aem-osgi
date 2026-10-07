-module(openapi_org_apache_sling_jcr_resource_internal_jcr_resource_resolver_factory_impl_info).

-include("openapi.hrl").

-export([openapi_org_apache_sling_jcr_resource_internal_jcr_resource_resolver_factory_impl_info/0]).

-export([openapi_org_apache_sling_jcr_resource_internal_jcr_resource_resolver_factory_impl_info/1]).

-export_type([openapi_org_apache_sling_jcr_resource_internal_jcr_resource_resolver_factory_impl_info/0]).

-type openapi_org_apache_sling_jcr_resource_internal_jcr_resource_resolver_factory_impl_info() ::
  [ {'pid', binary() }
  | {'title', binary() }
  | {'description', binary() }
  | {'properties', openapi_org_apache_sling_jcr_resource_internal_jcr_resource_resolver_factory_impl_properties:openapi_org_apache_sling_jcr_resource_internal_jcr_resource_resolver_factory_impl_properties() }
  | {'bundle_location', binary() }
  | {'service_location', binary() }
  ].


openapi_org_apache_sling_jcr_resource_internal_jcr_resource_resolver_factory_impl_info() ->
    openapi_org_apache_sling_jcr_resource_internal_jcr_resource_resolver_factory_impl_info([]).

openapi_org_apache_sling_jcr_resource_internal_jcr_resource_resolver_factory_impl_info(Fields) ->
  Default = [ {'pid', binary() }
            , {'title', binary() }
            , {'description', binary() }
            , {'properties', openapi_org_apache_sling_jcr_resource_internal_jcr_resource_resolver_factory_impl_properties:openapi_org_apache_sling_jcr_resource_internal_jcr_resource_resolver_factory_impl_properties() }
            , {'bundle_location', binary() }
            , {'service_location', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

