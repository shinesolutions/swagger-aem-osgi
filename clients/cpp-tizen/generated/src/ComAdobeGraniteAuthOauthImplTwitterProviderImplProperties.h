/*
 * ComAdobeGraniteAuthOauthImplTwitterProviderImplProperties.h
 *
 * 
 */

#ifndef _ComAdobeGraniteAuthOauthImplTwitterProviderImplProperties_H_
#define _ComAdobeGraniteAuthOauthImplTwitterProviderImplProperties_H_


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

class ComAdobeGraniteAuthOauthImplTwitterProviderImplProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	ComAdobeGraniteAuthOauthImplTwitterProviderImplProperties();
	ComAdobeGraniteAuthOauthImplTwitterProviderImplProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ComAdobeGraniteAuthOauthImplTwitterProviderImplProperties();

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

#endif /* _ComAdobeGraniteAuthOauthImplTwitterProviderImplProperties_H_ */
