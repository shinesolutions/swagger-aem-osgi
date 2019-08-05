/*
 * OrgApacheSlingEventImplJobsJcrPersistenceHandlerProperties.h
 *
 * 
 */

#ifndef _OrgApacheSlingEventImplJobsJcrPersistenceHandlerProperties_H_
#define _OrgApacheSlingEventImplJobsJcrPersistenceHandlerProperties_H_


#include <string>
#include "ConfigNodePropertyBoolean.h"
#include "ConfigNodePropertyInteger.h"
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

class OrgApacheSlingEventImplJobsJcrPersistenceHandlerProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	OrgApacheSlingEventImplJobsJcrPersistenceHandlerProperties();
	OrgApacheSlingEventImplJobsJcrPersistenceHandlerProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~OrgApacheSlingEventImplJobsJcrPersistenceHandlerProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getJobconsumermanagerdisableDistribution();

	/*! \brief Set 
	 */
	void setJobconsumermanagerdisableDistribution(ConfigNodePropertyBoolean  jobconsumermanagerdisableDistribution);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getStartupdelay();

	/*! \brief Set 
	 */
	void setStartupdelay(ConfigNodePropertyInteger  startupdelay);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getCleanupperiod();

	/*! \brief Set 
	 */
	void setCleanupperiod(ConfigNodePropertyInteger  cleanupperiod);

private:
	ConfigNodePropertyBoolean jobconsumermanagerdisableDistribution;
	ConfigNodePropertyInteger startupdelay;
	ConfigNodePropertyInteger cleanupperiod;
	void __init();
	void __cleanup();

};
}
}

#endif /* _OrgApacheSlingEventImplJobsJcrPersistenceHandlerProperties_H_ */
