-module(openapi_com_day_cq_rewriter_linkchecker_impl_link_checker_transformer_factory_properties).

-export([encode/1]).

-export_type([openapi_com_day_cq_rewriter_linkchecker_impl_link_checker_transformer_factory_properties/0]).

-type openapi_com_day_cq_rewriter_linkchecker_impl_link_checker_transformer_factory_properties() ::
    #{ 'linkcheckertransformer_disableRewriting' => openapi_config_node_property_boolean:openapi_config_node_property_boolean(),
       'linkcheckertransformer_disableChecking' => openapi_config_node_property_boolean:openapi_config_node_property_boolean(),
       'linkcheckertransformer_mapCacheSize' => openapi_config_node_property_integer:openapi_config_node_property_integer(),
       'linkcheckertransformer_strictExtensionCheck' => openapi_config_node_property_boolean:openapi_config_node_property_boolean(),
       'linkcheckertransformer_stripHtmltExtension' => openapi_config_node_property_boolean:openapi_config_node_property_boolean(),
       'linkcheckertransformer_rewriteElements' => openapi_config_node_property_array:openapi_config_node_property_array(),
       'linkcheckertransformer_stripExtensionPathBlacklist' => openapi_config_node_property_array:openapi_config_node_property_array()
     }.

encode(#{ 'linkcheckertransformer_disableRewriting' := LinkcheckertransformerDisableRewriting,
          'linkcheckertransformer_disableChecking' := LinkcheckertransformerDisableChecking,
          'linkcheckertransformer_mapCacheSize' := LinkcheckertransformerMapCacheSize,
          'linkcheckertransformer_strictExtensionCheck' := LinkcheckertransformerStrictExtensionCheck,
          'linkcheckertransformer_stripHtmltExtension' := LinkcheckertransformerStripHtmltExtension,
          'linkcheckertransformer_rewriteElements' := LinkcheckertransformerRewriteElements,
          'linkcheckertransformer_stripExtensionPathBlacklist' := LinkcheckertransformerStripExtensionPathBlacklist
        }) ->
    #{ 'linkcheckertransformer.disableRewriting' => LinkcheckertransformerDisableRewriting,
       'linkcheckertransformer.disableChecking' => LinkcheckertransformerDisableChecking,
       'linkcheckertransformer.mapCacheSize' => LinkcheckertransformerMapCacheSize,
       'linkcheckertransformer.strictExtensionCheck' => LinkcheckertransformerStrictExtensionCheck,
       'linkcheckertransformer.stripHtmltExtension' => LinkcheckertransformerStripHtmltExtension,
       'linkcheckertransformer.rewriteElements' => LinkcheckertransformerRewriteElements,
       'linkcheckertransformer.stripExtensionPathBlacklist' => LinkcheckertransformerStripExtensionPathBlacklist
     }.
