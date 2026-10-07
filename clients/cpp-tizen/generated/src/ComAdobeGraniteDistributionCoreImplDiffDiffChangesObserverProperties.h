/*
 * ComAdobeGraniteDistributionCoreImplDiffDiffChangesObserverProperties.h
 *
 * 
 */

#ifndef _ComAdobeGraniteDistributionCoreImplDiffDiffChangesObserverProperties_H_
#define _ComAdobeGraniteDistributionCoreImplDiffDiffChangesObserverProperties_H_


#include <string>
#include "ConfigNodePropertyBoolean.h"
#include "ConfigNodePropertyInteger.h"
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

class ComAdobeGraniteDistributionCoreImplDiffDiffChangesObserverProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	ComAdobeGraniteDistributionCoreImplDiffDiffChangesObserverProperties();
	ComAdobeGraniteDistributionCoreImplDiffDiffChangesObserverProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ComAdobeGraniteDistributionCoreImplDiffDiffChangesObserverProperties();

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
	ConfigNodePropertyString getAgentName();

	/*! \brief Set 
	 */
	void setAgentName(ConfigNodePropertyString  agentName);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getDiffPath();

	/*! \brief Set 
	 */
	void setDiffPath(ConfigNodePropertyString  diffPath);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getObservedPath();

	/*! \brief Set 
	 */
	void setObservedPath(ConfigNodePropertyString  observedPath);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getServiceName();

	/*! \brief Set 
	 */
	void setServiceName(ConfigNodePropertyString  serviceName);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getPropertyNames();

	/*! \brief Set 
	 */
	void setPropertyNames(ConfigNodePropertyString  propertyNames);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getDistributionDelay();

	/*! \brief Set 
	 */
	void setDistributionDelay(ConfigNodePropertyInteger  distributionDelay);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getServiceUsertarget();

	/*! \brief Set 
	 */
	void setServiceUsertarget(ConfigNodePropertyString  serviceUsertarget);

private:
	ConfigNodePropertyBoolean enabled;
	ConfigNodePropertyString agentName;
	ConfigNodePropertyString diffPath;
	ConfigNodePropertyString observedPath;
	ConfigNodePropertyString serviceName;
	ConfigNodePropertyString propertyNames;
	ConfigNodePropertyInteger distributionDelay;
	ConfigNodePropertyString serviceUsertarget;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ComAdobeGraniteDistributionCoreImplDiffDiffChangesObserverProperties_H_ */
