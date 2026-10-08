
/*
 * OrgApacheSlingCommonsSchedulerImplSchedulerHealthCheckProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_OrgApacheSlingCommonsSchedulerImplSchedulerHealthCheckProperties_H_
#define TINY_CPP_CLIENT_OrgApacheSlingCommonsSchedulerImplSchedulerHealthCheckProperties_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ConfigNodePropertyInteger.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class OrgApacheSlingCommonsSchedulerImplSchedulerHealthCheckProperties{
public:

    /*! \brief Constructor.
	 */
    OrgApacheSlingCommonsSchedulerImplSchedulerHealthCheckProperties();
    OrgApacheSlingCommonsSchedulerImplSchedulerHealthCheckProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~OrgApacheSlingCommonsSchedulerImplSchedulerHealthCheckProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getMaxquartzJobdurationacceptable();

	/*! \brief Set 
	 */
	void setMaxquartzJobdurationacceptable(ConfigNodePropertyInteger maxquartzJobdurationacceptable);


    private:
    ConfigNodePropertyInteger maxquartzJobdurationacceptable;
};
}

#endif /* TINY_CPP_CLIENT_OrgApacheSlingCommonsSchedulerImplSchedulerHealthCheckProperties_H_ */
