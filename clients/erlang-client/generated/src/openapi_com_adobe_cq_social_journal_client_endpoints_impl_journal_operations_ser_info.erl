-module(openapi_com_adobe_cq_social_journal_client_endpoints_impl_journal_operations_ser_info).

-export([encode/1]).

-export_type([openapi_com_adobe_cq_social_journal_client_endpoints_impl_journal_operations_ser_info/0]).

-type openapi_com_adobe_cq_social_journal_client_endpoints_impl_journal_operations_ser_info() ::
    #{ 'pid' => binary(),
       'title' => binary(),
       'description' => binary(),
       'properties' => openapi_com_adobe_cq_social_journal_client_endpoints_impl_journal_operations_ser_properties:openapi_com_adobe_cq_social_journal_client_endpoints_impl_journal_operations_ser_properties()
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
