
/*
 * OrgApacheSlingDistributionSerializationImplDistributionPackageBuProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_OrgApacheSlingDistributionSerializationImplDistributionPackageBuProperties_H_
#define TINY_CPP_CLIENT_OrgApacheSlingDistributionSerializationImplDistributionPackageBuProperties_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ConfigNodePropertyArray.h"
#include "ConfigNodePropertyBoolean.h"
#include "ConfigNodePropertyDropDown.h"
#include "ConfigNodePropertyInteger.h"
#include "ConfigNodePropertyString.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class OrgApacheSlingDistributionSerializationImplDistributionPackageBuProperties{
public:

    /*! \brief Constructor.
	 */
    OrgApacheSlingDistributionSerializationImplDistributionPackageBuProperties();
    OrgApacheSlingDistributionSerializationImplDistributionPackageBuProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~OrgApacheSlingDistributionSerializationImplDistributionPackageBuProperties();


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
	ConfigNodePropertyDropDown getType();

	/*! \brief Set 
	 */
	void setType(ConfigNodePropertyDropDown type);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getFormattarget();

	/*! \brief Set 
	 */
	void setFormattarget(ConfigNodePropertyString formattarget);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getTempFsFolder();

	/*! \brief Set 
	 */
	void setTempFsFolder(ConfigNodePropertyString tempFsFolder);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getFileThreshold();

	/*! \brief Set 
	 */
	void setFileThreshold(ConfigNodePropertyInteger fileThreshold);
	/*! \brief Get 
	 */
	ConfigNodePropertyDropDown getMemoryUnit();

	/*! \brief Set 
	 */
	void setMemoryUnit(ConfigNodePropertyDropDown memoryUnit);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getUseOffHeapMemory();

	/*! \brief Set 
	 */
	void setUseOffHeapMemory(ConfigNodePropertyBoolean useOffHeapMemory);
	/*! \brief Get 
	 */
	ConfigNodePropertyDropDown getDigestAlgorithm();

	/*! \brief Set 
	 */
	void setDigestAlgorithm(ConfigNodePropertyDropDown digestAlgorithm);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getMonitoringQueueSize();

	/*! \brief Set 
	 */
	void setMonitoringQueueSize(ConfigNodePropertyInteger monitoringQueueSize);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getCleanupDelay();

	/*! \brief Set 
	 */
	void setCleanupDelay(ConfigNodePropertyInteger cleanupDelay);
	/*! \brief Get 
	 */
	ConfigNodePropertyArray getPackagefilters();

	/*! \brief Set 
	 */
	void setPackagefilters(ConfigNodePropertyArray packagefilters);
	/*! \brief Get 
	 */
	ConfigNodePropertyArray getPropertyfilters();

	/*! \brief Set 
	 */
	void setPropertyfilters(ConfigNodePropertyArray propertyfilters);


    private:
    ConfigNodePropertyString name;
    ConfigNodePropertyDropDown type;
    ConfigNodePropertyString formattarget;
    ConfigNodePropertyString tempFsFolder;
    ConfigNodePropertyInteger fileThreshold;
    ConfigNodePropertyDropDown memoryUnit;
    ConfigNodePropertyBoolean useOffHeapMemory;
    ConfigNodePropertyDropDown digestAlgorithm;
    ConfigNodePropertyInteger monitoringQueueSize;
    ConfigNodePropertyInteger cleanupDelay;
    ConfigNodePropertyArray packagefilters;
    ConfigNodePropertyArray propertyfilters;
};
}

#endif /* TINY_CPP_CLIENT_OrgApacheSlingDistributionSerializationImplDistributionPackageBuProperties_H_ */
