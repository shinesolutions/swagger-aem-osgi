
/*
 * ComAdobeGraniteOauthServerImplOAuth2RevocationEndpointServletProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ComAdobeGraniteOauthServerImplOAuth2RevocationEndpointServletProperties_H_
#define TINY_CPP_CLIENT_ComAdobeGraniteOauthServerImplOAuth2RevocationEndpointServletProperties_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ConfigNodePropertyBoolean.h"
#include "ConfigNodePropertyString.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class ComAdobeGraniteOauthServerImplOAuth2RevocationEndpointServletProperties{
public:

    /*! \brief Constructor.
	 */
    ComAdobeGraniteOauthServerImplOAuth2RevocationEndpointServletProperties();
    ComAdobeGraniteOauthServerImplOAuth2RevocationEndpointServletProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ComAdobeGraniteOauthServerImplOAuth2RevocationEndpointServletProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyString getSlingservletpaths();

	/*! \brief Set 
	 */
	void setSlingservletpaths(ConfigNodePropertyString slingservletpaths);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getOauthrevocationactive();

	/*! \brief Set 
	 */
	void setOauthrevocationactive(ConfigNodePropertyBoolean oauthrevocationactive);


    private:
    ConfigNodePropertyString slingservletpaths;
    ConfigNodePropertyBoolean oauthrevocationactive;
};
}

#endif /* TINY_CPP_CLIENT_ComAdobeGraniteOauthServerImplOAuth2RevocationEndpointServletProperties_H_ */
