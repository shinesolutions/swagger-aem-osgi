/*
 * ComAdobeGraniteRestImplApiEndpointResourceProviderFactoryImplProperties.h
 *
 * 
 */

#ifndef _ComAdobeGraniteRestImplApiEndpointResourceProviderFactoryImplProperties_H_
#define _ComAdobeGraniteRestImplApiEndpointResourceProviderFactoryImplProperties_H_


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

class ComAdobeGraniteRestImplApiEndpointResourceProviderFactoryImplProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	ComAdobeGraniteRestImplApiEndpointResourceProviderFactoryImplProperties();
	ComAdobeGraniteRestImplApiEndpointResourceProviderFactoryImplProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ComAdobeGraniteRestImplApiEndpointResourceProviderFactoryImplProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyString getProviderroots();

	/*! \brief Set 
	 */
	void setProviderroots(ConfigNodePropertyString  providerroots);

private:
	ConfigNodePropertyString providerroots;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ComAdobeGraniteRestImplApiEndpointResourceProviderFactoryImplProperties_H_ */
