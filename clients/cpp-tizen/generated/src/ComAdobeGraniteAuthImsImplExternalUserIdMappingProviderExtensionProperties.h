/*
 * ComAdobeGraniteAuthImsImplExternalUserIdMappingProviderExtensionProperties.h
 *
 * 
 */

#ifndef _ComAdobeGraniteAuthImsImplExternalUserIdMappingProviderExtensionProperties_H_
#define _ComAdobeGraniteAuthImsImplExternalUserIdMappingProviderExtensionProperties_H_


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

class ComAdobeGraniteAuthImsImplExternalUserIdMappingProviderExtensionProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	ComAdobeGraniteAuthImsImplExternalUserIdMappingProviderExtensionProperties();
	ComAdobeGraniteAuthImsImplExternalUserIdMappingProviderExtensionProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ComAdobeGraniteAuthImsImplExternalUserIdMappingProviderExtensionProperties();

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

#endif /* _ComAdobeGraniteAuthImsImplExternalUserIdMappingProviderExtensionProperties_H_ */
