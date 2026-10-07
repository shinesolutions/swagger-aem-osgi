
/*
 * ComAdobeGraniteAuthOauthImplDefaultTokenValidatorImplProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ComAdobeGraniteAuthOauthImplDefaultTokenValidatorImplProperties_H_
#define TINY_CPP_CLIENT_ComAdobeGraniteAuthOauthImplDefaultTokenValidatorImplProperties_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ConfigNodePropertyString.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class ComAdobeGraniteAuthOauthImplDefaultTokenValidatorImplProperties{
public:

    /*! \brief Constructor.
	 */
    ComAdobeGraniteAuthOauthImplDefaultTokenValidatorImplProperties();
    ComAdobeGraniteAuthOauthImplDefaultTokenValidatorImplProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ComAdobeGraniteAuthOauthImplDefaultTokenValidatorImplProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyString getAuthtokenvalidatortype();

	/*! \brief Set 
	 */
	void setAuthtokenvalidatortype(ConfigNodePropertyString authtokenvalidatortype);


    private:
    ConfigNodePropertyString authtokenvalidatortype;
};
}

#endif /* TINY_CPP_CLIENT_ComAdobeGraniteAuthOauthImplDefaultTokenValidatorImplProperties_H_ */
