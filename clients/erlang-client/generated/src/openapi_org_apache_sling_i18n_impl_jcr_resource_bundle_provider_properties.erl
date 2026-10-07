-module(openapi_org_apache_sling_i18n_impl_jcr_resource_bundle_provider_properties).

-export([encode/1]).

-export_type([openapi_org_apache_sling_i18n_impl_jcr_resource_bundle_provider_properties/0]).

-type openapi_org_apache_sling_i18n_impl_jcr_resource_bundle_provider_properties() ::
    #{ 'locale_default' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'preload_bundles' => openapi_config_node_property_boolean:openapi_config_node_property_boolean(),
       'invalidation_delay' => openapi_config_node_property_integer:openapi_config_node_property_integer()
     }.

encode(#{ 'locale_default' := LocaleDefault,
          'preload_bundles' := PreloadBundles,
          'invalidation_delay' := InvalidationDelay
        }) ->
    #{ 'locale.default' => LocaleDefault,
       'preload.bundles' => PreloadBundles,
       'invalidation.delay' => InvalidationDelay
     }.
