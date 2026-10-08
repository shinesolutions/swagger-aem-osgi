
/*
 * ComAdobeGraniteAuthOauthImplHelperProviderConfigManagerInternalProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ComAdobeGraniteAuthOauthImplHelperProviderConfigManagerInternalProperties_H_
#define TINY_CPP_CLIENT_ComAdobeGraniteAuthOauthImplHelperProviderConfigManagerInternalProperties_H_


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

class ComAdobeGraniteAuthOauthImplHelperProviderConfigManagerInternalProperties{
public:

    /*! \brief Constructor.
	 */
    ComAdobeGraniteAuthOauthImplHelperProviderConfigManagerInternalProperties();
    ComAdobeGraniteAuthOauthImplHelperProviderConfigManagerInternalProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ComAdobeGraniteAuthOauthImplHelperProviderConfigManagerInternalProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyString getOauthcookielogintimeout();

	/*! \brief Set 
	 */
	void setOauthcookielogintimeout(ConfigNodePropertyString oauthcookielogintimeout);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getOauthcookiemaxage();

	/*! \brief Set 
	 */
	void setOauthcookiemaxage(ConfigNodePropertyString oauthcookiemaxage);


    private:
    ConfigNodePropertyString oauthcookielogintimeout;
    ConfigNodePropertyString oauthcookiemaxage;
};
}

#endif /* TINY_CPP_CLIENT_ComAdobeGraniteAuthOauthImplHelperProviderConfigManagerInternalProperties_H_ */
