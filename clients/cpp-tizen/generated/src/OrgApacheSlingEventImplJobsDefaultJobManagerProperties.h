/*
 * OrgApacheSlingEventImplJobsDefaultJobManagerProperties.h
 *
 * 
 */

#ifndef _OrgApacheSlingEventImplJobsDefaultJobManagerProperties_H_
#define _OrgApacheSlingEventImplJobsDefaultJobManagerProperties_H_


#include <string>
#include "ConfigNodePropertyDropDown.h"
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

class OrgApacheSlingEventImplJobsDefaultJobManagerProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	OrgApacheSlingEventImplJobsDefaultJobManagerProperties();
	OrgApacheSlingEventImplJobsDefaultJobManagerProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~OrgApacheSlingEventImplJobsDefaultJobManagerProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyDropDown getQueuepriority();

	/*! \brief Set 
	 */
	void setQueuepriority(ConfigNodePropertyDropDown  queuepriority);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getQueueretries();

	/*! \brief Set 
	 */
	void setQueueretries(ConfigNodePropertyInteger  queueretries);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getQueueretrydelay();

	/*! \brief Set 
	 */
	void setQueueretrydelay(ConfigNodePropertyInteger  queueretrydelay);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getQueuemaxparallel();

	/*! \brief Set 
	 */
	void setQueuemaxparallel(ConfigNodePropertyInteger  queuemaxparallel);

private:
	ConfigNodePropertyDropDown queuepriority;
	ConfigNodePropertyInteger queueretries;
	ConfigNodePropertyInteger queueretrydelay;
	ConfigNodePropertyInteger queuemaxparallel;
	void __init();
	void __cleanup();

};
}
}

#endif /* _OrgApacheSlingEventImplJobsDefaultJobManagerProperties_H_ */
