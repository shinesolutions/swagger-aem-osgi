@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties(
    @field:JsonProperty("com.adobe.cq.cdn.cdn-rewriter")
    val comAdobeCqCdnCdnRewriter: ConfigNodePropertyString? = null,

    @field:JsonProperty("com.adobe.cq.cloud-config.components")
    val comAdobeCqCloudConfigComponents: ConfigNodePropertyString? = null,

    @field:JsonProperty("com.adobe.cq.cloud-config.core")
    val comAdobeCqCloudConfigCore: ConfigNodePropertyString? = null,

    @field:JsonProperty("com.adobe.cq.cloud-config.ui")
    val comAdobeCqCloudConfigUi: ConfigNodePropertyString? = null,

    @field:JsonProperty("com.adobe.cq.com.adobe.cq.editor")
    val comAdobeCqComAdobeCqEditor: ConfigNodePropertyString? = null,

    @field:JsonProperty("com.adobe.cq.com.adobe.cq.projects.core")
    val comAdobeCqComAdobeCqProjectsCore: ConfigNodePropertyString? = null,

    @field:JsonProperty("com.adobe.cq.com.adobe.cq.projects.wcm.core")
    val comAdobeCqComAdobeCqProjectsWcmCore: ConfigNodePropertyString? = null,

    @field:JsonProperty("com.adobe.cq.com.adobe.cq.ui.commons")
    val comAdobeCqComAdobeCqUiCommons: ConfigNodePropertyString? = null,

    @field:JsonProperty("com.adobe.cq.com.adobe.cq.wcm.style")
    val comAdobeCqComAdobeCqWcmStyle: ConfigNodePropertyString? = null,

    @field:JsonProperty("com.adobe.cq.cq-activitymap-integration")
    val comAdobeCqCqActivitymapIntegration: ConfigNodePropertyString? = null,

    @field:JsonProperty("com.adobe.cq.cq-contexthub-commons")
    val comAdobeCqCqContexthubCommons: ConfigNodePropertyString? = null,

    @field:JsonProperty("com.adobe.cq.cq-dtm")
    val comAdobeCqCqDtm: ConfigNodePropertyString? = null,

    @field:JsonProperty("com.adobe.cq.cq-healthcheck")
    val comAdobeCqCqHealthcheck: ConfigNodePropertyString? = null,

    @field:JsonProperty("com.adobe.cq.cq-multisite-targeting")
    val comAdobeCqCqMultisiteTargeting: ConfigNodePropertyString? = null,

    @field:JsonProperty("com.adobe.cq.cq-pre-upgrade-cleanup")
    val comAdobeCqCqPreUpgradeCleanup: ConfigNodePropertyString? = null,

    @field:JsonProperty("com.adobe.cq.cq-product-info-provider")
    val comAdobeCqCqProductInfoProvider: ConfigNodePropertyString? = null,

    @field:JsonProperty("com.adobe.cq.cq-rest-sites")
    val comAdobeCqCqRestSites: ConfigNodePropertyString? = null,

    @field:JsonProperty("com.adobe.cq.cq-security-hc")
    val comAdobeCqCqSecurityHc: ConfigNodePropertyString? = null,

    @field:JsonProperty("com.adobe.cq.dam.cq-dam-svg-handler")
    val comAdobeCqDamCqDamSvgHandler: ConfigNodePropertyString? = null,

    @field:JsonProperty("com.adobe.cq.dam.cq-scene7-imaging")
    val comAdobeCqDamCqScene7Imaging: ConfigNodePropertyString? = null,

    @field:JsonProperty("com.adobe.cq.dtm-reactor.core")
    val comAdobeCqDtmReactorCore: ConfigNodePropertyString? = null,

    @field:JsonProperty("com.adobe.cq.dtm-reactor.ui")
    val comAdobeCqDtmReactorUi: ConfigNodePropertyString? = null,

    @field:JsonProperty("com.adobe.cq.exp-jspel-resolver")
    val comAdobeCqExpJspelResolver: ConfigNodePropertyString? = null,

    @field:JsonProperty("com.adobe.cq.inbox.cq-inbox")
    val comAdobeCqInboxCqInbox: ConfigNodePropertyString? = null,

    @field:JsonProperty("com.adobe.cq.json-schema-parser")
    val comAdobeCqJsonSchemaParser: ConfigNodePropertyString? = null,

    @field:JsonProperty("com.adobe.cq.media.cq-media-publishing-dps-fp-core")
    val comAdobeCqMediaCqMediaPublishingDpsFpCore: ConfigNodePropertyString? = null,

    @field:JsonProperty("com.adobe.cq.mobile.cq-mobile-caas")
    val comAdobeCqMobileCqMobileCaas: ConfigNodePropertyString? = null,

    @field:JsonProperty("com.adobe.cq.mobile.cq-mobile-index-builder")
    val comAdobeCqMobileCqMobileIndexBuilder: ConfigNodePropertyString? = null,

    @field:JsonProperty("com.adobe.cq.mobile.cq-mobile-phonegap-build")
    val comAdobeCqMobileCqMobilePhonegapBuild: ConfigNodePropertyString? = null,

    @field:JsonProperty("com.adobe.cq.myspell")
    val comAdobeCqMyspell: ConfigNodePropertyString? = null,

    @field:JsonProperty("com.adobe.cq.sample.we.retail.core")
    val comAdobeCqSampleWeRetailCore: ConfigNodePropertyString? = null,

    @field:JsonProperty("com.adobe.cq.screens.com.adobe.cq.screens.dcc")
    val comAdobeCqScreensComAdobeCqScreensDcc: ConfigNodePropertyString? = null,

    @field:JsonProperty("com.adobe.cq.screens.com.adobe.cq.screens.mq.core")
    val comAdobeCqScreensComAdobeCqScreensMqCore: ConfigNodePropertyString? = null,

    @field:JsonProperty("com.adobe.cq.social.cq-social-as-provider")
    val comAdobeCqSocialCqSocialAsProvider: ConfigNodePropertyString? = null,

    @field:JsonProperty("com.adobe.cq.social.cq-social-badging-basic-impl")
    val comAdobeCqSocialCqSocialBadgingBasicImpl: ConfigNodePropertyString? = null,

    @field:JsonProperty("com.adobe.cq.social.cq-social-badging-impl")
    val comAdobeCqSocialCqSocialBadgingImpl: ConfigNodePropertyString? = null,

    @field:JsonProperty("com.adobe.cq.social.cq-social-calendar-impl")
    val comAdobeCqSocialCqSocialCalendarImpl: ConfigNodePropertyString? = null,

    @field:JsonProperty("com.adobe.cq.social.cq-social-content-fragments-impl")
    val comAdobeCqSocialCqSocialContentFragmentsImpl: ConfigNodePropertyString? = null,

    @field:JsonProperty("com.adobe.cq.social.cq-social-enablement-impl")
    val comAdobeCqSocialCqSocialEnablementImpl: ConfigNodePropertyString? = null,

    @field:JsonProperty("com.adobe.cq.social.cq-social-graph-impl")
    val comAdobeCqSocialCqSocialGraphImpl: ConfigNodePropertyString? = null,

    @field:JsonProperty("com.adobe.cq.social.cq-social-ideation-impl")
    val comAdobeCqSocialCqSocialIdeationImpl: ConfigNodePropertyString? = null,

    @field:JsonProperty("com.adobe.cq.social.cq-social-jcr-provider")
    val comAdobeCqSocialCqSocialJcrProvider: ConfigNodePropertyString? = null,

    @field:JsonProperty("com.adobe.cq.social.cq-social-members-impl")
    val comAdobeCqSocialCqSocialMembersImpl: ConfigNodePropertyString? = null,

    @field:JsonProperty("com.adobe.cq.social.cq-social-ms-provider")
    val comAdobeCqSocialCqSocialMsProvider: ConfigNodePropertyString? = null,

    @field:JsonProperty("com.adobe.cq.social.cq-social-notifications-channels-web")
    val comAdobeCqSocialCqSocialNotificationsChannelsWeb: ConfigNodePropertyString? = null,

    @field:JsonProperty("com.adobe.cq.social.cq-social-notifications-impl")
    val comAdobeCqSocialCqSocialNotificationsImpl: ConfigNodePropertyString? = null,

    @field:JsonProperty("com.adobe.cq.social.cq-social-rdb-provider")
    val comAdobeCqSocialCqSocialRdbProvider: ConfigNodePropertyString? = null,

    @field:JsonProperty("com.adobe.cq.social.cq-social-scf-impl")
    val comAdobeCqSocialCqSocialScfImpl: ConfigNodePropertyString? = null,

    @field:JsonProperty("com.adobe.cq.social.cq-social-scoring-basic-impl")
    val comAdobeCqSocialCqSocialScoringBasicImpl: ConfigNodePropertyString? = null,

    @field:JsonProperty("com.adobe.cq.social.cq-social-scoring-impl")
    val comAdobeCqSocialCqSocialScoringImpl: ConfigNodePropertyString? = null,

    @field:JsonProperty("com.adobe.cq.social.cq-social-serviceusers-impl")
    val comAdobeCqSocialCqSocialServiceusersImpl: ConfigNodePropertyString? = null,

    @field:JsonProperty("com.adobe.cq.social.cq-social-srp-impl")
    val comAdobeCqSocialCqSocialSrpImpl: ConfigNodePropertyString? = null,

    @field:JsonProperty("com.adobe.cq.social.cq-social-ugcbase-impl")
    val comAdobeCqSocialCqSocialUgcbaseImpl: ConfigNodePropertyString? = null,

    @field:JsonProperty("com.adobe.dam.cq-dam-cfm-impl")
    val comAdobeDamCqDamCfmImpl: ConfigNodePropertyString? = null,

    @field:JsonProperty("com.adobe.forms.foundation-forms-foundation-base")
    val comAdobeFormsFoundationFormsFoundationBase: ConfigNodePropertyString? = null,

    @field:JsonProperty("com.adobe.granite.apicontroller")
    val comAdobeGraniteApicontroller: ConfigNodePropertyString? = null,

    @field:JsonProperty("com.adobe.granite.asset.core")
    val comAdobeGraniteAssetCore: ConfigNodePropertyString? = null,

    @field:JsonProperty("com.adobe.granite.auth.sso")
    val comAdobeGraniteAuthSso: ConfigNodePropertyString? = null,

    @field:JsonProperty("com.adobe.granite.bundles.hc.impl")
    val comAdobeGraniteBundlesHcImpl: ConfigNodePropertyString? = null,

    @field:JsonProperty("com.adobe.granite.compat-router")
    val comAdobeGraniteCompatRouter: ConfigNodePropertyString? = null,

    @field:JsonProperty("com.adobe.granite.conf")
    val comAdobeGraniteConf: ConfigNodePropertyString? = null,

    @field:JsonProperty("com.adobe.granite.conf.ui.core")
    val comAdobeGraniteConfUiCore: ConfigNodePropertyString? = null,

    @field:JsonProperty("com.adobe.granite.cors")
    val comAdobeGraniteCors: ConfigNodePropertyString? = null,

    @field:JsonProperty("com.adobe.granite.crx-explorer")
    val comAdobeGraniteCrxExplorer: ConfigNodePropertyString? = null,

    @field:JsonProperty("com.adobe.granite.crxde-lite")
    val comAdobeGraniteCrxdeLite: ConfigNodePropertyString? = null,

    @field:JsonProperty("com.adobe.granite.crypto.config")
    val comAdobeGraniteCryptoConfig: ConfigNodePropertyString? = null,

    @field:JsonProperty("com.adobe.granite.crypto.extension")
    val comAdobeGraniteCryptoExtension: ConfigNodePropertyString? = null,

    @field:JsonProperty("com.adobe.granite.crypto.file")
    val comAdobeGraniteCryptoFile: ConfigNodePropertyString? = null,

    @field:JsonProperty("com.adobe.granite.crypto.jcr")
    val comAdobeGraniteCryptoJcr: ConfigNodePropertyString? = null,

    @field:JsonProperty("com.adobe.granite.csrf")
    val comAdobeGraniteCsrf: ConfigNodePropertyString? = null,

    @field:JsonProperty("com.adobe.granite.distribution.core")
    val comAdobeGraniteDistributionCore: ConfigNodePropertyString? = null,

    @field:JsonProperty("com.adobe.granite.dropwizard.metrics")
    val comAdobeGraniteDropwizardMetrics: ConfigNodePropertyString? = null,

    @field:JsonProperty("com.adobe.granite.frags.impl")
    val comAdobeGraniteFragsImpl: ConfigNodePropertyString? = null,

    @field:JsonProperty("com.adobe.granite.gibson")
    val comAdobeGraniteGibson: ConfigNodePropertyString? = null,

    @field:JsonProperty("com.adobe.granite.infocollector")
    val comAdobeGraniteInfocollector: ConfigNodePropertyString? = null,

    @field:JsonProperty("com.adobe.granite.installer.factory.packages")
    val comAdobeGraniteInstallerFactoryPackages: ConfigNodePropertyString? = null,

    @field:JsonProperty("com.adobe.granite.jetty.ssl")
    val comAdobeGraniteJettySsl: ConfigNodePropertyString? = null,

    @field:JsonProperty("com.adobe.granite.jobs.async")
    val comAdobeGraniteJobsAsync: ConfigNodePropertyString? = null,

    @field:JsonProperty("com.adobe.granite.maintenance.oak")
    val comAdobeGraniteMaintenanceOak: ConfigNodePropertyString? = null,

    @field:JsonProperty("com.adobe.granite.monitoring.core")
    val comAdobeGraniteMonitoringCore: ConfigNodePropertyString? = null,

    @field:JsonProperty("com.adobe.granite.queries")
    val comAdobeGraniteQueries: ConfigNodePropertyString? = null,

    @field:JsonProperty("com.adobe.granite.replication.hc.impl")
    val comAdobeGraniteReplicationHcImpl: ConfigNodePropertyString? = null,

    @field:JsonProperty("com.adobe.granite.repository.checker")
    val comAdobeGraniteRepositoryChecker: ConfigNodePropertyString? = null,

    @field:JsonProperty("com.adobe.granite.repository.hc.impl")
    val comAdobeGraniteRepositoryHcImpl: ConfigNodePropertyString? = null,

    @field:JsonProperty("com.adobe.granite.rest.assets")
    val comAdobeGraniteRestAssets: ConfigNodePropertyString? = null,

    @field:JsonProperty("com.adobe.granite.security.ui")
    val comAdobeGraniteSecurityUi: ConfigNodePropertyString? = null,

    @field:JsonProperty("com.adobe.granite.startup")
    val comAdobeGraniteStartup: ConfigNodePropertyString? = null,

    @field:JsonProperty("com.adobe.granite.tagsoup")
    val comAdobeGraniteTagsoup: ConfigNodePropertyString? = null,

    @field:JsonProperty("com.adobe.granite.taskmanagement.core")
    val comAdobeGraniteTaskmanagementCore: ConfigNodePropertyString? = null,

    @field:JsonProperty("com.adobe.granite.taskmanagement.workflow")
    val comAdobeGraniteTaskmanagementWorkflow: ConfigNodePropertyString? = null,

    @field:JsonProperty("com.adobe.granite.ui.clientlibs.compiler.less")
    val comAdobeGraniteUiClientlibsCompilerLess: ConfigNodePropertyString? = null,

    @field:JsonProperty("com.adobe.granite.ui.clientlibs.processor.gcc")
    val comAdobeGraniteUiClientlibsProcessorGcc: ConfigNodePropertyString? = null,

    @field:JsonProperty("com.adobe.granite.webconsole.plugins")
    val comAdobeGraniteWebconsolePlugins: ConfigNodePropertyString? = null,

    @field:JsonProperty("com.adobe.granite.workflow.console")
    val comAdobeGraniteWorkflowConsole: ConfigNodePropertyString? = null,

    @field:JsonProperty("com.adobe.xmp.worker.files.native.fragment.linux")
    val comAdobeXmpWorkerFilesNativeFragmentLinux: ConfigNodePropertyString? = null,

    @field:JsonProperty("com.adobe.xmp.worker.files.native.fragment.macosx")
    val comAdobeXmpWorkerFilesNativeFragmentMacosx: ConfigNodePropertyString? = null,

    @field:JsonProperty("com.adobe.xmp.worker.files.native.fragment.win")
    val comAdobeXmpWorkerFilesNativeFragmentWin: ConfigNodePropertyString? = null,

    @field:JsonProperty("com.day.commons.osgi.wrapper.simple-jndi")
    val comDayCommonsOsgiWrapperSimpleJndi: ConfigNodePropertyString? = null,

    @field:JsonProperty("com.day.cq.cq-authhandler")
    val comDayCqCqAuthhandler: ConfigNodePropertyString? = null,

    @field:JsonProperty("com.day.cq.cq-compat-configupdate")
    val comDayCqCqCompatConfigupdate: ConfigNodePropertyString? = null,

    @field:JsonProperty("com.day.cq.cq-licensebranding")
    val comDayCqCqLicensebranding: ConfigNodePropertyString? = null,

    @field:JsonProperty("com.day.cq.cq-notifcation-impl")
    val comDayCqCqNotifcationImpl: ConfigNodePropertyString? = null,

    @field:JsonProperty("com.day.cq.cq-replication-audit")
    val comDayCqCqReplicationAudit: ConfigNodePropertyString? = null,

    @field:JsonProperty("com.day.cq.cq-search-ext")
    val comDayCqCqSearchExt: ConfigNodePropertyString? = null,

    @field:JsonProperty("com.day.cq.dam.cq-dam-annotation-print")
    val comDayCqDamCqDamAnnotationPrint: ConfigNodePropertyString? = null,

    @field:JsonProperty("com.day.cq.dam.cq-dam-asset-usage")
    val comDayCqDamCqDamAssetUsage: ConfigNodePropertyString? = null,

    @field:JsonProperty("com.day.cq.dam.cq-dam-s7dam")
    val comDayCqDamCqDamS7dam: ConfigNodePropertyString? = null,

    @field:JsonProperty("com.day.cq.dam.cq-dam-similaritysearch")
    val comDayCqDamCqDamSimilaritysearch: ConfigNodePropertyString? = null,

    @field:JsonProperty("com.day.cq.dam.dam-webdav-support")
    val comDayCqDamDamWebdavSupport: ConfigNodePropertyString? = null,

    @field:JsonProperty("com.day.cq.pre-upgrade-tasks")
    val comDayCqPreUpgradeTasks: ConfigNodePropertyString? = null,

    @field:JsonProperty("com.day.cq.replication.extensions")
    val comDayCqReplicationExtensions: ConfigNodePropertyString? = null,

    @field:JsonProperty("com.day.cq.wcm.cq-msm-core")
    val comDayCqWcmCqMsmCore: ConfigNodePropertyString? = null,

    @field:JsonProperty("com.day.cq.wcm.cq-wcm-translation")
    val comDayCqWcmCqWcmTranslation: ConfigNodePropertyString? = null,

    @field:JsonProperty("day-commons-jrawio")
    val dayCommonsJrawio: ConfigNodePropertyString? = null,

    @field:JsonProperty("org.apache.aries.jmx.whiteboard")
    val orgApacheAriesJmxWhiteboard: ConfigNodePropertyString? = null,

    @field:JsonProperty("org.apache.felix.http.sslfilter")
    val orgApacheFelixHttpSslfilter: ConfigNodePropertyString? = null,

    @field:JsonProperty("org.apache.felix.org.apache.felix.threaddump")
    val orgApacheFelixOrgApacheFelixThreaddump: ConfigNodePropertyString? = null,

    @field:JsonProperty("org.apache.felix.webconsole.plugins.ds")
    val orgApacheFelixWebconsolePluginsDs: ConfigNodePropertyString? = null,

    @field:JsonProperty("org.apache.felix.webconsole.plugins.event")
    val orgApacheFelixWebconsolePluginsEvent: ConfigNodePropertyString? = null,

    @field:JsonProperty("org.apache.felix.webconsole.plugins.memoryusage")
    val orgApacheFelixWebconsolePluginsMemoryusage: ConfigNodePropertyString? = null,

    @field:JsonProperty("org.apache.felix.webconsole.plugins.packageadmin")
    val orgApacheFelixWebconsolePluginsPackageadmin: ConfigNodePropertyString? = null,

    @field:JsonProperty("org.apache.jackrabbit.oak-auth-ldap")
    val orgApacheJackrabbitOakAuthLdap: ConfigNodePropertyString? = null,

    @field:JsonProperty("org.apache.jackrabbit.oak-segment-tar")
    val orgApacheJackrabbitOakSegmentTar: ConfigNodePropertyString? = null,

    @field:JsonProperty("org.apache.jackrabbit.oak-solr-osgi")
    val orgApacheJackrabbitOakSolrOsgi: ConfigNodePropertyString? = null,

    @field:JsonProperty("org.apache.sling.bundleresource.impl")
    val orgApacheSlingBundleresourceImpl: ConfigNodePropertyString? = null,

    @field:JsonProperty("org.apache.sling.commons.fsclassloader")
    val orgApacheSlingCommonsFsclassloader: ConfigNodePropertyString? = null,

    @field:JsonProperty("org.apache.sling.commons.log.webconsole")
    val orgApacheSlingCommonsLogWebconsole: ConfigNodePropertyString? = null,

    @field:JsonProperty("org.apache.sling.datasource")
    val orgApacheSlingDatasource: ConfigNodePropertyString? = null,

    @field:JsonProperty("org.apache.sling.discovery.base")
    val orgApacheSlingDiscoveryBase: ConfigNodePropertyString? = null,

    @field:JsonProperty("org.apache.sling.discovery.oak")
    val orgApacheSlingDiscoveryOak: ConfigNodePropertyString? = null,

    @field:JsonProperty("org.apache.sling.discovery.support")
    val orgApacheSlingDiscoverySupport: ConfigNodePropertyString? = null,

    @field:JsonProperty("org.apache.sling.distribution.api")
    val orgApacheSlingDistributionApi: ConfigNodePropertyString? = null,

    @field:JsonProperty("org.apache.sling.distribution.core")
    val orgApacheSlingDistributionCore: ConfigNodePropertyString? = null,

    @field:JsonProperty("org.apache.sling.extensions.webconsolesecurityprovider")
    val orgApacheSlingExtensionsWebconsolesecurityprovider: ConfigNodePropertyString? = null,

    @field:JsonProperty("org.apache.sling.hc.webconsole")
    val orgApacheSlingHcWebconsole: ConfigNodePropertyString? = null,

    @field:JsonProperty("org.apache.sling.installer.console")
    val orgApacheSlingInstallerConsole: ConfigNodePropertyString? = null,

    @field:JsonProperty("org.apache.sling.installer.provider.file")
    val orgApacheSlingInstallerProviderFile: ConfigNodePropertyString? = null,

    @field:JsonProperty("org.apache.sling.installer.provider.jcr")
    val orgApacheSlingInstallerProviderJcr: ConfigNodePropertyString? = null,

    @field:JsonProperty("org.apache.sling.jcr.davex")
    val orgApacheSlingJcrDavex: ConfigNodePropertyString? = null,

    @field:JsonProperty("org.apache.sling.jcr.resourcesecurity")
    val orgApacheSlingJcrResourcesecurity: ConfigNodePropertyString? = null,

    @field:JsonProperty("org.apache.sling.jmx.provider")
    val orgApacheSlingJmxProvider: ConfigNodePropertyString? = null,

    @field:JsonProperty("org.apache.sling.launchpad.installer")
    val orgApacheSlingLaunchpadInstaller: ConfigNodePropertyString? = null,

    @field:JsonProperty("org.apache.sling.models.impl")
    val orgApacheSlingModelsImpl: ConfigNodePropertyString? = null,

    @field:JsonProperty("org.apache.sling.repoinit.parser")
    val orgApacheSlingRepoinitParser: ConfigNodePropertyString? = null,

    @field:JsonProperty("org.apache.sling.resource.inventory")
    val orgApacheSlingResourceInventory: ConfigNodePropertyString? = null,

    @field:JsonProperty("org.apache.sling.resourceresolver")
    val orgApacheSlingResourceresolver: ConfigNodePropertyString? = null,

    @field:JsonProperty("org.apache.sling.scripting.javascript")
    val orgApacheSlingScriptingJavascript: ConfigNodePropertyString? = null,

    @field:JsonProperty("org.apache.sling.scripting.jst")
    val orgApacheSlingScriptingJst: ConfigNodePropertyString? = null,

    @field:JsonProperty("org.apache.sling.scripting.sightly.js.provider")
    val orgApacheSlingScriptingSightlyJsProvider: ConfigNodePropertyString? = null,

    @field:JsonProperty("org.apache.sling.scripting.sightly.models.provider")
    val orgApacheSlingScriptingSightlyModelsProvider: ConfigNodePropertyString? = null,

    @field:JsonProperty("org.apache.sling.security")
    val orgApacheSlingSecurity: ConfigNodePropertyString? = null,

    @field:JsonProperty("org.apache.sling.servlets.compat")
    val orgApacheSlingServletsCompat: ConfigNodePropertyString? = null,

    @field:JsonProperty("org.apache.sling.servlets.get")
    val orgApacheSlingServletsGet: ConfigNodePropertyString? = null,

    @field:JsonProperty("org.apache.sling.startupfilter.disabler")
    val orgApacheSlingStartupfilterDisabler: ConfigNodePropertyString? = null,

    @field:JsonProperty("org.apache.sling.tracer")
    val orgApacheSlingTracer: ConfigNodePropertyString? = null,

    @field:JsonProperty("we.retail.client.app.core")
    val weRetailClientAppCore: ConfigNodePropertyString? = null,

)
