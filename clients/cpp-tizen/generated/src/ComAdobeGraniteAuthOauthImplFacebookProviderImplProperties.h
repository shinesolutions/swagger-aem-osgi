/*
 * ComAdobeGraniteAuthOauthImplFacebookProviderImplProperties.h
 *
 * 
 */

#ifndef _ComAdobeGraniteAuthOauthImplFacebookProviderImplProperties_H_
#define _ComAdobeGraniteAuthOauthImplFacebookProviderImplProperties_H_


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

class ComAdobeGraniteAuthOauthImplFacebookProviderImplProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	ComAdobeGraniteAuthOauthImplFacebookProviderImplProperties();
	ComAdobeGraniteAuthOauthImplFacebookProviderImplProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ComAdobeGraniteAuthOauthImplFacebookProviderImplProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyString getOauthproviderid();

	/*! \brief Set 
	 */
	void setOauthproviderid(ConfigNodePropertyString  oauthproviderid);

private:
	ConfigNodePropertyString oauthproviderid;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ComAdobeGraniteAuthOauthImplFacebookProviderImplProperties_H_ */
