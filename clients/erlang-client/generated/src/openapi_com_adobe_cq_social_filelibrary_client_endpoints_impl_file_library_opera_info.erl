-module(openapi_com_adobe_cq_social_filelibrary_client_endpoints_impl_file_library_opera_info).

-export([encode/1]).

-export_type([openapi_com_adobe_cq_social_filelibrary_client_endpoints_impl_file_library_opera_info/0]).

-type openapi_com_adobe_cq_social_filelibrary_client_endpoints_impl_file_library_opera_info() ::
    #{ 'pid' => binary(),
       'title' => binary(),
       'description' => binary(),
       'properties' => openapi_com_adobe_cq_social_filelibrary_client_endpoints_impl_file_library_opera_properties:openapi_com_adobe_cq_social_filelibrary_client_endpoints_impl_file_library_opera_properties()
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
