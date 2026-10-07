/*
 * OrgApacheSlingEventImplJobsJobConsumerManagerProperties.h
 *
 * 
 */

#ifndef _OrgApacheSlingEventImplJobsJobConsumerManagerProperties_H_
#define _OrgApacheSlingEventImplJobsJobConsumerManagerProperties_H_


#include <string>
#include "ConfigNodePropertyArray.h"
#include "ConfigNodePropertyBoolean.h"
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

class OrgApacheSlingEventImplJobsJobConsumerManagerProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	OrgApacheSlingEventImplJobsJobConsumerManagerProperties();
	OrgApacheSlingEventImplJobsJobConsumerManagerProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~OrgApacheSlingEventImplJobsJobConsumerManagerProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getOrgapacheslinginstallerconfigurationpersist();

	/*! \brief Set 
	 */
	void setOrgapacheslinginstallerconfigurationpersist(ConfigNodePropertyBoolean  orgapacheslinginstallerconfigurationpersist);
	/*! \brief Get 
	 */
	ConfigNodePropertyArray getJobconsumermanagerwhitelist();

	/*! \brief Set 
	 */
	void setJobconsumermanagerwhitelist(ConfigNodePropertyArray  jobconsumermanagerwhitelist);
	/*! \brief Get 
	 */
	ConfigNodePropertyArray getJobconsumermanagerblacklist();

	/*! \brief Set 
	 */
	void setJobconsumermanagerblacklist(ConfigNodePropertyArray  jobconsumermanagerblacklist);

private:
	ConfigNodePropertyBoolean orgapacheslinginstallerconfigurationpersist;
	ConfigNodePropertyArray jobconsumermanagerwhitelist;
	ConfigNodePropertyArray jobconsumermanagerblacklist;
	void __init();
	void __cleanup();

};
}
}

#endif /* _OrgApacheSlingEventImplJobsJobConsumerManagerProperties_H_ */
