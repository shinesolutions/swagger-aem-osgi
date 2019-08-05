/*
 * OrgApacheSlingDistributionTriggerImplScheduledDistributionTriggeInfo.h
 *
 * 
 */

#ifndef _OrgApacheSlingDistributionTriggerImplScheduledDistributionTriggeInfo_H_
#define _OrgApacheSlingDistributionTriggerImplScheduledDistributionTriggeInfo_H_


#include <string>
#include "OrgApacheSlingDistributionTriggerImplScheduledDistributionTriggeProperties.h"
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

class OrgApacheSlingDistributionTriggerImplScheduledDistributionTriggeInfo : public Object {
public:
	/*! \brief Constructor.
	 */
	OrgApacheSlingDistributionTriggerImplScheduledDistributionTriggeInfo();
	OrgApacheSlingDistributionTriggerImplScheduledDistributionTriggeInfo(char* str);

	/*! \brief Destructor.
	 */
	virtual ~OrgApacheSlingDistributionTriggerImplScheduledDistributionTriggeInfo();

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
	OrgApacheSlingDistributionTriggerImplScheduledDistributionTriggeProperties getProperties();

	/*! \brief Set 
	 */
	void setProperties(OrgApacheSlingDistributionTriggerImplScheduledDistributionTriggeProperties  properties);

private:
	std::string pid;
	std::string title;
	std::string description;
	OrgApacheSlingDistributionTriggerImplScheduledDistributionTriggeProperties properties;
	void __init();
	void __cleanup();

};
}
}

#endif /* _OrgApacheSlingDistributionTriggerImplScheduledDistributionTriggeInfo_H_ */
