/*
 * OrgApacheFelixHttpProperties.h
 *
 * 
 */

#ifndef _OrgApacheFelixHttpProperties_H_
#define _OrgApacheFelixHttpProperties_H_


#include <string>
#include "ConfigNodePropertyArray.h"
#include "ConfigNodePropertyBoolean.h"
#include "ConfigNodePropertyDropDown.h"
#include "ConfigNodePropertyInteger.h"
#include "ConfigNodePropertyString.h"
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class OrgApacheFelixHttpProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	OrgApacheFelixHttpProperties();
	OrgApacheFelixHttpProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~OrgApacheFelixHttpProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyString getOrgapachefelixhttphost();

	/*! \brief Set 
	 */
	void setOrgapachefelixhttphost(ConfigNodePropertyString  orgapachefelixhttphost);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getOrgapachefelixhttpenable();

	/*! \brief Set 
	 */
	void setOrgapachefelixhttpenable(ConfigNodePropertyBoolean  orgapachefelixhttpenable);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getOrgosgiservicehttpport();

	/*! \brief Set 
	 */
	void setOrgosgiservicehttpport(ConfigNodePropertyInteger  orgosgiservicehttpport);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getOrgapachefelixhttptimeout();

	/*! \brief Set 
	 */
	void setOrgapachefelixhttptimeout(ConfigNodePropertyInteger  orgapachefelixhttptimeout);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getOrgapachefelixhttpsenable();

	/*! \brief Set 
	 */
	void setOrgapachefelixhttpsenable(ConfigNodePropertyBoolean  orgapachefelixhttpsenable);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getOrgosgiservicehttpportsecure();

	/*! \brief Set 
	 */
	void setOrgosgiservicehttpportsecure(ConfigNodePropertyInteger  orgosgiservicehttpportsecure);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getOrgapachefelixhttpskeystore();

	/*! \brief Set 
	 */
	void setOrgapachefelixhttpskeystore(ConfigNodePropertyString  orgapachefelixhttpskeystore);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getOrgapachefelixhttpskeystorepassword();

	/*! \brief Set 
	 */
	void setOrgapachefelixhttpskeystorepassword(ConfigNodePropertyString  orgapachefelixhttpskeystorepassword);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getOrgapachefelixhttpskeystorekeypassword();

	/*! \brief Set 
	 */
	void setOrgapachefelixhttpskeystorekeypassword(ConfigNodePropertyString  orgapachefelixhttpskeystorekeypassword);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getOrgapachefelixhttpstruststore();

	/*! \brief Set 
	 */
	void setOrgapachefelixhttpstruststore(ConfigNodePropertyString  orgapachefelixhttpstruststore);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getOrgapachefelixhttpstruststorepassword();

	/*! \brief Set 
	 */
	void setOrgapachefelixhttpstruststorepassword(ConfigNodePropertyString  orgapachefelixhttpstruststorepassword);
	/*! \brief Get 
	 */
	ConfigNodePropertyDropDown getOrgapachefelixhttpsclientcertificate();

	/*! \brief Set 
	 */
	void setOrgapachefelixhttpsclientcertificate(ConfigNodePropertyDropDown  orgapachefelixhttpsclientcertificate);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getOrgapachefelixhttpcontextPath();

	/*! \brief Set 
	 */
	void setOrgapachefelixhttpcontextPath(ConfigNodePropertyString  orgapachefelixhttpcontext_path);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getOrgapachefelixhttpmbeans();

	/*! \brief Set 
	 */
	void setOrgapachefelixhttpmbeans(ConfigNodePropertyBoolean  orgapachefelixhttpmbeans);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getOrgapachefelixhttpsessiontimeout();

	/*! \brief Set 
	 */
	void setOrgapachefelixhttpsessiontimeout(ConfigNodePropertyInteger  orgapachefelixhttpsessiontimeout);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getOrgapachefelixhttpjettythreadpoolmax();

	/*! \brief Set 
	 */
	void setOrgapachefelixhttpjettythreadpoolmax(ConfigNodePropertyInteger  orgapachefelixhttpjettythreadpoolmax);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getOrgapachefelixhttpjettyacceptors();

	/*! \brief Set 
	 */
	void setOrgapachefelixhttpjettyacceptors(ConfigNodePropertyInteger  orgapachefelixhttpjettyacceptors);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getOrgapachefelixhttpjettyselectors();

	/*! \brief Set 
	 */
	void setOrgapachefelixhttpjettyselectors(ConfigNodePropertyInteger  orgapachefelixhttpjettyselectors);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getOrgapachefelixhttpjettyheaderBufferSize();

	/*! \brief Set 
	 */
	void setOrgapachefelixhttpjettyheaderBufferSize(ConfigNodePropertyInteger  orgapachefelixhttpjettyheaderBufferSize);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getOrgapachefelixhttpjettyrequestBufferSize();

	/*! \brief Set 
	 */
	void setOrgapachefelixhttpjettyrequestBufferSize(ConfigNodePropertyInteger  orgapachefelixhttpjettyrequestBufferSize);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getOrgapachefelixhttpjettyresponseBufferSize();

	/*! \brief Set 
	 */
	void setOrgapachefelixhttpjettyresponseBufferSize(ConfigNodePropertyInteger  orgapachefelixhttpjettyresponseBufferSize);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getOrgapachefelixhttpjettymaxFormSize();

	/*! \brief Set 
	 */
	void setOrgapachefelixhttpjettymaxFormSize(ConfigNodePropertyInteger  orgapachefelixhttpjettymaxFormSize);
	/*! \brief Get 
	 */
	ConfigNodePropertyArray getOrgapachefelixhttppathExclusions();

	/*! \brief Set 
	 */
	void setOrgapachefelixhttppathExclusions(ConfigNodePropertyArray  orgapachefelixhttppath_exclusions);
	/*! \brief Get 
	 */
	ConfigNodePropertyArray getOrgapachefelixhttpsjettyciphersuitesexcluded();

	/*! \brief Set 
	 */
	void setOrgapachefelixhttpsjettyciphersuitesexcluded(ConfigNodePropertyArray  orgapachefelixhttpsjettyciphersuitesexcluded);
	/*! \brief Get 
	 */
	ConfigNodePropertyArray getOrgapachefelixhttpsjettyciphersuitesincluded();

	/*! \brief Set 
	 */
	void setOrgapachefelixhttpsjettyciphersuitesincluded(ConfigNodePropertyArray  orgapachefelixhttpsjettyciphersuitesincluded);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getOrgapachefelixhttpjettysendServerHeader();

	/*! \brief Set 
	 */
	void setOrgapachefelixhttpjettysendServerHeader(ConfigNodePropertyBoolean  orgapachefelixhttpjettysendServerHeader);
	/*! \brief Get 
	 */
	ConfigNodePropertyArray getOrgapachefelixhttpsjettyprotocolsincluded();

	/*! \brief Set 
	 */
	void setOrgapachefelixhttpsjettyprotocolsincluded(ConfigNodePropertyArray  orgapachefelixhttpsjettyprotocolsincluded);
	/*! \brief Get 
	 */
	ConfigNodePropertyArray getOrgapachefelixhttpsjettyprotocolsexcluded();

	/*! \brief Set 
	 */
	void setOrgapachefelixhttpsjettyprotocolsexcluded(ConfigNodePropertyArray  orgapachefelixhttpsjettyprotocolsexcluded);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getOrgapachefelixproxyloadbalancerconnectionenable();

	/*! \brief Set 
	 */
	void setOrgapachefelixproxyloadbalancerconnectionenable(ConfigNodePropertyBoolean  orgapachefelixproxyloadbalancerconnectionenable);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getOrgapachefelixhttpsjettyrenegotiateAllowed();

	/*! \brief Set 
	 */
	void setOrgapachefelixhttpsjettyrenegotiateAllowed(ConfigNodePropertyBoolean  orgapachefelixhttpsjettyrenegotiateAllowed);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getOrgapachefelixhttpsjettysessioncookiehttpOnly();

	/*! \brief Set 
	 */
	void setOrgapachefelixhttpsjettysessioncookiehttpOnly(ConfigNodePropertyBoolean  orgapachefelixhttpsjettysessioncookiehttpOnly);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getOrgapachefelixhttpsjettysessioncookiesecure();

	/*! \brief Set 
	 */
	void setOrgapachefelixhttpsjettysessioncookiesecure(ConfigNodePropertyBoolean  orgapachefelixhttpsjettysessioncookiesecure);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getOrgeclipsejettyservletSessionIdPathParameterName();

	/*! \brief Set 
	 */
	void setOrgeclipsejettyservletSessionIdPathParameterName(ConfigNodePropertyString  orgeclipsejettyservletSessionIdPathParameterName);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getOrgeclipsejettyservletCheckingRemoteSessionIdEncoding();

	/*! \brief Set 
	 */
	void setOrgeclipsejettyservletCheckingRemoteSessionIdEncoding(ConfigNodePropertyBoolean  orgeclipsejettyservletCheckingRemoteSessionIdEncoding);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getOrgeclipsejettyservletSessionCookie();

	/*! \brief Set 
	 */
	void setOrgeclipsejettyservletSessionCookie(ConfigNodePropertyString  orgeclipsejettyservletSessionCookie);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getOrgeclipsejettyservletSessionDomain();

	/*! \brief Set 
	 */
	void setOrgeclipsejettyservletSessionDomain(ConfigNodePropertyString  orgeclipsejettyservletSessionDomain);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getOrgeclipsejettyservletSessionPath();

	/*! \brief Set 
	 */
	void setOrgeclipsejettyservletSessionPath(ConfigNodePropertyString  orgeclipsejettyservletSessionPath);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getOrgeclipsejettyservletMaxAge();

	/*! \brief Set 
	 */
	void setOrgeclipsejettyservletMaxAge(ConfigNodePropertyInteger  orgeclipsejettyservletMaxAge);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getOrgapachefelixhttpname();

	/*! \brief Set 
	 */
	void setOrgapachefelixhttpname(ConfigNodePropertyString  orgapachefelixhttpname);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getOrgapachefelixjettygziphandlerenable();

	/*! \brief Set 
	 */
	void setOrgapachefelixjettygziphandlerenable(ConfigNodePropertyBoolean  orgapachefelixjettygziphandlerenable);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getOrgapachefelixjettygzipminGzipSize();

	/*! \brief Set 
	 */
	void setOrgapachefelixjettygzipminGzipSize(ConfigNodePropertyInteger  orgapachefelixjettygzipminGzipSize);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getOrgapachefelixjettygzipcompressionLevel();

	/*! \brief Set 
	 */
	void setOrgapachefelixjettygzipcompressionLevel(ConfigNodePropertyInteger  orgapachefelixjettygzipcompressionLevel);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getOrgapachefelixjettygzipinflateBufferSize();

	/*! \brief Set 
	 */
	void setOrgapachefelixjettygzipinflateBufferSize(ConfigNodePropertyInteger  orgapachefelixjettygzipinflateBufferSize);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getOrgapachefelixjettygzipsyncFlush();

	/*! \brief Set 
	 */
	void setOrgapachefelixjettygzipsyncFlush(ConfigNodePropertyBoolean  orgapachefelixjettygzipsyncFlush);
	/*! \brief Get 
	 */
	ConfigNodePropertyArray getOrgapachefelixjettygzipexcludedUserAgents();

	/*! \brief Set 
	 */
	void setOrgapachefelixjettygzipexcludedUserAgents(ConfigNodePropertyArray  orgapachefelixjettygzipexcludedUserAgents);
	/*! \brief Get 
	 */
	ConfigNodePropertyArray getOrgapachefelixjettygzipincludedMethods();

	/*! \brief Set 
	 */
	void setOrgapachefelixjettygzipincludedMethods(ConfigNodePropertyArray  orgapachefelixjettygzipincludedMethods);
	/*! \brief Get 
	 */
	ConfigNodePropertyArray getOrgapachefelixjettygzipexcludedMethods();

	/*! \brief Set 
	 */
	void setOrgapachefelixjettygzipexcludedMethods(ConfigNodePropertyArray  orgapachefelixjettygzipexcludedMethods);
	/*! \brief Get 
	 */
	ConfigNodePropertyArray getOrgapachefelixjettygzipincludedPaths();

	/*! \brief Set 
	 */
	void setOrgapachefelixjettygzipincludedPaths(ConfigNodePropertyArray  orgapachefelixjettygzipincludedPaths);
	/*! \brief Get 
	 */
	ConfigNodePropertyArray getOrgapachefelixjettygzipexcludedPaths();

	/*! \brief Set 
	 */
	void setOrgapachefelixjettygzipexcludedPaths(ConfigNodePropertyArray  orgapachefelixjettygzipexcludedPaths);
	/*! \brief Get 
	 */
	ConfigNodePropertyArray getOrgapachefelixjettygzipincludedMimeTypes();

	/*! \brief Set 
	 */
	void setOrgapachefelixjettygzipincludedMimeTypes(ConfigNodePropertyArray  orgapachefelixjettygzipincludedMimeTypes);
	/*! \brief Get 
	 */
	ConfigNodePropertyArray getOrgapachefelixjettygzipexcludedMimeTypes();

	/*! \brief Set 
	 */
	void setOrgapachefelixjettygzipexcludedMimeTypes(ConfigNodePropertyArray  orgapachefelixjettygzipexcludedMimeTypes);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getOrgapachefelixhttpsessioninvalidate();

	/*! \brief Set 
	 */
	void setOrgapachefelixhttpsessioninvalidate(ConfigNodePropertyBoolean  orgapachefelixhttpsessioninvalidate);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getOrgapachefelixhttpsessionuniqueid();

	/*! \brief Set 
	 */
	void setOrgapachefelixhttpsessionuniqueid(ConfigNodePropertyBoolean  orgapachefelixhttpsessionuniqueid);

private:
	ConfigNodePropertyString orgapachefelixhttphost;
	ConfigNodePropertyBoolean orgapachefelixhttpenable;
	ConfigNodePropertyInteger orgosgiservicehttpport;
	ConfigNodePropertyInteger orgapachefelixhttptimeout;
	ConfigNodePropertyBoolean orgapachefelixhttpsenable;
	ConfigNodePropertyInteger orgosgiservicehttpportsecure;
	ConfigNodePropertyString orgapachefelixhttpskeystore;
	ConfigNodePropertyString orgapachefelixhttpskeystorepassword;
	ConfigNodePropertyString orgapachefelixhttpskeystorekeypassword;
	ConfigNodePropertyString orgapachefelixhttpstruststore;
	ConfigNodePropertyString orgapachefelixhttpstruststorepassword;
	ConfigNodePropertyDropDown orgapachefelixhttpsclientcertificate;
	ConfigNodePropertyString orgapachefelixhttpcontext_path;
	ConfigNodePropertyBoolean orgapachefelixhttpmbeans;
	ConfigNodePropertyInteger orgapachefelixhttpsessiontimeout;
	ConfigNodePropertyInteger orgapachefelixhttpjettythreadpoolmax;
	ConfigNodePropertyInteger orgapachefelixhttpjettyacceptors;
	ConfigNodePropertyInteger orgapachefelixhttpjettyselectors;
	ConfigNodePropertyInteger orgapachefelixhttpjettyheaderBufferSize;
	ConfigNodePropertyInteger orgapachefelixhttpjettyrequestBufferSize;
	ConfigNodePropertyInteger orgapachefelixhttpjettyresponseBufferSize;
	ConfigNodePropertyInteger orgapachefelixhttpjettymaxFormSize;
	ConfigNodePropertyArray orgapachefelixhttppath_exclusions;
	ConfigNodePropertyArray orgapachefelixhttpsjettyciphersuitesexcluded;
	ConfigNodePropertyArray orgapachefelixhttpsjettyciphersuitesincluded;
	ConfigNodePropertyBoolean orgapachefelixhttpjettysendServerHeader;
	ConfigNodePropertyArray orgapachefelixhttpsjettyprotocolsincluded;
	ConfigNodePropertyArray orgapachefelixhttpsjettyprotocolsexcluded;
	ConfigNodePropertyBoolean orgapachefelixproxyloadbalancerconnectionenable;
	ConfigNodePropertyBoolean orgapachefelixhttpsjettyrenegotiateAllowed;
	ConfigNodePropertyBoolean orgapachefelixhttpsjettysessioncookiehttpOnly;
	ConfigNodePropertyBoolean orgapachefelixhttpsjettysessioncookiesecure;
	ConfigNodePropertyString orgeclipsejettyservletSessionIdPathParameterName;
	ConfigNodePropertyBoolean orgeclipsejettyservletCheckingRemoteSessionIdEncoding;
	ConfigNodePropertyString orgeclipsejettyservletSessionCookie;
	ConfigNodePropertyString orgeclipsejettyservletSessionDomain;
	ConfigNodePropertyString orgeclipsejettyservletSessionPath;
	ConfigNodePropertyInteger orgeclipsejettyservletMaxAge;
	ConfigNodePropertyString orgapachefelixhttpname;
	ConfigNodePropertyBoolean orgapachefelixjettygziphandlerenable;
	ConfigNodePropertyInteger orgapachefelixjettygzipminGzipSize;
	ConfigNodePropertyInteger orgapachefelixjettygzipcompressionLevel;
	ConfigNodePropertyInteger orgapachefelixjettygzipinflateBufferSize;
	ConfigNodePropertyBoolean orgapachefelixjettygzipsyncFlush;
	ConfigNodePropertyArray orgapachefelixjettygzipexcludedUserAgents;
	ConfigNodePropertyArray orgapachefelixjettygzipincludedMethods;
	ConfigNodePropertyArray orgapachefelixjettygzipexcludedMethods;
	ConfigNodePropertyArray orgapachefelixjettygzipincludedPaths;
	ConfigNodePropertyArray orgapachefelixjettygzipexcludedPaths;
	ConfigNodePropertyArray orgapachefelixjettygzipincludedMimeTypes;
	ConfigNodePropertyArray orgapachefelixjettygzipexcludedMimeTypes;
	ConfigNodePropertyBoolean orgapachefelixhttpsessioninvalidate;
	ConfigNodePropertyBoolean orgapachefelixhttpsessionuniqueid;
	void __init();
	void __cleanup();

};
}
}

#endif /* _OrgApacheFelixHttpProperties_H_ */
