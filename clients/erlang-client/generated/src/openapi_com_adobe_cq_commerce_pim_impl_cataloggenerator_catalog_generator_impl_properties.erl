-module(openapi_com_adobe_cq_commerce_pim_impl_cataloggenerator_catalog_generator_impl_properties).

-export([encode/1]).

-export_type([openapi_com_adobe_cq_commerce_pim_impl_cataloggenerator_catalog_generator_impl_properties/0]).

-type openapi_com_adobe_cq_commerce_pim_impl_cataloggenerator_catalog_generator_impl_properties() ::
    #{ 'cq_commerce_cataloggenerator_bucketsize' => openapi_config_node_property_integer:openapi_config_node_property_integer(),
       'cq_commerce_cataloggenerator_bucketname' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'cq_commerce_cataloggenerator_excludedtemplateproperties' => openapi_config_node_property_array:openapi_config_node_property_array()
     }.

encode(#{ 'cq_commerce_cataloggenerator_bucketsize' := CqCommerceCataloggeneratorBucketsize,
          'cq_commerce_cataloggenerator_bucketname' := CqCommerceCataloggeneratorBucketname,
          'cq_commerce_cataloggenerator_excludedtemplateproperties' := CqCommerceCataloggeneratorExcludedtemplateproperties
        }) ->
    #{ 'cq.commerce.cataloggenerator.bucketsize' => CqCommerceCataloggeneratorBucketsize,
       'cq.commerce.cataloggenerator.bucketname' => CqCommerceCataloggeneratorBucketname,
       'cq.commerce.cataloggenerator.excludedtemplateproperties' => CqCommerceCataloggeneratorExcludedtemplateproperties
     }.
