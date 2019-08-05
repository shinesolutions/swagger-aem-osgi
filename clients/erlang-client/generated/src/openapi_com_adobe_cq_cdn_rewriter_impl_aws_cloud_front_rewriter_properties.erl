-module(openapi_com_adobe_cq_cdn_rewriter_impl_aws_cloud_front_rewriter_properties).

-export([encode/1]).

-export_type([openapi_com_adobe_cq_cdn_rewriter_impl_aws_cloud_front_rewriter_properties/0]).

-type openapi_com_adobe_cq_cdn_rewriter_impl_aws_cloud_front_rewriter_properties() ::
    #{ 'service_ranking' => openapi_config_node_property_integer:openapi_config_node_property_integer(),
       'keypair_id' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'keypair_alias' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'cdnrewriter_attributes' => openapi_config_node_property_array:openapi_config_node_property_array(),
       'cdn_rewriter_distribution_domain' => openapi_config_node_property_string:openapi_config_node_property_string()
     }.

encode(#{ 'service_ranking' := ServiceRanking,
          'keypair_id' := KeypairId,
          'keypair_alias' := KeypairAlias,
          'cdnrewriter_attributes' := CdnrewriterAttributes,
          'cdn_rewriter_distribution_domain' := CdnRewriterDistributionDomain
        }) ->
    #{ 'service.ranking' => ServiceRanking,
       'keypair.id' => KeypairId,
       'keypair.alias' => KeypairAlias,
       'cdnrewriter.attributes' => CdnrewriterAttributes,
       'cdn.rewriter.distribution.domain' => CdnRewriterDistributionDomain
     }.
