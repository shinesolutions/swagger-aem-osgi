/*
 * OrgApacheSlingEventJobsQueueConfigurationProperties.h
 *
 * 
 */

#ifndef _OrgApacheSlingEventJobsQueueConfigurationProperties_H_
#define _OrgApacheSlingEventJobsQueueConfigurationProperties_H_


#include <string>
#include "ConfigNodePropertyArray.h"
#include "ConfigNodePropertyBoolean.h"
#include "ConfigNodePropertyDropDown.h"
#include "ConfigNodePropertyFloat.h"
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

class OrgApacheSlingEventJobsQueueConfigurationProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	OrgApacheSlingEventJobsQueueConfigurationProperties();
	OrgApacheSlingEventJobsQueueConfigurationProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~OrgApacheSlingEventJobsQueueConfigurationProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyString getQueuename();

	/*! \brief Set 
	 */
	void setQueuename(ConfigNodePropertyString  queuename);
	/*! \brief Get 
	 */
	ConfigNodePropertyArray getQueuetopics();

	/*! \brief Set 
	 */
	void setQueuetopics(ConfigNodePropertyArray  queuetopics);
	/*! \brief Get 
	 */
	ConfigNodePropertyDropDown getQueuetype();

	/*! \brief Set 
	 */
	void setQueuetype(ConfigNodePropertyDropDown  queuetype);
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
	ConfigNodePropertyFloat getQueuemaxparallel();

	/*! \brief Set 
	 */
	void setQueuemaxparallel(ConfigNodePropertyFloat  queuemaxparallel);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getQueuekeepJobs();

	/*! \brief Set 
	 */
	void setQueuekeepJobs(ConfigNodePropertyBoolean  queuekeepJobs);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getQueuepreferRunOnCreationInstance();

	/*! \brief Set 
	 */
	void setQueuepreferRunOnCreationInstance(ConfigNodePropertyBoolean  queuepreferRunOnCreationInstance);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getQueuethreadPoolSize();

	/*! \brief Set 
	 */
	void setQueuethreadPoolSize(ConfigNodePropertyInteger  queuethreadPoolSize);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getServiceranking();

	/*! \brief Set 
	 */
	void setServiceranking(ConfigNodePropertyInteger  serviceranking);

private:
	ConfigNodePropertyString queuename;
	ConfigNodePropertyArray queuetopics;
	ConfigNodePropertyDropDown queuetype;
	ConfigNodePropertyDropDown queuepriority;
	ConfigNodePropertyInteger queueretries;
	ConfigNodePropertyInteger queueretrydelay;
	ConfigNodePropertyFloat queuemaxparallel;
	ConfigNodePropertyBoolean queuekeepJobs;
	ConfigNodePropertyBoolean queuepreferRunOnCreationInstance;
	ConfigNodePropertyInteger queuethreadPoolSize;
	ConfigNodePropertyInteger serviceranking;
	void __init();
	void __cleanup();

};
}
}

#endif /* _OrgApacheSlingEventJobsQueueConfigurationProperties_H_ */
