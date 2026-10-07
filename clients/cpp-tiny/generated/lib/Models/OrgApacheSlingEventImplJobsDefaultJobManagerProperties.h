
/*
 * OrgApacheSlingEventImplJobsDefaultJobManagerProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_OrgApacheSlingEventImplJobsDefaultJobManagerProperties_H_
#define TINY_CPP_CLIENT_OrgApacheSlingEventImplJobsDefaultJobManagerProperties_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ConfigNodePropertyDropDown.h"
#include "ConfigNodePropertyInteger.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class OrgApacheSlingEventImplJobsDefaultJobManagerProperties{
public:

    /*! \brief Constructor.
	 */
    OrgApacheSlingEventImplJobsDefaultJobManagerProperties();
    OrgApacheSlingEventImplJobsDefaultJobManagerProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~OrgApacheSlingEventImplJobsDefaultJobManagerProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

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
	ConfigNodePropertyInteger getQueuemaxparallel();

	/*! \brief Set 
	 */
	void setQueuemaxparallel(ConfigNodePropertyInteger queuemaxparallel);


    private:
    ConfigNodePropertyDropDown queuepriority;
    ConfigNodePropertyInteger queueretries;
    ConfigNodePropertyInteger queueretrydelay;
    ConfigNodePropertyInteger queuemaxparallel;
};
}

#endif /* TINY_CPP_CLIENT_OrgApacheSlingEventImplJobsDefaultJobManagerProperties_H_ */
