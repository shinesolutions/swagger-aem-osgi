
/*
 * ComAdobeGraniteI18nImplPreferencesLocaleResolverServiceProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ComAdobeGraniteI18nImplPreferencesLocaleResolverServiceProperties_H_
#define TINY_CPP_CLIENT_ComAdobeGraniteI18nImplPreferencesLocaleResolverServiceProperties_H_


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

class ComAdobeGraniteI18nImplPreferencesLocaleResolverServiceProperties{
public:

    /*! \brief Constructor.
	 */
    ComAdobeGraniteI18nImplPreferencesLocaleResolverServiceProperties();
    ComAdobeGraniteI18nImplPreferencesLocaleResolverServiceProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ComAdobeGraniteI18nImplPreferencesLocaleResolverServiceProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyString getSecuritypreferencesname();

	/*! \brief Set 
	 */
	void setSecuritypreferencesname(ConfigNodePropertyString securitypreferencesname);


    private:
    ConfigNodePropertyString securitypreferencesname;
};
}

#endif /* TINY_CPP_CLIENT_ComAdobeGraniteI18nImplPreferencesLocaleResolverServiceProperties_H_ */
