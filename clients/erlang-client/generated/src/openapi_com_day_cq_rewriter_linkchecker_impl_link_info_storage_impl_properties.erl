-module(openapi_com_day_cq_rewriter_linkchecker_impl_link_info_storage_impl_properties).

-export([encode/1]).

-export_type([openapi_com_day_cq_rewriter_linkchecker_impl_link_info_storage_impl_properties/0]).

-type openapi_com_day_cq_rewriter_linkchecker_impl_link_info_storage_impl_properties() ::
    #{ 'service_max_links_per_host' => openapi_config_node_property_integer:openapi_config_node_property_integer(),
       'service_save_external_link_references' => openapi_config_node_property_boolean:openapi_config_node_property_boolean()
     }.

encode(#{ 'service_max_links_per_host' := ServiceMaxLinksPerHost,
          'service_save_external_link_references' := ServiceSaveExternalLinkReferences
        }) ->
    #{ 'service.max_links_per_host' => ServiceMaxLinksPerHost,
       'service.save_external_link_references' => ServiceSaveExternalLinkReferences
     }.
