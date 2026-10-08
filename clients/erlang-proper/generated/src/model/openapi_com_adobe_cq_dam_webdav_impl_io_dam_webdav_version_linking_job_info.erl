-module(openapi_com_adobe_cq_dam_webdav_impl_io_dam_webdav_version_linking_job_info).

-include("openapi.hrl").

-export([openapi_com_adobe_cq_dam_webdav_impl_io_dam_webdav_version_linking_job_info/0]).

-export([openapi_com_adobe_cq_dam_webdav_impl_io_dam_webdav_version_linking_job_info/1]).

-export_type([openapi_com_adobe_cq_dam_webdav_impl_io_dam_webdav_version_linking_job_info/0]).

-type openapi_com_adobe_cq_dam_webdav_impl_io_dam_webdav_version_linking_job_info() ::
  [ {'pid', binary() }
  | {'title', binary() }
  | {'description', binary() }
  | {'properties', openapi_com_adobe_cq_dam_webdav_impl_io_dam_webdav_version_linking_job_properties:openapi_com_adobe_cq_dam_webdav_impl_io_dam_webdav_version_linking_job_properties() }
  ].


openapi_com_adobe_cq_dam_webdav_impl_io_dam_webdav_version_linking_job_info() ->
    openapi_com_adobe_cq_dam_webdav_impl_io_dam_webdav_version_linking_job_info([]).

openapi_com_adobe_cq_dam_webdav_impl_io_dam_webdav_version_linking_job_info(Fields) ->
  Default = [ {'pid', binary() }
            , {'title', binary() }
            , {'description', binary() }
            , {'properties', openapi_com_adobe_cq_dam_webdav_impl_io_dam_webdav_version_linking_job_properties:openapi_com_adobe_cq_dam_webdav_impl_io_dam_webdav_version_linking_job_properties() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

