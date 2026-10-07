
/*
 * OrgApacheSlingEventImplJobsJcrPersistenceHandlerProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_OrgApacheSlingEventImplJobsJcrPersistenceHandlerProperties_H_
#define TINY_CPP_CLIENT_OrgApacheSlingEventImplJobsJcrPersistenceHandlerProperties_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ConfigNodePropertyBoolean.h"
#include "ConfigNodePropertyInteger.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class OrgApacheSlingEventImplJobsJcrPersistenceHandlerProperties{
public:

    /*! \brief Constructor.
	 */
    OrgApacheSlingEventImplJobsJcrPersistenceHandlerProperties();
    OrgApacheSlingEventImplJobsJcrPersistenceHandlerProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~OrgApacheSlingEventImplJobsJcrPersistenceHandlerProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getJobconsumermanagerdisableDistribution();

	/*! \brief Set 
	 */
	void setJobconsumermanagerdisableDistribution(ConfigNodePropertyBoolean jobconsumermanagerdisableDistribution);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getStartupdelay();

	/*! \brief Set 
	 */
	void setStartupdelay(ConfigNodePropertyInteger startupdelay);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getCleanupperiod();

	/*! \brief Set 
	 */
	void setCleanupperiod(ConfigNodePropertyInteger cleanupperiod);


    private:
    ConfigNodePropertyBoolean jobconsumermanagerdisableDistribution;
    ConfigNodePropertyInteger startupdelay;
    ConfigNodePropertyInteger cleanupperiod;
};
}

#endif /* TINY_CPP_CLIENT_OrgApacheSlingEventImplJobsJcrPersistenceHandlerProperties_H_ */
