
/*
 * OrgApacheSlingEventImplJobsJobConsumerManagerProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_OrgApacheSlingEventImplJobsJobConsumerManagerProperties_H_
#define TINY_CPP_CLIENT_OrgApacheSlingEventImplJobsJobConsumerManagerProperties_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ConfigNodePropertyArray.h"
#include "ConfigNodePropertyBoolean.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class OrgApacheSlingEventImplJobsJobConsumerManagerProperties{
public:

    /*! \brief Constructor.
	 */
    OrgApacheSlingEventImplJobsJobConsumerManagerProperties();
    OrgApacheSlingEventImplJobsJobConsumerManagerProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~OrgApacheSlingEventImplJobsJobConsumerManagerProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getOrgapacheslinginstallerconfigurationpersist();

	/*! \brief Set 
	 */
	void setOrgapacheslinginstallerconfigurationpersist(ConfigNodePropertyBoolean orgapacheslinginstallerconfigurationpersist);
	/*! \brief Get 
	 */
	ConfigNodePropertyArray getJobconsumermanagerwhitelist();

	/*! \brief Set 
	 */
	void setJobconsumermanagerwhitelist(ConfigNodePropertyArray jobconsumermanagerwhitelist);
	/*! \brief Get 
	 */
	ConfigNodePropertyArray getJobconsumermanagerblacklist();

	/*! \brief Set 
	 */
	void setJobconsumermanagerblacklist(ConfigNodePropertyArray jobconsumermanagerblacklist);


    private:
    ConfigNodePropertyBoolean orgapacheslinginstallerconfigurationpersist;
    ConfigNodePropertyArray jobconsumermanagerwhitelist;
    ConfigNodePropertyArray jobconsumermanagerblacklist;
};
}

#endif /* TINY_CPP_CLIENT_OrgApacheSlingEventImplJobsJobConsumerManagerProperties_H_ */
