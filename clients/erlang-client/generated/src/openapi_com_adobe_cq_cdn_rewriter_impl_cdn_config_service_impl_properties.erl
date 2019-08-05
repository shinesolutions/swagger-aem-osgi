-module(openapi_com_adobe_cq_cdn_rewriter_impl_cdn_config_service_impl_properties).

-export([encode/1]).

-export_type([openapi_com_adobe_cq_cdn_rewriter_impl_cdn_config_service_impl_properties/0]).

-type openapi_com_adobe_cq_cdn_rewriter_impl_cdn_config_service_impl_properties() ::
    #{ 'cdn_config_distribution_domain' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'cdn_config_enable_rewriting' => openapi_config_node_property_boolean:openapi_config_node_property_boolean(),
       'cdn_config_path_prefixes' => openapi_config_node_property_array:openapi_config_node_property_array(),
       'cdn_config_cdnttl' => openapi_config_node_property_integer:openapi_config_node_property_integer(),
       'cdn_config_application_protocol' => openapi_config_node_property_string:openapi_config_node_property_string()
     }.

encode(#{ 'cdn_config_distribution_domain' := CdnConfigDistributionDomain,
          'cdn_config_enable_rewriting' := CdnConfigEnableRewriting,
          'cdn_config_path_prefixes' := CdnConfigPathPrefixes,
          'cdn_config_cdnttl' := CdnConfigCdnttl,
          'cdn_config_application_protocol' := CdnConfigApplicationProtocol
        }) ->
    #{ 'cdn.config.distribution.domain' => CdnConfigDistributionDomain,
       'cdn.config.enable.rewriting' => CdnConfigEnableRewriting,
       'cdn.config.path.prefixes' => CdnConfigPathPrefixes,
       'cdn.config.cdnttl' => CdnConfigCdnttl,
       'cdn.config.application.protocol' => CdnConfigApplicationProtocol
     }.
