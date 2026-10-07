-module(openapi_com_adobe_cq_commerce_pim_impl_cataloggenerator_catalog_generator_impl_properties).

-include("openapi.hrl").

-export([openapi_com_adobe_cq_commerce_pim_impl_cataloggenerator_catalog_generator_impl_properties/0]).

-export([openapi_com_adobe_cq_commerce_pim_impl_cataloggenerator_catalog_generator_impl_properties/1]).

-export_type([openapi_com_adobe_cq_commerce_pim_impl_cataloggenerator_catalog_generator_impl_properties/0]).

-type openapi_com_adobe_cq_commerce_pim_impl_cataloggenerator_catalog_generator_impl_properties() ::
  [ {'cq_commerce_cataloggenerator_bucketsize', openapi_config_node_property_integer:openapi_config_node_property_integer() }
  | {'cq_commerce_cataloggenerator_bucketname', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'cq_commerce_cataloggenerator_excludedtemplateproperties', openapi_config_node_property_array:openapi_config_node_property_array() }
  ].


openapi_com_adobe_cq_commerce_pim_impl_cataloggenerator_catalog_generator_impl_properties() ->
    openapi_com_adobe_cq_commerce_pim_impl_cataloggenerator_catalog_generator_impl_properties([]).

openapi_com_adobe_cq_commerce_pim_impl_cataloggenerator_catalog_generator_impl_properties(Fields) ->
  Default = [ {'cq.commerce.cataloggenerator.bucketsize', openapi_config_node_property_integer:openapi_config_node_property_integer() }
            , {'cq.commerce.cataloggenerator.bucketname', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'cq.commerce.cataloggenerator.excludedtemplateproperties', openapi_config_node_property_array:openapi_config_node_property_array() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

