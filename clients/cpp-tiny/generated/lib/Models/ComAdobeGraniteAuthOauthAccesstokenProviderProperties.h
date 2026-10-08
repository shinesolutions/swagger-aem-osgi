
/*
 * ComAdobeGraniteAuthOauthAccesstokenProviderProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ComAdobeGraniteAuthOauthAccesstokenProviderProperties_H_
#define TINY_CPP_CLIENT_ComAdobeGraniteAuthOauthAccesstokenProviderProperties_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ConfigNodePropertyArray.h"
#include "ConfigNodePropertyBoolean.h"
#include "ConfigNodePropertyInteger.h"
#include "ConfigNodePropertyString.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class ComAdobeGraniteAuthOauthAccesstokenProviderProperties{
public:

    /*! \brief Constructor.
	 */
    ComAdobeGraniteAuthOauthAccesstokenProviderProperties();
    ComAdobeGraniteAuthOauthAccesstokenProviderProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ComAdobeGraniteAuthOauthAccesstokenProviderProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyString getName();

	/*! \brief Set 
	 */
	void setName(ConfigNodePropertyString name);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getAuthtokenprovidertitle();

	/*! \brief Set 
	 */
	void setAuthtokenprovidertitle(ConfigNodePropertyString authtokenprovidertitle);
	/*! \brief Get 
	 */
	ConfigNodePropertyArray getAuthtokenproviderdefaultclaims();

	/*! \brief Set 
	 */
	void setAuthtokenproviderdefaultclaims(ConfigNodePropertyArray authtokenproviderdefaultclaims);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getAuthtokenproviderendpoint();

	/*! \brief Set 
	 */
	void setAuthtokenproviderendpoint(ConfigNodePropertyString authtokenproviderendpoint);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getAuthaccesstokenrequest();

	/*! \brief Set 
	 */
	void setAuthaccesstokenrequest(ConfigNodePropertyString authaccesstokenrequest);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getAuthtokenproviderkeypairalias();

	/*! \brief Set 
	 */
	void setAuthtokenproviderkeypairalias(ConfigNodePropertyString authtokenproviderkeypairalias);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getAuthtokenproviderconntimeout();

	/*! \brief Set 
	 */
	void setAuthtokenproviderconntimeout(ConfigNodePropertyInteger authtokenproviderconntimeout);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getAuthtokenprovidersotimeout();

	/*! \brief Set 
	 */
	void setAuthtokenprovidersotimeout(ConfigNodePropertyInteger authtokenprovidersotimeout);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getAuthtokenproviderclientid();

	/*! \brief Set 
	 */
	void setAuthtokenproviderclientid(ConfigNodePropertyString authtokenproviderclientid);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getAuthtokenproviderscope();

	/*! \brief Set 
	 */
	void setAuthtokenproviderscope(ConfigNodePropertyString authtokenproviderscope);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getAuthtokenproviderreuseaccesstoken();

	/*! \brief Set 
	 */
	void setAuthtokenproviderreuseaccesstoken(ConfigNodePropertyBoolean authtokenproviderreuseaccesstoken);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getAuthtokenproviderrelaxedssl();

	/*! \brief Set 
	 */
	void setAuthtokenproviderrelaxedssl(ConfigNodePropertyBoolean authtokenproviderrelaxedssl);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getTokenrequestcustomizertype();

	/*! \brief Set 
	 */
	void setTokenrequestcustomizertype(ConfigNodePropertyString tokenrequestcustomizertype);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getAuthtokenvalidatortype();

	/*! \brief Set 
	 */
	void setAuthtokenvalidatortype(ConfigNodePropertyString authtokenvalidatortype);


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
};
}

#endif /* TINY_CPP_CLIENT_ComAdobeGraniteAuthOauthAccesstokenProviderProperties_H_ */
