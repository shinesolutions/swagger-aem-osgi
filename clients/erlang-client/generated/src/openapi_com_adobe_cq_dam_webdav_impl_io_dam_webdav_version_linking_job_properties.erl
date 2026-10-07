-module(openapi_com_adobe_cq_dam_webdav_impl_io_dam_webdav_version_linking_job_properties).

-export([encode/1]).

-export_type([openapi_com_adobe_cq_dam_webdav_impl_io_dam_webdav_version_linking_job_properties/0]).

-type openapi_com_adobe_cq_dam_webdav_impl_io_dam_webdav_version_linking_job_properties() ::
    #{ 'cq_dam_webdav_version_linking_enable' => openapi_config_node_property_boolean:openapi_config_node_property_boolean(),
       'cq_dam_webdav_version_linking_scheduler_period' => openapi_config_node_property_integer:openapi_config_node_property_integer(),
       'cq_dam_webdav_version_linking_staging_timeout' => openapi_config_node_property_integer:openapi_config_node_property_integer()
     }.

encode(#{ 'cq_dam_webdav_version_linking_enable' := CqDamWebdavVersionLinkingEnable,
          'cq_dam_webdav_version_linking_scheduler_period' := CqDamWebdavVersionLinkingSchedulerPeriod,
          'cq_dam_webdav_version_linking_staging_timeout' := CqDamWebdavVersionLinkingStagingTimeout
        }) ->
    #{ 'cq.dam.webdav.version.linking.enable' => CqDamWebdavVersionLinkingEnable,
       'cq.dam.webdav.version.linking.scheduler.period' => CqDamWebdavVersionLinkingSchedulerPeriod,
       'cq.dam.webdav.version.linking.staging.timeout' => CqDamWebdavVersionLinkingStagingTimeout
     }.
