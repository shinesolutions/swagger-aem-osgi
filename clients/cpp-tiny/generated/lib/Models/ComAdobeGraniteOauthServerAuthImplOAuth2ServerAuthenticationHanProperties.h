
/*
 * ComAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ComAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanProperties_H_
#define TINY_CPP_CLIENT_ComAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanProperties_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ConfigNodePropertyBoolean.h"
#include "ConfigNodePropertyInteger.h"
#include "ConfigNodePropertyString.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class ComAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanProperties{
public:

    /*! \brief Constructor.
	 */
    ComAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanProperties();
    ComAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ComAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyString getPath();

	/*! \brief Set 
	 */
	void setPath(ConfigNodePropertyString path);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getJaascontrolFlag();

	/*! \brief Set 
	 */
	void setJaascontrolFlag(ConfigNodePropertyString jaascontrolFlag);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getJaasrealmName();

	/*! \brief Set 
	 */
	void setJaasrealmName(ConfigNodePropertyString jaasrealmName);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getJaasranking();

	/*! \brief Set 
	 */
	void setJaasranking(ConfigNodePropertyInteger jaasranking);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getOauthofflinevalidation();

	/*! \brief Set 
	 */
	void setOauthofflinevalidation(ConfigNodePropertyBoolean oauthofflinevalidation);


    private:
    ConfigNodePropertyString path;
    ConfigNodePropertyString jaascontrolFlag;
    ConfigNodePropertyString jaasrealmName;
    ConfigNodePropertyInteger jaasranking;
    ConfigNodePropertyBoolean oauthofflinevalidation;
};
}

#endif /* TINY_CPP_CLIENT_ComAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanProperties_H_ */
