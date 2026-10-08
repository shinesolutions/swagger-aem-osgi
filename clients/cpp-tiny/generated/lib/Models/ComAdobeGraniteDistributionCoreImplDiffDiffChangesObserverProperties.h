
/*
 * ComAdobeGraniteDistributionCoreImplDiffDiffChangesObserverProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ComAdobeGraniteDistributionCoreImplDiffDiffChangesObserverProperties_H_
#define TINY_CPP_CLIENT_ComAdobeGraniteDistributionCoreImplDiffDiffChangesObserverProperties_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ConfigNodePropertyBoolean.h"
#include "ConfigNodePropertyInteger.h"
#include "ConfigNodePropertyString.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class ComAdobeGraniteDistributionCoreImplDiffDiffChangesObserverProperties{
public:

    /*! \brief Constructor.
	 */
    ComAdobeGraniteDistributionCoreImplDiffDiffChangesObserverProperties();
    ComAdobeGraniteDistributionCoreImplDiffDiffChangesObserverProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ComAdobeGraniteDistributionCoreImplDiffDiffChangesObserverProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getEnabled();

	/*! \brief Set 
	 */
	void setEnabled(ConfigNodePropertyBoolean enabled);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getAgentName();

	/*! \brief Set 
	 */
	void setAgentName(ConfigNodePropertyString agentName);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getDiffPath();

	/*! \brief Set 
	 */
	void setDiffPath(ConfigNodePropertyString diffPath);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getObservedPath();

	/*! \brief Set 
	 */
	void setObservedPath(ConfigNodePropertyString observedPath);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getServiceName();

	/*! \brief Set 
	 */
	void setServiceName(ConfigNodePropertyString serviceName);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getPropertyNames();

	/*! \brief Set 
	 */
	void setPropertyNames(ConfigNodePropertyString propertyNames);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getDistributionDelay();

	/*! \brief Set 
	 */
	void setDistributionDelay(ConfigNodePropertyInteger distributionDelay);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getServiceUsertarget();

	/*! \brief Set 
	 */
	void setServiceUsertarget(ConfigNodePropertyString serviceUsertarget);


    private:
    ConfigNodePropertyBoolean enabled;
    ConfigNodePropertyString agentName;
    ConfigNodePropertyString diffPath;
    ConfigNodePropertyString observedPath;
    ConfigNodePropertyString serviceName;
    ConfigNodePropertyString propertyNames;
    ConfigNodePropertyInteger distributionDelay;
    ConfigNodePropertyString serviceUsertarget;
};
}

#endif /* TINY_CPP_CLIENT_ComAdobeGraniteDistributionCoreImplDiffDiffChangesObserverProperties_H_ */
