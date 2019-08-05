-module(openapi_com_day_cq_polling_importer_impl_managed_polling_importer_impl_properties).

-export([encode/1]).

-export_type([openapi_com_day_cq_polling_importer_impl_managed_polling_importer_impl_properties/0]).

-type openapi_com_day_cq_polling_importer_impl_managed_polling_importer_impl_properties() ::
    #{ 'importer_user' => openapi_config_node_property_string:openapi_config_node_property_string()
     }.

encode(#{ 'importer_user' := ImporterUser
        }) ->
    #{ 'importer.user' => ImporterUser
     }.
