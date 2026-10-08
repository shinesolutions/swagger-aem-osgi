

#include "OrgApacheFelixHttpProperties.h"

using namespace Tiny;

OrgApacheFelixHttpProperties::OrgApacheFelixHttpProperties()
{
	orgapachefelixhttphost = ConfigNodePropertyString();
	orgapachefelixhttpenable = ConfigNodePropertyBoolean();
	orgosgiservicehttpport = ConfigNodePropertyInteger();
	orgapachefelixhttptimeout = ConfigNodePropertyInteger();
	orgapachefelixhttpsenable = ConfigNodePropertyBoolean();
	orgosgiservicehttpportsecure = ConfigNodePropertyInteger();
	orgapachefelixhttpskeystore = ConfigNodePropertyString();
	orgapachefelixhttpskeystorepassword = ConfigNodePropertyString();
	orgapachefelixhttpskeystorekeypassword = ConfigNodePropertyString();
	orgapachefelixhttpstruststore = ConfigNodePropertyString();
	orgapachefelixhttpstruststorepassword = ConfigNodePropertyString();
	orgapachefelixhttpsclientcertificate = ConfigNodePropertyDropDown();
	orgapachefelixhttpcontext_path = ConfigNodePropertyString();
	orgapachefelixhttpmbeans = ConfigNodePropertyBoolean();
	orgapachefelixhttpsessiontimeout = ConfigNodePropertyInteger();
	orgapachefelixhttpjettythreadpoolmax = ConfigNodePropertyInteger();
	orgapachefelixhttpjettyacceptors = ConfigNodePropertyInteger();
	orgapachefelixhttpjettyselectors = ConfigNodePropertyInteger();
	orgapachefelixhttpjettyheaderBufferSize = ConfigNodePropertyInteger();
	orgapachefelixhttpjettyrequestBufferSize = ConfigNodePropertyInteger();
	orgapachefelixhttpjettyresponseBufferSize = ConfigNodePropertyInteger();
	orgapachefelixhttpjettymaxFormSize = ConfigNodePropertyInteger();
	orgapachefelixhttppath_exclusions = ConfigNodePropertyArray();
	orgapachefelixhttpsjettyciphersuitesexcluded = ConfigNodePropertyArray();
	orgapachefelixhttpsjettyciphersuitesincluded = ConfigNodePropertyArray();
	orgapachefelixhttpjettysendServerHeader = ConfigNodePropertyBoolean();
	orgapachefelixhttpsjettyprotocolsincluded = ConfigNodePropertyArray();
	orgapachefelixhttpsjettyprotocolsexcluded = ConfigNodePropertyArray();
	orgapachefelixproxyloadbalancerconnectionenable = ConfigNodePropertyBoolean();
	orgapachefelixhttpsjettyrenegotiateAllowed = ConfigNodePropertyBoolean();
	orgapachefelixhttpsjettysessioncookiehttpOnly = ConfigNodePropertyBoolean();
	orgapachefelixhttpsjettysessioncookiesecure = ConfigNodePropertyBoolean();
	orgeclipsejettyservletSessionIdPathParameterName = ConfigNodePropertyString();
	orgeclipsejettyservletCheckingRemoteSessionIdEncoding = ConfigNodePropertyBoolean();
	orgeclipsejettyservletSessionCookie = ConfigNodePropertyString();
	orgeclipsejettyservletSessionDomain = ConfigNodePropertyString();
	orgeclipsejettyservletSessionPath = ConfigNodePropertyString();
	orgeclipsejettyservletMaxAge = ConfigNodePropertyInteger();
	orgapachefelixhttpname = ConfigNodePropertyString();
	orgapachefelixjettygziphandlerenable = ConfigNodePropertyBoolean();
	orgapachefelixjettygzipminGzipSize = ConfigNodePropertyInteger();
	orgapachefelixjettygzipcompressionLevel = ConfigNodePropertyInteger();
	orgapachefelixjettygzipinflateBufferSize = ConfigNodePropertyInteger();
	orgapachefelixjettygzipsyncFlush = ConfigNodePropertyBoolean();
	orgapachefelixjettygzipexcludedUserAgents = ConfigNodePropertyArray();
	orgapachefelixjettygzipincludedMethods = ConfigNodePropertyArray();
	orgapachefelixjettygzipexcludedMethods = ConfigNodePropertyArray();
	orgapachefelixjettygzipincludedPaths = ConfigNodePropertyArray();
	orgapachefelixjettygzipexcludedPaths = ConfigNodePropertyArray();
	orgapachefelixjettygzipincludedMimeTypes = ConfigNodePropertyArray();
	orgapachefelixjettygzipexcludedMimeTypes = ConfigNodePropertyArray();
	orgapachefelixhttpsessioninvalidate = ConfigNodePropertyBoolean();
	orgapachefelixhttpsessionuniqueid = ConfigNodePropertyBoolean();
}

OrgApacheFelixHttpProperties::OrgApacheFelixHttpProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

OrgApacheFelixHttpProperties::~OrgApacheFelixHttpProperties()
{

}

void
OrgApacheFelixHttpProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *orgapachefelixhttphostKey = "org.apache.felix.http.host";

    if(object.has_key(orgapachefelixhttphostKey))
    {
        bourne::json value = object[orgapachefelixhttphostKey];




        ConfigNodePropertyString* obj = &orgapachefelixhttphost;
		obj->fromJson(value.dump());

    }

    const char *orgapachefelixhttpenableKey = "org.apache.felix.http.enable";

    if(object.has_key(orgapachefelixhttpenableKey))
    {
        bourne::json value = object[orgapachefelixhttpenableKey];




        ConfigNodePropertyBoolean* obj = &orgapachefelixhttpenable;
		obj->fromJson(value.dump());

    }

    const char *orgosgiservicehttpportKey = "org.osgi.service.http.port";

    if(object.has_key(orgosgiservicehttpportKey))
    {
        bourne::json value = object[orgosgiservicehttpportKey];




        ConfigNodePropertyInteger* obj = &orgosgiservicehttpport;
		obj->fromJson(value.dump());

    }

    const char *orgapachefelixhttptimeoutKey = "org.apache.felix.http.timeout";

    if(object.has_key(orgapachefelixhttptimeoutKey))
    {
        bourne::json value = object[orgapachefelixhttptimeoutKey];




        ConfigNodePropertyInteger* obj = &orgapachefelixhttptimeout;
		obj->fromJson(value.dump());

    }

    const char *orgapachefelixhttpsenableKey = "org.apache.felix.https.enable";

    if(object.has_key(orgapachefelixhttpsenableKey))
    {
        bourne::json value = object[orgapachefelixhttpsenableKey];




        ConfigNodePropertyBoolean* obj = &orgapachefelixhttpsenable;
		obj->fromJson(value.dump());

    }

    const char *orgosgiservicehttpportsecureKey = "org.osgi.service.http.port.secure";

    if(object.has_key(orgosgiservicehttpportsecureKey))
    {
        bourne::json value = object[orgosgiservicehttpportsecureKey];




        ConfigNodePropertyInteger* obj = &orgosgiservicehttpportsecure;
		obj->fromJson(value.dump());

    }

    const char *orgapachefelixhttpskeystoreKey = "org.apache.felix.https.keystore";

    if(object.has_key(orgapachefelixhttpskeystoreKey))
    {
        bourne::json value = object[orgapachefelixhttpskeystoreKey];




        ConfigNodePropertyString* obj = &orgapachefelixhttpskeystore;
		obj->fromJson(value.dump());

    }

    const char *orgapachefelixhttpskeystorepasswordKey = "org.apache.felix.https.keystore.password";

    if(object.has_key(orgapachefelixhttpskeystorepasswordKey))
    {
        bourne::json value = object[orgapachefelixhttpskeystorepasswordKey];




        ConfigNodePropertyString* obj = &orgapachefelixhttpskeystorepassword;
		obj->fromJson(value.dump());

    }

    const char *orgapachefelixhttpskeystorekeypasswordKey = "org.apache.felix.https.keystore.key.password";

    if(object.has_key(orgapachefelixhttpskeystorekeypasswordKey))
    {
        bourne::json value = object[orgapachefelixhttpskeystorekeypasswordKey];




        ConfigNodePropertyString* obj = &orgapachefelixhttpskeystorekeypassword;
		obj->fromJson(value.dump());

    }

    const char *orgapachefelixhttpstruststoreKey = "org.apache.felix.https.truststore";

    if(object.has_key(orgapachefelixhttpstruststoreKey))
    {
        bourne::json value = object[orgapachefelixhttpstruststoreKey];




        ConfigNodePropertyString* obj = &orgapachefelixhttpstruststore;
		obj->fromJson(value.dump());

    }

    const char *orgapachefelixhttpstruststorepasswordKey = "org.apache.felix.https.truststore.password";

    if(object.has_key(orgapachefelixhttpstruststorepasswordKey))
    {
        bourne::json value = object[orgapachefelixhttpstruststorepasswordKey];




        ConfigNodePropertyString* obj = &orgapachefelixhttpstruststorepassword;
		obj->fromJson(value.dump());

    }

    const char *orgapachefelixhttpsclientcertificateKey = "org.apache.felix.https.clientcertificate";

    if(object.has_key(orgapachefelixhttpsclientcertificateKey))
    {
        bourne::json value = object[orgapachefelixhttpsclientcertificateKey];




        ConfigNodePropertyDropDown* obj = &orgapachefelixhttpsclientcertificate;
		obj->fromJson(value.dump());

    }

    const char *orgapachefelixhttpcontext_pathKey = "org.apache.felix.http.context_path";

    if(object.has_key(orgapachefelixhttpcontext_pathKey))
    {
        bourne::json value = object[orgapachefelixhttpcontext_pathKey];




        ConfigNodePropertyString* obj = &orgapachefelixhttpcontext_path;
		obj->fromJson(value.dump());

    }

    const char *orgapachefelixhttpmbeansKey = "org.apache.felix.http.mbeans";

    if(object.has_key(orgapachefelixhttpmbeansKey))
    {
        bourne::json value = object[orgapachefelixhttpmbeansKey];




        ConfigNodePropertyBoolean* obj = &orgapachefelixhttpmbeans;
		obj->fromJson(value.dump());

    }

    const char *orgapachefelixhttpsessiontimeoutKey = "org.apache.felix.http.session.timeout";

    if(object.has_key(orgapachefelixhttpsessiontimeoutKey))
    {
        bourne::json value = object[orgapachefelixhttpsessiontimeoutKey];




        ConfigNodePropertyInteger* obj = &orgapachefelixhttpsessiontimeout;
		obj->fromJson(value.dump());

    }

    const char *orgapachefelixhttpjettythreadpoolmaxKey = "org.apache.felix.http.jetty.threadpool.max";

    if(object.has_key(orgapachefelixhttpjettythreadpoolmaxKey))
    {
        bourne::json value = object[orgapachefelixhttpjettythreadpoolmaxKey];




        ConfigNodePropertyInteger* obj = &orgapachefelixhttpjettythreadpoolmax;
		obj->fromJson(value.dump());

    }

    const char *orgapachefelixhttpjettyacceptorsKey = "org.apache.felix.http.jetty.acceptors";

    if(object.has_key(orgapachefelixhttpjettyacceptorsKey))
    {
        bourne::json value = object[orgapachefelixhttpjettyacceptorsKey];




        ConfigNodePropertyInteger* obj = &orgapachefelixhttpjettyacceptors;
		obj->fromJson(value.dump());

    }

    const char *orgapachefelixhttpjettyselectorsKey = "org.apache.felix.http.jetty.selectors";

    if(object.has_key(orgapachefelixhttpjettyselectorsKey))
    {
        bourne::json value = object[orgapachefelixhttpjettyselectorsKey];




        ConfigNodePropertyInteger* obj = &orgapachefelixhttpjettyselectors;
		obj->fromJson(value.dump());

    }

    const char *orgapachefelixhttpjettyheaderBufferSizeKey = "org.apache.felix.http.jetty.headerBufferSize";

    if(object.has_key(orgapachefelixhttpjettyheaderBufferSizeKey))
    {
        bourne::json value = object[orgapachefelixhttpjettyheaderBufferSizeKey];




        ConfigNodePropertyInteger* obj = &orgapachefelixhttpjettyheaderBufferSize;
		obj->fromJson(value.dump());

    }

    const char *orgapachefelixhttpjettyrequestBufferSizeKey = "org.apache.felix.http.jetty.requestBufferSize";

    if(object.has_key(orgapachefelixhttpjettyrequestBufferSizeKey))
    {
        bourne::json value = object[orgapachefelixhttpjettyrequestBufferSizeKey];




        ConfigNodePropertyInteger* obj = &orgapachefelixhttpjettyrequestBufferSize;
		obj->fromJson(value.dump());

    }

    const char *orgapachefelixhttpjettyresponseBufferSizeKey = "org.apache.felix.http.jetty.responseBufferSize";

    if(object.has_key(orgapachefelixhttpjettyresponseBufferSizeKey))
    {
        bourne::json value = object[orgapachefelixhttpjettyresponseBufferSizeKey];




        ConfigNodePropertyInteger* obj = &orgapachefelixhttpjettyresponseBufferSize;
		obj->fromJson(value.dump());

    }

    const char *orgapachefelixhttpjettymaxFormSizeKey = "org.apache.felix.http.jetty.maxFormSize";

    if(object.has_key(orgapachefelixhttpjettymaxFormSizeKey))
    {
        bourne::json value = object[orgapachefelixhttpjettymaxFormSizeKey];




        ConfigNodePropertyInteger* obj = &orgapachefelixhttpjettymaxFormSize;
		obj->fromJson(value.dump());

    }

    const char *orgapachefelixhttppath_exclusionsKey = "org.apache.felix.http.path_exclusions";

    if(object.has_key(orgapachefelixhttppath_exclusionsKey))
    {
        bourne::json value = object[orgapachefelixhttppath_exclusionsKey];




        ConfigNodePropertyArray* obj = &orgapachefelixhttppath_exclusions;
		obj->fromJson(value.dump());

    }

    const char *orgapachefelixhttpsjettyciphersuitesexcludedKey = "org.apache.felix.https.jetty.ciphersuites.excluded";

    if(object.has_key(orgapachefelixhttpsjettyciphersuitesexcludedKey))
    {
        bourne::json value = object[orgapachefelixhttpsjettyciphersuitesexcludedKey];




        ConfigNodePropertyArray* obj = &orgapachefelixhttpsjettyciphersuitesexcluded;
		obj->fromJson(value.dump());

    }

    const char *orgapachefelixhttpsjettyciphersuitesincludedKey = "org.apache.felix.https.jetty.ciphersuites.included";

    if(object.has_key(orgapachefelixhttpsjettyciphersuitesincludedKey))
    {
        bourne::json value = object[orgapachefelixhttpsjettyciphersuitesincludedKey];




        ConfigNodePropertyArray* obj = &orgapachefelixhttpsjettyciphersuitesincluded;
		obj->fromJson(value.dump());

    }

    const char *orgapachefelixhttpjettysendServerHeaderKey = "org.apache.felix.http.jetty.sendServerHeader";

    if(object.has_key(orgapachefelixhttpjettysendServerHeaderKey))
    {
        bourne::json value = object[orgapachefelixhttpjettysendServerHeaderKey];




        ConfigNodePropertyBoolean* obj = &orgapachefelixhttpjettysendServerHeader;
		obj->fromJson(value.dump());

    }

    const char *orgapachefelixhttpsjettyprotocolsincludedKey = "org.apache.felix.https.jetty.protocols.included";

    if(object.has_key(orgapachefelixhttpsjettyprotocolsincludedKey))
    {
        bourne::json value = object[orgapachefelixhttpsjettyprotocolsincludedKey];




        ConfigNodePropertyArray* obj = &orgapachefelixhttpsjettyprotocolsincluded;
		obj->fromJson(value.dump());

    }

    const char *orgapachefelixhttpsjettyprotocolsexcludedKey = "org.apache.felix.https.jetty.protocols.excluded";

    if(object.has_key(orgapachefelixhttpsjettyprotocolsexcludedKey))
    {
        bourne::json value = object[orgapachefelixhttpsjettyprotocolsexcludedKey];




        ConfigNodePropertyArray* obj = &orgapachefelixhttpsjettyprotocolsexcluded;
		obj->fromJson(value.dump());

    }

    const char *orgapachefelixproxyloadbalancerconnectionenableKey = "org.apache.felix.proxy.load.balancer.connection.enable";

    if(object.has_key(orgapachefelixproxyloadbalancerconnectionenableKey))
    {
        bourne::json value = object[orgapachefelixproxyloadbalancerconnectionenableKey];




        ConfigNodePropertyBoolean* obj = &orgapachefelixproxyloadbalancerconnectionenable;
		obj->fromJson(value.dump());

    }

    const char *orgapachefelixhttpsjettyrenegotiateAllowedKey = "org.apache.felix.https.jetty.renegotiateAllowed";

    if(object.has_key(orgapachefelixhttpsjettyrenegotiateAllowedKey))
    {
        bourne::json value = object[orgapachefelixhttpsjettyrenegotiateAllowedKey];




        ConfigNodePropertyBoolean* obj = &orgapachefelixhttpsjettyrenegotiateAllowed;
		obj->fromJson(value.dump());

    }

    const char *orgapachefelixhttpsjettysessioncookiehttpOnlyKey = "org.apache.felix.https.jetty.session.cookie.httpOnly";

    if(object.has_key(orgapachefelixhttpsjettysessioncookiehttpOnlyKey))
    {
        bourne::json value = object[orgapachefelixhttpsjettysessioncookiehttpOnlyKey];




        ConfigNodePropertyBoolean* obj = &orgapachefelixhttpsjettysessioncookiehttpOnly;
		obj->fromJson(value.dump());

    }

    const char *orgapachefelixhttpsjettysessioncookiesecureKey = "org.apache.felix.https.jetty.session.cookie.secure";

    if(object.has_key(orgapachefelixhttpsjettysessioncookiesecureKey))
    {
        bourne::json value = object[orgapachefelixhttpsjettysessioncookiesecureKey];




        ConfigNodePropertyBoolean* obj = &orgapachefelixhttpsjettysessioncookiesecure;
		obj->fromJson(value.dump());

    }

    const char *orgeclipsejettyservletSessionIdPathParameterNameKey = "org.eclipse.jetty.servlet.SessionIdPathParameterName";

    if(object.has_key(orgeclipsejettyservletSessionIdPathParameterNameKey))
    {
        bourne::json value = object[orgeclipsejettyservletSessionIdPathParameterNameKey];




        ConfigNodePropertyString* obj = &orgeclipsejettyservletSessionIdPathParameterName;
		obj->fromJson(value.dump());

    }

    const char *orgeclipsejettyservletCheckingRemoteSessionIdEncodingKey = "org.eclipse.jetty.servlet.CheckingRemoteSessionIdEncoding";

    if(object.has_key(orgeclipsejettyservletCheckingRemoteSessionIdEncodingKey))
    {
        bourne::json value = object[orgeclipsejettyservletCheckingRemoteSessionIdEncodingKey];




        ConfigNodePropertyBoolean* obj = &orgeclipsejettyservletCheckingRemoteSessionIdEncoding;
		obj->fromJson(value.dump());

    }

    const char *orgeclipsejettyservletSessionCookieKey = "org.eclipse.jetty.servlet.SessionCookie";

    if(object.has_key(orgeclipsejettyservletSessionCookieKey))
    {
        bourne::json value = object[orgeclipsejettyservletSessionCookieKey];




        ConfigNodePropertyString* obj = &orgeclipsejettyservletSessionCookie;
		obj->fromJson(value.dump());

    }

    const char *orgeclipsejettyservletSessionDomainKey = "org.eclipse.jetty.servlet.SessionDomain";

    if(object.has_key(orgeclipsejettyservletSessionDomainKey))
    {
        bourne::json value = object[orgeclipsejettyservletSessionDomainKey];




        ConfigNodePropertyString* obj = &orgeclipsejettyservletSessionDomain;
		obj->fromJson(value.dump());

    }

    const char *orgeclipsejettyservletSessionPathKey = "org.eclipse.jetty.servlet.SessionPath";

    if(object.has_key(orgeclipsejettyservletSessionPathKey))
    {
        bourne::json value = object[orgeclipsejettyservletSessionPathKey];




        ConfigNodePropertyString* obj = &orgeclipsejettyservletSessionPath;
		obj->fromJson(value.dump());

    }

    const char *orgeclipsejettyservletMaxAgeKey = "org.eclipse.jetty.servlet.MaxAge";

    if(object.has_key(orgeclipsejettyservletMaxAgeKey))
    {
        bourne::json value = object[orgeclipsejettyservletMaxAgeKey];




        ConfigNodePropertyInteger* obj = &orgeclipsejettyservletMaxAge;
		obj->fromJson(value.dump());

    }

    const char *orgapachefelixhttpnameKey = "org.apache.felix.http.name";

    if(object.has_key(orgapachefelixhttpnameKey))
    {
        bourne::json value = object[orgapachefelixhttpnameKey];




        ConfigNodePropertyString* obj = &orgapachefelixhttpname;
		obj->fromJson(value.dump());

    }

    const char *orgapachefelixjettygziphandlerenableKey = "org.apache.felix.jetty.gziphandler.enable";

    if(object.has_key(orgapachefelixjettygziphandlerenableKey))
    {
        bourne::json value = object[orgapachefelixjettygziphandlerenableKey];




        ConfigNodePropertyBoolean* obj = &orgapachefelixjettygziphandlerenable;
		obj->fromJson(value.dump());

    }

    const char *orgapachefelixjettygzipminGzipSizeKey = "org.apache.felix.jetty.gzip.minGzipSize";

    if(object.has_key(orgapachefelixjettygzipminGzipSizeKey))
    {
        bourne::json value = object[orgapachefelixjettygzipminGzipSizeKey];




        ConfigNodePropertyInteger* obj = &orgapachefelixjettygzipminGzipSize;
		obj->fromJson(value.dump());

    }

    const char *orgapachefelixjettygzipcompressionLevelKey = "org.apache.felix.jetty.gzip.compressionLevel";

    if(object.has_key(orgapachefelixjettygzipcompressionLevelKey))
    {
        bourne::json value = object[orgapachefelixjettygzipcompressionLevelKey];




        ConfigNodePropertyInteger* obj = &orgapachefelixjettygzipcompressionLevel;
		obj->fromJson(value.dump());

    }

    const char *orgapachefelixjettygzipinflateBufferSizeKey = "org.apache.felix.jetty.gzip.inflateBufferSize";

    if(object.has_key(orgapachefelixjettygzipinflateBufferSizeKey))
    {
        bourne::json value = object[orgapachefelixjettygzipinflateBufferSizeKey];




        ConfigNodePropertyInteger* obj = &orgapachefelixjettygzipinflateBufferSize;
		obj->fromJson(value.dump());

    }

    const char *orgapachefelixjettygzipsyncFlushKey = "org.apache.felix.jetty.gzip.syncFlush";

    if(object.has_key(orgapachefelixjettygzipsyncFlushKey))
    {
        bourne::json value = object[orgapachefelixjettygzipsyncFlushKey];




        ConfigNodePropertyBoolean* obj = &orgapachefelixjettygzipsyncFlush;
		obj->fromJson(value.dump());

    }

    const char *orgapachefelixjettygzipexcludedUserAgentsKey = "org.apache.felix.jetty.gzip.excludedUserAgents";

    if(object.has_key(orgapachefelixjettygzipexcludedUserAgentsKey))
    {
        bourne::json value = object[orgapachefelixjettygzipexcludedUserAgentsKey];




        ConfigNodePropertyArray* obj = &orgapachefelixjettygzipexcludedUserAgents;
		obj->fromJson(value.dump());

    }

    const char *orgapachefelixjettygzipincludedMethodsKey = "org.apache.felix.jetty.gzip.includedMethods";

    if(object.has_key(orgapachefelixjettygzipincludedMethodsKey))
    {
        bourne::json value = object[orgapachefelixjettygzipincludedMethodsKey];




        ConfigNodePropertyArray* obj = &orgapachefelixjettygzipincludedMethods;
		obj->fromJson(value.dump());

    }

    const char *orgapachefelixjettygzipexcludedMethodsKey = "org.apache.felix.jetty.gzip.excludedMethods";

    if(object.has_key(orgapachefelixjettygzipexcludedMethodsKey))
    {
        bourne::json value = object[orgapachefelixjettygzipexcludedMethodsKey];




        ConfigNodePropertyArray* obj = &orgapachefelixjettygzipexcludedMethods;
		obj->fromJson(value.dump());

    }

    const char *orgapachefelixjettygzipincludedPathsKey = "org.apache.felix.jetty.gzip.includedPaths";

    if(object.has_key(orgapachefelixjettygzipincludedPathsKey))
    {
        bourne::json value = object[orgapachefelixjettygzipincludedPathsKey];




        ConfigNodePropertyArray* obj = &orgapachefelixjettygzipincludedPaths;
		obj->fromJson(value.dump());

    }

    const char *orgapachefelixjettygzipexcludedPathsKey = "org.apache.felix.jetty.gzip.excludedPaths";

    if(object.has_key(orgapachefelixjettygzipexcludedPathsKey))
    {
        bourne::json value = object[orgapachefelixjettygzipexcludedPathsKey];




        ConfigNodePropertyArray* obj = &orgapachefelixjettygzipexcludedPaths;
		obj->fromJson(value.dump());

    }

    const char *orgapachefelixjettygzipincludedMimeTypesKey = "org.apache.felix.jetty.gzip.includedMimeTypes";

    if(object.has_key(orgapachefelixjettygzipincludedMimeTypesKey))
    {
        bourne::json value = object[orgapachefelixjettygzipincludedMimeTypesKey];




        ConfigNodePropertyArray* obj = &orgapachefelixjettygzipincludedMimeTypes;
		obj->fromJson(value.dump());

    }

    const char *orgapachefelixjettygzipexcludedMimeTypesKey = "org.apache.felix.jetty.gzip.excludedMimeTypes";

    if(object.has_key(orgapachefelixjettygzipexcludedMimeTypesKey))
    {
        bourne::json value = object[orgapachefelixjettygzipexcludedMimeTypesKey];




        ConfigNodePropertyArray* obj = &orgapachefelixjettygzipexcludedMimeTypes;
		obj->fromJson(value.dump());

    }

    const char *orgapachefelixhttpsessioninvalidateKey = "org.apache.felix.http.session.invalidate";

    if(object.has_key(orgapachefelixhttpsessioninvalidateKey))
    {
        bourne::json value = object[orgapachefelixhttpsessioninvalidateKey];




        ConfigNodePropertyBoolean* obj = &orgapachefelixhttpsessioninvalidate;
		obj->fromJson(value.dump());

    }

    const char *orgapachefelixhttpsessionuniqueidKey = "org.apache.felix.http.session.uniqueid";

    if(object.has_key(orgapachefelixhttpsessionuniqueidKey))
    {
        bourne::json value = object[orgapachefelixhttpsessionuniqueidKey];




        ConfigNodePropertyBoolean* obj = &orgapachefelixhttpsessionuniqueid;
		obj->fromJson(value.dump());

    }


}

bourne::json
OrgApacheFelixHttpProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["orgapachefelixhttphost"] = getOrgapachefelixhttphost().toJson();






	object["orgapachefelixhttpenable"] = getOrgapachefelixhttpenable().toJson();






	object["orgosgiservicehttpport"] = getOrgosgiservicehttpport().toJson();






	object["orgapachefelixhttptimeout"] = getOrgapachefelixhttptimeout().toJson();






	object["orgapachefelixhttpsenable"] = getOrgapachefelixhttpsenable().toJson();






	object["orgosgiservicehttpportsecure"] = getOrgosgiservicehttpportsecure().toJson();






	object["orgapachefelixhttpskeystore"] = getOrgapachefelixhttpskeystore().toJson();






	object["orgapachefelixhttpskeystorepassword"] = getOrgapachefelixhttpskeystorepassword().toJson();






	object["orgapachefelixhttpskeystorekeypassword"] = getOrgapachefelixhttpskeystorekeypassword().toJson();






	object["orgapachefelixhttpstruststore"] = getOrgapachefelixhttpstruststore().toJson();






	object["orgapachefelixhttpstruststorepassword"] = getOrgapachefelixhttpstruststorepassword().toJson();






	object["orgapachefelixhttpsclientcertificate"] = getOrgapachefelixhttpsclientcertificate().toJson();






	object["orgapachefelixhttpcontext_path"] = getOrgapachefelixhttpcontextPath().toJson();






	object["orgapachefelixhttpmbeans"] = getOrgapachefelixhttpmbeans().toJson();






	object["orgapachefelixhttpsessiontimeout"] = getOrgapachefelixhttpsessiontimeout().toJson();






	object["orgapachefelixhttpjettythreadpoolmax"] = getOrgapachefelixhttpjettythreadpoolmax().toJson();






	object["orgapachefelixhttpjettyacceptors"] = getOrgapachefelixhttpjettyacceptors().toJson();






	object["orgapachefelixhttpjettyselectors"] = getOrgapachefelixhttpjettyselectors().toJson();






	object["orgapachefelixhttpjettyheaderBufferSize"] = getOrgapachefelixhttpjettyheaderBufferSize().toJson();






	object["orgapachefelixhttpjettyrequestBufferSize"] = getOrgapachefelixhttpjettyrequestBufferSize().toJson();






	object["orgapachefelixhttpjettyresponseBufferSize"] = getOrgapachefelixhttpjettyresponseBufferSize().toJson();






	object["orgapachefelixhttpjettymaxFormSize"] = getOrgapachefelixhttpjettymaxFormSize().toJson();






	object["orgapachefelixhttppath_exclusions"] = getOrgapachefelixhttppathExclusions().toJson();






	object["orgapachefelixhttpsjettyciphersuitesexcluded"] = getOrgapachefelixhttpsjettyciphersuitesexcluded().toJson();






	object["orgapachefelixhttpsjettyciphersuitesincluded"] = getOrgapachefelixhttpsjettyciphersuitesincluded().toJson();






	object["orgapachefelixhttpjettysendServerHeader"] = getOrgapachefelixhttpjettysendServerHeader().toJson();






	object["orgapachefelixhttpsjettyprotocolsincluded"] = getOrgapachefelixhttpsjettyprotocolsincluded().toJson();






	object["orgapachefelixhttpsjettyprotocolsexcluded"] = getOrgapachefelixhttpsjettyprotocolsexcluded().toJson();






	object["orgapachefelixproxyloadbalancerconnectionenable"] = getOrgapachefelixproxyloadbalancerconnectionenable().toJson();






	object["orgapachefelixhttpsjettyrenegotiateAllowed"] = getOrgapachefelixhttpsjettyrenegotiateAllowed().toJson();






	object["orgapachefelixhttpsjettysessioncookiehttpOnly"] = getOrgapachefelixhttpsjettysessioncookiehttpOnly().toJson();






	object["orgapachefelixhttpsjettysessioncookiesecure"] = getOrgapachefelixhttpsjettysessioncookiesecure().toJson();






	object["orgeclipsejettyservletSessionIdPathParameterName"] = getOrgeclipsejettyservletSessionIdPathParameterName().toJson();






	object["orgeclipsejettyservletCheckingRemoteSessionIdEncoding"] = getOrgeclipsejettyservletCheckingRemoteSessionIdEncoding().toJson();






	object["orgeclipsejettyservletSessionCookie"] = getOrgeclipsejettyservletSessionCookie().toJson();






	object["orgeclipsejettyservletSessionDomain"] = getOrgeclipsejettyservletSessionDomain().toJson();






	object["orgeclipsejettyservletSessionPath"] = getOrgeclipsejettyservletSessionPath().toJson();






	object["orgeclipsejettyservletMaxAge"] = getOrgeclipsejettyservletMaxAge().toJson();






	object["orgapachefelixhttpname"] = getOrgapachefelixhttpname().toJson();






	object["orgapachefelixjettygziphandlerenable"] = getOrgapachefelixjettygziphandlerenable().toJson();






	object["orgapachefelixjettygzipminGzipSize"] = getOrgapachefelixjettygzipminGzipSize().toJson();






	object["orgapachefelixjettygzipcompressionLevel"] = getOrgapachefelixjettygzipcompressionLevel().toJson();






	object["orgapachefelixjettygzipinflateBufferSize"] = getOrgapachefelixjettygzipinflateBufferSize().toJson();






	object["orgapachefelixjettygzipsyncFlush"] = getOrgapachefelixjettygzipsyncFlush().toJson();






	object["orgapachefelixjettygzipexcludedUserAgents"] = getOrgapachefelixjettygzipexcludedUserAgents().toJson();






	object["orgapachefelixjettygzipincludedMethods"] = getOrgapachefelixjettygzipincludedMethods().toJson();






	object["orgapachefelixjettygzipexcludedMethods"] = getOrgapachefelixjettygzipexcludedMethods().toJson();






	object["orgapachefelixjettygzipincludedPaths"] = getOrgapachefelixjettygzipincludedPaths().toJson();






	object["orgapachefelixjettygzipexcludedPaths"] = getOrgapachefelixjettygzipexcludedPaths().toJson();






	object["orgapachefelixjettygzipincludedMimeTypes"] = getOrgapachefelixjettygzipincludedMimeTypes().toJson();






	object["orgapachefelixjettygzipexcludedMimeTypes"] = getOrgapachefelixjettygzipexcludedMimeTypes().toJson();






	object["orgapachefelixhttpsessioninvalidate"] = getOrgapachefelixhttpsessioninvalidate().toJson();






	object["orgapachefelixhttpsessionuniqueid"] = getOrgapachefelixhttpsessionuniqueid().toJson();


    return object;

}

ConfigNodePropertyString
OrgApacheFelixHttpProperties::getOrgapachefelixhttphost()
{
	return orgapachefelixhttphost;
}

void
OrgApacheFelixHttpProperties::setOrgapachefelixhttphost(ConfigNodePropertyString orgapachefelixhttphost)
{
	this->orgapachefelixhttphost = orgapachefelixhttphost;
}

ConfigNodePropertyBoolean
OrgApacheFelixHttpProperties::getOrgapachefelixhttpenable()
{
	return orgapachefelixhttpenable;
}

void
OrgApacheFelixHttpProperties::setOrgapachefelixhttpenable(ConfigNodePropertyBoolean orgapachefelixhttpenable)
{
	this->orgapachefelixhttpenable = orgapachefelixhttpenable;
}

ConfigNodePropertyInteger
OrgApacheFelixHttpProperties::getOrgosgiservicehttpport()
{
	return orgosgiservicehttpport;
}

void
OrgApacheFelixHttpProperties::setOrgosgiservicehttpport(ConfigNodePropertyInteger orgosgiservicehttpport)
{
	this->orgosgiservicehttpport = orgosgiservicehttpport;
}

ConfigNodePropertyInteger
OrgApacheFelixHttpProperties::getOrgapachefelixhttptimeout()
{
	return orgapachefelixhttptimeout;
}

void
OrgApacheFelixHttpProperties::setOrgapachefelixhttptimeout(ConfigNodePropertyInteger orgapachefelixhttptimeout)
{
	this->orgapachefelixhttptimeout = orgapachefelixhttptimeout;
}

ConfigNodePropertyBoolean
OrgApacheFelixHttpProperties::getOrgapachefelixhttpsenable()
{
	return orgapachefelixhttpsenable;
}

void
OrgApacheFelixHttpProperties::setOrgapachefelixhttpsenable(ConfigNodePropertyBoolean orgapachefelixhttpsenable)
{
	this->orgapachefelixhttpsenable = orgapachefelixhttpsenable;
}

ConfigNodePropertyInteger
OrgApacheFelixHttpProperties::getOrgosgiservicehttpportsecure()
{
	return orgosgiservicehttpportsecure;
}

void
OrgApacheFelixHttpProperties::setOrgosgiservicehttpportsecure(ConfigNodePropertyInteger orgosgiservicehttpportsecure)
{
	this->orgosgiservicehttpportsecure = orgosgiservicehttpportsecure;
}

ConfigNodePropertyString
OrgApacheFelixHttpProperties::getOrgapachefelixhttpskeystore()
{
	return orgapachefelixhttpskeystore;
}

void
OrgApacheFelixHttpProperties::setOrgapachefelixhttpskeystore(ConfigNodePropertyString orgapachefelixhttpskeystore)
{
	this->orgapachefelixhttpskeystore = orgapachefelixhttpskeystore;
}

ConfigNodePropertyString
OrgApacheFelixHttpProperties::getOrgapachefelixhttpskeystorepassword()
{
	return orgapachefelixhttpskeystorepassword;
}

void
OrgApacheFelixHttpProperties::setOrgapachefelixhttpskeystorepassword(ConfigNodePropertyString orgapachefelixhttpskeystorepassword)
{
	this->orgapachefelixhttpskeystorepassword = orgapachefelixhttpskeystorepassword;
}

ConfigNodePropertyString
OrgApacheFelixHttpProperties::getOrgapachefelixhttpskeystorekeypassword()
{
	return orgapachefelixhttpskeystorekeypassword;
}

void
OrgApacheFelixHttpProperties::setOrgapachefelixhttpskeystorekeypassword(ConfigNodePropertyString orgapachefelixhttpskeystorekeypassword)
{
	this->orgapachefelixhttpskeystorekeypassword = orgapachefelixhttpskeystorekeypassword;
}

ConfigNodePropertyString
OrgApacheFelixHttpProperties::getOrgapachefelixhttpstruststore()
{
	return orgapachefelixhttpstruststore;
}

void
OrgApacheFelixHttpProperties::setOrgapachefelixhttpstruststore(ConfigNodePropertyString orgapachefelixhttpstruststore)
{
	this->orgapachefelixhttpstruststore = orgapachefelixhttpstruststore;
}

ConfigNodePropertyString
OrgApacheFelixHttpProperties::getOrgapachefelixhttpstruststorepassword()
{
	return orgapachefelixhttpstruststorepassword;
}

void
OrgApacheFelixHttpProperties::setOrgapachefelixhttpstruststorepassword(ConfigNodePropertyString orgapachefelixhttpstruststorepassword)
{
	this->orgapachefelixhttpstruststorepassword = orgapachefelixhttpstruststorepassword;
}

ConfigNodePropertyDropDown
OrgApacheFelixHttpProperties::getOrgapachefelixhttpsclientcertificate()
{
	return orgapachefelixhttpsclientcertificate;
}

void
OrgApacheFelixHttpProperties::setOrgapachefelixhttpsclientcertificate(ConfigNodePropertyDropDown orgapachefelixhttpsclientcertificate)
{
	this->orgapachefelixhttpsclientcertificate = orgapachefelixhttpsclientcertificate;
}

ConfigNodePropertyString
OrgApacheFelixHttpProperties::getOrgapachefelixhttpcontextPath()
{
	return orgapachefelixhttpcontext_path;
}

void
OrgApacheFelixHttpProperties::setOrgapachefelixhttpcontextPath(ConfigNodePropertyString orgapachefelixhttpcontext_path)
{
	this->orgapachefelixhttpcontext_path = orgapachefelixhttpcontext_path;
}

ConfigNodePropertyBoolean
OrgApacheFelixHttpProperties::getOrgapachefelixhttpmbeans()
{
	return orgapachefelixhttpmbeans;
}

void
OrgApacheFelixHttpProperties::setOrgapachefelixhttpmbeans(ConfigNodePropertyBoolean orgapachefelixhttpmbeans)
{
	this->orgapachefelixhttpmbeans = orgapachefelixhttpmbeans;
}

ConfigNodePropertyInteger
OrgApacheFelixHttpProperties::getOrgapachefelixhttpsessiontimeout()
{
	return orgapachefelixhttpsessiontimeout;
}

void
OrgApacheFelixHttpProperties::setOrgapachefelixhttpsessiontimeout(ConfigNodePropertyInteger orgapachefelixhttpsessiontimeout)
{
	this->orgapachefelixhttpsessiontimeout = orgapachefelixhttpsessiontimeout;
}

ConfigNodePropertyInteger
OrgApacheFelixHttpProperties::getOrgapachefelixhttpjettythreadpoolmax()
{
	return orgapachefelixhttpjettythreadpoolmax;
}

void
OrgApacheFelixHttpProperties::setOrgapachefelixhttpjettythreadpoolmax(ConfigNodePropertyInteger orgapachefelixhttpjettythreadpoolmax)
{
	this->orgapachefelixhttpjettythreadpoolmax = orgapachefelixhttpjettythreadpoolmax;
}

ConfigNodePropertyInteger
OrgApacheFelixHttpProperties::getOrgapachefelixhttpjettyacceptors()
{
	return orgapachefelixhttpjettyacceptors;
}

void
OrgApacheFelixHttpProperties::setOrgapachefelixhttpjettyacceptors(ConfigNodePropertyInteger orgapachefelixhttpjettyacceptors)
{
	this->orgapachefelixhttpjettyacceptors = orgapachefelixhttpjettyacceptors;
}

ConfigNodePropertyInteger
OrgApacheFelixHttpProperties::getOrgapachefelixhttpjettyselectors()
{
	return orgapachefelixhttpjettyselectors;
}

void
OrgApacheFelixHttpProperties::setOrgapachefelixhttpjettyselectors(ConfigNodePropertyInteger orgapachefelixhttpjettyselectors)
{
	this->orgapachefelixhttpjettyselectors = orgapachefelixhttpjettyselectors;
}

ConfigNodePropertyInteger
OrgApacheFelixHttpProperties::getOrgapachefelixhttpjettyheaderBufferSize()
{
	return orgapachefelixhttpjettyheaderBufferSize;
}

void
OrgApacheFelixHttpProperties::setOrgapachefelixhttpjettyheaderBufferSize(ConfigNodePropertyInteger orgapachefelixhttpjettyheaderBufferSize)
{
	this->orgapachefelixhttpjettyheaderBufferSize = orgapachefelixhttpjettyheaderBufferSize;
}

ConfigNodePropertyInteger
OrgApacheFelixHttpProperties::getOrgapachefelixhttpjettyrequestBufferSize()
{
	return orgapachefelixhttpjettyrequestBufferSize;
}

void
OrgApacheFelixHttpProperties::setOrgapachefelixhttpjettyrequestBufferSize(ConfigNodePropertyInteger orgapachefelixhttpjettyrequestBufferSize)
{
	this->orgapachefelixhttpjettyrequestBufferSize = orgapachefelixhttpjettyrequestBufferSize;
}

ConfigNodePropertyInteger
OrgApacheFelixHttpProperties::getOrgapachefelixhttpjettyresponseBufferSize()
{
	return orgapachefelixhttpjettyresponseBufferSize;
}

void
OrgApacheFelixHttpProperties::setOrgapachefelixhttpjettyresponseBufferSize(ConfigNodePropertyInteger orgapachefelixhttpjettyresponseBufferSize)
{
	this->orgapachefelixhttpjettyresponseBufferSize = orgapachefelixhttpjettyresponseBufferSize;
}

ConfigNodePropertyInteger
OrgApacheFelixHttpProperties::getOrgapachefelixhttpjettymaxFormSize()
{
	return orgapachefelixhttpjettymaxFormSize;
}

void
OrgApacheFelixHttpProperties::setOrgapachefelixhttpjettymaxFormSize(ConfigNodePropertyInteger orgapachefelixhttpjettymaxFormSize)
{
	this->orgapachefelixhttpjettymaxFormSize = orgapachefelixhttpjettymaxFormSize;
}

ConfigNodePropertyArray
OrgApacheFelixHttpProperties::getOrgapachefelixhttppathExclusions()
{
	return orgapachefelixhttppath_exclusions;
}

void
OrgApacheFelixHttpProperties::setOrgapachefelixhttppathExclusions(ConfigNodePropertyArray orgapachefelixhttppath_exclusions)
{
	this->orgapachefelixhttppath_exclusions = orgapachefelixhttppath_exclusions;
}

ConfigNodePropertyArray
OrgApacheFelixHttpProperties::getOrgapachefelixhttpsjettyciphersuitesexcluded()
{
	return orgapachefelixhttpsjettyciphersuitesexcluded;
}

void
OrgApacheFelixHttpProperties::setOrgapachefelixhttpsjettyciphersuitesexcluded(ConfigNodePropertyArray orgapachefelixhttpsjettyciphersuitesexcluded)
{
	this->orgapachefelixhttpsjettyciphersuitesexcluded = orgapachefelixhttpsjettyciphersuitesexcluded;
}

ConfigNodePropertyArray
OrgApacheFelixHttpProperties::getOrgapachefelixhttpsjettyciphersuitesincluded()
{
	return orgapachefelixhttpsjettyciphersuitesincluded;
}

void
OrgApacheFelixHttpProperties::setOrgapachefelixhttpsjettyciphersuitesincluded(ConfigNodePropertyArray orgapachefelixhttpsjettyciphersuitesincluded)
{
	this->orgapachefelixhttpsjettyciphersuitesincluded = orgapachefelixhttpsjettyciphersuitesincluded;
}

ConfigNodePropertyBoolean
OrgApacheFelixHttpProperties::getOrgapachefelixhttpjettysendServerHeader()
{
	return orgapachefelixhttpjettysendServerHeader;
}

void
OrgApacheFelixHttpProperties::setOrgapachefelixhttpjettysendServerHeader(ConfigNodePropertyBoolean orgapachefelixhttpjettysendServerHeader)
{
	this->orgapachefelixhttpjettysendServerHeader = orgapachefelixhttpjettysendServerHeader;
}

ConfigNodePropertyArray
OrgApacheFelixHttpProperties::getOrgapachefelixhttpsjettyprotocolsincluded()
{
	return orgapachefelixhttpsjettyprotocolsincluded;
}

void
OrgApacheFelixHttpProperties::setOrgapachefelixhttpsjettyprotocolsincluded(ConfigNodePropertyArray orgapachefelixhttpsjettyprotocolsincluded)
{
	this->orgapachefelixhttpsjettyprotocolsincluded = orgapachefelixhttpsjettyprotocolsincluded;
}

ConfigNodePropertyArray
OrgApacheFelixHttpProperties::getOrgapachefelixhttpsjettyprotocolsexcluded()
{
	return orgapachefelixhttpsjettyprotocolsexcluded;
}

void
OrgApacheFelixHttpProperties::setOrgapachefelixhttpsjettyprotocolsexcluded(ConfigNodePropertyArray orgapachefelixhttpsjettyprotocolsexcluded)
{
	this->orgapachefelixhttpsjettyprotocolsexcluded = orgapachefelixhttpsjettyprotocolsexcluded;
}

ConfigNodePropertyBoolean
OrgApacheFelixHttpProperties::getOrgapachefelixproxyloadbalancerconnectionenable()
{
	return orgapachefelixproxyloadbalancerconnectionenable;
}

void
OrgApacheFelixHttpProperties::setOrgapachefelixproxyloadbalancerconnectionenable(ConfigNodePropertyBoolean orgapachefelixproxyloadbalancerconnectionenable)
{
	this->orgapachefelixproxyloadbalancerconnectionenable = orgapachefelixproxyloadbalancerconnectionenable;
}

ConfigNodePropertyBoolean
OrgApacheFelixHttpProperties::getOrgapachefelixhttpsjettyrenegotiateAllowed()
{
	return orgapachefelixhttpsjettyrenegotiateAllowed;
}

void
OrgApacheFelixHttpProperties::setOrgapachefelixhttpsjettyrenegotiateAllowed(ConfigNodePropertyBoolean orgapachefelixhttpsjettyrenegotiateAllowed)
{
	this->orgapachefelixhttpsjettyrenegotiateAllowed = orgapachefelixhttpsjettyrenegotiateAllowed;
}

ConfigNodePropertyBoolean
OrgApacheFelixHttpProperties::getOrgapachefelixhttpsjettysessioncookiehttpOnly()
{
	return orgapachefelixhttpsjettysessioncookiehttpOnly;
}

void
OrgApacheFelixHttpProperties::setOrgapachefelixhttpsjettysessioncookiehttpOnly(ConfigNodePropertyBoolean orgapachefelixhttpsjettysessioncookiehttpOnly)
{
	this->orgapachefelixhttpsjettysessioncookiehttpOnly = orgapachefelixhttpsjettysessioncookiehttpOnly;
}

ConfigNodePropertyBoolean
OrgApacheFelixHttpProperties::getOrgapachefelixhttpsjettysessioncookiesecure()
{
	return orgapachefelixhttpsjettysessioncookiesecure;
}

void
OrgApacheFelixHttpProperties::setOrgapachefelixhttpsjettysessioncookiesecure(ConfigNodePropertyBoolean orgapachefelixhttpsjettysessioncookiesecure)
{
	this->orgapachefelixhttpsjettysessioncookiesecure = orgapachefelixhttpsjettysessioncookiesecure;
}

ConfigNodePropertyString
OrgApacheFelixHttpProperties::getOrgeclipsejettyservletSessionIdPathParameterName()
{
	return orgeclipsejettyservletSessionIdPathParameterName;
}

void
OrgApacheFelixHttpProperties::setOrgeclipsejettyservletSessionIdPathParameterName(ConfigNodePropertyString orgeclipsejettyservletSessionIdPathParameterName)
{
	this->orgeclipsejettyservletSessionIdPathParameterName = orgeclipsejettyservletSessionIdPathParameterName;
}

ConfigNodePropertyBoolean
OrgApacheFelixHttpProperties::getOrgeclipsejettyservletCheckingRemoteSessionIdEncoding()
{
	return orgeclipsejettyservletCheckingRemoteSessionIdEncoding;
}

void
OrgApacheFelixHttpProperties::setOrgeclipsejettyservletCheckingRemoteSessionIdEncoding(ConfigNodePropertyBoolean orgeclipsejettyservletCheckingRemoteSessionIdEncoding)
{
	this->orgeclipsejettyservletCheckingRemoteSessionIdEncoding = orgeclipsejettyservletCheckingRemoteSessionIdEncoding;
}

ConfigNodePropertyString
OrgApacheFelixHttpProperties::getOrgeclipsejettyservletSessionCookie()
{
	return orgeclipsejettyservletSessionCookie;
}

void
OrgApacheFelixHttpProperties::setOrgeclipsejettyservletSessionCookie(ConfigNodePropertyString orgeclipsejettyservletSessionCookie)
{
	this->orgeclipsejettyservletSessionCookie = orgeclipsejettyservletSessionCookie;
}

ConfigNodePropertyString
OrgApacheFelixHttpProperties::getOrgeclipsejettyservletSessionDomain()
{
	return orgeclipsejettyservletSessionDomain;
}

void
OrgApacheFelixHttpProperties::setOrgeclipsejettyservletSessionDomain(ConfigNodePropertyString orgeclipsejettyservletSessionDomain)
{
	this->orgeclipsejettyservletSessionDomain = orgeclipsejettyservletSessionDomain;
}

ConfigNodePropertyString
OrgApacheFelixHttpProperties::getOrgeclipsejettyservletSessionPath()
{
	return orgeclipsejettyservletSessionPath;
}

void
OrgApacheFelixHttpProperties::setOrgeclipsejettyservletSessionPath(ConfigNodePropertyString orgeclipsejettyservletSessionPath)
{
	this->orgeclipsejettyservletSessionPath = orgeclipsejettyservletSessionPath;
}

ConfigNodePropertyInteger
OrgApacheFelixHttpProperties::getOrgeclipsejettyservletMaxAge()
{
	return orgeclipsejettyservletMaxAge;
}

void
OrgApacheFelixHttpProperties::setOrgeclipsejettyservletMaxAge(ConfigNodePropertyInteger orgeclipsejettyservletMaxAge)
{
	this->orgeclipsejettyservletMaxAge = orgeclipsejettyservletMaxAge;
}

ConfigNodePropertyString
OrgApacheFelixHttpProperties::getOrgapachefelixhttpname()
{
	return orgapachefelixhttpname;
}

void
OrgApacheFelixHttpProperties::setOrgapachefelixhttpname(ConfigNodePropertyString orgapachefelixhttpname)
{
	this->orgapachefelixhttpname = orgapachefelixhttpname;
}

ConfigNodePropertyBoolean
OrgApacheFelixHttpProperties::getOrgapachefelixjettygziphandlerenable()
{
	return orgapachefelixjettygziphandlerenable;
}

void
OrgApacheFelixHttpProperties::setOrgapachefelixjettygziphandlerenable(ConfigNodePropertyBoolean orgapachefelixjettygziphandlerenable)
{
	this->orgapachefelixjettygziphandlerenable = orgapachefelixjettygziphandlerenable;
}

ConfigNodePropertyInteger
OrgApacheFelixHttpProperties::getOrgapachefelixjettygzipminGzipSize()
{
	return orgapachefelixjettygzipminGzipSize;
}

void
OrgApacheFelixHttpProperties::setOrgapachefelixjettygzipminGzipSize(ConfigNodePropertyInteger orgapachefelixjettygzipminGzipSize)
{
	this->orgapachefelixjettygzipminGzipSize = orgapachefelixjettygzipminGzipSize;
}

ConfigNodePropertyInteger
OrgApacheFelixHttpProperties::getOrgapachefelixjettygzipcompressionLevel()
{
	return orgapachefelixjettygzipcompressionLevel;
}

void
OrgApacheFelixHttpProperties::setOrgapachefelixjettygzipcompressionLevel(ConfigNodePropertyInteger orgapachefelixjettygzipcompressionLevel)
{
	this->orgapachefelixjettygzipcompressionLevel = orgapachefelixjettygzipcompressionLevel;
}

ConfigNodePropertyInteger
OrgApacheFelixHttpProperties::getOrgapachefelixjettygzipinflateBufferSize()
{
	return orgapachefelixjettygzipinflateBufferSize;
}

void
OrgApacheFelixHttpProperties::setOrgapachefelixjettygzipinflateBufferSize(ConfigNodePropertyInteger orgapachefelixjettygzipinflateBufferSize)
{
	this->orgapachefelixjettygzipinflateBufferSize = orgapachefelixjettygzipinflateBufferSize;
}

ConfigNodePropertyBoolean
OrgApacheFelixHttpProperties::getOrgapachefelixjettygzipsyncFlush()
{
	return orgapachefelixjettygzipsyncFlush;
}

void
OrgApacheFelixHttpProperties::setOrgapachefelixjettygzipsyncFlush(ConfigNodePropertyBoolean orgapachefelixjettygzipsyncFlush)
{
	this->orgapachefelixjettygzipsyncFlush = orgapachefelixjettygzipsyncFlush;
}

ConfigNodePropertyArray
OrgApacheFelixHttpProperties::getOrgapachefelixjettygzipexcludedUserAgents()
{
	return orgapachefelixjettygzipexcludedUserAgents;
}

void
OrgApacheFelixHttpProperties::setOrgapachefelixjettygzipexcludedUserAgents(ConfigNodePropertyArray orgapachefelixjettygzipexcludedUserAgents)
{
	this->orgapachefelixjettygzipexcludedUserAgents = orgapachefelixjettygzipexcludedUserAgents;
}

ConfigNodePropertyArray
OrgApacheFelixHttpProperties::getOrgapachefelixjettygzipincludedMethods()
{
	return orgapachefelixjettygzipincludedMethods;
}

void
OrgApacheFelixHttpProperties::setOrgapachefelixjettygzipincludedMethods(ConfigNodePropertyArray orgapachefelixjettygzipincludedMethods)
{
	this->orgapachefelixjettygzipincludedMethods = orgapachefelixjettygzipincludedMethods;
}

ConfigNodePropertyArray
OrgApacheFelixHttpProperties::getOrgapachefelixjettygzipexcludedMethods()
{
	return orgapachefelixjettygzipexcludedMethods;
}

void
OrgApacheFelixHttpProperties::setOrgapachefelixjettygzipexcludedMethods(ConfigNodePropertyArray orgapachefelixjettygzipexcludedMethods)
{
	this->orgapachefelixjettygzipexcludedMethods = orgapachefelixjettygzipexcludedMethods;
}

ConfigNodePropertyArray
OrgApacheFelixHttpProperties::getOrgapachefelixjettygzipincludedPaths()
{
	return orgapachefelixjettygzipincludedPaths;
}

void
OrgApacheFelixHttpProperties::setOrgapachefelixjettygzipincludedPaths(ConfigNodePropertyArray orgapachefelixjettygzipincludedPaths)
{
	this->orgapachefelixjettygzipincludedPaths = orgapachefelixjettygzipincludedPaths;
}

ConfigNodePropertyArray
OrgApacheFelixHttpProperties::getOrgapachefelixjettygzipexcludedPaths()
{
	return orgapachefelixjettygzipexcludedPaths;
}

void
OrgApacheFelixHttpProperties::setOrgapachefelixjettygzipexcludedPaths(ConfigNodePropertyArray orgapachefelixjettygzipexcludedPaths)
{
	this->orgapachefelixjettygzipexcludedPaths = orgapachefelixjettygzipexcludedPaths;
}

ConfigNodePropertyArray
OrgApacheFelixHttpProperties::getOrgapachefelixjettygzipincludedMimeTypes()
{
	return orgapachefelixjettygzipincludedMimeTypes;
}

void
OrgApacheFelixHttpProperties::setOrgapachefelixjettygzipincludedMimeTypes(ConfigNodePropertyArray orgapachefelixjettygzipincludedMimeTypes)
{
	this->orgapachefelixjettygzipincludedMimeTypes = orgapachefelixjettygzipincludedMimeTypes;
}

ConfigNodePropertyArray
OrgApacheFelixHttpProperties::getOrgapachefelixjettygzipexcludedMimeTypes()
{
	return orgapachefelixjettygzipexcludedMimeTypes;
}

void
OrgApacheFelixHttpProperties::setOrgapachefelixjettygzipexcludedMimeTypes(ConfigNodePropertyArray orgapachefelixjettygzipexcludedMimeTypes)
{
	this->orgapachefelixjettygzipexcludedMimeTypes = orgapachefelixjettygzipexcludedMimeTypes;
}

ConfigNodePropertyBoolean
OrgApacheFelixHttpProperties::getOrgapachefelixhttpsessioninvalidate()
{
	return orgapachefelixhttpsessioninvalidate;
}

void
OrgApacheFelixHttpProperties::setOrgapachefelixhttpsessioninvalidate(ConfigNodePropertyBoolean orgapachefelixhttpsessioninvalidate)
{
	this->orgapachefelixhttpsessioninvalidate = orgapachefelixhttpsessioninvalidate;
}

ConfigNodePropertyBoolean
OrgApacheFelixHttpProperties::getOrgapachefelixhttpsessionuniqueid()
{
	return orgapachefelixhttpsessionuniqueid;
}

void
OrgApacheFelixHttpProperties::setOrgapachefelixhttpsessionuniqueid(ConfigNodePropertyBoolean orgapachefelixhttpsessionuniqueid)
{
	this->orgapachefelixhttpsessionuniqueid = orgapachefelixhttpsessionuniqueid;
}



