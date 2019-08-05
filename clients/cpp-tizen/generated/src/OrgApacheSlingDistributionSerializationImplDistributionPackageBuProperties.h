/*
 * OrgApacheSlingDistributionSerializationImplDistributionPackageBuProperties.h
 *
 * 
 */

#ifndef _OrgApacheSlingDistributionSerializationImplDistributionPackageBuProperties_H_
#define _OrgApacheSlingDistributionSerializationImplDistributionPackageBuProperties_H_


#include <string>
#include "ConfigNodePropertyArray.h"
#include "ConfigNodePropertyBoolean.h"
#include "ConfigNodePropertyDropDown.h"
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

class OrgApacheSlingDistributionSerializationImplDistributionPackageBuProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	OrgApacheSlingDistributionSerializationImplDistributionPackageBuProperties();
	OrgApacheSlingDistributionSerializationImplDistributionPackageBuProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~OrgApacheSlingDistributionSerializationImplDistributionPackageBuProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyString getName();

	/*! \brief Set 
	 */
	void setName(ConfigNodePropertyString  name);
	/*! \brief Get 
	 */
	ConfigNodePropertyDropDown getType();

	/*! \brief Set 
	 */
	void setType(ConfigNodePropertyDropDown  type);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getFormattarget();

	/*! \brief Set 
	 */
	void setFormattarget(ConfigNodePropertyString  formattarget);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getTempFsFolder();

	/*! \brief Set 
	 */
	void setTempFsFolder(ConfigNodePropertyString  tempFsFolder);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getFileThreshold();

	/*! \brief Set 
	 */
	void setFileThreshold(ConfigNodePropertyInteger  fileThreshold);
	/*! \brief Get 
	 */
	ConfigNodePropertyDropDown getMemoryUnit();

	/*! \brief Set 
	 */
	void setMemoryUnit(ConfigNodePropertyDropDown  memoryUnit);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getUseOffHeapMemory();

	/*! \brief Set 
	 */
	void setUseOffHeapMemory(ConfigNodePropertyBoolean  useOffHeapMemory);
	/*! \brief Get 
	 */
	ConfigNodePropertyDropDown getDigestAlgorithm();

	/*! \brief Set 
	 */
	void setDigestAlgorithm(ConfigNodePropertyDropDown  digestAlgorithm);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getMonitoringQueueSize();

	/*! \brief Set 
	 */
	void setMonitoringQueueSize(ConfigNodePropertyInteger  monitoringQueueSize);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getCleanupDelay();

	/*! \brief Set 
	 */
	void setCleanupDelay(ConfigNodePropertyInteger  cleanupDelay);
	/*! \brief Get 
	 */
	ConfigNodePropertyArray getPackagefilters();

	/*! \brief Set 
	 */
	void setPackagefilters(ConfigNodePropertyArray  packagefilters);
	/*! \brief Get 
	 */
	ConfigNodePropertyArray getPropertyfilters();

	/*! \brief Set 
	 */
	void setPropertyfilters(ConfigNodePropertyArray  propertyfilters);

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
	void __init();
	void __cleanup();

};
}
}

#endif /* _OrgApacheSlingDistributionSerializationImplDistributionPackageBuProperties_H_ */
