/*
 * ComAdobeGraniteAuthOauthImplOAuthAuthenticationHandlerProperties.h
 *
 * 
 */

#ifndef _ComAdobeGraniteAuthOauthImplOAuthAuthenticationHandlerProperties_H_
#define _ComAdobeGraniteAuthOauthImplOAuthAuthenticationHandlerProperties_H_


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

class ComAdobeGraniteAuthOauthImplOAuthAuthenticationHandlerProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	ComAdobeGraniteAuthOauthImplOAuthAuthenticationHandlerProperties();
	ComAdobeGraniteAuthOauthImplOAuthAuthenticationHandlerProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ComAdobeGraniteAuthOauthImplOAuthAuthenticationHandlerProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyString getPath();

	/*! \brief Set 
	 */
	void setPath(ConfigNodePropertyString  path);

private:
	ConfigNodePropertyString path;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ComAdobeGraniteAuthOauthImplOAuthAuthenticationHandlerProperties_H_ */
