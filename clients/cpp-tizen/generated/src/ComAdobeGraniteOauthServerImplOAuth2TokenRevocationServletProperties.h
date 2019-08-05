/*
 * ComAdobeGraniteOauthServerImplOAuth2TokenRevocationServletProperties.h
 *
 * 
 */

#ifndef _ComAdobeGraniteOauthServerImplOAuth2TokenRevocationServletProperties_H_
#define _ComAdobeGraniteOauthServerImplOAuth2TokenRevocationServletProperties_H_


#include <string>
#include "ConfigNodePropertyBoolean.h"
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

class ComAdobeGraniteOauthServerImplOAuth2TokenRevocationServletProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	ComAdobeGraniteOauthServerImplOAuth2TokenRevocationServletProperties();
	ComAdobeGraniteOauthServerImplOAuth2TokenRevocationServletProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ComAdobeGraniteOauthServerImplOAuth2TokenRevocationServletProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getOauthtokenrevocationactive();

	/*! \brief Set 
	 */
	void setOauthtokenrevocationactive(ConfigNodePropertyBoolean  oauthtokenrevocationactive);

private:
	ConfigNodePropertyBoolean oauthtokenrevocationactive;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ComAdobeGraniteOauthServerImplOAuth2TokenRevocationServletProperties_H_ */
