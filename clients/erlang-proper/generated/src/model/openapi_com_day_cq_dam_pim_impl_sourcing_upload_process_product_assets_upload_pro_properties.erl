-module(openapi_com_day_cq_dam_pim_impl_sourcing_upload_process_product_assets_upload_pro_properties).

-include("openapi.hrl").

-export([openapi_com_day_cq_dam_pim_impl_sourcing_upload_process_product_assets_upload_pro_properties/0]).

-export([openapi_com_day_cq_dam_pim_impl_sourcing_upload_process_product_assets_upload_pro_properties/1]).

-export_type([openapi_com_day_cq_dam_pim_impl_sourcing_upload_process_product_assets_upload_pro_properties/0]).

-type openapi_com_day_cq_dam_pim_impl_sourcing_upload_process_product_assets_upload_pro_properties() ::
  [ {'delete_zip_file', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
  ].


openapi_com_day_cq_dam_pim_impl_sourcing_upload_process_product_assets_upload_pro_properties() ->
    openapi_com_day_cq_dam_pim_impl_sourcing_upload_process_product_assets_upload_pro_properties([]).

openapi_com_day_cq_dam_pim_impl_sourcing_upload_process_product_assets_upload_pro_properties(Fields) ->
  Default = [ {'delete.zip.file', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

