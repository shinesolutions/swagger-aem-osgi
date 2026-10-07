-module(openapi_org_apache_sling_i18n_impl_jcr_resource_bundle_provider_info).

-include("openapi.hrl").

-export([openapi_org_apache_sling_i18n_impl_jcr_resource_bundle_provider_info/0]).

-export([openapi_org_apache_sling_i18n_impl_jcr_resource_bundle_provider_info/1]).

-export_type([openapi_org_apache_sling_i18n_impl_jcr_resource_bundle_provider_info/0]).

-type openapi_org_apache_sling_i18n_impl_jcr_resource_bundle_provider_info() ::
  [ {'pid', binary() }
  | {'title', binary() }
  | {'description', binary() }
  | {'properties', openapi_org_apache_sling_i18n_impl_jcr_resource_bundle_provider_properties:openapi_org_apache_sling_i18n_impl_jcr_resource_bundle_provider_properties() }
  | {'additionalProperties', binary() }
  | {'bundle_location', binary() }
  | {'service_location', binary() }
  ].


openapi_org_apache_sling_i18n_impl_jcr_resource_bundle_provider_info() ->
    openapi_org_apache_sling_i18n_impl_jcr_resource_bundle_provider_info([]).

openapi_org_apache_sling_i18n_impl_jcr_resource_bundle_provider_info(Fields) ->
  Default = [ {'pid', binary() }
            , {'title', binary() }
            , {'description', binary() }
            , {'properties', openapi_org_apache_sling_i18n_impl_jcr_resource_bundle_provider_properties:openapi_org_apache_sling_i18n_impl_jcr_resource_bundle_provider_properties() }
            , {'additionalProperties', binary() }
            , {'bundle_location', binary() }
            , {'service_location', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

