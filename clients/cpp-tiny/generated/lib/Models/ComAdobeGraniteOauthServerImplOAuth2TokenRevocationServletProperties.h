
/*
 * ComAdobeGraniteOauthServerImplOAuth2TokenRevocationServletProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ComAdobeGraniteOauthServerImplOAuth2TokenRevocationServletProperties_H_
#define TINY_CPP_CLIENT_ComAdobeGraniteOauthServerImplOAuth2TokenRevocationServletProperties_H_


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

class ComAdobeGraniteOauthServerImplOAuth2TokenRevocationServletProperties{
public:

    /*! \brief Constructor.
	 */
    ComAdobeGraniteOauthServerImplOAuth2TokenRevocationServletProperties();
    ComAdobeGraniteOauthServerImplOAuth2TokenRevocationServletProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ComAdobeGraniteOauthServerImplOAuth2TokenRevocationServletProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getOauthtokenrevocationactive();

	/*! \brief Set 
	 */
	void setOauthtokenrevocationactive(ConfigNodePropertyBoolean oauthtokenrevocationactive);


    private:
    ConfigNodePropertyBoolean oauthtokenrevocationactive;
};
}

#endif /* TINY_CPP_CLIENT_ComAdobeGraniteOauthServerImplOAuth2TokenRevocationServletProperties_H_ */
