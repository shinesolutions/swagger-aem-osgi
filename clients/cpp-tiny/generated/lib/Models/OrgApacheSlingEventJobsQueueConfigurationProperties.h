
/*
 * OrgApacheSlingEventJobsQueueConfigurationProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_OrgApacheSlingEventJobsQueueConfigurationProperties_H_
#define TINY_CPP_CLIENT_OrgApacheSlingEventJobsQueueConfigurationProperties_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ConfigNodePropertyArray.h"
#include "ConfigNodePropertyBoolean.h"
#include "ConfigNodePropertyDropDown.h"
#include "ConfigNodePropertyFloat.h"
#include "ConfigNodePropertyInteger.h"
#include "ConfigNodePropertyString.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class OrgApacheSlingEventJobsQueueConfigurationProperties{
public:

    /*! \brief Constructor.
	 */
    OrgApacheSlingEventJobsQueueConfigurationProperties();
    OrgApacheSlingEventJobsQueueConfigurationProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~OrgApacheSlingEventJobsQueueConfigurationProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyString getQueuename();

	/*! \brief Set 
	 */
	void setQueuename(ConfigNodePropertyString queuename);
	/*! \brief Get 
	 */
	ConfigNodePropertyArray getQueuetopics();

	/*! \brief Set 
	 */
	void setQueuetopics(ConfigNodePropertyArray queuetopics);
	/*! \brief Get 
	 */
	ConfigNodePropertyDropDown getQueuetype();

	/*! \brief Set 
	 */
	void setQueuetype(ConfigNodePropertyDropDown queuetype);
	/*! \brief Get 
	 */
	ConfigNodePropertyDropDown getQueuepriority();

	/*! \brief Set 
	 */
	void setQueuepriority(ConfigNodePropertyDropDown queuepriority);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getQueueretries();

	/*! \brief Set 
	 */
	void setQueueretries(ConfigNodePropertyInteger queueretries);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getQueueretrydelay();

	/*! \brief Set 
	 */
	void setQueueretrydelay(ConfigNodePropertyInteger queueretrydelay);
	/*! \brief Get 
	 */
	ConfigNodePropertyFloat getQueuemaxparallel();

	/*! \brief Set 
	 */
	void setQueuemaxparallel(ConfigNodePropertyFloat queuemaxparallel);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getQueuekeepJobs();

	/*! \brief Set 
	 */
	void setQueuekeepJobs(ConfigNodePropertyBoolean queuekeepJobs);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getQueuepreferRunOnCreationInstance();

	/*! \brief Set 
	 */
	void setQueuepreferRunOnCreationInstance(ConfigNodePropertyBoolean queuepreferRunOnCreationInstance);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getQueuethreadPoolSize();

	/*! \brief Set 
	 */
	void setQueuethreadPoolSize(ConfigNodePropertyInteger queuethreadPoolSize);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getServiceranking();

	/*! \brief Set 
	 */
	void setServiceranking(ConfigNodePropertyInteger serviceranking);


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
};
}

#endif /* TINY_CPP_CLIENT_OrgApacheSlingEventJobsQueueConfigurationProperties_H_ */
