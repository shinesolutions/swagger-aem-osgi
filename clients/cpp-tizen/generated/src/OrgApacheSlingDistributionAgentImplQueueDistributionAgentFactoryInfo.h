/*
 * OrgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryInfo.h
 *
 * 
 */

#ifndef _OrgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryInfo_H_
#define _OrgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryInfo_H_


#include <string>
#include "OrgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryProperties.h"
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

class OrgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryInfo : public Object {
public:
	/*! \brief Constructor.
	 */
	OrgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryInfo();
	OrgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryInfo(char* str);

	/*! \brief Destructor.
	 */
	virtual ~OrgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryInfo();

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
	OrgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryProperties getProperties();

	/*! \brief Set 
	 */
	void setProperties(OrgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryProperties  properties);

private:
	std::string pid;
	std::string title;
	std::string description;
	OrgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryProperties properties;
	void __init();
	void __cleanup();

};
}
}

#endif /* _OrgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryInfo_H_ */
