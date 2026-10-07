-module(openapi_com_day_cq_dam_pim_impl_sourcing_upload_process_product_assets_upload_pro_properties).

-export([encode/1]).

-export_type([openapi_com_day_cq_dam_pim_impl_sourcing_upload_process_product_assets_upload_pro_properties/0]).

-type openapi_com_day_cq_dam_pim_impl_sourcing_upload_process_product_assets_upload_pro_properties() ::
    #{ 'delete_zip_file' => openapi_config_node_property_boolean:openapi_config_node_property_boolean()
     }.

encode(#{ 'delete_zip_file' := DeleteZipFile
        }) ->
    #{ 'delete.zip.file' => DeleteZipFile
     }.
