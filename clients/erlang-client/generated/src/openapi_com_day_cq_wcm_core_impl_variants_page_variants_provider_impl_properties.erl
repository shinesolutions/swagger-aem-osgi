-module(openapi_com_day_cq_wcm_core_impl_variants_page_variants_provider_impl_properties).

-export([encode/1]).

-export_type([openapi_com_day_cq_wcm_core_impl_variants_page_variants_provider_impl_properties/0]).

-type openapi_com_day_cq_wcm_core_impl_variants_page_variants_provider_impl_properties() ::
    #{ 'default_externalizer_domain' => openapi_config_node_property_string:openapi_config_node_property_string()
     }.

encode(#{ 'default_externalizer_domain' := DefaultExternalizerDomain
        }) ->
    #{ 'default.externalizer.domain' => DefaultExternalizerDomain
     }.
