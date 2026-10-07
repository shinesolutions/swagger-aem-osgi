/*
 * ComAdobeGraniteConfImplRuntimeAwareConfigurationResourceResolvingProperties.h
 *
 * 
 */

#ifndef _ComAdobeGraniteConfImplRuntimeAwareConfigurationResourceResolvingProperties_H_
#define _ComAdobeGraniteConfImplRuntimeAwareConfigurationResourceResolvingProperties_H_


#include <string>
#include "ConfigNodePropertyArray.h"
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

class ComAdobeGraniteConfImplRuntimeAwareConfigurationResourceResolvingProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	ComAdobeGraniteConfImplRuntimeAwareConfigurationResourceResolvingProperties();
	ComAdobeGraniteConfImplRuntimeAwareConfigurationResourceResolvingProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ComAdobeGraniteConfImplRuntimeAwareConfigurationResourceResolvingProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getEnabled();

	/*! \brief Set 
	 */
	void setEnabled(ConfigNodePropertyBoolean  enabled);
	/*! \brief Get 
	 */
	ConfigNodePropertyArray getFallbackPaths();

	/*! \brief Set 
	 */
	void setFallbackPaths(ConfigNodePropertyArray  fallbackPaths);

private:
	ConfigNodePropertyBoolean enabled;
	ConfigNodePropertyArray fallbackPaths;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ComAdobeGraniteConfImplRuntimeAwareConfigurationResourceResolvingProperties_H_ */
