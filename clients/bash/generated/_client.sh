#compdef 

# !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
# !
# ! Note:
# !
# ! THIS SCRIPT HAS BEEN AUTOMATICALLY GENERATED USING
# ! openapi-generator (https://openapi-generator.tech)
# ! FROM OPENAPI SPECIFICATION IN JSON.
# !
# ! Based on: https://github.com/Valodim/zsh-curl-completion/blob/master/_curl
# !
# !
# !
# ! Installation:
# !
# ! Copy the _ file to any directory under FPATH
# ! environment variable (echo $FPATH)
# !
# !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!


local curcontext="$curcontext" state line ret=1
typeset -A opt_args

typeset -A mime_type_abbreviations
# text/*
mime_type_abbreviations[text]="text/plain"
mime_type_abbreviations[html]="text/html"
mime_type_abbreviations[md]="text/x-markdown"
mime_type_abbreviations[csv]="text/csv"
mime_type_abbreviations[css]="text/css"
mime_type_abbreviations[rtf]="text/rtf"
# application/*
mime_type_abbreviations[json]="application/json"
mime_type_abbreviations[xml]="application/xml"
mime_type_abbreviations[yaml]="application/yaml"
mime_type_abbreviations[js]="application/javascript"
mime_type_abbreviations[bin]="application/octet-stream"
mime_type_abbreviations[rdf]="application/rdf+xml"
# image/*
mime_type_abbreviations[jpg]="image/jpeg"
mime_type_abbreviations[png]="image/png"
mime_type_abbreviations[gif]="image/gif"
mime_type_abbreviations[bmp]="image/bmp"
mime_type_abbreviations[tiff]="image/tiff"

#
# Generate zsh completion string list for abbreviated mime types
#
get_mime_type_completions() {
    typeset -a result
    result=()
    for k in "${(@k)mime_type_abbreviations}"; do
        value=$mime_type_abbreviations[${k}]
        #echo $value
        result+=( "${k}[${value}]" )
        #echo $result
    done
    echo "$result"
}

#
# cURL crypto engines completion function
#
_curl_crypto_engine() {
    local vals
    vals=( ${${(f)"$(curl --engine list)":gs/ /}[2,$]} )
    _describe -t outputs 'engines' vals && return 0
}

#
# cURL post data completion functions=
#
_curl_post_data() {

    # don't do anything further if this is raw content
    compset -P '=' && _message 'raw content' && return 0

    # complete filename or stdin for @ syntax
    compset -P '*@' && {
        local expl
        _description files expl stdin
        compadd "$expl[@]" - "-"
        _files
        return 0
    }

    # got a name already? expecting data.
    compset -P '*=' && _message 'data value' && return 0

    # otherwise, name (or @ or =) should be specified
    _message 'data name' && return 0

}


local arg_http arg_ftp arg_other arg_proxy arg_crypto arg_connection arg_auth arg_input arg_output

# HTTP Arguments
arg_http=(''\
  {-0,--http1.0}'[force use of use http 1.0 instead of 1.1]' \
  {-b,--cookie}'[pass data to http server as cookie]:data or file' \
  {-c,--cookie-jar}'[specify cookie file]:file name:_files' \
  {-d,--data}'[send specified data as HTTP POST data]:data:{_curl_post_data}' \
  '--data-binary[post HTTP POST data without any processing]:data:{_curl_post_data}' \
  '--data-urlencode[post HTTP POST data, with url encoding]:data:{_curl_post_data}' \
  {-f,--fail}'[enable failfast behavior for server errors]' \
  '*'{-F,--form}'[add POST form data]:name=content' \
  {-G,--get}'[use HTTP GET even with data (-d, --data, --data-binary)]' \
  '*'{-H,--header}'[specify an extra header]:header' \
  '--ignore-content-length[ignore Content-Length header]' \
  {-i,--include}'[include HTTP header in the output]' \
  {-j,--junk-session-cookies}'[discard all session cookies]' \
  {-e,--referer}'[send url as referer]:referer url:_urls' \
  {-L,--location}'[follow Location headers on http 3XX response]' \
  '--location-trusted[like --location, but allows sending of auth data to redirected hosts]' \
  '--max-redirs[set maximum number of redirection followings allowed]:number' \
  {-J,--remote-header-name}'[use Content-Disposition for output file name]' \
  {-O,--remote-name}'[write to filename parsed from url instead of stdout]' \
  '--post301[do not convert POST to GET after following 301 Location response (follow RFC 2616/10.3.2)]' \
  '--post302[do not convert POST to GET after following 302 Location response (follow RFC 2616/10.3.2)]' \
  )

# FTP arguments
arg_ftp=(\
  {-a,--append}'[append to target file instead of overwriting (FTP/SFTP)]' \
  '--crlf[convert LF to CRLF in upload]' \
  '--disable-eprt[disable use of EPRT and LPRT for active FTP transfers]' \
  '--disable-epsv[disable use of EPSV for passive FTP transfers]' \
  '--ftp-account[account data (FTP)]:data' \
  '--ftp-alternative-to-user[command to send when USER and PASS commands fail (FTP)]:command' \
  '--ftp-create-dirs[create paths remotely if it does not exist]' \
  '--ftp-method[ftp method to use to reach a file (FTP)]:method:(multicwd ocwd singlecwd)' \
  '--ftp-pasv[use passive mode for the data connection (FTP)]' \
  '--ftp-skip-pasv-ip[do not use the ip the server suggests for PASV]' \
  '--form-string[like --form, but do not parse content]:name=string' \
  '--ftp-pret[send PRET before PASV]' \
  '--ftp-ssl-ccc[use clear command channel (CCC) after authentication (FTP)]' \
  '--ftp-ssl-ccc-mode[sets the CCC mode (FTP)]:mode:(active passive)' \
  '--ftp-ssl-control[require SSL/TLS for FTP login, clear for transfer]' \
  {-l,--list-only}'[list names only when listing directories (FTP)]' \
  {-P,--ftp-port}'[use active mode, tell server to connect to specified address or interface (FTP]:address' \
  '*'{-Q,--quote}'[send arbitrary command to the remote server before transfer (FTP/SFTP)]:command' \
  )

# Other Protocol arguments
arg_other=(\
  '--mail-from[specify From: address]:address' \
  '--mail-rcpt[specify email recipient for SMTP, may be given multiple times]:address' \
  {-t,--telnet-option}'[pass options to telnet protocol]:opt=val' \
  '--tftp-blksize[set tftp BLKSIZE option]:value' \
  )

# Proxy arguments
arg_proxy=(\
  '--noproxy[list of hosts to connect directly to instead of through proxy]:no-proxy-list' \
  {-p,--proxytunnel}'[tunnel non-http protocols through http proxy]' \
  {-U,--proxy-user}'[specify the user name and password to use for proxy authentication]:user:password' \
  '--proxy-anyauth[use any authentication method for proxy, default to most secure]' \
  '--proxy-basic[use HTTP Basic authentication for proxy]' \
  '--proxy-digest[use http digest authentication for proxy]' \
  '--proxy-negotiate[enable GSS-Negotiate authentication for proxy]' \
  '--proxy-ntlm[enable ntlm authentication for proxy]' \
  '--proxy1.0[use http 1.0 proxy]:proxy url' \
  {-x,--proxy}'[use specified proxy]:proxy url' \
  '--socks5-gssapi-service[change service name for socks server]:servicename' \
  '--socks5-gssapi-nec[allow unprotected exchange of protection mode negotiation]' \
  )

# Crypto arguments
arg_crypto=(\
  {-1,--tlsv1}'[Forces curl to use TLS version 1 when negotiating with a remote TLS server.]' \
  {-2,--sslv2}'[Forces curl to use SSL version 2 when negotiating with a remote SSL server.]' \
  {-3,--sslv3}'[Forces curl to use SSL version 3 when negotiating with a remote SSL server.]' \
  '--ciphers[specifies which cipher to use for the ssl connection]:list of ciphers' \
  '--crlfile[specify file with revoked certificates]:file' \
  '--delegation[set delegation policy to use with GSS/kerberos]:delegation policy:(none policy always)' \
  {-E,--cert}'[use specified client certificate]:certificate file:_files' \
  '--engine[use selected OpenSSL crypto engine]:ssl crypto engine:{_curl_crypto_engine}' \
  '--egd-file[set ssl entropy gathering daemon socket]:entropy socket:_files' \
  '--cert-type[specify certificate type (PEM, DER, ENG)]:certificate type:(PEM DER ENG)' \
  '--cacert[specify certificate file to verify the peer with]:CA certificate:_files' \
  '--capath[specify a search path for certificate files]:CA certificate directory:_directories' \
  '--hostpubmd5[check remote hosts public key]:md5 hash' \
  {-k,--insecure}'[allow ssl to perform insecure ssl connections (ie, ignore certificate)]' \
  '--key[ssl/ssh private key file name]:key file:_files' \
  '--key-type[ssl/ssh private key file type]:file type:(PEM DER ENG)' \
  '--pubkey[ssh public key file]:pubkey file:_files' \
  '--random-file[set source of random data for ssl]:random source:_files' \
  '--no-sessionid[disable caching of ssl session ids]' \
  '--pass:phrase[passphrase for ssl/ssh private key]' \
  '--ssl[try to use ssl/tls for connection, if available]' \
  '--ssl-reqd[try to use ssl/tls for connection, fail if unavailable]' \
  '--tlsauthtype[set TLS authentication type (only SRP supported!)]:authtype' \
  '--tlsuser[set username for TLS authentication]:user' \
  '--tlspassword[set password for TLS authentication]:password' \
  )

# Connection arguments
arg_connection=(\
  {-4,--ipv4}'[prefer ipv4]' \
  {-6,--ipv6}'[prefer ipv6, if available]' \
  {-B,--use-ascii}'[use ascii mode]' \
  '--compressed[request a compressed transfer]' \
  '--connect-timeout[timeout for connection phase]:seconds' \
  {-I,--head}'[fetch http HEAD only (HTTP/FTP/FILE]' \
  '--interface[work on a specific interface]:name' \
  '--keepalive-time[set time to wait before sending keepalive probes]:seconds' \
  '--limit-rate[specify maximum transfer rate]:speed' \
  '--local-port[set preferred number or range of local ports to use]:num' \
  {-N,--no-buffer}'[disable buffering of the output stream]' \
  '--no-keepalive[disable use of keepalive messages in TCP connections]' \
  '--raw[disable all http decoding and pass raw data]' \
  '--resolve[provide a custom address for a specific host and port pair]:host\:port\:address' \
  '--retry[specify maximum number of retries for transient errors]:num' \
  '--retry-delay[specify delay between retries]:seconds' \
  '--retry-max-time[maximum time to spend on retries]:seconds' \
  '--tcp-nodelay[turn on TCP_NODELAY option]' \
  {-y,--speed-time}'[specify time to abort after if download is slower than speed-limit]:time' \
  {-Y,--speed-limit}'[specify minimum speed for --speed-time]:speed' \
  )

# Authentication arguments
arg_auth=(\
  '--anyauth[use any authentication method, default to most secure]' \
  '--basic[use HTTP Basic authentication]' \
  '--ntlm[enable ntlm authentication]' \
  '--digest[use http digest authentication]' \
  '--krb[use kerberos authentication]:auth:(clear safe confidential private)' \
  '--negotiate[enable GSS-Negotiate authentication]' \
  {-n,--netrc}'[scan ~/.netrc for login data]' \
  '--netrc-optional[like --netrc, but does not make .netrc usage mandatory]' \
  '--netrc-file[like --netrc, but specify file to use]:netrc file:_files' \
  '--tr-encoding[request compressed transfer-encoding]' \
  {-u,--user}'[specify user name and password for server authentication]:user\:password' \
  )

# Input arguments
arg_input=(\
  {-C,--continue-at}'[resume at offset ]:offset' \
  {-g,--globoff}'[do not glob {}\[\] letters]' \
  '--max-filesize[maximum filesize to download, fail for bigger files]:bytes' \
  '--proto[specify allowed protocols for transfer]:protocols' \
  '--proto-redir[specify allowed protocols for transfer after a redirect]:protocols' \
  {-r,--range}'[set range of bytes to request (HTTP/FTP/SFTP/FILE)]:range' \
  {-R,--remote-time}'[use timestamp of remote file for local file]' \
  {-T,--upload-file}'[transfer file to remote url (using PUT for HTTP)]:file to upload:_files' \
  '--url[specify a URL to fetch (multi)]:url:_urls' \
  {-z,--time-cond}'[request downloaded file to be newer than date or given reference file]:date expression' \
  )

# Output arguments
arg_output=(\
  '--create-dirs[create local directory hierarchy as needed]' \
  {-D,--dump-header}'[write protocol headers to file]:dump file:_files' \
  {-o,--output}'[write to specified file instead of stdout]:output file:_files' \
  {--progress-bar,-\#}'[display progress as a simple progress bar]' \
  {-\#,--progress-bar}'[Make curl display progress as a simple progress bar instead of the standard, more informational, meter.]' \
  {-R,--remote-time}'[use timestamp of remote file for local file]' \
  '--raw[disable all http decoding and pass raw data]' \
  {-s,--silent}'[silent mode, do not show progress meter or error messages]' \
  {-S,--show-error}'[show errors in silent mode]' \
  '--stderr[redirect stderr to specified file]:output file:_files' \
  '--trace[enable full trace dump of all incoming and outgoing data]:trace file:_files' \
  '--trace-ascii[enable full trace dump of all incoming and outgoing data, without hex data]:trace file:_files' \
  '--trace-time[prepends a time stamp to each trace or verbose line that curl displays]' \
  {-v,--verbose}'[output debug info]' \
  {-w,--write-out}'[specify message to output on successful operation]:format string' \
  '--xattr[store some file metadata in extended file attributes]' \
  {-X,--request}'[specifies request method for HTTP server]:method:(GET POST PUT DELETE HEAD OPTIONS TRACE CONNECT PATCH LINK UNLINK)' \
  )

_arguments -C -s $arg_http $arg_ftp $arg_other $arg_crypto $arg_connection $arg_auth $arg_input $arg_output \
  {-M,--manual}'[Print manual]' \
  '*'{-K,--config}'[Use other config file to read arguments from]:config file:_files' \
  '--libcurl[output libcurl code for the operation to file]:output file:_files' \
  {-m,--max-time}'[Limit total time of operation]:seconds' \
  {-s,--silent}'[Silent mode, do not show progress meter or error messages]' \
  {-S,--show-error}'[Show errors in silent mode]' \
  '--stderr[Redirect stderr to specified file]:output file:_files' \
  '-q[Do not read settings from .curlrc (must be first option)]' \
  {-h,--help}'[Print help and list of operations]' \
  {-V,--version}'[Print service API version]' \
  '--about[Print the information about service]' \
  '--host[Specify the host URL]':URL:_urls \
  '--dry-run[Print out the cURL command without executing it]' \
  {-ac,--accept}'[Set the Accept header in the request]: :{_values "Accept mime type" $(get_mime_type_completions)}' \
  {-ct,--content-type}'[Set the Content-type header in request]: :{_values "Content mime type" $(get_mime_type_completions)}' \
  '1: :->ops' \
  '*:: :->args' \
  && ret=0


case $state in
  ops)
    # Operations
    _values "Operations" \
            "adaptiveFormAndInteractiveCommunicationWebChannelConfiguration[]" \
            "adaptiveFormAndInteractiveCommunicationWebChannelThemeConfigur[]" \
            "analyticsComponentQueryCacheService[]" \
            "apacheSlingHealthCheckResultHTMLSerializer[]" \
            "comAdobeAemFormsndocumentsConfigAEMFormsManagerConfiguration[]" \
            "comAdobeAemTransactionCoreImplTransactionRecorder[]" \
            "comAdobeAemUpgradePrechecksHcImplDeprecateIndexesHC[]" \
            "comAdobeAemUpgradePrechecksHcImplReplicationAgentsDisabledHC[]" \
            "comAdobeAemUpgradePrechecksMbeanImplPreUpgradeTasksMBeanImpl[]" \
            "comAdobeAemUpgradePrechecksTasksImplConsistencyCheckTaskImpl[]" \
            "comAdobeCqAccountApiAccountManagementService[]" \
            "comAdobeCqAccountImplAccountManagementServlet[]" \
            "comAdobeCqAddressImplLocationLocationListServlet[]" \
            "comAdobeCqAuditPurgeDam[]" \
            "comAdobeCqAuditPurgePages[]" \
            "comAdobeCqAuditPurgeReplication[]" \
            "comAdobeCqCdnRewriterImplAWSCloudFrontRewriter[]" \
            "comAdobeCqCdnRewriterImplCDNConfigServiceImpl[]" \
            "comAdobeCqCdnRewriterImplCDNRewriter[]" \
            "comAdobeCqCloudconfigCoreImplConfigurationReplicationEventHandle[]" \
            "comAdobeCqCommerceImplAssetDynamicImageHandler[]" \
            "comAdobeCqCommerceImplAssetProductAssetHandlerProviderImpl[]" \
            "comAdobeCqCommerceImplAssetStaticImageHandler[]" \
            "comAdobeCqCommerceImplAssetVideoHandler[]" \
            "comAdobeCqCommerceImplPromotionPromotionManagerImpl[]" \
            "comAdobeCqCommercePimImplCataloggeneratorCatalogGeneratorImpl[]" \
            "comAdobeCqCommercePimImplPageEventListener[]" \
            "comAdobeCqCommercePimImplProductfeedProductFeedServiceImpl[]" \
            "comAdobeCqContentinsightImplReportingServicesSettingsProvider[]" \
            "comAdobeCqContentinsightImplServletsBrightEdgeProxyServlet[]" \
            "comAdobeCqContentinsightImplServletsReportingServicesProxyServle[]" \
            "comAdobeCqDamCfmImplComponentComponentConfigImpl[]" \
            "comAdobeCqDamCfmImplConfFeatureConfigImpl[]" \
            "comAdobeCqDamCfmImplContentRewriterAssetProcessor[]" \
            "comAdobeCqDamCfmImplContentRewriterParRangeFilter[]" \
            "comAdobeCqDamCfmImplContentRewriterPayloadFilter[]" \
            "comAdobeCqDamDmProcessImagePTiffManagerImpl[]" \
            "comAdobeCqDamIpsImplReplicationTriggerReplicateOnModifyWorker[]" \
            "comAdobeCqDamMacSyncHelperImplMACSyncClientImpl[]" \
            "comAdobeCqDamMacSyncImplDAMSyncServiceImpl[]" \
            "comAdobeCqDamProcessorNuiImplNuiAssetProcessor[]" \
            "comAdobeCqDamS7imagingImplIsImageServerComponent[]" \
            "comAdobeCqDamS7imagingImplPsPlatformServerServlet[]" \
            "comAdobeCqDamWebdavImplIoAssetIOHandler[]" \
            "comAdobeCqDamWebdavImplIoDamWebdavVersionLinkingJob[]" \
            "comAdobeCqDamWebdavImplIoSpecialFilesHandler[]" \
            "comAdobeCqDeserfwImplDeserializationFirewallImpl[]" \
            "comAdobeCqDtmImplServiceDTMWebServiceImpl[]" \
            "comAdobeCqDtmImplServletsDTMDeployHookServlet[]" \
            "comAdobeCqDtmReactorImplServiceWebServiceImpl[]" \
            "comAdobeCqExperiencelogImplExperienceLogConfigServlet[]" \
            "comAdobeCqHcContentPackagesHealthCheck[]" \
            "comAdobeCqHistoryImplHistoryRequestFilter[]" \
            "comAdobeCqHistoryImplHistoryServiceImpl[]" \
            "comAdobeCqInboxImplTypeproviderItemTypeProvider[]" \
            "comAdobeCqProjectsImplServletProjectImageServlet[]" \
            "comAdobeCqProjectsPurgeScheduler[]" \
            "comAdobeCqScheduledExporterImplScheduledExporterImpl[]" \
            "comAdobeCqScreensAnalyticsImplScreensAnalyticsServiceImpl[]" \
            "comAdobeCqScreensDeviceImplDeviceService[]" \
            "comAdobeCqScreensDeviceRegistrationImplRegistrationServiceImpl[]" \
            "comAdobeCqScreensImplHandlerChannelsUpdateHandler[]" \
            "comAdobeCqScreensImplJobsDistributedDevicesStatiUpdateJob[]" \
            "comAdobeCqScreensImplRemoteImplDistributedHttpClientImpl[]" \
            "comAdobeCqScreensImplScreensChannelPostProcessor[]" \
            "comAdobeCqScreensMonitoringImplScreensMonitoringServiceImpl[]" \
            "comAdobeCqScreensMqActivemqImplArtemisJMSProvider[]" \
            "comAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImpl[]" \
            "comAdobeCqScreensOfflinecontentImplOfflineContentServiceImpl[]" \
            "comAdobeCqScreensSegmentationImplSegmentationFeatureFlag[]" \
            "comAdobeCqSecurityHcBundlesImplHtmlLibraryManagerConfigHealthCh[]" \
            "comAdobeCqSecurityHcBundlesImplWcmFilterHealthCheck[]" \
            "comAdobeCqSecurityHcDispatcherImplDispatcherAccessHealthCheck[]" \
            "comAdobeCqSecurityHcPackagesImplExampleContentHealthCheck[]" \
            "comAdobeCqSecurityHcWebserverImplClickjackingHealthCheck[]" \
            "comAdobeCqSocialAccountverificationImplAccountManagementConfigIm[]" \
            "comAdobeCqSocialActivitystreamsClientImplSocialActivityComponen[]" \
            "comAdobeCqSocialActivitystreamsClientImplSocialActivityStreamCo[]" \
            "comAdobeCqSocialActivitystreamsListenerImplEventListenerHandler[]" \
            "comAdobeCqSocialActivitystreamsListenerImplModerationEventExten[]" \
            "comAdobeCqSocialActivitystreamsListenerImplRatingEventActivityS[]" \
            "comAdobeCqSocialActivitystreamsListenerImplResourceActivityStre[]" \
            "comAdobeCqSocialCalendarClientEndpointsImplCalendarOperationsI[]" \
            "comAdobeCqSocialCalendarClientOperationextensionsEventAttachmen[]" \
            "comAdobeCqSocialCalendarServletsTimeZoneServlet[]" \
            "comAdobeCqSocialCommonsCommentsEndpointsImplCommentDeleteEvent[]" \
            "comAdobeCqSocialCommonsCommentsEndpointsImplCommentOperationSe[]" \
            "comAdobeCqSocialCommonsCommentsEndpointsImplTranslationOperati[]" \
            "comAdobeCqSocialCommonsCommentsListingImplSearchCommentSocialC[]" \
            "comAdobeCqSocialCommonsCommentsSchedulerImplSearchScheduledPos[]" \
            "comAdobeCqSocialCommonsCorsCORSAuthenticationFilter[]" \
            "comAdobeCqSocialCommonsEmailreplyImplAndroidEmailClientProvider[]" \
            "comAdobeCqSocialCommonsEmailreplyImplCommentEmailBuilderImpl[]" \
            "comAdobeCqSocialCommonsEmailreplyImplCommentEmailEventListener[]" \
            "comAdobeCqSocialCommonsEmailreplyImplCustomEmailClientProvider[]" \
            "comAdobeCqSocialCommonsEmailreplyImplEmailQuotedTextPatternsImp[]" \
            "comAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImp[]" \
            "comAdobeCqSocialCommonsEmailreplyImplEmailReplyImporter[]" \
            "comAdobeCqSocialCommonsEmailreplyImplGmailEmailClientProvider[]" \
            "comAdobeCqSocialCommonsEmailreplyImplIOSEmailClientProvider[]" \
            "comAdobeCqSocialCommonsEmailreplyImplMacmailEmailClientProvider[]" \
            "comAdobeCqSocialCommonsEmailreplyImplOutLookEmailClientProvider[]" \
            "comAdobeCqSocialCommonsEmailreplyImplUnknownEmailClientProvider[]" \
            "comAdobeCqSocialCommonsEmailreplyImplYahooEmailClientProvider[]" \
            "comAdobeCqSocialCommonsMaintainanceImplDeleteTempUGCImageUpload[]" \
            "comAdobeCqSocialCommonsUgclimiterImplUGCLimiterServiceImpl[]" \
            "comAdobeCqSocialCommonsUgclimitsconfigImplCommunityUserUGCLimit[]" \
            "comAdobeCqSocialConnectOauthImplFacebookProviderImpl[]" \
            "comAdobeCqSocialConnectOauthImplSocialOAuthAuthenticationHandle[]" \
            "comAdobeCqSocialConnectOauthImplSocialOAuthUserProfileMapper[]" \
            "comAdobeCqSocialConnectOauthImplTwitterProviderImpl[]" \
            "comAdobeCqSocialContentFragmentsServicesImplCommunitiesFragmen[]" \
            "comAdobeCqSocialDatastoreAsImplASResourceProviderFactory[]" \
            "comAdobeCqSocialDatastoreOpImplSocialMSResourceProviderFactory[]" \
            "comAdobeCqSocialDatastoreRdbImplSocialRDBResourceProviderFactor[]" \
            "comAdobeCqSocialEnablementAdaptorsEnablementLearningPathAdaptorF[]" \
            "comAdobeCqSocialEnablementAdaptorsEnablementResourceAdaptorFacto[]" \
            "comAdobeCqSocialEnablementLearningpathEndpointsImplEnablementL[]" \
            "comAdobeCqSocialEnablementResourceEndpointsImplEnablementResou[]" \
            "comAdobeCqSocialEnablementServicesImplAuthorMarkerImpl[]" \
            "comAdobeCqSocialFilelibraryClientEndpointsFilelibraryDownloadGe[]" \
            "comAdobeCqSocialFilelibraryClientEndpointsImplFileLibraryOpera[]" \
            "comAdobeCqSocialForumClientEndpointsImplForumOperationsService[]" \
            "comAdobeCqSocialForumDispatcherImplFlushOperations[]" \
            "comAdobeCqSocialGroupClientImplCommunityGroupCollectionComponen[]" \
            "comAdobeCqSocialGroupImplGroupServiceImpl[]" \
            "comAdobeCqSocialHandlebarsGuavaTemplateCacheImpl[]" \
            "comAdobeCqSocialIdeationClientEndpointsImplIdeationOperationsS[]" \
            "comAdobeCqSocialJournalClientEndpointsImplJournalOperationsSer[]" \
            "comAdobeCqSocialMembersEndpointsImplCommunityMemberGroupProfile[]" \
            "comAdobeCqSocialMembersEndpointsImplCommunityMemberUserProfileO[]" \
            "comAdobeCqSocialMembersImplCommunityMemberGroupProfileComponentF[]" \
            "comAdobeCqSocialMessagingClientEndpointsImplMessagingOperation[]" \
            "comAdobeCqSocialModerationDashboardApiFilterGroupSocialComponen[]" \
            "comAdobeCqSocialModerationDashboardApiModerationDashboardSocial[]" \
            "comAdobeCqSocialModerationDashboardApiUserDetailsSocialComponen[]" \
            "comAdobeCqSocialModerationDashboardInternalImplFilterGroupSoci[]" \
            "comAdobeCqSocialNotificationsImplMentionsRouter[]" \
            "comAdobeCqSocialNotificationsImplNotificationManagerImpl[]" \
            "comAdobeCqSocialNotificationsImplNotificationsRouter[]" \
            "comAdobeCqSocialQnaClientEndpointsImplQnaForumOperationsServic[]" \
            "comAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportI[]" \
            "comAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportM[]" \
            "comAdobeCqSocialReportingAnalyticsServicesImplSiteTrendReportS[]" \
            "comAdobeCqSocialReviewClientEndpointsImplReviewOperationsServi[]" \
            "comAdobeCqSocialScfCoreOperationsImplSocialOperationsServlet[]" \
            "comAdobeCqSocialScfEndpointsImplDefaultSocialGetServlet[]" \
            "comAdobeCqSocialScoringImplScoringEventListener[]" \
            "comAdobeCqSocialServiceusersInternalImplServiceUserWrapperImpl[]" \
            "comAdobeCqSocialSiteEndpointsImplSiteOperationService[]" \
            "comAdobeCqSocialSiteImplAnalyticsComponentConfigurationServiceIm[]" \
            "comAdobeCqSocialSiteImplSiteConfiguratorImpl[]" \
            "comAdobeCqSocialSrpImplSocialSolrConnector[]" \
            "comAdobeCqSocialSyncImplDiffChangesObserver[]" \
            "comAdobeCqSocialSyncImplGroupSyncListenerImpl[]" \
            "comAdobeCqSocialSyncImplPublisherSyncServiceImpl[]" \
            "comAdobeCqSocialSyncImplUserSyncListenerImpl[]" \
            "comAdobeCqSocialTranslationImplTranslationServiceConfigManager[]" \
            "comAdobeCqSocialTranslationImplUGCLanguageDetector[]" \
            "comAdobeCqSocialUgcbaseDispatcherImplFlushServiceImpl[]" \
            "comAdobeCqSocialUgcbaseImplAysncReverseReplicatorImpl[]" \
            "comAdobeCqSocialUgcbaseImplPublisherConfigurationImpl[]" \
            "comAdobeCqSocialUgcbaseImplSocialUtilsImpl[]" \
            "comAdobeCqSocialUgcbaseModerationImplAutoModerationImpl[]" \
            "comAdobeCqSocialUgcbaseModerationImplSentimentProcess[]" \
            "comAdobeCqSocialUgcbaseSecurityImplDefaultAttachmentTypeBlackli[]" \
            "comAdobeCqSocialUgcbaseSecurityImplSaferSlingPostValidatorImpl[]" \
            "comAdobeCqSocialUserEndpointsImplUsersGroupFromPublishServlet[]" \
            "comAdobeCqSocialUserImplTransportHttpToPublisher[]" \
            "comAdobeCqUiWcmCommonsInternalServletsRteRTEFilterServletFact[]" \
            "comAdobeCqUpgradesCleanupImplUpgradeContentCleanup[]" \
            "comAdobeCqUpgradesCleanupImplUpgradeInstallFolderCleanup[]" \
            "comAdobeCqWcmJobsAsyncImplAsyncDeleteConfigProviderService[]" \
            "comAdobeCqWcmJobsAsyncImplAsyncJobCleanUpTask[]" \
            "comAdobeCqWcmJobsAsyncImplAsyncMoveConfigProviderService[]" \
            "comAdobeCqWcmJobsAsyncImplAsyncPageMoveConfigProviderService[]" \
            "comAdobeCqWcmLaunchesImplLaunchesEventHandler[]" \
            "comAdobeCqWcmMobileQrcodeServletQRCodeImageGenerator[]" \
            "comAdobeCqWcmStyleInternalComponentStyleInfoCacheImpl[]" \
            "comAdobeCqWcmTranslationImplTranslationPlatformConfigurationImpl[]" \
            "comAdobeFdFpConfigFormsPortalDraftsandSubmissionConfigService[]" \
            "comAdobeFdFpConfigFormsPortalSchedulerService[]" \
            "comAdobeFormsCommonServiceImplDefaultDataProvider[]" \
            "comAdobeFormsCommonServiceImplFormsCommonConfigurationServiceImp[]" \
            "comAdobeFormsCommonServletTempCleanUpTask[]" \
            "comAdobeGraniteAcpPlatformPlatformServlet[]" \
            "comAdobeGraniteActivitystreamsImplActivityManagerImpl[]" \
            "comAdobeGraniteAnalyzerBaseSystemStatusServlet[]" \
            "comAdobeGraniteAnalyzerScriptsCompileAllScriptsCompilerServlet[]" \
            "comAdobeGraniteApicontrollerFilterResolverHookFactory[]" \
            "comAdobeGraniteAuthCertImplClientCertAuthHandler[]" \
            "comAdobeGraniteAuthIms[]" \
            "comAdobeGraniteAuthImsImplExternalUserIdMappingProviderExtension[]" \
            "comAdobeGraniteAuthImsImplIMSAccessTokenRequestCustomizerImpl[]" \
            "comAdobeGraniteAuthImsImplIMSInstanceCredentialsValidator[]" \
            "comAdobeGraniteAuthImsImplIMSProviderImpl[]" \
            "comAdobeGraniteAuthImsImplImsConfigProviderImpl[]" \
            "comAdobeGraniteAuthOauthAccesstokenProvider[]" \
            "comAdobeGraniteAuthOauthImplBearerAuthenticationHandler[]" \
            "comAdobeGraniteAuthOauthImplDefaultTokenValidatorImpl[]" \
            "comAdobeGraniteAuthOauthImplFacebookProviderImpl[]" \
            "comAdobeGraniteAuthOauthImplGithubProviderImpl[]" \
            "comAdobeGraniteAuthOauthImplGraniteProvider[]" \
            "comAdobeGraniteAuthOauthImplHelperProviderConfigManager[]" \
            "comAdobeGraniteAuthOauthImplHelperProviderConfigManagerInternal[]" \
            "comAdobeGraniteAuthOauthImplOAuthAuthenticationHandler[]" \
            "comAdobeGraniteAuthOauthImplTwitterProviderImpl[]" \
            "comAdobeGraniteAuthOauthProvider[]" \
            "comAdobeGraniteAuthRequirementImplDefaultRequirementHandler[]" \
            "comAdobeGraniteAuthSamlSamlAuthenticationHandler[]" \
            "comAdobeGraniteAuthSsoImplSsoAuthenticationHandler[]" \
            "comAdobeGraniteBundlesHcImplCodeCacheHealthCheck[]" \
            "comAdobeGraniteBundlesHcImplCrxdeSupportBundleHealthCheck[]" \
            "comAdobeGraniteBundlesHcImplDavExBundleHealthCheck[]" \
            "comAdobeGraniteBundlesHcImplInactiveBundlesHealthCheck[]" \
            "comAdobeGraniteBundlesHcImplJobsHealthCheck[]" \
            "comAdobeGraniteBundlesHcImplSlingGetServletHealthCheck[]" \
            "comAdobeGraniteBundlesHcImplSlingJavaScriptHandlerHealthCheck[]" \
            "comAdobeGraniteBundlesHcImplSlingJspScriptHandlerHealthCheck[]" \
            "comAdobeGraniteBundlesHcImplSlingReferrerFilterHealthCheck[]" \
            "comAdobeGraniteBundlesHcImplWebDavBundleHealthCheck[]" \
            "comAdobeGraniteCommentsInternalCommentReplicationContentFilterFac[]" \
            "comAdobeGraniteCompatrouterImplCompatSwitchingServiceImpl[]" \
            "comAdobeGraniteCompatrouterImplRoutingConfig[]" \
            "comAdobeGraniteCompatrouterImplSwitchMappingConfig[]" \
            "comAdobeGraniteConfImplRuntimeAwareConfigurationResourceResolving[]" \
            "comAdobeGraniteContexthubImplContextHubImpl[]" \
            "comAdobeGraniteCorsImplCORSPolicyImpl[]" \
            "comAdobeGraniteCsrfImplCSRFFilter[]" \
            "comAdobeGraniteCsrfImplCSRFServlet[]" \
            "comAdobeGraniteDistributionCoreImplCryptoDistributionTransportSe[]" \
            "comAdobeGraniteDistributionCoreImplDiffDiffChangesObserver[]" \
            "comAdobeGraniteDistributionCoreImplDiffDiffEventListener[]" \
            "comAdobeGraniteDistributionCoreImplDistributionToReplicationEven[]" \
            "comAdobeGraniteDistributionCoreImplReplicationAdaptersReplicat[]" \
            "comAdobeGraniteDistributionCoreImplReplicationDistributionTrans[]" \
            "comAdobeGraniteDistributionCoreImplTransportAccessTokenDistribu[]" \
            "comAdobeGraniteFragsImplCheckHttpHeaderFlag[]" \
            "comAdobeGraniteFragsImplRandomFeature[]" \
            "comAdobeGraniteHttpcacheFileFileCacheStore[]" \
            "comAdobeGraniteHttpcacheImplOuterCacheFilter[]" \
            "comAdobeGraniteI18nImplBundlePseudoTranslations[]" \
            "comAdobeGraniteI18nImplPreferencesLocaleResolverService[]" \
            "comAdobeGraniteInfocollectorInfoCollector[]" \
            "comAdobeGraniteJettySslInternalGraniteSslConnectorFactory[]" \
            "comAdobeGraniteLicenseImplLicenseCheckFilter[]" \
            "comAdobeGraniteLoggingImplLogAnalyserImpl[]" \
            "comAdobeGraniteLoggingImplLogErrorHealthCheck[]" \
            "comAdobeGraniteMaintenanceCrxImplDataStoreGarbageCollectionTask[]" \
            "comAdobeGraniteMaintenanceCrxImplLuceneBinariesCleanupTask[]" \
            "comAdobeGraniteMaintenanceCrxImplRevisionCleanupTask[]" \
            "comAdobeGraniteMonitoringImplScriptConfigImpl[]" \
            "comAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHan[]" \
            "comAdobeGraniteOauthServerImplAccessTokenCleanupTask[]" \
            "comAdobeGraniteOauthServerImplOAuth2ClientRevocationServlet[]" \
            "comAdobeGraniteOauthServerImplOAuth2RevocationEndpointServlet[]" \
            "comAdobeGraniteOauthServerImplOAuth2TokenEndpointServlet[]" \
            "comAdobeGraniteOauthServerImplOAuth2TokenRevocationServlet[]" \
            "comAdobeGraniteOffloadingImplOffloadingConfigurator[]" \
            "comAdobeGraniteOffloadingImplOffloadingJobCloner[]" \
            "comAdobeGraniteOffloadingImplOffloadingJobOffloader[]" \
            "comAdobeGraniteOffloadingImplTransporterOffloadingAgentManager[]" \
            "comAdobeGraniteOffloadingImplTransporterOffloadingDefaultTranspo[]" \
            "comAdobeGraniteOmnisearchImplCoreOmniSearchServiceImpl[]" \
            "comAdobeGraniteOptoutImplOptOutServiceImpl[]" \
            "comAdobeGraniteQueriesImplHcAsyncIndexHealthCheck[]" \
            "comAdobeGraniteQueriesImplHcLargeIndexHealthCheck[]" \
            "comAdobeGraniteQueriesImplHcQueriesStatusHealthCheck[]" \
            "comAdobeGraniteQueriesImplHcQueryHealthCheckMetrics[]" \
            "comAdobeGraniteQueriesImplHcQueryLimitsHealthCheck[]" \
            "comAdobeGraniteReplicationHcImplReplicationQueueHealthCheck[]" \
            "comAdobeGraniteReplicationHcImplReplicationTransportUsersHealthC[]" \
            "comAdobeGraniteRepositoryHcImplAuthorizableNodeNameHealthCheck[]" \
            "comAdobeGraniteRepositoryHcImplContentSlingSlingContentHealthC[]" \
            "comAdobeGraniteRepositoryHcImplContinuousRGCHealthCheck[]" \
            "comAdobeGraniteRepositoryHcImplDefaultAccessUserProfileHealthChe[]" \
            "comAdobeGraniteRepositoryHcImplDefaultLoginsHealthCheck[]" \
            "comAdobeGraniteRepositoryHcImplDiskSpaceHealthCheck[]" \
            "comAdobeGraniteRepositoryHcImplObservationQueueLengthHealthCheck[]" \
            "comAdobeGraniteRepositoryImplCommitStatsConfig[]" \
            "comAdobeGraniteRepositoryServiceUserConfiguration[]" \
            "comAdobeGraniteRequestsLoggingImplHcRequestsStatusHealthCheckIm[]" \
            "comAdobeGraniteResourcestatusImplCompositeStatusType[]" \
            "comAdobeGraniteResourcestatusImplStatusResourceProviderImpl[]" \
            "comAdobeGraniteRestAssetsImplAssetContentDispositionFilter[]" \
            "comAdobeGraniteRestImplApiEndpointResourceProviderFactoryImpl[]" \
            "comAdobeGraniteRestImplServletDefaultGETServlet[]" \
            "comAdobeGraniteSecurityUserUiInternalServletsSSLConfigurationS[]" \
            "comAdobeGraniteSecurityUserUserPropertiesService[]" \
            "comAdobeGraniteSocialgraphImplSocialGraphFactoryImpl[]" \
            "comAdobeGraniteSystemMonitoringImplSystemStatsMBeanImpl[]" \
            "comAdobeGraniteTaskmanagementImplJcrTaskAdapterFactory[]" \
            "comAdobeGraniteTaskmanagementImplJcrTaskArchiveService[]" \
            "comAdobeGraniteTaskmanagementImplPurgeTaskPurgeMaintenanceTask[]" \
            "comAdobeGraniteTaskmanagementImplServiceTaskManagerAdapterFactor[]" \
            "comAdobeGraniteThreaddumpThreadDumpCollector[]" \
            "comAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTransl[]" \
            "comAdobeGraniteTranslationCoreImplTranslationManagerImpl[]" \
            "comAdobeGraniteUiClientlibsImplHtmlLibraryManagerImpl[]" \
            "comAdobeGraniteWorkflowConsoleFragsWorkflowWithdrawFeature[]" \
            "comAdobeGraniteWorkflowConsolePublishWorkflowPublishEventService[]" \
            "comAdobeGraniteWorkflowCoreJcrWorkflowBucketManager[]" \
            "comAdobeGraniteWorkflowCoreJobExternalProcessJobHandler[]" \
            "comAdobeGraniteWorkflowCoreJobJobHandler[]" \
            "comAdobeGraniteWorkflowCoreOffloadingWorkflowOffloadingJobConsum[]" \
            "comAdobeGraniteWorkflowCorePayloadMapCache[]" \
            "comAdobeGraniteWorkflowCorePayloadmapPayloadMoveListener[]" \
            "comAdobeGraniteWorkflowCoreWorkflowConfig[]" \
            "comAdobeGraniteWorkflowCoreWorkflowSessionFactory[]" \
            "comAdobeGraniteWorkflowPurgeScheduler[]" \
            "comAdobeOctopusNcommBootstrap[]" \
            "comAdobeSocialIntegrationsLivefyreUserPingforpullImplPingPullS[]" \
            "comAdobeXmpWorkerFilesNcommXMPFilesNComm[]" \
            "comDayCommonsDatasourceJdbcpoolJdbcPoolService[]" \
            "comDayCommonsHttpclient[]" \
            "comDayCqAnalyticsImplStorePropertiesChangeListener[]" \
            "comDayCqAnalyticsSitecatalystImplExporterClassificationsExporte[]" \
            "comDayCqAnalyticsSitecatalystImplImporterReportImporter[]" \
            "comDayCqAnalyticsSitecatalystImplSitecatalystAdapterFactory[]" \
            "comDayCqAnalyticsSitecatalystImplSitecatalystHttpClientImpl[]" \
            "comDayCqAnalyticsTestandtargetImplAccountOptionsUpdater[]" \
            "comDayCqAnalyticsTestandtargetImplDeleteAuthorActivityListener[]" \
            "comDayCqAnalyticsTestandtargetImplPushAuthorCampaignPageListener[]" \
            "comDayCqAnalyticsTestandtargetImplSegmentImporter[]" \
            "comDayCqAnalyticsTestandtargetImplServiceWebServiceImpl[]" \
            "comDayCqAnalyticsTestandtargetImplServletsAdminServerServlet[]" \
            "comDayCqAnalyticsTestandtargetImplTestandtargetHttpClientImpl[]" \
            "comDayCqAuthImplCugCugSupportImpl[]" \
            "comDayCqAuthImplLoginSelectorHandler[]" \
            "comDayCqCommonsImplExternalizerImpl[]" \
            "comDayCqCommonsServletsRootMappingServlet[]" \
            "comDayCqCompatCodeupgradeImplCodeUpgradeExecutionConditionChecke[]" \
            "comDayCqCompatCodeupgradeImplUpgradeTaskIgnoreList[]" \
            "comDayCqCompatCodeupgradeImplVersionRangeTaskIgnorelist[]" \
            "comDayCqContentsyncImplContentSyncManagerImpl[]" \
            "comDayCqDamCommonsHandlerStandardImageHandler[]" \
            "comDayCqDamCommonsMetadataXmpFilterBlackWhite[]" \
            "comDayCqDamCommonsUtilImplAssetCacheImpl[]" \
            "comDayCqDamCoreImplAnnotationPdfAnnotationPdfConfig[]" \
            "comDayCqDamCoreImplAssetMoveListener[]" \
            "comDayCqDamCoreImplAssethomeAssetHomePageConfiguration[]" \
            "comDayCqDamCoreImplAssetlinkshareAdhocAssetShareProxyServlet[]" \
            "comDayCqDamCoreImplCacheCQBufferedImageCache[]" \
            "comDayCqDamCoreImplDamChangeEventListener[]" \
            "comDayCqDamCoreImplDamEventPurgeService[]" \
            "comDayCqDamCoreImplDamEventRecorderImpl[]" \
            "comDayCqDamCoreImplEventDamEventAuditListener[]" \
            "comDayCqDamCoreImplExpiryNotificationJobImpl[]" \
            "comDayCqDamCoreImplFoldermetadataschemaFolderMetadataSchemaFeat[]" \
            "comDayCqDamCoreImplGfxCommonsGfxRenderer[]" \
            "comDayCqDamCoreImplHandlerEPSFormatHandler[]" \
            "comDayCqDamCoreImplHandlerIndesignFormatHandler[]" \
            "comDayCqDamCoreImplHandlerJpegHandler[]" \
            "comDayCqDamCoreImplHandlerXmpNCommXMPHandler[]" \
            "comDayCqDamCoreImplJmxAssetIndexUpdateMonitor[]" \
            "comDayCqDamCoreImplJmxAssetMigrationMBeanImpl[]" \
            "comDayCqDamCoreImplJmxAssetUpdateMonitorImpl[]" \
            "comDayCqDamCoreImplJobsMetadataexportAsyncMetadataExportConfig[]" \
            "comDayCqDamCoreImplJobsMetadataimportAsyncMetadataImportConfig[]" \
            "comDayCqDamCoreImplLightboxLightboxServlet[]" \
            "comDayCqDamCoreImplMetadataEditorSelectComponentHandler[]" \
            "comDayCqDamCoreImplMimeTypeAssetUploadRestrictionHelper[]" \
            "comDayCqDamCoreImplMimeTypeDamMimeTypeServiceImpl[]" \
            "comDayCqDamCoreImplMissingMetadataNotificationJob[]" \
            "comDayCqDamCoreImplProcessSendTransientWorkflowCompletedEmailPr[]" \
            "comDayCqDamCoreImplProcessTextExtractionProcess[]" \
            "comDayCqDamCoreImplRenditionMakerImpl[]" \
            "comDayCqDamCoreImplReportsReportExportService[]" \
            "comDayCqDamCoreImplReportsReportPurgeService[]" \
            "comDayCqDamCoreImplServletAssetDownloadServlet[]" \
            "comDayCqDamCoreImplServletAssetStatusServlet[]" \
            "comDayCqDamCoreImplServletAssetXMPSearchServlet[]" \
            "comDayCqDamCoreImplServletBatchMetadataServlet[]" \
            "comDayCqDamCoreImplServletBinaryProviderServlet[]" \
            "comDayCqDamCoreImplServletCollectionServlet[]" \
            "comDayCqDamCoreImplServletCollectionsServlet[]" \
            "comDayCqDamCoreImplServletCompanionServlet[]" \
            "comDayCqDamCoreImplServletCreateAssetServlet[]" \
            "comDayCqDamCoreImplServletDamContentDispositionFilter[]" \
            "comDayCqDamCoreImplServletGuidLookupFilter[]" \
            "comDayCqDamCoreImplServletHealthCheckServlet[]" \
            "comDayCqDamCoreImplServletMetadataGetServlet[]" \
            "comDayCqDamCoreImplServletMultipleLicenseAcceptServlet[]" \
            "comDayCqDamCoreImplServletResourceCollectionServlet[]" \
            "comDayCqDamCoreImplUiPreviewFolderPreviewUpdaterImpl[]" \
            "comDayCqDamCoreImplUnzipUnzipConfig[]" \
            "comDayCqDamCoreProcessExifToolExtractMetadataProcess[]" \
            "comDayCqDamCoreProcessExtractMetadataProcess[]" \
            "comDayCqDamCoreProcessMetadataProcessorProcess[]" \
            "comDayCqDamHandlerFfmpegLocatorImpl[]" \
            "comDayCqDamHandlerGibsonFontmanagerImplFontManagerServiceImpl[]" \
            "comDayCqDamHandlerStandardPdfPdfHandler[]" \
            "comDayCqDamHandlerStandardPsPostScriptHandler[]" \
            "comDayCqDamHandlerStandardPsdPsdHandler[]" \
            "comDayCqDamIdsImplIDSJobProcessor[]" \
            "comDayCqDamIdsImplIDSPoolManagerImpl[]" \
            "comDayCqDamInddImplHandlerIndesignXMPHandler[]" \
            "comDayCqDamInddImplServletSnippetCreationServlet[]" \
            "comDayCqDamInddProcessINDDMediaExtractProcess[]" \
            "comDayCqDamPerformanceInternalAssetPerformanceDataHandlerImpl[]" \
            "comDayCqDamPerformanceInternalAssetPerformanceReportSyncJob[]" \
            "comDayCqDamPimImplSourcingUploadProcessProductAssetsUploadPro[]" \
            "comDayCqDamS7damCommonAnalyticsImplS7damDynamicMediaConfigEven[]" \
            "comDayCqDamS7damCommonAnalyticsImplSiteCatalystReportRunner[]" \
            "comDayCqDamS7damCommonPostServletsSetCreateHandler[]" \
            "comDayCqDamS7damCommonPostServletsSetModifyHandler[]" \
            "comDayCqDamS7damCommonProcessVideoThumbnailDownloadProcess[]" \
            "comDayCqDamS7damCommonS7damDamChangeEventListener[]" \
            "comDayCqDamS7damCommonServletsS7damProductInfoServlet[]" \
            "comDayCqDamS7damCommonVideoImplVideoProxyClientServiceImpl[]" \
            "comDayCqDamScene7ImplScene7APIClientImpl[]" \
            "comDayCqDamScene7ImplScene7AssetMimeTypeServiceImpl[]" \
            "comDayCqDamScene7ImplScene7ConfigurationEventListener[]" \
            "comDayCqDamScene7ImplScene7DamChangeEventListener[]" \
            "comDayCqDamScene7ImplScene7FlashTemplatesServiceImpl[]" \
            "comDayCqDamScene7ImplScene7UploadServiceImpl[]" \
            "comDayCqDamStockIntegrationImplCacheStockCacheConfigurationSer[]" \
            "comDayCqDamStockIntegrationImplConfigurationStockConfiguration[]" \
            "comDayCqDamVideoImplServletVideoTestServlet[]" \
            "comDayCqExtwidgetServletsImageSpriteServlet[]" \
            "comDayCqImageInternalFontFontHelper[]" \
            "comDayCqJcrclustersupportClusterStartLevelController[]" \
            "comDayCqMailerDefaultMailService[]" \
            "comDayCqMailerImplCqMailingService[]" \
            "comDayCqMailerImplEmailCqEmailTemplateFactory[]" \
            "comDayCqMailerImplEmailCqRetrieverTemplateFactory[]" \
            "comDayCqMcmCampaignImplIntegrationConfigImpl[]" \
            "comDayCqMcmCampaignImporterPersonalizedTextHandlerFactory[]" \
            "comDayCqMcmCoreNewsletterNewsletterEmailServiceImpl[]" \
            "comDayCqMcmImplMCMConfiguration[]" \
            "comDayCqMcmLandingpageParserTaghandlersCtaClickThroughComponen[]" \
            "comDayCqMcmLandingpageParserTaghandlersCtaGraphicalClickThroug[]" \
            "comDayCqMcmLandingpageParserTaghandlersCtaLeadFormCTAComponent[]" \
            "comDayCqMcmLandingpageParserTaghandlersMboxMBoxExperienceTagHa[]" \
            "comDayCqMcmLandingpageParserTaghandlersMboxTargetComponentTagH[]" \
            "comDayCqNotificationImplNotificationServiceImpl[]" \
            "comDayCqPersonalizationImplServletsTargetingConfigurationServlet[]" \
            "comDayCqPollingImporterImplManagedPollConfigImpl[]" \
            "comDayCqPollingImporterImplManagedPollingImporterImpl[]" \
            "comDayCqPollingImporterImplPollingImporterImpl[]" \
            "comDayCqReplicationAuditReplicationEventListener[]" \
            "comDayCqReplicationContentStaticContentBuilder[]" \
            "comDayCqReplicationImplAgentManagerImpl[]" \
            "comDayCqReplicationImplContentDurboBinaryLessContentBuilder[]" \
            "comDayCqReplicationImplContentDurboDurboImportConfigurationProv[]" \
            "comDayCqReplicationImplReplicationContentFactoryProviderImpl[]" \
            "comDayCqReplicationImplReplicationReceiverImpl[]" \
            "comDayCqReplicationImplReplicatorImpl[]" \
            "comDayCqReplicationImplReverseReplicator[]" \
            "comDayCqReplicationImplTransportBinaryLessTransportHandler[]" \
            "comDayCqReplicationImplTransportHttp[]" \
            "comDayCqReportingImplCacheCacheImpl[]" \
            "comDayCqReportingImplConfigServiceImpl[]" \
            "comDayCqReportingImplRLogAnalyzer[]" \
            "comDayCqRewriterLinkcheckerImplLinkCheckerImpl[]" \
            "comDayCqRewriterLinkcheckerImplLinkCheckerTask[]" \
            "comDayCqRewriterLinkcheckerImplLinkCheckerTransformerFactory[]" \
            "comDayCqRewriterLinkcheckerImplLinkInfoStorageImpl[]" \
            "comDayCqRewriterProcessorImplHtmlParserFactory[]" \
            "comDayCqSearchImplBuilderQueryBuilderImpl[]" \
            "comDayCqSearchSuggestImplSuggestionIndexManagerImpl[]" \
            "comDayCqSearchpromoteImplPublishSearchPromoteConfigHandler[]" \
            "comDayCqSearchpromoteImplSearchPromoteServiceImpl[]" \
            "comDayCqSecurityACLSetup[]" \
            "comDayCqStatisticsImplStatisticsServiceImpl[]" \
            "comDayCqTaggingImplJcrTagManagerFactoryImpl[]" \
            "comDayCqTaggingImplSearchTagPredicateEvaluator[]" \
            "comDayCqTaggingImplTagGarbageCollector[]" \
            "comDayCqWcmContentsyncImplHandlerPagesUpdateHandler[]" \
            "comDayCqWcmContentsyncImplRewriterPathRewriterTransformerFactor[]" \
            "comDayCqWcmCoreImplAuthoringUIModeServiceImpl[]" \
            "comDayCqWcmCoreImplCommandsWCMCommandServlet[]" \
            "comDayCqWcmCoreImplDevicedetectionDeviceIdentificationModeImpl[]" \
            "comDayCqWcmCoreImplEventPageEventAuditListener[]" \
            "comDayCqWcmCoreImplEventPagePostProcessor[]" \
            "comDayCqWcmCoreImplEventRepositoryChangeEventListener[]" \
            "comDayCqWcmCoreImplEventTemplatePostProcessor[]" \
            "comDayCqWcmCoreImplLanguageManagerImpl[]" \
            "comDayCqWcmCoreImplLinkCheckerConfigurationFactoryImpl[]" \
            "comDayCqWcmCoreImplPagePageInfoAggregatorImpl[]" \
            "comDayCqWcmCoreImplPagePageManagerFactoryImpl[]" \
            "comDayCqWcmCoreImplReferencesContentContentReferenceConfig[]" \
            "comDayCqWcmCoreImplServletsContentfinderAssetViewHandler[]" \
            "comDayCqWcmCoreImplServletsContentfinderConnectorConnectorVie[]" \
            "comDayCqWcmCoreImplServletsContentfinderPageViewHandler[]" \
            "comDayCqWcmCoreImplServletsFindReplaceServlet[]" \
            "comDayCqWcmCoreImplServletsReferenceSearchServlet[]" \
            "comDayCqWcmCoreImplServletsThumbnailServlet[]" \
            "comDayCqWcmCoreImplUtilsDefaultPageNameValidator[]" \
            "comDayCqWcmCoreImplVariantsPageVariantsProviderImpl[]" \
            "comDayCqWcmCoreImplVersionManagerImpl[]" \
            "comDayCqWcmCoreImplVersionPurgeTask[]" \
            "comDayCqWcmCoreImplWCMDebugFilter[]" \
            "comDayCqWcmCoreImplWCMDeveloperModeFilter[]" \
            "comDayCqWcmCoreImplWarpTimeWarpFilter[]" \
            "comDayCqWcmCoreMvtMVTStatisticsImpl[]" \
            "comDayCqWcmCoreStatsPageViewStatisticsImpl[]" \
            "comDayCqWcmCoreWCMRequestFilter[]" \
            "comDayCqWcmDesignimporterDesignPackageImporter[]" \
            "comDayCqWcmDesignimporterImplCanvasBuilderImpl[]" \
            "comDayCqWcmDesignimporterImplCanvasPageDeleteHandler[]" \
            "comDayCqWcmDesignimporterImplEntryPreprocessorImpl[]" \
            "comDayCqWcmDesignimporterImplMobileCanvasBuilderImpl[]" \
            "comDayCqWcmDesignimporterParserTaghandlersFactoryCanvasCompone[]" \
            "comDayCqWcmDesignimporterParserTaghandlersFactoryDefaultCompon[]" \
            "comDayCqWcmDesignimporterParserTaghandlersFactoryDefaultTagHan[]" \
            "comDayCqWcmDesignimporterParserTaghandlersFactoryHeadTagHandle[]" \
            "comDayCqWcmDesignimporterParserTaghandlersFactoryIFrameTagHand[]" \
            "comDayCqWcmDesignimporterParserTaghandlersFactoryImageComponen[]" \
            "comDayCqWcmDesignimporterParserTaghandlersFactoryImgTagHandler[]" \
            "comDayCqWcmDesignimporterParserTaghandlersFactoryInlineScriptT[]" \
            "comDayCqWcmDesignimporterParserTaghandlersFactoryLinkTagHandle[]" \
            "comDayCqWcmDesignimporterParserTaghandlersFactoryMetaTagHandle[]" \
            "comDayCqWcmDesignimporterParserTaghandlersFactoryNonScriptTagH[]" \
            "comDayCqWcmDesignimporterParserTaghandlersFactoryParsysCompone[]" \
            "comDayCqWcmDesignimporterParserTaghandlersFactoryScriptTagHand[]" \
            "comDayCqWcmDesignimporterParserTaghandlersFactoryStyleTagHandl[]" \
            "comDayCqWcmDesignimporterParserTaghandlersFactoryTextComponent[]" \
            "comDayCqWcmDesignimporterParserTaghandlersFactoryTitleComponen[]" \
            "comDayCqWcmDesignimporterParserTaghandlersFactoryTitleTagHandl[]" \
            "comDayCqWcmFoundationFormsImplFormChooserServlet[]" \
            "comDayCqWcmFoundationFormsImplFormParagraphPostProcessor[]" \
            "comDayCqWcmFoundationFormsImplFormsHandlingServlet[]" \
            "comDayCqWcmFoundationFormsImplMailServlet[]" \
            "comDayCqWcmFoundationImplAdaptiveImageComponentServlet[]" \
            "comDayCqWcmFoundationImplHTTPAuthHandler[]" \
            "comDayCqWcmFoundationImplPageImpressionsTracker[]" \
            "comDayCqWcmFoundationImplPageRedirectServlet[]" \
            "comDayCqWcmFoundationSecurityImplDefaultAttachmentTypeBlacklist[]" \
            "comDayCqWcmFoundationSecurityImplSaferSlingPostValidatorImpl[]" \
            "comDayCqWcmMobileCoreImplDeviceDeviceInfoTransformerFactory[]" \
            "comDayCqWcmMobileCoreImplRedirectRedirectFilter[]" \
            "comDayCqWcmMsmImplActionsContentCopyActionFactory[]" \
            "comDayCqWcmMsmImplActionsContentDeleteActionFactory[]" \
            "comDayCqWcmMsmImplActionsContentUpdateActionFactory[]" \
            "comDayCqWcmMsmImplActionsOrderChildrenActionFactory[]" \
            "comDayCqWcmMsmImplActionsPageMoveActionFactory[]" \
            "comDayCqWcmMsmImplActionsReferencesUpdateActionFactory[]" \
            "comDayCqWcmMsmImplActionsVersionCopyActionFactory[]" \
            "comDayCqWcmMsmImplLiveRelationshipManagerImpl[]" \
            "comDayCqWcmMsmImplRolloutManagerImpl[]" \
            "comDayCqWcmMsmImplServletsAuditLogServlet[]" \
            "comDayCqWcmNotificationEmailImplEmailChannel[]" \
            "comDayCqWcmNotificationImplNotificationManagerImpl[]" \
            "comDayCqWcmScriptingImplBVPManager[]" \
            "comDayCqWcmUndoUndoConfig[]" \
            "comDayCqWcmWebservicesupportImplReplicationEventListener[]" \
            "comDayCqWcmWorkflowImplWcmWorkflowServiceImpl[]" \
            "comDayCqWcmWorkflowImplWorkflowPackageInfoProvider[]" \
            "comDayCqWidgetImplHtmlLibraryManagerImpl[]" \
            "comDayCqWidgetImplWidgetExtensionProviderImpl[]" \
            "comDayCqWorkflowImplEmailEMailNotificationService[]" \
            "comDayCqWorkflowImplEmailTaskEMailNotificationService[]" \
            "comDayCrxSecurityTokenImplImplTokenAuthenticationHandler[]" \
            "comDayCrxSecurityTokenImplTokenCleanupTask[]" \
            "guideLocalizationService[]" \
            "messagingUserComponentFactory[]" \
            "orgApacheAriesJmxFrameworkStateConfig[]" \
            "orgApacheFelixEventadminImplEventAdmin[]" \
            "orgApacheFelixHttp[]" \
            "orgApacheFelixHttpSslfilterSslFilter[]" \
            "orgApacheFelixJaasConfigurationFactory[]" \
            "orgApacheFelixJaasConfigurationSpi[]" \
            "orgApacheFelixScrScrService[]" \
            "orgApacheFelixSystemreadyImplComponentsCheck[]" \
            "orgApacheFelixSystemreadyImplFrameworkStartCheck[]" \
            "orgApacheFelixSystemreadyImplServicesCheck[]" \
            "orgApacheFelixSystemreadyImplServletSystemAliveServlet[]" \
            "orgApacheFelixSystemreadyImplServletSystemReadyServlet[]" \
            "orgApacheFelixSystemreadySystemReadyMonitor[]" \
            "orgApacheFelixWebconsoleInternalServletOsgiManager[]" \
            "orgApacheFelixWebconsolePluginsEventInternalPluginServlet[]" \
            "orgApacheFelixWebconsolePluginsMemoryusageInternalMemoryUsageCo[]" \
            "orgApacheHttpProxyconfigurator[]" \
            "orgApacheJackrabbitOakPluginsBlobDatastoreDataStoreTextProvider[]" \
            "orgApacheJackrabbitOakPluginsBlobDatastoreFileDataStore[]" \
            "orgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreService[]" \
            "orgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServicePre[]" \
            "orgApacheJackrabbitOakPluginsDocumentSecondarySecondaryStoreCac[]" \
            "orgApacheJackrabbitOakPluginsIndexAsyncIndexerService[]" \
            "orgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServ[]" \
            "orgApacheJackrabbitOakPluginsIndexSolrOsgiEmbeddedSolrServerCo[]" \
            "orgApacheJackrabbitOakPluginsIndexSolrOsgiNodeStateSolrServers[]" \
            "orgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfiguration[]" \
            "orgApacheJackrabbitOakPluginsIndexSolrOsgiRemoteSolrServerConf[]" \
            "orgApacheJackrabbitOakPluginsIndexSolrOsgiSolrQueryIndexProvid[]" \
            "orgApacheJackrabbitOakPluginsIndexSolrOsgiSolrServerProviderSe[]" \
            "orgApacheJackrabbitOakPluginsMetricStatisticsProviderFactory[]" \
            "orgApacheJackrabbitOakPluginsObservationChangeCollectorProvider[]" \
            "orgApacheJackrabbitOakQueryQueryEngineSettingsService[]" \
            "orgApacheJackrabbitOakSecurityAuthenticationAuthenticationConfig[]" \
            "orgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdenti[]" \
            "orgApacheJackrabbitOakSecurityAuthenticationTokenTokenConfigura[]" \
            "orgApacheJackrabbitOakSecurityAuthorizationAuthorizationConfigur[]" \
            "orgApacheJackrabbitOakSecurityInternalSecurityProviderRegistrati[]" \
            "orgApacheJackrabbitOakSecurityUserRandomAuthorizableNodeName[]" \
            "orgApacheJackrabbitOakSecurityUserUserConfigurationImpl[]" \
            "orgApacheJackrabbitOakSegmentAzureAzureSegmentStoreService[]" \
            "orgApacheJackrabbitOakSegmentSegmentNodeStoreFactory[]" \
            "orgApacheJackrabbitOakSegmentSegmentNodeStoreMonitorService[]" \
            "orgApacheJackrabbitOakSegmentSegmentNodeStoreService[]" \
            "orgApacheJackrabbitOakSegmentStandbyStoreStandbyStoreService[]" \
            "orgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplDe[]" \
            "orgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplEx[]" \
            "orgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplPr[]" \
            "orgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugConfi[]" \
            "orgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugExclu[]" \
            "orgApacheJackrabbitOakSpiSecurityUserActionDefaultAuthorizable[]" \
            "orgApacheJackrabbitVaultPackagingImplPackagingImpl[]" \
            "orgApacheJackrabbitVaultPackagingRegistryImplFSPackageRegistry[]" \
            "orgApacheSlingAuthCoreImplLogoutServlet[]" \
            "orgApacheSlingCaconfigImplConfigurationBindingsValueProvider[]" \
            "orgApacheSlingCaconfigImplConfigurationResolverImpl[]" \
            "orgApacheSlingCaconfigImplDefDefaultConfigurationInheritanceStra[]" \
            "orgApacheSlingCaconfigImplDefDefaultConfigurationPersistenceStra[]" \
            "orgApacheSlingCaconfigImplOverrideOsgiConfigurationOverrideProvi[]" \
            "orgApacheSlingCaconfigImplOverrideSystemPropertyConfigurationOve[]" \
            "orgApacheSlingCaconfigManagementImplConfigurationManagementSetti[]" \
            "orgApacheSlingCaconfigResourceImplDefDefaultConfigurationResour[]" \
            "orgApacheSlingCaconfigResourceImplDefDefaultContextPathStrategy[]" \
            "orgApacheSlingCommonsHtmlInternalTagsoupHtmlParser[]" \
            "orgApacheSlingCommonsLogLogManager[]" \
            "orgApacheSlingCommonsLogLogManagerFactoryConfig[]" \
            "orgApacheSlingCommonsLogLogManagerFactoryWriter[]" \
            "orgApacheSlingCommonsMetricsInternalLogReporter[]" \
            "orgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporter[]" \
            "orgApacheSlingCommonsMimeInternalMimeTypeServiceImpl[]" \
            "orgApacheSlingCommonsSchedulerImplQuartzScheduler[]" \
            "orgApacheSlingCommonsSchedulerImplSchedulerHealthCheck[]" \
            "orgApacheSlingCommonsThreadsImplDefaultThreadPoolFactory[]" \
            "orgApacheSlingDatasourceDataSourceFactory[]" \
            "orgApacheSlingDatasourceJNDIDataSourceFactory[]" \
            "orgApacheSlingDiscoveryOakConfig[]" \
            "orgApacheSlingDiscoveryOakSynchronizedClocksHealthCheck[]" \
            "orgApacheSlingDistributionAgentImplForwardDistributionAgentFacto[]" \
            "orgApacheSlingDistributionAgentImplPrivilegeDistributionRequestA[]" \
            "orgApacheSlingDistributionAgentImplQueueDistributionAgentFactory[]" \
            "orgApacheSlingDistributionAgentImplReverseDistributionAgentFacto[]" \
            "orgApacheSlingDistributionAgentImplSimpleDistributionAgentFactor[]" \
            "orgApacheSlingDistributionAgentImplSyncDistributionAgentFactory[]" \
            "orgApacheSlingDistributionMonitorDistributionQueueHealthCheck[]" \
            "orgApacheSlingDistributionPackagingImplExporterAgentDistributio[]" \
            "orgApacheSlingDistributionPackagingImplExporterLocalDistributio[]" \
            "orgApacheSlingDistributionPackagingImplExporterRemoteDistributi[]" \
            "orgApacheSlingDistributionPackagingImplImporterLocalDistributio[]" \
            "orgApacheSlingDistributionPackagingImplImporterRemoteDistributi[]" \
            "orgApacheSlingDistributionPackagingImplImporterRepositoryDistri[]" \
            "orgApacheSlingDistributionResourcesImplDistributionConfiguration[]" \
            "orgApacheSlingDistributionResourcesImplDistributionServiceResour[]" \
            "orgApacheSlingDistributionSerializationImplDistributionPackageBu[]" \
            "orgApacheSlingDistributionSerializationImplVltVaultDistribution[]" \
            "orgApacheSlingDistributionTransportImplUserCredentialsDistributi[]" \
            "orgApacheSlingDistributionTriggerImplDistributionEventDistribute[]" \
            "orgApacheSlingDistributionTriggerImplJcrEventDistributionTrigger[]" \
            "orgApacheSlingDistributionTriggerImplPersistedJcrEventDistributi[]" \
            "orgApacheSlingDistributionTriggerImplRemoteEventDistributionTrig[]" \
            "orgApacheSlingDistributionTriggerImplResourceEventDistributionTr[]" \
            "orgApacheSlingDistributionTriggerImplScheduledDistributionTrigge[]" \
            "orgApacheSlingEngineImplAuthSlingAuthenticator[]" \
            "orgApacheSlingEngineImplDebugRequestProgressTrackerLogFilter[]" \
            "orgApacheSlingEngineImplLogRequestLogger[]" \
            "orgApacheSlingEngineImplLogRequestLoggerService[]" \
            "orgApacheSlingEngineImplSlingMainServlet[]" \
            "orgApacheSlingEngineParameters[]" \
            "orgApacheSlingEventImplEventingThreadPool[]" \
            "orgApacheSlingEventImplJobsDefaultJobManager[]" \
            "orgApacheSlingEventImplJobsJcrPersistenceHandler[]" \
            "orgApacheSlingEventImplJobsJobConsumerManager[]" \
            "orgApacheSlingEventJobsQueueConfiguration[]" \
            "orgApacheSlingExtensionsWebconsolesecurityproviderInternalSlingW[]" \
            "orgApacheSlingFeatureflagsFeature[]" \
            "orgApacheSlingFeatureflagsImplConfiguredFeature[]" \
            "orgApacheSlingHapiImplHApiUtilImpl[]" \
            "orgApacheSlingHcCoreImplCompositeHealthCheck[]" \
            "orgApacheSlingHcCoreImplExecutorHealthCheckExecutorImpl[]" \
            "orgApacheSlingHcCoreImplJmxAttributeHealthCheck[]" \
            "orgApacheSlingHcCoreImplScriptableHealthCheck[]" \
            "orgApacheSlingHcCoreImplServletHealthCheckExecutorServlet[]" \
            "orgApacheSlingHcCoreImplServletResultTxtVerboseSerializer[]" \
            "orgApacheSlingI18nImplI18NFilter[]" \
            "orgApacheSlingI18nImplJcrResourceBundleProvider[]" \
            "orgApacheSlingInstallerProviderJcrImplJcrInstaller[]" \
            "orgApacheSlingJcrBaseInternalLoginAdminWhitelist[]" \
            "orgApacheSlingJcrBaseInternalLoginAdminWhitelistFragment[]" \
            "orgApacheSlingJcrDavexImplServletsSlingDavExServlet[]" \
            "orgApacheSlingJcrJackrabbitServerJndiRegistrationSupport[]" \
            "orgApacheSlingJcrJackrabbitServerRmiRegistrationSupport[]" \
            "orgApacheSlingJcrRepoinitImplRepositoryInitializer[]" \
            "orgApacheSlingJcrRepoinitRepositoryInitializer[]" \
            "orgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImpl[]" \
            "orgApacheSlingJcrResourceInternalJcrSystemUserValidator[]" \
            "orgApacheSlingJcrResourcesecurityImplResourceAccessGateFactory[]" \
            "orgApacheSlingJcrWebdavImplHandlerDefaultHandlerService[]" \
            "orgApacheSlingJcrWebdavImplHandlerDirListingExportHandlerServic[]" \
            "orgApacheSlingJcrWebdavImplServletsSimpleWebDavServlet[]" \
            "orgApacheSlingJmxProviderImplJMXResourceProvider[]" \
            "orgApacheSlingModelsImplModelAdapterFactory[]" \
            "orgApacheSlingModelsJacksonexporterImplResourceModuleProvider[]" \
            "orgApacheSlingResourceInventoryImplResourceInventoryPrinterFacto[]" \
            "orgApacheSlingResourcemergerImplMergedResourceProviderFactory[]" \
            "orgApacheSlingResourcemergerPickerOverriding[]" \
            "orgApacheSlingScriptingCoreImplScriptCacheImpl[]" \
            "orgApacheSlingScriptingCoreImplScriptingResourceResolverProvider[]" \
            "orgApacheSlingScriptingJavaImplJavaScriptEngineFactory[]" \
            "orgApacheSlingScriptingJavascriptInternalRhinoJavaScriptEngineFa[]" \
            "orgApacheSlingScriptingJspJspScriptEngineFactory[]" \
            "orgApacheSlingScriptingSightlyJsImplJsapiSlyBindingsValuesProv[]" \
            "orgApacheSlingSecurityImplContentDispositionFilter[]" \
            "orgApacheSlingSecurityImplReferrerFilter[]" \
            "orgApacheSlingServiceusermappingImplServiceUserMapperImpl[]" \
            "orgApacheSlingServiceusermappingImplServiceUserMapperImplAmended[]" \
            "orgApacheSlingServletsGetDefaultGetServlet[]" \
            "orgApacheSlingServletsGetImplVersionVersionInfoServlet[]" \
            "orgApacheSlingServletsPostImplHelperChunkCleanUpTask[]" \
            "orgApacheSlingServletsPostImplSlingPostServlet[]" \
            "orgApacheSlingServletsResolverSlingServletResolver[]" \
            "orgApacheSlingSettingsImplSlingSettingsServiceImpl[]" \
            "orgApacheSlingStartupfilterImplStartupFilterImpl[]" \
            "orgApacheSlingTenantInternalTenantProviderImpl[]" \
            "orgApacheSlingTracerInternalLogTracer[]" \
            "orgApacheSlingXssImplXSSFilterImpl[]" 
    _arguments "(--help)--help[Print information about operation]"

    ret=0
    ;;
  args)
    case $line[1] in
      adaptiveFormAndInteractiveCommunicationWebChannelConfiguration)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"showPlaceholder=true:[QUERY] "
          "showPlaceholder=false:[QUERY] "
"maximumCacheEntries=:[QUERY] "
"af.scripting.compatversion=:[QUERY] "
"makeFileNameUnique=true:[QUERY] "
          "makeFileNameUnique=false:[QUERY] "
"generatingCompliantData=true:[QUERY] "
          "generatingCompliantData=false:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      adaptiveFormAndInteractiveCommunicationWebChannelThemeConfigur)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"fontList=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      analyticsComponentQueryCacheService)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"cq.analytics.component.query.cache.size=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      apacheSlingHealthCheckResultHTMLSerializer)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"styleString=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comAdobeAemFormsndocumentsConfigAEMFormsManagerConfiguration)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"formsManagerConfig.includeOOTBTemplates=true:[QUERY] "
          "formsManagerConfig.includeOOTBTemplates=false:[QUERY] "
"formsManagerConfig.includeDeprecatedTemplates=true:[QUERY] "
          "formsManagerConfig.includeDeprecatedTemplates=false:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comAdobeAemTransactionCoreImplTransactionRecorder)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"isTransactionRecordingEnabled=true:[QUERY] "
          "isTransactionRecordingEnabled=false:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comAdobeAemUpgradePrechecksHcImplDeprecateIndexesHC)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"hc.name=:[QUERY] "
"hc.tags=:[QUERY] "
"hc.mbean.name=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comAdobeAemUpgradePrechecksHcImplReplicationAgentsDisabledHC)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"hc.name=:[QUERY] "
"hc.tags=:[QUERY] "
"hc.mbean.name=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comAdobeAemUpgradePrechecksMbeanImplPreUpgradeTasksMBeanImpl)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"pre-upgrade.maintenance.tasks=:[QUERY] "
"pre-upgrade.hc.tags=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comAdobeAemUpgradePrechecksTasksImplConsistencyCheckTaskImpl)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"root.path=:[QUERY] "
"fix.inconsistencies=true:[QUERY] "
          "fix.inconsistencies=false:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comAdobeCqAccountApiAccountManagementService)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"cq.accountmanager.token.validity.period=:[QUERY] "
"cq.accountmanager.config.requestnewaccount.mail=:[QUERY] "
"cq.accountmanager.config.requestnewpwd.mail=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comAdobeCqAccountImplAccountManagementServlet)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"cq.accountmanager.config.informnewaccount.mail=:[QUERY] "
"cq.accountmanager.config.informnewpwd.mail=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comAdobeCqAddressImplLocationLocationListServlet)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"cq.address.location.default.maxResults=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comAdobeCqAuditPurgeDam)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"auditlog.rule.name=:[QUERY] "
"auditlog.rule.contentpath=:[QUERY] "
"auditlog.rule.minimumage=:[QUERY] "
"auditlog.rule.types=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comAdobeCqAuditPurgePages)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"auditlog.rule.name=:[QUERY] "
"auditlog.rule.contentpath=:[QUERY] "
"auditlog.rule.minimumage=:[QUERY] "
"auditlog.rule.types=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comAdobeCqAuditPurgeReplication)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"auditlog.rule.name=:[QUERY] "
"auditlog.rule.contentpath=:[QUERY] "
"auditlog.rule.minimumage=:[QUERY] "
"auditlog.rule.types=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comAdobeCqCdnRewriterImplAWSCloudFrontRewriter)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"service.ranking=:[QUERY] "
"keypair.id=:[QUERY] "
"keypair.alias=:[QUERY] "
"cdnrewriter.attributes=:[QUERY] "
"cdn.rewriter.distribution.domain=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comAdobeCqCdnRewriterImplCDNConfigServiceImpl)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"cdn.config.distribution.domain=:[QUERY] "
"cdn.config.enable.rewriting=true:[QUERY] "
          "cdn.config.enable.rewriting=false:[QUERY] "
"cdn.config.path.prefixes=:[QUERY] "
"cdn.config.cdnttl=:[QUERY] "
"cdn.config.application.protocol=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comAdobeCqCdnRewriterImplCDNRewriter)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"service.ranking=:[QUERY] "
"cdnrewriter.attributes=:[QUERY] "
"cdn.rewriter.distribution.domain=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comAdobeCqCloudconfigCoreImplConfigurationReplicationEventHandle)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"flush.agents=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comAdobeCqCommerceImplAssetDynamicImageHandler)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"cq.commerce.asset.handler.active=true:[QUERY] "
          "cq.commerce.asset.handler.active=false:[QUERY] "
"cq.commerce.asset.handler.name=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comAdobeCqCommerceImplAssetProductAssetHandlerProviderImpl)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"cq.commerce.asset.handler.fallback=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comAdobeCqCommerceImplAssetStaticImageHandler)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"cq.commerce.asset.handler.active=true:[QUERY] "
          "cq.commerce.asset.handler.active=false:[QUERY] "
"cq.commerce.asset.handler.name=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comAdobeCqCommerceImplAssetVideoHandler)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"cq.commerce.asset.handler.active=true:[QUERY] "
          "cq.commerce.asset.handler.active=false:[QUERY] "
"cq.commerce.asset.handler.name=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comAdobeCqCommerceImplPromotionPromotionManagerImpl)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"cq.commerce.promotion.root=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comAdobeCqCommercePimImplCataloggeneratorCatalogGeneratorImpl)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"cq.commerce.cataloggenerator.bucketsize=:[QUERY] "
"cq.commerce.cataloggenerator.bucketname=:[QUERY] "
"cq.commerce.cataloggenerator.excludedtemplateproperties=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comAdobeCqCommercePimImplPageEventListener)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"cq.commerce.pageeventlistener.enabled=true:[QUERY] "
          "cq.commerce.pageeventlistener.enabled=false:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comAdobeCqCommercePimImplProductfeedProductFeedServiceImpl)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"Feed generator algorithm=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comAdobeCqContentinsightImplReportingServicesSettingsProvider)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"reportingservices.url=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comAdobeCqContentinsightImplServletsBrightEdgeProxyServlet)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"brightedge.url=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comAdobeCqContentinsightImplServletsReportingServicesProxyServle)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"reportingservices.proxy.whitelist=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comAdobeCqDamCfmImplComponentComponentConfigImpl)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"dam.cfm.component.resourceType=:[QUERY] "
"dam.cfm.component.fileReferenceProp=:[QUERY] "
"dam.cfm.component.elementsProp=:[QUERY] "
"dam.cfm.component.variationProp=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comAdobeCqDamCfmImplConfFeatureConfigImpl)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"dam.cfm.resourceTypes=:[QUERY] "
"dam.cfm.referenceProperties=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comAdobeCqDamCfmImplContentRewriterAssetProcessor)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"pipeline.type=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comAdobeCqDamCfmImplContentRewriterParRangeFilter)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"pipeline.type=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comAdobeCqDamCfmImplContentRewriterPayloadFilter)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"pipeline.type=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comAdobeCqDamDmProcessImagePTiffManagerImpl)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"maxMemory=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comAdobeCqDamIpsImplReplicationTriggerReplicateOnModifyWorker)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"dmreplicateonmodify.enabled=true:[QUERY] "
          "dmreplicateonmodify.enabled=false:[QUERY] "
"dmreplicateonmodify.forcesyncdeletes=true:[QUERY] "
          "dmreplicateonmodify.forcesyncdeletes=false:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comAdobeCqDamMacSyncHelperImplMACSyncClientImpl)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"com.adobe.dam.mac.sync.client.so.timeout=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comAdobeCqDamMacSyncImplDAMSyncServiceImpl)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"com.adobe.cq.dam.mac.sync.damsyncservice.registered_paths=:[QUERY] "
"com.adobe.cq.dam.mac.sync.damsyncservice.sync.renditions=true:[QUERY] "
          "com.adobe.cq.dam.mac.sync.damsyncservice.sync.renditions=false:[QUERY] "
"com.adobe.cq.dam.mac.sync.damsyncservice.replicate.thread.wait.ms=:[QUERY] "
"com.adobe.cq.dam.mac.sync.damsyncservice.platform=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comAdobeCqDamProcessorNuiImplNuiAssetProcessor)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"nuiEnabled=true:[QUERY] "
          "nuiEnabled=false:[QUERY] "
"nuiServiceUrl=:[QUERY] "
"nuiApiKey=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comAdobeCqDamS7imagingImplIsImageServerComponent)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"TcpPort=:[QUERY] "
"AllowRemoteAccess=true:[QUERY] "
          "AllowRemoteAccess=false:[QUERY] "
"MaxRenderRgnPixels=:[QUERY] "
"MaxMessageSize=:[QUERY] "
"RandomAccessUrlTimeout=:[QUERY] "
"WorkerThreads=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comAdobeCqDamS7imagingImplPsPlatformServerServlet)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"cache.enable=true:[QUERY] "
          "cache.enable=false:[QUERY] "
"cache.rootPaths=:[QUERY] "
"cache.maxSize=:[QUERY] "
"cache.maxEntries=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comAdobeCqDamWebdavImplIoAssetIOHandler)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"service.ranking=:[QUERY] "
"pathPrefix=:[QUERY] "
"createVersion=true:[QUERY] "
          "createVersion=false:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comAdobeCqDamWebdavImplIoDamWebdavVersionLinkingJob)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"cq.dam.webdav.version.linking.enable=true:[QUERY] "
          "cq.dam.webdav.version.linking.enable=false:[QUERY] "
"cq.dam.webdav.version.linking.scheduler.period=:[QUERY] "
"cq.dam.webdav.version.linking.staging.timeout=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comAdobeCqDamWebdavImplIoSpecialFilesHandler)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"com.day.cq.dam.core.impl.io.SpecialFilesHandler.filepatters=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comAdobeCqDeserfwImplDeserializationFirewallImpl)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"firewall.deserialization.whitelist=:[QUERY] "
"firewall.deserialization.blacklist=:[QUERY] "
"firewall.deserialization.diagnostics=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comAdobeCqDtmImplServiceDTMWebServiceImpl)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"connection.timeout=:[QUERY] "
"socket.timeout=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comAdobeCqDtmImplServletsDTMDeployHookServlet)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"dtm.staging.ip.whitelist=:[QUERY] "
"dtm.production.ip.whitelist=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comAdobeCqDtmReactorImplServiceWebServiceImpl)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"endpointUri=:[QUERY] "
"connectionTimeout=:[QUERY] "
"socketTimeout=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comAdobeCqExperiencelogImplExperienceLogConfigServlet)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"enabled=true:[QUERY] "
          "enabled=false:[QUERY] "
"disabledForGroups=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comAdobeCqHcContentPackagesHealthCheck)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"hc.name=:[QUERY] "
"hc.tags=:[QUERY] "
"hc.mbean.name=:[QUERY] "
"package.names=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comAdobeCqHistoryImplHistoryRequestFilter)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"history.requestFilter.excludedSelectors=:[QUERY] "
"history.requestFilter.excludedExtensions=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comAdobeCqHistoryImplHistoryServiceImpl)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"history.service.resourceTypes=:[QUERY] "
"history.service.pathFilter=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comAdobeCqInboxImplTypeproviderItemTypeProvider)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"inbox.impl.typeprovider.registrypaths=:[QUERY] "
"inbox.impl.typeprovider.legacypaths=:[QUERY] "
"inbox.impl.typeprovider.defaulturl.failureitem=:[QUERY] "
"inbox.impl.typeprovider.defaulturl.workitem=:[QUERY] "
"inbox.impl.typeprovider.defaulturl.task=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comAdobeCqProjectsImplServletProjectImageServlet)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"image.quality=:[QUERY] "
"image.supported.resolutions=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comAdobeCqProjectsPurgeScheduler)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"scheduledpurge.name=:[QUERY] "
"scheduledpurge.purgeActive=true:[QUERY] "
          "scheduledpurge.purgeActive=false:[QUERY] "
"scheduledpurge.templates=:[QUERY] "
"scheduledpurge.purgeGroups=true:[QUERY] "
          "scheduledpurge.purgeGroups=false:[QUERY] "
"scheduledpurge.purgeAssets=true:[QUERY] "
          "scheduledpurge.purgeAssets=false:[QUERY] "
"scheduledpurge.terminateRunningWorkflows=true:[QUERY] "
          "scheduledpurge.terminateRunningWorkflows=false:[QUERY] "
"scheduledpurge.daysold=:[QUERY] "
"scheduledpurge.saveThreshold=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comAdobeCqScheduledExporterImplScheduledExporterImpl)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"include.paths=:[QUERY] "
"exporter.user=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comAdobeCqScreensAnalyticsImplScreensAnalyticsServiceImpl)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"com.adobe.cq.screens.analytics.impl.url=:[QUERY] "
"com.adobe.cq.screens.analytics.impl.apikey=:[QUERY] "
"com.adobe.cq.screens.analytics.impl.project=:[QUERY] "
"com.adobe.cq.screens.analytics.impl.environment=:[QUERY] "
"com.adobe.cq.screens.analytics.impl.sendFrequency=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comAdobeCqScreensDeviceImplDeviceService)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"com.adobe.aem.screens.player.pingfrequency=:[QUERY] "
"com.adobe.aem.screens.device.pasword.specialchars=:[QUERY] "
"com.adobe.aem.screens.device.pasword.minlowercasechars=:[QUERY] "
"com.adobe.aem.screens.device.pasword.minuppercasechars=:[QUERY] "
"com.adobe.aem.screens.device.pasword.minnumberchars=:[QUERY] "
"com.adobe.aem.screens.device.pasword.minspecialchars=:[QUERY] "
"com.adobe.aem.screens.device.pasword.minlength=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comAdobeCqScreensDeviceRegistrationImplRegistrationServiceImpl)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"deviceRegistrationTimeout=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comAdobeCqScreensImplHandlerChannelsUpdateHandler)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"cq.pagesupdatehandler.imageresourcetypes=:[QUERY] "
"cq.pagesupdatehandler.productresourcetypes=:[QUERY] "
"cq.pagesupdatehandler.videoresourcetypes=:[QUERY] "
"cq.pagesupdatehandler.dynamicsequenceresourcetypes=:[QUERY] "
"cq.pagesupdatehandler.previewmodepaths=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comAdobeCqScreensImplJobsDistributedDevicesStatiUpdateJob)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"scheduler.expression=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comAdobeCqScreensImplRemoteImplDistributedHttpClientImpl)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"com.adobe.aem.screens.impl.remote.request_timeout=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comAdobeCqScreensImplScreensChannelPostProcessor)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"screens.channels.properties.to.remove=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comAdobeCqScreensMonitoringImplScreensMonitoringServiceImpl)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"com.adobe.cq.screens.monitoring.impl.ScreensMonitoringServiceImpl.projectPath=:[QUERY] "
"com.adobe.cq.screens.monitoring.impl.ScreensMonitoringServiceImpl.scheduleFrequency=:[QUERY] "
"com.adobe.cq.screens.monitoring.impl.ScreensMonitoringServiceImpl.pingTimeout=:[QUERY] "
"com.adobe.cq.screens.monitoring.impl.ScreensMonitoringServiceImpl.recipients=:[QUERY] "
"com.adobe.cq.screens.monitoring.impl.ScreensMonitoringServiceImpl.smtpserver=:[QUERY] "
"com.adobe.cq.screens.monitoring.impl.ScreensMonitoringServiceImpl.smtpport=:[QUERY] "
"com.adobe.cq.screens.monitoring.impl.ScreensMonitoringServiceImpl.usetls=true:[QUERY] "
          "com.adobe.cq.screens.monitoring.impl.ScreensMonitoringServiceImpl.usetls=false:[QUERY] "
"com.adobe.cq.screens.monitoring.impl.ScreensMonitoringServiceImpl.username=:[QUERY] "
"com.adobe.cq.screens.monitoring.impl.ScreensMonitoringServiceImpl.password=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comAdobeCqScreensMqActivemqImplArtemisJMSProvider)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"service.ranking=:[QUERY] "
"global.size=:[QUERY] "
"max.disk.usage=:[QUERY] "
"persistence.enabled=true:[QUERY] "
          "persistence.enabled=false:[QUERY] "
"thread.pool.max.size=:[QUERY] "
"scheduled.thread.pool.max.size=:[QUERY] "
"graceful.shutdown.timeout=:[QUERY] "
"queues=:[QUERY] "
"topics=:[QUERY] "
"addresses.max.delivery.attempts=:[QUERY] "
"addresses.expiry.delay=:[QUERY] "
"addresses.address.full.message.policy=:[QUERY] "
"addresses.max.size.bytes=:[QUERY] "
"addresses.page.size.bytes=:[QUERY] "
"addresses.page.cache.max.size=:[QUERY] "
"cluster.user=:[QUERY] "
"cluster.password=:[QUERY] "
"cluster.call.timeout=:[QUERY] "
"cluster.call.failover.timeout=:[QUERY] "
"cluster.client.failure.check.period=:[QUERY] "
"cluster.notification.attempts=:[QUERY] "
"cluster.notification.interval=:[QUERY] "
"id.cache.size=:[QUERY] "
"cluster.confirmation.window.size=:[QUERY] "
"cluster.connection.ttl=:[QUERY] "
"cluster.duplicate.detection=true:[QUERY] "
          "cluster.duplicate.detection=false:[QUERY] "
"cluster.initial.connect.attempts=:[QUERY] "
"cluster.max.retry.interval=:[QUERY] "
"cluster.min.large.message.size=:[QUERY] "
"cluster.producer.window.size=:[QUERY] "
"cluster.reconnect.attempts=:[QUERY] "
"cluster.retry.interval=:[QUERY] "
"cluster.retry.interval.multiplier=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImpl)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"com.adobe.cq.screens.offlinecontent.impl.BulkOfflineUpdateServiceImpl.projectPath=:[QUERY] "
"com.adobe.cq.screens.offlinecontent.impl.BulkOfflineUpdateServiceImpl.scheduleFrequency=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comAdobeCqScreensOfflinecontentImplOfflineContentServiceImpl)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"disableSmartSync=true:[QUERY] "
          "disableSmartSync=false:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comAdobeCqScreensSegmentationImplSegmentationFeatureFlag)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"enableDataTriggeredContent=true:[QUERY] "
          "enableDataTriggeredContent=false:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comAdobeCqSecurityHcBundlesImplHtmlLibraryManagerConfigHealthCh)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"hc.tags=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comAdobeCqSecurityHcBundlesImplWcmFilterHealthCheck)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"hc.tags=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comAdobeCqSecurityHcDispatcherImplDispatcherAccessHealthCheck)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"hc.tags=:[QUERY] "
"dispatcher.address=:[QUERY] "
"dispatcher.filter.allowed=:[QUERY] "
"dispatcher.filter.blocked=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comAdobeCqSecurityHcPackagesImplExampleContentHealthCheck)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"hc.tags=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comAdobeCqSecurityHcWebserverImplClickjackingHealthCheck)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"hc.tags=:[QUERY] "
"webserver.address=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comAdobeCqSocialAccountverificationImplAccountManagementConfigIm)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"enable=true:[QUERY] "
          "enable=false:[QUERY] "
"ttl1=:[QUERY] "
"ttl2=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comAdobeCqSocialActivitystreamsClientImplSocialActivityComponen)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"priority=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comAdobeCqSocialActivitystreamsClientImplSocialActivityStreamCo)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"priority=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comAdobeCqSocialActivitystreamsListenerImplEventListenerHandler)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"event.topics=:[QUERY] "
"event.filter=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comAdobeCqSocialActivitystreamsListenerImplModerationEventExten)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"accepted=true:[QUERY] "
          "accepted=false:[QUERY] "
"ranked=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comAdobeCqSocialActivitystreamsListenerImplRatingEventActivityS)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"ranking=:[QUERY] "
"enable=true:[QUERY] "
          "enable=false:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comAdobeCqSocialActivitystreamsListenerImplResourceActivityStre)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"streamPath=:[QUERY] "
"streamName=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comAdobeCqSocialCalendarClientEndpointsImplCalendarOperationsI)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"MaxRetry=:[QUERY] "
"fieldWhitelist=:[QUERY] "
"attachmentTypeBlacklist=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comAdobeCqSocialCalendarClientOperationextensionsEventAttachmen)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"attachmentTypeBlacklist=:[QUERY] "
"extension.order=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comAdobeCqSocialCalendarServletsTimeZoneServlet)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"timezones.expirytime=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comAdobeCqSocialCommonsCommentsEndpointsImplCommentDeleteEvent)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"ranking=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comAdobeCqSocialCommonsCommentsEndpointsImplCommentOperationSe)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"fieldWhitelist=:[QUERY] "
"attachmentTypeBlacklist=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comAdobeCqSocialCommonsCommentsEndpointsImplTranslationOperati)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"fieldWhitelist=:[QUERY] "
"attachmentTypeBlacklist=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comAdobeCqSocialCommonsCommentsListingImplSearchCommentSocialC)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"numUserLimit=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comAdobeCqSocialCommonsCommentsSchedulerImplSearchScheduledPos)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"enableScheduledPostsSearch=true:[QUERY] "
          "enableScheduledPostsSearch=false:[QUERY] "
"numberOfMinutes=:[QUERY] "
"maxSearchLimit=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comAdobeCqSocialCommonsCorsCORSAuthenticationFilter)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"cors.enabling=true:[QUERY] "
          "cors.enabling=false:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comAdobeCqSocialCommonsEmailreplyImplAndroidEmailClientProvider)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"priorityOrder=:[QUERY] "
"replyEmailPatterns=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comAdobeCqSocialCommonsEmailreplyImplCommentEmailBuilderImpl)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"context.path=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comAdobeCqSocialCommonsEmailreplyImplCommentEmailEventListener)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"event.topics=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comAdobeCqSocialCommonsEmailreplyImplCustomEmailClientProvider)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"priorityOrder=:[QUERY] "
"replyEmailPatterns=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comAdobeCqSocialCommonsEmailreplyImplEmailQuotedTextPatternsImp)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"pattern.time=:[QUERY] "
"pattern.newline=:[QUERY] "
"pattern.dayOfMonth=:[QUERY] "
"pattern.month=:[QUERY] "
"pattern.year=:[QUERY] "
"pattern.date=:[QUERY] "
"pattern.dateTime=:[QUERY] "
"pattern.email=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImp)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"email.name=:[QUERY] "
"email.createPostFromReply=true:[QUERY] "
          "email.createPostFromReply=false:[QUERY] "
"email.addCommentIdTo=:[QUERY] "
"email.subjectMaximumLength=:[QUERY] "
"email.replyToAddress=:[QUERY] "
"email.replyToDelimiter=:[QUERY] "
"email.trackerIdPrefixInSubject=:[QUERY] "
"email.trackerIdPrefixInBody=:[QUERY] "
"email.asHTML=true:[QUERY] "
          "email.asHTML=false:[QUERY] "
"email.defaultUserName=:[QUERY] "
"email.templates.rootPath=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comAdobeCqSocialCommonsEmailreplyImplEmailReplyImporter)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"connectProtocol=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comAdobeCqSocialCommonsEmailreplyImplGmailEmailClientProvider)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"priorityOrder=:[QUERY] "
"replyEmailPatterns=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comAdobeCqSocialCommonsEmailreplyImplIOSEmailClientProvider)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"priorityOrder=:[QUERY] "
"replyEmailPatterns=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comAdobeCqSocialCommonsEmailreplyImplMacmailEmailClientProvider)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"priorityOrder=:[QUERY] "
"replyEmailPatterns=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comAdobeCqSocialCommonsEmailreplyImplOutLookEmailClientProvider)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"priorityOrder=:[QUERY] "
"replyEmailPatterns=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comAdobeCqSocialCommonsEmailreplyImplUnknownEmailClientProvider)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"replyEmailPatterns=:[QUERY] "
"priorityOrder=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comAdobeCqSocialCommonsEmailreplyImplYahooEmailClientProvider)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"priorityOrder=:[QUERY] "
"replyEmailPatterns=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comAdobeCqSocialCommonsMaintainanceImplDeleteTempUGCImageUpload)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"numberOfDays=:[QUERY] "
"ageOfFile=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comAdobeCqSocialCommonsUgclimiterImplUGCLimiterServiceImpl)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"event.topics=:[QUERY] "
"event.filter=:[QUERY] "
"verbs=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comAdobeCqSocialCommonsUgclimitsconfigImplCommunityUserUGCLimit)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"enable=true:[QUERY] "
          "enable=false:[QUERY] "
"UGCLimit=:[QUERY] "
"ugcLimitDuration=:[QUERY] "
"domains=:[QUERY] "
"toList=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comAdobeCqSocialConnectOauthImplFacebookProviderImpl)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"oauth.provider.id=:[QUERY] "
"oauth.cloud.config.root=:[QUERY] "
"provider.config.root=:[QUERY] "
"provider.config.create.tags.enabled=true:[QUERY] "
          "provider.config.create.tags.enabled=false:[QUERY] "
"provider.config.user.folder=:[QUERY] "
"provider.config.facebook.fetch.fields=true:[QUERY] "
          "provider.config.facebook.fetch.fields=false:[QUERY] "
"provider.config.facebook.fields=:[QUERY] "
"provider.config.refresh.userdata.enabled=true:[QUERY] "
          "provider.config.refresh.userdata.enabled=false:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comAdobeCqSocialConnectOauthImplSocialOAuthAuthenticationHandle)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"path=:[QUERY] "
"service.ranking=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comAdobeCqSocialConnectOauthImplSocialOAuthUserProfileMapper)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"facebook=:[QUERY] "
"twitter=:[QUERY] "
"provider.config.user.folder=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comAdobeCqSocialConnectOauthImplTwitterProviderImpl)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"oauth.provider.id=:[QUERY] "
"oauth.cloud.config.root=:[QUERY] "
"provider.config.root=:[QUERY] "
"provider.config.user.folder=:[QUERY] "
"provider.config.twitter.enable.params=true:[QUERY] "
          "provider.config.twitter.enable.params=false:[QUERY] "
"provider.config.twitter.params=:[QUERY] "
"provider.config.refresh.userdata.enabled=true:[QUERY] "
          "provider.config.refresh.userdata.enabled=false:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comAdobeCqSocialContentFragmentsServicesImplCommunitiesFragmen)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"cq.social.content.fragments.services.enabled=true:[QUERY] "
          "cq.social.content.fragments.services.enabled=false:[QUERY] "
"cq.social.content.fragments.services.waitTimeSeconds=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comAdobeCqSocialDatastoreAsImplASResourceProviderFactory)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"version.id=:[QUERY] "
"cache.on=true:[QUERY] "
          "cache.on=false:[QUERY] "
"concurrency.level=:[QUERY] "
"cache.start.size=:[QUERY] "
"cache.ttl=:[QUERY] "
"cache.size=:[QUERY] "
"time.limit=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comAdobeCqSocialDatastoreOpImplSocialMSResourceProviderFactory)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"solr.zk.timeout=:[QUERY] "
"solr.commit=:[QUERY] "
"cache.on=true:[QUERY] "
          "cache.on=false:[QUERY] "
"concurrency.level=:[QUERY] "
"cache.start.size=:[QUERY] "
"cache.ttl=:[QUERY] "
"cache.size=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comAdobeCqSocialDatastoreRdbImplSocialRDBResourceProviderFactor)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"solr.zk.timeout=:[QUERY] "
"solr.commit=:[QUERY] "
"cache.on=true:[QUERY] "
          "cache.on=false:[QUERY] "
"concurrency.level=:[QUERY] "
"cache.start.size=:[QUERY] "
"cache.ttl=:[QUERY] "
"cache.size=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comAdobeCqSocialEnablementAdaptorsEnablementLearningPathAdaptorF)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"isMemberCheck=true:[QUERY] "
          "isMemberCheck=false:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comAdobeCqSocialEnablementAdaptorsEnablementResourceAdaptorFacto)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"isMemberCheck=true:[QUERY] "
          "isMemberCheck=false:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comAdobeCqSocialEnablementLearningpathEndpointsImplEnablementL)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"fieldWhitelist=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comAdobeCqSocialEnablementResourceEndpointsImplEnablementResou)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"fieldWhitelist=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comAdobeCqSocialEnablementServicesImplAuthorMarkerImpl)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"service.ranking=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comAdobeCqSocialFilelibraryClientEndpointsFilelibraryDownloadGe)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"sling.servlet.selectors=:[QUERY] "
"sling.servlet.extensions=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comAdobeCqSocialFilelibraryClientEndpointsImplFileLibraryOpera)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"fieldWhitelist=:[QUERY] "
"attachmentTypeBlacklist=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comAdobeCqSocialForumClientEndpointsImplForumOperationsService)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"fieldWhitelist=:[QUERY] "
"attachmentTypeBlacklist=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comAdobeCqSocialForumDispatcherImplFlushOperations)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"extension.order=:[QUERY] "
"flush.forumontopic=true:[QUERY] "
          "flush.forumontopic=false:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comAdobeCqSocialGroupClientImplCommunityGroupCollectionComponen)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"group.listing.pagination.enable=true:[QUERY] "
          "group.listing.pagination.enable=false:[QUERY] "
"group.listing.lazyloading.enable=true:[QUERY] "
          "group.listing.lazyloading.enable=false:[QUERY] "
"page.size=:[QUERY] "
"priority=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comAdobeCqSocialGroupImplGroupServiceImpl)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"maxWaitTime=:[QUERY] "
"minWaitBetweenRetries=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comAdobeCqSocialHandlebarsGuavaTemplateCacheImpl)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"parameter.guava.cache.enabled=true:[QUERY] "
          "parameter.guava.cache.enabled=false:[QUERY] "
"parameter.guava.cache.params=:[QUERY] "
"parameter.guava.cache.reload=true:[QUERY] "
          "parameter.guava.cache.reload=false:[QUERY] "
"service.ranking=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comAdobeCqSocialIdeationClientEndpointsImplIdeationOperationsS)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"fieldWhitelist=:[QUERY] "
"attachmentTypeBlacklist=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comAdobeCqSocialJournalClientEndpointsImplJournalOperationsSer)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"fieldWhitelist=:[QUERY] "
"attachmentTypeBlacklist=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comAdobeCqSocialMembersEndpointsImplCommunityMemberGroupProfile)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"fieldWhitelist=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comAdobeCqSocialMembersEndpointsImplCommunityMemberUserProfileO)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"fieldWhitelist=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comAdobeCqSocialMembersImplCommunityMemberGroupProfileComponentF)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"everyoneLimit=:[QUERY] "
"priority=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comAdobeCqSocialMessagingClientEndpointsImplMessagingOperation)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"message.properties=:[QUERY] "
"messageBoxSizeLimit=:[QUERY] "
"messageCountLimit=:[QUERY] "
"notifyFailure=true:[QUERY] "
          "notifyFailure=false:[QUERY] "
"failureMessageFrom=:[QUERY] "
"failureTemplatePath=:[QUERY] "
"maxRetries=:[QUERY] "
"minWaitBetweenRetries=:[QUERY] "
"countUpdatePoolSize=:[QUERY] "
"inbox.path=:[QUERY] "
"sentitems.path=:[QUERY] "
"supportAttachments=true:[QUERY] "
          "supportAttachments=false:[QUERY] "
"supportGroupMessaging=true:[QUERY] "
          "supportGroupMessaging=false:[QUERY] "
"maxTotalRecipients=:[QUERY] "
"batchSize=:[QUERY] "
"maxTotalAttachmentSize=:[QUERY] "
"attachmentTypeBlacklist=:[QUERY] "
"allowedAttachmentTypes=:[QUERY] "
"serviceSelector=:[QUERY] "
"fieldWhitelist=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comAdobeCqSocialModerationDashboardApiFilterGroupSocialComponen)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"resourceType.filters=:[QUERY] "
"priority=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comAdobeCqSocialModerationDashboardApiModerationDashboardSocial)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"priority=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comAdobeCqSocialModerationDashboardApiUserDetailsSocialComponen)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"priority=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comAdobeCqSocialModerationDashboardInternalImplFilterGroupSoci)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"resourceType.filters=:[QUERY] "
"priority=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comAdobeCqSocialNotificationsImplMentionsRouter)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"event.topics=:[QUERY] "
"event.filter=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comAdobeCqSocialNotificationsImplNotificationManagerImpl)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"max.unread.notification.count=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comAdobeCqSocialNotificationsImplNotificationsRouter)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"event.topics=:[QUERY] "
"event.filter=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comAdobeCqSocialQnaClientEndpointsImplQnaForumOperationsServic)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"fieldWhitelist=:[QUERY] "
"attachmentTypeBlacklist=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportI)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"cq.social.reporting.analytics.polling.importer.interval=:[QUERY] "
"cq.social.reporting.analytics.polling.importer.pageSize=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportM)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"report.fetch.delay=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comAdobeCqSocialReportingAnalyticsServicesImplSiteTrendReportS)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"cq.social.console.analytics.sites.mapping=:[QUERY] "
"priority=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comAdobeCqSocialReviewClientEndpointsImplReviewOperationsServi)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"fieldWhitelist=:[QUERY] "
"attachmentTypeBlacklist=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comAdobeCqSocialScfCoreOperationsImplSocialOperationsServlet)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"sling.servlet.selectors=:[QUERY] "
"sling.servlet.extensions=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comAdobeCqSocialScfEndpointsImplDefaultSocialGetServlet)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"sling.servlet.selectors=:[QUERY] "
"sling.servlet.extensions=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comAdobeCqSocialScoringImplScoringEventListener)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"event.topics=:[QUERY] "
"event.filter=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comAdobeCqSocialServiceusersInternalImplServiceUserWrapperImpl)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"enableFallback=true:[QUERY] "
          "enableFallback=false:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comAdobeCqSocialSiteEndpointsImplSiteOperationService)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"fieldWhitelist=:[QUERY] "
"sitePathFilters=:[QUERY] "
"sitePackageGroup=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comAdobeCqSocialSiteImplAnalyticsComponentConfigurationServiceIm)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"cq.social.console.analytics.components=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comAdobeCqSocialSiteImplSiteConfiguratorImpl)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"componentsUsingTags=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comAdobeCqSocialSrpImplSocialSolrConnector)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"srp.type=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comAdobeCqSocialSyncImplDiffChangesObserver)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"enabled=true:[QUERY] "
          "enabled=false:[QUERY] "
"agentName=:[QUERY] "
"diffPath=:[QUERY] "
"propertyNames=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comAdobeCqSocialSyncImplGroupSyncListenerImpl)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"nodetypes=:[QUERY] "
"ignorableprops=:[QUERY] "
"ignorablenodes=:[QUERY] "
"enabled=true:[QUERY] "
          "enabled=false:[QUERY] "
"distfolders=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comAdobeCqSocialSyncImplPublisherSyncServiceImpl)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"activeRunModes=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comAdobeCqSocialSyncImplUserSyncListenerImpl)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"nodetypes=:[QUERY] "
"ignorableprops=:[QUERY] "
"ignorablenodes=:[QUERY] "
"enabled=true:[QUERY] "
          "enabled=false:[QUERY] "
"distfolders=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comAdobeCqSocialTranslationImplTranslationServiceConfigManager)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"translate.language=:[QUERY] "
"translate.display=:[QUERY] "
"translate.attribution=true:[QUERY] "
          "translate.attribution=false:[QUERY] "
"translate.caching=:[QUERY] "
"translate.smart.rendering=:[QUERY] "
"translate.caching.duration=:[QUERY] "
"translate.session.save.interval=:[QUERY] "
"translate.session.save.batchLimit=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comAdobeCqSocialTranslationImplUGCLanguageDetector)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"event.topics=:[QUERY] "
"event.filter=:[QUERY] "
"translate.listener.type=:[QUERY] "
"translate.property.list=:[QUERY] "
"poolSize=:[QUERY] "
"maxPoolSize=:[QUERY] "
"queueSize=:[QUERY] "
"keepAliveTime=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comAdobeCqSocialUgcbaseDispatcherImplFlushServiceImpl)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"threadPoolSize=:[QUERY] "
"delayTime=:[QUERY] "
"workerSleepTime=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comAdobeCqSocialUgcbaseImplAysncReverseReplicatorImpl)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"poolSize=:[QUERY] "
"maxPoolSize=:[QUERY] "
"queueSize=:[QUERY] "
"keepAliveTime=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comAdobeCqSocialUgcbaseImplPublisherConfigurationImpl)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"isPrimaryPublisher=true:[QUERY] "
          "isPrimaryPublisher=false:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comAdobeCqSocialUgcbaseImplSocialUtilsImpl)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"legacyCloudUGCPathMapping=true:[QUERY] "
          "legacyCloudUGCPathMapping=false:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comAdobeCqSocialUgcbaseModerationImplAutoModerationImpl)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"automoderation.sequence=:[QUERY] "
"automoderation.onfailurestop=true:[QUERY] "
          "automoderation.onfailurestop=false:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comAdobeCqSocialUgcbaseModerationImplSentimentProcess)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"watchwords.positive=:[QUERY] "
"watchwords.negative=:[QUERY] "
"watchwords.path=:[QUERY] "
"sentiment.path=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comAdobeCqSocialUgcbaseSecurityImplDefaultAttachmentTypeBlackli)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"default.attachment.type.blacklist=:[QUERY] "
"baseline.attachment.type.blacklist=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comAdobeCqSocialUgcbaseSecurityImplSaferSlingPostValidatorImpl)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"parameter.whitelist=:[QUERY] "
"parameter.whitelist.prefixes=:[QUERY] "
"binary.parameter.whitelist=:[QUERY] "
"modifier.whitelist=:[QUERY] "
"operation.whitelist=:[QUERY] "
"operation.whitelist.prefixes=:[QUERY] "
"typehint.whitelist=:[QUERY] "
"resourcetype.whitelist=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comAdobeCqSocialUserEndpointsImplUsersGroupFromPublishServlet)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"sling.servlet.extensions=:[QUERY] "
"sling.servlet.paths=:[QUERY] "
"sling.servlet.methods=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comAdobeCqSocialUserImplTransportHttpToPublisher)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"enable=true:[QUERY] "
          "enable=false:[QUERY] "
"agent.configuration=:[QUERY] "
"context.path=:[QUERY] "
"disabled.cipher.suites=:[QUERY] "
"enabled.cipher.suites=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comAdobeCqUiWcmCommonsInternalServletsRteRTEFilterServletFact)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"resource.types=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comAdobeCqUpgradesCleanupImplUpgradeContentCleanup)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"delete.path.regexps=:[QUERY] "
"delete.sql2.query=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comAdobeCqUpgradesCleanupImplUpgradeInstallFolderCleanup)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"delete.name.regexps=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comAdobeCqWcmJobsAsyncImplAsyncDeleteConfigProviderService)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"threshold=:[QUERY] "
"jobTopicName=:[QUERY] "
"emailEnabled=true:[QUERY] "
          "emailEnabled=false:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comAdobeCqWcmJobsAsyncImplAsyncJobCleanUpTask)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"scheduler.expression=:[QUERY] "
"job.purge.threshold=:[QUERY] "
"job.purge.max.jobs=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comAdobeCqWcmJobsAsyncImplAsyncMoveConfigProviderService)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"threshold=:[QUERY] "
"jobTopicName=:[QUERY] "
"emailEnabled=true:[QUERY] "
          "emailEnabled=false:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comAdobeCqWcmJobsAsyncImplAsyncPageMoveConfigProviderService)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"threshold=:[QUERY] "
"jobTopicName=:[QUERY] "
"emailEnabled=true:[QUERY] "
          "emailEnabled=false:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comAdobeCqWcmLaunchesImplLaunchesEventHandler)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"event.filter=:[QUERY] "
"launches.eventhandler.threadpool.maxsize=:[QUERY] "
"launches.eventhandler.threadpool.priority=:[QUERY] "
"launches.eventhandler.updatelastmodification=true:[QUERY] "
          "launches.eventhandler.updatelastmodification=false:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comAdobeCqWcmMobileQrcodeServletQRCodeImageGenerator)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"cq.wcm.qrcode.servlet.whitelist=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comAdobeCqWcmStyleInternalComponentStyleInfoCacheImpl)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"size=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comAdobeCqWcmTranslationImplTranslationPlatformConfigurationImpl)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"syncTranslationState.schedulingFormat=:[QUERY] "
"schedulingRepeatTranslation.schedulingFormat=:[QUERY] "
"syncTranslationState.lockTimeoutInMinutes=:[QUERY] "
"export.format=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comAdobeFdFpConfigFormsPortalDraftsandSubmissionConfigService)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"portal.outboxes=:[QUERY] "
"draft.data.service=:[QUERY] "
"draft.metadata.service=:[QUERY] "
"submit.data.service=:[QUERY] "
"submit.metadata.service=:[QUERY] "
"pendingSign.data.service=:[QUERY] "
"pendingSign.metadata.service=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comAdobeFdFpConfigFormsPortalSchedulerService)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"formportal.interval=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comAdobeFormsCommonServiceImplDefaultDataProvider)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"alloweddataFileLocations=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comAdobeFormsCommonServiceImplFormsCommonConfigurationServiceImp)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"tempStorageConfig=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comAdobeFormsCommonServletTempCleanUpTask)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"scheduler.expression=:[QUERY] "
"Duration for Temporary Storage=:[QUERY] "
"Duration for Anonymous Storage=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comAdobeGraniteAcpPlatformPlatformServlet)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"query.limit=:[QUERY] "
"file.type.extension.map=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comAdobeGraniteActivitystreamsImplActivityManagerImpl)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"aggregate.relationships=:[QUERY] "
"aggregate.descend.virtual=true:[QUERY] "
          "aggregate.descend.virtual=false:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comAdobeGraniteAnalyzerBaseSystemStatusServlet)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"disabled=true:[QUERY] "
          "disabled=false:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comAdobeGraniteAnalyzerScriptsCompileAllScriptsCompilerServlet)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"disabled=true:[QUERY] "
          "disabled=false:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comAdobeGraniteApicontrollerFilterResolverHookFactory)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"com.adobe.cq.cdn.cdn-rewriter=:[QUERY] "
"com.adobe.cq.cloud-config.components=:[QUERY] "
"com.adobe.cq.cloud-config.core=:[QUERY] "
"com.adobe.cq.cloud-config.ui=:[QUERY] "
"com.adobe.cq.com.adobe.cq.editor=:[QUERY] "
"com.adobe.cq.com.adobe.cq.projects.core=:[QUERY] "
"com.adobe.cq.com.adobe.cq.projects.wcm.core=:[QUERY] "
"com.adobe.cq.com.adobe.cq.ui.commons=:[QUERY] "
"com.adobe.cq.com.adobe.cq.wcm.style=:[QUERY] "
"com.adobe.cq.cq-activitymap-integration=:[QUERY] "
"com.adobe.cq.cq-contexthub-commons=:[QUERY] "
"com.adobe.cq.cq-dtm=:[QUERY] "
"com.adobe.cq.cq-healthcheck=:[QUERY] "
"com.adobe.cq.cq-multisite-targeting=:[QUERY] "
"com.adobe.cq.cq-pre-upgrade-cleanup=:[QUERY] "
"com.adobe.cq.cq-product-info-provider=:[QUERY] "
"com.adobe.cq.cq-rest-sites=:[QUERY] "
"com.adobe.cq.cq-security-hc=:[QUERY] "
"com.adobe.cq.dam.cq-dam-svg-handler=:[QUERY] "
"com.adobe.cq.dam.cq-scene7-imaging=:[QUERY] "
"com.adobe.cq.dtm-reactor.core=:[QUERY] "
"com.adobe.cq.dtm-reactor.ui=:[QUERY] "
"com.adobe.cq.exp-jspel-resolver=:[QUERY] "
"com.adobe.cq.inbox.cq-inbox=:[QUERY] "
"com.adobe.cq.json-schema-parser=:[QUERY] "
"com.adobe.cq.media.cq-media-publishing-dps-fp-core=:[QUERY] "
"com.adobe.cq.mobile.cq-mobile-caas=:[QUERY] "
"com.adobe.cq.mobile.cq-mobile-index-builder=:[QUERY] "
"com.adobe.cq.mobile.cq-mobile-phonegap-build=:[QUERY] "
"com.adobe.cq.myspell=:[QUERY] "
"com.adobe.cq.sample.we.retail.core=:[QUERY] "
"com.adobe.cq.screens.com.adobe.cq.screens.dcc=:[QUERY] "
"com.adobe.cq.screens.com.adobe.cq.screens.mq.core=:[QUERY] "
"com.adobe.cq.social.cq-social-as-provider=:[QUERY] "
"com.adobe.cq.social.cq-social-badging-basic-impl=:[QUERY] "
"com.adobe.cq.social.cq-social-badging-impl=:[QUERY] "
"com.adobe.cq.social.cq-social-calendar-impl=:[QUERY] "
"com.adobe.cq.social.cq-social-content-fragments-impl=:[QUERY] "
"com.adobe.cq.social.cq-social-enablement-impl=:[QUERY] "
"com.adobe.cq.social.cq-social-graph-impl=:[QUERY] "
"com.adobe.cq.social.cq-social-ideation-impl=:[QUERY] "
"com.adobe.cq.social.cq-social-jcr-provider=:[QUERY] "
"com.adobe.cq.social.cq-social-members-impl=:[QUERY] "
"com.adobe.cq.social.cq-social-ms-provider=:[QUERY] "
"com.adobe.cq.social.cq-social-notifications-channels-web=:[QUERY] "
"com.adobe.cq.social.cq-social-notifications-impl=:[QUERY] "
"com.adobe.cq.social.cq-social-rdb-provider=:[QUERY] "
"com.adobe.cq.social.cq-social-scf-impl=:[QUERY] "
"com.adobe.cq.social.cq-social-scoring-basic-impl=:[QUERY] "
"com.adobe.cq.social.cq-social-scoring-impl=:[QUERY] "
"com.adobe.cq.social.cq-social-serviceusers-impl=:[QUERY] "
"com.adobe.cq.social.cq-social-srp-impl=:[QUERY] "
"com.adobe.cq.social.cq-social-ugcbase-impl=:[QUERY] "
"com.adobe.dam.cq-dam-cfm-impl=:[QUERY] "
"com.adobe.forms.foundation-forms-foundation-base=:[QUERY] "
"com.adobe.granite.apicontroller=:[QUERY] "
"com.adobe.granite.asset.core=:[QUERY] "
"com.adobe.granite.auth.sso=:[QUERY] "
"com.adobe.granite.bundles.hc.impl=:[QUERY] "
"com.adobe.granite.compat-router=:[QUERY] "
"com.adobe.granite.conf=:[QUERY] "
"com.adobe.granite.conf.ui.core=:[QUERY] "
"com.adobe.granite.cors=:[QUERY] "
"com.adobe.granite.crx-explorer=:[QUERY] "
"com.adobe.granite.crxde-lite=:[QUERY] "
"com.adobe.granite.crypto.config=:[QUERY] "
"com.adobe.granite.crypto.extension=:[QUERY] "
"com.adobe.granite.crypto.file=:[QUERY] "
"com.adobe.granite.crypto.jcr=:[QUERY] "
"com.adobe.granite.csrf=:[QUERY] "
"com.adobe.granite.distribution.core=:[QUERY] "
"com.adobe.granite.dropwizard.metrics=:[QUERY] "
"com.adobe.granite.frags.impl=:[QUERY] "
"com.adobe.granite.gibson=:[QUERY] "
"com.adobe.granite.infocollector=:[QUERY] "
"com.adobe.granite.installer.factory.packages=:[QUERY] "
"com.adobe.granite.jetty.ssl=:[QUERY] "
"com.adobe.granite.jobs.async=:[QUERY] "
"com.adobe.granite.maintenance.oak=:[QUERY] "
"com.adobe.granite.monitoring.core=:[QUERY] "
"com.adobe.granite.queries=:[QUERY] "
"com.adobe.granite.replication.hc.impl=:[QUERY] "
"com.adobe.granite.repository.checker=:[QUERY] "
"com.adobe.granite.repository.hc.impl=:[QUERY] "
"com.adobe.granite.rest.assets=:[QUERY] "
"com.adobe.granite.security.ui=:[QUERY] "
"com.adobe.granite.startup=:[QUERY] "
"com.adobe.granite.tagsoup=:[QUERY] "
"com.adobe.granite.taskmanagement.core=:[QUERY] "
"com.adobe.granite.taskmanagement.workflow=:[QUERY] "
"com.adobe.granite.ui.clientlibs.compiler.less=:[QUERY] "
"com.adobe.granite.ui.clientlibs.processor.gcc=:[QUERY] "
"com.adobe.granite.webconsole.plugins=:[QUERY] "
"com.adobe.granite.workflow.console=:[QUERY] "
"com.adobe.xmp.worker.files.native.fragment.linux=:[QUERY] "
"com.adobe.xmp.worker.files.native.fragment.macosx=:[QUERY] "
"com.adobe.xmp.worker.files.native.fragment.win=:[QUERY] "
"com.day.commons.osgi.wrapper.simple-jndi=:[QUERY] "
"com.day.cq.cq-authhandler=:[QUERY] "
"com.day.cq.cq-compat-configupdate=:[QUERY] "
"com.day.cq.cq-licensebranding=:[QUERY] "
"com.day.cq.cq-notifcation-impl=:[QUERY] "
"com.day.cq.cq-replication-audit=:[QUERY] "
"com.day.cq.cq-search-ext=:[QUERY] "
"com.day.cq.dam.cq-dam-annotation-print=:[QUERY] "
"com.day.cq.dam.cq-dam-asset-usage=:[QUERY] "
"com.day.cq.dam.cq-dam-s7dam=:[QUERY] "
"com.day.cq.dam.cq-dam-similaritysearch=:[QUERY] "
"com.day.cq.dam.dam-webdav-support=:[QUERY] "
"com.day.cq.pre-upgrade-tasks=:[QUERY] "
"com.day.cq.replication.extensions=:[QUERY] "
"com.day.cq.wcm.cq-msm-core=:[QUERY] "
"com.day.cq.wcm.cq-wcm-translation=:[QUERY] "
"day-commons-jrawio=:[QUERY] "
"org.apache.aries.jmx.whiteboard=:[QUERY] "
"org.apache.felix.http.sslfilter=:[QUERY] "
"org.apache.felix.org.apache.felix.threaddump=:[QUERY] "
"org.apache.felix.webconsole.plugins.ds=:[QUERY] "
"org.apache.felix.webconsole.plugins.event=:[QUERY] "
"org.apache.felix.webconsole.plugins.memoryusage=:[QUERY] "
"org.apache.felix.webconsole.plugins.packageadmin=:[QUERY] "
"org.apache.jackrabbit.oak-auth-ldap=:[QUERY] "
"org.apache.jackrabbit.oak-segment-tar=:[QUERY] "
"org.apache.jackrabbit.oak-solr-osgi=:[QUERY] "
"org.apache.sling.bundleresource.impl=:[QUERY] "
"org.apache.sling.commons.fsclassloader=:[QUERY] "
"org.apache.sling.commons.log.webconsole=:[QUERY] "
"org.apache.sling.datasource=:[QUERY] "
"org.apache.sling.discovery.base=:[QUERY] "
"org.apache.sling.discovery.oak=:[QUERY] "
"org.apache.sling.discovery.support=:[QUERY] "
"org.apache.sling.distribution.api=:[QUERY] "
"org.apache.sling.distribution.core=:[QUERY] "
"org.apache.sling.extensions.webconsolesecurityprovider=:[QUERY] "
"org.apache.sling.hc.webconsole=:[QUERY] "
"org.apache.sling.installer.console=:[QUERY] "
"org.apache.sling.installer.provider.file=:[QUERY] "
"org.apache.sling.installer.provider.jcr=:[QUERY] "
"org.apache.sling.jcr.davex=:[QUERY] "
"org.apache.sling.jcr.resourcesecurity=:[QUERY] "
"org.apache.sling.jmx.provider=:[QUERY] "
"org.apache.sling.launchpad.installer=:[QUERY] "
"org.apache.sling.models.impl=:[QUERY] "
"org.apache.sling.repoinit.parser=:[QUERY] "
"org.apache.sling.resource.inventory=:[QUERY] "
"org.apache.sling.resourceresolver=:[QUERY] "
"org.apache.sling.scripting.javascript=:[QUERY] "
"org.apache.sling.scripting.jst=:[QUERY] "
"org.apache.sling.scripting.sightly.js.provider=:[QUERY] "
"org.apache.sling.scripting.sightly.models.provider=:[QUERY] "
"org.apache.sling.security=:[QUERY] "
"org.apache.sling.servlets.compat=:[QUERY] "
"org.apache.sling.servlets.get=:[QUERY] "
"org.apache.sling.startupfilter.disabler=:[QUERY] "
"org.apache.sling.tracer=:[QUERY] "
"we.retail.client.app.core=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comAdobeGraniteAuthCertImplClientCertAuthHandler)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"path=:[QUERY] "
"service.ranking=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comAdobeGraniteAuthIms)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"configid=:[QUERY] "
"scope=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comAdobeGraniteAuthImsImplExternalUserIdMappingProviderExtension)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"oauth.provider.id=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comAdobeGraniteAuthImsImplIMSAccessTokenRequestCustomizerImpl)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"auth.ims.client.secret=:[QUERY] "
"customizer.type=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comAdobeGraniteAuthImsImplIMSInstanceCredentialsValidator)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"oauth.provider.id=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comAdobeGraniteAuthImsImplIMSProviderImpl)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"oauth.provider.id=:[QUERY] "
"oauth.provider.ims.authorization.url=:[QUERY] "
"oauth.provider.ims.token.url=:[QUERY] "
"oauth.provider.ims.profile.url=:[QUERY] "
"oauth.provider.ims.extended.details.urls=:[QUERY] "
"oauth.provider.ims.validate.token.url=:[QUERY] "
"oauth.provider.ims.session.property=:[QUERY] "
"oauth.provider.ims.service.token.client.id=:[QUERY] "
"oauth.provider.ims.service.token.client.secret=:[QUERY] "
"oauth.provider.ims.service.token=:[QUERY] "
"ims.org.ref=:[QUERY] "
"ims.group.mapping=:[QUERY] "
"oauth.provider.ims.only.license.group=true:[QUERY] "
          "oauth.provider.ims.only.license.group=false:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comAdobeGraniteAuthImsImplImsConfigProviderImpl)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"oauth.configmanager.ims.configid=:[QUERY] "
"ims.owningEntity=:[QUERY] "
"aem.instanceId=:[QUERY] "
"ims.serviceCode=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comAdobeGraniteAuthOauthAccesstokenProvider)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"name=:[QUERY] "
"auth.token.provider.title=:[QUERY] "
"auth.token.provider.default.claims=:[QUERY] "
"auth.token.provider.endpoint=:[QUERY] "
"auth.access.token.request=:[QUERY] "
"auth.token.provider.keypair.alias=:[QUERY] "
"auth.token.provider.conn.timeout=:[QUERY] "
"auth.token.provider.so.timeout=:[QUERY] "
"auth.token.provider.client.id=:[QUERY] "
"auth.token.provider.scope=:[QUERY] "
"auth.token.provider.reuse.access.token=true:[QUERY] "
          "auth.token.provider.reuse.access.token=false:[QUERY] "
"auth.token.provider.relaxed.ssl=true:[QUERY] "
          "auth.token.provider.relaxed.ssl=false:[QUERY] "
"token.request.customizer.type=:[QUERY] "
"auth.token.validator.type=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comAdobeGraniteAuthOauthImplBearerAuthenticationHandler)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"path=:[QUERY] "
"oauth.clientIds.allowed=:[QUERY] "
"auth.bearer.sync.ims=true:[QUERY] "
          "auth.bearer.sync.ims=false:[QUERY] "
"auth.tokenRequestParameter=:[QUERY] "
"oauth.bearer.configid=:[QUERY] "
"oauth.jwt.support=true:[QUERY] "
          "oauth.jwt.support=false:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comAdobeGraniteAuthOauthImplDefaultTokenValidatorImpl)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"auth.token.validator.type=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comAdobeGraniteAuthOauthImplFacebookProviderImpl)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"oauth.provider.id=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comAdobeGraniteAuthOauthImplGithubProviderImpl)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"oauth.provider.id=:[QUERY] "
"oauth.provider.github.authorization.url=:[QUERY] "
"oauth.provider.github.token.url=:[QUERY] "
"oauth.provider.github.profile.url=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comAdobeGraniteAuthOauthImplGraniteProvider)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"oauth.provider.id=:[QUERY] "
"oauth.provider.granite.authorization.url=:[QUERY] "
"oauth.provider.granite.token.url=:[QUERY] "
"oauth.provider.granite.profile.url=:[QUERY] "
"oauth.provider.granite.extended.details.urls=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comAdobeGraniteAuthOauthImplHelperProviderConfigManager)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"oauth.cookie.login.timeout=:[QUERY] "
"oauth.cookie.max.age=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comAdobeGraniteAuthOauthImplHelperProviderConfigManagerInternal)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"oauth.cookie.login.timeout=:[QUERY] "
"oauth.cookie.max.age=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comAdobeGraniteAuthOauthImplOAuthAuthenticationHandler)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"path=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comAdobeGraniteAuthOauthImplTwitterProviderImpl)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"oauth.provider.id=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comAdobeGraniteAuthOauthProvider)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"oauth.config.id=:[QUERY] "
"oauth.client.id=:[QUERY] "
"oauth.client.secret=:[QUERY] "
"oauth.scope=:[QUERY] "
"oauth.config.provider.id=:[QUERY] "
"oauth.create.users=true:[QUERY] "
          "oauth.create.users=false:[QUERY] "
"oauth.userid.property=:[QUERY] "
"force.strict.username.matching=true:[QUERY] "
          "force.strict.username.matching=false:[QUERY] "
"oauth.encode.userids=true:[QUERY] "
          "oauth.encode.userids=false:[QUERY] "
"oauth.hash.userids=true:[QUERY] "
          "oauth.hash.userids=false:[QUERY] "
"oauth.callBackUrl=:[QUERY] "
"oauth.access.token.persist=true:[QUERY] "
          "oauth.access.token.persist=false:[QUERY] "
"oauth.access.token.persist.cookie=true:[QUERY] "
          "oauth.access.token.persist.cookie=false:[QUERY] "
"oauth.csrf.state.protection=true:[QUERY] "
          "oauth.csrf.state.protection=false:[QUERY] "
"oauth.redirect.request.params=true:[QUERY] "
          "oauth.redirect.request.params=false:[QUERY] "
"oauth.config.siblings.allow=true:[QUERY] "
          "oauth.config.siblings.allow=false:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comAdobeGraniteAuthRequirementImplDefaultRequirementHandler)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"supportedPaths=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comAdobeGraniteAuthSamlSamlAuthenticationHandler)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"path=:[QUERY] "
"service.ranking=:[QUERY] "
"idpUrl=:[QUERY] "
"idpCertAlias=:[QUERY] "
"idpHttpRedirect=true:[QUERY] "
          "idpHttpRedirect=false:[QUERY] "
"serviceProviderEntityId=:[QUERY] "
"assertionConsumerServiceURL=:[QUERY] "
"spPrivateKeyAlias=:[QUERY] "
"keyStorePassword=:[QUERY] "
"defaultRedirectUrl=:[QUERY] "
"userIDAttribute=:[QUERY] "
"useEncryption=true:[QUERY] "
          "useEncryption=false:[QUERY] "
"createUser=true:[QUERY] "
          "createUser=false:[QUERY] "
"userIntermediatePath=:[QUERY] "
"addGroupMemberships=true:[QUERY] "
          "addGroupMemberships=false:[QUERY] "
"groupMembershipAttribute=:[QUERY] "
"defaultGroups=:[QUERY] "
"nameIdFormat=:[QUERY] "
"synchronizeAttributes=:[QUERY] "
"handleLogout=true:[QUERY] "
          "handleLogout=false:[QUERY] "
"logoutUrl=:[QUERY] "
"clockTolerance=:[QUERY] "
"digestMethod=:[QUERY] "
"signatureMethod=:[QUERY] "
"identitySyncType=:[QUERY] "
"idpIdentifier=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comAdobeGraniteAuthSsoImplSsoAuthenticationHandler)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"path=:[QUERY] "
"service.ranking=:[QUERY] "
"jaas.controlFlag=:[QUERY] "
"jaas.realmName=:[QUERY] "
"jaas.ranking=:[QUERY] "
"headers=:[QUERY] "
"cookies=:[QUERY] "
"parameters=:[QUERY] "
"usermap=:[QUERY] "
"format=:[QUERY] "
"trustedCredentialsAttribute=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comAdobeGraniteBundlesHcImplCodeCacheHealthCheck)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"hc.tags=:[QUERY] "
"minimum.code.cache.size=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comAdobeGraniteBundlesHcImplCrxdeSupportBundleHealthCheck)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"hc.tags=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comAdobeGraniteBundlesHcImplDavExBundleHealthCheck)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"hc.tags=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comAdobeGraniteBundlesHcImplInactiveBundlesHealthCheck)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"hc.tags=:[QUERY] "
"ignored.bundles=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comAdobeGraniteBundlesHcImplJobsHealthCheck)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"hc.tags=:[QUERY] "
"max.queued.jobs=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comAdobeGraniteBundlesHcImplSlingGetServletHealthCheck)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"hc.tags=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comAdobeGraniteBundlesHcImplSlingJavaScriptHandlerHealthCheck)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"hc.tags=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comAdobeGraniteBundlesHcImplSlingJspScriptHandlerHealthCheck)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"hc.tags=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comAdobeGraniteBundlesHcImplSlingReferrerFilterHealthCheck)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"hc.tags=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comAdobeGraniteBundlesHcImplWebDavBundleHealthCheck)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"hc.tags=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comAdobeGraniteCommentsInternalCommentReplicationContentFilterFac)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"replicate.comment.resourceTypes=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comAdobeGraniteCompatrouterImplCompatSwitchingServiceImpl)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"compatgroups=:[QUERY] "
"enabled=true:[QUERY] "
          "enabled=false:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comAdobeGraniteCompatrouterImplRoutingConfig)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"id=:[QUERY] "
"compatPath=:[QUERY] "
"newPath=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comAdobeGraniteCompatrouterImplSwitchMappingConfig)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"group=:[QUERY] "
"ids=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comAdobeGraniteConfImplRuntimeAwareConfigurationResourceResolving)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"enabled=true:[QUERY] "
          "enabled=false:[QUERY] "
"fallbackPaths=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comAdobeGraniteContexthubImplContextHubImpl)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"com.adobe.granite.contexthub.silent_mode=true:[QUERY] "
          "com.adobe.granite.contexthub.silent_mode=false:[QUERY] "
"com.adobe.granite.contexthub.show_ui=true:[QUERY] "
          "com.adobe.granite.contexthub.show_ui=false:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comAdobeGraniteCorsImplCORSPolicyImpl)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"alloworigin=:[QUERY] "
"alloworiginregexp=:[QUERY] "
"allowedpaths=:[QUERY] "
"exposedheaders=:[QUERY] "
"maxage=:[QUERY] "
"supportedheaders=:[QUERY] "
"supportedmethods=:[QUERY] "
"supportscredentials=true:[QUERY] "
          "supportscredentials=false:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comAdobeGraniteCsrfImplCSRFFilter)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"filter.methods=:[QUERY] "
"filter.enable.safe.user.agents=true:[QUERY] "
          "filter.enable.safe.user.agents=false:[QUERY] "
"filter.safe.user.agents=:[QUERY] "
"filter.excluded.paths=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comAdobeGraniteCsrfImplCSRFServlet)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"csrf.token.expires.in=:[QUERY] "
"sling.auth.requirements=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comAdobeGraniteDistributionCoreImplCryptoDistributionTransportSe)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"name=:[QUERY] "
"username=:[QUERY] "
"encryptedPassword=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comAdobeGraniteDistributionCoreImplDiffDiffChangesObserver)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"enabled=true:[QUERY] "
          "enabled=false:[QUERY] "
"agentName=:[QUERY] "
"diffPath=:[QUERY] "
"observedPath=:[QUERY] "
"serviceName=:[QUERY] "
"propertyNames=:[QUERY] "
"distributionDelay=:[QUERY] "
"serviceUser.target=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comAdobeGraniteDistributionCoreImplDiffDiffEventListener)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"diffPath=:[QUERY] "
"serviceName=:[QUERY] "
"serviceUser.target=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comAdobeGraniteDistributionCoreImplDistributionToReplicationEven)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"importer.name=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comAdobeGraniteDistributionCoreImplReplicationAdaptersReplicat)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"providerName=:[QUERY] "
"forward.requests=true:[QUERY] "
          "forward.requests=false:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comAdobeGraniteDistributionCoreImplReplicationDistributionTrans)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"forward.requests=true:[QUERY] "
          "forward.requests=false:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comAdobeGraniteDistributionCoreImplTransportAccessTokenDistribu)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"name=:[QUERY] "
"serviceName=:[QUERY] "
"userId=:[QUERY] "
"accessTokenProvider.target=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comAdobeGraniteFragsImplCheckHttpHeaderFlag)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"feature.name=:[QUERY] "
"feature.description=:[QUERY] "
"http.header.name=:[QUERY] "
"http.header.valuepattern=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comAdobeGraniteFragsImplRandomFeature)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"feature.name=:[QUERY] "
"feature.description=:[QUERY] "
"active.percentage=:[QUERY] "
"cookie.name=:[QUERY] "
"cookie.maxAge=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comAdobeGraniteHttpcacheFileFileCacheStore)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"com.adobe.granite.httpcache.file.documentRoot=:[QUERY] "
"com.adobe.granite.httpcache.file.includeHost=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comAdobeGraniteHttpcacheImplOuterCacheFilter)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"com.adobe.granite.httpcache.url.paths=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comAdobeGraniteI18nImplBundlePseudoTranslations)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"pseudo.patterns=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comAdobeGraniteI18nImplPreferencesLocaleResolverService)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"security.preferences.name=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comAdobeGraniteInfocollectorInfoCollector)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"granite.infocollector.includeThreadDumps=true:[QUERY] "
          "granite.infocollector.includeThreadDumps=false:[QUERY] "
"granite.infocollector.includeHeapDump=true:[QUERY] "
          "granite.infocollector.includeHeapDump=false:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comAdobeGraniteJettySslInternalGraniteSslConnectorFactory)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"com.adobe.granite.jetty.ssl.port=:[QUERY] "
"com.adobe.granite.jetty.ssl.keystore.user=:[QUERY] "
"com.adobe.granite.jetty.ssl.keystore.password=:[QUERY] "
"com.adobe.granite.jetty.ssl.ciphersuites.excluded=:[QUERY] "
"com.adobe.granite.jetty.ssl.ciphersuites.included=:[QUERY] "
"com.adobe.granite.jetty.ssl.client.certificate=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comAdobeGraniteLicenseImplLicenseCheckFilter)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"checkInternval=:[QUERY] "
"excludeIds=:[QUERY] "
"encryptPing=true:[QUERY] "
          "encryptPing=false:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comAdobeGraniteLoggingImplLogAnalyserImpl)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"messages.queue.size=:[QUERY] "
"logger.config=:[QUERY] "
"messages.size=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comAdobeGraniteLoggingImplLogErrorHealthCheck)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"hc.tags=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comAdobeGraniteMaintenanceCrxImplDataStoreGarbageCollectionTask)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"granite.maintenance.mandatory=true:[QUERY] "
          "granite.maintenance.mandatory=false:[QUERY] "
"job.topics=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comAdobeGraniteMaintenanceCrxImplLuceneBinariesCleanupTask)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"job.topics=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comAdobeGraniteMaintenanceCrxImplRevisionCleanupTask)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"full.gc.days=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comAdobeGraniteMonitoringImplScriptConfigImpl)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"script.filename=:[QUERY] "
"script.display=:[QUERY] "
"script.path=:[QUERY] "
"script.platform=:[QUERY] "
"interval=:[QUERY] "
"jmxdomain=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHan)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"path=:[QUERY] "
"jaas.controlFlag=:[QUERY] "
"jaas.realmName=:[QUERY] "
"jaas.ranking=:[QUERY] "
"oauth.offline.validation=true:[QUERY] "
          "oauth.offline.validation=false:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comAdobeGraniteOauthServerImplAccessTokenCleanupTask)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"scheduler.expression=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comAdobeGraniteOauthServerImplOAuth2ClientRevocationServlet)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"oauth.client.revocation.active=true:[QUERY] "
          "oauth.client.revocation.active=false:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comAdobeGraniteOauthServerImplOAuth2RevocationEndpointServlet)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"sling.servlet.paths=:[QUERY] "
"oauth.revocation.active=true:[QUERY] "
          "oauth.revocation.active=false:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comAdobeGraniteOauthServerImplOAuth2TokenEndpointServlet)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"oauth.issuer=:[QUERY] "
"oauth.access.token.expires.in=:[QUERY] "
"osgi.http.whiteboard.servlet.pattern=:[QUERY] "
"osgi.http.whiteboard.context.select=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comAdobeGraniteOauthServerImplOAuth2TokenRevocationServlet)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"oauth.token.revocation.active=true:[QUERY] "
          "oauth.token.revocation.active=false:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comAdobeGraniteOffloadingImplOffloadingConfigurator)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"offloading.transporter=:[QUERY] "
"offloading.cleanup.payload=true:[QUERY] "
          "offloading.cleanup.payload=false:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comAdobeGraniteOffloadingImplOffloadingJobCloner)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"offloading.jobcloner.enabled=true:[QUERY] "
          "offloading.jobcloner.enabled=false:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comAdobeGraniteOffloadingImplOffloadingJobOffloader)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"offloading.offloader.enabled=true:[QUERY] "
          "offloading.offloader.enabled=false:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comAdobeGraniteOffloadingImplTransporterOffloadingAgentManager)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"offloading.agentmanager.enabled=true:[QUERY] "
          "offloading.agentmanager.enabled=false:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comAdobeGraniteOffloadingImplTransporterOffloadingDefaultTranspo)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"default.transport.agent-to-worker.prefix=:[QUERY] "
"default.transport.agent-to-master.prefix=:[QUERY] "
"default.transport.input.package=:[QUERY] "
"default.transport.output.package=:[QUERY] "
"default.transport.replication.synchronous=true:[QUERY] "
          "default.transport.replication.synchronous=false:[QUERY] "
"default.transport.contentpackage=true:[QUERY] "
          "default.transport.contentpackage=false:[QUERY] "
"offloading.transporter.default.enabled=true:[QUERY] "
          "offloading.transporter.default.enabled=false:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comAdobeGraniteOmnisearchImplCoreOmniSearchServiceImpl)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"omnisearch.suggestion.requiretext.min=:[QUERY] "
"omnisearch.suggestion.spellcheck.require=true:[QUERY] "
          "omnisearch.suggestion.spellcheck.require=false:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comAdobeGraniteOptoutImplOptOutServiceImpl)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"optout.cookies=:[QUERY] "
"optout.headers=:[QUERY] "
"optout.whitelist.cookies=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comAdobeGraniteQueriesImplHcAsyncIndexHealthCheck)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"indexing.critical.threshold=:[QUERY] "
"indexing.warn.threshold=:[QUERY] "
"hc.tags=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comAdobeGraniteQueriesImplHcLargeIndexHealthCheck)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"large.index.critical.threshold=:[QUERY] "
"large.index.warn.threshold=:[QUERY] "
"hc.tags=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comAdobeGraniteQueriesImplHcQueriesStatusHealthCheck)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"hc.tags=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comAdobeGraniteQueriesImplHcQueryHealthCheckMetrics)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"getPeriod=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comAdobeGraniteQueriesImplHcQueryLimitsHealthCheck)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"hc.tags=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comAdobeGraniteReplicationHcImplReplicationQueueHealthCheck)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"number.of.retries.allowed=:[QUERY] "
"hc.tags=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comAdobeGraniteReplicationHcImplReplicationTransportUsersHealthC)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"hc.tags=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comAdobeGraniteRepositoryHcImplAuthorizableNodeNameHealthCheck)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"hc.tags=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comAdobeGraniteRepositoryHcImplContentSlingSlingContentHealthC)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"hc.tags=:[QUERY] "
"exclude.search.path=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comAdobeGraniteRepositoryHcImplContinuousRGCHealthCheck)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"hc.tags=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comAdobeGraniteRepositoryHcImplDefaultAccessUserProfileHealthChe)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"hc.tags=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comAdobeGraniteRepositoryHcImplDefaultLoginsHealthCheck)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"hc.tags=:[QUERY] "
"account.logins=:[QUERY] "
"console.logins=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comAdobeGraniteRepositoryHcImplDiskSpaceHealthCheck)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"hc.tags=:[QUERY] "
"disk.space.warn.threshold=:[QUERY] "
"disk.space.error.threshold=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comAdobeGraniteRepositoryHcImplObservationQueueLengthHealthCheck)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"hc.tags=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comAdobeGraniteRepositoryImplCommitStatsConfig)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"enabled=true:[QUERY] "
          "enabled=false:[QUERY] "
"intervalSeconds=:[QUERY] "
"commitsPerIntervalThreshold=:[QUERY] "
"maxLocationLength=:[QUERY] "
"maxDetailsShown=:[QUERY] "
"minDetailsPercentage=:[QUERY] "
"threadMatchers=:[QUERY] "
"maxGreedyDepth=:[QUERY] "
"greedyStackMatchers=:[QUERY] "
"stackFilters=:[QUERY] "
"stackMatchers=:[QUERY] "
"stackCategorizers=:[QUERY] "
"stackShorteners=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comAdobeGraniteRepositoryServiceUserConfiguration)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"service.ranking=:[QUERY] "
"serviceusers.simpleSubjectPopulation=true:[QUERY] "
          "serviceusers.simpleSubjectPopulation=false:[QUERY] "
"serviceusers.list=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comAdobeGraniteRequestsLoggingImplHcRequestsStatusHealthCheckIm)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"hc.tags=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comAdobeGraniteResourcestatusImplCompositeStatusType)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"name=:[QUERY] "
"types=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comAdobeGraniteResourcestatusImplStatusResourceProviderImpl)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"provider.root=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comAdobeGraniteRestAssetsImplAssetContentDispositionFilter)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"mime.allowEmpty=true:[QUERY] "
          "mime.allowEmpty=false:[QUERY] "
"mime.allowed=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comAdobeGraniteRestImplApiEndpointResourceProviderFactoryImpl)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"provider.roots=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comAdobeGraniteRestImplServletDefaultGETServlet)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"default.limit=:[QUERY] "
"use.absolute.uri=true:[QUERY] "
          "use.absolute.uri=false:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comAdobeGraniteSecurityUserUiInternalServletsSSLConfigurationS)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"hc.tags=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comAdobeGraniteSecurityUserUserPropertiesService)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"adapter.condition=:[QUERY] "
"granite.userproperties.nodetypes=:[QUERY] "
"granite.userproperties.resourcetypes=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comAdobeGraniteSocialgraphImplSocialGraphFactoryImpl)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"group2member.relationship.outgoing=:[QUERY] "
"group2member.excluded.outgoing=:[QUERY] "
"group2member.relationship.incoming=:[QUERY] "
"group2member.excluded.incoming=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comAdobeGraniteSystemMonitoringImplSystemStatsMBeanImpl)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"scheduler.expression=:[QUERY] "
"jmx.objectname=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comAdobeGraniteTaskmanagementImplJcrTaskAdapterFactory)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"adapter.condition=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comAdobeGraniteTaskmanagementImplJcrTaskArchiveService)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"archiving.enabled=true:[QUERY] "
          "archiving.enabled=false:[QUERY] "
"scheduler.expression=:[QUERY] "
"archive.since.days.completed=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comAdobeGraniteTaskmanagementImplPurgeTaskPurgeMaintenanceTask)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"purgeCompleted=true:[QUERY] "
          "purgeCompleted=false:[QUERY] "
"completedAge=:[QUERY] "
"purgeActive=true:[QUERY] "
          "purgeActive=false:[QUERY] "
"activeAge=:[QUERY] "
"saveThreshold=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comAdobeGraniteTaskmanagementImplServiceTaskManagerAdapterFactor)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"adapter.condition=:[QUERY] "
"taskmanager.admingroups=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comAdobeGraniteThreaddumpThreadDumpCollector)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"scheduler.period=:[QUERY] "
"scheduler.runOn=:[QUERY] "
"granite.threaddump.enabled=true:[QUERY] "
          "granite.threaddump.enabled=false:[QUERY] "
"granite.threaddump.dumpsPerFile=:[QUERY] "
"granite.threaddump.enableGzipCompression=true:[QUERY] "
          "granite.threaddump.enableGzipCompression=false:[QUERY] "
"granite.threaddump.enableDirectoriesCompression=true:[QUERY] "
          "granite.threaddump.enableDirectoriesCompression=false:[QUERY] "
"granite.threaddump.enableJStack=true:[QUERY] "
          "granite.threaddump.enableJStack=false:[QUERY] "
"granite.threaddump.maxBackupDays=:[QUERY] "
"granite.threaddump.backupCleanTrigger=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTransl)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"translationFactory=:[QUERY] "
"defaultConnectorLabel=:[QUERY] "
"defaultConnectorAttribution=:[QUERY] "
"defaultConnectorWorkspaceId=:[QUERY] "
"defaultConnectorSubscriptionKey=:[QUERY] "
"languageMapLocation=:[QUERY] "
"categoryMapLocation=:[QUERY] "
"retryAttempts=:[QUERY] "
"timeoutCount=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comAdobeGraniteTranslationCoreImplTranslationManagerImpl)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"defaultConnectorName=:[QUERY] "
"defaultCategory=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comAdobeGraniteUiClientlibsImplHtmlLibraryManagerImpl)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"htmllibmanager.timing=true:[QUERY] "
          "htmllibmanager.timing=false:[QUERY] "
"htmllibmanager.debug.init.js=:[QUERY] "
"htmllibmanager.minify=true:[QUERY] "
          "htmllibmanager.minify=false:[QUERY] "
"htmllibmanager.debug=true:[QUERY] "
          "htmllibmanager.debug=false:[QUERY] "
"htmllibmanager.gzip=true:[QUERY] "
          "htmllibmanager.gzip=false:[QUERY] "
"htmllibmanager.maxDataUriSize=:[QUERY] "
"htmllibmanager.maxage=:[QUERY] "
"htmllibmanager.forceCQUrlInfo=true:[QUERY] "
          "htmllibmanager.forceCQUrlInfo=false:[QUERY] "
"htmllibmanager.defaultthemename=:[QUERY] "
"htmllibmanager.defaultuserthemename=:[QUERY] "
"htmllibmanager.clientmanager=:[QUERY] "
"htmllibmanager.path.list=:[QUERY] "
"htmllibmanager.excluded.path.list=:[QUERY] "
"htmllibmanager.processor.js=:[QUERY] "
"htmllibmanager.processor.css=:[QUERY] "
"htmllibmanager.longcache.patterns=:[QUERY] "
"htmllibmanager.longcache.format=:[QUERY] "
"htmllibmanager.useFileSystemOutputCache=true:[QUERY] "
          "htmllibmanager.useFileSystemOutputCache=false:[QUERY] "
"htmllibmanager.fileSystemOutputCacheLocation=:[QUERY] "
"htmllibmanager.disable.replacement=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comAdobeGraniteWorkflowConsoleFragsWorkflowWithdrawFeature)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"enabled=true:[QUERY] "
          "enabled=false:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comAdobeGraniteWorkflowConsolePublishWorkflowPublishEventService)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"granite.workflow.WorkflowPublishEventService.enabled=true:[QUERY] "
          "granite.workflow.WorkflowPublishEventService.enabled=false:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comAdobeGraniteWorkflowCoreJcrWorkflowBucketManager)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"bucketSize=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comAdobeGraniteWorkflowCoreJobExternalProcessJobHandler)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"default.timeout=:[QUERY] "
"max.timeout=:[QUERY] "
"default.period=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comAdobeGraniteWorkflowCoreJobJobHandler)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"job.topics=:[QUERY] "
"allow.self.process.termination=true:[QUERY] "
          "allow.self.process.termination=false:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comAdobeGraniteWorkflowCoreOffloadingWorkflowOffloadingJobConsum)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"job.topics=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comAdobeGraniteWorkflowCorePayloadMapCache)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"getSystemWorkflowModels=:[QUERY] "
"getPackageRootPath=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comAdobeGraniteWorkflowCorePayloadmapPayloadMoveListener)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"payload.move.white.list=:[QUERY] "
"payload.move.handle.from.workflow.process=true:[QUERY] "
          "payload.move.handle.from.workflow.process=false:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comAdobeGraniteWorkflowCoreWorkflowConfig)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"cq.workflow.config.workflow.packages.root.path=:[QUERY] "
"cq.workflow.config.workflow.process.legacy.mode=true:[QUERY] "
          "cq.workflow.config.workflow.process.legacy.mode=false:[QUERY] "
"cq.workflow.config.allow.locking=true:[QUERY] "
          "cq.workflow.config.allow.locking=false:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comAdobeGraniteWorkflowCoreWorkflowSessionFactory)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"granite.workflowinbox.sort.propertyName=:[QUERY] "
"granite.workflowinbox.sort.order=:[QUERY] "
"cq.workflow.job.retry=:[QUERY] "
"cq.workflow.superuser=:[QUERY] "
"granite.workflow.inboxQuerySize=:[QUERY] "
"granite.workflow.adminUserGroupFilter=true:[QUERY] "
          "granite.workflow.adminUserGroupFilter=false:[QUERY] "
"granite.workflow.enforceWorkitemAssigneePermissions=true:[QUERY] "
          "granite.workflow.enforceWorkitemAssigneePermissions=false:[QUERY] "
"granite.workflow.enforceWorkflowInitiatorPermissions=true:[QUERY] "
          "granite.workflow.enforceWorkflowInitiatorPermissions=false:[QUERY] "
"granite.workflow.injectTenantIdInJobTopics=true:[QUERY] "
          "granite.workflow.injectTenantIdInJobTopics=false:[QUERY] "
"granite.workflow.maxPurgeSaveThreshold=:[QUERY] "
"granite.workflow.maxPurgeQueryCount=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comAdobeGraniteWorkflowPurgeScheduler)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"scheduledpurge.name=:[QUERY] "
"scheduledpurge.workflowStatus=:[QUERY] "
"scheduledpurge.modelIds=:[QUERY] "
"scheduledpurge.daysold=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comAdobeOctopusNcommBootstrap)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"maxConnections=:[QUERY] "
"maxRequests=:[QUERY] "
"requestTimeout=:[QUERY] "
"requestRetries=:[QUERY] "
"launchTimeout=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comAdobeSocialIntegrationsLivefyreUserPingforpullImplPingPullS)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"communities.integration.livefyre.sling.event.filter=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comAdobeXmpWorkerFilesNcommXMPFilesNComm)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"maxConnections=:[QUERY] "
"maxRequests=:[QUERY] "
"requestTimeout=:[QUERY] "
"logDir=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comDayCommonsDatasourceJdbcpoolJdbcPoolService)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"jdbc.driver.class=:[QUERY] "
"jdbc.connection.uri=:[QUERY] "
"jdbc.username=:[QUERY] "
"jdbc.password=:[QUERY] "
"jdbc.validation.query=:[QUERY] "
"default.readonly=true:[QUERY] "
          "default.readonly=false:[QUERY] "
"default.autocommit=true:[QUERY] "
          "default.autocommit=false:[QUERY] "
"pool.size=:[QUERY] "
"pool.max.wait.msec=:[QUERY] "
"datasource.name=:[QUERY] "
"datasource.svc.properties=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comDayCommonsHttpclient)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"proxy.enabled=true:[QUERY] "
          "proxy.enabled=false:[QUERY] "
"proxy.host=:[QUERY] "
"proxy.user=:[QUERY] "
"proxy.password=:[QUERY] "
"proxy.ntlm.host=:[QUERY] "
"proxy.ntlm.domain=:[QUERY] "
"proxy.exceptions=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comDayCqAnalyticsImplStorePropertiesChangeListener)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"cq.store.listener.additionalStorePaths=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comDayCqAnalyticsSitecatalystImplExporterClassificationsExporte)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"allowed.paths=:[QUERY] "
"cq.analytics.saint.exporter.pagesize=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comDayCqAnalyticsSitecatalystImplImporterReportImporter)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"report.fetch.attempts=:[QUERY] "
"report.fetch.delay=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comDayCqAnalyticsSitecatalystImplSitecatalystAdapterFactory)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"cq.analytics.adapterfactory.contextstores=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comDayCqAnalyticsSitecatalystImplSitecatalystHttpClientImpl)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"cq.analytics.sitecatalyst.service.datacenter.url=:[QUERY] "
"devhostnamepatterns=:[QUERY] "
"connection.timeout=:[QUERY] "
"socket.timeout=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comDayCqAnalyticsTestandtargetImplAccountOptionsUpdater)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"cq.analytics.testandtarget.accountoptionsupdater.enabled=true:[QUERY] "
          "cq.analytics.testandtarget.accountoptionsupdater.enabled=false:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comDayCqAnalyticsTestandtargetImplDeleteAuthorActivityListener)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"cq.analytics.testandtarget.deleteauthoractivitylistener.enabled=true:[QUERY] "
          "cq.analytics.testandtarget.deleteauthoractivitylistener.enabled=false:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comDayCqAnalyticsTestandtargetImplPushAuthorCampaignPageListener)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"cq.analytics.testandtarget.pushauthorcampaignpagelistener.enabled=true:[QUERY] "
          "cq.analytics.testandtarget.pushauthorcampaignpagelistener.enabled=false:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comDayCqAnalyticsTestandtargetImplSegmentImporter)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"cq.analytics.testandtarget.segmentimporter.enabled=true:[QUERY] "
          "cq.analytics.testandtarget.segmentimporter.enabled=false:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comDayCqAnalyticsTestandtargetImplServiceWebServiceImpl)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"endpointUri=:[QUERY] "
"connectionTimeout=:[QUERY] "
"socketTimeout=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comDayCqAnalyticsTestandtargetImplServletsAdminServerServlet)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"testandtarget.endpoint.url=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comDayCqAnalyticsTestandtargetImplTestandtargetHttpClientImpl)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"cq.analytics.testandtarget.api.url=:[QUERY] "
"cq.analytics.testandtarget.timeout=:[QUERY] "
"cq.analytics.testandtarget.sockettimeout=:[QUERY] "
"cq.analytics.testandtarget.recommendations.url.replace=:[QUERY] "
"cq.analytics.testandtarget.recommendations.url.replacewith=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comDayCqAuthImplCugCugSupportImpl)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"cug.exempted.principals=:[QUERY] "
"cug.enabled=true:[QUERY] "
          "cug.enabled=false:[QUERY] "
"cug.principals.regex=:[QUERY] "
"cug.principals.replacement=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comDayCqAuthImplLoginSelectorHandler)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"path=:[QUERY] "
"service.ranking=:[QUERY] "
"auth.loginselector.mappings=:[QUERY] "
"auth.loginselector.changepw.mappings=:[QUERY] "
"auth.loginselector.defaultloginpage=:[QUERY] "
"auth.loginselector.defaultchangepwpage=:[QUERY] "
"auth.loginselector.handle=:[QUERY] "
"auth.loginselector.handle.all.extensions=true:[QUERY] "
          "auth.loginselector.handle.all.extensions=false:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comDayCqCommonsImplExternalizerImpl)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"externalizer.domains=:[QUERY] "
"externalizer.host=:[QUERY] "
"externalizer.contextpath=:[QUERY] "
"externalizer.encodedpath=true:[QUERY] "
          "externalizer.encodedpath=false:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comDayCqCommonsServletsRootMappingServlet)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"rootmapping.target=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comDayCqCompatCodeupgradeImplCodeUpgradeExecutionConditionChecke)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"codeupgradetasks=:[QUERY] "
"codeupgradetaskfilters=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comDayCqCompatCodeupgradeImplUpgradeTaskIgnoreList)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"upgradeTaskIgnoreList=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comDayCqCompatCodeupgradeImplVersionRangeTaskIgnorelist)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"effectiveBundleListPath=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comDayCqContentsyncImplContentSyncManagerImpl)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"contentsync.fallback.authorizable=:[QUERY] "
"contentsync.fallback.updateuser=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comDayCqDamCommonsHandlerStandardImageHandler)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"large_file_threshold=:[QUERY] "
"large_comment_threshold=:[QUERY] "
"cq.dam.enable.ext.meta.extraction=true:[QUERY] "
          "cq.dam.enable.ext.meta.extraction=false:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comDayCqDamCommonsMetadataXmpFilterBlackWhite)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"xmp.filter.apply_whitelist=true:[QUERY] "
          "xmp.filter.apply_whitelist=false:[QUERY] "
"xmp.filter.whitelist=:[QUERY] "
"xmp.filter.apply_blacklist=true:[QUERY] "
          "xmp.filter.apply_blacklist=false:[QUERY] "
"xmp.filter.blacklist=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comDayCqDamCommonsUtilImplAssetCacheImpl)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"large.file.min=:[QUERY] "
"cache.apply=true:[QUERY] "
          "cache.apply=false:[QUERY] "
"mime.types=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comDayCqDamCoreImplAnnotationPdfAnnotationPdfConfig)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"cq.dam.config.annotation.pdf.document.width=:[QUERY] "
"cq.dam.config.annotation.pdf.document.height=:[QUERY] "
"cq.dam.config.annotation.pdf.document.padding.horizontal=:[QUERY] "
"cq.dam.config.annotation.pdf.document.padding.vertical=:[QUERY] "
"cq.dam.config.annotation.pdf.font.size=:[QUERY] "
"cq.dam.config.annotation.pdf.font.color=:[QUERY] "
"cq.dam.config.annotation.pdf.font.family=:[QUERY] "
"cq.dam.config.annotation.pdf.font.light=:[QUERY] "
"cq.dam.config.annotation.pdf.marginTextImage=:[QUERY] "
"cq.dam.config.annotation.pdf.minImageHeight=:[QUERY] "
"cq.dam.config.annotation.pdf.reviewStatus.width=:[QUERY] "
"cq.dam.config.annotation.pdf.reviewStatus.color.approved=:[QUERY] "
"cq.dam.config.annotation.pdf.reviewStatus.color.rejected=:[QUERY] "
"cq.dam.config.annotation.pdf.reviewStatus.color.changesRequested=:[QUERY] "
"cq.dam.config.annotation.pdf.annotationMarker.width=:[QUERY] "
"cq.dam.config.annotation.pdf.asset.minheight=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comDayCqDamCoreImplAssetMoveListener)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"enabled=true:[QUERY] "
          "enabled=false:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comDayCqDamCoreImplAssethomeAssetHomePageConfiguration)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"isEnabled=true:[QUERY] "
          "isEnabled=false:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comDayCqDamCoreImplAssetlinkshareAdhocAssetShareProxyServlet)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"cq.dam.adhoc.asset.share.prezip.maxcontentsize=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comDayCqDamCoreImplCacheCQBufferedImageCache)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"cq.dam.image.cache.max.memory=:[QUERY] "
"cq.dam.image.cache.max.age=:[QUERY] "
"cq.dam.image.cache.max.dimension=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comDayCqDamCoreImplDamChangeEventListener)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"changeeventlistener.observed.paths=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comDayCqDamCoreImplDamEventPurgeService)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"scheduler.expression=:[QUERY] "
"maxSavedActivities=:[QUERY] "
"saveInterval=:[QUERY] "
"enableActivityPurge=true:[QUERY] "
          "enableActivityPurge=false:[QUERY] "
"eventTypes=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comDayCqDamCoreImplDamEventRecorderImpl)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"event.filter=:[QUERY] "
"event.queue.length=:[QUERY] "
"eventrecorder.enabled=true:[QUERY] "
          "eventrecorder.enabled=false:[QUERY] "
"eventrecorder.blacklist=:[QUERY] "
"eventrecorder.eventtypes=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comDayCqDamCoreImplEventDamEventAuditListener)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"event.filter=:[QUERY] "
"enabled=true:[QUERY] "
          "enabled=false:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comDayCqDamCoreImplExpiryNotificationJobImpl)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"cq.dam.expiry.notification.scheduler.istimebased=true:[QUERY] "
          "cq.dam.expiry.notification.scheduler.istimebased=false:[QUERY] "
"cq.dam.expiry.notification.scheduler.timebased.rule=:[QUERY] "
"cq.dam.expiry.notification.scheduler.period.rule=:[QUERY] "
"send_email=true:[QUERY] "
          "send_email=false:[QUERY] "
"asset_expired_limit=:[QUERY] "
"prior_notification_seconds=:[QUERY] "
"cq.dam.expiry.notification.url.protocol=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comDayCqDamCoreImplFoldermetadataschemaFolderMetadataSchemaFeat)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"isEnabled=true:[QUERY] "
          "isEnabled=false:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comDayCqDamCoreImplGfxCommonsGfxRenderer)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"skip.bufferedcache=true:[QUERY] "
          "skip.bufferedcache=false:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comDayCqDamCoreImplHandlerEPSFormatHandler)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"mimetype=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comDayCqDamCoreImplHandlerIndesignFormatHandler)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"mimetype=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comDayCqDamCoreImplHandlerJpegHandler)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"cq.dam.enable.ext.meta.extraction=true:[QUERY] "
          "cq.dam.enable.ext.meta.extraction=false:[QUERY] "
"large_file_threshold=:[QUERY] "
"large_comment_threshold=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comDayCqDamCoreImplHandlerXmpNCommXMPHandler)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"xmphandler.cq.formats=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comDayCqDamCoreImplJmxAssetIndexUpdateMonitor)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"jmx.objectname=:[QUERY] "
"property.measure.enabled=true:[QUERY] "
          "property.measure.enabled=false:[QUERY] "
"property.name=:[QUERY] "
"property.max.wait.ms=:[QUERY] "
"property.max.rate=:[QUERY] "
"fulltext.measure.enabled=true:[QUERY] "
          "fulltext.measure.enabled=false:[QUERY] "
"fulltext.name=:[QUERY] "
"fulltext.max.wait.ms=:[QUERY] "
"fulltext.max.rate=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comDayCqDamCoreImplJmxAssetMigrationMBeanImpl)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"jmx.objectname=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comDayCqDamCoreImplJmxAssetUpdateMonitorImpl)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"jmx.objectname=:[QUERY] "
"active=true:[QUERY] "
          "active=false:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comDayCqDamCoreImplJobsMetadataexportAsyncMetadataExportConfig)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"operation=:[QUERY] "
"emailEnabled=true:[QUERY] "
          "emailEnabled=false:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comDayCqDamCoreImplJobsMetadataimportAsyncMetadataImportConfig)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"operation=:[QUERY] "
"operationIcon=:[QUERY] "
"topicName=:[QUERY] "
"emailEnabled=true:[QUERY] "
          "emailEnabled=false:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comDayCqDamCoreImplLightboxLightboxServlet)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"sling.servlet.paths=:[QUERY] "
"sling.servlet.methods=:[QUERY] "
"cq.dam.enable.anonymous=true:[QUERY] "
          "cq.dam.enable.anonymous=false:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comDayCqDamCoreImplMetadataEditorSelectComponentHandler)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"granite:data=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comDayCqDamCoreImplMimeTypeAssetUploadRestrictionHelper)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"cq.dam.allow.all.mime=true:[QUERY] "
          "cq.dam.allow.all.mime=false:[QUERY] "
"cq.dam.allowed.asset.mimes=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comDayCqDamCoreImplMimeTypeDamMimeTypeServiceImpl)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"cq.dam.detect.asset.mime.from.content=true:[QUERY] "
          "cq.dam.detect.asset.mime.from.content=false:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comDayCqDamCoreImplMissingMetadataNotificationJob)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"cq.dam.missingmetadata.notification.scheduler.istimebased=true:[QUERY] "
          "cq.dam.missingmetadata.notification.scheduler.istimebased=false:[QUERY] "
"cq.dam.missingmetadata.notification.scheduler.timebased.rule=:[QUERY] "
"cq.dam.missingmetadata.notification.scheduler.period.rule=:[QUERY] "
"cq.dam.missingmetadata.notification.recipient=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comDayCqDamCoreImplProcessSendTransientWorkflowCompletedEmailPr)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"process.label=:[QUERY] "
"Notify on Complete=true:[QUERY] "
          "Notify on Complete=false:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comDayCqDamCoreImplProcessTextExtractionProcess)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"mimeTypes=:[QUERY] "
"maxExtract=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comDayCqDamCoreImplRenditionMakerImpl)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"xmp.propagate=true:[QUERY] "
          "xmp.propagate=false:[QUERY] "
"xmp.excludes=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comDayCqDamCoreImplReportsReportExportService)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"queryBatchSize=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comDayCqDamCoreImplReportsReportPurgeService)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"scheduler.expression=:[QUERY] "
"maxSavedReports=:[QUERY] "
"timeDuration=:[QUERY] "
"enableReportPurge=true:[QUERY] "
          "enableReportPurge=false:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comDayCqDamCoreImplServletAssetDownloadServlet)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"enabled=true:[QUERY] "
          "enabled=false:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comDayCqDamCoreImplServletAssetStatusServlet)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"cq.dam.batch.status.maxassets=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comDayCqDamCoreImplServletAssetXMPSearchServlet)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"cq.dam.batch.indesign.maxassets=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comDayCqDamCoreImplServletBatchMetadataServlet)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"cq.dam.batch.metadata.asset.default=:[QUERY] "
"cq.dam.batch.metadata.collection.default=:[QUERY] "
"cq.dam.batch.metadata.maxresources=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comDayCqDamCoreImplServletBinaryProviderServlet)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"sling.servlet.resourceTypes=:[QUERY] "
"sling.servlet.methods=:[QUERY] "
"cq.dam.drm.enable=true:[QUERY] "
          "cq.dam.drm.enable=false:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comDayCqDamCoreImplServletCollectionServlet)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"cq.dam.batch.collection.properties=:[QUERY] "
"cq.dam.batch.collection.maxcollections=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comDayCqDamCoreImplServletCollectionsServlet)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"cq.dam.batch.collections.properties=:[QUERY] "
"cq.dam.batch.collections.limit=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comDayCqDamCoreImplServletCompanionServlet)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"More Info=:[QUERY] "
"/mnt/overlay/dam/gui/content/assets/moreinfo.html/${path}=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comDayCqDamCoreImplServletCreateAssetServlet)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"detect_duplicate=true:[QUERY] "
          "detect_duplicate=false:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comDayCqDamCoreImplServletDamContentDispositionFilter)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"cq.mime.type.blacklist=:[QUERY] "
"cq.dam.empty.mime=true:[QUERY] "
          "cq.dam.empty.mime=false:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comDayCqDamCoreImplServletGuidLookupFilter)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"cq.dam.core.guidlookupfilter.enabled=true:[QUERY] "
          "cq.dam.core.guidlookupfilter.enabled=false:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comDayCqDamCoreImplServletHealthCheckServlet)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"cq.dam.sync.workflow.id=:[QUERY] "
"cq.dam.sync.folder.types=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comDayCqDamCoreImplServletMetadataGetServlet)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"sling.servlet.resourceTypes=:[QUERY] "
"sling.servlet.methods=:[QUERY] "
"sling.servlet.extensions=:[QUERY] "
"sling.servlet.selectors=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comDayCqDamCoreImplServletMultipleLicenseAcceptServlet)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"cq.dam.drm.enable=true:[QUERY] "
          "cq.dam.drm.enable=false:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comDayCqDamCoreImplServletResourceCollectionServlet)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"sling.servlet.resourceTypes=:[QUERY] "
"sling.servlet.methods=:[QUERY] "
"sling.servlet.selectors=:[QUERY] "
"download.config=:[QUERY] "
"view.selector=:[QUERY] "
"send_email=true:[QUERY] "
          "send_email=false:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comDayCqDamCoreImplUiPreviewFolderPreviewUpdaterImpl)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"createPreviewEnabled=true:[QUERY] "
          "createPreviewEnabled=false:[QUERY] "
"updatePreviewEnabled=true:[QUERY] "
          "updatePreviewEnabled=false:[QUERY] "
"queueSize=:[QUERY] "
"folderPreviewRenditionRegex=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comDayCqDamCoreImplUnzipUnzipConfig)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"cq.dam.config.unzip.maxuncompressedsize=:[QUERY] "
"cq.dam.config.unzip.encoding=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comDayCqDamCoreProcessExifToolExtractMetadataProcess)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"process.label=:[QUERY] "
"cq.dam.enable.sha1=true:[QUERY] "
          "cq.dam.enable.sha1=false:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comDayCqDamCoreProcessExtractMetadataProcess)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"process.label=:[QUERY] "
"cq.dam.enable.sha1=true:[QUERY] "
          "cq.dam.enable.sha1=false:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comDayCqDamCoreProcessMetadataProcessorProcess)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"process.label=:[QUERY] "
"cq.dam.enable.sha1=true:[QUERY] "
          "cq.dam.enable.sha1=false:[QUERY] "
"cq.dam.metadata.xssprotected.properties=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comDayCqDamHandlerFfmpegLocatorImpl)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"executable.searchpath=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comDayCqDamHandlerGibsonFontmanagerImplFontManagerServiceImpl)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"event.filter=:[QUERY] "
"fontmgr.system.font.dir=:[QUERY] "
"fontmgr.adobe.font.dir=:[QUERY] "
"fontmgr.customer.font.dir=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comDayCqDamHandlerStandardPdfPdfHandler)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"raster.annotation=true:[QUERY] "
          "raster.annotation=false:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comDayCqDamHandlerStandardPsPostScriptHandler)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"raster.annotation=true:[QUERY] "
          "raster.annotation=false:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comDayCqDamHandlerStandardPsdPsdHandler)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"large_file_threshold=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comDayCqDamIdsImplIDSJobProcessor)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"enable.multisession=true:[QUERY] "
          "enable.multisession=false:[QUERY] "
"ids.cc.enable=true:[QUERY] "
          "ids.cc.enable=false:[QUERY] "
"enable.retry=true:[QUERY] "
          "enable.retry=false:[QUERY] "
"enable.retry.scripterror=true:[QUERY] "
          "enable.retry.scripterror=false:[QUERY] "
"externalizer.domain.cqhost=:[QUERY] "
"externalizer.domain.http=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comDayCqDamIdsImplIDSPoolManagerImpl)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"max.errors.to.blacklist=:[QUERY] "
"retry.interval.to.whitelist=:[QUERY] "
"connect.timeout=:[QUERY] "
"socket.timeout=:[QUERY] "
"process.label=:[QUERY] "
"connection.use.max=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comDayCqDamInddImplHandlerIndesignXMPHandler)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"process.label=:[QUERY] "
"extract.pages=true:[QUERY] "
          "extract.pages=false:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comDayCqDamInddImplServletSnippetCreationServlet)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"snippetcreation.maxcollections=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comDayCqDamInddProcessINDDMediaExtractProcess)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"process.label=:[QUERY] "
"cq.dam.indd.pages.regex=:[QUERY] "
"ids.job.decoupled=true:[QUERY] "
          "ids.job.decoupled=false:[QUERY] "
"ids.job.workflow.model=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comDayCqDamPerformanceInternalAssetPerformanceDataHandlerImpl)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"batch.commit.size=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comDayCqDamPerformanceInternalAssetPerformanceReportSyncJob)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"scheduler.expression=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comDayCqDamPimImplSourcingUploadProcessProductAssetsUploadPro)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"delete.zip.file=true:[QUERY] "
          "delete.zip.file=false:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comDayCqDamS7damCommonAnalyticsImplS7damDynamicMediaConfigEven)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"cq.dam.s7dam.dynamicmediaconfigeventlistener.enabled=true:[QUERY] "
          "cq.dam.s7dam.dynamicmediaconfigeventlistener.enabled=false:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comDayCqDamS7damCommonAnalyticsImplSiteCatalystReportRunner)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"scheduler.expression=:[QUERY] "
"scheduler.concurrent=true:[QUERY] "
          "scheduler.concurrent=false:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comDayCqDamS7damCommonPostServletsSetCreateHandler)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"sling.post.operation=:[QUERY] "
"sling.servlet.methods=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comDayCqDamS7damCommonPostServletsSetModifyHandler)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"sling.post.operation=:[QUERY] "
"sling.servlet.methods=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comDayCqDamS7damCommonProcessVideoThumbnailDownloadProcess)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"process.label=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comDayCqDamS7damCommonS7damDamChangeEventListener)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"cq.dam.s7dam.damchangeeventlistener.enabled=true:[QUERY] "
          "cq.dam.s7dam.damchangeeventlistener.enabled=false:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comDayCqDamS7damCommonServletsS7damProductInfoServlet)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"sling.servlet.paths=:[QUERY] "
"sling.servlet.methods=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comDayCqDamS7damCommonVideoImplVideoProxyClientServiceImpl)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"cq.dam.s7dam.videoproxyclientservice.multipartupload.minsize.name=:[QUERY] "
"cq.dam.s7dam.videoproxyclientservice.multipartupload.partsize.name=:[QUERY] "
"cq.dam.s7dam.videoproxyclientservice.multipartupload.numthread.name=:[QUERY] "
"cq.dam.s7dam.videoproxyclientservice.http.readtimeout.name=:[QUERY] "
"cq.dam.s7dam.videoproxyclientservice.http.connectiontimeout.name=:[QUERY] "
"cq.dam.s7dam.videoproxyclientservice.http.maxretrycount.name=:[QUERY] "
"cq.dam.s7dam.videoproxyclientservice.uploadprogress.interval.name=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comDayCqDamScene7ImplScene7APIClientImpl)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"cq.dam.scene7.apiclient.recordsperpage.nofilter.name=:[QUERY] "
"cq.dam.scene7.apiclient.recordsperpage.withfilter.name=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comDayCqDamScene7ImplScene7AssetMimeTypeServiceImpl)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"cq.dam.scene7.assetmimetypeservice.mapping=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comDayCqDamScene7ImplScene7ConfigurationEventListener)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"cq.dam.scene7.configurationeventlistener.enabled=true:[QUERY] "
          "cq.dam.scene7.configurationeventlistener.enabled=false:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comDayCqDamScene7ImplScene7DamChangeEventListener)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"cq.dam.scene7.damchangeeventlistener.enabled=true:[QUERY] "
          "cq.dam.scene7.damchangeeventlistener.enabled=false:[QUERY] "
"cq.dam.scene7.damchangeeventlistener.observed.paths=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comDayCqDamScene7ImplScene7FlashTemplatesServiceImpl)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"scene7FlashTemplates.rti=:[QUERY] "
"scene7FlashTemplates.rsi=:[QUERY] "
"scene7FlashTemplates.rb=:[QUERY] "
"scene7FlashTemplates.rurl=:[QUERY] "
"scene7FlashTemplate.urlFormatParameter=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comDayCqDamScene7ImplScene7UploadServiceImpl)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"cq.dam.scene7.uploadservice.activejobtimeout.label=:[QUERY] "
"cq.dam.scene7.uploadservice.connectionmaxperroute.label=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comDayCqDamStockIntegrationImplCacheStockCacheConfigurationSer)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"getCacheExpirationUnit=:[QUERY] "
"getCacheExpirationValue=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comDayCqDamStockIntegrationImplConfigurationStockConfiguration)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"name=:[QUERY] "
"locale=:[QUERY] "
"imsConfig=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comDayCqDamVideoImplServletVideoTestServlet)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"enabled=true:[QUERY] "
          "enabled=false:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comDayCqExtwidgetServletsImageSpriteServlet)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"maxWidth=:[QUERY] "
"maxHeight=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comDayCqImageInternalFontFontHelper)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"fontpath=:[QUERY] "
"oversamplingFactor=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comDayCqJcrclustersupportClusterStartLevelController)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"cluster.level.enable=true:[QUERY] "
          "cluster.level.enable=false:[QUERY] "
"cluster.master.level=:[QUERY] "
"cluster.slave.level=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comDayCqMailerDefaultMailService)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"smtp.host=:[QUERY] "
"smtp.port=:[QUERY] "
"smtp.user=:[QUERY] "
"smtp.password=:[QUERY] "
"from.address=:[QUERY] "
"smtp.ssl=true:[QUERY] "
          "smtp.ssl=false:[QUERY] "
"smtp.starttls=true:[QUERY] "
          "smtp.starttls=false:[QUERY] "
"debug.email=true:[QUERY] "
          "debug.email=false:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comDayCqMailerImplCqMailingService)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"max.recipient.count=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comDayCqMailerImplEmailCqEmailTemplateFactory)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"mailer.email.charset=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comDayCqMailerImplEmailCqRetrieverTemplateFactory)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"mailer.email.embed=true:[QUERY] "
          "mailer.email.embed=false:[QUERY] "
"mailer.email.charset=:[QUERY] "
"mailer.email.retrieverUserID=:[QUERY] "
"mailer.email.retrieverUserPWD=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comDayCqMcmCampaignImplIntegrationConfigImpl)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"aem.mcm.campaign.formConstraints=:[QUERY] "
"aem.mcm.campaign.publicUrl=:[QUERY] "
"aem.mcm.campaign.relaxedSSL=true:[QUERY] "
          "aem.mcm.campaign.relaxedSSL=false:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comDayCqMcmCampaignImporterPersonalizedTextHandlerFactory)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"service.ranking=:[QUERY] "
"tagpattern=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comDayCqMcmCoreNewsletterNewsletterEmailServiceImpl)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"from.address=:[QUERY] "
"sender.host=:[QUERY] "
"max.bounce.count=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comDayCqMcmImplMCMConfiguration)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"experience.indirection=:[QUERY] "
"touchpoint.indirection=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comDayCqMcmLandingpageParserTaghandlersCtaClickThroughComponen)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"service.ranking=:[QUERY] "
"tagpattern=:[QUERY] "
"component.resourceType=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comDayCqMcmLandingpageParserTaghandlersCtaGraphicalClickThroug)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"service.ranking=:[QUERY] "
"tagpattern=:[QUERY] "
"component.resourceType=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comDayCqMcmLandingpageParserTaghandlersCtaLeadFormCTAComponent)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"service.ranking=:[QUERY] "
"tagpattern=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comDayCqMcmLandingpageParserTaghandlersMboxMBoxExperienceTagHa)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"service.ranking=:[QUERY] "
"tagpattern=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comDayCqMcmLandingpageParserTaghandlersMboxTargetComponentTagH)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"service.ranking=:[QUERY] "
"tagpattern=:[QUERY] "
"component.resourceType=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comDayCqNotificationImplNotificationServiceImpl)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"event.filter=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comDayCqPersonalizationImplServletsTargetingConfigurationServlet)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"forcelocation=true:[QUERY] "
          "forcelocation=false:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comDayCqPollingImporterImplManagedPollConfigImpl)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"id=:[QUERY] "
"enabled=true:[QUERY] "
          "enabled=false:[QUERY] "
"reference=true:[QUERY] "
          "reference=false:[QUERY] "
"interval=:[QUERY] "
"expression=:[QUERY] "
"source=:[QUERY] "
"target=:[QUERY] "
"login=:[QUERY] "
"password=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comDayCqPollingImporterImplManagedPollingImporterImpl)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"importer.user=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comDayCqPollingImporterImplPollingImporterImpl)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"importer.min.interval=:[QUERY] "
"importer.user=:[QUERY] "
"exclude.paths=:[QUERY] "
"include.paths=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comDayCqReplicationAuditReplicationEventListener)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"service.ranking=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comDayCqReplicationContentStaticContentBuilder)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"host=:[QUERY] "
"port=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comDayCqReplicationImplAgentManagerImpl)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"job.topics=:[QUERY] "
"serviceUser.target=:[QUERY] "
"agentProvider.target=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comDayCqReplicationImplContentDurboBinaryLessContentBuilder)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"binary.threshold=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comDayCqReplicationImplContentDurboDurboImportConfigurationProv)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"preserve.hierarchy.nodes=true:[QUERY] "
          "preserve.hierarchy.nodes=false:[QUERY] "
"ignore.versioning=true:[QUERY] "
          "ignore.versioning=false:[QUERY] "
"import.acl=true:[QUERY] "
          "import.acl=false:[QUERY] "
"save.threshold=:[QUERY] "
"preserve.user.paths=true:[QUERY] "
          "preserve.user.paths=false:[QUERY] "
"preserve.uuid=true:[QUERY] "
          "preserve.uuid=false:[QUERY] "
"preserve.uuid.nodetypes=:[QUERY] "
"preserve.uuid.subtrees=:[QUERY] "
"auto.commit=true:[QUERY] "
          "auto.commit=false:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comDayCqReplicationImplReplicationContentFactoryProviderImpl)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"replication.content.useFileStorage=true:[QUERY] "
          "replication.content.useFileStorage=false:[QUERY] "
"replication.content.maxCommitAttempts=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comDayCqReplicationImplReplicationReceiverImpl)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"receiver.tmpfile.threshold=:[QUERY] "
"receiver.packages.use.install=true:[QUERY] "
          "receiver.packages.use.install=false:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comDayCqReplicationImplReplicatorImpl)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"distribute_events=true:[QUERY] "
          "distribute_events=false:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comDayCqReplicationImplReverseReplicator)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"scheduler.period=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comDayCqReplicationImplTransportBinaryLessTransportHandler)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"disabled.cipher.suites=:[QUERY] "
"enabled.cipher.suites=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comDayCqReplicationImplTransportHttp)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"disabled.cipher.suites=:[QUERY] "
"enabled.cipher.suites=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comDayCqReportingImplCacheCacheImpl)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"repcache.enable=true:[QUERY] "
          "repcache.enable=false:[QUERY] "
"repcache.ttl=:[QUERY] "
"repcache.max=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comDayCqReportingImplConfigServiceImpl)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"repconf.timezone=:[QUERY] "
"repconf.locale=:[QUERY] "
"repconf.snapshots=:[QUERY] "
"repconf.repdir=:[QUERY] "
"repconf.hourofday=:[QUERY] "
"repconf.minofhour=:[QUERY] "
"repconf.maxrows=:[QUERY] "
"repconf.fakedata=true:[QUERY] "
          "repconf.fakedata=false:[QUERY] "
"repconf.snapshotuser=:[QUERY] "
"repconf.enforcesnapshotuser=true:[QUERY] "
          "repconf.enforcesnapshotuser=false:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comDayCqReportingImplRLogAnalyzer)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"request.log.output=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comDayCqRewriterLinkcheckerImplLinkCheckerImpl)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"scheduler.period=:[QUERY] "
"scheduler.concurrent=true:[QUERY] "
          "scheduler.concurrent=false:[QUERY] "
"service.bad_link_tolerance_interval=:[QUERY] "
"service.check_override_patterns=:[QUERY] "
"service.cache_broken_internal_links=true:[QUERY] "
          "service.cache_broken_internal_links=false:[QUERY] "
"service.special_link_prefix=:[QUERY] "
"service.special_link_patterns=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comDayCqRewriterLinkcheckerImplLinkCheckerTask)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"scheduler.period=:[QUERY] "
"scheduler.concurrent=true:[QUERY] "
          "scheduler.concurrent=false:[QUERY] "
"good_link_test_interval=:[QUERY] "
"bad_link_test_interval=:[QUERY] "
"link_unused_interval=:[QUERY] "
"connection.timeout=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comDayCqRewriterLinkcheckerImplLinkCheckerTransformerFactory)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"linkcheckertransformer.disableRewriting=true:[QUERY] "
          "linkcheckertransformer.disableRewriting=false:[QUERY] "
"linkcheckertransformer.disableChecking=true:[QUERY] "
          "linkcheckertransformer.disableChecking=false:[QUERY] "
"linkcheckertransformer.mapCacheSize=:[QUERY] "
"linkcheckertransformer.strictExtensionCheck=true:[QUERY] "
          "linkcheckertransformer.strictExtensionCheck=false:[QUERY] "
"linkcheckertransformer.stripHtmltExtension=true:[QUERY] "
          "linkcheckertransformer.stripHtmltExtension=false:[QUERY] "
"linkcheckertransformer.rewriteElements=:[QUERY] "
"linkcheckertransformer.stripExtensionPathBlacklist=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comDayCqRewriterLinkcheckerImplLinkInfoStorageImpl)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"service.max_links_per_host=:[QUERY] "
"service.save_external_link_references=true:[QUERY] "
          "service.save_external_link_references=false:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comDayCqRewriterProcessorImplHtmlParserFactory)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"htmlparser.processTags=:[QUERY] "
"htmlparser.preserveCamelCase=true:[QUERY] "
          "htmlparser.preserveCamelCase=false:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comDayCqSearchImplBuilderQueryBuilderImpl)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"excerpt.properties=:[QUERY] "
"cache.max.entries=:[QUERY] "
"cache.entry.lifetime=:[QUERY] "
"xpath.union=true:[QUERY] "
          "xpath.union=false:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comDayCqSearchSuggestImplSuggestionIndexManagerImpl)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"pathBuilder.target=:[QUERY] "
"suggest.basepath=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comDayCqSearchpromoteImplPublishSearchPromoteConfigHandler)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"cq.searchpromote.confighandler.enabled=true:[QUERY] "
          "cq.searchpromote.confighandler.enabled=false:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comDayCqSearchpromoteImplSearchPromoteServiceImpl)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"cq.searchpromote.configuration.server.uri=:[QUERY] "
"cq.searchpromote.configuration.environment=:[QUERY] "
"connection.timeout=:[QUERY] "
"socket.timeout=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comDayCqSecurityACLSetup)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"cq.aclsetup.rules=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comDayCqStatisticsImplStatisticsServiceImpl)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"scheduler.period=:[QUERY] "
"scheduler.concurrent=true:[QUERY] "
          "scheduler.concurrent=false:[QUERY] "
"path=:[QUERY] "
"workspace=:[QUERY] "
"keywordsPath=:[QUERY] "
"asyncEntries=true:[QUERY] "
          "asyncEntries=false:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comDayCqTaggingImplJcrTagManagerFactoryImpl)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"validation.enabled=true:[QUERY] "
          "validation.enabled=false:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comDayCqTaggingImplSearchTagPredicateEvaluator)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"ignore_path=true:[QUERY] "
          "ignore_path=false:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comDayCqTaggingImplTagGarbageCollector)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"scheduler.expression=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comDayCqWcmContentsyncImplHandlerPagesUpdateHandler)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"cq.pagesupdatehandler.imageresourcetypes=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comDayCqWcmContentsyncImplRewriterPathRewriterTransformerFactor)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"cq.contentsync.pathrewritertransformer.mapping.links=:[QUERY] "
"cq.contentsync.pathrewritertransformer.mapping.clientlibs=:[QUERY] "
"cq.contentsync.pathrewritertransformer.mapping.images=:[QUERY] "
"cq.contentsync.pathrewritertransformer.attribute.pattern=:[QUERY] "
"cq.contentsync.pathrewritertransformer.clientlibrary.pattern=:[QUERY] "
"cq.contentsync.pathrewritertransformer.clientlibrary.replace=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comDayCqWcmCoreImplAuthoringUIModeServiceImpl)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"authoringUIModeService.default=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comDayCqWcmCoreImplCommandsWCMCommandServlet)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"wcmcommandservlet.delete_whitelist=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comDayCqWcmCoreImplDevicedetectionDeviceIdentificationModeImpl)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"dim.default.mode=:[QUERY] "
"dim.appcache.enabled=true:[QUERY] "
          "dim.appcache.enabled=false:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comDayCqWcmCoreImplEventPageEventAuditListener)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"configured=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comDayCqWcmCoreImplEventPagePostProcessor)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"paths=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comDayCqWcmCoreImplEventRepositoryChangeEventListener)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"paths=:[QUERY] "
"excludedPaths=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comDayCqWcmCoreImplEventTemplatePostProcessor)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"paths=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comDayCqWcmCoreImplLanguageManagerImpl)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"langmgr.list.path=:[QUERY] "
"langmgr.country.default=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comDayCqWcmCoreImplLinkCheckerConfigurationFactoryImpl)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"link.expired.prefix=:[QUERY] "
"link.expired.remove=true:[QUERY] "
          "link.expired.remove=false:[QUERY] "
"link.expired.suffix=:[QUERY] "
"link.invalid.prefix=:[QUERY] "
"link.invalid.remove=true:[QUERY] "
          "link.invalid.remove=false:[QUERY] "
"link.invalid.suffix=:[QUERY] "
"link.predated.prefix=:[QUERY] "
"link.predated.remove=true:[QUERY] "
          "link.predated.remove=false:[QUERY] "
"link.predated.suffix=:[QUERY] "
"link.wcmmodes=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comDayCqWcmCoreImplPagePageInfoAggregatorImpl)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"page.info.provider.property.regex.default=:[QUERY] "
"page.info.provider.property.name=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comDayCqWcmCoreImplPagePageManagerFactoryImpl)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"illegalCharMapping=:[QUERY] "
"pageSubTreeActivationCheck=true:[QUERY] "
          "pageSubTreeActivationCheck=false:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comDayCqWcmCoreImplReferencesContentContentReferenceConfig)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"contentReferenceConfig.resourceTypes=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comDayCqWcmCoreImplServletsContentfinderAssetViewHandler)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"dam.showexpired=true:[QUERY] "
          "dam.showexpired=false:[QUERY] "
"dam.showhidden=true:[QUERY] "
          "dam.showhidden=false:[QUERY] "
"tagTitleSearch=true:[QUERY] "
          "tagTitleSearch=false:[QUERY] "
"guessTotal=:[QUERY] "
"dam.expiryProperty=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comDayCqWcmCoreImplServletsContentfinderConnectorConnectorVie)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"item.resource.types=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comDayCqWcmCoreImplServletsContentfinderPageViewHandler)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"guessTotal=:[QUERY] "
"tagTitleSearch=true:[QUERY] "
          "tagTitleSearch=false:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comDayCqWcmCoreImplServletsFindReplaceServlet)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"scope=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comDayCqWcmCoreImplServletsReferenceSearchServlet)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"referencesearchservlet.maxReferencesPerPage=:[QUERY] "
"referencesearchservlet.maxPages=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comDayCqWcmCoreImplServletsThumbnailServlet)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"workspace=:[QUERY] "
"dimensions=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comDayCqWcmCoreImplUtilsDefaultPageNameValidator)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"nonValidChars=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comDayCqWcmCoreImplVariantsPageVariantsProviderImpl)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"default.externalizer.domain=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comDayCqWcmCoreImplVersionManagerImpl)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"versionmanager.createVersionOnActivation=true:[QUERY] "
          "versionmanager.createVersionOnActivation=false:[QUERY] "
"versionmanager.purgingEnabled=true:[QUERY] "
          "versionmanager.purgingEnabled=false:[QUERY] "
"versionmanager.purgePaths=:[QUERY] "
"versionmanager.ivPaths=:[QUERY] "
"versionmanager.maxAgeDays=:[QUERY] "
"versionmanager.maxNumberVersions=:[QUERY] "
"versionmanager.minNumberVersions=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comDayCqWcmCoreImplVersionPurgeTask)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"versionpurge.paths=:[QUERY] "
"versionpurge.recursive=true:[QUERY] "
          "versionpurge.recursive=false:[QUERY] "
"versionpurge.maxVersions=:[QUERY] "
"versionpurge.minVersions=:[QUERY] "
"versionpurge.maxAgeDays=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comDayCqWcmCoreImplWCMDebugFilter)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"wcmdbgfilter.enabled=true:[QUERY] "
          "wcmdbgfilter.enabled=false:[QUERY] "
"wcmdbgfilter.jspDebug=true:[QUERY] "
          "wcmdbgfilter.jspDebug=false:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comDayCqWcmCoreImplWCMDeveloperModeFilter)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"wcmdevmodefilter.enabled=true:[QUERY] "
          "wcmdevmodefilter.enabled=false:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comDayCqWcmCoreImplWarpTimeWarpFilter)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"filter.order=:[QUERY] "
"filter.scope=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comDayCqWcmCoreMvtMVTStatisticsImpl)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"mvtstatistics.trackingurl=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comDayCqWcmCoreStatsPageViewStatisticsImpl)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"pageviewstatistics.trackingurl=:[QUERY] "
"pageviewstatistics.trackingscript.enabled=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comDayCqWcmCoreWCMRequestFilter)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"wcmfilter.mode=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comDayCqWcmDesignimporterDesignPackageImporter)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"extract.filter=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comDayCqWcmDesignimporterImplCanvasBuilderImpl)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"filepattern=:[QUERY] "
"build.page.nodes=true:[QUERY] "
          "build.page.nodes=false:[QUERY] "
"build.client.libs=true:[QUERY] "
          "build.client.libs=false:[QUERY] "
"build.canvas.component=true:[QUERY] "
          "build.canvas.component=false:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comDayCqWcmDesignimporterImplCanvasPageDeleteHandler)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"minThreadPoolSize=:[QUERY] "
"maxThreadPoolSize=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comDayCqWcmDesignimporterImplEntryPreprocessorImpl)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"search.pattern=:[QUERY] "
"replace.pattern=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comDayCqWcmDesignimporterImplMobileCanvasBuilderImpl)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"filepattern=:[QUERY] "
"device.groups=:[QUERY] "
"build.page.nodes=true:[QUERY] "
          "build.page.nodes=false:[QUERY] "
"build.client.libs=true:[QUERY] "
          "build.client.libs=false:[QUERY] "
"build.canvas.component=true:[QUERY] "
          "build.canvas.component=false:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comDayCqWcmDesignimporterParserTaghandlersFactoryCanvasCompone)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"service.ranking=:[QUERY] "
"tagpattern=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comDayCqWcmDesignimporterParserTaghandlersFactoryDefaultCompon)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"service.ranking=:[QUERY] "
"tagpattern=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comDayCqWcmDesignimporterParserTaghandlersFactoryDefaultTagHan)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"service.ranking=:[QUERY] "
"tagpattern=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comDayCqWcmDesignimporterParserTaghandlersFactoryHeadTagHandle)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"service.ranking=:[QUERY] "
"tagpattern=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comDayCqWcmDesignimporterParserTaghandlersFactoryIFrameTagHand)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"service.ranking=:[QUERY] "
"tagpattern=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comDayCqWcmDesignimporterParserTaghandlersFactoryImageComponen)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"service.ranking=:[QUERY] "
"tagpattern=:[QUERY] "
"component.resourceType=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comDayCqWcmDesignimporterParserTaghandlersFactoryImgTagHandler)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"service.ranking=:[QUERY] "
"tagpattern=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comDayCqWcmDesignimporterParserTaghandlersFactoryInlineScriptT)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"service.ranking=:[QUERY] "
"tagpattern=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comDayCqWcmDesignimporterParserTaghandlersFactoryLinkTagHandle)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"service.ranking=:[QUERY] "
"tagpattern=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comDayCqWcmDesignimporterParserTaghandlersFactoryMetaTagHandle)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"service.ranking=:[QUERY] "
"tagpattern=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comDayCqWcmDesignimporterParserTaghandlersFactoryNonScriptTagH)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"service.ranking=:[QUERY] "
"tagpattern=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comDayCqWcmDesignimporterParserTaghandlersFactoryParsysCompone)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"service.ranking=:[QUERY] "
"tagpattern=:[QUERY] "
"component.resourceType=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comDayCqWcmDesignimporterParserTaghandlersFactoryScriptTagHand)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"service.ranking=:[QUERY] "
"tagpattern=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comDayCqWcmDesignimporterParserTaghandlersFactoryStyleTagHandl)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"service.ranking=:[QUERY] "
"tagpattern=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comDayCqWcmDesignimporterParserTaghandlersFactoryTextComponent)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"service.ranking=:[QUERY] "
"tagpattern=:[QUERY] "
"component.resourceType=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comDayCqWcmDesignimporterParserTaghandlersFactoryTitleComponen)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"service.ranking=:[QUERY] "
"tagpattern=:[QUERY] "
"component.resourceType=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comDayCqWcmDesignimporterParserTaghandlersFactoryTitleTagHandl)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"service.ranking=:[QUERY] "
"tagpattern=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comDayCqWcmFoundationFormsImplFormChooserServlet)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"service.name=:[QUERY] "
"sling.servlet.resourceTypes=:[QUERY] "
"sling.servlet.selectors=:[QUERY] "
"sling.servlet.methods=:[QUERY] "
"forms.formchooserservlet.advansesearch.require=true:[QUERY] "
          "forms.formchooserservlet.advansesearch.require=false:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comDayCqWcmFoundationFormsImplFormParagraphPostProcessor)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"forms.formparagraphpostprocessor.enabled=true:[QUERY] "
          "forms.formparagraphpostprocessor.enabled=false:[QUERY] "
"forms.formparagraphpostprocessor.formresourcetypes=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comDayCqWcmFoundationFormsImplFormsHandlingServlet)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"name.whitelist=:[QUERY] "
"allow.expressions=true:[QUERY] "
          "allow.expressions=false:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comDayCqWcmFoundationFormsImplMailServlet)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"sling.servlet.resourceTypes=:[QUERY] "
"sling.servlet.selectors=:[QUERY] "
"resource.whitelist=:[QUERY] "
"resource.blacklist=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comDayCqWcmFoundationImplAdaptiveImageComponentServlet)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"adapt.supported.widths=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comDayCqWcmFoundationImplHTTPAuthHandler)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"path=:[QUERY] "
"auth.http.nologin=true:[QUERY] "
          "auth.http.nologin=false:[QUERY] "
"auth.http.realm=:[QUERY] "
"auth.default.loginpage=:[QUERY] "
"auth.cred.form=:[QUERY] "
"auth.cred.utf8=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comDayCqWcmFoundationImplPageImpressionsTracker)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"sling.auth.requirements=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comDayCqWcmFoundationImplPageRedirectServlet)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"excluded.resource.types=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comDayCqWcmFoundationSecurityImplDefaultAttachmentTypeBlacklist)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"default.attachment.type.blacklist=:[QUERY] "
"baseline.attachment.type.blacklist=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comDayCqWcmFoundationSecurityImplSaferSlingPostValidatorImpl)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"parameter.whitelist=:[QUERY] "
"parameter.whitelist.prefixes=:[QUERY] "
"binary.parameter.whitelist=:[QUERY] "
"modifier.whitelist=:[QUERY] "
"operation.whitelist=:[QUERY] "
"operation.whitelist.prefixes=:[QUERY] "
"typehint.whitelist=:[QUERY] "
"resourcetype.whitelist=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comDayCqWcmMobileCoreImplDeviceDeviceInfoTransformerFactory)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"device.info.transformer.enabled=true:[QUERY] "
          "device.info.transformer.enabled=false:[QUERY] "
"device.info.transformer.css.style=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comDayCqWcmMobileCoreImplRedirectRedirectFilter)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"redirect.enabled=true:[QUERY] "
          "redirect.enabled=false:[QUERY] "
"redirect.stats.enabled=true:[QUERY] "
          "redirect.stats.enabled=false:[QUERY] "
"redirect.extensions=:[QUERY] "
"redirect.paths=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comDayCqWcmMsmImplActionsContentCopyActionFactory)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"cq.wcm.msm.action.excludednodetypes=:[QUERY] "
"cq.wcm.msm.action.excludedparagraphitems=:[QUERY] "
"cq.wcm.msm.action.excludedprops=:[QUERY] "
"contentcopyaction.order.style=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comDayCqWcmMsmImplActionsContentDeleteActionFactory)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"cq.wcm.msm.action.excludednodetypes=:[QUERY] "
"cq.wcm.msm.action.excludedparagraphitems=:[QUERY] "
"cq.wcm.msm.action.excludedprops=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comDayCqWcmMsmImplActionsContentUpdateActionFactory)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"cq.wcm.msm.action.excludednodetypes=:[QUERY] "
"cq.wcm.msm.action.excludedparagraphitems=:[QUERY] "
"cq.wcm.msm.action.excludedprops=:[QUERY] "
"cq.wcm.msm.action.ignoredMixin=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comDayCqWcmMsmImplActionsOrderChildrenActionFactory)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"cq.wcm.msm.action.excludednodetypes=:[QUERY] "
"cq.wcm.msm.action.excludedparagraphitems=:[QUERY] "
"cq.wcm.msm.action.excludedprops=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comDayCqWcmMsmImplActionsPageMoveActionFactory)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"cq.wcm.msm.action.excludednodetypes=:[QUERY] "
"cq.wcm.msm.action.excludedparagraphitems=:[QUERY] "
"cq.wcm.msm.action.excludedprops=:[QUERY] "
"cq.wcm.msm.impl.actions.pagemove.prop_referenceUpdate=true:[QUERY] "
          "cq.wcm.msm.impl.actions.pagemove.prop_referenceUpdate=false:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comDayCqWcmMsmImplActionsReferencesUpdateActionFactory)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"cq.wcm.msm.action.excludednodetypes=:[QUERY] "
"cq.wcm.msm.action.excludedparagraphitems=:[QUERY] "
"cq.wcm.msm.action.excludedprops=:[QUERY] "
"cq.wcm.msm.impl.action.referencesupdate.prop_updateNested=true:[QUERY] "
          "cq.wcm.msm.impl.action.referencesupdate.prop_updateNested=false:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comDayCqWcmMsmImplActionsVersionCopyActionFactory)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"cq.wcm.msm.action.excludednodetypes=:[QUERY] "
"cq.wcm.msm.action.excludedparagraphitems=:[QUERY] "
"cq.wcm.msm.action.excludedprops=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comDayCqWcmMsmImplLiveRelationshipManagerImpl)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"liverelationshipmgr.relationsconfig.default=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comDayCqWcmMsmImplRolloutManagerImpl)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"event.filter=:[QUERY] "
"rolloutmgr.excludedprops.default=:[QUERY] "
"rolloutmgr.excludedparagraphprops.default=:[QUERY] "
"rolloutmgr.excludednodetypes.default=:[QUERY] "
"rolloutmgr.threadpool.maxsize=:[QUERY] "
"rolloutmgr.threadpool.maxshutdowntime=:[QUERY] "
"rolloutmgr.threadpool.priority=:[QUERY] "
"rolloutmgr.commit.size=:[QUERY] "
"rolloutmgr.conflicthandling.enabled=true:[QUERY] "
          "rolloutmgr.conflicthandling.enabled=false:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comDayCqWcmMsmImplServletsAuditLogServlet)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"auditlogservlet.default.events.count=:[QUERY] "
"auditlogservlet.default.path=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comDayCqWcmNotificationEmailImplEmailChannel)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"email.from=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comDayCqWcmNotificationImplNotificationManagerImpl)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"event.topics=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comDayCqWcmScriptingImplBVPManager)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"com.day.cq.wcm.scripting.bvp.script.engines=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comDayCqWcmUndoUndoConfig)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"cq.wcm.undo.enabled=true:[QUERY] "
          "cq.wcm.undo.enabled=false:[QUERY] "
"cq.wcm.undo.path=:[QUERY] "
"cq.wcm.undo.validity=:[QUERY] "
"cq.wcm.undo.steps=:[QUERY] "
"cq.wcm.undo.persistence=:[QUERY] "
"cq.wcm.undo.persistence.mode=true:[QUERY] "
          "cq.wcm.undo.persistence.mode=false:[QUERY] "
"cq.wcm.undo.markermode=:[QUERY] "
"cq.wcm.undo.whitelist=:[QUERY] "
"cq.wcm.undo.blacklist=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comDayCqWcmWebservicesupportImplReplicationEventListener)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"Flush agents=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comDayCqWcmWorkflowImplWcmWorkflowServiceImpl)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"event.filter=:[QUERY] "
"minThreadPoolSize=:[QUERY] "
"maxThreadPoolSize=:[QUERY] "
"cq.wcm.workflow.terminate.on.activate=true:[QUERY] "
          "cq.wcm.workflow.terminate.on.activate=false:[QUERY] "
"cq.wcm.worklfow.terminate.exclusion.list=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comDayCqWcmWorkflowImplWorkflowPackageInfoProvider)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"workflowpackageinfoprovider.filter=:[QUERY] "
"workflowpackageinfoprovider.filter.rootpath=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comDayCqWidgetImplHtmlLibraryManagerImpl)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"htmllibmanager.clientmanager=:[QUERY] "
"htmllibmanager.debug=true:[QUERY] "
          "htmllibmanager.debug=false:[QUERY] "
"htmllibmanager.debug.console=true:[QUERY] "
          "htmllibmanager.debug.console=false:[QUERY] "
"htmllibmanager.debug.init.js=:[QUERY] "
"htmllibmanager.defaultthemename=:[QUERY] "
"htmllibmanager.defaultuserthemename=:[QUERY] "
"htmllibmanager.firebuglite.path=:[QUERY] "
"htmllibmanager.forceCQUrlInfo=true:[QUERY] "
          "htmllibmanager.forceCQUrlInfo=false:[QUERY] "
"htmllibmanager.gzip=true:[QUERY] "
          "htmllibmanager.gzip=false:[QUERY] "
"htmllibmanager.maxage=:[QUERY] "
"htmllibmanager.maxDataUriSize=:[QUERY] "
"htmllibmanager.minify=true:[QUERY] "
          "htmllibmanager.minify=false:[QUERY] "
"htmllibmanager.path.list=:[QUERY] "
"htmllibmanager.timing=true:[QUERY] "
          "htmllibmanager.timing=false:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comDayCqWidgetImplWidgetExtensionProviderImpl)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"extendable.widgets=:[QUERY] "
"widgetextensionprovider.debug=true:[QUERY] "
          "widgetextensionprovider.debug=false:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comDayCqWorkflowImplEmailEMailNotificationService)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"from.address=:[QUERY] "
"host.prefix=:[QUERY] "
"notify.onabort=true:[QUERY] "
          "notify.onabort=false:[QUERY] "
"notify.oncomplete=true:[QUERY] "
          "notify.oncomplete=false:[QUERY] "
"notify.oncontainercomplete=true:[QUERY] "
          "notify.oncontainercomplete=false:[QUERY] "
"notify.useronly=true:[QUERY] "
          "notify.useronly=false:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comDayCqWorkflowImplEmailTaskEMailNotificationService)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"notify.onupdate=true:[QUERY] "
          "notify.onupdate=false:[QUERY] "
"notify.oncomplete=true:[QUERY] "
          "notify.oncomplete=false:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comDayCrxSecurityTokenImplImplTokenAuthenticationHandler)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"path=:[QUERY] "
"token.required.attr=:[QUERY] "
"token.alternate.url=:[QUERY] "
"token.encapsulated=true:[QUERY] "
          "token.encapsulated=false:[QUERY] "
"skip.token.refresh=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      comDayCrxSecurityTokenImplTokenCleanupTask)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"enable.token.cleanup.task=true:[QUERY] "
          "enable.token.cleanup.task=false:[QUERY] "
"scheduler.expression=:[QUERY] "
"batch.size=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      guideLocalizationService)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"supportedLocales=:[QUERY] "
"Localizable Properties=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      messagingUserComponentFactory)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"priority=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      orgApacheAriesJmxFrameworkStateConfig)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"attributeChangeNotificationEnabled=true:[QUERY] "
          "attributeChangeNotificationEnabled=false:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      orgApacheFelixEventadminImplEventAdmin)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"org.apache.felix.eventadmin.ThreadPoolSize=:[QUERY] "
"org.apache.felix.eventadmin.AsyncToSyncThreadRatio=:[QUERY] "
"org.apache.felix.eventadmin.Timeout=:[QUERY] "
"org.apache.felix.eventadmin.RequireTopic=true:[QUERY] "
          "org.apache.felix.eventadmin.RequireTopic=false:[QUERY] "
"org.apache.felix.eventadmin.IgnoreTimeout=:[QUERY] "
"org.apache.felix.eventadmin.IgnoreTopic=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      orgApacheFelixHttp)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"org.apache.felix.http.host=:[QUERY] "
"org.apache.felix.http.enable=true:[QUERY] "
          "org.apache.felix.http.enable=false:[QUERY] "
"org.osgi.service.http.port=:[QUERY] "
"org.apache.felix.http.timeout=:[QUERY] "
"org.apache.felix.https.enable=true:[QUERY] "
          "org.apache.felix.https.enable=false:[QUERY] "
"org.osgi.service.http.port.secure=:[QUERY] "
"org.apache.felix.https.keystore=:[QUERY] "
"org.apache.felix.https.keystore.password=:[QUERY] "
"org.apache.felix.https.keystore.key.password=:[QUERY] "
"org.apache.felix.https.truststore=:[QUERY] "
"org.apache.felix.https.truststore.password=:[QUERY] "
"org.apache.felix.https.clientcertificate=:[QUERY] "
"org.apache.felix.http.context_path=:[QUERY] "
"org.apache.felix.http.mbeans=true:[QUERY] "
          "org.apache.felix.http.mbeans=false:[QUERY] "
"org.apache.felix.http.session.timeout=:[QUERY] "
"org.apache.felix.http.jetty.threadpool.max=:[QUERY] "
"org.apache.felix.http.jetty.acceptors=:[QUERY] "
"org.apache.felix.http.jetty.selectors=:[QUERY] "
"org.apache.felix.http.jetty.headerBufferSize=:[QUERY] "
"org.apache.felix.http.jetty.requestBufferSize=:[QUERY] "
"org.apache.felix.http.jetty.responseBufferSize=:[QUERY] "
"org.apache.felix.http.jetty.maxFormSize=:[QUERY] "
"org.apache.felix.http.path_exclusions=:[QUERY] "
"org.apache.felix.https.jetty.ciphersuites.excluded=:[QUERY] "
"org.apache.felix.https.jetty.ciphersuites.included=:[QUERY] "
"org.apache.felix.http.jetty.sendServerHeader=true:[QUERY] "
          "org.apache.felix.http.jetty.sendServerHeader=false:[QUERY] "
"org.apache.felix.https.jetty.protocols.included=:[QUERY] "
"org.apache.felix.https.jetty.protocols.excluded=:[QUERY] "
"org.apache.felix.proxy.load.balancer.connection.enable=true:[QUERY] "
          "org.apache.felix.proxy.load.balancer.connection.enable=false:[QUERY] "
"org.apache.felix.https.jetty.renegotiateAllowed=true:[QUERY] "
          "org.apache.felix.https.jetty.renegotiateAllowed=false:[QUERY] "
"org.apache.felix.https.jetty.session.cookie.httpOnly=true:[QUERY] "
          "org.apache.felix.https.jetty.session.cookie.httpOnly=false:[QUERY] "
"org.apache.felix.https.jetty.session.cookie.secure=true:[QUERY] "
          "org.apache.felix.https.jetty.session.cookie.secure=false:[QUERY] "
"org.eclipse.jetty.servlet.SessionIdPathParameterName=:[QUERY] "
"org.eclipse.jetty.servlet.CheckingRemoteSessionIdEncoding=true:[QUERY] "
          "org.eclipse.jetty.servlet.CheckingRemoteSessionIdEncoding=false:[QUERY] "
"org.eclipse.jetty.servlet.SessionCookie=:[QUERY] "
"org.eclipse.jetty.servlet.SessionDomain=:[QUERY] "
"org.eclipse.jetty.servlet.SessionPath=:[QUERY] "
"org.eclipse.jetty.servlet.MaxAge=:[QUERY] "
"org.apache.felix.http.name=:[QUERY] "
"org.apache.felix.jetty.gziphandler.enable=true:[QUERY] "
          "org.apache.felix.jetty.gziphandler.enable=false:[QUERY] "
"org.apache.felix.jetty.gzip.minGzipSize=:[QUERY] "
"org.apache.felix.jetty.gzip.compressionLevel=:[QUERY] "
"org.apache.felix.jetty.gzip.inflateBufferSize=:[QUERY] "
"org.apache.felix.jetty.gzip.syncFlush=true:[QUERY] "
          "org.apache.felix.jetty.gzip.syncFlush=false:[QUERY] "
"org.apache.felix.jetty.gzip.excludedUserAgents=:[QUERY] "
"org.apache.felix.jetty.gzip.includedMethods=:[QUERY] "
"org.apache.felix.jetty.gzip.excludedMethods=:[QUERY] "
"org.apache.felix.jetty.gzip.includedPaths=:[QUERY] "
"org.apache.felix.jetty.gzip.excludedPaths=:[QUERY] "
"org.apache.felix.jetty.gzip.includedMimeTypes=:[QUERY] "
"org.apache.felix.jetty.gzip.excludedMimeTypes=:[QUERY] "
"org.apache.felix.http.session.invalidate=true:[QUERY] "
          "org.apache.felix.http.session.invalidate=false:[QUERY] "
"org.apache.felix.http.session.uniqueid=true:[QUERY] "
          "org.apache.felix.http.session.uniqueid=false:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      orgApacheFelixHttpSslfilterSslFilter)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"ssl-forward.header=:[QUERY] "
"ssl-forward.value=:[QUERY] "
"ssl-forward-cert.header=:[QUERY] "
"rewrite.absolute.urls=true:[QUERY] "
          "rewrite.absolute.urls=false:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      orgApacheFelixJaasConfigurationFactory)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"jaas.controlFlag=:[QUERY] "
"jaas.ranking=:[QUERY] "
"jaas.realmName=:[QUERY] "
"jaas.classname=:[QUERY] "
"jaas.options=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      orgApacheFelixJaasConfigurationSpi)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"jaas.defaultRealmName=:[QUERY] "
"jaas.configProviderName=:[QUERY] "
"jaas.globalConfigPolicy=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      orgApacheFelixScrScrService)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"ds.loglevel=:[QUERY] "
"ds.factory.enabled=true:[QUERY] "
          "ds.factory.enabled=false:[QUERY] "
"ds.delayed.keepInstances=true:[QUERY] "
          "ds.delayed.keepInstances=false:[QUERY] "
"ds.lock.timeout.milliseconds=:[QUERY] "
"ds.stop.timeout.milliseconds=:[QUERY] "
"ds.global.extender=true:[QUERY] "
          "ds.global.extender=false:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      orgApacheFelixSystemreadyImplComponentsCheck)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"components.list=:[QUERY] "
"type=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      orgApacheFelixSystemreadyImplFrameworkStartCheck)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"timeout=:[QUERY] "
"target.start.level=:[QUERY] "
"target.start.level.prop.name=:[QUERY] "
"type=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      orgApacheFelixSystemreadyImplServicesCheck)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"services.list=:[QUERY] "
"type=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      orgApacheFelixSystemreadyImplServletSystemAliveServlet)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"osgi.http.whiteboard.servlet.pattern=:[QUERY] "
"osgi.http.whiteboard.context.select=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      orgApacheFelixSystemreadyImplServletSystemReadyServlet)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"osgi.http.whiteboard.servlet.pattern=:[QUERY] "
"osgi.http.whiteboard.context.select=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      orgApacheFelixSystemreadySystemReadyMonitor)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"poll.interval=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      orgApacheFelixWebconsoleInternalServletOsgiManager)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"manager.root=:[QUERY] "
"http.service.filter=:[QUERY] "
"default.render=:[QUERY] "
"realm=:[QUERY] "
"username=:[QUERY] "
"password=:[QUERY] "
"category=:[QUERY] "
"locale=:[QUERY] "
"loglevel=:[QUERY] "
"plugins=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      orgApacheFelixWebconsolePluginsEventInternalPluginServlet)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"max.size=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      orgApacheFelixWebconsolePluginsMemoryusageInternalMemoryUsageCo)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"felix.memoryusage.dump.threshold=:[QUERY] "
"felix.memoryusage.dump.interval=:[QUERY] "
"felix.memoryusage.dump.location=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      orgApacheHttpProxyconfigurator)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"proxy.enabled=true:[QUERY] "
          "proxy.enabled=false:[QUERY] "
"proxy.host=:[QUERY] "
"proxy.port=:[QUERY] "
"proxy.user=:[QUERY] "
"proxy.password=:[QUERY] "
"proxy.exceptions=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      orgApacheJackrabbitOakPluginsBlobDatastoreDataStoreTextProvider)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"dir=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      orgApacheJackrabbitOakPluginsBlobDatastoreFileDataStore)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"path=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      orgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreService)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"mongouri=:[QUERY] "
"db=:[QUERY] "
"socketKeepAlive=true:[QUERY] "
          "socketKeepAlive=false:[QUERY] "
"cache=:[QUERY] "
"nodeCachePercentage=:[QUERY] "
"prevDocCachePercentage=:[QUERY] "
"childrenCachePercentage=:[QUERY] "
"diffCachePercentage=:[QUERY] "
"cacheSegmentCount=:[QUERY] "
"cacheStackMoveDistance=:[QUERY] "
"blobCacheSize=:[QUERY] "
"persistentCache=:[QUERY] "
"journalCache=:[QUERY] "
"customBlobStore=true:[QUERY] "
          "customBlobStore=false:[QUERY] "
"journalGCInterval=:[QUERY] "
"journalGCMaxAge=:[QUERY] "
"prefetchExternalChanges=true:[QUERY] "
          "prefetchExternalChanges=false:[QUERY] "
"role=:[QUERY] "
"versionGcMaxAgeInSecs=:[QUERY] "
"versionGCExpression=:[QUERY] "
"versionGCTimeLimitInSecs=:[QUERY] "
"blobGcMaxAgeInSecs=:[QUERY] "
"blobTrackSnapshotIntervalInSecs=:[QUERY] "
"repository.home=:[QUERY] "
"maxReplicationLagInSecs=:[QUERY] "
"documentStoreType=:[QUERY] "
"bundlingDisabled=true:[QUERY] "
          "bundlingDisabled=false:[QUERY] "
"updateLimit=:[QUERY] "
"persistentCacheIncludes=:[QUERY] "
"leaseCheckMode=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      orgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServicePre)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"persistentCacheIncludes=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      orgApacheJackrabbitOakPluginsDocumentSecondarySecondaryStoreCac)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"includedPaths=:[QUERY] "
"enableAsyncObserver=true:[QUERY] "
          "enableAsyncObserver=false:[QUERY] "
"observerQueueSize=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      orgApacheJackrabbitOakPluginsIndexAsyncIndexerService)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"asyncConfigs=:[QUERY] "
"leaseTimeOutMinutes=:[QUERY] "
"failingIndexTimeoutSeconds=:[QUERY] "
"errorWarnIntervalSeconds=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      orgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServ)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"disabled=true:[QUERY] "
          "disabled=false:[QUERY] "
"debug=true:[QUERY] "
          "debug=false:[QUERY] "
"localIndexDir=:[QUERY] "
"enableOpenIndexAsync=true:[QUERY] "
          "enableOpenIndexAsync=false:[QUERY] "
"threadPoolSize=:[QUERY] "
"prefetchIndexFiles=true:[QUERY] "
          "prefetchIndexFiles=false:[QUERY] "
"extractedTextCacheSizeInMB=:[QUERY] "
"extractedTextCacheExpiryInSecs=:[QUERY] "
"alwaysUsePreExtractedCache=true:[QUERY] "
          "alwaysUsePreExtractedCache=false:[QUERY] "
"booleanClauseLimit=:[QUERY] "
"enableHybridIndexing=true:[QUERY] "
          "enableHybridIndexing=false:[QUERY] "
"hybridQueueSize=:[QUERY] "
"disableStoredIndexDefinition=true:[QUERY] "
          "disableStoredIndexDefinition=false:[QUERY] "
"deletedBlobsCollectionEnabled=true:[QUERY] "
          "deletedBlobsCollectionEnabled=false:[QUERY] "
"propIndexCleanerIntervalInSecs=:[QUERY] "
"enableSingleBlobIndexFiles=true:[QUERY] "
          "enableSingleBlobIndexFiles=false:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      orgApacheJackrabbitOakPluginsIndexSolrOsgiEmbeddedSolrServerCo)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"solr.home.path=:[QUERY] "
"solr.core.name=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      orgApacheJackrabbitOakPluginsIndexSolrOsgiNodeStateSolrServers)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"enabled=true:[QUERY] "
          "enabled=false:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      orgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfiguration)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"path.desc.field=:[QUERY] "
"path.child.field=:[QUERY] "
"path.parent.field=:[QUERY] "
"path.exact.field=:[QUERY] "
"catch.all.field=:[QUERY] "
"collapsed.path.field=:[QUERY] "
"path.depth.field=:[QUERY] "
"commit.policy=:[QUERY] "
"rows=:[QUERY] "
"path.restrictions=true:[QUERY] "
          "path.restrictions=false:[QUERY] "
"property.restrictions=true:[QUERY] "
          "property.restrictions=false:[QUERY] "
"primarytypes.restrictions=true:[QUERY] "
          "primarytypes.restrictions=false:[QUERY] "
"ignored.properties=:[QUERY] "
"used.properties=:[QUERY] "
"type.mappings=:[QUERY] "
"property.mappings=:[QUERY] "
"collapse.jcrcontent.nodes=true:[QUERY] "
          "collapse.jcrcontent.nodes=false:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      orgApacheJackrabbitOakPluginsIndexSolrOsgiRemoteSolrServerConf)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"solr.http.url=:[QUERY] "
"solr.zk.host=:[QUERY] "
"solr.collection=:[QUERY] "
"solr.socket.timeout=:[QUERY] "
"solr.connection.timeout=:[QUERY] "
"solr.shards.no=:[QUERY] "
"solr.replication.factor=:[QUERY] "
"solr.conf.dir=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      orgApacheJackrabbitOakPluginsIndexSolrOsgiSolrQueryIndexProvid)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"query.aggregation=true:[QUERY] "
          "query.aggregation=false:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      orgApacheJackrabbitOakPluginsIndexSolrOsgiSolrServerProviderSe)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"server.type=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      orgApacheJackrabbitOakPluginsMetricStatisticsProviderFactory)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"providerType=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      orgApacheJackrabbitOakPluginsObservationChangeCollectorProvider)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"maxItems=:[QUERY] "
"maxPathDepth=:[QUERY] "
"enabled=true:[QUERY] "
          "enabled=false:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      orgApacheJackrabbitOakQueryQueryEngineSettingsService)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"queryLimitInMemory=:[QUERY] "
"queryLimitReads=:[QUERY] "
"queryFailTraversal=true:[QUERY] "
          "queryFailTraversal=false:[QUERY] "
"fastQuerySize=true:[QUERY] "
          "fastQuerySize=false:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      orgApacheJackrabbitOakSecurityAuthenticationAuthenticationConfig)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"org.apache.jackrabbit.oak.authentication.appName=:[QUERY] "
"org.apache.jackrabbit.oak.authentication.configSpiName=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      orgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdenti)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"provider.name=:[QUERY] "
"host.name=:[QUERY] "
"host.port=:[QUERY] "
"host.ssl=true:[QUERY] "
          "host.ssl=false:[QUERY] "
"host.tls=true:[QUERY] "
          "host.tls=false:[QUERY] "
"host.noCertCheck=true:[QUERY] "
          "host.noCertCheck=false:[QUERY] "
"bind.dn=:[QUERY] "
"bind.password=:[QUERY] "
"searchTimeout=:[QUERY] "
"adminPool.maxActive=:[QUERY] "
"adminPool.lookupOnValidate=true:[QUERY] "
          "adminPool.lookupOnValidate=false:[QUERY] "
"userPool.maxActive=:[QUERY] "
"userPool.lookupOnValidate=true:[QUERY] "
          "userPool.lookupOnValidate=false:[QUERY] "
"user.baseDN=:[QUERY] "
"user.objectclass=:[QUERY] "
"user.idAttribute=:[QUERY] "
"user.extraFilter=:[QUERY] "
"user.makeDnPath=true:[QUERY] "
          "user.makeDnPath=false:[QUERY] "
"group.baseDN=:[QUERY] "
"group.objectclass=:[QUERY] "
"group.nameAttribute=:[QUERY] "
"group.extraFilter=:[QUERY] "
"group.makeDnPath=true:[QUERY] "
          "group.makeDnPath=false:[QUERY] "
"group.memberAttribute=:[QUERY] "
"useUidForExtId=true:[QUERY] "
          "useUidForExtId=false:[QUERY] "
"customattributes=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      orgApacheJackrabbitOakSecurityAuthenticationTokenTokenConfigura)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"tokenExpiration=:[QUERY] "
"tokenLength=:[QUERY] "
"tokenRefresh=true:[QUERY] "
          "tokenRefresh=false:[QUERY] "
"tokenCleanupThreshold=:[QUERY] "
"passwordHashAlgorithm=:[QUERY] "
"passwordHashIterations=:[QUERY] "
"passwordSaltSize=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      orgApacheJackrabbitOakSecurityAuthorizationAuthorizationConfigur)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"permissionsJr2=:[QUERY] "
"importBehavior=:[QUERY] "
"readPaths=:[QUERY] "
"administrativePrincipals=:[QUERY] "
"configurationRanking=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      orgApacheJackrabbitOakSecurityInternalSecurityProviderRegistrati)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"requiredServicePids=:[QUERY] "
"authorizationCompositionType=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      orgApacheJackrabbitOakSecurityUserRandomAuthorizableNodeName)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"length=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      orgApacheJackrabbitOakSecurityUserUserConfigurationImpl)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"usersPath=:[QUERY] "
"groupsPath=:[QUERY] "
"systemRelativePath=:[QUERY] "
"defaultDepth=:[QUERY] "
"importBehavior=:[QUERY] "
"passwordHashAlgorithm=:[QUERY] "
"passwordHashIterations=:[QUERY] "
"passwordSaltSize=:[QUERY] "
"omitAdminPw=true:[QUERY] "
          "omitAdminPw=false:[QUERY] "
"supportAutoSave=true:[QUERY] "
          "supportAutoSave=false:[QUERY] "
"passwordMaxAge=:[QUERY] "
"initialPasswordChange=true:[QUERY] "
          "initialPasswordChange=false:[QUERY] "
"passwordHistorySize=:[QUERY] "
"passwordExpiryForAdmin=true:[QUERY] "
          "passwordExpiryForAdmin=false:[QUERY] "
"cacheExpiration=:[QUERY] "
"enableRFC7613UsercaseMappedProfile=true:[QUERY] "
          "enableRFC7613UsercaseMappedProfile=false:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      orgApacheJackrabbitOakSegmentAzureAzureSegmentStoreService)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"accountName=:[QUERY] "
"containerName=:[QUERY] "
"accessKey=:[QUERY] "
"rootPath=:[QUERY] "
"connectionURL=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      orgApacheJackrabbitOakSegmentSegmentNodeStoreFactory)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"repository.home=:[QUERY] "
"tarmk.mode=:[QUERY] "
"tarmk.size=:[QUERY] "
"segmentCache.size=:[QUERY] "
"stringCache.size=:[QUERY] "
"templateCache.size=:[QUERY] "
"stringDeduplicationCache.size=:[QUERY] "
"templateDeduplicationCache.size=:[QUERY] "
"nodeDeduplicationCache.size=:[QUERY] "
"pauseCompaction=true:[QUERY] "
          "pauseCompaction=false:[QUERY] "
"compaction.retryCount=:[QUERY] "
"compaction.force.timeout=:[QUERY] "
"compaction.sizeDeltaEstimation=:[QUERY] "
"compaction.disableEstimation=true:[QUERY] "
          "compaction.disableEstimation=false:[QUERY] "
"compaction.retainedGenerations=:[QUERY] "
"compaction.memoryThreshold=:[QUERY] "
"compaction.progressLog=:[QUERY] "
"standby=true:[QUERY] "
          "standby=false:[QUERY] "
"customBlobStore=true:[QUERY] "
          "customBlobStore=false:[QUERY] "
"customSegmentStore=true:[QUERY] "
          "customSegmentStore=false:[QUERY] "
"splitPersistence=true:[QUERY] "
          "splitPersistence=false:[QUERY] "
"repository.backup.dir=:[QUERY] "
"blobGcMaxAgeInSecs=:[QUERY] "
"blobTrackSnapshotIntervalInSecs=:[QUERY] "
"role=:[QUERY] "
"registerDescriptors=true:[QUERY] "
          "registerDescriptors=false:[QUERY] "
"dispatchChanges=true:[QUERY] "
          "dispatchChanges=false:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      orgApacheJackrabbitOakSegmentSegmentNodeStoreMonitorService)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"commitsTrackerWriterGroups=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      orgApacheJackrabbitOakSegmentSegmentNodeStoreService)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"repository.home=:[QUERY] "
"tarmk.mode=:[QUERY] "
"tarmk.size=:[QUERY] "
"segmentCache.size=:[QUERY] "
"stringCache.size=:[QUERY] "
"templateCache.size=:[QUERY] "
"stringDeduplicationCache.size=:[QUERY] "
"templateDeduplicationCache.size=:[QUERY] "
"nodeDeduplicationCache.size=:[QUERY] "
"pauseCompaction=true:[QUERY] "
          "pauseCompaction=false:[QUERY] "
"compaction.retryCount=:[QUERY] "
"compaction.force.timeout=:[QUERY] "
"compaction.sizeDeltaEstimation=:[QUERY] "
"compaction.disableEstimation=true:[QUERY] "
          "compaction.disableEstimation=false:[QUERY] "
"compaction.retainedGenerations=:[QUERY] "
"compaction.memoryThreshold=:[QUERY] "
"compaction.progressLog=:[QUERY] "
"standby=true:[QUERY] "
          "standby=false:[QUERY] "
"customBlobStore=true:[QUERY] "
          "customBlobStore=false:[QUERY] "
"customSegmentStore=true:[QUERY] "
          "customSegmentStore=false:[QUERY] "
"splitPersistence=true:[QUERY] "
          "splitPersistence=false:[QUERY] "
"repository.backup.dir=:[QUERY] "
"blobGcMaxAgeInSecs=:[QUERY] "
"blobTrackSnapshotIntervalInSecs=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      orgApacheJackrabbitOakSegmentStandbyStoreStandbyStoreService)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"org.apache.sling.installer.configuration.persist=true:[QUERY] "
          "org.apache.sling.installer.configuration.persist=false:[QUERY] "
"mode=:[QUERY] "
"port=:[QUERY] "
"primary.host=:[QUERY] "
"interval=:[QUERY] "
"primary.allowed-client-ip-ranges=:[QUERY] "
"secure=true:[QUERY] "
          "secure=false:[QUERY] "
"standby.readtimeout=:[QUERY] "
"standby.autoclean=true:[QUERY] "
          "standby.autoclean=false:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      orgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplDe)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"handler.name=:[QUERY] "
"user.expirationTime=:[QUERY] "
"user.autoMembership=:[QUERY] "
"user.propertyMapping=:[QUERY] "
"user.pathPrefix=:[QUERY] "
"user.membershipExpTime=:[QUERY] "
"user.membershipNestingDepth=:[QUERY] "
"user.dynamicMembership=true:[QUERY] "
          "user.dynamicMembership=false:[QUERY] "
"user.disableMissing=true:[QUERY] "
          "user.disableMissing=false:[QUERY] "
"group.expirationTime=:[QUERY] "
"group.autoMembership=:[QUERY] "
"group.propertyMapping=:[QUERY] "
"group.pathPrefix=:[QUERY] "
"enableRFC7613UsercaseMappedProfile=true:[QUERY] "
          "enableRFC7613UsercaseMappedProfile=false:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      orgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplEx)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"jaas.ranking=:[QUERY] "
"jaas.controlFlag=:[QUERY] "
"jaas.realmName=:[QUERY] "
"idp.name=:[QUERY] "
"sync.handlerName=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      orgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplPr)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"protectExternalId=true:[QUERY] "
          "protectExternalId=false:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      orgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugConfi)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"cugSupportedPaths=:[QUERY] "
"cugEnabled=true:[QUERY] "
          "cugEnabled=false:[QUERY] "
"configurationRanking=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      orgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugExclu)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"principalNames=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      orgApacheJackrabbitOakSpiSecurityUserActionDefaultAuthorizable)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"enabledActions=:[QUERY] "
"userPrivilegeNames=:[QUERY] "
"groupPrivilegeNames=:[QUERY] "
"constraint=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      orgApacheJackrabbitVaultPackagingImplPackagingImpl)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"packageRoots=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      orgApacheJackrabbitVaultPackagingRegistryImplFSPackageRegistry)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"homePath=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      orgApacheSlingAuthCoreImplLogoutServlet)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"sling.servlet.methods=:[QUERY] "
"sling.servlet.paths=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      orgApacheSlingCaconfigImplConfigurationBindingsValueProvider)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"enabled=true:[QUERY] "
          "enabled=false:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      orgApacheSlingCaconfigImplConfigurationResolverImpl)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"configBucketNames=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      orgApacheSlingCaconfigImplDefDefaultConfigurationInheritanceStra)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"enabled=true:[QUERY] "
          "enabled=false:[QUERY] "
"configPropertyInheritancePropertyNames=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      orgApacheSlingCaconfigImplDefDefaultConfigurationPersistenceStra)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"enabled=true:[QUERY] "
          "enabled=false:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      orgApacheSlingCaconfigImplOverrideOsgiConfigurationOverrideProvi)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"description=:[QUERY] "
"overrides=:[QUERY] "
"enabled=true:[QUERY] "
          "enabled=false:[QUERY] "
"service.ranking=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      orgApacheSlingCaconfigImplOverrideSystemPropertyConfigurationOve)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"enabled=true:[QUERY] "
          "enabled=false:[QUERY] "
"service.ranking=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      orgApacheSlingCaconfigManagementImplConfigurationManagementSetti)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"ignorePropertyNameRegex=:[QUERY] "
"configCollectionPropertiesResourceNames=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      orgApacheSlingCaconfigResourceImplDefDefaultConfigurationResour)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"enabled=true:[QUERY] "
          "enabled=false:[QUERY] "
"configPath=:[QUERY] "
"fallbackPaths=:[QUERY] "
"configCollectionInheritancePropertyNames=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      orgApacheSlingCaconfigResourceImplDefDefaultContextPathStrategy)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"enabled=true:[QUERY] "
          "enabled=false:[QUERY] "
"configRefResourceNames=:[QUERY] "
"configRefPropertyNames=:[QUERY] "
"service.ranking=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      orgApacheSlingCommonsHtmlInternalTagsoupHtmlParser)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"parser.features=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      orgApacheSlingCommonsLogLogManager)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"org.apache.sling.commons.log.level=:[QUERY] "
"org.apache.sling.commons.log.file=:[QUERY] "
"org.apache.sling.commons.log.file.number=:[QUERY] "
"org.apache.sling.commons.log.file.size=:[QUERY] "
"org.apache.sling.commons.log.pattern=:[QUERY] "
"org.apache.sling.commons.log.configurationFile=:[QUERY] "
"org.apache.sling.commons.log.packagingDataEnabled=true:[QUERY] "
          "org.apache.sling.commons.log.packagingDataEnabled=false:[QUERY] "
"org.apache.sling.commons.log.maxCallerDataDepth=:[QUERY] "
"org.apache.sling.commons.log.maxOldFileCountInDump=:[QUERY] "
"org.apache.sling.commons.log.numOfLines=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      orgApacheSlingCommonsLogLogManagerFactoryConfig)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"org.apache.sling.commons.log.level=:[QUERY] "
"org.apache.sling.commons.log.file=:[QUERY] "
"org.apache.sling.commons.log.pattern=:[QUERY] "
"org.apache.sling.commons.log.names=:[QUERY] "
"org.apache.sling.commons.log.additiv=true:[QUERY] "
          "org.apache.sling.commons.log.additiv=false:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      orgApacheSlingCommonsLogLogManagerFactoryWriter)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"org.apache.sling.commons.log.file=:[QUERY] "
"org.apache.sling.commons.log.file.number=:[QUERY] "
"org.apache.sling.commons.log.file.size=:[QUERY] "
"org.apache.sling.commons.log.file.buffered=true:[QUERY] "
          "org.apache.sling.commons.log.file.buffered=false:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      orgApacheSlingCommonsMetricsInternalLogReporter)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"period=:[QUERY] "
"timeUnit=:[QUERY] "
"level=:[QUERY] "
"loggerName=:[QUERY] "
"prefix=:[QUERY] "
"pattern=:[QUERY] "
"registryName=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      orgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporter)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"datasources=:[QUERY] "
"step=:[QUERY] "
"archives=:[QUERY] "
"path=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      orgApacheSlingCommonsMimeInternalMimeTypeServiceImpl)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"mime.types=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      orgApacheSlingCommonsSchedulerImplQuartzScheduler)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"poolName=:[QUERY] "
"allowedPoolNames=:[QUERY] "
"scheduler.useleaderforsingle=true:[QUERY] "
          "scheduler.useleaderforsingle=false:[QUERY] "
"metrics.filters=:[QUERY] "
"slowThresholdMillis=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      orgApacheSlingCommonsSchedulerImplSchedulerHealthCheck)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"max.quartzJob.duration.acceptable=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      orgApacheSlingCommonsThreadsImplDefaultThreadPoolFactory)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"name=:[QUERY] "
"minPoolSize=:[QUERY] "
"maxPoolSize=:[QUERY] "
"queueSize=:[QUERY] "
"maxThreadAge=:[QUERY] "
"keepAliveTime=:[QUERY] "
"blockPolicy=:[QUERY] "
"shutdownGraceful=true:[QUERY] "
          "shutdownGraceful=false:[QUERY] "
"daemon=true:[QUERY] "
          "daemon=false:[QUERY] "
"shutdownWaitTime=:[QUERY] "
"priority=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      orgApacheSlingDatasourceDataSourceFactory)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"datasource.name=:[QUERY] "
"datasource.svc.prop.name=:[QUERY] "
"driverClassName=:[QUERY] "
"url=:[QUERY] "
"username=:[QUERY] "
"password=:[QUERY] "
"defaultAutoCommit=:[QUERY] "
"defaultReadOnly=:[QUERY] "
"defaultTransactionIsolation=:[QUERY] "
"defaultCatalog=:[QUERY] "
"maxActive=:[QUERY] "
"maxIdle=:[QUERY] "
"minIdle=:[QUERY] "
"initialSize=:[QUERY] "
"maxWait=:[QUERY] "
"maxAge=:[QUERY] "
"testOnBorrow=true:[QUERY] "
          "testOnBorrow=false:[QUERY] "
"testOnReturn=true:[QUERY] "
          "testOnReturn=false:[QUERY] "
"testWhileIdle=true:[QUERY] "
          "testWhileIdle=false:[QUERY] "
"validationQuery=:[QUERY] "
"validationQueryTimeout=:[QUERY] "
"timeBetweenEvictionRunsMillis=:[QUERY] "
"minEvictableIdleTimeMillis=:[QUERY] "
"connectionProperties=:[QUERY] "
"initSQL=:[QUERY] "
"jdbcInterceptors=:[QUERY] "
"validationInterval=:[QUERY] "
"logValidationErrors=true:[QUERY] "
          "logValidationErrors=false:[QUERY] "
"datasource.svc.properties=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      orgApacheSlingDatasourceJNDIDataSourceFactory)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"datasource.name=:[QUERY] "
"datasource.svc.prop.name=:[QUERY] "
"datasource.jndi.name=:[QUERY] "
"jndi.properties=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      orgApacheSlingDiscoveryOakConfig)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"connectorPingTimeout=:[QUERY] "
"connectorPingInterval=:[QUERY] "
"discoveryLiteCheckInterval=:[QUERY] "
"clusterSyncServiceTimeout=:[QUERY] "
"clusterSyncServiceInterval=:[QUERY] "
"enableSyncToken=true:[QUERY] "
          "enableSyncToken=false:[QUERY] "
"minEventDelay=:[QUERY] "
"socketConnectTimeout=:[QUERY] "
"soTimeout=:[QUERY] "
"topologyConnectorUrls=:[QUERY] "
"topologyConnectorWhitelist=:[QUERY] "
"autoStopLocalLoopEnabled=true:[QUERY] "
          "autoStopLocalLoopEnabled=false:[QUERY] "
"gzipConnectorRequestsEnabled=true:[QUERY] "
          "gzipConnectorRequestsEnabled=false:[QUERY] "
"hmacEnabled=true:[QUERY] "
          "hmacEnabled=false:[QUERY] "
"enableEncryption=true:[QUERY] "
          "enableEncryption=false:[QUERY] "
"sharedKey=:[QUERY] "
"hmacSharedKeyTTL=:[QUERY] "
"backoffStandbyFactor=:[QUERY] "
"backoffStableFactor=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      orgApacheSlingDiscoveryOakSynchronizedClocksHealthCheck)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"hc.name=:[QUERY] "
"hc.tags=:[QUERY] "
"hc.mbean.name=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      orgApacheSlingDistributionAgentImplForwardDistributionAgentFacto)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"name=:[QUERY] "
"title=:[QUERY] "
"details=:[QUERY] "
"enabled=true:[QUERY] "
          "enabled=false:[QUERY] "
"serviceName=:[QUERY] "
"log.level=:[QUERY] "
"allowed.roots=:[QUERY] "
"queue.processing.enabled=true:[QUERY] "
          "queue.processing.enabled=false:[QUERY] "
"packageImporter.endpoints=:[QUERY] "
"passiveQueues=:[QUERY] "
"priorityQueues=:[QUERY] "
"retry.strategy=:[QUERY] "
"retry.attempts=:[QUERY] "
"requestAuthorizationStrategy.target=:[QUERY] "
"transportSecretProvider.target=:[QUERY] "
"packageBuilder.target=:[QUERY] "
"triggers.target=:[QUERY] "
"queue.provider=:[QUERY] "
"async.delivery=true:[QUERY] "
          "async.delivery=false:[QUERY] "
"http.conn.timeout=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      orgApacheSlingDistributionAgentImplPrivilegeDistributionRequestA)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"name=:[QUERY] "
"jcrPrivilege=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      orgApacheSlingDistributionAgentImplQueueDistributionAgentFactory)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"name=:[QUERY] "
"title=:[QUERY] "
"details=:[QUERY] "
"enabled=true:[QUERY] "
          "enabled=false:[QUERY] "
"serviceName=:[QUERY] "
"log.level=:[QUERY] "
"allowed.roots=:[QUERY] "
"requestAuthorizationStrategy.target=:[QUERY] "
"queueProviderFactory.target=:[QUERY] "
"packageBuilder.target=:[QUERY] "
"triggers.target=:[QUERY] "
"priorityQueues=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      orgApacheSlingDistributionAgentImplReverseDistributionAgentFacto)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"name=:[QUERY] "
"title=:[QUERY] "
"details=:[QUERY] "
"enabled=true:[QUERY] "
          "enabled=false:[QUERY] "
"serviceName=:[QUERY] "
"log.level=:[QUERY] "
"queue.processing.enabled=true:[QUERY] "
          "queue.processing.enabled=false:[QUERY] "
"packageExporter.endpoints=:[QUERY] "
"pull.items=:[QUERY] "
"http.conn.timeout=:[QUERY] "
"requestAuthorizationStrategy.target=:[QUERY] "
"transportSecretProvider.target=:[QUERY] "
"packageBuilder.target=:[QUERY] "
"triggers.target=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      orgApacheSlingDistributionAgentImplSimpleDistributionAgentFactor)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"name=:[QUERY] "
"title=:[QUERY] "
"details=:[QUERY] "
"enabled=true:[QUERY] "
          "enabled=false:[QUERY] "
"serviceName=:[QUERY] "
"log.level=:[QUERY] "
"queue.processing.enabled=true:[QUERY] "
          "queue.processing.enabled=false:[QUERY] "
"packageExporter.target=:[QUERY] "
"packageImporter.target=:[QUERY] "
"requestAuthorizationStrategy.target=:[QUERY] "
"triggers.target=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      orgApacheSlingDistributionAgentImplSyncDistributionAgentFactory)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"name=:[QUERY] "
"title=:[QUERY] "
"details=:[QUERY] "
"enabled=true:[QUERY] "
          "enabled=false:[QUERY] "
"serviceName=:[QUERY] "
"log.level=:[QUERY] "
"queue.processing.enabled=true:[QUERY] "
          "queue.processing.enabled=false:[QUERY] "
"passiveQueues=:[QUERY] "
"packageExporter.endpoints=:[QUERY] "
"packageImporter.endpoints=:[QUERY] "
"retry.strategy=:[QUERY] "
"retry.attempts=:[QUERY] "
"pull.items=:[QUERY] "
"http.conn.timeout=:[QUERY] "
"requestAuthorizationStrategy.target=:[QUERY] "
"transportSecretProvider.target=:[QUERY] "
"packageBuilder.target=:[QUERY] "
"triggers.target=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      orgApacheSlingDistributionMonitorDistributionQueueHealthCheck)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"hc.name=:[QUERY] "
"hc.tags=:[QUERY] "
"hc.mbean.name=:[QUERY] "
"numberOfRetriesAllowed=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      orgApacheSlingDistributionPackagingImplExporterAgentDistributio)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"name=:[QUERY] "
"queue=:[QUERY] "
"drop.invalid.items=true:[QUERY] "
          "drop.invalid.items=false:[QUERY] "
"agent.target=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      orgApacheSlingDistributionPackagingImplExporterLocalDistributio)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"name=:[QUERY] "
"packageBuilder.target=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      orgApacheSlingDistributionPackagingImplExporterRemoteDistributi)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"name=:[QUERY] "
"endpoints=:[QUERY] "
"pull.items=:[QUERY] "
"packageBuilder.target=:[QUERY] "
"transportSecretProvider.target=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      orgApacheSlingDistributionPackagingImplImporterLocalDistributio)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"name=:[QUERY] "
"packageBuilder.target=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      orgApacheSlingDistributionPackagingImplImporterRemoteDistributi)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"name=:[QUERY] "
"endpoints=:[QUERY] "
"transportSecretProvider.target=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      orgApacheSlingDistributionPackagingImplImporterRepositoryDistri)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"name=:[QUERY] "
"service.name=:[QUERY] "
"path=:[QUERY] "
"privilege.name=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      orgApacheSlingDistributionResourcesImplDistributionConfiguration)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"provider.roots=:[QUERY] "
"kind=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      orgApacheSlingDistributionResourcesImplDistributionServiceResour)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"provider.roots=:[QUERY] "
"kind=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      orgApacheSlingDistributionSerializationImplDistributionPackageBu)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"name=:[QUERY] "
"type=:[QUERY] "
"format.target=:[QUERY] "
"tempFsFolder=:[QUERY] "
"fileThreshold=:[QUERY] "
"memoryUnit=:[QUERY] "
"useOffHeapMemory=true:[QUERY] "
          "useOffHeapMemory=false:[QUERY] "
"digestAlgorithm=:[QUERY] "
"monitoringQueueSize=:[QUERY] "
"cleanupDelay=:[QUERY] "
"package.filters=:[QUERY] "
"property.filters=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      orgApacheSlingDistributionSerializationImplVltVaultDistribution)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"name=:[QUERY] "
"type=:[QUERY] "
"importMode=:[QUERY] "
"aclHandling=:[QUERY] "
"package.roots=:[QUERY] "
"package.filters=:[QUERY] "
"property.filters=:[QUERY] "
"tempFsFolder=:[QUERY] "
"useBinaryReferences=true:[QUERY] "
          "useBinaryReferences=false:[QUERY] "
"autoSaveThreshold=:[QUERY] "
"cleanupDelay=:[QUERY] "
"fileThreshold=:[QUERY] "
"MEGA_BYTES=:[QUERY] "
"useOffHeapMemory=true:[QUERY] "
          "useOffHeapMemory=false:[QUERY] "
"digestAlgorithm=:[QUERY] "
"monitoringQueueSize=:[QUERY] "
"pathsMapping=:[QUERY] "
"strictImport=true:[QUERY] "
          "strictImport=false:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      orgApacheSlingDistributionTransportImplUserCredentialsDistributi)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"name=:[QUERY] "
"username=:[QUERY] "
"password=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      orgApacheSlingDistributionTriggerImplDistributionEventDistribute)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"name=:[QUERY] "
"path=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      orgApacheSlingDistributionTriggerImplJcrEventDistributionTrigger)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"name=:[QUERY] "
"path=:[QUERY] "
"ignoredPathsPatterns=:[QUERY] "
"serviceName=:[QUERY] "
"deep=true:[QUERY] "
          "deep=false:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      orgApacheSlingDistributionTriggerImplPersistedJcrEventDistributi)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"name=:[QUERY] "
"path=:[QUERY] "
"serviceName=:[QUERY] "
"nuggetsPath=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      orgApacheSlingDistributionTriggerImplRemoteEventDistributionTrig)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"name=:[QUERY] "
"endpoint=:[QUERY] "
"transportSecretProvider.target=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      orgApacheSlingDistributionTriggerImplResourceEventDistributionTr)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"name=:[QUERY] "
"path=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      orgApacheSlingDistributionTriggerImplScheduledDistributionTrigge)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"name=:[QUERY] "
"path=:[QUERY] "
"seconds=:[QUERY] "
"serviceName=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      orgApacheSlingEngineImplAuthSlingAuthenticator)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"osgi.http.whiteboard.context.select=:[QUERY] "
"osgi.http.whiteboard.listener=:[QUERY] "
"auth.sudo.cookie=:[QUERY] "
"auth.sudo.parameter=:[QUERY] "
"auth.annonymous=true:[QUERY] "
          "auth.annonymous=false:[QUERY] "
"sling.auth.requirements=:[QUERY] "
"sling.auth.anonymous.user=:[QUERY] "
"sling.auth.anonymous.password=:[QUERY] "
"auth.http=:[QUERY] "
"auth.http.realm=:[QUERY] "
"auth.uri.suffix=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      orgApacheSlingEngineImplDebugRequestProgressTrackerLogFilter)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"extensions=:[QUERY] "
"minDurationMs=:[QUERY] "
"maxDurationMs=:[QUERY] "
"compactLogFormat=true:[QUERY] "
          "compactLogFormat=false:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      orgApacheSlingEngineImplLogRequestLogger)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"request.log.output=:[QUERY] "
"request.log.outputtype=:[QUERY] "
"request.log.enabled=true:[QUERY] "
          "request.log.enabled=false:[QUERY] "
"access.log.output=:[QUERY] "
"access.log.outputtype=:[QUERY] "
"access.log.enabled=true:[QUERY] "
          "access.log.enabled=false:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      orgApacheSlingEngineImplLogRequestLoggerService)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"request.log.service.format=:[QUERY] "
"request.log.service.output=:[QUERY] "
"request.log.service.outputtype=:[QUERY] "
"request.log.service.onentry=true:[QUERY] "
          "request.log.service.onentry=false:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      orgApacheSlingEngineImplSlingMainServlet)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"sling.max.calls=:[QUERY] "
"sling.max.inclusions=:[QUERY] "
"sling.trace.allow=true:[QUERY] "
          "sling.trace.allow=false:[QUERY] "
"sling.max.record.requests=:[QUERY] "
"sling.store.pattern.requests=:[QUERY] "
"sling.serverinfo=:[QUERY] "
"sling.additional.response.headers=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      orgApacheSlingEngineParameters)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"sling.default.parameter.encoding=:[QUERY] "
"sling.default.max.parameters=:[QUERY] "
"file.location=:[QUERY] "
"file.threshold=:[QUERY] "
"file.max=:[QUERY] "
"request.max=:[QUERY] "
"sling.default.parameter.checkForAdditionalContainerParameters=true:[QUERY] "
          "sling.default.parameter.checkForAdditionalContainerParameters=false:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      orgApacheSlingEventImplEventingThreadPool)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"minPoolSize=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      orgApacheSlingEventImplJobsDefaultJobManager)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"queue.priority=:[QUERY] "
"queue.retries=:[QUERY] "
"queue.retrydelay=:[QUERY] "
"queue.maxparallel=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      orgApacheSlingEventImplJobsJcrPersistenceHandler)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"job.consumermanager.disableDistribution=true:[QUERY] "
          "job.consumermanager.disableDistribution=false:[QUERY] "
"startup.delay=:[QUERY] "
"cleanup.period=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      orgApacheSlingEventImplJobsJobConsumerManager)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"org.apache.sling.installer.configuration.persist=true:[QUERY] "
          "org.apache.sling.installer.configuration.persist=false:[QUERY] "
"job.consumermanager.whitelist=:[QUERY] "
"job.consumermanager.blacklist=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      orgApacheSlingEventJobsQueueConfiguration)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"queue.name=:[QUERY] "
"queue.topics=:[QUERY] "
"queue.type=:[QUERY] "
"queue.priority=:[QUERY] "
"queue.retries=:[QUERY] "
"queue.retrydelay=:[QUERY] "
"queue.maxparallel=:[QUERY] "
"queue.keepJobs=true:[QUERY] "
          "queue.keepJobs=false:[QUERY] "
"queue.preferRunOnCreationInstance=true:[QUERY] "
          "queue.preferRunOnCreationInstance=false:[QUERY] "
"queue.threadPoolSize=:[QUERY] "
"service.ranking=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      orgApacheSlingExtensionsWebconsolesecurityproviderInternalSlingW)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"users=:[QUERY] "
"groups=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      orgApacheSlingFeatureflagsFeature)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"name=:[QUERY] "
"description=:[QUERY] "
"enabled=true:[QUERY] "
          "enabled=false:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      orgApacheSlingFeatureflagsImplConfiguredFeature)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"name=:[QUERY] "
"description=:[QUERY] "
"enabled=true:[QUERY] "
          "enabled=false:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      orgApacheSlingHapiImplHApiUtilImpl)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"org.apache.sling.hapi.tools.resourcetype=:[QUERY] "
"org.apache.sling.hapi.tools.collectionresourcetype=:[QUERY] "
"org.apache.sling.hapi.tools.searchpaths=:[QUERY] "
"org.apache.sling.hapi.tools.externalurl=:[QUERY] "
"org.apache.sling.hapi.tools.enabled=true:[QUERY] "
          "org.apache.sling.hapi.tools.enabled=false:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      orgApacheSlingHcCoreImplCompositeHealthCheck)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"hc.name=:[QUERY] "
"hc.tags=:[QUERY] "
"hc.mbean.name=:[QUERY] "
"filter.tags=:[QUERY] "
"filter.combineTagsWithOr=true:[QUERY] "
          "filter.combineTagsWithOr=false:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      orgApacheSlingHcCoreImplExecutorHealthCheckExecutorImpl)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"timeoutInMs=:[QUERY] "
"longRunningFutureThresholdForCriticalMs=:[QUERY] "
"resultCacheTtlInMs=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      orgApacheSlingHcCoreImplJmxAttributeHealthCheck)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"hc.name=:[QUERY] "
"hc.tags=:[QUERY] "
"hc.mbean.name=:[QUERY] "
"mbean.name=:[QUERY] "
"attribute.name=:[QUERY] "
"attribute.value.constraint=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      orgApacheSlingHcCoreImplScriptableHealthCheck)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"hc.name=:[QUERY] "
"hc.tags=:[QUERY] "
"hc.mbean.name=:[QUERY] "
"expression=:[QUERY] "
"language.extension=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      orgApacheSlingHcCoreImplServletHealthCheckExecutorServlet)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"servletPath=:[QUERY] "
"disabled=true:[QUERY] "
          "disabled=false:[QUERY] "
"cors.accessControlAllowOrigin=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      orgApacheSlingHcCoreImplServletResultTxtVerboseSerializer)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"totalWidth=:[QUERY] "
"colWidthName=:[QUERY] "
"colWidthResult=:[QUERY] "
"colWidthTiming=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      orgApacheSlingI18nImplI18NFilter)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"service.ranking=:[QUERY] "
"sling.filter.scope=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      orgApacheSlingI18nImplJcrResourceBundleProvider)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"locale.default=:[QUERY] "
"preload.bundles=true:[QUERY] "
          "preload.bundles=false:[QUERY] "
"invalidation.delay=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      orgApacheSlingInstallerProviderJcrImplJcrInstaller)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"handler.schemes=:[QUERY] "
"sling.jcrinstall.folder.name.regexp=:[QUERY] "
"sling.jcrinstall.folder.max.depth=:[QUERY] "
"sling.jcrinstall.search.path=:[QUERY] "
"sling.jcrinstall.new.config.path=:[QUERY] "
"sling.jcrinstall.signal.path=:[QUERY] "
"sling.jcrinstall.enable.writeback=true:[QUERY] "
          "sling.jcrinstall.enable.writeback=false:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      orgApacheSlingJcrBaseInternalLoginAdminWhitelist)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"whitelist.bypass=true:[QUERY] "
          "whitelist.bypass=false:[QUERY] "
"whitelist.bundles.regexp=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      orgApacheSlingJcrBaseInternalLoginAdminWhitelistFragment)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"whitelist.name=:[QUERY] "
"whitelist.bundles=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      orgApacheSlingJcrDavexImplServletsSlingDavExServlet)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"alias=:[QUERY] "
"dav.create-absolute-uri=true:[QUERY] "
          "dav.create-absolute-uri=false:[QUERY] "
"dav.protectedhandlers=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      orgApacheSlingJcrJackrabbitServerJndiRegistrationSupport)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"java.naming.factory.initial=:[QUERY] "
"java.naming.provider.url=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      orgApacheSlingJcrJackrabbitServerRmiRegistrationSupport)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"port=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      orgApacheSlingJcrRepoinitImplRepositoryInitializer)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"references=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      orgApacheSlingJcrRepoinitRepositoryInitializer)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"references=:[QUERY] "
"scripts=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      orgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImpl)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"resource.resolver.searchpath=:[QUERY] "
"resource.resolver.manglenamespaces=true:[QUERY] "
          "resource.resolver.manglenamespaces=false:[QUERY] "
"resource.resolver.allowDirect=true:[QUERY] "
          "resource.resolver.allowDirect=false:[QUERY] "
"resource.resolver.required.providers=:[QUERY] "
"resource.resolver.required.providernames=:[QUERY] "
"resource.resolver.virtual=:[QUERY] "
"resource.resolver.mapping=:[QUERY] "
"resource.resolver.map.location=:[QUERY] "
"resource.resolver.map.observation=:[QUERY] "
"resource.resolver.default.vanity.redirect.status=:[QUERY] "
"resource.resolver.enable.vanitypath=true:[QUERY] "
          "resource.resolver.enable.vanitypath=false:[QUERY] "
"resource.resolver.vanitypath.maxEntries=:[QUERY] "
"resource.resolver.vanitypath.maxEntries.startup=true:[QUERY] "
          "resource.resolver.vanitypath.maxEntries.startup=false:[QUERY] "
"resource.resolver.vanitypath.bloomfilter.maxBytes=:[QUERY] "
"resource.resolver.optimize.alias.resolution=true:[QUERY] "
          "resource.resolver.optimize.alias.resolution=false:[QUERY] "
"resource.resolver.vanitypath.whitelist=:[QUERY] "
"resource.resolver.vanitypath.blacklist=:[QUERY] "
"resource.resolver.vanity.precedence=true:[QUERY] "
          "resource.resolver.vanity.precedence=false:[QUERY] "
"resource.resolver.providerhandling.paranoid=true:[QUERY] "
          "resource.resolver.providerhandling.paranoid=false:[QUERY] "
"resource.resolver.log.closing=true:[QUERY] "
          "resource.resolver.log.closing=false:[QUERY] "
"resource.resolver.log.unclosed=true:[QUERY] "
          "resource.resolver.log.unclosed=false:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      orgApacheSlingJcrResourceInternalJcrSystemUserValidator)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"allow.only.system.user=true:[QUERY] "
          "allow.only.system.user=false:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      orgApacheSlingJcrResourcesecurityImplResourceAccessGateFactory)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"path=:[QUERY] "
"checkpath.prefix=:[QUERY] "
"jcrPath=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      orgApacheSlingJcrWebdavImplHandlerDefaultHandlerService)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"service.ranking=:[QUERY] "
"type.collections=:[QUERY] "
"type.noncollections=:[QUERY] "
"type.content=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      orgApacheSlingJcrWebdavImplHandlerDirListingExportHandlerServic)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"service.ranking=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      orgApacheSlingJcrWebdavImplServletsSimpleWebDavServlet)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"dav.root=:[QUERY] "
"dav.create-absolute-uri=true:[QUERY] "
          "dav.create-absolute-uri=false:[QUERY] "
"dav.realm=:[QUERY] "
"collection.types=:[QUERY] "
"filter.prefixes=:[QUERY] "
"filter.types=:[QUERY] "
"filter.uris=:[QUERY] "
"type.collections=:[QUERY] "
"type.noncollections=:[QUERY] "
"type.content=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      orgApacheSlingJmxProviderImplJMXResourceProvider)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"provider.roots=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      orgApacheSlingModelsImplModelAdapterFactory)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"osgi.http.whiteboard.listener=:[QUERY] "
"osgi.http.whiteboard.context.select=:[QUERY] "
"max.recursion.depth=:[QUERY] "
"cleanup.job.period=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      orgApacheSlingModelsJacksonexporterImplResourceModuleProvider)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"max.recursion.levels=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      orgApacheSlingResourceInventoryImplResourceInventoryPrinterFacto)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"felix.inventory.printer.name=:[QUERY] "
"felix.inventory.printer.title=:[QUERY] "
"path=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      orgApacheSlingResourcemergerImplMergedResourceProviderFactory)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"merge.root=:[QUERY] "
"merge.readOnly=true:[QUERY] "
          "merge.readOnly=false:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      orgApacheSlingResourcemergerPickerOverriding)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"merge.root=:[QUERY] "
"merge.readOnly=true:[QUERY] "
          "merge.readOnly=false:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      orgApacheSlingScriptingCoreImplScriptCacheImpl)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"org.apache.sling.scripting.cache.size=:[QUERY] "
"org.apache.sling.scripting.cache.additional_extensions=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      orgApacheSlingScriptingCoreImplScriptingResourceResolverProvider)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"log.stacktrace.onclose=true:[QUERY] "
          "log.stacktrace.onclose=false:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      orgApacheSlingScriptingJavaImplJavaScriptEngineFactory)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"java.classdebuginfo=true:[QUERY] "
          "java.classdebuginfo=false:[QUERY] "
"java.javaEncoding=:[QUERY] "
"java.compilerSourceVM=:[QUERY] "
"java.compilerTargetVM=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      orgApacheSlingScriptingJavascriptInternalRhinoJavaScriptEngineFa)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"org.apache.sling.scripting.javascript.rhino.optLevel=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      orgApacheSlingScriptingJspJspScriptEngineFactory)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"jasper.compilerTargetVM=:[QUERY] "
"jasper.compilerSourceVM=:[QUERY] "
"jasper.classdebuginfo=true:[QUERY] "
          "jasper.classdebuginfo=false:[QUERY] "
"jasper.enablePooling=true:[QUERY] "
          "jasper.enablePooling=false:[QUERY] "
"jasper.ieClassId=:[QUERY] "
"jasper.genStringAsCharArray=true:[QUERY] "
          "jasper.genStringAsCharArray=false:[QUERY] "
"jasper.keepgenerated=true:[QUERY] "
          "jasper.keepgenerated=false:[QUERY] "
"jasper.mappedfile=true:[QUERY] "
          "jasper.mappedfile=false:[QUERY] "
"jasper.trimSpaces=true:[QUERY] "
          "jasper.trimSpaces=false:[QUERY] "
"jasper.displaySourceFragments=true:[QUERY] "
          "jasper.displaySourceFragments=false:[QUERY] "
"default.is.session=true:[QUERY] "
          "default.is.session=false:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      orgApacheSlingScriptingSightlyJsImplJsapiSlyBindingsValuesProv)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"org.apache.sling.scripting.sightly.js.bindings=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      orgApacheSlingSecurityImplContentDispositionFilter)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"sling.content.disposition.paths=:[QUERY] "
"sling.content.disposition.excluded.paths=:[QUERY] "
"sling.content.disposition.all.paths=true:[QUERY] "
          "sling.content.disposition.all.paths=false:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      orgApacheSlingSecurityImplReferrerFilter)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"allow.empty=true:[QUERY] "
          "allow.empty=false:[QUERY] "
"allow.hosts=:[QUERY] "
"allow.hosts.regexp=:[QUERY] "
"filter.methods=:[QUERY] "
"exclude.agents.regexp=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      orgApacheSlingServiceusermappingImplServiceUserMapperImpl)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"user.mapping=:[QUERY] "
"user.default=:[QUERY] "
"user.enable.default.mapping=true:[QUERY] "
          "user.enable.default.mapping=false:[QUERY] "
"require.validation=true:[QUERY] "
          "require.validation=false:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      orgApacheSlingServiceusermappingImplServiceUserMapperImplAmended)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"service.ranking=:[QUERY] "
"user.mapping=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      orgApacheSlingServletsGetDefaultGetServlet)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"aliases=:[QUERY] "
"index=true:[QUERY] "
          "index=false:[QUERY] "
"index.files=:[QUERY] "
"enable.html=true:[QUERY] "
          "enable.html=false:[QUERY] "
"enable.json=true:[QUERY] "
          "enable.json=false:[QUERY] "
"enable.txt=true:[QUERY] "
          "enable.txt=false:[QUERY] "
"enable.xml=true:[QUERY] "
          "enable.xml=false:[QUERY] "
"json.maximumresults=:[QUERY] "
"ecmaSuport=true:[QUERY] "
          "ecmaSuport=false:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      orgApacheSlingServletsGetImplVersionVersionInfoServlet)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"sling.servlet.selectors=:[QUERY] "
"ecmaSuport=true:[QUERY] "
          "ecmaSuport=false:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      orgApacheSlingServletsPostImplHelperChunkCleanUpTask)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"scheduler.expression=:[QUERY] "
"scheduler.concurrent=true:[QUERY] "
          "scheduler.concurrent=false:[QUERY] "
"chunk.cleanup.age=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      orgApacheSlingServletsPostImplSlingPostServlet)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"servlet.post.dateFormats=:[QUERY] "
"servlet.post.nodeNameHints=:[QUERY] "
"servlet.post.nodeNameMaxLength=:[QUERY] "
"servlet.post.checkinNewVersionableNodes=true:[QUERY] "
          "servlet.post.checkinNewVersionableNodes=false:[QUERY] "
"servlet.post.autoCheckout=true:[QUERY] "
          "servlet.post.autoCheckout=false:[QUERY] "
"servlet.post.autoCheckin=true:[QUERY] "
          "servlet.post.autoCheckin=false:[QUERY] "
"servlet.post.ignorePattern=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      orgApacheSlingServletsResolverSlingServletResolver)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"servletresolver.servletRoot=:[QUERY] "
"servletresolver.cacheSize=:[QUERY] "
"servletresolver.paths=:[QUERY] "
"servletresolver.defaultExtensions=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      orgApacheSlingSettingsImplSlingSettingsServiceImpl)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"sling.name=:[QUERY] "
"sling.description=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      orgApacheSlingStartupfilterImplStartupFilterImpl)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"active.by.default=true:[QUERY] "
          "active.by.default=false:[QUERY] "
"default.message=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      orgApacheSlingTenantInternalTenantProviderImpl)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"tenant.root=:[QUERY] "
"tenant.path.matcher=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      orgApacheSlingTracerInternalLogTracer)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"tracerSets=:[QUERY] "
"enabled=true:[QUERY] "
          "enabled=false:[QUERY] "
"servletEnabled=true:[QUERY] "
          "servletEnabled=false:[QUERY] "
"recordingCacheSizeInMB=:[QUERY] "
"recordingCacheDurationInSecs=:[QUERY] "
"recordingCompressionEnabled=true:[QUERY] "
          "recordingCompressionEnabled=false:[QUERY] "
"gzipResponse=true:[QUERY] "
          "gzipResponse=false:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      orgApacheSlingXssImplXSSFilterImpl)
        local -a _op_arguments
        _op_arguments=(
                    "post=true:[QUERY] "
          "post=false:[QUERY] "
"apply=true:[QUERY] "
          "apply=false:[QUERY] "
"delete=true:[QUERY] "
          "delete=false:[QUERY] "
"action=:[QUERY] "
"$location=:[QUERY] "
"propertylist=:[QUERY] "
"policyPath=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
    esac
    ;;

esac

return ret
