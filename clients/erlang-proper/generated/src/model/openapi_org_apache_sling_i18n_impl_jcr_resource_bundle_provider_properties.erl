-module(openapi_org_apache_sling_i18n_impl_jcr_resource_bundle_provider_properties).

-include("openapi.hrl").

-export([openapi_org_apache_sling_i18n_impl_jcr_resource_bundle_provider_properties/0]).

-export([openapi_org_apache_sling_i18n_impl_jcr_resource_bundle_provider_properties/1]).

-export_type([openapi_org_apache_sling_i18n_impl_jcr_resource_bundle_provider_properties/0]).

-type openapi_org_apache_sling_i18n_impl_jcr_resource_bundle_provider_properties() ::
  [ {'locale_default', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'preload_bundles', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
  | {'invalidation_delay', openapi_config_node_property_integer:openapi_config_node_property_integer() }
  ].


openapi_org_apache_sling_i18n_impl_jcr_resource_bundle_provider_properties() ->
    openapi_org_apache_sling_i18n_impl_jcr_resource_bundle_provider_properties([]).

openapi_org_apache_sling_i18n_impl_jcr_resource_bundle_provider_properties(Fields) ->
  Default = [ {'locale.default', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'preload.bundles', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
            , {'invalidation.delay', openapi_config_node_property_integer:openapi_config_node_property_integer() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

