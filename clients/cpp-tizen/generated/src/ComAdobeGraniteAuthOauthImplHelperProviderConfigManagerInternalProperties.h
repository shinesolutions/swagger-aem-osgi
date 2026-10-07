/*
 * ComAdobeGraniteAuthOauthImplHelperProviderConfigManagerInternalProperties.h
 *
 * 
 */

#ifndef _ComAdobeGraniteAuthOauthImplHelperProviderConfigManagerInternalProperties_H_
#define _ComAdobeGraniteAuthOauthImplHelperProviderConfigManagerInternalProperties_H_


#include <string>
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

class ComAdobeGraniteAuthOauthImplHelperProviderConfigManagerInternalProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	ComAdobeGraniteAuthOauthImplHelperProviderConfigManagerInternalProperties();
	ComAdobeGraniteAuthOauthImplHelperProviderConfigManagerInternalProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ComAdobeGraniteAuthOauthImplHelperProviderConfigManagerInternalProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyString getOauthcookielogintimeout();

	/*! \brief Set 
	 */
	void setOauthcookielogintimeout(ConfigNodePropertyString  oauthcookielogintimeout);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getOauthcookiemaxage();

	/*! \brief Set 
	 */
	void setOauthcookiemaxage(ConfigNodePropertyString  oauthcookiemaxage);

private:
	ConfigNodePropertyString oauthcookielogintimeout;
	ConfigNodePropertyString oauthcookiemaxage;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ComAdobeGraniteAuthOauthImplHelperProviderConfigManagerInternalProperties_H_ */
