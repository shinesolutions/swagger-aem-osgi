/*
 * OrgApacheSlingDistributionSerializationImplVltVaultDistributionProperties.h
 *
 * 
 */

#ifndef _OrgApacheSlingDistributionSerializationImplVltVaultDistributionProperties_H_
#define _OrgApacheSlingDistributionSerializationImplVltVaultDistributionProperties_H_


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

class OrgApacheSlingDistributionSerializationImplVltVaultDistributionProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	OrgApacheSlingDistributionSerializationImplVltVaultDistributionProperties();
	OrgApacheSlingDistributionSerializationImplVltVaultDistributionProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~OrgApacheSlingDistributionSerializationImplVltVaultDistributionProperties();

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
	ConfigNodePropertyString getImportMode();

	/*! \brief Set 
	 */
	void setImportMode(ConfigNodePropertyString  importMode);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getAclHandling();

	/*! \brief Set 
	 */
	void setAclHandling(ConfigNodePropertyString  aclHandling);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getPackageroots();

	/*! \brief Set 
	 */
	void setPackageroots(ConfigNodePropertyString  packageroots);
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
	/*! \brief Get 
	 */
	ConfigNodePropertyString getTempFsFolder();

	/*! \brief Set 
	 */
	void setTempFsFolder(ConfigNodePropertyString  tempFsFolder);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getUseBinaryReferences();

	/*! \brief Set 
	 */
	void setUseBinaryReferences(ConfigNodePropertyBoolean  useBinaryReferences);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getAutoSaveThreshold();

	/*! \brief Set 
	 */
	void setAutoSaveThreshold(ConfigNodePropertyInteger  autoSaveThreshold);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getCleanupDelay();

	/*! \brief Set 
	 */
	void setCleanupDelay(ConfigNodePropertyInteger  cleanupDelay);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getFileThreshold();

	/*! \brief Set 
	 */
	void setFileThreshold(ConfigNodePropertyInteger  fileThreshold);
	/*! \brief Get 
	 */
	ConfigNodePropertyDropDown getMEGABYTES();

	/*! \brief Set 
	 */
	void setMEGABYTES(ConfigNodePropertyDropDown  mEGA_BYTES);
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
	ConfigNodePropertyArray getPathsMapping();

	/*! \brief Set 
	 */
	void setPathsMapping(ConfigNodePropertyArray  pathsMapping);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getStrictImport();

	/*! \brief Set 
	 */
	void setStrictImport(ConfigNodePropertyBoolean  strictImport);

private:
	ConfigNodePropertyString name;
	ConfigNodePropertyDropDown type;
	ConfigNodePropertyString importMode;
	ConfigNodePropertyString aclHandling;
	ConfigNodePropertyString packageroots;
	ConfigNodePropertyArray packagefilters;
	ConfigNodePropertyArray propertyfilters;
	ConfigNodePropertyString tempFsFolder;
	ConfigNodePropertyBoolean useBinaryReferences;
	ConfigNodePropertyInteger autoSaveThreshold;
	ConfigNodePropertyInteger cleanupDelay;
	ConfigNodePropertyInteger fileThreshold;
	ConfigNodePropertyDropDown mEGA_BYTES;
	ConfigNodePropertyBoolean useOffHeapMemory;
	ConfigNodePropertyDropDown digestAlgorithm;
	ConfigNodePropertyInteger monitoringQueueSize;
	ConfigNodePropertyArray pathsMapping;
	ConfigNodePropertyBoolean strictImport;
	void __init();
	void __cleanup();

};
}
}

#endif /* _OrgApacheSlingDistributionSerializationImplVltVaultDistributionProperties_H_ */
