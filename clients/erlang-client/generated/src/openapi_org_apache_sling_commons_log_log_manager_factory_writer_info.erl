-module(openapi_org_apache_sling_commons_log_log_manager_factory_writer_info).

-export([encode/1]).

-export_type([openapi_org_apache_sling_commons_log_log_manager_factory_writer_info/0]).

-type openapi_org_apache_sling_commons_log_log_manager_factory_writer_info() ::
    #{ 'pid' => binary(),
       'title' => binary(),
       'description' => binary(),
       'properties' => openapi_org_apache_sling_commons_log_log_manager_factory_writer_properties:openapi_org_apache_sling_commons_log_log_manager_factory_writer_properties()
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
