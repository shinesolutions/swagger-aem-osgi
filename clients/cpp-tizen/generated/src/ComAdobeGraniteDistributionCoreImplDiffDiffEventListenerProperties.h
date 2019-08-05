/*
 * ComAdobeGraniteDistributionCoreImplDiffDiffEventListenerProperties.h
 *
 * 
 */

#ifndef _ComAdobeGraniteDistributionCoreImplDiffDiffEventListenerProperties_H_
#define _ComAdobeGraniteDistributionCoreImplDiffDiffEventListenerProperties_H_


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

class ComAdobeGraniteDistributionCoreImplDiffDiffEventListenerProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	ComAdobeGraniteDistributionCoreImplDiffDiffEventListenerProperties();
	ComAdobeGraniteDistributionCoreImplDiffDiffEventListenerProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ComAdobeGraniteDistributionCoreImplDiffDiffEventListenerProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyString getDiffPath();

	/*! \brief Set 
	 */
	void setDiffPath(ConfigNodePropertyString  diffPath);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getServiceName();

	/*! \brief Set 
	 */
	void setServiceName(ConfigNodePropertyString  serviceName);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getServiceUsertarget();

	/*! \brief Set 
	 */
	void setServiceUsertarget(ConfigNodePropertyString  serviceUsertarget);

private:
	ConfigNodePropertyString diffPath;
	ConfigNodePropertyString serviceName;
	ConfigNodePropertyString serviceUsertarget;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ComAdobeGraniteDistributionCoreImplDiffDiffEventListenerProperties_H_ */
