
/*
 * ComAdobeGraniteOauthServerImplOAuth2ClientRevocationServletProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ComAdobeGraniteOauthServerImplOAuth2ClientRevocationServletProperties_H_
#define TINY_CPP_CLIENT_ComAdobeGraniteOauthServerImplOAuth2ClientRevocationServletProperties_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ConfigNodePropertyBoolean.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class ComAdobeGraniteOauthServerImplOAuth2ClientRevocationServletProperties{
public:

    /*! \brief Constructor.
	 */
    ComAdobeGraniteOauthServerImplOAuth2ClientRevocationServletProperties();
    ComAdobeGraniteOauthServerImplOAuth2ClientRevocationServletProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ComAdobeGraniteOauthServerImplOAuth2ClientRevocationServletProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getOauthclientrevocationactive();

	/*! \brief Set 
	 */
	void setOauthclientrevocationactive(ConfigNodePropertyBoolean oauthclientrevocationactive);


    private:
    ConfigNodePropertyBoolean oauthclientrevocationactive;
};
}

#endif /* TINY_CPP_CLIENT_ComAdobeGraniteOauthServerImplOAuth2ClientRevocationServletProperties_H_ */
