-module(openapi_com_day_cq_replication_impl_content_durbo_durbo_import_configuration_prov_info).

-export([encode/1]).

-export_type([openapi_com_day_cq_replication_impl_content_durbo_durbo_import_configuration_prov_info/0]).

-type openapi_com_day_cq_replication_impl_content_durbo_durbo_import_configuration_prov_info() ::
    #{ 'pid' => binary(),
       'title' => binary(),
       'description' => binary(),
       'properties' => openapi_com_day_cq_replication_impl_content_durbo_durbo_import_configuration_prov_properties:openapi_com_day_cq_replication_impl_content_durbo_durbo_import_configuration_prov_properties()
     }.

encode(#{ 'pid' := Pid,
          'title' := Title,
          'description' := Description,
          'properties' := Properties
        }) ->
    #{ 'pid' => Pid,
       'title' => Title,
       'description' => Description,
       'properties' => Properties
     }.
