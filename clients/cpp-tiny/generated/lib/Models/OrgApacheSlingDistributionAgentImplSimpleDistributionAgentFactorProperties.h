
/*
 * OrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_OrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorProperties_H_
#define TINY_CPP_CLIENT_OrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorProperties_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ConfigNodePropertyBoolean.h"
#include "ConfigNodePropertyDropDown.h"
#include "ConfigNodePropertyString.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class OrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorProperties{
public:

    /*! \brief Constructor.
	 */
    OrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorProperties();
    OrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~OrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyString getName();

	/*! \brief Set 
	 */
	void setName(ConfigNodePropertyString name);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getTitle();

	/*! \brief Set 
	 */
	void setTitle(ConfigNodePropertyString title);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getDetails();

	/*! \brief Set 
	 */
	void setDetails(ConfigNodePropertyString details);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getEnabled();

	/*! \brief Set 
	 */
	void setEnabled(ConfigNodePropertyBoolean enabled);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getServiceName();

	/*! \brief Set 
	 */
	void setServiceName(ConfigNodePropertyString serviceName);
	/*! \brief Get 
	 */
	ConfigNodePropertyDropDown getLoglevel();

	/*! \brief Set 
	 */
	void setLoglevel(ConfigNodePropertyDropDown loglevel);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getQueueprocessingenabled();

	/*! \brief Set 
	 */
	void setQueueprocessingenabled(ConfigNodePropertyBoolean queueprocessingenabled);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getPackageExportertarget();

	/*! \brief Set 
	 */
	void setPackageExportertarget(ConfigNodePropertyString packageExportertarget);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getPackageImportertarget();

	/*! \brief Set 
	 */
	void setPackageImportertarget(ConfigNodePropertyString packageImportertarget);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getRequestAuthorizationStrategytarget();

	/*! \brief Set 
	 */
	void setRequestAuthorizationStrategytarget(ConfigNodePropertyString requestAuthorizationStrategytarget);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getTriggerstarget();

	/*! \brief Set 
	 */
	void setTriggerstarget(ConfigNodePropertyString triggerstarget);


    private:
    ConfigNodePropertyString name;
    ConfigNodePropertyString title;
    ConfigNodePropertyString details;
    ConfigNodePropertyBoolean enabled;
    ConfigNodePropertyString serviceName;
    ConfigNodePropertyDropDown loglevel;
    ConfigNodePropertyBoolean queueprocessingenabled;
    ConfigNodePropertyString packageExportertarget;
    ConfigNodePropertyString packageImportertarget;
    ConfigNodePropertyString requestAuthorizationStrategytarget;
    ConfigNodePropertyString triggerstarget;
};
}

#endif /* TINY_CPP_CLIENT_OrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorProperties_H_ */
