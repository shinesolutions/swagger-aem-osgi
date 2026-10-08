/*
 * com_adobe_granite_apicontroller_filter_resolver_hook_factory_properties.h
 *
 * 
 */

#ifndef _com_adobe_granite_apicontroller_filter_resolver_hook_factory_properties_H_
#define _com_adobe_granite_apicontroller_filter_resolver_hook_factory_properties_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct com_adobe_granite_apicontroller_filter_resolver_hook_factory_properties_t com_adobe_granite_apicontroller_filter_resolver_hook_factory_properties_t;

#include "config_node_property_string.h"



typedef struct com_adobe_granite_apicontroller_filter_resolver_hook_factory_properties_t {
    struct config_node_property_string_t *com_adobe_cq_cdn_cdn_rewriter; //model
    struct config_node_property_string_t *com_adobe_cq_cloud_config_components; //model
    struct config_node_property_string_t *com_adobe_cq_cloud_config_core; //model
    struct config_node_property_string_t *com_adobe_cq_cloud_config_ui; //model
    struct config_node_property_string_t *com_adobe_cq_com_adobe_cq_editor; //model
    struct config_node_property_string_t *com_adobe_cq_com_adobe_cq_projects_core; //model
    struct config_node_property_string_t *com_adobe_cq_com_adobe_cq_projects_wcm_core; //model
    struct config_node_property_string_t *com_adobe_cq_com_adobe_cq_ui_commons; //model
    struct config_node_property_string_t *com_adobe_cq_com_adobe_cq_wcm_style; //model
    struct config_node_property_string_t *com_adobe_cq_cq_activitymap_integration; //model
    struct config_node_property_string_t *com_adobe_cq_cq_contexthub_commons; //model
    struct config_node_property_string_t *com_adobe_cq_cq_dtm; //model
    struct config_node_property_string_t *com_adobe_cq_cq_healthcheck; //model
    struct config_node_property_string_t *com_adobe_cq_cq_multisite_targeting; //model
    struct config_node_property_string_t *com_adobe_cq_cq_pre_upgrade_cleanup; //model
    struct config_node_property_string_t *com_adobe_cq_cq_product_info_provider; //model
    struct config_node_property_string_t *com_adobe_cq_cq_rest_sites; //model
    struct config_node_property_string_t *com_adobe_cq_cq_security_hc; //model
    struct config_node_property_string_t *com_adobe_cq_dam_cq_dam_svg_handler; //model
    struct config_node_property_string_t *com_adobe_cq_dam_cq_scene7_imaging; //model
    struct config_node_property_string_t *com_adobe_cq_dtm_reactor_core; //model
    struct config_node_property_string_t *com_adobe_cq_dtm_reactor_ui; //model
    struct config_node_property_string_t *com_adobe_cq_exp_jspel_resolver; //model
    struct config_node_property_string_t *com_adobe_cq_inbox_cq_inbox; //model
    struct config_node_property_string_t *com_adobe_cq_json_schema_parser; //model
    struct config_node_property_string_t *com_adobe_cq_media_cq_media_publishing_dps_fp_core; //model
    struct config_node_property_string_t *com_adobe_cq_mobile_cq_mobile_caas; //model
    struct config_node_property_string_t *com_adobe_cq_mobile_cq_mobile_index_builder; //model
    struct config_node_property_string_t *com_adobe_cq_mobile_cq_mobile_phonegap_build; //model
    struct config_node_property_string_t *com_adobe_cq_myspell; //model
    struct config_node_property_string_t *com_adobe_cq_sample_we_retail_core; //model
    struct config_node_property_string_t *com_adobe_cq_screens_com_adobe_cq_screens_dcc; //model
    struct config_node_property_string_t *com_adobe_cq_screens_com_adobe_cq_screens_mq_core; //model
    struct config_node_property_string_t *com_adobe_cq_social_cq_social_as_provider; //model
    struct config_node_property_string_t *com_adobe_cq_social_cq_social_badging_basic_impl; //model
    struct config_node_property_string_t *com_adobe_cq_social_cq_social_badging_impl; //model
    struct config_node_property_string_t *com_adobe_cq_social_cq_social_calendar_impl; //model
    struct config_node_property_string_t *com_adobe_cq_social_cq_social_content_fragments_impl; //model
    struct config_node_property_string_t *com_adobe_cq_social_cq_social_enablement_impl; //model
    struct config_node_property_string_t *com_adobe_cq_social_cq_social_graph_impl; //model
    struct config_node_property_string_t *com_adobe_cq_social_cq_social_ideation_impl; //model
    struct config_node_property_string_t *com_adobe_cq_social_cq_social_jcr_provider; //model
    struct config_node_property_string_t *com_adobe_cq_social_cq_social_members_impl; //model
    struct config_node_property_string_t *com_adobe_cq_social_cq_social_ms_provider; //model
    struct config_node_property_string_t *com_adobe_cq_social_cq_social_notifications_channels_web; //model
    struct config_node_property_string_t *com_adobe_cq_social_cq_social_notifications_impl; //model
    struct config_node_property_string_t *com_adobe_cq_social_cq_social_rdb_provider; //model
    struct config_node_property_string_t *com_adobe_cq_social_cq_social_scf_impl; //model
    struct config_node_property_string_t *com_adobe_cq_social_cq_social_scoring_basic_impl; //model
    struct config_node_property_string_t *com_adobe_cq_social_cq_social_scoring_impl; //model
    struct config_node_property_string_t *com_adobe_cq_social_cq_social_serviceusers_impl; //model
    struct config_node_property_string_t *com_adobe_cq_social_cq_social_srp_impl; //model
    struct config_node_property_string_t *com_adobe_cq_social_cq_social_ugcbase_impl; //model
    struct config_node_property_string_t *com_adobe_dam_cq_dam_cfm_impl; //model
    struct config_node_property_string_t *com_adobe_forms_foundation_forms_foundation_base; //model
    struct config_node_property_string_t *com_adobe_granite_apicontroller; //model
    struct config_node_property_string_t *com_adobe_granite_asset_core; //model
    struct config_node_property_string_t *com_adobe_granite_auth_sso; //model
    struct config_node_property_string_t *com_adobe_granite_bundles_hc_impl; //model
    struct config_node_property_string_t *com_adobe_granite_compat_router; //model
    struct config_node_property_string_t *com_adobe_granite_conf; //model
    struct config_node_property_string_t *com_adobe_granite_conf_ui_core; //model
    struct config_node_property_string_t *com_adobe_granite_cors; //model
    struct config_node_property_string_t *com_adobe_granite_crx_explorer; //model
    struct config_node_property_string_t *com_adobe_granite_crxde_lite; //model
    struct config_node_property_string_t *com_adobe_granite_crypto_config; //model
    struct config_node_property_string_t *com_adobe_granite_crypto_extension; //model
    struct config_node_property_string_t *com_adobe_granite_crypto_file; //model
    struct config_node_property_string_t *com_adobe_granite_crypto_jcr; //model
    struct config_node_property_string_t *com_adobe_granite_csrf; //model
    struct config_node_property_string_t *com_adobe_granite_distribution_core; //model
    struct config_node_property_string_t *com_adobe_granite_dropwizard_metrics; //model
    struct config_node_property_string_t *com_adobe_granite_frags_impl; //model
    struct config_node_property_string_t *com_adobe_granite_gibson; //model
    struct config_node_property_string_t *com_adobe_granite_infocollector; //model
    struct config_node_property_string_t *com_adobe_granite_installer_factory_packages; //model
    struct config_node_property_string_t *com_adobe_granite_jetty_ssl; //model
    struct config_node_property_string_t *com_adobe_granite_jobs_async; //model
    struct config_node_property_string_t *com_adobe_granite_maintenance_oak; //model
    struct config_node_property_string_t *com_adobe_granite_monitoring_core; //model
    struct config_node_property_string_t *com_adobe_granite_queries; //model
    struct config_node_property_string_t *com_adobe_granite_replication_hc_impl; //model
    struct config_node_property_string_t *com_adobe_granite_repository_checker; //model
    struct config_node_property_string_t *com_adobe_granite_repository_hc_impl; //model
    struct config_node_property_string_t *com_adobe_granite_rest_assets; //model
    struct config_node_property_string_t *com_adobe_granite_security_ui; //model
    struct config_node_property_string_t *com_adobe_granite_startup; //model
    struct config_node_property_string_t *com_adobe_granite_tagsoup; //model
    struct config_node_property_string_t *com_adobe_granite_taskmanagement_core; //model
    struct config_node_property_string_t *com_adobe_granite_taskmanagement_workflow; //model
    struct config_node_property_string_t *com_adobe_granite_ui_clientlibs_compiler_less; //model
    struct config_node_property_string_t *com_adobe_granite_ui_clientlibs_processor_gcc; //model
    struct config_node_property_string_t *com_adobe_granite_webconsole_plugins; //model
    struct config_node_property_string_t *com_adobe_granite_workflow_console; //model
    struct config_node_property_string_t *com_adobe_xmp_worker_files_native_fragment_linux; //model
    struct config_node_property_string_t *com_adobe_xmp_worker_files_native_fragment_macosx; //model
    struct config_node_property_string_t *com_adobe_xmp_worker_files_native_fragment_win; //model
    struct config_node_property_string_t *com_day_commons_osgi_wrapper_simple_jndi; //model
    struct config_node_property_string_t *com_day_cq_cq_authhandler; //model
    struct config_node_property_string_t *com_day_cq_cq_compat_configupdate; //model
    struct config_node_property_string_t *com_day_cq_cq_licensebranding; //model
    struct config_node_property_string_t *com_day_cq_cq_notifcation_impl; //model
    struct config_node_property_string_t *com_day_cq_cq_replication_audit; //model
    struct config_node_property_string_t *com_day_cq_cq_search_ext; //model
    struct config_node_property_string_t *com_day_cq_dam_cq_dam_annotation_print; //model
    struct config_node_property_string_t *com_day_cq_dam_cq_dam_asset_usage; //model
    struct config_node_property_string_t *com_day_cq_dam_cq_dam_s7dam; //model
    struct config_node_property_string_t *com_day_cq_dam_cq_dam_similaritysearch; //model
    struct config_node_property_string_t *com_day_cq_dam_dam_webdav_support; //model
    struct config_node_property_string_t *com_day_cq_pre_upgrade_tasks; //model
    struct config_node_property_string_t *com_day_cq_replication_extensions; //model
    struct config_node_property_string_t *com_day_cq_wcm_cq_msm_core; //model
    struct config_node_property_string_t *com_day_cq_wcm_cq_wcm_translation; //model
    struct config_node_property_string_t *day_commons_jrawio; //model
    struct config_node_property_string_t *org_apache_aries_jmx_whiteboard; //model
    struct config_node_property_string_t *org_apache_felix_http_sslfilter; //model
    struct config_node_property_string_t *org_apache_felix_org_apache_felix_threaddump; //model
    struct config_node_property_string_t *org_apache_felix_webconsole_plugins_ds; //model
    struct config_node_property_string_t *org_apache_felix_webconsole_plugins_event; //model
    struct config_node_property_string_t *org_apache_felix_webconsole_plugins_memoryusage; //model
    struct config_node_property_string_t *org_apache_felix_webconsole_plugins_packageadmin; //model
    struct config_node_property_string_t *org_apache_jackrabbit_oak_auth_ldap; //model
    struct config_node_property_string_t *org_apache_jackrabbit_oak_segment_tar; //model
    struct config_node_property_string_t *org_apache_jackrabbit_oak_solr_osgi; //model
    struct config_node_property_string_t *org_apache_sling_bundleresource_impl; //model
    struct config_node_property_string_t *org_apache_sling_commons_fsclassloader; //model
    struct config_node_property_string_t *org_apache_sling_commons_log_webconsole; //model
    struct config_node_property_string_t *org_apache_sling_datasource; //model
    struct config_node_property_string_t *org_apache_sling_discovery_base; //model
    struct config_node_property_string_t *org_apache_sling_discovery_oak; //model
    struct config_node_property_string_t *org_apache_sling_discovery_support; //model
    struct config_node_property_string_t *org_apache_sling_distribution_api; //model
    struct config_node_property_string_t *org_apache_sling_distribution_core; //model
    struct config_node_property_string_t *org_apache_sling_extensions_webconsolesecurityprovider; //model
    struct config_node_property_string_t *org_apache_sling_hc_webconsole; //model
    struct config_node_property_string_t *org_apache_sling_installer_console; //model
    struct config_node_property_string_t *org_apache_sling_installer_provider_file; //model
    struct config_node_property_string_t *org_apache_sling_installer_provider_jcr; //model
    struct config_node_property_string_t *org_apache_sling_jcr_davex; //model
    struct config_node_property_string_t *org_apache_sling_jcr_resourcesecurity; //model
    struct config_node_property_string_t *org_apache_sling_jmx_provider; //model
    struct config_node_property_string_t *org_apache_sling_launchpad_installer; //model
    struct config_node_property_string_t *org_apache_sling_models_impl; //model
    struct config_node_property_string_t *org_apache_sling_repoinit_parser; //model
    struct config_node_property_string_t *org_apache_sling_resource_inventory; //model
    struct config_node_property_string_t *org_apache_sling_resourceresolver; //model
    struct config_node_property_string_t *org_apache_sling_scripting_javascript; //model
    struct config_node_property_string_t *org_apache_sling_scripting_jst; //model
    struct config_node_property_string_t *org_apache_sling_scripting_sightly_js_provider; //model
    struct config_node_property_string_t *org_apache_sling_scripting_sightly_models_provider; //model
    struct config_node_property_string_t *org_apache_sling_security; //model
    struct config_node_property_string_t *org_apache_sling_servlets_compat; //model
    struct config_node_property_string_t *org_apache_sling_servlets_get; //model
    struct config_node_property_string_t *org_apache_sling_startupfilter_disabler; //model
    struct config_node_property_string_t *org_apache_sling_tracer; //model
    struct config_node_property_string_t *we_retail_client_app_core; //model

    int _library_owned; // Is the library responsible for freeing this object?
} com_adobe_granite_apicontroller_filter_resolver_hook_factory_properties_t;

__attribute__((deprecated)) com_adobe_granite_apicontroller_filter_resolver_hook_factory_properties_t *com_adobe_granite_apicontroller_filter_resolver_hook_factory_properties_create(
    config_node_property_string_t *com_adobe_cq_cdn_cdn_rewriter,
    config_node_property_string_t *com_adobe_cq_cloud_config_components,
    config_node_property_string_t *com_adobe_cq_cloud_config_core,
    config_node_property_string_t *com_adobe_cq_cloud_config_ui,
    config_node_property_string_t *com_adobe_cq_com_adobe_cq_editor,
    config_node_property_string_t *com_adobe_cq_com_adobe_cq_projects_core,
    config_node_property_string_t *com_adobe_cq_com_adobe_cq_projects_wcm_core,
    config_node_property_string_t *com_adobe_cq_com_adobe_cq_ui_commons,
    config_node_property_string_t *com_adobe_cq_com_adobe_cq_wcm_style,
    config_node_property_string_t *com_adobe_cq_cq_activitymap_integration,
    config_node_property_string_t *com_adobe_cq_cq_contexthub_commons,
    config_node_property_string_t *com_adobe_cq_cq_dtm,
    config_node_property_string_t *com_adobe_cq_cq_healthcheck,
    config_node_property_string_t *com_adobe_cq_cq_multisite_targeting,
    config_node_property_string_t *com_adobe_cq_cq_pre_upgrade_cleanup,
    config_node_property_string_t *com_adobe_cq_cq_product_info_provider,
    config_node_property_string_t *com_adobe_cq_cq_rest_sites,
    config_node_property_string_t *com_adobe_cq_cq_security_hc,
    config_node_property_string_t *com_adobe_cq_dam_cq_dam_svg_handler,
    config_node_property_string_t *com_adobe_cq_dam_cq_scene7_imaging,
    config_node_property_string_t *com_adobe_cq_dtm_reactor_core,
    config_node_property_string_t *com_adobe_cq_dtm_reactor_ui,
    config_node_property_string_t *com_adobe_cq_exp_jspel_resolver,
    config_node_property_string_t *com_adobe_cq_inbox_cq_inbox,
    config_node_property_string_t *com_adobe_cq_json_schema_parser,
    config_node_property_string_t *com_adobe_cq_media_cq_media_publishing_dps_fp_core,
    config_node_property_string_t *com_adobe_cq_mobile_cq_mobile_caas,
    config_node_property_string_t *com_adobe_cq_mobile_cq_mobile_index_builder,
    config_node_property_string_t *com_adobe_cq_mobile_cq_mobile_phonegap_build,
    config_node_property_string_t *com_adobe_cq_myspell,
    config_node_property_string_t *com_adobe_cq_sample_we_retail_core,
    config_node_property_string_t *com_adobe_cq_screens_com_adobe_cq_screens_dcc,
    config_node_property_string_t *com_adobe_cq_screens_com_adobe_cq_screens_mq_core,
    config_node_property_string_t *com_adobe_cq_social_cq_social_as_provider,
    config_node_property_string_t *com_adobe_cq_social_cq_social_badging_basic_impl,
    config_node_property_string_t *com_adobe_cq_social_cq_social_badging_impl,
    config_node_property_string_t *com_adobe_cq_social_cq_social_calendar_impl,
    config_node_property_string_t *com_adobe_cq_social_cq_social_content_fragments_impl,
    config_node_property_string_t *com_adobe_cq_social_cq_social_enablement_impl,
    config_node_property_string_t *com_adobe_cq_social_cq_social_graph_impl,
    config_node_property_string_t *com_adobe_cq_social_cq_social_ideation_impl,
    config_node_property_string_t *com_adobe_cq_social_cq_social_jcr_provider,
    config_node_property_string_t *com_adobe_cq_social_cq_social_members_impl,
    config_node_property_string_t *com_adobe_cq_social_cq_social_ms_provider,
    config_node_property_string_t *com_adobe_cq_social_cq_social_notifications_channels_web,
    config_node_property_string_t *com_adobe_cq_social_cq_social_notifications_impl,
    config_node_property_string_t *com_adobe_cq_social_cq_social_rdb_provider,
    config_node_property_string_t *com_adobe_cq_social_cq_social_scf_impl,
    config_node_property_string_t *com_adobe_cq_social_cq_social_scoring_basic_impl,
    config_node_property_string_t *com_adobe_cq_social_cq_social_scoring_impl,
    config_node_property_string_t *com_adobe_cq_social_cq_social_serviceusers_impl,
    config_node_property_string_t *com_adobe_cq_social_cq_social_srp_impl,
    config_node_property_string_t *com_adobe_cq_social_cq_social_ugcbase_impl,
    config_node_property_string_t *com_adobe_dam_cq_dam_cfm_impl,
    config_node_property_string_t *com_adobe_forms_foundation_forms_foundation_base,
    config_node_property_string_t *com_adobe_granite_apicontroller,
    config_node_property_string_t *com_adobe_granite_asset_core,
    config_node_property_string_t *com_adobe_granite_auth_sso,
    config_node_property_string_t *com_adobe_granite_bundles_hc_impl,
    config_node_property_string_t *com_adobe_granite_compat_router,
    config_node_property_string_t *com_adobe_granite_conf,
    config_node_property_string_t *com_adobe_granite_conf_ui_core,
    config_node_property_string_t *com_adobe_granite_cors,
    config_node_property_string_t *com_adobe_granite_crx_explorer,
    config_node_property_string_t *com_adobe_granite_crxde_lite,
    config_node_property_string_t *com_adobe_granite_crypto_config,
    config_node_property_string_t *com_adobe_granite_crypto_extension,
    config_node_property_string_t *com_adobe_granite_crypto_file,
    config_node_property_string_t *com_adobe_granite_crypto_jcr,
    config_node_property_string_t *com_adobe_granite_csrf,
    config_node_property_string_t *com_adobe_granite_distribution_core,
    config_node_property_string_t *com_adobe_granite_dropwizard_metrics,
    config_node_property_string_t *com_adobe_granite_frags_impl,
    config_node_property_string_t *com_adobe_granite_gibson,
    config_node_property_string_t *com_adobe_granite_infocollector,
    config_node_property_string_t *com_adobe_granite_installer_factory_packages,
    config_node_property_string_t *com_adobe_granite_jetty_ssl,
    config_node_property_string_t *com_adobe_granite_jobs_async,
    config_node_property_string_t *com_adobe_granite_maintenance_oak,
    config_node_property_string_t *com_adobe_granite_monitoring_core,
    config_node_property_string_t *com_adobe_granite_queries,
    config_node_property_string_t *com_adobe_granite_replication_hc_impl,
    config_node_property_string_t *com_adobe_granite_repository_checker,
    config_node_property_string_t *com_adobe_granite_repository_hc_impl,
    config_node_property_string_t *com_adobe_granite_rest_assets,
    config_node_property_string_t *com_adobe_granite_security_ui,
    config_node_property_string_t *com_adobe_granite_startup,
    config_node_property_string_t *com_adobe_granite_tagsoup,
    config_node_property_string_t *com_adobe_granite_taskmanagement_core,
    config_node_property_string_t *com_adobe_granite_taskmanagement_workflow,
    config_node_property_string_t *com_adobe_granite_ui_clientlibs_compiler_less,
    config_node_property_string_t *com_adobe_granite_ui_clientlibs_processor_gcc,
    config_node_property_string_t *com_adobe_granite_webconsole_plugins,
    config_node_property_string_t *com_adobe_granite_workflow_console,
    config_node_property_string_t *com_adobe_xmp_worker_files_native_fragment_linux,
    config_node_property_string_t *com_adobe_xmp_worker_files_native_fragment_macosx,
    config_node_property_string_t *com_adobe_xmp_worker_files_native_fragment_win,
    config_node_property_string_t *com_day_commons_osgi_wrapper_simple_jndi,
    config_node_property_string_t *com_day_cq_cq_authhandler,
    config_node_property_string_t *com_day_cq_cq_compat_configupdate,
    config_node_property_string_t *com_day_cq_cq_licensebranding,
    config_node_property_string_t *com_day_cq_cq_notifcation_impl,
    config_node_property_string_t *com_day_cq_cq_replication_audit,
    config_node_property_string_t *com_day_cq_cq_search_ext,
    config_node_property_string_t *com_day_cq_dam_cq_dam_annotation_print,
    config_node_property_string_t *com_day_cq_dam_cq_dam_asset_usage,
    config_node_property_string_t *com_day_cq_dam_cq_dam_s7dam,
    config_node_property_string_t *com_day_cq_dam_cq_dam_similaritysearch,
    config_node_property_string_t *com_day_cq_dam_dam_webdav_support,
    config_node_property_string_t *com_day_cq_pre_upgrade_tasks,
    config_node_property_string_t *com_day_cq_replication_extensions,
    config_node_property_string_t *com_day_cq_wcm_cq_msm_core,
    config_node_property_string_t *com_day_cq_wcm_cq_wcm_translation,
    config_node_property_string_t *day_commons_jrawio,
    config_node_property_string_t *org_apache_aries_jmx_whiteboard,
    config_node_property_string_t *org_apache_felix_http_sslfilter,
    config_node_property_string_t *org_apache_felix_org_apache_felix_threaddump,
    config_node_property_string_t *org_apache_felix_webconsole_plugins_ds,
    config_node_property_string_t *org_apache_felix_webconsole_plugins_event,
    config_node_property_string_t *org_apache_felix_webconsole_plugins_memoryusage,
    config_node_property_string_t *org_apache_felix_webconsole_plugins_packageadmin,
    config_node_property_string_t *org_apache_jackrabbit_oak_auth_ldap,
    config_node_property_string_t *org_apache_jackrabbit_oak_segment_tar,
    config_node_property_string_t *org_apache_jackrabbit_oak_solr_osgi,
    config_node_property_string_t *org_apache_sling_bundleresource_impl,
    config_node_property_string_t *org_apache_sling_commons_fsclassloader,
    config_node_property_string_t *org_apache_sling_commons_log_webconsole,
    config_node_property_string_t *org_apache_sling_datasource,
    config_node_property_string_t *org_apache_sling_discovery_base,
    config_node_property_string_t *org_apache_sling_discovery_oak,
    config_node_property_string_t *org_apache_sling_discovery_support,
    config_node_property_string_t *org_apache_sling_distribution_api,
    config_node_property_string_t *org_apache_sling_distribution_core,
    config_node_property_string_t *org_apache_sling_extensions_webconsolesecurityprovider,
    config_node_property_string_t *org_apache_sling_hc_webconsole,
    config_node_property_string_t *org_apache_sling_installer_console,
    config_node_property_string_t *org_apache_sling_installer_provider_file,
    config_node_property_string_t *org_apache_sling_installer_provider_jcr,
    config_node_property_string_t *org_apache_sling_jcr_davex,
    config_node_property_string_t *org_apache_sling_jcr_resourcesecurity,
    config_node_property_string_t *org_apache_sling_jmx_provider,
    config_node_property_string_t *org_apache_sling_launchpad_installer,
    config_node_property_string_t *org_apache_sling_models_impl,
    config_node_property_string_t *org_apache_sling_repoinit_parser,
    config_node_property_string_t *org_apache_sling_resource_inventory,
    config_node_property_string_t *org_apache_sling_resourceresolver,
    config_node_property_string_t *org_apache_sling_scripting_javascript,
    config_node_property_string_t *org_apache_sling_scripting_jst,
    config_node_property_string_t *org_apache_sling_scripting_sightly_js_provider,
    config_node_property_string_t *org_apache_sling_scripting_sightly_models_provider,
    config_node_property_string_t *org_apache_sling_security,
    config_node_property_string_t *org_apache_sling_servlets_compat,
    config_node_property_string_t *org_apache_sling_servlets_get,
    config_node_property_string_t *org_apache_sling_startupfilter_disabler,
    config_node_property_string_t *org_apache_sling_tracer,
    config_node_property_string_t *we_retail_client_app_core
);

void com_adobe_granite_apicontroller_filter_resolver_hook_factory_properties_free(com_adobe_granite_apicontroller_filter_resolver_hook_factory_properties_t *com_adobe_granite_apicontroller_filter_resolver_hook_factory_properties);

com_adobe_granite_apicontroller_filter_resolver_hook_factory_properties_t *com_adobe_granite_apicontroller_filter_resolver_hook_factory_properties_parseFromJSON(cJSON *com_adobe_granite_apicontroller_filter_resolver_hook_factory_propertiesJSON);

cJSON *com_adobe_granite_apicontroller_filter_resolver_hook_factory_properties_convertToJSON(com_adobe_granite_apicontroller_filter_resolver_hook_factory_properties_t *com_adobe_granite_apicontroller_filter_resolver_hook_factory_properties);

#endif /* _com_adobe_granite_apicontroller_filter_resolver_hook_factory_properties_H_ */

