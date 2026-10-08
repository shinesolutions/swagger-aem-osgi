# frozen_string_literal: true

module OpenapiClient
  class Client
    attr_reader :configuration, :connection

    def initialize(base_url: nil, **options, &block)
      @configuration = Configuration.new(base_url: base_url, **options, &block)
      @connection = Connection.new(@configuration)
    end

    def adaptive_form_and_interactive_communication_web_channel_configuration
      @adaptive_form_and_interactive_communication_web_channel_configuration ||= OpenapiClient::Api::Adaptive Form and Interactive Communication Web Channel Configuration.new(@connection)
    end

    def adaptive_form_and_interactive_communication_web_channel_theme_configuration
      @adaptive_form_and_interactive_communication_web_channel_theme_configuration ||= OpenapiClient::Api::Adaptive Form and Interactive Communication Web Channel Theme Configuration.new(@connection)
    end

    def analytics_component_query_cache_service
      @analytics_component_query_cache_service ||= OpenapiClient::Api::Analytics Component Query Cache Service.new(@connection)
    end

    def apache_sling_health_check_result_html_serializer
      @apache_sling_health_check_result_html_serializer ||= OpenapiClient::Api::Apache Sling Health Check Result HTML Serializer.new(@connection)
    end

    def guide_localization_service
      @guide_localization_service ||= OpenapiClient::Api::Guide Localization Service.new(@connection)
    end

    def messaging_user_component_factory
      @messaging_user_component_factory ||= OpenapiClient::Api::MessagingUserComponentFactory.new(@connection)
    end

    def com_adobe_aem_formsndocuments_config_aem_forms_manager_configuration
      @com_adobe_aem_formsndocuments_config_aem_forms_manager_configuration ||= OpenapiClient::Api::ComAdobeAemFormsndocumentsConfigAEMFormsManagerConfiguration.new(@connection)
    end

    def com_adobe_aem_transaction_core_impl_transaction_recorder
      @com_adobe_aem_transaction_core_impl_transaction_recorder ||= OpenapiClient::Api::ComAdobeAemTransactionCoreImplTransactionRecorder.new(@connection)
    end

    def com_adobe_aem_upgrade_prechecks_hc_impl_deprecate_indexes_hc
      @com_adobe_aem_upgrade_prechecks_hc_impl_deprecate_indexes_hc ||= OpenapiClient::Api::ComAdobeAemUpgradePrechecksHcImplDeprecateIndexesHC.new(@connection)
    end

    def com_adobe_aem_upgrade_prechecks_hc_impl_replication_agents_disabled_hc
      @com_adobe_aem_upgrade_prechecks_hc_impl_replication_agents_disabled_hc ||= OpenapiClient::Api::ComAdobeAemUpgradePrechecksHcImplReplicationAgentsDisabledHC.new(@connection)
    end

    def com_adobe_aem_upgrade_prechecks_mbean_impl_pre_upgrade_tasks_m_bean_impl
      @com_adobe_aem_upgrade_prechecks_mbean_impl_pre_upgrade_tasks_m_bean_impl ||= OpenapiClient::Api::ComAdobeAemUpgradePrechecksMbeanImplPreUpgradeTasksMBeanImpl.new(@connection)
    end

    def com_adobe_aem_upgrade_prechecks_tasks_impl_consistency_check_task_impl
      @com_adobe_aem_upgrade_prechecks_tasks_impl_consistency_check_task_impl ||= OpenapiClient::Api::ComAdobeAemUpgradePrechecksTasksImplConsistencyCheckTaskImpl.new(@connection)
    end

    def com_adobe_cq_account_api_account_management_service
      @com_adobe_cq_account_api_account_management_service ||= OpenapiClient::Api::ComAdobeCqAccountApiAccountManagementService.new(@connection)
    end

    def com_adobe_cq_account_impl_account_management_servlet
      @com_adobe_cq_account_impl_account_management_servlet ||= OpenapiClient::Api::ComAdobeCqAccountImplAccountManagementServlet.new(@connection)
    end

    def com_adobe_cq_address_impl_location_location_list_servlet
      @com_adobe_cq_address_impl_location_location_list_servlet ||= OpenapiClient::Api::ComAdobeCqAddressImplLocationLocationListServlet.new(@connection)
    end

    def com_adobe_cq_audit_purge_dam
      @com_adobe_cq_audit_purge_dam ||= OpenapiClient::Api::ComAdobeCqAuditPurgeDam.new(@connection)
    end

    def com_adobe_cq_audit_purge_pages
      @com_adobe_cq_audit_purge_pages ||= OpenapiClient::Api::ComAdobeCqAuditPurgePages.new(@connection)
    end

    def com_adobe_cq_audit_purge_replication
      @com_adobe_cq_audit_purge_replication ||= OpenapiClient::Api::ComAdobeCqAuditPurgeReplication.new(@connection)
    end

    def com_adobe_cq_cdn_rewriter_impl_aws_cloud_front_rewriter
      @com_adobe_cq_cdn_rewriter_impl_aws_cloud_front_rewriter ||= OpenapiClient::Api::ComAdobeCqCdnRewriterImplAWSCloudFrontRewriter.new(@connection)
    end

    def com_adobe_cq_cdn_rewriter_impl_cdn_config_service_impl
      @com_adobe_cq_cdn_rewriter_impl_cdn_config_service_impl ||= OpenapiClient::Api::ComAdobeCqCdnRewriterImplCDNConfigServiceImpl.new(@connection)
    end

    def com_adobe_cq_cdn_rewriter_impl_cdn_rewriter
      @com_adobe_cq_cdn_rewriter_impl_cdn_rewriter ||= OpenapiClient::Api::ComAdobeCqCdnRewriterImplCDNRewriter.new(@connection)
    end

    def com_adobe_cq_cloudconfig_core_impl_configuration_replication_event_handler
      @com_adobe_cq_cloudconfig_core_impl_configuration_replication_event_handler ||= OpenapiClient::Api::ComAdobeCqCloudconfigCoreImplConfigurationReplicationEventHandler.new(@connection)
    end

    def com_adobe_cq_commerce_impl_asset_dynamic_image_handler
      @com_adobe_cq_commerce_impl_asset_dynamic_image_handler ||= OpenapiClient::Api::ComAdobeCqCommerceImplAssetDynamicImageHandler.new(@connection)
    end

    def com_adobe_cq_commerce_impl_asset_product_asset_handler_provider_impl
      @com_adobe_cq_commerce_impl_asset_product_asset_handler_provider_impl ||= OpenapiClient::Api::ComAdobeCqCommerceImplAssetProductAssetHandlerProviderImpl.new(@connection)
    end

    def com_adobe_cq_commerce_impl_asset_static_image_handler
      @com_adobe_cq_commerce_impl_asset_static_image_handler ||= OpenapiClient::Api::ComAdobeCqCommerceImplAssetStaticImageHandler.new(@connection)
    end

    def com_adobe_cq_commerce_impl_asset_video_handler
      @com_adobe_cq_commerce_impl_asset_video_handler ||= OpenapiClient::Api::ComAdobeCqCommerceImplAssetVideoHandler.new(@connection)
    end

    def com_adobe_cq_commerce_impl_promotion_promotion_manager_impl
      @com_adobe_cq_commerce_impl_promotion_promotion_manager_impl ||= OpenapiClient::Api::ComAdobeCqCommerceImplPromotionPromotionManagerImpl.new(@connection)
    end

    def com_adobe_cq_commerce_pim_impl_page_event_listener
      @com_adobe_cq_commerce_pim_impl_page_event_listener ||= OpenapiClient::Api::ComAdobeCqCommercePimImplPageEventListener.new(@connection)
    end

    def com_adobe_cq_commerce_pim_impl_cataloggenerator_catalog_generator_impl
      @com_adobe_cq_commerce_pim_impl_cataloggenerator_catalog_generator_impl ||= OpenapiClient::Api::ComAdobeCqCommercePimImplCataloggeneratorCatalogGeneratorImpl.new(@connection)
    end

    def com_adobe_cq_commerce_pim_impl_productfeed_product_feed_service_impl
      @com_adobe_cq_commerce_pim_impl_productfeed_product_feed_service_impl ||= OpenapiClient::Api::ComAdobeCqCommercePimImplProductfeedProductFeedServiceImpl.new(@connection)
    end

    def com_adobe_cq_contentinsight_impl_reporting_services_settings_provider
      @com_adobe_cq_contentinsight_impl_reporting_services_settings_provider ||= OpenapiClient::Api::ComAdobeCqContentinsightImplReportingServicesSettingsProvider.new(@connection)
    end

    def com_adobe_cq_contentinsight_impl_servlets_bright_edge_proxy_servlet
      @com_adobe_cq_contentinsight_impl_servlets_bright_edge_proxy_servlet ||= OpenapiClient::Api::ComAdobeCqContentinsightImplServletsBrightEdgeProxyServlet.new(@connection)
    end

    def com_adobe_cq_contentinsight_impl_servlets_reporting_services_proxy_servlet
      @com_adobe_cq_contentinsight_impl_servlets_reporting_services_proxy_servlet ||= OpenapiClient::Api::ComAdobeCqContentinsightImplServletsReportingServicesProxyServlet.new(@connection)
    end

    def com_adobe_cq_dam_cfm_impl_component_component_config_impl
      @com_adobe_cq_dam_cfm_impl_component_component_config_impl ||= OpenapiClient::Api::ComAdobeCqDamCfmImplComponentComponentConfigImpl.new(@connection)
    end

    def com_adobe_cq_dam_cfm_impl_conf_feature_config_impl
      @com_adobe_cq_dam_cfm_impl_conf_feature_config_impl ||= OpenapiClient::Api::ComAdobeCqDamCfmImplConfFeatureConfigImpl.new(@connection)
    end

    def com_adobe_cq_dam_cfm_impl_content_rewriter_asset_processor
      @com_adobe_cq_dam_cfm_impl_content_rewriter_asset_processor ||= OpenapiClient::Api::ComAdobeCqDamCfmImplContentRewriterAssetProcessor.new(@connection)
    end

    def com_adobe_cq_dam_cfm_impl_content_rewriter_par_range_filter
      @com_adobe_cq_dam_cfm_impl_content_rewriter_par_range_filter ||= OpenapiClient::Api::ComAdobeCqDamCfmImplContentRewriterParRangeFilter.new(@connection)
    end

    def com_adobe_cq_dam_cfm_impl_content_rewriter_payload_filter
      @com_adobe_cq_dam_cfm_impl_content_rewriter_payload_filter ||= OpenapiClient::Api::ComAdobeCqDamCfmImplContentRewriterPayloadFilter.new(@connection)
    end

    def com_adobe_cq_dam_dm_process_image_p_tiff_manager_impl
      @com_adobe_cq_dam_dm_process_image_p_tiff_manager_impl ||= OpenapiClient::Api::ComAdobeCqDamDmProcessImagePTiffManagerImpl.new(@connection)
    end

    def com_adobe_cq_dam_ips_impl_replication_trigger_replicate_on_modify_worker
      @com_adobe_cq_dam_ips_impl_replication_trigger_replicate_on_modify_worker ||= OpenapiClient::Api::ComAdobeCqDamIpsImplReplicationTriggerReplicateOnModifyWorker.new(@connection)
    end

    def com_adobe_cq_dam_mac_sync_helper_impl_mac_sync_client_impl
      @com_adobe_cq_dam_mac_sync_helper_impl_mac_sync_client_impl ||= OpenapiClient::Api::ComAdobeCqDamMacSyncHelperImplMACSyncClientImpl.new(@connection)
    end

    def com_adobe_cq_dam_mac_sync_impl_dam_sync_service_impl
      @com_adobe_cq_dam_mac_sync_impl_dam_sync_service_impl ||= OpenapiClient::Api::ComAdobeCqDamMacSyncImplDAMSyncServiceImpl.new(@connection)
    end

    def com_adobe_cq_dam_processor_nui_impl_nui_asset_processor
      @com_adobe_cq_dam_processor_nui_impl_nui_asset_processor ||= OpenapiClient::Api::ComAdobeCqDamProcessorNuiImplNuiAssetProcessor.new(@connection)
    end

    def com_adobe_cq_dam_s7imaging_impl_is_image_server_component
      @com_adobe_cq_dam_s7imaging_impl_is_image_server_component ||= OpenapiClient::Api::ComAdobeCqDamS7imagingImplIsImageServerComponent.new(@connection)
    end

    def com_adobe_cq_dam_s7imaging_impl_ps_platform_server_servlet
      @com_adobe_cq_dam_s7imaging_impl_ps_platform_server_servlet ||= OpenapiClient::Api::ComAdobeCqDamS7imagingImplPsPlatformServerServlet.new(@connection)
    end

    def com_adobe_cq_dam_webdav_impl_io_asset_io_handler
      @com_adobe_cq_dam_webdav_impl_io_asset_io_handler ||= OpenapiClient::Api::ComAdobeCqDamWebdavImplIoAssetIOHandler.new(@connection)
    end

    def com_adobe_cq_dam_webdav_impl_io_dam_webdav_version_linking_job
      @com_adobe_cq_dam_webdav_impl_io_dam_webdav_version_linking_job ||= OpenapiClient::Api::ComAdobeCqDamWebdavImplIoDamWebdavVersionLinkingJob.new(@connection)
    end

    def com_adobe_cq_dam_webdav_impl_io_special_files_handler
      @com_adobe_cq_dam_webdav_impl_io_special_files_handler ||= OpenapiClient::Api::ComAdobeCqDamWebdavImplIoSpecialFilesHandler.new(@connection)
    end

    def com_adobe_cq_deserfw_impl_deserialization_firewall_impl
      @com_adobe_cq_deserfw_impl_deserialization_firewall_impl ||= OpenapiClient::Api::ComAdobeCqDeserfwImplDeserializationFirewallImpl.new(@connection)
    end

    def com_adobe_cq_dtm_impl_service_dtm_web_service_impl
      @com_adobe_cq_dtm_impl_service_dtm_web_service_impl ||= OpenapiClient::Api::ComAdobeCqDtmImplServiceDTMWebServiceImpl.new(@connection)
    end

    def com_adobe_cq_dtm_impl_servlets_dtm_deploy_hook_servlet
      @com_adobe_cq_dtm_impl_servlets_dtm_deploy_hook_servlet ||= OpenapiClient::Api::ComAdobeCqDtmImplServletsDTMDeployHookServlet.new(@connection)
    end

    def com_adobe_cq_dtm_reactor_impl_service_web_service_impl
      @com_adobe_cq_dtm_reactor_impl_service_web_service_impl ||= OpenapiClient::Api::ComAdobeCqDtmReactorImplServiceWebServiceImpl.new(@connection)
    end

    def com_adobe_cq_experiencelog_impl_experience_log_config_servlet
      @com_adobe_cq_experiencelog_impl_experience_log_config_servlet ||= OpenapiClient::Api::ComAdobeCqExperiencelogImplExperienceLogConfigServlet.new(@connection)
    end

    def com_adobe_cq_hc_content_packages_health_check
      @com_adobe_cq_hc_content_packages_health_check ||= OpenapiClient::Api::ComAdobeCqHcContentPackagesHealthCheck.new(@connection)
    end

    def com_adobe_cq_history_impl_history_request_filter
      @com_adobe_cq_history_impl_history_request_filter ||= OpenapiClient::Api::ComAdobeCqHistoryImplHistoryRequestFilter.new(@connection)
    end

    def com_adobe_cq_history_impl_history_service_impl
      @com_adobe_cq_history_impl_history_service_impl ||= OpenapiClient::Api::ComAdobeCqHistoryImplHistoryServiceImpl.new(@connection)
    end

    def com_adobe_cq_inbox_impl_typeprovider_item_type_provider
      @com_adobe_cq_inbox_impl_typeprovider_item_type_provider ||= OpenapiClient::Api::ComAdobeCqInboxImplTypeproviderItemTypeProvider.new(@connection)
    end

    def com_adobe_cq_projects_impl_servlet_project_image_servlet
      @com_adobe_cq_projects_impl_servlet_project_image_servlet ||= OpenapiClient::Api::ComAdobeCqProjectsImplServletProjectImageServlet.new(@connection)
    end

    def com_adobe_cq_projects_purge_scheduler
      @com_adobe_cq_projects_purge_scheduler ||= OpenapiClient::Api::ComAdobeCqProjectsPurgeScheduler.new(@connection)
    end

    def com_adobe_cq_scheduled_exporter_impl_scheduled_exporter_impl
      @com_adobe_cq_scheduled_exporter_impl_scheduled_exporter_impl ||= OpenapiClient::Api::ComAdobeCqScheduledExporterImplScheduledExporterImpl.new(@connection)
    end

    def com_adobe_cq_screens_analytics_impl_screens_analytics_service_impl
      @com_adobe_cq_screens_analytics_impl_screens_analytics_service_impl ||= OpenapiClient::Api::ComAdobeCqScreensAnalyticsImplScreensAnalyticsServiceImpl.new(@connection)
    end

    def com_adobe_cq_screens_device_impl_device_service
      @com_adobe_cq_screens_device_impl_device_service ||= OpenapiClient::Api::ComAdobeCqScreensDeviceImplDeviceService.new(@connection)
    end

    def com_adobe_cq_screens_device_registration_impl_registration_service_impl
      @com_adobe_cq_screens_device_registration_impl_registration_service_impl ||= OpenapiClient::Api::ComAdobeCqScreensDeviceRegistrationImplRegistrationServiceImpl.new(@connection)
    end

    def com_adobe_cq_screens_impl_screens_channel_post_processor
      @com_adobe_cq_screens_impl_screens_channel_post_processor ||= OpenapiClient::Api::ComAdobeCqScreensImplScreensChannelPostProcessor.new(@connection)
    end

    def com_adobe_cq_screens_impl_handler_channels_update_handler
      @com_adobe_cq_screens_impl_handler_channels_update_handler ||= OpenapiClient::Api::ComAdobeCqScreensImplHandlerChannelsUpdateHandler.new(@connection)
    end

    def com_adobe_cq_screens_impl_jobs_distributed_devices_stati_update_job
      @com_adobe_cq_screens_impl_jobs_distributed_devices_stati_update_job ||= OpenapiClient::Api::ComAdobeCqScreensImplJobsDistributedDevicesStatiUpdateJob.new(@connection)
    end

    def com_adobe_cq_screens_impl_remote_impl_distributed_http_client_impl
      @com_adobe_cq_screens_impl_remote_impl_distributed_http_client_impl ||= OpenapiClient::Api::ComAdobeCqScreensImplRemoteImplDistributedHttpClientImpl.new(@connection)
    end

    def com_adobe_cq_screens_monitoring_impl_screens_monitoring_service_impl
      @com_adobe_cq_screens_monitoring_impl_screens_monitoring_service_impl ||= OpenapiClient::Api::ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImpl.new(@connection)
    end

    def com_adobe_cq_screens_mq_activemq_impl_artemis_jms_provider
      @com_adobe_cq_screens_mq_activemq_impl_artemis_jms_provider ||= OpenapiClient::Api::ComAdobeCqScreensMqActivemqImplArtemisJMSProvider.new(@connection)
    end

    def com_adobe_cq_screens_offlinecontent_impl_bulk_offline_update_service_impl
      @com_adobe_cq_screens_offlinecontent_impl_bulk_offline_update_service_impl ||= OpenapiClient::Api::ComAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImpl.new(@connection)
    end

    def com_adobe_cq_screens_offlinecontent_impl_offline_content_service_impl
      @com_adobe_cq_screens_offlinecontent_impl_offline_content_service_impl ||= OpenapiClient::Api::ComAdobeCqScreensOfflinecontentImplOfflineContentServiceImpl.new(@connection)
    end

    def com_adobe_cq_screens_segmentation_impl_segmentation_feature_flag
      @com_adobe_cq_screens_segmentation_impl_segmentation_feature_flag ||= OpenapiClient::Api::ComAdobeCqScreensSegmentationImplSegmentationFeatureFlag.new(@connection)
    end

    def com_adobe_cq_security_hc_bundles_impl_html_library_manager_config_health_check
      @com_adobe_cq_security_hc_bundles_impl_html_library_manager_config_health_check ||= OpenapiClient::Api::ComAdobeCqSecurityHcBundlesImplHtmlLibraryManagerConfigHealthCheck.new(@connection)
    end

    def com_adobe_cq_security_hc_bundles_impl_wcm_filter_health_check
      @com_adobe_cq_security_hc_bundles_impl_wcm_filter_health_check ||= OpenapiClient::Api::ComAdobeCqSecurityHcBundlesImplWcmFilterHealthCheck.new(@connection)
    end

    def com_adobe_cq_security_hc_dispatcher_impl_dispatcher_access_health_check
      @com_adobe_cq_security_hc_dispatcher_impl_dispatcher_access_health_check ||= OpenapiClient::Api::ComAdobeCqSecurityHcDispatcherImplDispatcherAccessHealthCheck.new(@connection)
    end

    def com_adobe_cq_security_hc_packages_impl_example_content_health_check
      @com_adobe_cq_security_hc_packages_impl_example_content_health_check ||= OpenapiClient::Api::ComAdobeCqSecurityHcPackagesImplExampleContentHealthCheck.new(@connection)
    end

    def com_adobe_cq_security_hc_webserver_impl_clickjacking_health_check
      @com_adobe_cq_security_hc_webserver_impl_clickjacking_health_check ||= OpenapiClient::Api::ComAdobeCqSecurityHcWebserverImplClickjackingHealthCheck.new(@connection)
    end

    def com_adobe_cq_social_accountverification_impl_account_management_config_impl
      @com_adobe_cq_social_accountverification_impl_account_management_config_impl ||= OpenapiClient::Api::ComAdobeCqSocialAccountverificationImplAccountManagementConfigImpl.new(@connection)
    end

    def com_adobe_cq_social_activitystreams_client_impl_social_activity_component_factory_impl
      @com_adobe_cq_social_activitystreams_client_impl_social_activity_component_factory_impl ||= OpenapiClient::Api::ComAdobeCqSocialActivitystreamsClientImplSocialActivityComponentFactoryImpl.new(@connection)
    end

    def com_adobe_cq_social_activitystreams_client_impl_social_activity_stream_component_factory
      @com_adobe_cq_social_activitystreams_client_impl_social_activity_stream_component_factory ||= OpenapiClient::Api::ComAdobeCqSocialActivitystreamsClientImplSocialActivityStreamComponentFactory.new(@connection)
    end

    def com_adobe_cq_social_activitystreams_listener_impl_event_listener_handler
      @com_adobe_cq_social_activitystreams_listener_impl_event_listener_handler ||= OpenapiClient::Api::ComAdobeCqSocialActivitystreamsListenerImplEventListenerHandler.new(@connection)
    end

    def com_adobe_cq_social_activitystreams_listener_impl_moderation_event_extension
      @com_adobe_cq_social_activitystreams_listener_impl_moderation_event_extension ||= OpenapiClient::Api::ComAdobeCqSocialActivitystreamsListenerImplModerationEventExtension.new(@connection)
    end

    def com_adobe_cq_social_activitystreams_listener_impl_rating_event_activity_suppressor
      @com_adobe_cq_social_activitystreams_listener_impl_rating_event_activity_suppressor ||= OpenapiClient::Api::ComAdobeCqSocialActivitystreamsListenerImplRatingEventActivitySuppressor.new(@connection)
    end

    def com_adobe_cq_social_activitystreams_listener_impl_resource_activity_stream_provider_factory
      @com_adobe_cq_social_activitystreams_listener_impl_resource_activity_stream_provider_factory ||= OpenapiClient::Api::ComAdobeCqSocialActivitystreamsListenerImplResourceActivityStreamProviderFactory.new(@connection)
    end

    def com_adobe_cq_social_calendar_client_endpoints_impl_calendar_operations_impl
      @com_adobe_cq_social_calendar_client_endpoints_impl_calendar_operations_impl ||= OpenapiClient::Api::ComAdobeCqSocialCalendarClientEndpointsImplCalendarOperationsImpl.new(@connection)
    end

    def com_adobe_cq_social_calendar_client_operationextensions_event_attachment
      @com_adobe_cq_social_calendar_client_operationextensions_event_attachment ||= OpenapiClient::Api::ComAdobeCqSocialCalendarClientOperationextensionsEventAttachment.new(@connection)
    end

    def com_adobe_cq_social_calendar_servlets_time_zone_servlet
      @com_adobe_cq_social_calendar_servlets_time_zone_servlet ||= OpenapiClient::Api::ComAdobeCqSocialCalendarServletsTimeZoneServlet.new(@connection)
    end

    def com_adobe_cq_social_commons_comments_endpoints_impl_comment_delete_event_activity_suppressor
      @com_adobe_cq_social_commons_comments_endpoints_impl_comment_delete_event_activity_suppressor ||= OpenapiClient::Api::ComAdobeCqSocialCommonsCommentsEndpointsImplCommentDeleteEventActivitySuppressor.new(@connection)
    end

    def com_adobe_cq_social_commons_comments_endpoints_impl_comment_operation_service
      @com_adobe_cq_social_commons_comments_endpoints_impl_comment_operation_service ||= OpenapiClient::Api::ComAdobeCqSocialCommonsCommentsEndpointsImplCommentOperationService.new(@connection)
    end

    def com_adobe_cq_social_commons_comments_endpoints_impl_translation_operation_service
      @com_adobe_cq_social_commons_comments_endpoints_impl_translation_operation_service ||= OpenapiClient::Api::ComAdobeCqSocialCommonsCommentsEndpointsImplTranslationOperationService.new(@connection)
    end

    def com_adobe_cq_social_commons_comments_listing_impl_search_comment_social_component_list_provider
      @com_adobe_cq_social_commons_comments_listing_impl_search_comment_social_component_list_provider ||= OpenapiClient::Api::ComAdobeCqSocialCommonsCommentsListingImplSearchCommentSocialComponentListProvider.new(@connection)
    end

    def com_adobe_cq_social_commons_comments_scheduler_impl_search_scheduled_posts
      @com_adobe_cq_social_commons_comments_scheduler_impl_search_scheduled_posts ||= OpenapiClient::Api::ComAdobeCqSocialCommonsCommentsSchedulerImplSearchScheduledPosts.new(@connection)
    end

    def com_adobe_cq_social_commons_cors_cors_authentication_filter
      @com_adobe_cq_social_commons_cors_cors_authentication_filter ||= OpenapiClient::Api::ComAdobeCqSocialCommonsCorsCORSAuthenticationFilter.new(@connection)
    end

    def com_adobe_cq_social_commons_emailreply_impl_android_email_client_provider
      @com_adobe_cq_social_commons_emailreply_impl_android_email_client_provider ||= OpenapiClient::Api::ComAdobeCqSocialCommonsEmailreplyImplAndroidEmailClientProvider.new(@connection)
    end

    def com_adobe_cq_social_commons_emailreply_impl_comment_email_builder_impl
      @com_adobe_cq_social_commons_emailreply_impl_comment_email_builder_impl ||= OpenapiClient::Api::ComAdobeCqSocialCommonsEmailreplyImplCommentEmailBuilderImpl.new(@connection)
    end

    def com_adobe_cq_social_commons_emailreply_impl_comment_email_event_listener
      @com_adobe_cq_social_commons_emailreply_impl_comment_email_event_listener ||= OpenapiClient::Api::ComAdobeCqSocialCommonsEmailreplyImplCommentEmailEventListener.new(@connection)
    end

    def com_adobe_cq_social_commons_emailreply_impl_custom_email_client_provider
      @com_adobe_cq_social_commons_emailreply_impl_custom_email_client_provider ||= OpenapiClient::Api::ComAdobeCqSocialCommonsEmailreplyImplCustomEmailClientProvider.new(@connection)
    end

    def com_adobe_cq_social_commons_emailreply_impl_email_quoted_text_patterns_impl
      @com_adobe_cq_social_commons_emailreply_impl_email_quoted_text_patterns_impl ||= OpenapiClient::Api::ComAdobeCqSocialCommonsEmailreplyImplEmailQuotedTextPatternsImpl.new(@connection)
    end

    def com_adobe_cq_social_commons_emailreply_impl_email_reply_configuration_impl
      @com_adobe_cq_social_commons_emailreply_impl_email_reply_configuration_impl ||= OpenapiClient::Api::ComAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpl.new(@connection)
    end

    def com_adobe_cq_social_commons_emailreply_impl_email_reply_importer
      @com_adobe_cq_social_commons_emailreply_impl_email_reply_importer ||= OpenapiClient::Api::ComAdobeCqSocialCommonsEmailreplyImplEmailReplyImporter.new(@connection)
    end

    def com_adobe_cq_social_commons_emailreply_impl_gmail_email_client_provider
      @com_adobe_cq_social_commons_emailreply_impl_gmail_email_client_provider ||= OpenapiClient::Api::ComAdobeCqSocialCommonsEmailreplyImplGmailEmailClientProvider.new(@connection)
    end

    def com_adobe_cq_social_commons_emailreply_impl_ios_email_client_provider
      @com_adobe_cq_social_commons_emailreply_impl_ios_email_client_provider ||= OpenapiClient::Api::ComAdobeCqSocialCommonsEmailreplyImplIOSEmailClientProvider.new(@connection)
    end

    def com_adobe_cq_social_commons_emailreply_impl_macmail_email_client_provider
      @com_adobe_cq_social_commons_emailreply_impl_macmail_email_client_provider ||= OpenapiClient::Api::ComAdobeCqSocialCommonsEmailreplyImplMacmailEmailClientProvider.new(@connection)
    end

    def com_adobe_cq_social_commons_emailreply_impl_out_look_email_client_provider
      @com_adobe_cq_social_commons_emailreply_impl_out_look_email_client_provider ||= OpenapiClient::Api::ComAdobeCqSocialCommonsEmailreplyImplOutLookEmailClientProvider.new(@connection)
    end

    def com_adobe_cq_social_commons_emailreply_impl_unknown_email_client_provider
      @com_adobe_cq_social_commons_emailreply_impl_unknown_email_client_provider ||= OpenapiClient::Api::ComAdobeCqSocialCommonsEmailreplyImplUnknownEmailClientProvider.new(@connection)
    end

    def com_adobe_cq_social_commons_emailreply_impl_yahoo_email_client_provider
      @com_adobe_cq_social_commons_emailreply_impl_yahoo_email_client_provider ||= OpenapiClient::Api::ComAdobeCqSocialCommonsEmailreplyImplYahooEmailClientProvider.new(@connection)
    end

    def com_adobe_cq_social_commons_maintainance_impl_delete_temp_ugc_image_uploads
      @com_adobe_cq_social_commons_maintainance_impl_delete_temp_ugc_image_uploads ||= OpenapiClient::Api::ComAdobeCqSocialCommonsMaintainanceImplDeleteTempUGCImageUploads.new(@connection)
    end

    def com_adobe_cq_social_commons_ugclimiter_impl_ugc_limiter_service_impl
      @com_adobe_cq_social_commons_ugclimiter_impl_ugc_limiter_service_impl ||= OpenapiClient::Api::ComAdobeCqSocialCommonsUgclimiterImplUGCLimiterServiceImpl.new(@connection)
    end

    def com_adobe_cq_social_commons_ugclimitsconfig_impl_community_user_ugc_limits_config_impl
      @com_adobe_cq_social_commons_ugclimitsconfig_impl_community_user_ugc_limits_config_impl ||= OpenapiClient::Api::ComAdobeCqSocialCommonsUgclimitsconfigImplCommunityUserUGCLimitsConfigImpl.new(@connection)
    end

    def com_adobe_cq_social_connect_oauth_impl_facebook_provider_impl
      @com_adobe_cq_social_connect_oauth_impl_facebook_provider_impl ||= OpenapiClient::Api::ComAdobeCqSocialConnectOauthImplFacebookProviderImpl.new(@connection)
    end

    def com_adobe_cq_social_connect_oauth_impl_social_o_auth_authentication_handler
      @com_adobe_cq_social_connect_oauth_impl_social_o_auth_authentication_handler ||= OpenapiClient::Api::ComAdobeCqSocialConnectOauthImplSocialOAuthAuthenticationHandler.new(@connection)
    end

    def com_adobe_cq_social_connect_oauth_impl_social_o_auth_user_profile_mapper
      @com_adobe_cq_social_connect_oauth_impl_social_o_auth_user_profile_mapper ||= OpenapiClient::Api::ComAdobeCqSocialConnectOauthImplSocialOAuthUserProfileMapper.new(@connection)
    end

    def com_adobe_cq_social_connect_oauth_impl_twitter_provider_impl
      @com_adobe_cq_social_connect_oauth_impl_twitter_provider_impl ||= OpenapiClient::Api::ComAdobeCqSocialConnectOauthImplTwitterProviderImpl.new(@connection)
    end

    def com_adobe_cq_social_content_fragments_services_impl_communities_fragment_creation_service_impl
      @com_adobe_cq_social_content_fragments_services_impl_communities_fragment_creation_service_impl ||= OpenapiClient::Api::ComAdobeCqSocialContentFragmentsServicesImplCommunitiesFragmentCreationServiceImpl.new(@connection)
    end

    def com_adobe_cq_social_datastore_as_impl_as_resource_provider_factory
      @com_adobe_cq_social_datastore_as_impl_as_resource_provider_factory ||= OpenapiClient::Api::ComAdobeCqSocialDatastoreAsImplASResourceProviderFactory.new(@connection)
    end

    def com_adobe_cq_social_datastore_op_impl_social_ms_resource_provider_factory
      @com_adobe_cq_social_datastore_op_impl_social_ms_resource_provider_factory ||= OpenapiClient::Api::ComAdobeCqSocialDatastoreOpImplSocialMSResourceProviderFactory.new(@connection)
    end

    def com_adobe_cq_social_datastore_rdb_impl_social_rdb_resource_provider_factory
      @com_adobe_cq_social_datastore_rdb_impl_social_rdb_resource_provider_factory ||= OpenapiClient::Api::ComAdobeCqSocialDatastoreRdbImplSocialRDBResourceProviderFactory.new(@connection)
    end

    def com_adobe_cq_social_enablement_adaptors_enablement_learning_path_adaptor_factory
      @com_adobe_cq_social_enablement_adaptors_enablement_learning_path_adaptor_factory ||= OpenapiClient::Api::ComAdobeCqSocialEnablementAdaptorsEnablementLearningPathAdaptorFactory.new(@connection)
    end

    def com_adobe_cq_social_enablement_adaptors_enablement_resource_adaptor_factory
      @com_adobe_cq_social_enablement_adaptors_enablement_resource_adaptor_factory ||= OpenapiClient::Api::ComAdobeCqSocialEnablementAdaptorsEnablementResourceAdaptorFactory.new(@connection)
    end

    def com_adobe_cq_social_enablement_learningpath_endpoints_impl_enablement_learning_path_model_operation_service
      @com_adobe_cq_social_enablement_learningpath_endpoints_impl_enablement_learning_path_model_operation_service ||= OpenapiClient::Api::ComAdobeCqSocialEnablementLearningpathEndpointsImplEnablementLearningPathModelOperationService.new(@connection)
    end

    def com_adobe_cq_social_enablement_resource_endpoints_impl_enablement_resource_model_operation_service
      @com_adobe_cq_social_enablement_resource_endpoints_impl_enablement_resource_model_operation_service ||= OpenapiClient::Api::ComAdobeCqSocialEnablementResourceEndpointsImplEnablementResourceModelOperationService.new(@connection)
    end

    def com_adobe_cq_social_enablement_services_impl_author_marker_impl
      @com_adobe_cq_social_enablement_services_impl_author_marker_impl ||= OpenapiClient::Api::ComAdobeCqSocialEnablementServicesImplAuthorMarkerImpl.new(@connection)
    end

    def com_adobe_cq_social_filelibrary_client_endpoints_filelibrary_download_get_servlet
      @com_adobe_cq_social_filelibrary_client_endpoints_filelibrary_download_get_servlet ||= OpenapiClient::Api::ComAdobeCqSocialFilelibraryClientEndpointsFilelibraryDownloadGetServlet.new(@connection)
    end

    def com_adobe_cq_social_filelibrary_client_endpoints_impl_file_library_operations_service
      @com_adobe_cq_social_filelibrary_client_endpoints_impl_file_library_operations_service ||= OpenapiClient::Api::ComAdobeCqSocialFilelibraryClientEndpointsImplFileLibraryOperationsService.new(@connection)
    end

    def com_adobe_cq_social_forum_client_endpoints_impl_forum_operations_service
      @com_adobe_cq_social_forum_client_endpoints_impl_forum_operations_service ||= OpenapiClient::Api::ComAdobeCqSocialForumClientEndpointsImplForumOperationsService.new(@connection)
    end

    def com_adobe_cq_social_forum_dispatcher_impl_flush_operations
      @com_adobe_cq_social_forum_dispatcher_impl_flush_operations ||= OpenapiClient::Api::ComAdobeCqSocialForumDispatcherImplFlushOperations.new(@connection)
    end

    def com_adobe_cq_social_group_client_impl_community_group_collection_component_factory
      @com_adobe_cq_social_group_client_impl_community_group_collection_component_factory ||= OpenapiClient::Api::ComAdobeCqSocialGroupClientImplCommunityGroupCollectionComponentFactory.new(@connection)
    end

    def com_adobe_cq_social_group_impl_group_service_impl
      @com_adobe_cq_social_group_impl_group_service_impl ||= OpenapiClient::Api::ComAdobeCqSocialGroupImplGroupServiceImpl.new(@connection)
    end

    def com_adobe_cq_social_handlebars_guava_template_cache_impl
      @com_adobe_cq_social_handlebars_guava_template_cache_impl ||= OpenapiClient::Api::ComAdobeCqSocialHandlebarsGuavaTemplateCacheImpl.new(@connection)
    end

    def com_adobe_cq_social_ideation_client_endpoints_impl_ideation_operations_service
      @com_adobe_cq_social_ideation_client_endpoints_impl_ideation_operations_service ||= OpenapiClient::Api::ComAdobeCqSocialIdeationClientEndpointsImplIdeationOperationsService.new(@connection)
    end

    def com_adobe_cq_social_journal_client_endpoints_impl_journal_operations_service
      @com_adobe_cq_social_journal_client_endpoints_impl_journal_operations_service ||= OpenapiClient::Api::ComAdobeCqSocialJournalClientEndpointsImplJournalOperationsService.new(@connection)
    end

    def com_adobe_cq_social_members_endpoints_impl_community_member_group_profile_operation_service
      @com_adobe_cq_social_members_endpoints_impl_community_member_group_profile_operation_service ||= OpenapiClient::Api::ComAdobeCqSocialMembersEndpointsImplCommunityMemberGroupProfileOperationService.new(@connection)
    end

    def com_adobe_cq_social_members_endpoints_impl_community_member_user_profile_operation_service
      @com_adobe_cq_social_members_endpoints_impl_community_member_user_profile_operation_service ||= OpenapiClient::Api::ComAdobeCqSocialMembersEndpointsImplCommunityMemberUserProfileOperationService.new(@connection)
    end

    def com_adobe_cq_social_members_impl_community_member_group_profile_component_factory
      @com_adobe_cq_social_members_impl_community_member_group_profile_component_factory ||= OpenapiClient::Api::ComAdobeCqSocialMembersImplCommunityMemberGroupProfileComponentFactory.new(@connection)
    end

    def com_adobe_cq_social_messaging_client_endpoints_impl_messaging_operations_service_impl
      @com_adobe_cq_social_messaging_client_endpoints_impl_messaging_operations_service_impl ||= OpenapiClient::Api::ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationsServiceImpl.new(@connection)
    end

    def com_adobe_cq_social_moderation_dashboard_api_filter_group_social_component_factory
      @com_adobe_cq_social_moderation_dashboard_api_filter_group_social_component_factory ||= OpenapiClient::Api::ComAdobeCqSocialModerationDashboardApiFilterGroupSocialComponentFactory.new(@connection)
    end

    def com_adobe_cq_social_moderation_dashboard_api_moderation_dashboard_social_component_factory
      @com_adobe_cq_social_moderation_dashboard_api_moderation_dashboard_social_component_factory ||= OpenapiClient::Api::ComAdobeCqSocialModerationDashboardApiModerationDashboardSocialComponentFactory.new(@connection)
    end

    def com_adobe_cq_social_moderation_dashboard_api_user_details_social_component_factory
      @com_adobe_cq_social_moderation_dashboard_api_user_details_social_component_factory ||= OpenapiClient::Api::ComAdobeCqSocialModerationDashboardApiUserDetailsSocialComponentFactory.new(@connection)
    end

    def com_adobe_cq_social_moderation_dashboard_internal_impl_filter_group_social_component_factory_v2
      @com_adobe_cq_social_moderation_dashboard_internal_impl_filter_group_social_component_factory_v2 ||= OpenapiClient::Api::ComAdobeCqSocialModerationDashboardInternalImplFilterGroupSocialComponentFactoryV2.new(@connection)
    end

    def com_adobe_cq_social_notifications_impl_mentions_router
      @com_adobe_cq_social_notifications_impl_mentions_router ||= OpenapiClient::Api::ComAdobeCqSocialNotificationsImplMentionsRouter.new(@connection)
    end

    def com_adobe_cq_social_notifications_impl_notification_manager_impl
      @com_adobe_cq_social_notifications_impl_notification_manager_impl ||= OpenapiClient::Api::ComAdobeCqSocialNotificationsImplNotificationManagerImpl.new(@connection)
    end

    def com_adobe_cq_social_notifications_impl_notifications_router
      @com_adobe_cq_social_notifications_impl_notifications_router ||= OpenapiClient::Api::ComAdobeCqSocialNotificationsImplNotificationsRouter.new(@connection)
    end

    def com_adobe_cq_social_qna_client_endpoints_impl_qna_forum_operations_service
      @com_adobe_cq_social_qna_client_endpoints_impl_qna_forum_operations_service ||= OpenapiClient::Api::ComAdobeCqSocialQnaClientEndpointsImplQnaForumOperationsService.new(@connection)
    end

    def com_adobe_cq_social_reporting_analytics_services_impl_analytics_report_importer_service_impl
      @com_adobe_cq_social_reporting_analytics_services_impl_analytics_report_importer_service_impl ||= OpenapiClient::Api::ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportImporterServiceImpl.new(@connection)
    end

    def com_adobe_cq_social_reporting_analytics_services_impl_analytics_report_management_service_impl
      @com_adobe_cq_social_reporting_analytics_services_impl_analytics_report_management_service_impl ||= OpenapiClient::Api::ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportManagementServiceImpl.new(@connection)
    end

    def com_adobe_cq_social_reporting_analytics_services_impl_site_trend_report_social_component_factory
      @com_adobe_cq_social_reporting_analytics_services_impl_site_trend_report_social_component_factory ||= OpenapiClient::Api::ComAdobeCqSocialReportingAnalyticsServicesImplSiteTrendReportSocialComponentFactory.new(@connection)
    end

    def com_adobe_cq_social_review_client_endpoints_impl_review_operations_service
      @com_adobe_cq_social_review_client_endpoints_impl_review_operations_service ||= OpenapiClient::Api::ComAdobeCqSocialReviewClientEndpointsImplReviewOperationsService.new(@connection)
    end

    def com_adobe_cq_social_scf_core_operations_impl_social_operations_servlet
      @com_adobe_cq_social_scf_core_operations_impl_social_operations_servlet ||= OpenapiClient::Api::ComAdobeCqSocialScfCoreOperationsImplSocialOperationsServlet.new(@connection)
    end

    def com_adobe_cq_social_scf_endpoints_impl_default_social_get_servlet
      @com_adobe_cq_social_scf_endpoints_impl_default_social_get_servlet ||= OpenapiClient::Api::ComAdobeCqSocialScfEndpointsImplDefaultSocialGetServlet.new(@connection)
    end

    def com_adobe_cq_social_scoring_impl_scoring_event_listener
      @com_adobe_cq_social_scoring_impl_scoring_event_listener ||= OpenapiClient::Api::ComAdobeCqSocialScoringImplScoringEventListener.new(@connection)
    end

    def com_adobe_cq_social_serviceusers_internal_impl_service_user_wrapper_impl
      @com_adobe_cq_social_serviceusers_internal_impl_service_user_wrapper_impl ||= OpenapiClient::Api::ComAdobeCqSocialServiceusersInternalImplServiceUserWrapperImpl.new(@connection)
    end

    def com_adobe_cq_social_site_endpoints_impl_site_operation_service
      @com_adobe_cq_social_site_endpoints_impl_site_operation_service ||= OpenapiClient::Api::ComAdobeCqSocialSiteEndpointsImplSiteOperationService.new(@connection)
    end

    def com_adobe_cq_social_site_impl_analytics_component_configuration_service_impl
      @com_adobe_cq_social_site_impl_analytics_component_configuration_service_impl ||= OpenapiClient::Api::ComAdobeCqSocialSiteImplAnalyticsComponentConfigurationServiceImpl.new(@connection)
    end

    def com_adobe_cq_social_site_impl_site_configurator_impl
      @com_adobe_cq_social_site_impl_site_configurator_impl ||= OpenapiClient::Api::ComAdobeCqSocialSiteImplSiteConfiguratorImpl.new(@connection)
    end

    def com_adobe_cq_social_srp_impl_social_solr_connector
      @com_adobe_cq_social_srp_impl_social_solr_connector ||= OpenapiClient::Api::ComAdobeCqSocialSrpImplSocialSolrConnector.new(@connection)
    end

    def com_adobe_cq_social_sync_impl_diff_changes_observer
      @com_adobe_cq_social_sync_impl_diff_changes_observer ||= OpenapiClient::Api::ComAdobeCqSocialSyncImplDiffChangesObserver.new(@connection)
    end

    def com_adobe_cq_social_sync_impl_group_sync_listener_impl
      @com_adobe_cq_social_sync_impl_group_sync_listener_impl ||= OpenapiClient::Api::ComAdobeCqSocialSyncImplGroupSyncListenerImpl.new(@connection)
    end

    def com_adobe_cq_social_sync_impl_publisher_sync_service_impl
      @com_adobe_cq_social_sync_impl_publisher_sync_service_impl ||= OpenapiClient::Api::ComAdobeCqSocialSyncImplPublisherSyncServiceImpl.new(@connection)
    end

    def com_adobe_cq_social_sync_impl_user_sync_listener_impl
      @com_adobe_cq_social_sync_impl_user_sync_listener_impl ||= OpenapiClient::Api::ComAdobeCqSocialSyncImplUserSyncListenerImpl.new(@connection)
    end

    def com_adobe_cq_social_translation_impl_translation_service_config_manager
      @com_adobe_cq_social_translation_impl_translation_service_config_manager ||= OpenapiClient::Api::ComAdobeCqSocialTranslationImplTranslationServiceConfigManager.new(@connection)
    end

    def com_adobe_cq_social_translation_impl_ugc_language_detector
      @com_adobe_cq_social_translation_impl_ugc_language_detector ||= OpenapiClient::Api::ComAdobeCqSocialTranslationImplUGCLanguageDetector.new(@connection)
    end

    def com_adobe_cq_social_ugcbase_dispatcher_impl_flush_service_impl
      @com_adobe_cq_social_ugcbase_dispatcher_impl_flush_service_impl ||= OpenapiClient::Api::ComAdobeCqSocialUgcbaseDispatcherImplFlushServiceImpl.new(@connection)
    end

    def com_adobe_cq_social_ugcbase_impl_aysnc_reverse_replicator_impl
      @com_adobe_cq_social_ugcbase_impl_aysnc_reverse_replicator_impl ||= OpenapiClient::Api::ComAdobeCqSocialUgcbaseImplAysncReverseReplicatorImpl.new(@connection)
    end

    def com_adobe_cq_social_ugcbase_impl_publisher_configuration_impl
      @com_adobe_cq_social_ugcbase_impl_publisher_configuration_impl ||= OpenapiClient::Api::ComAdobeCqSocialUgcbaseImplPublisherConfigurationImpl.new(@connection)
    end

    def com_adobe_cq_social_ugcbase_impl_social_utils_impl
      @com_adobe_cq_social_ugcbase_impl_social_utils_impl ||= OpenapiClient::Api::ComAdobeCqSocialUgcbaseImplSocialUtilsImpl.new(@connection)
    end

    def com_adobe_cq_social_ugcbase_moderation_impl_auto_moderation_impl
      @com_adobe_cq_social_ugcbase_moderation_impl_auto_moderation_impl ||= OpenapiClient::Api::ComAdobeCqSocialUgcbaseModerationImplAutoModerationImpl.new(@connection)
    end

    def com_adobe_cq_social_ugcbase_moderation_impl_sentiment_process
      @com_adobe_cq_social_ugcbase_moderation_impl_sentiment_process ||= OpenapiClient::Api::ComAdobeCqSocialUgcbaseModerationImplSentimentProcess.new(@connection)
    end

    def com_adobe_cq_social_ugcbase_security_impl_default_attachment_type_blacklist_service
      @com_adobe_cq_social_ugcbase_security_impl_default_attachment_type_blacklist_service ||= OpenapiClient::Api::ComAdobeCqSocialUgcbaseSecurityImplDefaultAttachmentTypeBlacklistService.new(@connection)
    end

    def com_adobe_cq_social_ugcbase_security_impl_safer_sling_post_validator_impl
      @com_adobe_cq_social_ugcbase_security_impl_safer_sling_post_validator_impl ||= OpenapiClient::Api::ComAdobeCqSocialUgcbaseSecurityImplSaferSlingPostValidatorImpl.new(@connection)
    end

    def com_adobe_cq_social_user_endpoints_impl_users_group_from_publish_servlet
      @com_adobe_cq_social_user_endpoints_impl_users_group_from_publish_servlet ||= OpenapiClient::Api::ComAdobeCqSocialUserEndpointsImplUsersGroupFromPublishServlet.new(@connection)
    end

    def com_adobe_cq_social_user_impl_transport_http_to_publisher
      @com_adobe_cq_social_user_impl_transport_http_to_publisher ||= OpenapiClient::Api::ComAdobeCqSocialUserImplTransportHttpToPublisher.new(@connection)
    end

    def com_adobe_cq_ui_wcm_commons_internal_servlets_rte_rte_filter_servlet_factory_amended
      @com_adobe_cq_ui_wcm_commons_internal_servlets_rte_rte_filter_servlet_factory_amended ||= OpenapiClient::Api::ComAdobeCqUiWcmCommonsInternalServletsRteRTEFilterServletFactoryAmended.new(@connection)
    end

    def com_adobe_cq_upgrades_cleanup_impl_upgrade_content_cleanup
      @com_adobe_cq_upgrades_cleanup_impl_upgrade_content_cleanup ||= OpenapiClient::Api::ComAdobeCqUpgradesCleanupImplUpgradeContentCleanup.new(@connection)
    end

    def com_adobe_cq_upgrades_cleanup_impl_upgrade_install_folder_cleanup
      @com_adobe_cq_upgrades_cleanup_impl_upgrade_install_folder_cleanup ||= OpenapiClient::Api::ComAdobeCqUpgradesCleanupImplUpgradeInstallFolderCleanup.new(@connection)
    end

    def com_adobe_cq_wcm_jobs_async_impl_async_delete_config_provider_service
      @com_adobe_cq_wcm_jobs_async_impl_async_delete_config_provider_service ||= OpenapiClient::Api::ComAdobeCqWcmJobsAsyncImplAsyncDeleteConfigProviderService.new(@connection)
    end

    def com_adobe_cq_wcm_jobs_async_impl_async_job_clean_up_task
      @com_adobe_cq_wcm_jobs_async_impl_async_job_clean_up_task ||= OpenapiClient::Api::ComAdobeCqWcmJobsAsyncImplAsyncJobCleanUpTask.new(@connection)
    end

    def com_adobe_cq_wcm_jobs_async_impl_async_move_config_provider_service
      @com_adobe_cq_wcm_jobs_async_impl_async_move_config_provider_service ||= OpenapiClient::Api::ComAdobeCqWcmJobsAsyncImplAsyncMoveConfigProviderService.new(@connection)
    end

    def com_adobe_cq_wcm_jobs_async_impl_async_page_move_config_provider_service
      @com_adobe_cq_wcm_jobs_async_impl_async_page_move_config_provider_service ||= OpenapiClient::Api::ComAdobeCqWcmJobsAsyncImplAsyncPageMoveConfigProviderService.new(@connection)
    end

    def com_adobe_cq_wcm_launches_impl_launches_event_handler
      @com_adobe_cq_wcm_launches_impl_launches_event_handler ||= OpenapiClient::Api::ComAdobeCqWcmLaunchesImplLaunchesEventHandler.new(@connection)
    end

    def com_adobe_cq_wcm_mobile_qrcode_servlet_qr_code_image_generator
      @com_adobe_cq_wcm_mobile_qrcode_servlet_qr_code_image_generator ||= OpenapiClient::Api::ComAdobeCqWcmMobileQrcodeServletQRCodeImageGenerator.new(@connection)
    end

    def com_adobe_cq_wcm_style_internal_component_style_info_cache_impl
      @com_adobe_cq_wcm_style_internal_component_style_info_cache_impl ||= OpenapiClient::Api::ComAdobeCqWcmStyleInternalComponentStyleInfoCacheImpl.new(@connection)
    end

    def com_adobe_cq_wcm_translation_impl_translation_platform_configuration_impl
      @com_adobe_cq_wcm_translation_impl_translation_platform_configuration_impl ||= OpenapiClient::Api::ComAdobeCqWcmTranslationImplTranslationPlatformConfigurationImpl.new(@connection)
    end

    def com_adobe_fd_fp_config_forms_portal_draftsand_submission_config_service
      @com_adobe_fd_fp_config_forms_portal_draftsand_submission_config_service ||= OpenapiClient::Api::ComAdobeFdFpConfigFormsPortalDraftsandSubmissionConfigService.new(@connection)
    end

    def com_adobe_fd_fp_config_forms_portal_scheduler_service
      @com_adobe_fd_fp_config_forms_portal_scheduler_service ||= OpenapiClient::Api::ComAdobeFdFpConfigFormsPortalSchedulerService.new(@connection)
    end

    def com_adobe_forms_common_service_impl_default_data_provider
      @com_adobe_forms_common_service_impl_default_data_provider ||= OpenapiClient::Api::ComAdobeFormsCommonServiceImplDefaultDataProvider.new(@connection)
    end

    def com_adobe_forms_common_service_impl_forms_common_configuration_service_impl
      @com_adobe_forms_common_service_impl_forms_common_configuration_service_impl ||= OpenapiClient::Api::ComAdobeFormsCommonServiceImplFormsCommonConfigurationServiceImpl.new(@connection)
    end

    def com_adobe_forms_common_servlet_temp_clean_up_task
      @com_adobe_forms_common_servlet_temp_clean_up_task ||= OpenapiClient::Api::ComAdobeFormsCommonServletTempCleanUpTask.new(@connection)
    end

    def com_adobe_granite_acp_platform_platform_servlet
      @com_adobe_granite_acp_platform_platform_servlet ||= OpenapiClient::Api::ComAdobeGraniteAcpPlatformPlatformServlet.new(@connection)
    end

    def com_adobe_granite_activitystreams_impl_activity_manager_impl
      @com_adobe_granite_activitystreams_impl_activity_manager_impl ||= OpenapiClient::Api::ComAdobeGraniteActivitystreamsImplActivityManagerImpl.new(@connection)
    end

    def com_adobe_granite_analyzer_base_system_status_servlet
      @com_adobe_granite_analyzer_base_system_status_servlet ||= OpenapiClient::Api::ComAdobeGraniteAnalyzerBaseSystemStatusServlet.new(@connection)
    end

    def com_adobe_granite_analyzer_scripts_compile_all_scripts_compiler_servlet
      @com_adobe_granite_analyzer_scripts_compile_all_scripts_compiler_servlet ||= OpenapiClient::Api::ComAdobeGraniteAnalyzerScriptsCompileAllScriptsCompilerServlet.new(@connection)
    end

    def com_adobe_granite_apicontroller_filter_resolver_hook_factory
      @com_adobe_granite_apicontroller_filter_resolver_hook_factory ||= OpenapiClient::Api::ComAdobeGraniteApicontrollerFilterResolverHookFactory.new(@connection)
    end

    def com_adobe_granite_auth_cert_impl_client_cert_auth_handler
      @com_adobe_granite_auth_cert_impl_client_cert_auth_handler ||= OpenapiClient::Api::ComAdobeGraniteAuthCertImplClientCertAuthHandler.new(@connection)
    end

    def com_adobe_granite_auth_ims
      @com_adobe_granite_auth_ims ||= OpenapiClient::Api::ComAdobeGraniteAuthIms.new(@connection)
    end

    def com_adobe_granite_auth_ims_impl_external_user_id_mapping_provider_extension
      @com_adobe_granite_auth_ims_impl_external_user_id_mapping_provider_extension ||= OpenapiClient::Api::ComAdobeGraniteAuthImsImplExternalUserIdMappingProviderExtension.new(@connection)
    end

    def com_adobe_granite_auth_ims_impl_ims_access_token_request_customizer_impl
      @com_adobe_granite_auth_ims_impl_ims_access_token_request_customizer_impl ||= OpenapiClient::Api::ComAdobeGraniteAuthImsImplIMSAccessTokenRequestCustomizerImpl.new(@connection)
    end

    def com_adobe_granite_auth_ims_impl_ims_instance_credentials_validator
      @com_adobe_granite_auth_ims_impl_ims_instance_credentials_validator ||= OpenapiClient::Api::ComAdobeGraniteAuthImsImplIMSInstanceCredentialsValidator.new(@connection)
    end

    def com_adobe_granite_auth_ims_impl_ims_provider_impl
      @com_adobe_granite_auth_ims_impl_ims_provider_impl ||= OpenapiClient::Api::ComAdobeGraniteAuthImsImplIMSProviderImpl.new(@connection)
    end

    def com_adobe_granite_auth_ims_impl_ims_config_provider_impl
      @com_adobe_granite_auth_ims_impl_ims_config_provider_impl ||= OpenapiClient::Api::ComAdobeGraniteAuthImsImplImsConfigProviderImpl.new(@connection)
    end

    def com_adobe_granite_auth_oauth_accesstoken_provider
      @com_adobe_granite_auth_oauth_accesstoken_provider ||= OpenapiClient::Api::ComAdobeGraniteAuthOauthAccesstokenProvider.new(@connection)
    end

    def com_adobe_granite_auth_oauth_impl_bearer_authentication_handler
      @com_adobe_granite_auth_oauth_impl_bearer_authentication_handler ||= OpenapiClient::Api::ComAdobeGraniteAuthOauthImplBearerAuthenticationHandler.new(@connection)
    end

    def com_adobe_granite_auth_oauth_impl_default_token_validator_impl
      @com_adobe_granite_auth_oauth_impl_default_token_validator_impl ||= OpenapiClient::Api::ComAdobeGraniteAuthOauthImplDefaultTokenValidatorImpl.new(@connection)
    end

    def com_adobe_granite_auth_oauth_impl_facebook_provider_impl
      @com_adobe_granite_auth_oauth_impl_facebook_provider_impl ||= OpenapiClient::Api::ComAdobeGraniteAuthOauthImplFacebookProviderImpl.new(@connection)
    end

    def com_adobe_granite_auth_oauth_impl_github_provider_impl
      @com_adobe_granite_auth_oauth_impl_github_provider_impl ||= OpenapiClient::Api::ComAdobeGraniteAuthOauthImplGithubProviderImpl.new(@connection)
    end

    def com_adobe_granite_auth_oauth_impl_granite_provider
      @com_adobe_granite_auth_oauth_impl_granite_provider ||= OpenapiClient::Api::ComAdobeGraniteAuthOauthImplGraniteProvider.new(@connection)
    end

    def com_adobe_granite_auth_oauth_impl_o_auth_authentication_handler
      @com_adobe_granite_auth_oauth_impl_o_auth_authentication_handler ||= OpenapiClient::Api::ComAdobeGraniteAuthOauthImplOAuthAuthenticationHandler.new(@connection)
    end

    def com_adobe_granite_auth_oauth_impl_twitter_provider_impl
      @com_adobe_granite_auth_oauth_impl_twitter_provider_impl ||= OpenapiClient::Api::ComAdobeGraniteAuthOauthImplTwitterProviderImpl.new(@connection)
    end

    def com_adobe_granite_auth_oauth_impl_helper_provider_config_manager
      @com_adobe_granite_auth_oauth_impl_helper_provider_config_manager ||= OpenapiClient::Api::ComAdobeGraniteAuthOauthImplHelperProviderConfigManager.new(@connection)
    end

    def com_adobe_granite_auth_oauth_impl_helper_provider_config_manager_internal
      @com_adobe_granite_auth_oauth_impl_helper_provider_config_manager_internal ||= OpenapiClient::Api::ComAdobeGraniteAuthOauthImplHelperProviderConfigManagerInternal.new(@connection)
    end

    def com_adobe_granite_auth_oauth_provider
      @com_adobe_granite_auth_oauth_provider ||= OpenapiClient::Api::ComAdobeGraniteAuthOauthProvider.new(@connection)
    end

    def com_adobe_granite_auth_requirement_impl_default_requirement_handler
      @com_adobe_granite_auth_requirement_impl_default_requirement_handler ||= OpenapiClient::Api::ComAdobeGraniteAuthRequirementImplDefaultRequirementHandler.new(@connection)
    end

    def com_adobe_granite_auth_saml_saml_authentication_handler
      @com_adobe_granite_auth_saml_saml_authentication_handler ||= OpenapiClient::Api::ComAdobeGraniteAuthSamlSamlAuthenticationHandler.new(@connection)
    end

    def com_adobe_granite_auth_sso_impl_sso_authentication_handler
      @com_adobe_granite_auth_sso_impl_sso_authentication_handler ||= OpenapiClient::Api::ComAdobeGraniteAuthSsoImplSsoAuthenticationHandler.new(@connection)
    end

    def com_adobe_granite_bundles_hc_impl_code_cache_health_check
      @com_adobe_granite_bundles_hc_impl_code_cache_health_check ||= OpenapiClient::Api::ComAdobeGraniteBundlesHcImplCodeCacheHealthCheck.new(@connection)
    end

    def com_adobe_granite_bundles_hc_impl_crxde_support_bundle_health_check
      @com_adobe_granite_bundles_hc_impl_crxde_support_bundle_health_check ||= OpenapiClient::Api::ComAdobeGraniteBundlesHcImplCrxdeSupportBundleHealthCheck.new(@connection)
    end

    def com_adobe_granite_bundles_hc_impl_dav_ex_bundle_health_check
      @com_adobe_granite_bundles_hc_impl_dav_ex_bundle_health_check ||= OpenapiClient::Api::ComAdobeGraniteBundlesHcImplDavExBundleHealthCheck.new(@connection)
    end

    def com_adobe_granite_bundles_hc_impl_inactive_bundles_health_check
      @com_adobe_granite_bundles_hc_impl_inactive_bundles_health_check ||= OpenapiClient::Api::ComAdobeGraniteBundlesHcImplInactiveBundlesHealthCheck.new(@connection)
    end

    def com_adobe_granite_bundles_hc_impl_jobs_health_check
      @com_adobe_granite_bundles_hc_impl_jobs_health_check ||= OpenapiClient::Api::ComAdobeGraniteBundlesHcImplJobsHealthCheck.new(@connection)
    end

    def com_adobe_granite_bundles_hc_impl_sling_get_servlet_health_check
      @com_adobe_granite_bundles_hc_impl_sling_get_servlet_health_check ||= OpenapiClient::Api::ComAdobeGraniteBundlesHcImplSlingGetServletHealthCheck.new(@connection)
    end

    def com_adobe_granite_bundles_hc_impl_sling_java_script_handler_health_check
      @com_adobe_granite_bundles_hc_impl_sling_java_script_handler_health_check ||= OpenapiClient::Api::ComAdobeGraniteBundlesHcImplSlingJavaScriptHandlerHealthCheck.new(@connection)
    end

    def com_adobe_granite_bundles_hc_impl_sling_jsp_script_handler_health_check
      @com_adobe_granite_bundles_hc_impl_sling_jsp_script_handler_health_check ||= OpenapiClient::Api::ComAdobeGraniteBundlesHcImplSlingJspScriptHandlerHealthCheck.new(@connection)
    end

    def com_adobe_granite_bundles_hc_impl_sling_referrer_filter_health_check
      @com_adobe_granite_bundles_hc_impl_sling_referrer_filter_health_check ||= OpenapiClient::Api::ComAdobeGraniteBundlesHcImplSlingReferrerFilterHealthCheck.new(@connection)
    end

    def com_adobe_granite_bundles_hc_impl_web_dav_bundle_health_check
      @com_adobe_granite_bundles_hc_impl_web_dav_bundle_health_check ||= OpenapiClient::Api::ComAdobeGraniteBundlesHcImplWebDavBundleHealthCheck.new(@connection)
    end

    def com_adobe_granite_comments_internal_comment_replication_content_filter_factory
      @com_adobe_granite_comments_internal_comment_replication_content_filter_factory ||= OpenapiClient::Api::ComAdobeGraniteCommentsInternalCommentReplicationContentFilterFactory.new(@connection)
    end

    def com_adobe_granite_compatrouter_impl_compat_switching_service_impl
      @com_adobe_granite_compatrouter_impl_compat_switching_service_impl ||= OpenapiClient::Api::ComAdobeGraniteCompatrouterImplCompatSwitchingServiceImpl.new(@connection)
    end

    def com_adobe_granite_compatrouter_impl_routing_config
      @com_adobe_granite_compatrouter_impl_routing_config ||= OpenapiClient::Api::ComAdobeGraniteCompatrouterImplRoutingConfig.new(@connection)
    end

    def com_adobe_granite_compatrouter_impl_switch_mapping_config
      @com_adobe_granite_compatrouter_impl_switch_mapping_config ||= OpenapiClient::Api::ComAdobeGraniteCompatrouterImplSwitchMappingConfig.new(@connection)
    end

    def com_adobe_granite_conf_impl_runtime_aware_configuration_resource_resolving_strategy
      @com_adobe_granite_conf_impl_runtime_aware_configuration_resource_resolving_strategy ||= OpenapiClient::Api::ComAdobeGraniteConfImplRuntimeAwareConfigurationResourceResolvingStrategy.new(@connection)
    end

    def com_adobe_granite_contexthub_impl_context_hub_impl
      @com_adobe_granite_contexthub_impl_context_hub_impl ||= OpenapiClient::Api::ComAdobeGraniteContexthubImplContextHubImpl.new(@connection)
    end

    def com_adobe_granite_cors_impl_cors_policy_impl
      @com_adobe_granite_cors_impl_cors_policy_impl ||= OpenapiClient::Api::ComAdobeGraniteCorsImplCORSPolicyImpl.new(@connection)
    end

    def com_adobe_granite_csrf_impl_csrf_filter
      @com_adobe_granite_csrf_impl_csrf_filter ||= OpenapiClient::Api::ComAdobeGraniteCsrfImplCSRFFilter.new(@connection)
    end

    def com_adobe_granite_csrf_impl_csrf_servlet
      @com_adobe_granite_csrf_impl_csrf_servlet ||= OpenapiClient::Api::ComAdobeGraniteCsrfImplCSRFServlet.new(@connection)
    end

    def com_adobe_granite_distribution_core_impl_crypto_distribution_transport_secret_provider
      @com_adobe_granite_distribution_core_impl_crypto_distribution_transport_secret_provider ||= OpenapiClient::Api::ComAdobeGraniteDistributionCoreImplCryptoDistributionTransportSecretProvider.new(@connection)
    end

    def com_adobe_granite_distribution_core_impl_distribution_to_replication_event_transformer
      @com_adobe_granite_distribution_core_impl_distribution_to_replication_event_transformer ||= OpenapiClient::Api::ComAdobeGraniteDistributionCoreImplDistributionToReplicationEventTransformer.new(@connection)
    end

    def com_adobe_granite_distribution_core_impl_diff_diff_changes_observer
      @com_adobe_granite_distribution_core_impl_diff_diff_changes_observer ||= OpenapiClient::Api::ComAdobeGraniteDistributionCoreImplDiffDiffChangesObserver.new(@connection)
    end

    def com_adobe_granite_distribution_core_impl_diff_diff_event_listener
      @com_adobe_granite_distribution_core_impl_diff_diff_event_listener ||= OpenapiClient::Api::ComAdobeGraniteDistributionCoreImplDiffDiffEventListener.new(@connection)
    end

    def com_adobe_granite_distribution_core_impl_replication_distribution_transport_handler
      @com_adobe_granite_distribution_core_impl_replication_distribution_transport_handler ||= OpenapiClient::Api::ComAdobeGraniteDistributionCoreImplReplicationDistributionTransportHandler.new(@connection)
    end

    def com_adobe_granite_distribution_core_impl_replication_adapters_replication_agent_provider
      @com_adobe_granite_distribution_core_impl_replication_adapters_replication_agent_provider ||= OpenapiClient::Api::ComAdobeGraniteDistributionCoreImplReplicationAdaptersReplicationAgentProvider.new(@connection)
    end

    def com_adobe_granite_distribution_core_impl_transport_access_token_distribution_transport_secret_provider
      @com_adobe_granite_distribution_core_impl_transport_access_token_distribution_transport_secret_provider ||= OpenapiClient::Api::ComAdobeGraniteDistributionCoreImplTransportAccessTokenDistributionTransportSecretProvider.new(@connection)
    end

    def com_adobe_granite_frags_impl_check_http_header_flag
      @com_adobe_granite_frags_impl_check_http_header_flag ||= OpenapiClient::Api::ComAdobeGraniteFragsImplCheckHttpHeaderFlag.new(@connection)
    end

    def com_adobe_granite_frags_impl_random_feature
      @com_adobe_granite_frags_impl_random_feature ||= OpenapiClient::Api::ComAdobeGraniteFragsImplRandomFeature.new(@connection)
    end

    def com_adobe_granite_httpcache_file_file_cache_store
      @com_adobe_granite_httpcache_file_file_cache_store ||= OpenapiClient::Api::ComAdobeGraniteHttpcacheFileFileCacheStore.new(@connection)
    end

    def com_adobe_granite_httpcache_impl_outer_cache_filter
      @com_adobe_granite_httpcache_impl_outer_cache_filter ||= OpenapiClient::Api::ComAdobeGraniteHttpcacheImplOuterCacheFilter.new(@connection)
    end

    def com_adobe_granite_i18n_impl_preferences_locale_resolver_service
      @com_adobe_granite_i18n_impl_preferences_locale_resolver_service ||= OpenapiClient::Api::ComAdobeGraniteI18nImplPreferencesLocaleResolverService.new(@connection)
    end

    def com_adobe_granite_i18n_impl_bundle_pseudo_translations
      @com_adobe_granite_i18n_impl_bundle_pseudo_translations ||= OpenapiClient::Api::ComAdobeGraniteI18nImplBundlePseudoTranslations.new(@connection)
    end

    def com_adobe_granite_infocollector_info_collector
      @com_adobe_granite_infocollector_info_collector ||= OpenapiClient::Api::ComAdobeGraniteInfocollectorInfoCollector.new(@connection)
    end

    def com_adobe_granite_jetty_ssl_internal_granite_ssl_connector_factory
      @com_adobe_granite_jetty_ssl_internal_granite_ssl_connector_factory ||= OpenapiClient::Api::ComAdobeGraniteJettySslInternalGraniteSslConnectorFactory.new(@connection)
    end

    def com_adobe_granite_license_impl_license_check_filter
      @com_adobe_granite_license_impl_license_check_filter ||= OpenapiClient::Api::ComAdobeGraniteLicenseImplLicenseCheckFilter.new(@connection)
    end

    def com_adobe_granite_logging_impl_log_analyser_impl
      @com_adobe_granite_logging_impl_log_analyser_impl ||= OpenapiClient::Api::ComAdobeGraniteLoggingImplLogAnalyserImpl.new(@connection)
    end

    def com_adobe_granite_logging_impl_log_error_health_check
      @com_adobe_granite_logging_impl_log_error_health_check ||= OpenapiClient::Api::ComAdobeGraniteLoggingImplLogErrorHealthCheck.new(@connection)
    end

    def com_adobe_granite_maintenance_crx_impl_data_store_garbage_collection_task
      @com_adobe_granite_maintenance_crx_impl_data_store_garbage_collection_task ||= OpenapiClient::Api::ComAdobeGraniteMaintenanceCrxImplDataStoreGarbageCollectionTask.new(@connection)
    end

    def com_adobe_granite_maintenance_crx_impl_lucene_binaries_cleanup_task
      @com_adobe_granite_maintenance_crx_impl_lucene_binaries_cleanup_task ||= OpenapiClient::Api::ComAdobeGraniteMaintenanceCrxImplLuceneBinariesCleanupTask.new(@connection)
    end

    def com_adobe_granite_maintenance_crx_impl_revision_cleanup_task
      @com_adobe_granite_maintenance_crx_impl_revision_cleanup_task ||= OpenapiClient::Api::ComAdobeGraniteMaintenanceCrxImplRevisionCleanupTask.new(@connection)
    end

    def com_adobe_granite_monitoring_impl_script_config_impl
      @com_adobe_granite_monitoring_impl_script_config_impl ||= OpenapiClient::Api::ComAdobeGraniteMonitoringImplScriptConfigImpl.new(@connection)
    end

    def com_adobe_granite_oauth_server_auth_impl_o_auth2_server_authentication_handler
      @com_adobe_granite_oauth_server_auth_impl_o_auth2_server_authentication_handler ||= OpenapiClient::Api::ComAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHandler.new(@connection)
    end

    def com_adobe_granite_oauth_server_impl_access_token_cleanup_task
      @com_adobe_granite_oauth_server_impl_access_token_cleanup_task ||= OpenapiClient::Api::ComAdobeGraniteOauthServerImplAccessTokenCleanupTask.new(@connection)
    end

    def com_adobe_granite_oauth_server_impl_o_auth2_client_revocation_servlet
      @com_adobe_granite_oauth_server_impl_o_auth2_client_revocation_servlet ||= OpenapiClient::Api::ComAdobeGraniteOauthServerImplOAuth2ClientRevocationServlet.new(@connection)
    end

    def com_adobe_granite_oauth_server_impl_o_auth2_revocation_endpoint_servlet
      @com_adobe_granite_oauth_server_impl_o_auth2_revocation_endpoint_servlet ||= OpenapiClient::Api::ComAdobeGraniteOauthServerImplOAuth2RevocationEndpointServlet.new(@connection)
    end

    def com_adobe_granite_oauth_server_impl_o_auth2_token_endpoint_servlet
      @com_adobe_granite_oauth_server_impl_o_auth2_token_endpoint_servlet ||= OpenapiClient::Api::ComAdobeGraniteOauthServerImplOAuth2TokenEndpointServlet.new(@connection)
    end

    def com_adobe_granite_oauth_server_impl_o_auth2_token_revocation_servlet
      @com_adobe_granite_oauth_server_impl_o_auth2_token_revocation_servlet ||= OpenapiClient::Api::ComAdobeGraniteOauthServerImplOAuth2TokenRevocationServlet.new(@connection)
    end

    def com_adobe_granite_offloading_impl_offloading_configurator
      @com_adobe_granite_offloading_impl_offloading_configurator ||= OpenapiClient::Api::ComAdobeGraniteOffloadingImplOffloadingConfigurator.new(@connection)
    end

    def com_adobe_granite_offloading_impl_offloading_job_cloner
      @com_adobe_granite_offloading_impl_offloading_job_cloner ||= OpenapiClient::Api::ComAdobeGraniteOffloadingImplOffloadingJobCloner.new(@connection)
    end

    def com_adobe_granite_offloading_impl_offloading_job_offloader
      @com_adobe_granite_offloading_impl_offloading_job_offloader ||= OpenapiClient::Api::ComAdobeGraniteOffloadingImplOffloadingJobOffloader.new(@connection)
    end

    def com_adobe_granite_offloading_impl_transporter_offloading_agent_manager
      @com_adobe_granite_offloading_impl_transporter_offloading_agent_manager ||= OpenapiClient::Api::ComAdobeGraniteOffloadingImplTransporterOffloadingAgentManager.new(@connection)
    end

    def com_adobe_granite_offloading_impl_transporter_offloading_default_transporter
      @com_adobe_granite_offloading_impl_transporter_offloading_default_transporter ||= OpenapiClient::Api::ComAdobeGraniteOffloadingImplTransporterOffloadingDefaultTransporter.new(@connection)
    end

    def com_adobe_granite_omnisearch_impl_core_omni_search_service_impl
      @com_adobe_granite_omnisearch_impl_core_omni_search_service_impl ||= OpenapiClient::Api::ComAdobeGraniteOmnisearchImplCoreOmniSearchServiceImpl.new(@connection)
    end

    def com_adobe_granite_optout_impl_opt_out_service_impl
      @com_adobe_granite_optout_impl_opt_out_service_impl ||= OpenapiClient::Api::ComAdobeGraniteOptoutImplOptOutServiceImpl.new(@connection)
    end

    def com_adobe_granite_queries_impl_hc_async_index_health_check
      @com_adobe_granite_queries_impl_hc_async_index_health_check ||= OpenapiClient::Api::ComAdobeGraniteQueriesImplHcAsyncIndexHealthCheck.new(@connection)
    end

    def com_adobe_granite_queries_impl_hc_large_index_health_check
      @com_adobe_granite_queries_impl_hc_large_index_health_check ||= OpenapiClient::Api::ComAdobeGraniteQueriesImplHcLargeIndexHealthCheck.new(@connection)
    end

    def com_adobe_granite_queries_impl_hc_queries_status_health_check
      @com_adobe_granite_queries_impl_hc_queries_status_health_check ||= OpenapiClient::Api::ComAdobeGraniteQueriesImplHcQueriesStatusHealthCheck.new(@connection)
    end

    def com_adobe_granite_queries_impl_hc_query_health_check_metrics
      @com_adobe_granite_queries_impl_hc_query_health_check_metrics ||= OpenapiClient::Api::ComAdobeGraniteQueriesImplHcQueryHealthCheckMetrics.new(@connection)
    end

    def com_adobe_granite_queries_impl_hc_query_limits_health_check
      @com_adobe_granite_queries_impl_hc_query_limits_health_check ||= OpenapiClient::Api::ComAdobeGraniteQueriesImplHcQueryLimitsHealthCheck.new(@connection)
    end

    def com_adobe_granite_replication_hc_impl_replication_queue_health_check
      @com_adobe_granite_replication_hc_impl_replication_queue_health_check ||= OpenapiClient::Api::ComAdobeGraniteReplicationHcImplReplicationQueueHealthCheck.new(@connection)
    end

    def com_adobe_granite_replication_hc_impl_replication_transport_users_health_check
      @com_adobe_granite_replication_hc_impl_replication_transport_users_health_check ||= OpenapiClient::Api::ComAdobeGraniteReplicationHcImplReplicationTransportUsersHealthCheck.new(@connection)
    end

    def com_adobe_granite_repository_service_user_configuration
      @com_adobe_granite_repository_service_user_configuration ||= OpenapiClient::Api::ComAdobeGraniteRepositoryServiceUserConfiguration.new(@connection)
    end

    def com_adobe_granite_repository_hc_impl_authorizable_node_name_health_check
      @com_adobe_granite_repository_hc_impl_authorizable_node_name_health_check ||= OpenapiClient::Api::ComAdobeGraniteRepositoryHcImplAuthorizableNodeNameHealthCheck.new(@connection)
    end

    def com_adobe_granite_repository_hc_impl_continuous_rgc_health_check
      @com_adobe_granite_repository_hc_impl_continuous_rgc_health_check ||= OpenapiClient::Api::ComAdobeGraniteRepositoryHcImplContinuousRGCHealthCheck.new(@connection)
    end

    def com_adobe_granite_repository_hc_impl_default_access_user_profile_health_check
      @com_adobe_granite_repository_hc_impl_default_access_user_profile_health_check ||= OpenapiClient::Api::ComAdobeGraniteRepositoryHcImplDefaultAccessUserProfileHealthCheck.new(@connection)
    end

    def com_adobe_granite_repository_hc_impl_default_logins_health_check
      @com_adobe_granite_repository_hc_impl_default_logins_health_check ||= OpenapiClient::Api::ComAdobeGraniteRepositoryHcImplDefaultLoginsHealthCheck.new(@connection)
    end

    def com_adobe_granite_repository_hc_impl_disk_space_health_check
      @com_adobe_granite_repository_hc_impl_disk_space_health_check ||= OpenapiClient::Api::ComAdobeGraniteRepositoryHcImplDiskSpaceHealthCheck.new(@connection)
    end

    def com_adobe_granite_repository_hc_impl_observation_queue_length_health_check
      @com_adobe_granite_repository_hc_impl_observation_queue_length_health_check ||= OpenapiClient::Api::ComAdobeGraniteRepositoryHcImplObservationQueueLengthHealthCheck.new(@connection)
    end

    def com_adobe_granite_repository_hc_impl_content_sling_sling_content_health_check
      @com_adobe_granite_repository_hc_impl_content_sling_sling_content_health_check ||= OpenapiClient::Api::ComAdobeGraniteRepositoryHcImplContentSlingSlingContentHealthCheck.new(@connection)
    end

    def com_adobe_granite_repository_impl_commit_stats_config
      @com_adobe_granite_repository_impl_commit_stats_config ||= OpenapiClient::Api::ComAdobeGraniteRepositoryImplCommitStatsConfig.new(@connection)
    end

    def com_adobe_granite_requests_logging_impl_hc_requests_status_health_check_impl
      @com_adobe_granite_requests_logging_impl_hc_requests_status_health_check_impl ||= OpenapiClient::Api::ComAdobeGraniteRequestsLoggingImplHcRequestsStatusHealthCheckImpl.new(@connection)
    end

    def com_adobe_granite_resourcestatus_impl_composite_status_type
      @com_adobe_granite_resourcestatus_impl_composite_status_type ||= OpenapiClient::Api::ComAdobeGraniteResourcestatusImplCompositeStatusType.new(@connection)
    end

    def com_adobe_granite_resourcestatus_impl_status_resource_provider_impl
      @com_adobe_granite_resourcestatus_impl_status_resource_provider_impl ||= OpenapiClient::Api::ComAdobeGraniteResourcestatusImplStatusResourceProviderImpl.new(@connection)
    end

    def com_adobe_granite_rest_assets_impl_asset_content_disposition_filter
      @com_adobe_granite_rest_assets_impl_asset_content_disposition_filter ||= OpenapiClient::Api::ComAdobeGraniteRestAssetsImplAssetContentDispositionFilter.new(@connection)
    end

    def com_adobe_granite_rest_impl_api_endpoint_resource_provider_factory_impl
      @com_adobe_granite_rest_impl_api_endpoint_resource_provider_factory_impl ||= OpenapiClient::Api::ComAdobeGraniteRestImplApiEndpointResourceProviderFactoryImpl.new(@connection)
    end

    def com_adobe_granite_rest_impl_servlet_default_get_servlet
      @com_adobe_granite_rest_impl_servlet_default_get_servlet ||= OpenapiClient::Api::ComAdobeGraniteRestImplServletDefaultGETServlet.new(@connection)
    end

    def com_adobe_granite_security_user_user_properties_service
      @com_adobe_granite_security_user_user_properties_service ||= OpenapiClient::Api::ComAdobeGraniteSecurityUserUserPropertiesService.new(@connection)
    end

    def com_adobe_granite_security_user_ui_internal_servlets_ssl_configuration_servlet
      @com_adobe_granite_security_user_ui_internal_servlets_ssl_configuration_servlet ||= OpenapiClient::Api::ComAdobeGraniteSecurityUserUiInternalServletsSSLConfigurationServlet.new(@connection)
    end

    def com_adobe_granite_socialgraph_impl_social_graph_factory_impl
      @com_adobe_granite_socialgraph_impl_social_graph_factory_impl ||= OpenapiClient::Api::ComAdobeGraniteSocialgraphImplSocialGraphFactoryImpl.new(@connection)
    end

    def com_adobe_granite_system_monitoring_impl_system_stats_m_bean_impl
      @com_adobe_granite_system_monitoring_impl_system_stats_m_bean_impl ||= OpenapiClient::Api::ComAdobeGraniteSystemMonitoringImplSystemStatsMBeanImpl.new(@connection)
    end

    def com_adobe_granite_taskmanagement_impl_jcr_task_adapter_factory
      @com_adobe_granite_taskmanagement_impl_jcr_task_adapter_factory ||= OpenapiClient::Api::ComAdobeGraniteTaskmanagementImplJcrTaskAdapterFactory.new(@connection)
    end

    def com_adobe_granite_taskmanagement_impl_jcr_task_archive_service
      @com_adobe_granite_taskmanagement_impl_jcr_task_archive_service ||= OpenapiClient::Api::ComAdobeGraniteTaskmanagementImplJcrTaskArchiveService.new(@connection)
    end

    def com_adobe_granite_taskmanagement_impl_purge_task_purge_maintenance_task
      @com_adobe_granite_taskmanagement_impl_purge_task_purge_maintenance_task ||= OpenapiClient::Api::ComAdobeGraniteTaskmanagementImplPurgeTaskPurgeMaintenanceTask.new(@connection)
    end

    def com_adobe_granite_taskmanagement_impl_service_task_manager_adapter_factory
      @com_adobe_granite_taskmanagement_impl_service_task_manager_adapter_factory ||= OpenapiClient::Api::ComAdobeGraniteTaskmanagementImplServiceTaskManagerAdapterFactory.new(@connection)
    end

    def com_adobe_granite_threaddump_thread_dump_collector
      @com_adobe_granite_threaddump_thread_dump_collector ||= OpenapiClient::Api::ComAdobeGraniteThreaddumpThreadDumpCollector.new(@connection)
    end

    def com_adobe_granite_translation_connector_msft_core_impl_microsoft_translation_service_factory_impl
      @com_adobe_granite_translation_connector_msft_core_impl_microsoft_translation_service_factory_impl ||= OpenapiClient::Api::ComAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslationServiceFactoryImpl.new(@connection)
    end

    def com_adobe_granite_translation_core_impl_translation_manager_impl
      @com_adobe_granite_translation_core_impl_translation_manager_impl ||= OpenapiClient::Api::ComAdobeGraniteTranslationCoreImplTranslationManagerImpl.new(@connection)
    end

    def com_adobe_granite_ui_clientlibs_impl_html_library_manager_impl
      @com_adobe_granite_ui_clientlibs_impl_html_library_manager_impl ||= OpenapiClient::Api::ComAdobeGraniteUiClientlibsImplHtmlLibraryManagerImpl.new(@connection)
    end

    def com_adobe_granite_workflow_console_frags_workflow_withdraw_feature
      @com_adobe_granite_workflow_console_frags_workflow_withdraw_feature ||= OpenapiClient::Api::ComAdobeGraniteWorkflowConsoleFragsWorkflowWithdrawFeature.new(@connection)
    end

    def com_adobe_granite_workflow_console_publish_workflow_publish_event_service
      @com_adobe_granite_workflow_console_publish_workflow_publish_event_service ||= OpenapiClient::Api::ComAdobeGraniteWorkflowConsolePublishWorkflowPublishEventService.new(@connection)
    end

    def com_adobe_granite_workflow_core_payload_map_cache
      @com_adobe_granite_workflow_core_payload_map_cache ||= OpenapiClient::Api::ComAdobeGraniteWorkflowCorePayloadMapCache.new(@connection)
    end

    def com_adobe_granite_workflow_core_workflow_config
      @com_adobe_granite_workflow_core_workflow_config ||= OpenapiClient::Api::ComAdobeGraniteWorkflowCoreWorkflowConfig.new(@connection)
    end

    def com_adobe_granite_workflow_core_workflow_session_factory
      @com_adobe_granite_workflow_core_workflow_session_factory ||= OpenapiClient::Api::ComAdobeGraniteWorkflowCoreWorkflowSessionFactory.new(@connection)
    end

    def com_adobe_granite_workflow_core_jcr_workflow_bucket_manager
      @com_adobe_granite_workflow_core_jcr_workflow_bucket_manager ||= OpenapiClient::Api::ComAdobeGraniteWorkflowCoreJcrWorkflowBucketManager.new(@connection)
    end

    def com_adobe_granite_workflow_core_job_external_process_job_handler
      @com_adobe_granite_workflow_core_job_external_process_job_handler ||= OpenapiClient::Api::ComAdobeGraniteWorkflowCoreJobExternalProcessJobHandler.new(@connection)
    end

    def com_adobe_granite_workflow_core_job_job_handler
      @com_adobe_granite_workflow_core_job_job_handler ||= OpenapiClient::Api::ComAdobeGraniteWorkflowCoreJobJobHandler.new(@connection)
    end

    def com_adobe_granite_workflow_core_offloading_workflow_offloading_job_consumer
      @com_adobe_granite_workflow_core_offloading_workflow_offloading_job_consumer ||= OpenapiClient::Api::ComAdobeGraniteWorkflowCoreOffloadingWorkflowOffloadingJobConsumer.new(@connection)
    end

    def com_adobe_granite_workflow_core_payloadmap_payload_move_listener
      @com_adobe_granite_workflow_core_payloadmap_payload_move_listener ||= OpenapiClient::Api::ComAdobeGraniteWorkflowCorePayloadmapPayloadMoveListener.new(@connection)
    end

    def com_adobe_granite_workflow_purge_scheduler
      @com_adobe_granite_workflow_purge_scheduler ||= OpenapiClient::Api::ComAdobeGraniteWorkflowPurgeScheduler.new(@connection)
    end

    def com_adobe_octopus_ncomm_bootstrap
      @com_adobe_octopus_ncomm_bootstrap ||= OpenapiClient::Api::ComAdobeOctopusNcommBootstrap.new(@connection)
    end

    def com_adobe_social_integrations_livefyre_user_pingforpull_impl_ping_pull_servlet
      @com_adobe_social_integrations_livefyre_user_pingforpull_impl_ping_pull_servlet ||= OpenapiClient::Api::ComAdobeSocialIntegrationsLivefyreUserPingforpullImplPingPullServlet.new(@connection)
    end

    def com_adobe_xmp_worker_files_ncomm_xmp_files_n_comm
      @com_adobe_xmp_worker_files_ncomm_xmp_files_n_comm ||= OpenapiClient::Api::ComAdobeXmpWorkerFilesNcommXMPFilesNComm.new(@connection)
    end

    def com_day_commons_datasource_jdbcpool_jdbc_pool_service
      @com_day_commons_datasource_jdbcpool_jdbc_pool_service ||= OpenapiClient::Api::ComDayCommonsDatasourceJdbcpoolJdbcPoolService.new(@connection)
    end

    def com_day_commons_httpclient
      @com_day_commons_httpclient ||= OpenapiClient::Api::ComDayCommonsHttpclient.new(@connection)
    end

    def com_day_cq_analytics_impl_store_properties_change_listener
      @com_day_cq_analytics_impl_store_properties_change_listener ||= OpenapiClient::Api::ComDayCqAnalyticsImplStorePropertiesChangeListener.new(@connection)
    end

    def com_day_cq_analytics_sitecatalyst_impl_sitecatalyst_adapter_factory
      @com_day_cq_analytics_sitecatalyst_impl_sitecatalyst_adapter_factory ||= OpenapiClient::Api::ComDayCqAnalyticsSitecatalystImplSitecatalystAdapterFactory.new(@connection)
    end

    def com_day_cq_analytics_sitecatalyst_impl_sitecatalyst_http_client_impl
      @com_day_cq_analytics_sitecatalyst_impl_sitecatalyst_http_client_impl ||= OpenapiClient::Api::ComDayCqAnalyticsSitecatalystImplSitecatalystHttpClientImpl.new(@connection)
    end

    def com_day_cq_analytics_sitecatalyst_impl_exporter_classifications_exporter
      @com_day_cq_analytics_sitecatalyst_impl_exporter_classifications_exporter ||= OpenapiClient::Api::ComDayCqAnalyticsSitecatalystImplExporterClassificationsExporter.new(@connection)
    end

    def com_day_cq_analytics_sitecatalyst_impl_importer_report_importer
      @com_day_cq_analytics_sitecatalyst_impl_importer_report_importer ||= OpenapiClient::Api::ComDayCqAnalyticsSitecatalystImplImporterReportImporter.new(@connection)
    end

    def com_day_cq_analytics_testandtarget_impl_account_options_updater
      @com_day_cq_analytics_testandtarget_impl_account_options_updater ||= OpenapiClient::Api::ComDayCqAnalyticsTestandtargetImplAccountOptionsUpdater.new(@connection)
    end

    def com_day_cq_analytics_testandtarget_impl_delete_author_activity_listener
      @com_day_cq_analytics_testandtarget_impl_delete_author_activity_listener ||= OpenapiClient::Api::ComDayCqAnalyticsTestandtargetImplDeleteAuthorActivityListener.new(@connection)
    end

    def com_day_cq_analytics_testandtarget_impl_push_author_campaign_page_listener
      @com_day_cq_analytics_testandtarget_impl_push_author_campaign_page_listener ||= OpenapiClient::Api::ComDayCqAnalyticsTestandtargetImplPushAuthorCampaignPageListener.new(@connection)
    end

    def com_day_cq_analytics_testandtarget_impl_segment_importer
      @com_day_cq_analytics_testandtarget_impl_segment_importer ||= OpenapiClient::Api::ComDayCqAnalyticsTestandtargetImplSegmentImporter.new(@connection)
    end

    def com_day_cq_analytics_testandtarget_impl_testandtarget_http_client_impl
      @com_day_cq_analytics_testandtarget_impl_testandtarget_http_client_impl ||= OpenapiClient::Api::ComDayCqAnalyticsTestandtargetImplTestandtargetHttpClientImpl.new(@connection)
    end

    def com_day_cq_analytics_testandtarget_impl_service_web_service_impl
      @com_day_cq_analytics_testandtarget_impl_service_web_service_impl ||= OpenapiClient::Api::ComDayCqAnalyticsTestandtargetImplServiceWebServiceImpl.new(@connection)
    end

    def com_day_cq_analytics_testandtarget_impl_servlets_admin_server_servlet
      @com_day_cq_analytics_testandtarget_impl_servlets_admin_server_servlet ||= OpenapiClient::Api::ComDayCqAnalyticsTestandtargetImplServletsAdminServerServlet.new(@connection)
    end

    def com_day_cq_auth_impl_login_selector_handler
      @com_day_cq_auth_impl_login_selector_handler ||= OpenapiClient::Api::ComDayCqAuthImplLoginSelectorHandler.new(@connection)
    end

    def com_day_cq_auth_impl_cug_cug_support_impl
      @com_day_cq_auth_impl_cug_cug_support_impl ||= OpenapiClient::Api::ComDayCqAuthImplCugCugSupportImpl.new(@connection)
    end

    def com_day_cq_commons_impl_externalizer_impl
      @com_day_cq_commons_impl_externalizer_impl ||= OpenapiClient::Api::ComDayCqCommonsImplExternalizerImpl.new(@connection)
    end

    def com_day_cq_commons_servlets_root_mapping_servlet
      @com_day_cq_commons_servlets_root_mapping_servlet ||= OpenapiClient::Api::ComDayCqCommonsServletsRootMappingServlet.new(@connection)
    end

    def com_day_cq_compat_codeupgrade_impl_code_upgrade_execution_condition_checker
      @com_day_cq_compat_codeupgrade_impl_code_upgrade_execution_condition_checker ||= OpenapiClient::Api::ComDayCqCompatCodeupgradeImplCodeUpgradeExecutionConditionChecker.new(@connection)
    end

    def com_day_cq_compat_codeupgrade_impl_upgrade_task_ignore_list
      @com_day_cq_compat_codeupgrade_impl_upgrade_task_ignore_list ||= OpenapiClient::Api::ComDayCqCompatCodeupgradeImplUpgradeTaskIgnoreList.new(@connection)
    end

    def com_day_cq_compat_codeupgrade_impl_version_range_task_ignorelist
      @com_day_cq_compat_codeupgrade_impl_version_range_task_ignorelist ||= OpenapiClient::Api::ComDayCqCompatCodeupgradeImplVersionRangeTaskIgnorelist.new(@connection)
    end

    def com_day_cq_contentsync_impl_content_sync_manager_impl
      @com_day_cq_contentsync_impl_content_sync_manager_impl ||= OpenapiClient::Api::ComDayCqContentsyncImplContentSyncManagerImpl.new(@connection)
    end

    def com_day_cq_dam_commons_handler_standard_image_handler
      @com_day_cq_dam_commons_handler_standard_image_handler ||= OpenapiClient::Api::ComDayCqDamCommonsHandlerStandardImageHandler.new(@connection)
    end

    def com_day_cq_dam_commons_metadata_xmp_filter_black_white
      @com_day_cq_dam_commons_metadata_xmp_filter_black_white ||= OpenapiClient::Api::ComDayCqDamCommonsMetadataXmpFilterBlackWhite.new(@connection)
    end

    def com_day_cq_dam_commons_util_impl_asset_cache_impl
      @com_day_cq_dam_commons_util_impl_asset_cache_impl ||= OpenapiClient::Api::ComDayCqDamCommonsUtilImplAssetCacheImpl.new(@connection)
    end

    def com_day_cq_dam_core_impl_asset_move_listener
      @com_day_cq_dam_core_impl_asset_move_listener ||= OpenapiClient::Api::ComDayCqDamCoreImplAssetMoveListener.new(@connection)
    end

    def com_day_cq_dam_core_impl_dam_change_event_listener
      @com_day_cq_dam_core_impl_dam_change_event_listener ||= OpenapiClient::Api::ComDayCqDamCoreImplDamChangeEventListener.new(@connection)
    end

    def com_day_cq_dam_core_impl_dam_event_purge_service
      @com_day_cq_dam_core_impl_dam_event_purge_service ||= OpenapiClient::Api::ComDayCqDamCoreImplDamEventPurgeService.new(@connection)
    end

    def com_day_cq_dam_core_impl_dam_event_recorder_impl
      @com_day_cq_dam_core_impl_dam_event_recorder_impl ||= OpenapiClient::Api::ComDayCqDamCoreImplDamEventRecorderImpl.new(@connection)
    end

    def com_day_cq_dam_core_impl_expiry_notification_job_impl
      @com_day_cq_dam_core_impl_expiry_notification_job_impl ||= OpenapiClient::Api::ComDayCqDamCoreImplExpiryNotificationJobImpl.new(@connection)
    end

    def com_day_cq_dam_core_impl_missing_metadata_notification_job
      @com_day_cq_dam_core_impl_missing_metadata_notification_job ||= OpenapiClient::Api::ComDayCqDamCoreImplMissingMetadataNotificationJob.new(@connection)
    end

    def com_day_cq_dam_core_impl_rendition_maker_impl
      @com_day_cq_dam_core_impl_rendition_maker_impl ||= OpenapiClient::Api::ComDayCqDamCoreImplRenditionMakerImpl.new(@connection)
    end

    def com_day_cq_dam_core_impl_annotation_pdf_annotation_pdf_config
      @com_day_cq_dam_core_impl_annotation_pdf_annotation_pdf_config ||= OpenapiClient::Api::ComDayCqDamCoreImplAnnotationPdfAnnotationPdfConfig.new(@connection)
    end

    def com_day_cq_dam_core_impl_assethome_asset_home_page_configuration
      @com_day_cq_dam_core_impl_assethome_asset_home_page_configuration ||= OpenapiClient::Api::ComDayCqDamCoreImplAssethomeAssetHomePageConfiguration.new(@connection)
    end

    def com_day_cq_dam_core_impl_assetlinkshare_adhoc_asset_share_proxy_servlet
      @com_day_cq_dam_core_impl_assetlinkshare_adhoc_asset_share_proxy_servlet ||= OpenapiClient::Api::ComDayCqDamCoreImplAssetlinkshareAdhocAssetShareProxyServlet.new(@connection)
    end

    def com_day_cq_dam_core_impl_cache_cq_buffered_image_cache
      @com_day_cq_dam_core_impl_cache_cq_buffered_image_cache ||= OpenapiClient::Api::ComDayCqDamCoreImplCacheCQBufferedImageCache.new(@connection)
    end

    def com_day_cq_dam_core_impl_event_dam_event_audit_listener
      @com_day_cq_dam_core_impl_event_dam_event_audit_listener ||= OpenapiClient::Api::ComDayCqDamCoreImplEventDamEventAuditListener.new(@connection)
    end

    def com_day_cq_dam_core_impl_foldermetadataschema_folder_metadata_schema_feature_flag
      @com_day_cq_dam_core_impl_foldermetadataschema_folder_metadata_schema_feature_flag ||= OpenapiClient::Api::ComDayCqDamCoreImplFoldermetadataschemaFolderMetadataSchemaFeatureFlag.new(@connection)
    end

    def com_day_cq_dam_core_impl_gfx_commons_gfx_renderer
      @com_day_cq_dam_core_impl_gfx_commons_gfx_renderer ||= OpenapiClient::Api::ComDayCqDamCoreImplGfxCommonsGfxRenderer.new(@connection)
    end

    def com_day_cq_dam_core_impl_handler_eps_format_handler
      @com_day_cq_dam_core_impl_handler_eps_format_handler ||= OpenapiClient::Api::ComDayCqDamCoreImplHandlerEPSFormatHandler.new(@connection)
    end

    def com_day_cq_dam_core_impl_handler_indesign_format_handler
      @com_day_cq_dam_core_impl_handler_indesign_format_handler ||= OpenapiClient::Api::ComDayCqDamCoreImplHandlerIndesignFormatHandler.new(@connection)
    end

    def com_day_cq_dam_core_impl_handler_jpeg_handler
      @com_day_cq_dam_core_impl_handler_jpeg_handler ||= OpenapiClient::Api::ComDayCqDamCoreImplHandlerJpegHandler.new(@connection)
    end

    def com_day_cq_dam_core_impl_handler_xmp_n_comm_xmp_handler
      @com_day_cq_dam_core_impl_handler_xmp_n_comm_xmp_handler ||= OpenapiClient::Api::ComDayCqDamCoreImplHandlerXmpNCommXMPHandler.new(@connection)
    end

    def com_day_cq_dam_core_impl_jmx_asset_index_update_monitor
      @com_day_cq_dam_core_impl_jmx_asset_index_update_monitor ||= OpenapiClient::Api::ComDayCqDamCoreImplJmxAssetIndexUpdateMonitor.new(@connection)
    end

    def com_day_cq_dam_core_impl_jmx_asset_migration_m_bean_impl
      @com_day_cq_dam_core_impl_jmx_asset_migration_m_bean_impl ||= OpenapiClient::Api::ComDayCqDamCoreImplJmxAssetMigrationMBeanImpl.new(@connection)
    end

    def com_day_cq_dam_core_impl_jmx_asset_update_monitor_impl
      @com_day_cq_dam_core_impl_jmx_asset_update_monitor_impl ||= OpenapiClient::Api::ComDayCqDamCoreImplJmxAssetUpdateMonitorImpl.new(@connection)
    end

    def com_day_cq_dam_core_impl_jobs_metadataexport_async_metadata_export_config_provider_service
      @com_day_cq_dam_core_impl_jobs_metadataexport_async_metadata_export_config_provider_service ||= OpenapiClient::Api::ComDayCqDamCoreImplJobsMetadataexportAsyncMetadataExportConfigProviderService.new(@connection)
    end

    def com_day_cq_dam_core_impl_jobs_metadataimport_async_metadata_import_config_provider_service
      @com_day_cq_dam_core_impl_jobs_metadataimport_async_metadata_import_config_provider_service ||= OpenapiClient::Api::ComDayCqDamCoreImplJobsMetadataimportAsyncMetadataImportConfigProviderService.new(@connection)
    end

    def com_day_cq_dam_core_impl_lightbox_lightbox_servlet
      @com_day_cq_dam_core_impl_lightbox_lightbox_servlet ||= OpenapiClient::Api::ComDayCqDamCoreImplLightboxLightboxServlet.new(@connection)
    end

    def com_day_cq_dam_core_impl_metadata_editor_select_component_handler
      @com_day_cq_dam_core_impl_metadata_editor_select_component_handler ||= OpenapiClient::Api::ComDayCqDamCoreImplMetadataEditorSelectComponentHandler.new(@connection)
    end

    def com_day_cq_dam_core_impl_mime_type_asset_upload_restriction_helper
      @com_day_cq_dam_core_impl_mime_type_asset_upload_restriction_helper ||= OpenapiClient::Api::ComDayCqDamCoreImplMimeTypeAssetUploadRestrictionHelper.new(@connection)
    end

    def com_day_cq_dam_core_impl_mime_type_dam_mime_type_service_impl
      @com_day_cq_dam_core_impl_mime_type_dam_mime_type_service_impl ||= OpenapiClient::Api::ComDayCqDamCoreImplMimeTypeDamMimeTypeServiceImpl.new(@connection)
    end

    def com_day_cq_dam_core_impl_process_send_transient_workflow_completed_email_process
      @com_day_cq_dam_core_impl_process_send_transient_workflow_completed_email_process ||= OpenapiClient::Api::ComDayCqDamCoreImplProcessSendTransientWorkflowCompletedEmailProcess.new(@connection)
    end

    def com_day_cq_dam_core_impl_process_text_extraction_process
      @com_day_cq_dam_core_impl_process_text_extraction_process ||= OpenapiClient::Api::ComDayCqDamCoreImplProcessTextExtractionProcess.new(@connection)
    end

    def com_day_cq_dam_core_impl_reports_report_export_service
      @com_day_cq_dam_core_impl_reports_report_export_service ||= OpenapiClient::Api::ComDayCqDamCoreImplReportsReportExportService.new(@connection)
    end

    def com_day_cq_dam_core_impl_reports_report_purge_service
      @com_day_cq_dam_core_impl_reports_report_purge_service ||= OpenapiClient::Api::ComDayCqDamCoreImplReportsReportPurgeService.new(@connection)
    end

    def com_day_cq_dam_core_impl_servlet_asset_download_servlet
      @com_day_cq_dam_core_impl_servlet_asset_download_servlet ||= OpenapiClient::Api::ComDayCqDamCoreImplServletAssetDownloadServlet.new(@connection)
    end

    def com_day_cq_dam_core_impl_servlet_asset_status_servlet
      @com_day_cq_dam_core_impl_servlet_asset_status_servlet ||= OpenapiClient::Api::ComDayCqDamCoreImplServletAssetStatusServlet.new(@connection)
    end

    def com_day_cq_dam_core_impl_servlet_asset_xmp_search_servlet
      @com_day_cq_dam_core_impl_servlet_asset_xmp_search_servlet ||= OpenapiClient::Api::ComDayCqDamCoreImplServletAssetXMPSearchServlet.new(@connection)
    end

    def com_day_cq_dam_core_impl_servlet_batch_metadata_servlet
      @com_day_cq_dam_core_impl_servlet_batch_metadata_servlet ||= OpenapiClient::Api::ComDayCqDamCoreImplServletBatchMetadataServlet.new(@connection)
    end

    def com_day_cq_dam_core_impl_servlet_binary_provider_servlet
      @com_day_cq_dam_core_impl_servlet_binary_provider_servlet ||= OpenapiClient::Api::ComDayCqDamCoreImplServletBinaryProviderServlet.new(@connection)
    end

    def com_day_cq_dam_core_impl_servlet_collection_servlet
      @com_day_cq_dam_core_impl_servlet_collection_servlet ||= OpenapiClient::Api::ComDayCqDamCoreImplServletCollectionServlet.new(@connection)
    end

    def com_day_cq_dam_core_impl_servlet_collections_servlet
      @com_day_cq_dam_core_impl_servlet_collections_servlet ||= OpenapiClient::Api::ComDayCqDamCoreImplServletCollectionsServlet.new(@connection)
    end

    def com_day_cq_dam_core_impl_servlet_companion_servlet
      @com_day_cq_dam_core_impl_servlet_companion_servlet ||= OpenapiClient::Api::ComDayCqDamCoreImplServletCompanionServlet.new(@connection)
    end

    def com_day_cq_dam_core_impl_servlet_create_asset_servlet
      @com_day_cq_dam_core_impl_servlet_create_asset_servlet ||= OpenapiClient::Api::ComDayCqDamCoreImplServletCreateAssetServlet.new(@connection)
    end

    def com_day_cq_dam_core_impl_servlet_dam_content_disposition_filter
      @com_day_cq_dam_core_impl_servlet_dam_content_disposition_filter ||= OpenapiClient::Api::ComDayCqDamCoreImplServletDamContentDispositionFilter.new(@connection)
    end

    def com_day_cq_dam_core_impl_servlet_guid_lookup_filter
      @com_day_cq_dam_core_impl_servlet_guid_lookup_filter ||= OpenapiClient::Api::ComDayCqDamCoreImplServletGuidLookupFilter.new(@connection)
    end

    def com_day_cq_dam_core_impl_servlet_health_check_servlet
      @com_day_cq_dam_core_impl_servlet_health_check_servlet ||= OpenapiClient::Api::ComDayCqDamCoreImplServletHealthCheckServlet.new(@connection)
    end

    def com_day_cq_dam_core_impl_servlet_metadata_get_servlet
      @com_day_cq_dam_core_impl_servlet_metadata_get_servlet ||= OpenapiClient::Api::ComDayCqDamCoreImplServletMetadataGetServlet.new(@connection)
    end

    def com_day_cq_dam_core_impl_servlet_multiple_license_accept_servlet
      @com_day_cq_dam_core_impl_servlet_multiple_license_accept_servlet ||= OpenapiClient::Api::ComDayCqDamCoreImplServletMultipleLicenseAcceptServlet.new(@connection)
    end

    def com_day_cq_dam_core_impl_servlet_resource_collection_servlet
      @com_day_cq_dam_core_impl_servlet_resource_collection_servlet ||= OpenapiClient::Api::ComDayCqDamCoreImplServletResourceCollectionServlet.new(@connection)
    end

    def com_day_cq_dam_core_impl_ui_preview_folder_preview_updater_impl
      @com_day_cq_dam_core_impl_ui_preview_folder_preview_updater_impl ||= OpenapiClient::Api::ComDayCqDamCoreImplUiPreviewFolderPreviewUpdaterImpl.new(@connection)
    end

    def com_day_cq_dam_core_impl_unzip_unzip_config
      @com_day_cq_dam_core_impl_unzip_unzip_config ||= OpenapiClient::Api::ComDayCqDamCoreImplUnzipUnzipConfig.new(@connection)
    end

    def com_day_cq_dam_core_process_exif_tool_extract_metadata_process
      @com_day_cq_dam_core_process_exif_tool_extract_metadata_process ||= OpenapiClient::Api::ComDayCqDamCoreProcessExifToolExtractMetadataProcess.new(@connection)
    end

    def com_day_cq_dam_core_process_extract_metadata_process
      @com_day_cq_dam_core_process_extract_metadata_process ||= OpenapiClient::Api::ComDayCqDamCoreProcessExtractMetadataProcess.new(@connection)
    end

    def com_day_cq_dam_core_process_metadata_processor_process
      @com_day_cq_dam_core_process_metadata_processor_process ||= OpenapiClient::Api::ComDayCqDamCoreProcessMetadataProcessorProcess.new(@connection)
    end

    def com_day_cq_dam_handler_ffmpeg_locator_impl
      @com_day_cq_dam_handler_ffmpeg_locator_impl ||= OpenapiClient::Api::ComDayCqDamHandlerFfmpegLocatorImpl.new(@connection)
    end

    def com_day_cq_dam_handler_gibson_fontmanager_impl_font_manager_service_impl
      @com_day_cq_dam_handler_gibson_fontmanager_impl_font_manager_service_impl ||= OpenapiClient::Api::ComDayCqDamHandlerGibsonFontmanagerImplFontManagerServiceImpl.new(@connection)
    end

    def com_day_cq_dam_handler_standard_pdf_pdf_handler
      @com_day_cq_dam_handler_standard_pdf_pdf_handler ||= OpenapiClient::Api::ComDayCqDamHandlerStandardPdfPdfHandler.new(@connection)
    end

    def com_day_cq_dam_handler_standard_ps_post_script_handler
      @com_day_cq_dam_handler_standard_ps_post_script_handler ||= OpenapiClient::Api::ComDayCqDamHandlerStandardPsPostScriptHandler.new(@connection)
    end

    def com_day_cq_dam_handler_standard_psd_psd_handler
      @com_day_cq_dam_handler_standard_psd_psd_handler ||= OpenapiClient::Api::ComDayCqDamHandlerStandardPsdPsdHandler.new(@connection)
    end

    def com_day_cq_dam_ids_impl_ids_job_processor
      @com_day_cq_dam_ids_impl_ids_job_processor ||= OpenapiClient::Api::ComDayCqDamIdsImplIDSJobProcessor.new(@connection)
    end

    def com_day_cq_dam_ids_impl_ids_pool_manager_impl
      @com_day_cq_dam_ids_impl_ids_pool_manager_impl ||= OpenapiClient::Api::ComDayCqDamIdsImplIDSPoolManagerImpl.new(@connection)
    end

    def com_day_cq_dam_indd_impl_handler_indesign_xmp_handler
      @com_day_cq_dam_indd_impl_handler_indesign_xmp_handler ||= OpenapiClient::Api::ComDayCqDamInddImplHandlerIndesignXMPHandler.new(@connection)
    end

    def com_day_cq_dam_indd_impl_servlet_snippet_creation_servlet
      @com_day_cq_dam_indd_impl_servlet_snippet_creation_servlet ||= OpenapiClient::Api::ComDayCqDamInddImplServletSnippetCreationServlet.new(@connection)
    end

    def com_day_cq_dam_indd_process_indd_media_extract_process
      @com_day_cq_dam_indd_process_indd_media_extract_process ||= OpenapiClient::Api::ComDayCqDamInddProcessINDDMediaExtractProcess.new(@connection)
    end

    def com_day_cq_dam_performance_internal_asset_performance_data_handler_impl
      @com_day_cq_dam_performance_internal_asset_performance_data_handler_impl ||= OpenapiClient::Api::ComDayCqDamPerformanceInternalAssetPerformanceDataHandlerImpl.new(@connection)
    end

    def com_day_cq_dam_performance_internal_asset_performance_report_sync_job
      @com_day_cq_dam_performance_internal_asset_performance_report_sync_job ||= OpenapiClient::Api::ComDayCqDamPerformanceInternalAssetPerformanceReportSyncJob.new(@connection)
    end

    def com_day_cq_dam_pim_impl_sourcing_upload_process_product_assets_upload_process
      @com_day_cq_dam_pim_impl_sourcing_upload_process_product_assets_upload_process ||= OpenapiClient::Api::ComDayCqDamPimImplSourcingUploadProcessProductAssetsUploadProcess.new(@connection)
    end

    def com_day_cq_dam_s7dam_common_s7dam_dam_change_event_listener
      @com_day_cq_dam_s7dam_common_s7dam_dam_change_event_listener ||= OpenapiClient::Api::ComDayCqDamS7damCommonS7damDamChangeEventListener.new(@connection)
    end

    def com_day_cq_dam_s7dam_common_analytics_impl_s7dam_dynamic_media_config_event_listener
      @com_day_cq_dam_s7dam_common_analytics_impl_s7dam_dynamic_media_config_event_listener ||= OpenapiClient::Api::ComDayCqDamS7damCommonAnalyticsImplS7damDynamicMediaConfigEventListener.new(@connection)
    end

    def com_day_cq_dam_s7dam_common_analytics_impl_site_catalyst_report_runner
      @com_day_cq_dam_s7dam_common_analytics_impl_site_catalyst_report_runner ||= OpenapiClient::Api::ComDayCqDamS7damCommonAnalyticsImplSiteCatalystReportRunner.new(@connection)
    end

    def com_day_cq_dam_s7dam_common_post_servlets_set_create_handler
      @com_day_cq_dam_s7dam_common_post_servlets_set_create_handler ||= OpenapiClient::Api::ComDayCqDamS7damCommonPostServletsSetCreateHandler.new(@connection)
    end

    def com_day_cq_dam_s7dam_common_post_servlets_set_modify_handler
      @com_day_cq_dam_s7dam_common_post_servlets_set_modify_handler ||= OpenapiClient::Api::ComDayCqDamS7damCommonPostServletsSetModifyHandler.new(@connection)
    end

    def com_day_cq_dam_s7dam_common_process_video_thumbnail_download_process
      @com_day_cq_dam_s7dam_common_process_video_thumbnail_download_process ||= OpenapiClient::Api::ComDayCqDamS7damCommonProcessVideoThumbnailDownloadProcess.new(@connection)
    end

    def com_day_cq_dam_s7dam_common_servlets_s7dam_product_info_servlet
      @com_day_cq_dam_s7dam_common_servlets_s7dam_product_info_servlet ||= OpenapiClient::Api::ComDayCqDamS7damCommonServletsS7damProductInfoServlet.new(@connection)
    end

    def com_day_cq_dam_s7dam_common_video_impl_video_proxy_client_service_impl
      @com_day_cq_dam_s7dam_common_video_impl_video_proxy_client_service_impl ||= OpenapiClient::Api::ComDayCqDamS7damCommonVideoImplVideoProxyClientServiceImpl.new(@connection)
    end

    def com_day_cq_dam_scene7_impl_scene7_api_client_impl
      @com_day_cq_dam_scene7_impl_scene7_api_client_impl ||= OpenapiClient::Api::ComDayCqDamScene7ImplScene7APIClientImpl.new(@connection)
    end

    def com_day_cq_dam_scene7_impl_scene7_asset_mime_type_service_impl
      @com_day_cq_dam_scene7_impl_scene7_asset_mime_type_service_impl ||= OpenapiClient::Api::ComDayCqDamScene7ImplScene7AssetMimeTypeServiceImpl.new(@connection)
    end

    def com_day_cq_dam_scene7_impl_scene7_configuration_event_listener
      @com_day_cq_dam_scene7_impl_scene7_configuration_event_listener ||= OpenapiClient::Api::ComDayCqDamScene7ImplScene7ConfigurationEventListener.new(@connection)
    end

    def com_day_cq_dam_scene7_impl_scene7_dam_change_event_listener
      @com_day_cq_dam_scene7_impl_scene7_dam_change_event_listener ||= OpenapiClient::Api::ComDayCqDamScene7ImplScene7DamChangeEventListener.new(@connection)
    end

    def com_day_cq_dam_scene7_impl_scene7_flash_templates_service_impl
      @com_day_cq_dam_scene7_impl_scene7_flash_templates_service_impl ||= OpenapiClient::Api::ComDayCqDamScene7ImplScene7FlashTemplatesServiceImpl.new(@connection)
    end

    def com_day_cq_dam_scene7_impl_scene7_upload_service_impl
      @com_day_cq_dam_scene7_impl_scene7_upload_service_impl ||= OpenapiClient::Api::ComDayCqDamScene7ImplScene7UploadServiceImpl.new(@connection)
    end

    def com_day_cq_dam_stock_integration_impl_cache_stock_cache_configuration_service_impl
      @com_day_cq_dam_stock_integration_impl_cache_stock_cache_configuration_service_impl ||= OpenapiClient::Api::ComDayCqDamStockIntegrationImplCacheStockCacheConfigurationServiceImpl.new(@connection)
    end

    def com_day_cq_dam_stock_integration_impl_configuration_stock_configuration_impl
      @com_day_cq_dam_stock_integration_impl_configuration_stock_configuration_impl ||= OpenapiClient::Api::ComDayCqDamStockIntegrationImplConfigurationStockConfigurationImpl.new(@connection)
    end

    def com_day_cq_dam_video_impl_servlet_video_test_servlet
      @com_day_cq_dam_video_impl_servlet_video_test_servlet ||= OpenapiClient::Api::ComDayCqDamVideoImplServletVideoTestServlet.new(@connection)
    end

    def com_day_cq_extwidget_servlets_image_sprite_servlet
      @com_day_cq_extwidget_servlets_image_sprite_servlet ||= OpenapiClient::Api::ComDayCqExtwidgetServletsImageSpriteServlet.new(@connection)
    end

    def com_day_cq_image_internal_font_font_helper
      @com_day_cq_image_internal_font_font_helper ||= OpenapiClient::Api::ComDayCqImageInternalFontFontHelper.new(@connection)
    end

    def com_day_cq_jcrclustersupport_cluster_start_level_controller
      @com_day_cq_jcrclustersupport_cluster_start_level_controller ||= OpenapiClient::Api::ComDayCqJcrclustersupportClusterStartLevelController.new(@connection)
    end

    def com_day_cq_mailer_default_mail_service
      @com_day_cq_mailer_default_mail_service ||= OpenapiClient::Api::ComDayCqMailerDefaultMailService.new(@connection)
    end

    def com_day_cq_mailer_impl_cq_mailing_service
      @com_day_cq_mailer_impl_cq_mailing_service ||= OpenapiClient::Api::ComDayCqMailerImplCqMailingService.new(@connection)
    end

    def com_day_cq_mailer_impl_email_cq_email_template_factory
      @com_day_cq_mailer_impl_email_cq_email_template_factory ||= OpenapiClient::Api::ComDayCqMailerImplEmailCqEmailTemplateFactory.new(@connection)
    end

    def com_day_cq_mailer_impl_email_cq_retriever_template_factory
      @com_day_cq_mailer_impl_email_cq_retriever_template_factory ||= OpenapiClient::Api::ComDayCqMailerImplEmailCqRetrieverTemplateFactory.new(@connection)
    end

    def com_day_cq_mcm_campaign_impl_integration_config_impl
      @com_day_cq_mcm_campaign_impl_integration_config_impl ||= OpenapiClient::Api::ComDayCqMcmCampaignImplIntegrationConfigImpl.new(@connection)
    end

    def com_day_cq_mcm_campaign_importer_personalized_text_handler_factory
      @com_day_cq_mcm_campaign_importer_personalized_text_handler_factory ||= OpenapiClient::Api::ComDayCqMcmCampaignImporterPersonalizedTextHandlerFactory.new(@connection)
    end

    def com_day_cq_mcm_core_newsletter_newsletter_email_service_impl
      @com_day_cq_mcm_core_newsletter_newsletter_email_service_impl ||= OpenapiClient::Api::ComDayCqMcmCoreNewsletterNewsletterEmailServiceImpl.new(@connection)
    end

    def com_day_cq_mcm_impl_mcm_configuration
      @com_day_cq_mcm_impl_mcm_configuration ||= OpenapiClient::Api::ComDayCqMcmImplMCMConfiguration.new(@connection)
    end

    def com_day_cq_mcm_landingpage_parser_taghandlers_cta_click_through_component_tag_handler_factory
      @com_day_cq_mcm_landingpage_parser_taghandlers_cta_click_through_component_tag_handler_factory ||= OpenapiClient::Api::ComDayCqMcmLandingpageParserTaghandlersCtaClickThroughComponentTagHandlerFactory.new(@connection)
    end

    def com_day_cq_mcm_landingpage_parser_taghandlers_cta_graphical_click_through_component_tag_handler_factory
      @com_day_cq_mcm_landingpage_parser_taghandlers_cta_graphical_click_through_component_tag_handler_factory ||= OpenapiClient::Api::ComDayCqMcmLandingpageParserTaghandlersCtaGraphicalClickThroughComponentTagHandlerFactory.new(@connection)
    end

    def com_day_cq_mcm_landingpage_parser_taghandlers_cta_lead_form_cta_component_tag_handler_factory
      @com_day_cq_mcm_landingpage_parser_taghandlers_cta_lead_form_cta_component_tag_handler_factory ||= OpenapiClient::Api::ComDayCqMcmLandingpageParserTaghandlersCtaLeadFormCTAComponentTagHandlerFactory.new(@connection)
    end

    def com_day_cq_mcm_landingpage_parser_taghandlers_mbox_m_box_experience_tag_handler_factory
      @com_day_cq_mcm_landingpage_parser_taghandlers_mbox_m_box_experience_tag_handler_factory ||= OpenapiClient::Api::ComDayCqMcmLandingpageParserTaghandlersMboxMBoxExperienceTagHandlerFactory.new(@connection)
    end

    def com_day_cq_mcm_landingpage_parser_taghandlers_mbox_target_component_tag_handler_factory
      @com_day_cq_mcm_landingpage_parser_taghandlers_mbox_target_component_tag_handler_factory ||= OpenapiClient::Api::ComDayCqMcmLandingpageParserTaghandlersMboxTargetComponentTagHandlerFactory.new(@connection)
    end

    def com_day_cq_notification_impl_notification_service_impl
      @com_day_cq_notification_impl_notification_service_impl ||= OpenapiClient::Api::ComDayCqNotificationImplNotificationServiceImpl.new(@connection)
    end

    def com_day_cq_personalization_impl_servlets_targeting_configuration_servlet
      @com_day_cq_personalization_impl_servlets_targeting_configuration_servlet ||= OpenapiClient::Api::ComDayCqPersonalizationImplServletsTargetingConfigurationServlet.new(@connection)
    end

    def com_day_cq_polling_importer_impl_managed_poll_config_impl
      @com_day_cq_polling_importer_impl_managed_poll_config_impl ||= OpenapiClient::Api::ComDayCqPollingImporterImplManagedPollConfigImpl.new(@connection)
    end

    def com_day_cq_polling_importer_impl_managed_polling_importer_impl
      @com_day_cq_polling_importer_impl_managed_polling_importer_impl ||= OpenapiClient::Api::ComDayCqPollingImporterImplManagedPollingImporterImpl.new(@connection)
    end

    def com_day_cq_polling_importer_impl_polling_importer_impl
      @com_day_cq_polling_importer_impl_polling_importer_impl ||= OpenapiClient::Api::ComDayCqPollingImporterImplPollingImporterImpl.new(@connection)
    end

    def com_day_cq_replication_audit_replication_event_listener
      @com_day_cq_replication_audit_replication_event_listener ||= OpenapiClient::Api::ComDayCqReplicationAuditReplicationEventListener.new(@connection)
    end

    def com_day_cq_replication_content_static_content_builder
      @com_day_cq_replication_content_static_content_builder ||= OpenapiClient::Api::ComDayCqReplicationContentStaticContentBuilder.new(@connection)
    end

    def com_day_cq_replication_impl_agent_manager_impl
      @com_day_cq_replication_impl_agent_manager_impl ||= OpenapiClient::Api::ComDayCqReplicationImplAgentManagerImpl.new(@connection)
    end

    def com_day_cq_replication_impl_replication_content_factory_provider_impl
      @com_day_cq_replication_impl_replication_content_factory_provider_impl ||= OpenapiClient::Api::ComDayCqReplicationImplReplicationContentFactoryProviderImpl.new(@connection)
    end

    def com_day_cq_replication_impl_replication_receiver_impl
      @com_day_cq_replication_impl_replication_receiver_impl ||= OpenapiClient::Api::ComDayCqReplicationImplReplicationReceiverImpl.new(@connection)
    end

    def com_day_cq_replication_impl_replicator_impl
      @com_day_cq_replication_impl_replicator_impl ||= OpenapiClient::Api::ComDayCqReplicationImplReplicatorImpl.new(@connection)
    end

    def com_day_cq_replication_impl_reverse_replicator
      @com_day_cq_replication_impl_reverse_replicator ||= OpenapiClient::Api::ComDayCqReplicationImplReverseReplicator.new(@connection)
    end

    def com_day_cq_replication_impl_content_durbo_binary_less_content_builder
      @com_day_cq_replication_impl_content_durbo_binary_less_content_builder ||= OpenapiClient::Api::ComDayCqReplicationImplContentDurboBinaryLessContentBuilder.new(@connection)
    end

    def com_day_cq_replication_impl_content_durbo_durbo_import_configuration_provider_service
      @com_day_cq_replication_impl_content_durbo_durbo_import_configuration_provider_service ||= OpenapiClient::Api::ComDayCqReplicationImplContentDurboDurboImportConfigurationProviderService.new(@connection)
    end

    def com_day_cq_replication_impl_transport_binary_less_transport_handler
      @com_day_cq_replication_impl_transport_binary_less_transport_handler ||= OpenapiClient::Api::ComDayCqReplicationImplTransportBinaryLessTransportHandler.new(@connection)
    end

    def com_day_cq_replication_impl_transport_http
      @com_day_cq_replication_impl_transport_http ||= OpenapiClient::Api::ComDayCqReplicationImplTransportHttp.new(@connection)
    end

    def com_day_cq_reporting_impl_config_service_impl
      @com_day_cq_reporting_impl_config_service_impl ||= OpenapiClient::Api::ComDayCqReportingImplConfigServiceImpl.new(@connection)
    end

    def com_day_cq_reporting_impl_r_log_analyzer
      @com_day_cq_reporting_impl_r_log_analyzer ||= OpenapiClient::Api::ComDayCqReportingImplRLogAnalyzer.new(@connection)
    end

    def com_day_cq_reporting_impl_cache_cache_impl
      @com_day_cq_reporting_impl_cache_cache_impl ||= OpenapiClient::Api::ComDayCqReportingImplCacheCacheImpl.new(@connection)
    end

    def com_day_cq_rewriter_linkchecker_impl_link_checker_impl
      @com_day_cq_rewriter_linkchecker_impl_link_checker_impl ||= OpenapiClient::Api::ComDayCqRewriterLinkcheckerImplLinkCheckerImpl.new(@connection)
    end

    def com_day_cq_rewriter_linkchecker_impl_link_checker_task
      @com_day_cq_rewriter_linkchecker_impl_link_checker_task ||= OpenapiClient::Api::ComDayCqRewriterLinkcheckerImplLinkCheckerTask.new(@connection)
    end

    def com_day_cq_rewriter_linkchecker_impl_link_checker_transformer_factory
      @com_day_cq_rewriter_linkchecker_impl_link_checker_transformer_factory ||= OpenapiClient::Api::ComDayCqRewriterLinkcheckerImplLinkCheckerTransformerFactory.new(@connection)
    end

    def com_day_cq_rewriter_linkchecker_impl_link_info_storage_impl
      @com_day_cq_rewriter_linkchecker_impl_link_info_storage_impl ||= OpenapiClient::Api::ComDayCqRewriterLinkcheckerImplLinkInfoStorageImpl.new(@connection)
    end

    def com_day_cq_rewriter_processor_impl_html_parser_factory
      @com_day_cq_rewriter_processor_impl_html_parser_factory ||= OpenapiClient::Api::ComDayCqRewriterProcessorImplHtmlParserFactory.new(@connection)
    end

    def com_day_cq_search_impl_builder_query_builder_impl
      @com_day_cq_search_impl_builder_query_builder_impl ||= OpenapiClient::Api::ComDayCqSearchImplBuilderQueryBuilderImpl.new(@connection)
    end

    def com_day_cq_search_suggest_impl_suggestion_index_manager_impl
      @com_day_cq_search_suggest_impl_suggestion_index_manager_impl ||= OpenapiClient::Api::ComDayCqSearchSuggestImplSuggestionIndexManagerImpl.new(@connection)
    end

    def com_day_cq_searchpromote_impl_publish_search_promote_config_handler
      @com_day_cq_searchpromote_impl_publish_search_promote_config_handler ||= OpenapiClient::Api::ComDayCqSearchpromoteImplPublishSearchPromoteConfigHandler.new(@connection)
    end

    def com_day_cq_searchpromote_impl_search_promote_service_impl
      @com_day_cq_searchpromote_impl_search_promote_service_impl ||= OpenapiClient::Api::ComDayCqSearchpromoteImplSearchPromoteServiceImpl.new(@connection)
    end

    def com_day_cq_security_acl_setup
      @com_day_cq_security_acl_setup ||= OpenapiClient::Api::ComDayCqSecurityACLSetup.new(@connection)
    end

    def com_day_cq_statistics_impl_statistics_service_impl
      @com_day_cq_statistics_impl_statistics_service_impl ||= OpenapiClient::Api::ComDayCqStatisticsImplStatisticsServiceImpl.new(@connection)
    end

    def com_day_cq_tagging_impl_jcr_tag_manager_factory_impl
      @com_day_cq_tagging_impl_jcr_tag_manager_factory_impl ||= OpenapiClient::Api::ComDayCqTaggingImplJcrTagManagerFactoryImpl.new(@connection)
    end

    def com_day_cq_tagging_impl_tag_garbage_collector
      @com_day_cq_tagging_impl_tag_garbage_collector ||= OpenapiClient::Api::ComDayCqTaggingImplTagGarbageCollector.new(@connection)
    end

    def com_day_cq_tagging_impl_search_tag_predicate_evaluator
      @com_day_cq_tagging_impl_search_tag_predicate_evaluator ||= OpenapiClient::Api::ComDayCqTaggingImplSearchTagPredicateEvaluator.new(@connection)
    end

    def com_day_cq_wcm_contentsync_impl_handler_pages_update_handler
      @com_day_cq_wcm_contentsync_impl_handler_pages_update_handler ||= OpenapiClient::Api::ComDayCqWcmContentsyncImplHandlerPagesUpdateHandler.new(@connection)
    end

    def com_day_cq_wcm_contentsync_impl_rewriter_path_rewriter_transformer_factory
      @com_day_cq_wcm_contentsync_impl_rewriter_path_rewriter_transformer_factory ||= OpenapiClient::Api::ComDayCqWcmContentsyncImplRewriterPathRewriterTransformerFactory.new(@connection)
    end

    def com_day_cq_wcm_core_wcm_request_filter
      @com_day_cq_wcm_core_wcm_request_filter ||= OpenapiClient::Api::ComDayCqWcmCoreWCMRequestFilter.new(@connection)
    end

    def com_day_cq_wcm_core_impl_authoring_ui_mode_service_impl
      @com_day_cq_wcm_core_impl_authoring_ui_mode_service_impl ||= OpenapiClient::Api::ComDayCqWcmCoreImplAuthoringUIModeServiceImpl.new(@connection)
    end

    def com_day_cq_wcm_core_impl_language_manager_impl
      @com_day_cq_wcm_core_impl_language_manager_impl ||= OpenapiClient::Api::ComDayCqWcmCoreImplLanguageManagerImpl.new(@connection)
    end

    def com_day_cq_wcm_core_impl_link_checker_configuration_factory_impl
      @com_day_cq_wcm_core_impl_link_checker_configuration_factory_impl ||= OpenapiClient::Api::ComDayCqWcmCoreImplLinkCheckerConfigurationFactoryImpl.new(@connection)
    end

    def com_day_cq_wcm_core_impl_version_manager_impl
      @com_day_cq_wcm_core_impl_version_manager_impl ||= OpenapiClient::Api::ComDayCqWcmCoreImplVersionManagerImpl.new(@connection)
    end

    def com_day_cq_wcm_core_impl_version_purge_task
      @com_day_cq_wcm_core_impl_version_purge_task ||= OpenapiClient::Api::ComDayCqWcmCoreImplVersionPurgeTask.new(@connection)
    end

    def com_day_cq_wcm_core_impl_wcm_debug_filter
      @com_day_cq_wcm_core_impl_wcm_debug_filter ||= OpenapiClient::Api::ComDayCqWcmCoreImplWCMDebugFilter.new(@connection)
    end

    def com_day_cq_wcm_core_impl_wcm_developer_mode_filter
      @com_day_cq_wcm_core_impl_wcm_developer_mode_filter ||= OpenapiClient::Api::ComDayCqWcmCoreImplWCMDeveloperModeFilter.new(@connection)
    end

    def com_day_cq_wcm_core_impl_commands_wcm_command_servlet
      @com_day_cq_wcm_core_impl_commands_wcm_command_servlet ||= OpenapiClient::Api::ComDayCqWcmCoreImplCommandsWCMCommandServlet.new(@connection)
    end

    def com_day_cq_wcm_core_impl_devicedetection_device_identification_mode_impl
      @com_day_cq_wcm_core_impl_devicedetection_device_identification_mode_impl ||= OpenapiClient::Api::ComDayCqWcmCoreImplDevicedetectionDeviceIdentificationModeImpl.new(@connection)
    end

    def com_day_cq_wcm_core_impl_event_page_event_audit_listener
      @com_day_cq_wcm_core_impl_event_page_event_audit_listener ||= OpenapiClient::Api::ComDayCqWcmCoreImplEventPageEventAuditListener.new(@connection)
    end

    def com_day_cq_wcm_core_impl_event_page_post_processor
      @com_day_cq_wcm_core_impl_event_page_post_processor ||= OpenapiClient::Api::ComDayCqWcmCoreImplEventPagePostProcessor.new(@connection)
    end

    def com_day_cq_wcm_core_impl_event_repository_change_event_listener
      @com_day_cq_wcm_core_impl_event_repository_change_event_listener ||= OpenapiClient::Api::ComDayCqWcmCoreImplEventRepositoryChangeEventListener.new(@connection)
    end

    def com_day_cq_wcm_core_impl_event_template_post_processor
      @com_day_cq_wcm_core_impl_event_template_post_processor ||= OpenapiClient::Api::ComDayCqWcmCoreImplEventTemplatePostProcessor.new(@connection)
    end

    def com_day_cq_wcm_core_impl_page_page_info_aggregator_impl
      @com_day_cq_wcm_core_impl_page_page_info_aggregator_impl ||= OpenapiClient::Api::ComDayCqWcmCoreImplPagePageInfoAggregatorImpl.new(@connection)
    end

    def com_day_cq_wcm_core_impl_page_page_manager_factory_impl
      @com_day_cq_wcm_core_impl_page_page_manager_factory_impl ||= OpenapiClient::Api::ComDayCqWcmCoreImplPagePageManagerFactoryImpl.new(@connection)
    end

    def com_day_cq_wcm_core_impl_references_content_content_reference_config
      @com_day_cq_wcm_core_impl_references_content_content_reference_config ||= OpenapiClient::Api::ComDayCqWcmCoreImplReferencesContentContentReferenceConfig.new(@connection)
    end

    def com_day_cq_wcm_core_impl_servlets_find_replace_servlet
      @com_day_cq_wcm_core_impl_servlets_find_replace_servlet ||= OpenapiClient::Api::ComDayCqWcmCoreImplServletsFindReplaceServlet.new(@connection)
    end

    def com_day_cq_wcm_core_impl_servlets_reference_search_servlet
      @com_day_cq_wcm_core_impl_servlets_reference_search_servlet ||= OpenapiClient::Api::ComDayCqWcmCoreImplServletsReferenceSearchServlet.new(@connection)
    end

    def com_day_cq_wcm_core_impl_servlets_thumbnail_servlet
      @com_day_cq_wcm_core_impl_servlets_thumbnail_servlet ||= OpenapiClient::Api::ComDayCqWcmCoreImplServletsThumbnailServlet.new(@connection)
    end

    def com_day_cq_wcm_core_impl_servlets_contentfinder_asset_view_handler
      @com_day_cq_wcm_core_impl_servlets_contentfinder_asset_view_handler ||= OpenapiClient::Api::ComDayCqWcmCoreImplServletsContentfinderAssetViewHandler.new(@connection)
    end

    def com_day_cq_wcm_core_impl_servlets_contentfinder_page_view_handler
      @com_day_cq_wcm_core_impl_servlets_contentfinder_page_view_handler ||= OpenapiClient::Api::ComDayCqWcmCoreImplServletsContentfinderPageViewHandler.new(@connection)
    end

    def com_day_cq_wcm_core_impl_servlets_contentfinder_connector_connector_view_handler
      @com_day_cq_wcm_core_impl_servlets_contentfinder_connector_connector_view_handler ||= OpenapiClient::Api::ComDayCqWcmCoreImplServletsContentfinderConnectorConnectorViewHandler.new(@connection)
    end

    def com_day_cq_wcm_core_impl_utils_default_page_name_validator
      @com_day_cq_wcm_core_impl_utils_default_page_name_validator ||= OpenapiClient::Api::ComDayCqWcmCoreImplUtilsDefaultPageNameValidator.new(@connection)
    end

    def com_day_cq_wcm_core_impl_variants_page_variants_provider_impl
      @com_day_cq_wcm_core_impl_variants_page_variants_provider_impl ||= OpenapiClient::Api::ComDayCqWcmCoreImplVariantsPageVariantsProviderImpl.new(@connection)
    end

    def com_day_cq_wcm_core_impl_warp_time_warp_filter
      @com_day_cq_wcm_core_impl_warp_time_warp_filter ||= OpenapiClient::Api::ComDayCqWcmCoreImplWarpTimeWarpFilter.new(@connection)
    end

    def com_day_cq_wcm_core_mvt_mvt_statistics_impl
      @com_day_cq_wcm_core_mvt_mvt_statistics_impl ||= OpenapiClient::Api::ComDayCqWcmCoreMvtMVTStatisticsImpl.new(@connection)
    end

    def com_day_cq_wcm_core_stats_page_view_statistics_impl
      @com_day_cq_wcm_core_stats_page_view_statistics_impl ||= OpenapiClient::Api::ComDayCqWcmCoreStatsPageViewStatisticsImpl.new(@connection)
    end

    def com_day_cq_wcm_designimporter_design_package_importer
      @com_day_cq_wcm_designimporter_design_package_importer ||= OpenapiClient::Api::ComDayCqWcmDesignimporterDesignPackageImporter.new(@connection)
    end

    def com_day_cq_wcm_designimporter_impl_canvas_builder_impl
      @com_day_cq_wcm_designimporter_impl_canvas_builder_impl ||= OpenapiClient::Api::ComDayCqWcmDesignimporterImplCanvasBuilderImpl.new(@connection)
    end

    def com_day_cq_wcm_designimporter_impl_canvas_page_delete_handler
      @com_day_cq_wcm_designimporter_impl_canvas_page_delete_handler ||= OpenapiClient::Api::ComDayCqWcmDesignimporterImplCanvasPageDeleteHandler.new(@connection)
    end

    def com_day_cq_wcm_designimporter_impl_entry_preprocessor_impl
      @com_day_cq_wcm_designimporter_impl_entry_preprocessor_impl ||= OpenapiClient::Api::ComDayCqWcmDesignimporterImplEntryPreprocessorImpl.new(@connection)
    end

    def com_day_cq_wcm_designimporter_impl_mobile_canvas_builder_impl
      @com_day_cq_wcm_designimporter_impl_mobile_canvas_builder_impl ||= OpenapiClient::Api::ComDayCqWcmDesignimporterImplMobileCanvasBuilderImpl.new(@connection)
    end

    def com_day_cq_wcm_designimporter_parser_taghandlers_factory_canvas_component_tag_handler_factory
      @com_day_cq_wcm_designimporter_parser_taghandlers_factory_canvas_component_tag_handler_factory ||= OpenapiClient::Api::ComDayCqWcmDesignimporterParserTaghandlersFactoryCanvasComponentTagHandlerFactory.new(@connection)
    end

    def com_day_cq_wcm_designimporter_parser_taghandlers_factory_default_component_tag_handler_factory
      @com_day_cq_wcm_designimporter_parser_taghandlers_factory_default_component_tag_handler_factory ||= OpenapiClient::Api::ComDayCqWcmDesignimporterParserTaghandlersFactoryDefaultComponentTagHandlerFactory.new(@connection)
    end

    def com_day_cq_wcm_designimporter_parser_taghandlers_factory_default_tag_handler_factory
      @com_day_cq_wcm_designimporter_parser_taghandlers_factory_default_tag_handler_factory ||= OpenapiClient::Api::ComDayCqWcmDesignimporterParserTaghandlersFactoryDefaultTagHandlerFactory.new(@connection)
    end

    def com_day_cq_wcm_designimporter_parser_taghandlers_factory_head_tag_handler_factory
      @com_day_cq_wcm_designimporter_parser_taghandlers_factory_head_tag_handler_factory ||= OpenapiClient::Api::ComDayCqWcmDesignimporterParserTaghandlersFactoryHeadTagHandlerFactory.new(@connection)
    end

    def com_day_cq_wcm_designimporter_parser_taghandlers_factory_i_frame_tag_handler_factory
      @com_day_cq_wcm_designimporter_parser_taghandlers_factory_i_frame_tag_handler_factory ||= OpenapiClient::Api::ComDayCqWcmDesignimporterParserTaghandlersFactoryIFrameTagHandlerFactory.new(@connection)
    end

    def com_day_cq_wcm_designimporter_parser_taghandlers_factory_image_component_tag_handler_factory
      @com_day_cq_wcm_designimporter_parser_taghandlers_factory_image_component_tag_handler_factory ||= OpenapiClient::Api::ComDayCqWcmDesignimporterParserTaghandlersFactoryImageComponentTagHandlerFactory.new(@connection)
    end

    def com_day_cq_wcm_designimporter_parser_taghandlers_factory_img_tag_handler_factory
      @com_day_cq_wcm_designimporter_parser_taghandlers_factory_img_tag_handler_factory ||= OpenapiClient::Api::ComDayCqWcmDesignimporterParserTaghandlersFactoryImgTagHandlerFactory.new(@connection)
    end

    def com_day_cq_wcm_designimporter_parser_taghandlers_factory_inline_script_tag_handler_factory
      @com_day_cq_wcm_designimporter_parser_taghandlers_factory_inline_script_tag_handler_factory ||= OpenapiClient::Api::ComDayCqWcmDesignimporterParserTaghandlersFactoryInlineScriptTagHandlerFactory.new(@connection)
    end

    def com_day_cq_wcm_designimporter_parser_taghandlers_factory_link_tag_handler_factory
      @com_day_cq_wcm_designimporter_parser_taghandlers_factory_link_tag_handler_factory ||= OpenapiClient::Api::ComDayCqWcmDesignimporterParserTaghandlersFactoryLinkTagHandlerFactory.new(@connection)
    end

    def com_day_cq_wcm_designimporter_parser_taghandlers_factory_meta_tag_handler_factory
      @com_day_cq_wcm_designimporter_parser_taghandlers_factory_meta_tag_handler_factory ||= OpenapiClient::Api::ComDayCqWcmDesignimporterParserTaghandlersFactoryMetaTagHandlerFactory.new(@connection)
    end

    def com_day_cq_wcm_designimporter_parser_taghandlers_factory_non_script_tag_handler_factory
      @com_day_cq_wcm_designimporter_parser_taghandlers_factory_non_script_tag_handler_factory ||= OpenapiClient::Api::ComDayCqWcmDesignimporterParserTaghandlersFactoryNonScriptTagHandlerFactory.new(@connection)
    end

    def com_day_cq_wcm_designimporter_parser_taghandlers_factory_parsys_component_tag_handler_factory
      @com_day_cq_wcm_designimporter_parser_taghandlers_factory_parsys_component_tag_handler_factory ||= OpenapiClient::Api::ComDayCqWcmDesignimporterParserTaghandlersFactoryParsysComponentTagHandlerFactory.new(@connection)
    end

    def com_day_cq_wcm_designimporter_parser_taghandlers_factory_script_tag_handler_factory
      @com_day_cq_wcm_designimporter_parser_taghandlers_factory_script_tag_handler_factory ||= OpenapiClient::Api::ComDayCqWcmDesignimporterParserTaghandlersFactoryScriptTagHandlerFactory.new(@connection)
    end

    def com_day_cq_wcm_designimporter_parser_taghandlers_factory_style_tag_handler_factory
      @com_day_cq_wcm_designimporter_parser_taghandlers_factory_style_tag_handler_factory ||= OpenapiClient::Api::ComDayCqWcmDesignimporterParserTaghandlersFactoryStyleTagHandlerFactory.new(@connection)
    end

    def com_day_cq_wcm_designimporter_parser_taghandlers_factory_text_component_tag_handler_factory
      @com_day_cq_wcm_designimporter_parser_taghandlers_factory_text_component_tag_handler_factory ||= OpenapiClient::Api::ComDayCqWcmDesignimporterParserTaghandlersFactoryTextComponentTagHandlerFactory.new(@connection)
    end

    def com_day_cq_wcm_designimporter_parser_taghandlers_factory_title_component_tag_handler_factory
      @com_day_cq_wcm_designimporter_parser_taghandlers_factory_title_component_tag_handler_factory ||= OpenapiClient::Api::ComDayCqWcmDesignimporterParserTaghandlersFactoryTitleComponentTagHandlerFactory.new(@connection)
    end

    def com_day_cq_wcm_designimporter_parser_taghandlers_factory_title_tag_handler_factory
      @com_day_cq_wcm_designimporter_parser_taghandlers_factory_title_tag_handler_factory ||= OpenapiClient::Api::ComDayCqWcmDesignimporterParserTaghandlersFactoryTitleTagHandlerFactory.new(@connection)
    end

    def com_day_cq_wcm_foundation_forms_impl_form_chooser_servlet
      @com_day_cq_wcm_foundation_forms_impl_form_chooser_servlet ||= OpenapiClient::Api::ComDayCqWcmFoundationFormsImplFormChooserServlet.new(@connection)
    end

    def com_day_cq_wcm_foundation_forms_impl_form_paragraph_post_processor
      @com_day_cq_wcm_foundation_forms_impl_form_paragraph_post_processor ||= OpenapiClient::Api::ComDayCqWcmFoundationFormsImplFormParagraphPostProcessor.new(@connection)
    end

    def com_day_cq_wcm_foundation_forms_impl_forms_handling_servlet
      @com_day_cq_wcm_foundation_forms_impl_forms_handling_servlet ||= OpenapiClient::Api::ComDayCqWcmFoundationFormsImplFormsHandlingServlet.new(@connection)
    end

    def com_day_cq_wcm_foundation_forms_impl_mail_servlet
      @com_day_cq_wcm_foundation_forms_impl_mail_servlet ||= OpenapiClient::Api::ComDayCqWcmFoundationFormsImplMailServlet.new(@connection)
    end

    def com_day_cq_wcm_foundation_impl_adaptive_image_component_servlet
      @com_day_cq_wcm_foundation_impl_adaptive_image_component_servlet ||= OpenapiClient::Api::ComDayCqWcmFoundationImplAdaptiveImageComponentServlet.new(@connection)
    end

    def com_day_cq_wcm_foundation_impl_http_auth_handler
      @com_day_cq_wcm_foundation_impl_http_auth_handler ||= OpenapiClient::Api::ComDayCqWcmFoundationImplHTTPAuthHandler.new(@connection)
    end

    def com_day_cq_wcm_foundation_impl_page_impressions_tracker
      @com_day_cq_wcm_foundation_impl_page_impressions_tracker ||= OpenapiClient::Api::ComDayCqWcmFoundationImplPageImpressionsTracker.new(@connection)
    end

    def com_day_cq_wcm_foundation_impl_page_redirect_servlet
      @com_day_cq_wcm_foundation_impl_page_redirect_servlet ||= OpenapiClient::Api::ComDayCqWcmFoundationImplPageRedirectServlet.new(@connection)
    end

    def com_day_cq_wcm_foundation_security_impl_default_attachment_type_blacklist_service
      @com_day_cq_wcm_foundation_security_impl_default_attachment_type_blacklist_service ||= OpenapiClient::Api::ComDayCqWcmFoundationSecurityImplDefaultAttachmentTypeBlacklistService.new(@connection)
    end

    def com_day_cq_wcm_foundation_security_impl_safer_sling_post_validator_impl
      @com_day_cq_wcm_foundation_security_impl_safer_sling_post_validator_impl ||= OpenapiClient::Api::ComDayCqWcmFoundationSecurityImplSaferSlingPostValidatorImpl.new(@connection)
    end

    def com_day_cq_wcm_mobile_core_impl_device_device_info_transformer_factory
      @com_day_cq_wcm_mobile_core_impl_device_device_info_transformer_factory ||= OpenapiClient::Api::ComDayCqWcmMobileCoreImplDeviceDeviceInfoTransformerFactory.new(@connection)
    end

    def com_day_cq_wcm_mobile_core_impl_redirect_redirect_filter
      @com_day_cq_wcm_mobile_core_impl_redirect_redirect_filter ||= OpenapiClient::Api::ComDayCqWcmMobileCoreImplRedirectRedirectFilter.new(@connection)
    end

    def com_day_cq_wcm_msm_impl_live_relationship_manager_impl
      @com_day_cq_wcm_msm_impl_live_relationship_manager_impl ||= OpenapiClient::Api::ComDayCqWcmMsmImplLiveRelationshipManagerImpl.new(@connection)
    end

    def com_day_cq_wcm_msm_impl_rollout_manager_impl
      @com_day_cq_wcm_msm_impl_rollout_manager_impl ||= OpenapiClient::Api::ComDayCqWcmMsmImplRolloutManagerImpl.new(@connection)
    end

    def com_day_cq_wcm_msm_impl_actions_content_copy_action_factory
      @com_day_cq_wcm_msm_impl_actions_content_copy_action_factory ||= OpenapiClient::Api::ComDayCqWcmMsmImplActionsContentCopyActionFactory.new(@connection)
    end

    def com_day_cq_wcm_msm_impl_actions_content_delete_action_factory
      @com_day_cq_wcm_msm_impl_actions_content_delete_action_factory ||= OpenapiClient::Api::ComDayCqWcmMsmImplActionsContentDeleteActionFactory.new(@connection)
    end

    def com_day_cq_wcm_msm_impl_actions_content_update_action_factory
      @com_day_cq_wcm_msm_impl_actions_content_update_action_factory ||= OpenapiClient::Api::ComDayCqWcmMsmImplActionsContentUpdateActionFactory.new(@connection)
    end

    def com_day_cq_wcm_msm_impl_actions_order_children_action_factory
      @com_day_cq_wcm_msm_impl_actions_order_children_action_factory ||= OpenapiClient::Api::ComDayCqWcmMsmImplActionsOrderChildrenActionFactory.new(@connection)
    end

    def com_day_cq_wcm_msm_impl_actions_page_move_action_factory
      @com_day_cq_wcm_msm_impl_actions_page_move_action_factory ||= OpenapiClient::Api::ComDayCqWcmMsmImplActionsPageMoveActionFactory.new(@connection)
    end

    def com_day_cq_wcm_msm_impl_actions_references_update_action_factory
      @com_day_cq_wcm_msm_impl_actions_references_update_action_factory ||= OpenapiClient::Api::ComDayCqWcmMsmImplActionsReferencesUpdateActionFactory.new(@connection)
    end

    def com_day_cq_wcm_msm_impl_actions_version_copy_action_factory
      @com_day_cq_wcm_msm_impl_actions_version_copy_action_factory ||= OpenapiClient::Api::ComDayCqWcmMsmImplActionsVersionCopyActionFactory.new(@connection)
    end

    def com_day_cq_wcm_msm_impl_servlets_audit_log_servlet
      @com_day_cq_wcm_msm_impl_servlets_audit_log_servlet ||= OpenapiClient::Api::ComDayCqWcmMsmImplServletsAuditLogServlet.new(@connection)
    end

    def com_day_cq_wcm_notification_email_impl_email_channel
      @com_day_cq_wcm_notification_email_impl_email_channel ||= OpenapiClient::Api::ComDayCqWcmNotificationEmailImplEmailChannel.new(@connection)
    end

    def com_day_cq_wcm_notification_impl_notification_manager_impl
      @com_day_cq_wcm_notification_impl_notification_manager_impl ||= OpenapiClient::Api::ComDayCqWcmNotificationImplNotificationManagerImpl.new(@connection)
    end

    def com_day_cq_wcm_scripting_impl_bvp_manager
      @com_day_cq_wcm_scripting_impl_bvp_manager ||= OpenapiClient::Api::ComDayCqWcmScriptingImplBVPManager.new(@connection)
    end

    def com_day_cq_wcm_undo_undo_config
      @com_day_cq_wcm_undo_undo_config ||= OpenapiClient::Api::ComDayCqWcmUndoUndoConfig.new(@connection)
    end

    def com_day_cq_wcm_webservicesupport_impl_replication_event_listener
      @com_day_cq_wcm_webservicesupport_impl_replication_event_listener ||= OpenapiClient::Api::ComDayCqWcmWebservicesupportImplReplicationEventListener.new(@connection)
    end

    def com_day_cq_wcm_workflow_impl_wcm_workflow_service_impl
      @com_day_cq_wcm_workflow_impl_wcm_workflow_service_impl ||= OpenapiClient::Api::ComDayCqWcmWorkflowImplWcmWorkflowServiceImpl.new(@connection)
    end

    def com_day_cq_wcm_workflow_impl_workflow_package_info_provider
      @com_day_cq_wcm_workflow_impl_workflow_package_info_provider ||= OpenapiClient::Api::ComDayCqWcmWorkflowImplWorkflowPackageInfoProvider.new(@connection)
    end

    def com_day_cq_widget_impl_html_library_manager_impl
      @com_day_cq_widget_impl_html_library_manager_impl ||= OpenapiClient::Api::ComDayCqWidgetImplHtmlLibraryManagerImpl.new(@connection)
    end

    def com_day_cq_widget_impl_widget_extension_provider_impl
      @com_day_cq_widget_impl_widget_extension_provider_impl ||= OpenapiClient::Api::ComDayCqWidgetImplWidgetExtensionProviderImpl.new(@connection)
    end

    def com_day_cq_workflow_impl_email_e_mail_notification_service
      @com_day_cq_workflow_impl_email_e_mail_notification_service ||= OpenapiClient::Api::ComDayCqWorkflowImplEmailEMailNotificationService.new(@connection)
    end

    def com_day_cq_workflow_impl_email_task_e_mail_notification_service
      @com_day_cq_workflow_impl_email_task_e_mail_notification_service ||= OpenapiClient::Api::ComDayCqWorkflowImplEmailTaskEMailNotificationService.new(@connection)
    end

    def com_day_crx_security_token_impl_token_cleanup_task
      @com_day_crx_security_token_impl_token_cleanup_task ||= OpenapiClient::Api::ComDayCrxSecurityTokenImplTokenCleanupTask.new(@connection)
    end

    def com_day_crx_security_token_impl_impl_token_authentication_handler
      @com_day_crx_security_token_impl_impl_token_authentication_handler ||= OpenapiClient::Api::ComDayCrxSecurityTokenImplImplTokenAuthenticationHandler.new(@connection)
    end

    def org_apache_aries_jmx_framework_state_config
      @org_apache_aries_jmx_framework_state_config ||= OpenapiClient::Api::OrgApacheAriesJmxFrameworkStateConfig.new(@connection)
    end

    def org_apache_felix_eventadmin_impl_event_admin
      @org_apache_felix_eventadmin_impl_event_admin ||= OpenapiClient::Api::OrgApacheFelixEventadminImplEventAdmin.new(@connection)
    end

    def org_apache_felix_http
      @org_apache_felix_http ||= OpenapiClient::Api::OrgApacheFelixHttp.new(@connection)
    end

    def org_apache_felix_http_sslfilter_ssl_filter
      @org_apache_felix_http_sslfilter_ssl_filter ||= OpenapiClient::Api::OrgApacheFelixHttpSslfilterSslFilter.new(@connection)
    end

    def org_apache_felix_jaas_configuration_factory
      @org_apache_felix_jaas_configuration_factory ||= OpenapiClient::Api::OrgApacheFelixJaasConfigurationFactory.new(@connection)
    end

    def org_apache_felix_jaas_configuration_spi
      @org_apache_felix_jaas_configuration_spi ||= OpenapiClient::Api::OrgApacheFelixJaasConfigurationSpi.new(@connection)
    end

    def org_apache_felix_scr_scr_service
      @org_apache_felix_scr_scr_service ||= OpenapiClient::Api::OrgApacheFelixScrScrService.new(@connection)
    end

    def org_apache_felix_systemready_system_ready_monitor
      @org_apache_felix_systemready_system_ready_monitor ||= OpenapiClient::Api::OrgApacheFelixSystemreadySystemReadyMonitor.new(@connection)
    end

    def org_apache_felix_systemready_impl_components_check
      @org_apache_felix_systemready_impl_components_check ||= OpenapiClient::Api::OrgApacheFelixSystemreadyImplComponentsCheck.new(@connection)
    end

    def org_apache_felix_systemready_impl_framework_start_check
      @org_apache_felix_systemready_impl_framework_start_check ||= OpenapiClient::Api::OrgApacheFelixSystemreadyImplFrameworkStartCheck.new(@connection)
    end

    def org_apache_felix_systemready_impl_services_check
      @org_apache_felix_systemready_impl_services_check ||= OpenapiClient::Api::OrgApacheFelixSystemreadyImplServicesCheck.new(@connection)
    end

    def org_apache_felix_systemready_impl_servlet_system_alive_servlet
      @org_apache_felix_systemready_impl_servlet_system_alive_servlet ||= OpenapiClient::Api::OrgApacheFelixSystemreadyImplServletSystemAliveServlet.new(@connection)
    end

    def org_apache_felix_systemready_impl_servlet_system_ready_servlet
      @org_apache_felix_systemready_impl_servlet_system_ready_servlet ||= OpenapiClient::Api::OrgApacheFelixSystemreadyImplServletSystemReadyServlet.new(@connection)
    end

    def org_apache_felix_webconsole_internal_servlet_osgi_manager
      @org_apache_felix_webconsole_internal_servlet_osgi_manager ||= OpenapiClient::Api::OrgApacheFelixWebconsoleInternalServletOsgiManager.new(@connection)
    end

    def org_apache_felix_webconsole_plugins_event_internal_plugin_servlet
      @org_apache_felix_webconsole_plugins_event_internal_plugin_servlet ||= OpenapiClient::Api::OrgApacheFelixWebconsolePluginsEventInternalPluginServlet.new(@connection)
    end

    def org_apache_felix_webconsole_plugins_memoryusage_internal_memory_usage_configurator
      @org_apache_felix_webconsole_plugins_memoryusage_internal_memory_usage_configurator ||= OpenapiClient::Api::OrgApacheFelixWebconsolePluginsMemoryusageInternalMemoryUsageConfigurator.new(@connection)
    end

    def org_apache_http_proxyconfigurator
      @org_apache_http_proxyconfigurator ||= OpenapiClient::Api::OrgApacheHttpProxyconfigurator.new(@connection)
    end

    def org_apache_jackrabbit_oak_plugins_blob_datastore_data_store_text_provider_service
      @org_apache_jackrabbit_oak_plugins_blob_datastore_data_store_text_provider_service ||= OpenapiClient::Api::OrgApacheJackrabbitOakPluginsBlobDatastoreDataStoreTextProviderService.new(@connection)
    end

    def org_apache_jackrabbit_oak_plugins_blob_datastore_file_data_store
      @org_apache_jackrabbit_oak_plugins_blob_datastore_file_data_store ||= OpenapiClient::Api::OrgApacheJackrabbitOakPluginsBlobDatastoreFileDataStore.new(@connection)
    end

    def org_apache_jackrabbit_oak_plugins_document_document_node_store_service
      @org_apache_jackrabbit_oak_plugins_document_document_node_store_service ||= OpenapiClient::Api::OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreService.new(@connection)
    end

    def org_apache_jackrabbit_oak_plugins_document_document_node_store_service_preset
      @org_apache_jackrabbit_oak_plugins_document_document_node_store_service_preset ||= OpenapiClient::Api::OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServicePreset.new(@connection)
    end

    def org_apache_jackrabbit_oak_plugins_document_secondary_secondary_store_cache_service
      @org_apache_jackrabbit_oak_plugins_document_secondary_secondary_store_cache_service ||= OpenapiClient::Api::OrgApacheJackrabbitOakPluginsDocumentSecondarySecondaryStoreCacheService.new(@connection)
    end

    def org_apache_jackrabbit_oak_plugins_index_async_indexer_service
      @org_apache_jackrabbit_oak_plugins_index_async_indexer_service ||= OpenapiClient::Api::OrgApacheJackrabbitOakPluginsIndexAsyncIndexerService.new(@connection)
    end

    def org_apache_jackrabbit_oak_plugins_index_lucene_lucene_index_provider_service
      @org_apache_jackrabbit_oak_plugins_index_lucene_lucene_index_provider_service ||= OpenapiClient::Api::OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderService.new(@connection)
    end

    def org_apache_jackrabbit_oak_plugins_index_solr_osgi_embedded_solr_server_configuration_provider
      @org_apache_jackrabbit_oak_plugins_index_solr_osgi_embedded_solr_server_configuration_provider ||= OpenapiClient::Api::OrgApacheJackrabbitOakPluginsIndexSolrOsgiEmbeddedSolrServerConfigurationProvider.new(@connection)
    end

    def org_apache_jackrabbit_oak_plugins_index_solr_osgi_node_state_solr_servers_observer_service
      @org_apache_jackrabbit_oak_plugins_index_solr_osgi_node_state_solr_servers_observer_service ||= OpenapiClient::Api::OrgApacheJackrabbitOakPluginsIndexSolrOsgiNodeStateSolrServersObserverService.new(@connection)
    end

    def org_apache_jackrabbit_oak_plugins_index_solr_osgi_oak_solr_configuration_provider_service
      @org_apache_jackrabbit_oak_plugins_index_solr_osgi_oak_solr_configuration_provider_service ||= OpenapiClient::Api::OrgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfigurationProviderService.new(@connection)
    end

    def org_apache_jackrabbit_oak_plugins_index_solr_osgi_remote_solr_server_configuration_provider
      @org_apache_jackrabbit_oak_plugins_index_solr_osgi_remote_solr_server_configuration_provider ||= OpenapiClient::Api::OrgApacheJackrabbitOakPluginsIndexSolrOsgiRemoteSolrServerConfigurationProvider.new(@connection)
    end

    def org_apache_jackrabbit_oak_plugins_index_solr_osgi_solr_query_index_provider_service
      @org_apache_jackrabbit_oak_plugins_index_solr_osgi_solr_query_index_provider_service ||= OpenapiClient::Api::OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrQueryIndexProviderService.new(@connection)
    end

    def org_apache_jackrabbit_oak_plugins_index_solr_osgi_solr_server_provider_service
      @org_apache_jackrabbit_oak_plugins_index_solr_osgi_solr_server_provider_service ||= OpenapiClient::Api::OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrServerProviderService.new(@connection)
    end

    def org_apache_jackrabbit_oak_plugins_metric_statistics_provider_factory
      @org_apache_jackrabbit_oak_plugins_metric_statistics_provider_factory ||= OpenapiClient::Api::OrgApacheJackrabbitOakPluginsMetricStatisticsProviderFactory.new(@connection)
    end

    def org_apache_jackrabbit_oak_plugins_observation_change_collector_provider
      @org_apache_jackrabbit_oak_plugins_observation_change_collector_provider ||= OpenapiClient::Api::OrgApacheJackrabbitOakPluginsObservationChangeCollectorProvider.new(@connection)
    end

    def org_apache_jackrabbit_oak_query_query_engine_settings_service
      @org_apache_jackrabbit_oak_query_query_engine_settings_service ||= OpenapiClient::Api::OrgApacheJackrabbitOakQueryQueryEngineSettingsService.new(@connection)
    end

    def org_apache_jackrabbit_oak_security_authentication_authentication_configuration_impl
      @org_apache_jackrabbit_oak_security_authentication_authentication_configuration_impl ||= OpenapiClient::Api::OrgApacheJackrabbitOakSecurityAuthenticationAuthenticationConfigurationImpl.new(@connection)
    end

    def org_apache_jackrabbit_oak_security_authentication_ldap_impl_ldap_identity_provider
      @org_apache_jackrabbit_oak_security_authentication_ldap_impl_ldap_identity_provider ||= OpenapiClient::Api::OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentityProvider.new(@connection)
    end

    def org_apache_jackrabbit_oak_security_authentication_token_token_configuration_impl
      @org_apache_jackrabbit_oak_security_authentication_token_token_configuration_impl ||= OpenapiClient::Api::OrgApacheJackrabbitOakSecurityAuthenticationTokenTokenConfigurationImpl.new(@connection)
    end

    def org_apache_jackrabbit_oak_security_authorization_authorization_configuration_impl
      @org_apache_jackrabbit_oak_security_authorization_authorization_configuration_impl ||= OpenapiClient::Api::OrgApacheJackrabbitOakSecurityAuthorizationAuthorizationConfigurationImpl.new(@connection)
    end

    def org_apache_jackrabbit_oak_security_internal_security_provider_registration
      @org_apache_jackrabbit_oak_security_internal_security_provider_registration ||= OpenapiClient::Api::OrgApacheJackrabbitOakSecurityInternalSecurityProviderRegistration.new(@connection)
    end

    def org_apache_jackrabbit_oak_security_user_random_authorizable_node_name
      @org_apache_jackrabbit_oak_security_user_random_authorizable_node_name ||= OpenapiClient::Api::OrgApacheJackrabbitOakSecurityUserRandomAuthorizableNodeName.new(@connection)
    end

    def org_apache_jackrabbit_oak_security_user_user_configuration_impl
      @org_apache_jackrabbit_oak_security_user_user_configuration_impl ||= OpenapiClient::Api::OrgApacheJackrabbitOakSecurityUserUserConfigurationImpl.new(@connection)
    end

    def org_apache_jackrabbit_oak_segment_segment_node_store_factory
      @org_apache_jackrabbit_oak_segment_segment_node_store_factory ||= OpenapiClient::Api::OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactory.new(@connection)
    end

    def org_apache_jackrabbit_oak_segment_segment_node_store_monitor_service
      @org_apache_jackrabbit_oak_segment_segment_node_store_monitor_service ||= OpenapiClient::Api::OrgApacheJackrabbitOakSegmentSegmentNodeStoreMonitorService.new(@connection)
    end

    def org_apache_jackrabbit_oak_segment_segment_node_store_service
      @org_apache_jackrabbit_oak_segment_segment_node_store_service ||= OpenapiClient::Api::OrgApacheJackrabbitOakSegmentSegmentNodeStoreService.new(@connection)
    end

    def org_apache_jackrabbit_oak_segment_azure_azure_segment_store_service
      @org_apache_jackrabbit_oak_segment_azure_azure_segment_store_service ||= OpenapiClient::Api::OrgApacheJackrabbitOakSegmentAzureAzureSegmentStoreService.new(@connection)
    end

    def org_apache_jackrabbit_oak_segment_standby_store_standby_store_service
      @org_apache_jackrabbit_oak_segment_standby_store_standby_store_service ||= OpenapiClient::Api::OrgApacheJackrabbitOakSegmentStandbyStoreStandbyStoreService.new(@connection)
    end

    def org_apache_jackrabbit_oak_spi_security_authentication_external_impl_default_sync_handler
      @org_apache_jackrabbit_oak_spi_security_authentication_external_impl_default_sync_handler ||= OpenapiClient::Api::OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplDefaultSyncHandler.new(@connection)
    end

    def org_apache_jackrabbit_oak_spi_security_authentication_external_impl_external_login_module_factory
      @org_apache_jackrabbit_oak_spi_security_authentication_external_impl_external_login_module_factory ||= OpenapiClient::Api::OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplExternalLoginModuleFactory.new(@connection)
    end

    def org_apache_jackrabbit_oak_spi_security_authentication_external_impl_principal_external_principal_configuration
      @org_apache_jackrabbit_oak_spi_security_authentication_external_impl_principal_external_principal_configuration ||= OpenapiClient::Api::OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplPrincipalExternalPrincipalConfiguration.new(@connection)
    end

    def org_apache_jackrabbit_oak_spi_security_authorization_cug_impl_cug_configuration
      @org_apache_jackrabbit_oak_spi_security_authorization_cug_impl_cug_configuration ||= OpenapiClient::Api::OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugConfiguration.new(@connection)
    end

    def org_apache_jackrabbit_oak_spi_security_authorization_cug_impl_cug_exclude_impl
      @org_apache_jackrabbit_oak_spi_security_authorization_cug_impl_cug_exclude_impl ||= OpenapiClient::Api::OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugExcludeImpl.new(@connection)
    end

    def org_apache_jackrabbit_oak_spi_security_user_action_default_authorizable_action_provider
      @org_apache_jackrabbit_oak_spi_security_user_action_default_authorizable_action_provider ||= OpenapiClient::Api::OrgApacheJackrabbitOakSpiSecurityUserActionDefaultAuthorizableActionProvider.new(@connection)
    end

    def org_apache_jackrabbit_vault_packaging_impl_packaging_impl
      @org_apache_jackrabbit_vault_packaging_impl_packaging_impl ||= OpenapiClient::Api::OrgApacheJackrabbitVaultPackagingImplPackagingImpl.new(@connection)
    end

    def org_apache_jackrabbit_vault_packaging_registry_impl_fs_package_registry
      @org_apache_jackrabbit_vault_packaging_registry_impl_fs_package_registry ||= OpenapiClient::Api::OrgApacheJackrabbitVaultPackagingRegistryImplFSPackageRegistry.new(@connection)
    end

    def org_apache_sling_auth_core_impl_logout_servlet
      @org_apache_sling_auth_core_impl_logout_servlet ||= OpenapiClient::Api::OrgApacheSlingAuthCoreImplLogoutServlet.new(@connection)
    end

    def org_apache_sling_caconfig_impl_configuration_bindings_value_provider
      @org_apache_sling_caconfig_impl_configuration_bindings_value_provider ||= OpenapiClient::Api::OrgApacheSlingCaconfigImplConfigurationBindingsValueProvider.new(@connection)
    end

    def org_apache_sling_caconfig_impl_configuration_resolver_impl
      @org_apache_sling_caconfig_impl_configuration_resolver_impl ||= OpenapiClient::Api::OrgApacheSlingCaconfigImplConfigurationResolverImpl.new(@connection)
    end

    def org_apache_sling_caconfig_impl_def_default_configuration_inheritance_strategy
      @org_apache_sling_caconfig_impl_def_default_configuration_inheritance_strategy ||= OpenapiClient::Api::OrgApacheSlingCaconfigImplDefDefaultConfigurationInheritanceStrategy.new(@connection)
    end

    def org_apache_sling_caconfig_impl_def_default_configuration_persistence_strategy
      @org_apache_sling_caconfig_impl_def_default_configuration_persistence_strategy ||= OpenapiClient::Api::OrgApacheSlingCaconfigImplDefDefaultConfigurationPersistenceStrategy.new(@connection)
    end

    def org_apache_sling_caconfig_impl_override_osgi_configuration_override_provider
      @org_apache_sling_caconfig_impl_override_osgi_configuration_override_provider ||= OpenapiClient::Api::OrgApacheSlingCaconfigImplOverrideOsgiConfigurationOverrideProvider.new(@connection)
    end

    def org_apache_sling_caconfig_impl_override_system_property_configuration_override_provider
      @org_apache_sling_caconfig_impl_override_system_property_configuration_override_provider ||= OpenapiClient::Api::OrgApacheSlingCaconfigImplOverrideSystemPropertyConfigurationOverrideProvider.new(@connection)
    end

    def org_apache_sling_caconfig_management_impl_configuration_management_settings_impl
      @org_apache_sling_caconfig_management_impl_configuration_management_settings_impl ||= OpenapiClient::Api::OrgApacheSlingCaconfigManagementImplConfigurationManagementSettingsImpl.new(@connection)
    end

    def org_apache_sling_caconfig_resource_impl_def_default_configuration_resource_resolving_strategy
      @org_apache_sling_caconfig_resource_impl_def_default_configuration_resource_resolving_strategy ||= OpenapiClient::Api::OrgApacheSlingCaconfigResourceImplDefDefaultConfigurationResourceResolvingStrategy.new(@connection)
    end

    def org_apache_sling_caconfig_resource_impl_def_default_context_path_strategy
      @org_apache_sling_caconfig_resource_impl_def_default_context_path_strategy ||= OpenapiClient::Api::OrgApacheSlingCaconfigResourceImplDefDefaultContextPathStrategy.new(@connection)
    end

    def org_apache_sling_commons_html_internal_tagsoup_html_parser
      @org_apache_sling_commons_html_internal_tagsoup_html_parser ||= OpenapiClient::Api::OrgApacheSlingCommonsHtmlInternalTagsoupHtmlParser.new(@connection)
    end

    def org_apache_sling_commons_log_log_manager
      @org_apache_sling_commons_log_log_manager ||= OpenapiClient::Api::OrgApacheSlingCommonsLogLogManager.new(@connection)
    end

    def org_apache_sling_commons_log_log_manager_factory_config
      @org_apache_sling_commons_log_log_manager_factory_config ||= OpenapiClient::Api::OrgApacheSlingCommonsLogLogManagerFactoryConfig.new(@connection)
    end

    def org_apache_sling_commons_log_log_manager_factory_writer
      @org_apache_sling_commons_log_log_manager_factory_writer ||= OpenapiClient::Api::OrgApacheSlingCommonsLogLogManagerFactoryWriter.new(@connection)
    end

    def org_apache_sling_commons_metrics_internal_log_reporter
      @org_apache_sling_commons_metrics_internal_log_reporter ||= OpenapiClient::Api::OrgApacheSlingCommonsMetricsInternalLogReporter.new(@connection)
    end

    def org_apache_sling_commons_metrics_rrd4j_impl_codahale_metrics_reporter
      @org_apache_sling_commons_metrics_rrd4j_impl_codahale_metrics_reporter ||= OpenapiClient::Api::OrgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporter.new(@connection)
    end

    def org_apache_sling_commons_mime_internal_mime_type_service_impl
      @org_apache_sling_commons_mime_internal_mime_type_service_impl ||= OpenapiClient::Api::OrgApacheSlingCommonsMimeInternalMimeTypeServiceImpl.new(@connection)
    end

    def org_apache_sling_commons_scheduler_impl_quartz_scheduler
      @org_apache_sling_commons_scheduler_impl_quartz_scheduler ||= OpenapiClient::Api::OrgApacheSlingCommonsSchedulerImplQuartzScheduler.new(@connection)
    end

    def org_apache_sling_commons_scheduler_impl_scheduler_health_check
      @org_apache_sling_commons_scheduler_impl_scheduler_health_check ||= OpenapiClient::Api::OrgApacheSlingCommonsSchedulerImplSchedulerHealthCheck.new(@connection)
    end

    def org_apache_sling_commons_threads_impl_default_thread_pool_factory
      @org_apache_sling_commons_threads_impl_default_thread_pool_factory ||= OpenapiClient::Api::OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactory.new(@connection)
    end

    def org_apache_sling_datasource_data_source_factory
      @org_apache_sling_datasource_data_source_factory ||= OpenapiClient::Api::OrgApacheSlingDatasourceDataSourceFactory.new(@connection)
    end

    def org_apache_sling_datasource_jndi_data_source_factory
      @org_apache_sling_datasource_jndi_data_source_factory ||= OpenapiClient::Api::OrgApacheSlingDatasourceJNDIDataSourceFactory.new(@connection)
    end

    def org_apache_sling_discovery_oak_config
      @org_apache_sling_discovery_oak_config ||= OpenapiClient::Api::OrgApacheSlingDiscoveryOakConfig.new(@connection)
    end

    def org_apache_sling_discovery_oak_synchronized_clocks_health_check
      @org_apache_sling_discovery_oak_synchronized_clocks_health_check ||= OpenapiClient::Api::OrgApacheSlingDiscoveryOakSynchronizedClocksHealthCheck.new(@connection)
    end

    def org_apache_sling_distribution_agent_impl_forward_distribution_agent_factory
      @org_apache_sling_distribution_agent_impl_forward_distribution_agent_factory ||= OpenapiClient::Api::OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactory.new(@connection)
    end

    def org_apache_sling_distribution_agent_impl_privilege_distribution_request_authorization_strategy_factory
      @org_apache_sling_distribution_agent_impl_privilege_distribution_request_authorization_strategy_factory ||= OpenapiClient::Api::OrgApacheSlingDistributionAgentImplPrivilegeDistributionRequestAuthorizationStrategyFactory.new(@connection)
    end

    def org_apache_sling_distribution_agent_impl_queue_distribution_agent_factory
      @org_apache_sling_distribution_agent_impl_queue_distribution_agent_factory ||= OpenapiClient::Api::OrgApacheSlingDistributionAgentImplQueueDistributionAgentFactory.new(@connection)
    end

    def org_apache_sling_distribution_agent_impl_reverse_distribution_agent_factory
      @org_apache_sling_distribution_agent_impl_reverse_distribution_agent_factory ||= OpenapiClient::Api::OrgApacheSlingDistributionAgentImplReverseDistributionAgentFactory.new(@connection)
    end

    def org_apache_sling_distribution_agent_impl_simple_distribution_agent_factory
      @org_apache_sling_distribution_agent_impl_simple_distribution_agent_factory ||= OpenapiClient::Api::OrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactory.new(@connection)
    end

    def org_apache_sling_distribution_agent_impl_sync_distribution_agent_factory
      @org_apache_sling_distribution_agent_impl_sync_distribution_agent_factory ||= OpenapiClient::Api::OrgApacheSlingDistributionAgentImplSyncDistributionAgentFactory.new(@connection)
    end

    def org_apache_sling_distribution_monitor_distribution_queue_health_check
      @org_apache_sling_distribution_monitor_distribution_queue_health_check ||= OpenapiClient::Api::OrgApacheSlingDistributionMonitorDistributionQueueHealthCheck.new(@connection)
    end

    def org_apache_sling_distribution_packaging_impl_exporter_agent_distribution_package_exporter_factory
      @org_apache_sling_distribution_packaging_impl_exporter_agent_distribution_package_exporter_factory ||= OpenapiClient::Api::OrgApacheSlingDistributionPackagingImplExporterAgentDistributionPackageExporterFactory.new(@connection)
    end

    def org_apache_sling_distribution_packaging_impl_exporter_local_distribution_package_exporter_factory
      @org_apache_sling_distribution_packaging_impl_exporter_local_distribution_package_exporter_factory ||= OpenapiClient::Api::OrgApacheSlingDistributionPackagingImplExporterLocalDistributionPackageExporterFactory.new(@connection)
    end

    def org_apache_sling_distribution_packaging_impl_exporter_remote_distribution_package_exporter_factory
      @org_apache_sling_distribution_packaging_impl_exporter_remote_distribution_package_exporter_factory ||= OpenapiClient::Api::OrgApacheSlingDistributionPackagingImplExporterRemoteDistributionPackageExporterFactory.new(@connection)
    end

    def org_apache_sling_distribution_packaging_impl_importer_local_distribution_package_importer_factory
      @org_apache_sling_distribution_packaging_impl_importer_local_distribution_package_importer_factory ||= OpenapiClient::Api::OrgApacheSlingDistributionPackagingImplImporterLocalDistributionPackageImporterFactory.new(@connection)
    end

    def org_apache_sling_distribution_packaging_impl_importer_remote_distribution_package_importer_factory
      @org_apache_sling_distribution_packaging_impl_importer_remote_distribution_package_importer_factory ||= OpenapiClient::Api::OrgApacheSlingDistributionPackagingImplImporterRemoteDistributionPackageImporterFactory.new(@connection)
    end

    def org_apache_sling_distribution_packaging_impl_importer_repository_distribution_package_importer_factory
      @org_apache_sling_distribution_packaging_impl_importer_repository_distribution_package_importer_factory ||= OpenapiClient::Api::OrgApacheSlingDistributionPackagingImplImporterRepositoryDistributionPackageImporterFactory.new(@connection)
    end

    def org_apache_sling_distribution_resources_impl_distribution_configuration_resource_provider_factory
      @org_apache_sling_distribution_resources_impl_distribution_configuration_resource_provider_factory ||= OpenapiClient::Api::OrgApacheSlingDistributionResourcesImplDistributionConfigurationResourceProviderFactory.new(@connection)
    end

    def org_apache_sling_distribution_resources_impl_distribution_service_resource_provider_factory
      @org_apache_sling_distribution_resources_impl_distribution_service_resource_provider_factory ||= OpenapiClient::Api::OrgApacheSlingDistributionResourcesImplDistributionServiceResourceProviderFactory.new(@connection)
    end

    def org_apache_sling_distribution_serialization_impl_distribution_package_builder_factory
      @org_apache_sling_distribution_serialization_impl_distribution_package_builder_factory ||= OpenapiClient::Api::OrgApacheSlingDistributionSerializationImplDistributionPackageBuilderFactory.new(@connection)
    end

    def org_apache_sling_distribution_serialization_impl_vlt_vault_distribution_package_builder_factory
      @org_apache_sling_distribution_serialization_impl_vlt_vault_distribution_package_builder_factory ||= OpenapiClient::Api::OrgApacheSlingDistributionSerializationImplVltVaultDistributionPackageBuilderFactory.new(@connection)
    end

    def org_apache_sling_distribution_transport_impl_user_credentials_distribution_transport_secret_provider
      @org_apache_sling_distribution_transport_impl_user_credentials_distribution_transport_secret_provider ||= OpenapiClient::Api::OrgApacheSlingDistributionTransportImplUserCredentialsDistributionTransportSecretProvider.new(@connection)
    end

    def org_apache_sling_distribution_trigger_impl_distribution_event_distribute_distribution_trigger_factory
      @org_apache_sling_distribution_trigger_impl_distribution_event_distribute_distribution_trigger_factory ||= OpenapiClient::Api::OrgApacheSlingDistributionTriggerImplDistributionEventDistributeDistributionTriggerFactory.new(@connection)
    end

    def org_apache_sling_distribution_trigger_impl_jcr_event_distribution_trigger_factory
      @org_apache_sling_distribution_trigger_impl_jcr_event_distribution_trigger_factory ||= OpenapiClient::Api::OrgApacheSlingDistributionTriggerImplJcrEventDistributionTriggerFactory.new(@connection)
    end

    def org_apache_sling_distribution_trigger_impl_persisted_jcr_event_distribution_trigger_factory
      @org_apache_sling_distribution_trigger_impl_persisted_jcr_event_distribution_trigger_factory ||= OpenapiClient::Api::OrgApacheSlingDistributionTriggerImplPersistedJcrEventDistributionTriggerFactory.new(@connection)
    end

    def org_apache_sling_distribution_trigger_impl_remote_event_distribution_trigger_factory
      @org_apache_sling_distribution_trigger_impl_remote_event_distribution_trigger_factory ||= OpenapiClient::Api::OrgApacheSlingDistributionTriggerImplRemoteEventDistributionTriggerFactory.new(@connection)
    end

    def org_apache_sling_distribution_trigger_impl_resource_event_distribution_trigger_factory
      @org_apache_sling_distribution_trigger_impl_resource_event_distribution_trigger_factory ||= OpenapiClient::Api::OrgApacheSlingDistributionTriggerImplResourceEventDistributionTriggerFactory.new(@connection)
    end

    def org_apache_sling_distribution_trigger_impl_scheduled_distribution_trigger_factory
      @org_apache_sling_distribution_trigger_impl_scheduled_distribution_trigger_factory ||= OpenapiClient::Api::OrgApacheSlingDistributionTriggerImplScheduledDistributionTriggerFactory.new(@connection)
    end

    def org_apache_sling_engine_impl_sling_main_servlet
      @org_apache_sling_engine_impl_sling_main_servlet ||= OpenapiClient::Api::OrgApacheSlingEngineImplSlingMainServlet.new(@connection)
    end

    def org_apache_sling_engine_impl_auth_sling_authenticator
      @org_apache_sling_engine_impl_auth_sling_authenticator ||= OpenapiClient::Api::OrgApacheSlingEngineImplAuthSlingAuthenticator.new(@connection)
    end

    def org_apache_sling_engine_impl_debug_request_progress_tracker_log_filter
      @org_apache_sling_engine_impl_debug_request_progress_tracker_log_filter ||= OpenapiClient::Api::OrgApacheSlingEngineImplDebugRequestProgressTrackerLogFilter.new(@connection)
    end

    def org_apache_sling_engine_impl_log_request_logger
      @org_apache_sling_engine_impl_log_request_logger ||= OpenapiClient::Api::OrgApacheSlingEngineImplLogRequestLogger.new(@connection)
    end

    def org_apache_sling_engine_impl_log_request_logger_service
      @org_apache_sling_engine_impl_log_request_logger_service ||= OpenapiClient::Api::OrgApacheSlingEngineImplLogRequestLoggerService.new(@connection)
    end

    def org_apache_sling_engine_parameters
      @org_apache_sling_engine_parameters ||= OpenapiClient::Api::OrgApacheSlingEngineParameters.new(@connection)
    end

    def org_apache_sling_event_impl_eventing_thread_pool
      @org_apache_sling_event_impl_eventing_thread_pool ||= OpenapiClient::Api::OrgApacheSlingEventImplEventingThreadPool.new(@connection)
    end

    def org_apache_sling_event_impl_jobs_default_job_manager
      @org_apache_sling_event_impl_jobs_default_job_manager ||= OpenapiClient::Api::OrgApacheSlingEventImplJobsDefaultJobManager.new(@connection)
    end

    def org_apache_sling_event_impl_jobs_job_consumer_manager
      @org_apache_sling_event_impl_jobs_job_consumer_manager ||= OpenapiClient::Api::OrgApacheSlingEventImplJobsJobConsumerManager.new(@connection)
    end

    def org_apache_sling_event_impl_jobs_jcr_persistence_handler
      @org_apache_sling_event_impl_jobs_jcr_persistence_handler ||= OpenapiClient::Api::OrgApacheSlingEventImplJobsJcrPersistenceHandler.new(@connection)
    end

    def org_apache_sling_event_jobs_queue_configuration
      @org_apache_sling_event_jobs_queue_configuration ||= OpenapiClient::Api::OrgApacheSlingEventJobsQueueConfiguration.new(@connection)
    end

    def org_apache_sling_extensions_webconsolesecurityprovider_internal_sling_web_console_security_provider
      @org_apache_sling_extensions_webconsolesecurityprovider_internal_sling_web_console_security_provider ||= OpenapiClient::Api::OrgApacheSlingExtensionsWebconsolesecurityproviderInternalSlingWebConsoleSecurityProvider.new(@connection)
    end

    def org_apache_sling_featureflags_feature
      @org_apache_sling_featureflags_feature ||= OpenapiClient::Api::OrgApacheSlingFeatureflagsFeature.new(@connection)
    end

    def org_apache_sling_featureflags_impl_configured_feature
      @org_apache_sling_featureflags_impl_configured_feature ||= OpenapiClient::Api::OrgApacheSlingFeatureflagsImplConfiguredFeature.new(@connection)
    end

    def org_apache_sling_hapi_impl_h_api_util_impl
      @org_apache_sling_hapi_impl_h_api_util_impl ||= OpenapiClient::Api::OrgApacheSlingHapiImplHApiUtilImpl.new(@connection)
    end

    def org_apache_sling_hc_core_impl_composite_health_check
      @org_apache_sling_hc_core_impl_composite_health_check ||= OpenapiClient::Api::OrgApacheSlingHcCoreImplCompositeHealthCheck.new(@connection)
    end

    def org_apache_sling_hc_core_impl_jmx_attribute_health_check
      @org_apache_sling_hc_core_impl_jmx_attribute_health_check ||= OpenapiClient::Api::OrgApacheSlingHcCoreImplJmxAttributeHealthCheck.new(@connection)
    end

    def org_apache_sling_hc_core_impl_scriptable_health_check
      @org_apache_sling_hc_core_impl_scriptable_health_check ||= OpenapiClient::Api::OrgApacheSlingHcCoreImplScriptableHealthCheck.new(@connection)
    end

    def org_apache_sling_hc_core_impl_executor_health_check_executor_impl
      @org_apache_sling_hc_core_impl_executor_health_check_executor_impl ||= OpenapiClient::Api::OrgApacheSlingHcCoreImplExecutorHealthCheckExecutorImpl.new(@connection)
    end

    def org_apache_sling_hc_core_impl_servlet_health_check_executor_servlet
      @org_apache_sling_hc_core_impl_servlet_health_check_executor_servlet ||= OpenapiClient::Api::OrgApacheSlingHcCoreImplServletHealthCheckExecutorServlet.new(@connection)
    end

    def org_apache_sling_hc_core_impl_servlet_result_txt_verbose_serializer
      @org_apache_sling_hc_core_impl_servlet_result_txt_verbose_serializer ||= OpenapiClient::Api::OrgApacheSlingHcCoreImplServletResultTxtVerboseSerializer.new(@connection)
    end

    def org_apache_sling_i18n_impl_i18_n_filter
      @org_apache_sling_i18n_impl_i18_n_filter ||= OpenapiClient::Api::OrgApacheSlingI18nImplI18NFilter.new(@connection)
    end

    def org_apache_sling_i18n_impl_jcr_resource_bundle_provider
      @org_apache_sling_i18n_impl_jcr_resource_bundle_provider ||= OpenapiClient::Api::OrgApacheSlingI18nImplJcrResourceBundleProvider.new(@connection)
    end

    def org_apache_sling_installer_provider_jcr_impl_jcr_installer
      @org_apache_sling_installer_provider_jcr_impl_jcr_installer ||= OpenapiClient::Api::OrgApacheSlingInstallerProviderJcrImplJcrInstaller.new(@connection)
    end

    def org_apache_sling_jcr_base_internal_login_admin_whitelist
      @org_apache_sling_jcr_base_internal_login_admin_whitelist ||= OpenapiClient::Api::OrgApacheSlingJcrBaseInternalLoginAdminWhitelist.new(@connection)
    end

    def org_apache_sling_jcr_base_internal_login_admin_whitelist_fragment
      @org_apache_sling_jcr_base_internal_login_admin_whitelist_fragment ||= OpenapiClient::Api::OrgApacheSlingJcrBaseInternalLoginAdminWhitelistFragment.new(@connection)
    end

    def org_apache_sling_jcr_davex_impl_servlets_sling_dav_ex_servlet
      @org_apache_sling_jcr_davex_impl_servlets_sling_dav_ex_servlet ||= OpenapiClient::Api::OrgApacheSlingJcrDavexImplServletsSlingDavExServlet.new(@connection)
    end

    def org_apache_sling_jcr_jackrabbit_server_jndi_registration_support
      @org_apache_sling_jcr_jackrabbit_server_jndi_registration_support ||= OpenapiClient::Api::OrgApacheSlingJcrJackrabbitServerJndiRegistrationSupport.new(@connection)
    end

    def org_apache_sling_jcr_jackrabbit_server_rmi_registration_support
      @org_apache_sling_jcr_jackrabbit_server_rmi_registration_support ||= OpenapiClient::Api::OrgApacheSlingJcrJackrabbitServerRmiRegistrationSupport.new(@connection)
    end

    def org_apache_sling_jcr_repoinit_repository_initializer
      @org_apache_sling_jcr_repoinit_repository_initializer ||= OpenapiClient::Api::OrgApacheSlingJcrRepoinitRepositoryInitializer.new(@connection)
    end

    def org_apache_sling_jcr_repoinit_impl_repository_initializer
      @org_apache_sling_jcr_repoinit_impl_repository_initializer ||= OpenapiClient::Api::OrgApacheSlingJcrRepoinitImplRepositoryInitializer.new(@connection)
    end

    def org_apache_sling_jcr_resource_internal_jcr_resource_resolver_factory_impl
      @org_apache_sling_jcr_resource_internal_jcr_resource_resolver_factory_impl ||= OpenapiClient::Api::OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImpl.new(@connection)
    end

    def org_apache_sling_jcr_resource_internal_jcr_system_user_validator
      @org_apache_sling_jcr_resource_internal_jcr_system_user_validator ||= OpenapiClient::Api::OrgApacheSlingJcrResourceInternalJcrSystemUserValidator.new(@connection)
    end

    def org_apache_sling_jcr_resourcesecurity_impl_resource_access_gate_factory
      @org_apache_sling_jcr_resourcesecurity_impl_resource_access_gate_factory ||= OpenapiClient::Api::OrgApacheSlingJcrResourcesecurityImplResourceAccessGateFactory.new(@connection)
    end

    def org_apache_sling_jcr_webdav_impl_handler_default_handler_service
      @org_apache_sling_jcr_webdav_impl_handler_default_handler_service ||= OpenapiClient::Api::OrgApacheSlingJcrWebdavImplHandlerDefaultHandlerService.new(@connection)
    end

    def org_apache_sling_jcr_webdav_impl_handler_dir_listing_export_handler_service
      @org_apache_sling_jcr_webdav_impl_handler_dir_listing_export_handler_service ||= OpenapiClient::Api::OrgApacheSlingJcrWebdavImplHandlerDirListingExportHandlerService.new(@connection)
    end

    def org_apache_sling_jcr_webdav_impl_servlets_simple_web_dav_servlet
      @org_apache_sling_jcr_webdav_impl_servlets_simple_web_dav_servlet ||= OpenapiClient::Api::OrgApacheSlingJcrWebdavImplServletsSimpleWebDavServlet.new(@connection)
    end

    def org_apache_sling_jmx_provider_impl_jmx_resource_provider
      @org_apache_sling_jmx_provider_impl_jmx_resource_provider ||= OpenapiClient::Api::OrgApacheSlingJmxProviderImplJMXResourceProvider.new(@connection)
    end

    def org_apache_sling_models_impl_model_adapter_factory
      @org_apache_sling_models_impl_model_adapter_factory ||= OpenapiClient::Api::OrgApacheSlingModelsImplModelAdapterFactory.new(@connection)
    end

    def org_apache_sling_models_jacksonexporter_impl_resource_module_provider
      @org_apache_sling_models_jacksonexporter_impl_resource_module_provider ||= OpenapiClient::Api::OrgApacheSlingModelsJacksonexporterImplResourceModuleProvider.new(@connection)
    end

    def org_apache_sling_resource_inventory_impl_resource_inventory_printer_factory
      @org_apache_sling_resource_inventory_impl_resource_inventory_printer_factory ||= OpenapiClient::Api::OrgApacheSlingResourceInventoryImplResourceInventoryPrinterFactory.new(@connection)
    end

    def org_apache_sling_resourcemerger_impl_merged_resource_provider_factory
      @org_apache_sling_resourcemerger_impl_merged_resource_provider_factory ||= OpenapiClient::Api::OrgApacheSlingResourcemergerImplMergedResourceProviderFactory.new(@connection)
    end

    def org_apache_sling_resourcemerger_picker_overriding
      @org_apache_sling_resourcemerger_picker_overriding ||= OpenapiClient::Api::OrgApacheSlingResourcemergerPickerOverriding.new(@connection)
    end

    def org_apache_sling_scripting_core_impl_script_cache_impl
      @org_apache_sling_scripting_core_impl_script_cache_impl ||= OpenapiClient::Api::OrgApacheSlingScriptingCoreImplScriptCacheImpl.new(@connection)
    end

    def org_apache_sling_scripting_core_impl_scripting_resource_resolver_provider_impl
      @org_apache_sling_scripting_core_impl_scripting_resource_resolver_provider_impl ||= OpenapiClient::Api::OrgApacheSlingScriptingCoreImplScriptingResourceResolverProviderImpl.new(@connection)
    end

    def org_apache_sling_scripting_java_impl_java_script_engine_factory
      @org_apache_sling_scripting_java_impl_java_script_engine_factory ||= OpenapiClient::Api::OrgApacheSlingScriptingJavaImplJavaScriptEngineFactory.new(@connection)
    end

    def org_apache_sling_scripting_javascript_internal_rhino_java_script_engine_factory
      @org_apache_sling_scripting_javascript_internal_rhino_java_script_engine_factory ||= OpenapiClient::Api::OrgApacheSlingScriptingJavascriptInternalRhinoJavaScriptEngineFactory.new(@connection)
    end

    def org_apache_sling_scripting_jsp_jsp_script_engine_factory
      @org_apache_sling_scripting_jsp_jsp_script_engine_factory ||= OpenapiClient::Api::OrgApacheSlingScriptingJspJspScriptEngineFactory.new(@connection)
    end

    def org_apache_sling_scripting_sightly_js_impl_jsapi_sly_bindings_values_provider
      @org_apache_sling_scripting_sightly_js_impl_jsapi_sly_bindings_values_provider ||= OpenapiClient::Api::OrgApacheSlingScriptingSightlyJsImplJsapiSlyBindingsValuesProvider.new(@connection)
    end

    def org_apache_sling_security_impl_content_disposition_filter
      @org_apache_sling_security_impl_content_disposition_filter ||= OpenapiClient::Api::OrgApacheSlingSecurityImplContentDispositionFilter.new(@connection)
    end

    def org_apache_sling_security_impl_referrer_filter
      @org_apache_sling_security_impl_referrer_filter ||= OpenapiClient::Api::OrgApacheSlingSecurityImplReferrerFilter.new(@connection)
    end

    def org_apache_sling_serviceusermapping_impl_service_user_mapper_impl
      @org_apache_sling_serviceusermapping_impl_service_user_mapper_impl ||= OpenapiClient::Api::OrgApacheSlingServiceusermappingImplServiceUserMapperImpl.new(@connection)
    end

    def org_apache_sling_serviceusermapping_impl_service_user_mapper_impl_amended
      @org_apache_sling_serviceusermapping_impl_service_user_mapper_impl_amended ||= OpenapiClient::Api::OrgApacheSlingServiceusermappingImplServiceUserMapperImplAmended.new(@connection)
    end

    def org_apache_sling_servlets_get_default_get_servlet
      @org_apache_sling_servlets_get_default_get_servlet ||= OpenapiClient::Api::OrgApacheSlingServletsGetDefaultGetServlet.new(@connection)
    end

    def org_apache_sling_servlets_get_impl_version_version_info_servlet
      @org_apache_sling_servlets_get_impl_version_version_info_servlet ||= OpenapiClient::Api::OrgApacheSlingServletsGetImplVersionVersionInfoServlet.new(@connection)
    end

    def org_apache_sling_servlets_post_impl_sling_post_servlet
      @org_apache_sling_servlets_post_impl_sling_post_servlet ||= OpenapiClient::Api::OrgApacheSlingServletsPostImplSlingPostServlet.new(@connection)
    end

    def org_apache_sling_servlets_post_impl_helper_chunk_clean_up_task
      @org_apache_sling_servlets_post_impl_helper_chunk_clean_up_task ||= OpenapiClient::Api::OrgApacheSlingServletsPostImplHelperChunkCleanUpTask.new(@connection)
    end

    def org_apache_sling_servlets_resolver_sling_servlet_resolver
      @org_apache_sling_servlets_resolver_sling_servlet_resolver ||= OpenapiClient::Api::OrgApacheSlingServletsResolverSlingServletResolver.new(@connection)
    end

    def org_apache_sling_settings_impl_sling_settings_service_impl
      @org_apache_sling_settings_impl_sling_settings_service_impl ||= OpenapiClient::Api::OrgApacheSlingSettingsImplSlingSettingsServiceImpl.new(@connection)
    end

    def org_apache_sling_startupfilter_impl_startup_filter_impl
      @org_apache_sling_startupfilter_impl_startup_filter_impl ||= OpenapiClient::Api::OrgApacheSlingStartupfilterImplStartupFilterImpl.new(@connection)
    end

    def org_apache_sling_tenant_internal_tenant_provider_impl
      @org_apache_sling_tenant_internal_tenant_provider_impl ||= OpenapiClient::Api::OrgApacheSlingTenantInternalTenantProviderImpl.new(@connection)
    end

    def org_apache_sling_tracer_internal_log_tracer
      @org_apache_sling_tracer_internal_log_tracer ||= OpenapiClient::Api::OrgApacheSlingTracerInternalLogTracer.new(@connection)
    end

    def org_apache_sling_xss_impl_xss_filter_impl
      @org_apache_sling_xss_impl_xss_filter_impl ||= OpenapiClient::Api::OrgApacheSlingXssImplXSSFilterImpl.new(@connection)
    end
  end
end
