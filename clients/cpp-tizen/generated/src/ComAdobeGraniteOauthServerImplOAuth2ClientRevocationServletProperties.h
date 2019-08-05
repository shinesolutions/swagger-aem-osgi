/*
 * ComAdobeGraniteOauthServerImplOAuth2ClientRevocationServletProperties.h
 *
 * 
 */

#ifndef _ComAdobeGraniteOauthServerImplOAuth2ClientRevocationServletProperties_H_
#define _ComAdobeGraniteOauthServerImplOAuth2ClientRevocationServletProperties_H_


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

class ComAdobeGraniteOauthServerImplOAuth2ClientRevocationServletProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	ComAdobeGraniteOauthServerImplOAuth2ClientRevocationServletProperties();
	ComAdobeGraniteOauthServerImplOAuth2ClientRevocationServletProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ComAdobeGraniteOauthServerImplOAuth2ClientRevocationServletProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getOauthclientrevocationactive();

	/*! \brief Set 
	 */
	void setOauthclientrevocationactive(ConfigNodePropertyBoolean  oauthclientrevocationactive);

private:
	ConfigNodePropertyBoolean oauthclientrevocationactive;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ComAdobeGraniteOauthServerImplOAuth2ClientRevocationServletProperties_H_ */
