/*
 * ComAdobeGraniteAuthOauthAccesstokenProviderProperties.h
 *
 * 
 */

#ifndef _ComAdobeGraniteAuthOauthAccesstokenProviderProperties_H_
#define _ComAdobeGraniteAuthOauthAccesstokenProviderProperties_H_


#include <string>
#include "ConfigNodePropertyArray.h"
#include "ConfigNodePropertyBoolean.h"
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

class ComAdobeGraniteAuthOauthAccesstokenProviderProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	ComAdobeGraniteAuthOauthAccesstokenProviderProperties();
	ComAdobeGraniteAuthOauthAccesstokenProviderProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ComAdobeGraniteAuthOauthAccesstokenProviderProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyString getName();

	/*! \brief Set 
	 */
	void setName(ConfigNodePropertyString  name);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getAuthtokenprovidertitle();

	/*! \brief Set 
	 */
	void setAuthtokenprovidertitle(ConfigNodePropertyString  authtokenprovidertitle);
	/*! \brief Get 
	 */
	ConfigNodePropertyArray getAuthtokenproviderdefaultclaims();

	/*! \brief Set 
	 */
	void setAuthtokenproviderdefaultclaims(ConfigNodePropertyArray  authtokenproviderdefaultclaims);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getAuthtokenproviderendpoint();

	/*! \brief Set 
	 */
	void setAuthtokenproviderendpoint(ConfigNodePropertyString  authtokenproviderendpoint);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getAuthaccesstokenrequest();

	/*! \brief Set 
	 */
	void setAuthaccesstokenrequest(ConfigNodePropertyString  authaccesstokenrequest);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getAuthtokenproviderkeypairalias();

	/*! \brief Set 
	 */
	void setAuthtokenproviderkeypairalias(ConfigNodePropertyString  authtokenproviderkeypairalias);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getAuthtokenproviderconntimeout();

	/*! \brief Set 
	 */
	void setAuthtokenproviderconntimeout(ConfigNodePropertyInteger  authtokenproviderconntimeout);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getAuthtokenprovidersotimeout();

	/*! \brief Set 
	 */
	void setAuthtokenprovidersotimeout(ConfigNodePropertyInteger  authtokenprovidersotimeout);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getAuthtokenproviderclientid();

	/*! \brief Set 
	 */
	void setAuthtokenproviderclientid(ConfigNodePropertyString  authtokenproviderclientid);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getAuthtokenproviderscope();

	/*! \brief Set 
	 */
	void setAuthtokenproviderscope(ConfigNodePropertyString  authtokenproviderscope);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getAuthtokenproviderreuseaccesstoken();

	/*! \brief Set 
	 */
	void setAuthtokenproviderreuseaccesstoken(ConfigNodePropertyBoolean  authtokenproviderreuseaccesstoken);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getAuthtokenproviderrelaxedssl();

	/*! \brief Set 
	 */
	void setAuthtokenproviderrelaxedssl(ConfigNodePropertyBoolean  authtokenproviderrelaxedssl);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getTokenrequestcustomizertype();

	/*! \brief Set 
	 */
	void setTokenrequestcustomizertype(ConfigNodePropertyString  tokenrequestcustomizertype);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getAuthtokenvalidatortype();

	/*! \brief Set 
	 */
	void setAuthtokenvalidatortype(ConfigNodePropertyString  authtokenvalidatortype);

private:
	ConfigNodePropertyString name;
	ConfigNodePropertyString authtokenprovidertitle;
	ConfigNodePropertyArray authtokenproviderdefaultclaims;
	ConfigNodePropertyString authtokenproviderendpoint;
	ConfigNodePropertyString authaccesstokenrequest;
	ConfigNodePropertyString authtokenproviderkeypairalias;
	ConfigNodePropertyInteger authtokenproviderconntimeout;
	ConfigNodePropertyInteger authtokenprovidersotimeout;
	ConfigNodePropertyString authtokenproviderclientid;
	ConfigNodePropertyString authtokenproviderscope;
	ConfigNodePropertyBoolean authtokenproviderreuseaccesstoken;
	ConfigNodePropertyBoolean authtokenproviderrelaxedssl;
	ConfigNodePropertyString tokenrequestcustomizertype;
	ConfigNodePropertyString authtokenvalidatortype;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ComAdobeGraniteAuthOauthAccesstokenProviderProperties_H_ */
