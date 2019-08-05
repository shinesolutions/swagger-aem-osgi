-module(openapi_com_adobe_cq_cdn_rewriter_impl_cdn_rewriter_properties).

-export([encode/1]).

-export_type([openapi_com_adobe_cq_cdn_rewriter_impl_cdn_rewriter_properties/0]).

-type openapi_com_adobe_cq_cdn_rewriter_impl_cdn_rewriter_properties() ::
    #{ 'service_ranking' => openapi_config_node_property_integer:openapi_config_node_property_integer(),
       'cdnrewriter_attributes' => openapi_config_node_property_array:openapi_config_node_property_array(),
       'cdn_rewriter_distribution_domain' => openapi_config_node_property_string:openapi_config_node_property_string()
     }.

encode(#{ 'service_ranking' := ServiceRanking,
          'cdnrewriter_attributes' := CdnrewriterAttributes,
          'cdn_rewriter_distribution_domain' := CdnRewriterDistributionDomain
        }) ->
    #{ 'service.ranking' => ServiceRanking,
       'cdnrewriter.attributes' => CdnrewriterAttributes,
       'cdn.rewriter.distribution.domain' => CdnRewriterDistributionDomain
     }.
