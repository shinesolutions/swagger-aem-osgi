package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyString

/**
 * 
 * @param comPeriodadobePeriodcqPeriodcdnPeriodcdnMinusrewriter 
 * @param comPeriodadobePeriodcqPeriodcloudMinusconfigPeriodcomponents 
 * @param comPeriodadobePeriodcqPeriodcloudMinusconfigPeriodcore 
 * @param comPeriodadobePeriodcqPeriodcloudMinusconfigPeriodui 
 * @param comPeriodadobePeriodcqPeriodcomPeriodadobePeriodcqPeriodeditor 
 * @param comPeriodadobePeriodcqPeriodcomPeriodadobePeriodcqPeriodprojectsPeriodcore 
 * @param comPeriodadobePeriodcqPeriodcomPeriodadobePeriodcqPeriodprojectsPeriodwcmPeriodcore 
 * @param comPeriodadobePeriodcqPeriodcomPeriodadobePeriodcqPerioduiPeriodcommons 
 * @param comPeriodadobePeriodcqPeriodcomPeriodadobePeriodcqPeriodwcmPeriodstyle 
 * @param comPeriodadobePeriodcqPeriodcqMinusactivitymapMinusintegration 
 * @param comPeriodadobePeriodcqPeriodcqMinuscontexthubMinuscommons 
 * @param comPeriodadobePeriodcqPeriodcqMinusdtm 
 * @param comPeriodadobePeriodcqPeriodcqMinushealthcheck 
 * @param comPeriodadobePeriodcqPeriodcqMinusmultisiteMinustargeting 
 * @param comPeriodadobePeriodcqPeriodcqMinuspreMinusupgradeMinuscleanup 
 * @param comPeriodadobePeriodcqPeriodcqMinusproductMinusinfoMinusprovider 
 * @param comPeriodadobePeriodcqPeriodcqMinusrestMinussites 
 * @param comPeriodadobePeriodcqPeriodcqMinussecurityMinushc 
 * @param comPeriodadobePeriodcqPerioddamPeriodcqMinusdamMinussvgMinushandler 
 * @param comPeriodadobePeriodcqPerioddamPeriodcqMinusscene7Minusimaging 
 * @param comPeriodadobePeriodcqPerioddtmMinusreactorPeriodcore 
 * @param comPeriodadobePeriodcqPerioddtmMinusreactorPeriodui 
 * @param comPeriodadobePeriodcqPeriodexpMinusjspelMinusresolver 
 * @param comPeriodadobePeriodcqPeriodinboxPeriodcqMinusinbox 
 * @param comPeriodadobePeriodcqPeriodjsonMinusschemaMinusparser 
 * @param comPeriodadobePeriodcqPeriodmediaPeriodcqMinusmediaMinuspublishingMinusdpsMinusfpMinuscore 
 * @param comPeriodadobePeriodcqPeriodmobilePeriodcqMinusmobileMinuscaas 
 * @param comPeriodadobePeriodcqPeriodmobilePeriodcqMinusmobileMinusindexMinusbuilder 
 * @param comPeriodadobePeriodcqPeriodmobilePeriodcqMinusmobileMinusphonegapMinusbuild 
 * @param comPeriodadobePeriodcqPeriodmyspell 
 * @param comPeriodadobePeriodcqPeriodsamplePeriodwePeriodretailPeriodcore 
 * @param comPeriodadobePeriodcqPeriodscreensPeriodcomPeriodadobePeriodcqPeriodscreensPerioddcc 
 * @param comPeriodadobePeriodcqPeriodscreensPeriodcomPeriodadobePeriodcqPeriodscreensPeriodmqPeriodcore 
 * @param comPeriodadobePeriodcqPeriodsocialPeriodcqMinussocialMinusasMinusprovider 
 * @param comPeriodadobePeriodcqPeriodsocialPeriodcqMinussocialMinusbadgingMinusbasicMinusimpl 
 * @param comPeriodadobePeriodcqPeriodsocialPeriodcqMinussocialMinusbadgingMinusimpl 
 * @param comPeriodadobePeriodcqPeriodsocialPeriodcqMinussocialMinuscalendarMinusimpl 
 * @param comPeriodadobePeriodcqPeriodsocialPeriodcqMinussocialMinuscontentMinusfragmentsMinusimpl 
 * @param comPeriodadobePeriodcqPeriodsocialPeriodcqMinussocialMinusenablementMinusimpl 
 * @param comPeriodadobePeriodcqPeriodsocialPeriodcqMinussocialMinusgraphMinusimpl 
 * @param comPeriodadobePeriodcqPeriodsocialPeriodcqMinussocialMinusideationMinusimpl 
 * @param comPeriodadobePeriodcqPeriodsocialPeriodcqMinussocialMinusjcrMinusprovider 
 * @param comPeriodadobePeriodcqPeriodsocialPeriodcqMinussocialMinusmembersMinusimpl 
 * @param comPeriodadobePeriodcqPeriodsocialPeriodcqMinussocialMinusmsMinusprovider 
 * @param comPeriodadobePeriodcqPeriodsocialPeriodcqMinussocialMinusnotificationsMinuschannelsMinusweb 
 * @param comPeriodadobePeriodcqPeriodsocialPeriodcqMinussocialMinusnotificationsMinusimpl 
 * @param comPeriodadobePeriodcqPeriodsocialPeriodcqMinussocialMinusrdbMinusprovider 
 * @param comPeriodadobePeriodcqPeriodsocialPeriodcqMinussocialMinusscfMinusimpl 
 * @param comPeriodadobePeriodcqPeriodsocialPeriodcqMinussocialMinusscoringMinusbasicMinusimpl 
 * @param comPeriodadobePeriodcqPeriodsocialPeriodcqMinussocialMinusscoringMinusimpl 
 * @param comPeriodadobePeriodcqPeriodsocialPeriodcqMinussocialMinusserviceusersMinusimpl 
 * @param comPeriodadobePeriodcqPeriodsocialPeriodcqMinussocialMinussrpMinusimpl 
 * @param comPeriodadobePeriodcqPeriodsocialPeriodcqMinussocialMinusugcbaseMinusimpl 
 * @param comPeriodadobePerioddamPeriodcqMinusdamMinuscfmMinusimpl 
 * @param comPeriodadobePeriodformsPeriodfoundationMinusformsMinusfoundationMinusbase 
 * @param comPeriodadobePeriodgranitePeriodapicontroller 
 * @param comPeriodadobePeriodgranitePeriodassetPeriodcore 
 * @param comPeriodadobePeriodgranitePeriodauthPeriodsso 
 * @param comPeriodadobePeriodgranitePeriodbundlesPeriodhcPeriodimpl 
 * @param comPeriodadobePeriodgranitePeriodcompatMinusrouter 
 * @param comPeriodadobePeriodgranitePeriodconf 
 * @param comPeriodadobePeriodgranitePeriodconfPerioduiPeriodcore 
 * @param comPeriodadobePeriodgranitePeriodcors 
 * @param comPeriodadobePeriodgranitePeriodcrxMinusexplorer 
 * @param comPeriodadobePeriodgranitePeriodcrxdeMinuslite 
 * @param comPeriodadobePeriodgranitePeriodcryptoPeriodconfig 
 * @param comPeriodadobePeriodgranitePeriodcryptoPeriodextension 
 * @param comPeriodadobePeriodgranitePeriodcryptoPeriodfile 
 * @param comPeriodadobePeriodgranitePeriodcryptoPeriodjcr 
 * @param comPeriodadobePeriodgranitePeriodcsrf 
 * @param comPeriodadobePeriodgranitePerioddistributionPeriodcore 
 * @param comPeriodadobePeriodgranitePerioddropwizardPeriodmetrics 
 * @param comPeriodadobePeriodgranitePeriodfragsPeriodimpl 
 * @param comPeriodadobePeriodgranitePeriodgibson 
 * @param comPeriodadobePeriodgranitePeriodinfocollector 
 * @param comPeriodadobePeriodgranitePeriodinstallerPeriodfactoryPeriodpackages 
 * @param comPeriodadobePeriodgranitePeriodjettyPeriodssl 
 * @param comPeriodadobePeriodgranitePeriodjobsPeriodasync 
 * @param comPeriodadobePeriodgranitePeriodmaintenancePeriodoak 
 * @param comPeriodadobePeriodgranitePeriodmonitoringPeriodcore 
 * @param comPeriodadobePeriodgranitePeriodqueries 
 * @param comPeriodadobePeriodgranitePeriodreplicationPeriodhcPeriodimpl 
 * @param comPeriodadobePeriodgranitePeriodrepositoryPeriodchecker 
 * @param comPeriodadobePeriodgranitePeriodrepositoryPeriodhcPeriodimpl 
 * @param comPeriodadobePeriodgranitePeriodrestPeriodassets 
 * @param comPeriodadobePeriodgranitePeriodsecurityPeriodui 
 * @param comPeriodadobePeriodgranitePeriodstartup 
 * @param comPeriodadobePeriodgranitePeriodtagsoup 
 * @param comPeriodadobePeriodgranitePeriodtaskmanagementPeriodcore 
 * @param comPeriodadobePeriodgranitePeriodtaskmanagementPeriodworkflow 
 * @param comPeriodadobePeriodgranitePerioduiPeriodclientlibsPeriodcompilerPeriodless 
 * @param comPeriodadobePeriodgranitePerioduiPeriodclientlibsPeriodprocessorPeriodgcc 
 * @param comPeriodadobePeriodgranitePeriodwebconsolePeriodplugins 
 * @param comPeriodadobePeriodgranitePeriodworkflowPeriodconsole 
 * @param comPeriodadobePeriodxmpPeriodworkerPeriodfilesPeriodnativePeriodfragmentPeriodlinux 
 * @param comPeriodadobePeriodxmpPeriodworkerPeriodfilesPeriodnativePeriodfragmentPeriodmacosx 
 * @param comPeriodadobePeriodxmpPeriodworkerPeriodfilesPeriodnativePeriodfragmentPeriodwin 
 * @param comPerioddayPeriodcommonsPeriodosgiPeriodwrapperPeriodsimpleMinusjndi 
 * @param comPerioddayPeriodcqPeriodcqMinusauthhandler 
 * @param comPerioddayPeriodcqPeriodcqMinuscompatMinusconfigupdate 
 * @param comPerioddayPeriodcqPeriodcqMinuslicensebranding 
 * @param comPerioddayPeriodcqPeriodcqMinusnotifcationMinusimpl 
 * @param comPerioddayPeriodcqPeriodcqMinusreplicationMinusaudit 
 * @param comPerioddayPeriodcqPeriodcqMinussearchMinusext 
 * @param comPerioddayPeriodcqPerioddamPeriodcqMinusdamMinusannotationMinusprint 
 * @param comPerioddayPeriodcqPerioddamPeriodcqMinusdamMinusassetMinususage 
 * @param comPerioddayPeriodcqPerioddamPeriodcqMinusdamMinuss7dam 
 * @param comPerioddayPeriodcqPerioddamPeriodcqMinusdamMinussimilaritysearch 
 * @param comPerioddayPeriodcqPerioddamPerioddamMinuswebdavMinussupport 
 * @param comPerioddayPeriodcqPeriodpreMinusupgradeMinustasks 
 * @param comPerioddayPeriodcqPeriodreplicationPeriodextensions 
 * @param comPerioddayPeriodcqPeriodwcmPeriodcqMinusmsmMinuscore 
 * @param comPerioddayPeriodcqPeriodwcmPeriodcqMinuswcmMinustranslation 
 * @param dayMinuscommonsMinusjrawio 
 * @param orgPeriodapachePeriodariesPeriodjmxPeriodwhiteboard 
 * @param orgPeriodapachePeriodfelixPeriodhttpPeriodsslfilter 
 * @param orgPeriodapachePeriodfelixPeriodorgPeriodapachePeriodfelixPeriodthreaddump 
 * @param orgPeriodapachePeriodfelixPeriodwebconsolePeriodpluginsPeriodds 
 * @param orgPeriodapachePeriodfelixPeriodwebconsolePeriodpluginsPeriodevent 
 * @param orgPeriodapachePeriodfelixPeriodwebconsolePeriodpluginsPeriodmemoryusage 
 * @param orgPeriodapachePeriodfelixPeriodwebconsolePeriodpluginsPeriodpackageadmin 
 * @param orgPeriodapachePeriodjackrabbitPeriodoakMinusauthMinusldap 
 * @param orgPeriodapachePeriodjackrabbitPeriodoakMinussegmentMinustar 
 * @param orgPeriodapachePeriodjackrabbitPeriodoakMinussolrMinusosgi 
 * @param orgPeriodapachePeriodslingPeriodbundleresourcePeriodimpl 
 * @param orgPeriodapachePeriodslingPeriodcommonsPeriodfsclassloader 
 * @param orgPeriodapachePeriodslingPeriodcommonsPeriodlogPeriodwebconsole 
 * @param orgPeriodapachePeriodslingPerioddatasource 
 * @param orgPeriodapachePeriodslingPerioddiscoveryPeriodbase 
 * @param orgPeriodapachePeriodslingPerioddiscoveryPeriodoak 
 * @param orgPeriodapachePeriodslingPerioddiscoveryPeriodsupport 
 * @param orgPeriodapachePeriodslingPerioddistributionPeriodapi 
 * @param orgPeriodapachePeriodslingPerioddistributionPeriodcore 
 * @param orgPeriodapachePeriodslingPeriodextensionsPeriodwebconsolesecurityprovider 
 * @param orgPeriodapachePeriodslingPeriodhcPeriodwebconsole 
 * @param orgPeriodapachePeriodslingPeriodinstallerPeriodconsole 
 * @param orgPeriodapachePeriodslingPeriodinstallerPeriodproviderPeriodfile 
 * @param orgPeriodapachePeriodslingPeriodinstallerPeriodproviderPeriodjcr 
 * @param orgPeriodapachePeriodslingPeriodjcrPerioddavex 
 * @param orgPeriodapachePeriodslingPeriodjcrPeriodresourcesecurity 
 * @param orgPeriodapachePeriodslingPeriodjmxPeriodprovider 
 * @param orgPeriodapachePeriodslingPeriodlaunchpadPeriodinstaller 
 * @param orgPeriodapachePeriodslingPeriodmodelsPeriodimpl 
 * @param orgPeriodapachePeriodslingPeriodrepoinitPeriodparser 
 * @param orgPeriodapachePeriodslingPeriodresourcePeriodinventory 
 * @param orgPeriodapachePeriodslingPeriodresourceresolver 
 * @param orgPeriodapachePeriodslingPeriodscriptingPeriodjavascript 
 * @param orgPeriodapachePeriodslingPeriodscriptingPeriodjst 
 * @param orgPeriodapachePeriodslingPeriodscriptingPeriodsightlyPeriodjsPeriodprovider 
 * @param orgPeriodapachePeriodslingPeriodscriptingPeriodsightlyPeriodmodelsPeriodprovider 
 * @param orgPeriodapachePeriodslingPeriodsecurity 
 * @param orgPeriodapachePeriodslingPeriodservletsPeriodcompat 
 * @param orgPeriodapachePeriodslingPeriodservletsPeriodget 
 * @param orgPeriodapachePeriodslingPeriodstartupfilterPerioddisabler 
 * @param orgPeriodapachePeriodslingPeriodtracer 
 * @param wePeriodretailPeriodclientPeriodappPeriodcore 
 */
case class ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties(comPeriodadobePeriodcqPeriodcdnPeriodcdnMinusrewriter: Option[ConfigNodePropertyString],
                comPeriodadobePeriodcqPeriodcloudMinusconfigPeriodcomponents: Option[ConfigNodePropertyString],
                comPeriodadobePeriodcqPeriodcloudMinusconfigPeriodcore: Option[ConfigNodePropertyString],
                comPeriodadobePeriodcqPeriodcloudMinusconfigPeriodui: Option[ConfigNodePropertyString],
                comPeriodadobePeriodcqPeriodcomPeriodadobePeriodcqPeriodeditor: Option[ConfigNodePropertyString],
                comPeriodadobePeriodcqPeriodcomPeriodadobePeriodcqPeriodprojectsPeriodcore: Option[ConfigNodePropertyString],
                comPeriodadobePeriodcqPeriodcomPeriodadobePeriodcqPeriodprojectsPeriodwcmPeriodcore: Option[ConfigNodePropertyString],
                comPeriodadobePeriodcqPeriodcomPeriodadobePeriodcqPerioduiPeriodcommons: Option[ConfigNodePropertyString],
                comPeriodadobePeriodcqPeriodcomPeriodadobePeriodcqPeriodwcmPeriodstyle: Option[ConfigNodePropertyString],
                comPeriodadobePeriodcqPeriodcqMinusactivitymapMinusintegration: Option[ConfigNodePropertyString],
                comPeriodadobePeriodcqPeriodcqMinuscontexthubMinuscommons: Option[ConfigNodePropertyString],
                comPeriodadobePeriodcqPeriodcqMinusdtm: Option[ConfigNodePropertyString],
                comPeriodadobePeriodcqPeriodcqMinushealthcheck: Option[ConfigNodePropertyString],
                comPeriodadobePeriodcqPeriodcqMinusmultisiteMinustargeting: Option[ConfigNodePropertyString],
                comPeriodadobePeriodcqPeriodcqMinuspreMinusupgradeMinuscleanup: Option[ConfigNodePropertyString],
                comPeriodadobePeriodcqPeriodcqMinusproductMinusinfoMinusprovider: Option[ConfigNodePropertyString],
                comPeriodadobePeriodcqPeriodcqMinusrestMinussites: Option[ConfigNodePropertyString],
                comPeriodadobePeriodcqPeriodcqMinussecurityMinushc: Option[ConfigNodePropertyString],
                comPeriodadobePeriodcqPerioddamPeriodcqMinusdamMinussvgMinushandler: Option[ConfigNodePropertyString],
                comPeriodadobePeriodcqPerioddamPeriodcqMinusscene7Minusimaging: Option[ConfigNodePropertyString],
                comPeriodadobePeriodcqPerioddtmMinusreactorPeriodcore: Option[ConfigNodePropertyString],
                comPeriodadobePeriodcqPerioddtmMinusreactorPeriodui: Option[ConfigNodePropertyString],
                comPeriodadobePeriodcqPeriodexpMinusjspelMinusresolver: Option[ConfigNodePropertyString],
                comPeriodadobePeriodcqPeriodinboxPeriodcqMinusinbox: Option[ConfigNodePropertyString],
                comPeriodadobePeriodcqPeriodjsonMinusschemaMinusparser: Option[ConfigNodePropertyString],
                comPeriodadobePeriodcqPeriodmediaPeriodcqMinusmediaMinuspublishingMinusdpsMinusfpMinuscore: Option[ConfigNodePropertyString],
                comPeriodadobePeriodcqPeriodmobilePeriodcqMinusmobileMinuscaas: Option[ConfigNodePropertyString],
                comPeriodadobePeriodcqPeriodmobilePeriodcqMinusmobileMinusindexMinusbuilder: Option[ConfigNodePropertyString],
                comPeriodadobePeriodcqPeriodmobilePeriodcqMinusmobileMinusphonegapMinusbuild: Option[ConfigNodePropertyString],
                comPeriodadobePeriodcqPeriodmyspell: Option[ConfigNodePropertyString],
                comPeriodadobePeriodcqPeriodsamplePeriodwePeriodretailPeriodcore: Option[ConfigNodePropertyString],
                comPeriodadobePeriodcqPeriodscreensPeriodcomPeriodadobePeriodcqPeriodscreensPerioddcc: Option[ConfigNodePropertyString],
                comPeriodadobePeriodcqPeriodscreensPeriodcomPeriodadobePeriodcqPeriodscreensPeriodmqPeriodcore: Option[ConfigNodePropertyString],
                comPeriodadobePeriodcqPeriodsocialPeriodcqMinussocialMinusasMinusprovider: Option[ConfigNodePropertyString],
                comPeriodadobePeriodcqPeriodsocialPeriodcqMinussocialMinusbadgingMinusbasicMinusimpl: Option[ConfigNodePropertyString],
                comPeriodadobePeriodcqPeriodsocialPeriodcqMinussocialMinusbadgingMinusimpl: Option[ConfigNodePropertyString],
                comPeriodadobePeriodcqPeriodsocialPeriodcqMinussocialMinuscalendarMinusimpl: Option[ConfigNodePropertyString],
                comPeriodadobePeriodcqPeriodsocialPeriodcqMinussocialMinuscontentMinusfragmentsMinusimpl: Option[ConfigNodePropertyString],
                comPeriodadobePeriodcqPeriodsocialPeriodcqMinussocialMinusenablementMinusimpl: Option[ConfigNodePropertyString],
                comPeriodadobePeriodcqPeriodsocialPeriodcqMinussocialMinusgraphMinusimpl: Option[ConfigNodePropertyString],
                comPeriodadobePeriodcqPeriodsocialPeriodcqMinussocialMinusideationMinusimpl: Option[ConfigNodePropertyString],
                comPeriodadobePeriodcqPeriodsocialPeriodcqMinussocialMinusjcrMinusprovider: Option[ConfigNodePropertyString],
                comPeriodadobePeriodcqPeriodsocialPeriodcqMinussocialMinusmembersMinusimpl: Option[ConfigNodePropertyString],
                comPeriodadobePeriodcqPeriodsocialPeriodcqMinussocialMinusmsMinusprovider: Option[ConfigNodePropertyString],
                comPeriodadobePeriodcqPeriodsocialPeriodcqMinussocialMinusnotificationsMinuschannelsMinusweb: Option[ConfigNodePropertyString],
                comPeriodadobePeriodcqPeriodsocialPeriodcqMinussocialMinusnotificationsMinusimpl: Option[ConfigNodePropertyString],
                comPeriodadobePeriodcqPeriodsocialPeriodcqMinussocialMinusrdbMinusprovider: Option[ConfigNodePropertyString],
                comPeriodadobePeriodcqPeriodsocialPeriodcqMinussocialMinusscfMinusimpl: Option[ConfigNodePropertyString],
                comPeriodadobePeriodcqPeriodsocialPeriodcqMinussocialMinusscoringMinusbasicMinusimpl: Option[ConfigNodePropertyString],
                comPeriodadobePeriodcqPeriodsocialPeriodcqMinussocialMinusscoringMinusimpl: Option[ConfigNodePropertyString],
                comPeriodadobePeriodcqPeriodsocialPeriodcqMinussocialMinusserviceusersMinusimpl: Option[ConfigNodePropertyString],
                comPeriodadobePeriodcqPeriodsocialPeriodcqMinussocialMinussrpMinusimpl: Option[ConfigNodePropertyString],
                comPeriodadobePeriodcqPeriodsocialPeriodcqMinussocialMinusugcbaseMinusimpl: Option[ConfigNodePropertyString],
                comPeriodadobePerioddamPeriodcqMinusdamMinuscfmMinusimpl: Option[ConfigNodePropertyString],
                comPeriodadobePeriodformsPeriodfoundationMinusformsMinusfoundationMinusbase: Option[ConfigNodePropertyString],
                comPeriodadobePeriodgranitePeriodapicontroller: Option[ConfigNodePropertyString],
                comPeriodadobePeriodgranitePeriodassetPeriodcore: Option[ConfigNodePropertyString],
                comPeriodadobePeriodgranitePeriodauthPeriodsso: Option[ConfigNodePropertyString],
                comPeriodadobePeriodgranitePeriodbundlesPeriodhcPeriodimpl: Option[ConfigNodePropertyString],
                comPeriodadobePeriodgranitePeriodcompatMinusrouter: Option[ConfigNodePropertyString],
                comPeriodadobePeriodgranitePeriodconf: Option[ConfigNodePropertyString],
                comPeriodadobePeriodgranitePeriodconfPerioduiPeriodcore: Option[ConfigNodePropertyString],
                comPeriodadobePeriodgranitePeriodcors: Option[ConfigNodePropertyString],
                comPeriodadobePeriodgranitePeriodcrxMinusexplorer: Option[ConfigNodePropertyString],
                comPeriodadobePeriodgranitePeriodcrxdeMinuslite: Option[ConfigNodePropertyString],
                comPeriodadobePeriodgranitePeriodcryptoPeriodconfig: Option[ConfigNodePropertyString],
                comPeriodadobePeriodgranitePeriodcryptoPeriodextension: Option[ConfigNodePropertyString],
                comPeriodadobePeriodgranitePeriodcryptoPeriodfile: Option[ConfigNodePropertyString],
                comPeriodadobePeriodgranitePeriodcryptoPeriodjcr: Option[ConfigNodePropertyString],
                comPeriodadobePeriodgranitePeriodcsrf: Option[ConfigNodePropertyString],
                comPeriodadobePeriodgranitePerioddistributionPeriodcore: Option[ConfigNodePropertyString],
                comPeriodadobePeriodgranitePerioddropwizardPeriodmetrics: Option[ConfigNodePropertyString],
                comPeriodadobePeriodgranitePeriodfragsPeriodimpl: Option[ConfigNodePropertyString],
                comPeriodadobePeriodgranitePeriodgibson: Option[ConfigNodePropertyString],
                comPeriodadobePeriodgranitePeriodinfocollector: Option[ConfigNodePropertyString],
                comPeriodadobePeriodgranitePeriodinstallerPeriodfactoryPeriodpackages: Option[ConfigNodePropertyString],
                comPeriodadobePeriodgranitePeriodjettyPeriodssl: Option[ConfigNodePropertyString],
                comPeriodadobePeriodgranitePeriodjobsPeriodasync: Option[ConfigNodePropertyString],
                comPeriodadobePeriodgranitePeriodmaintenancePeriodoak: Option[ConfigNodePropertyString],
                comPeriodadobePeriodgranitePeriodmonitoringPeriodcore: Option[ConfigNodePropertyString],
                comPeriodadobePeriodgranitePeriodqueries: Option[ConfigNodePropertyString],
                comPeriodadobePeriodgranitePeriodreplicationPeriodhcPeriodimpl: Option[ConfigNodePropertyString],
                comPeriodadobePeriodgranitePeriodrepositoryPeriodchecker: Option[ConfigNodePropertyString],
                comPeriodadobePeriodgranitePeriodrepositoryPeriodhcPeriodimpl: Option[ConfigNodePropertyString],
                comPeriodadobePeriodgranitePeriodrestPeriodassets: Option[ConfigNodePropertyString],
                comPeriodadobePeriodgranitePeriodsecurityPeriodui: Option[ConfigNodePropertyString],
                comPeriodadobePeriodgranitePeriodstartup: Option[ConfigNodePropertyString],
                comPeriodadobePeriodgranitePeriodtagsoup: Option[ConfigNodePropertyString],
                comPeriodadobePeriodgranitePeriodtaskmanagementPeriodcore: Option[ConfigNodePropertyString],
                comPeriodadobePeriodgranitePeriodtaskmanagementPeriodworkflow: Option[ConfigNodePropertyString],
                comPeriodadobePeriodgranitePerioduiPeriodclientlibsPeriodcompilerPeriodless: Option[ConfigNodePropertyString],
                comPeriodadobePeriodgranitePerioduiPeriodclientlibsPeriodprocessorPeriodgcc: Option[ConfigNodePropertyString],
                comPeriodadobePeriodgranitePeriodwebconsolePeriodplugins: Option[ConfigNodePropertyString],
                comPeriodadobePeriodgranitePeriodworkflowPeriodconsole: Option[ConfigNodePropertyString],
                comPeriodadobePeriodxmpPeriodworkerPeriodfilesPeriodnativePeriodfragmentPeriodlinux: Option[ConfigNodePropertyString],
                comPeriodadobePeriodxmpPeriodworkerPeriodfilesPeriodnativePeriodfragmentPeriodmacosx: Option[ConfigNodePropertyString],
                comPeriodadobePeriodxmpPeriodworkerPeriodfilesPeriodnativePeriodfragmentPeriodwin: Option[ConfigNodePropertyString],
                comPerioddayPeriodcommonsPeriodosgiPeriodwrapperPeriodsimpleMinusjndi: Option[ConfigNodePropertyString],
                comPerioddayPeriodcqPeriodcqMinusauthhandler: Option[ConfigNodePropertyString],
                comPerioddayPeriodcqPeriodcqMinuscompatMinusconfigupdate: Option[ConfigNodePropertyString],
                comPerioddayPeriodcqPeriodcqMinuslicensebranding: Option[ConfigNodePropertyString],
                comPerioddayPeriodcqPeriodcqMinusnotifcationMinusimpl: Option[ConfigNodePropertyString],
                comPerioddayPeriodcqPeriodcqMinusreplicationMinusaudit: Option[ConfigNodePropertyString],
                comPerioddayPeriodcqPeriodcqMinussearchMinusext: Option[ConfigNodePropertyString],
                comPerioddayPeriodcqPerioddamPeriodcqMinusdamMinusannotationMinusprint: Option[ConfigNodePropertyString],
                comPerioddayPeriodcqPerioddamPeriodcqMinusdamMinusassetMinususage: Option[ConfigNodePropertyString],
                comPerioddayPeriodcqPerioddamPeriodcqMinusdamMinuss7dam: Option[ConfigNodePropertyString],
                comPerioddayPeriodcqPerioddamPeriodcqMinusdamMinussimilaritysearch: Option[ConfigNodePropertyString],
                comPerioddayPeriodcqPerioddamPerioddamMinuswebdavMinussupport: Option[ConfigNodePropertyString],
                comPerioddayPeriodcqPeriodpreMinusupgradeMinustasks: Option[ConfigNodePropertyString],
                comPerioddayPeriodcqPeriodreplicationPeriodextensions: Option[ConfigNodePropertyString],
                comPerioddayPeriodcqPeriodwcmPeriodcqMinusmsmMinuscore: Option[ConfigNodePropertyString],
                comPerioddayPeriodcqPeriodwcmPeriodcqMinuswcmMinustranslation: Option[ConfigNodePropertyString],
                dayMinuscommonsMinusjrawio: Option[ConfigNodePropertyString],
                orgPeriodapachePeriodariesPeriodjmxPeriodwhiteboard: Option[ConfigNodePropertyString],
                orgPeriodapachePeriodfelixPeriodhttpPeriodsslfilter: Option[ConfigNodePropertyString],
                orgPeriodapachePeriodfelixPeriodorgPeriodapachePeriodfelixPeriodthreaddump: Option[ConfigNodePropertyString],
                orgPeriodapachePeriodfelixPeriodwebconsolePeriodpluginsPeriodds: Option[ConfigNodePropertyString],
                orgPeriodapachePeriodfelixPeriodwebconsolePeriodpluginsPeriodevent: Option[ConfigNodePropertyString],
                orgPeriodapachePeriodfelixPeriodwebconsolePeriodpluginsPeriodmemoryusage: Option[ConfigNodePropertyString],
                orgPeriodapachePeriodfelixPeriodwebconsolePeriodpluginsPeriodpackageadmin: Option[ConfigNodePropertyString],
                orgPeriodapachePeriodjackrabbitPeriodoakMinusauthMinusldap: Option[ConfigNodePropertyString],
                orgPeriodapachePeriodjackrabbitPeriodoakMinussegmentMinustar: Option[ConfigNodePropertyString],
                orgPeriodapachePeriodjackrabbitPeriodoakMinussolrMinusosgi: Option[ConfigNodePropertyString],
                orgPeriodapachePeriodslingPeriodbundleresourcePeriodimpl: Option[ConfigNodePropertyString],
                orgPeriodapachePeriodslingPeriodcommonsPeriodfsclassloader: Option[ConfigNodePropertyString],
                orgPeriodapachePeriodslingPeriodcommonsPeriodlogPeriodwebconsole: Option[ConfigNodePropertyString],
                orgPeriodapachePeriodslingPerioddatasource: Option[ConfigNodePropertyString],
                orgPeriodapachePeriodslingPerioddiscoveryPeriodbase: Option[ConfigNodePropertyString],
                orgPeriodapachePeriodslingPerioddiscoveryPeriodoak: Option[ConfigNodePropertyString],
                orgPeriodapachePeriodslingPerioddiscoveryPeriodsupport: Option[ConfigNodePropertyString],
                orgPeriodapachePeriodslingPerioddistributionPeriodapi: Option[ConfigNodePropertyString],
                orgPeriodapachePeriodslingPerioddistributionPeriodcore: Option[ConfigNodePropertyString],
                orgPeriodapachePeriodslingPeriodextensionsPeriodwebconsolesecurityprovider: Option[ConfigNodePropertyString],
                orgPeriodapachePeriodslingPeriodhcPeriodwebconsole: Option[ConfigNodePropertyString],
                orgPeriodapachePeriodslingPeriodinstallerPeriodconsole: Option[ConfigNodePropertyString],
                orgPeriodapachePeriodslingPeriodinstallerPeriodproviderPeriodfile: Option[ConfigNodePropertyString],
                orgPeriodapachePeriodslingPeriodinstallerPeriodproviderPeriodjcr: Option[ConfigNodePropertyString],
                orgPeriodapachePeriodslingPeriodjcrPerioddavex: Option[ConfigNodePropertyString],
                orgPeriodapachePeriodslingPeriodjcrPeriodresourcesecurity: Option[ConfigNodePropertyString],
                orgPeriodapachePeriodslingPeriodjmxPeriodprovider: Option[ConfigNodePropertyString],
                orgPeriodapachePeriodslingPeriodlaunchpadPeriodinstaller: Option[ConfigNodePropertyString],
                orgPeriodapachePeriodslingPeriodmodelsPeriodimpl: Option[ConfigNodePropertyString],
                orgPeriodapachePeriodslingPeriodrepoinitPeriodparser: Option[ConfigNodePropertyString],
                orgPeriodapachePeriodslingPeriodresourcePeriodinventory: Option[ConfigNodePropertyString],
                orgPeriodapachePeriodslingPeriodresourceresolver: Option[ConfigNodePropertyString],
                orgPeriodapachePeriodslingPeriodscriptingPeriodjavascript: Option[ConfigNodePropertyString],
                orgPeriodapachePeriodslingPeriodscriptingPeriodjst: Option[ConfigNodePropertyString],
                orgPeriodapachePeriodslingPeriodscriptingPeriodsightlyPeriodjsPeriodprovider: Option[ConfigNodePropertyString],
                orgPeriodapachePeriodslingPeriodscriptingPeriodsightlyPeriodmodelsPeriodprovider: Option[ConfigNodePropertyString],
                orgPeriodapachePeriodslingPeriodsecurity: Option[ConfigNodePropertyString],
                orgPeriodapachePeriodslingPeriodservletsPeriodcompat: Option[ConfigNodePropertyString],
                orgPeriodapachePeriodslingPeriodservletsPeriodget: Option[ConfigNodePropertyString],
                orgPeriodapachePeriodslingPeriodstartupfilterPerioddisabler: Option[ConfigNodePropertyString],
                orgPeriodapachePeriodslingPeriodtracer: Option[ConfigNodePropertyString],
                wePeriodretailPeriodclientPeriodappPeriodcore: Option[ConfigNodePropertyString]
                )

object ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties {
    /**
     * Creates the codec for converting ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties] = deriveEncoder
}
