/*
 * OrgApacheSlingDistributionSerializationImplVltVaultDistributionInfo.h
 *
 * 
 */

#ifndef _OrgApacheSlingDistributionSerializationImplVltVaultDistributionInfo_H_
#define _OrgApacheSlingDistributionSerializationImplVltVaultDistributionInfo_H_


#include <string>
#include "OrgApacheSlingDistributionSerializationImplVltVaultDistributionProperties.h"
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

class OrgApacheSlingDistributionSerializationImplVltVaultDistributionInfo : public Object {
public:
	/*! \brief Constructor.
	 */
	OrgApacheSlingDistributionSerializationImplVltVaultDistributionInfo();
	OrgApacheSlingDistributionSerializationImplVltVaultDistributionInfo(char* str);

	/*! \brief Destructor.
	 */
	virtual ~OrgApacheSlingDistributionSerializationImplVltVaultDistributionInfo();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	std::string getPid();

	/*! \brief Set 
	 */
	void setPid(std::string  pid);
	/*! \brief Get 
	 */
	std::string getTitle();

	/*! \brief Set 
	 */
	void setTitle(std::string  title);
	/*! \brief Get 
	 */
	std::string getDescription();

	/*! \brief Set 
	 */
	void setDescription(std::string  description);
	/*! \brief Get 
	 */
	OrgApacheSlingDistributionSerializationImplVltVaultDistributionProperties getProperties();

	/*! \brief Set 
	 */
	void setProperties(OrgApacheSlingDistributionSerializationImplVltVaultDistributionProperties  properties);

private:
	std::string pid;
	std::string title;
	std::string description;
	OrgApacheSlingDistributionSerializationImplVltVaultDistributionProperties properties;
	void __init();
	void __cleanup();

};
}
}

#endif /* _OrgApacheSlingDistributionSerializationImplVltVaultDistributionInfo_H_ */
