/*
 * ComAdobeGraniteOauthServerImplOAuth2RevocationEndpointServletProperties.h
 *
 * 
 */

#ifndef _ComAdobeGraniteOauthServerImplOAuth2RevocationEndpointServletProperties_H_
#define _ComAdobeGraniteOauthServerImplOAuth2RevocationEndpointServletProperties_H_


#include <string>
#include "ConfigNodePropertyBoolean.h"
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

class ComAdobeGraniteOauthServerImplOAuth2RevocationEndpointServletProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	ComAdobeGraniteOauthServerImplOAuth2RevocationEndpointServletProperties();
	ComAdobeGraniteOauthServerImplOAuth2RevocationEndpointServletProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ComAdobeGraniteOauthServerImplOAuth2RevocationEndpointServletProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyString getSlingservletpaths();

	/*! \brief Set 
	 */
	void setSlingservletpaths(ConfigNodePropertyString  slingservletpaths);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getOauthrevocationactive();

	/*! \brief Set 
	 */
	void setOauthrevocationactive(ConfigNodePropertyBoolean  oauthrevocationactive);

private:
	ConfigNodePropertyString slingservletpaths;
	ConfigNodePropertyBoolean oauthrevocationactive;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ComAdobeGraniteOauthServerImplOAuth2RevocationEndpointServletProperties_H_ */
