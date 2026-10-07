/*
 * ComAdobeGraniteAuthOauthImplDefaultTokenValidatorImplProperties.h
 *
 * 
 */

#ifndef _ComAdobeGraniteAuthOauthImplDefaultTokenValidatorImplProperties_H_
#define _ComAdobeGraniteAuthOauthImplDefaultTokenValidatorImplProperties_H_


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

class ComAdobeGraniteAuthOauthImplDefaultTokenValidatorImplProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	ComAdobeGraniteAuthOauthImplDefaultTokenValidatorImplProperties();
	ComAdobeGraniteAuthOauthImplDefaultTokenValidatorImplProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ComAdobeGraniteAuthOauthImplDefaultTokenValidatorImplProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyString getAuthtokenvalidatortype();

	/*! \brief Set 
	 */
	void setAuthtokenvalidatortype(ConfigNodePropertyString  authtokenvalidatortype);

private:
	ConfigNodePropertyString authtokenvalidatortype;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ComAdobeGraniteAuthOauthImplDefaultTokenValidatorImplProperties_H_ */
