/*
 * ComAdobeGraniteI18nImplPreferencesLocaleResolverServiceProperties.h
 *
 * 
 */

#ifndef _ComAdobeGraniteI18nImplPreferencesLocaleResolverServiceProperties_H_
#define _ComAdobeGraniteI18nImplPreferencesLocaleResolverServiceProperties_H_


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

class ComAdobeGraniteI18nImplPreferencesLocaleResolverServiceProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	ComAdobeGraniteI18nImplPreferencesLocaleResolverServiceProperties();
	ComAdobeGraniteI18nImplPreferencesLocaleResolverServiceProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ComAdobeGraniteI18nImplPreferencesLocaleResolverServiceProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyString getSecuritypreferencesname();

	/*! \brief Set 
	 */
	void setSecuritypreferencesname(ConfigNodePropertyString  securitypreferencesname);

private:
	ConfigNodePropertyString securitypreferencesname;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ComAdobeGraniteI18nImplPreferencesLocaleResolverServiceProperties_H_ */
