
/*
 * OrgApacheSlingDistributionMonitorDistributionQueueHealthCheckProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_OrgApacheSlingDistributionMonitorDistributionQueueHealthCheckProperties_H_
#define TINY_CPP_CLIENT_OrgApacheSlingDistributionMonitorDistributionQueueHealthCheckProperties_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ConfigNodePropertyArray.h"
#include "ConfigNodePropertyInteger.h"
#include "ConfigNodePropertyString.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class OrgApacheSlingDistributionMonitorDistributionQueueHealthCheckProperties{
public:

    /*! \brief Constructor.
	 */
    OrgApacheSlingDistributionMonitorDistributionQueueHealthCheckProperties();
    OrgApacheSlingDistributionMonitorDistributionQueueHealthCheckProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~OrgApacheSlingDistributionMonitorDistributionQueueHealthCheckProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyString getHcname();

	/*! \brief Set 
	 */
	void setHcname(ConfigNodePropertyString hcname);
	/*! \brief Get 
	 */
	ConfigNodePropertyArray getHctags();

	/*! \brief Set 
	 */
	void setHctags(ConfigNodePropertyArray hctags);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getHcmbeanname();

	/*! \brief Set 
	 */
	void setHcmbeanname(ConfigNodePropertyString hcmbeanname);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getNumberOfRetriesAllowed();

	/*! \brief Set 
	 */
	void setNumberOfRetriesAllowed(ConfigNodePropertyInteger numberOfRetriesAllowed);


    private:
    ConfigNodePropertyString hcname;
    ConfigNodePropertyArray hctags;
    ConfigNodePropertyString hcmbeanname;
    ConfigNodePropertyInteger numberOfRetriesAllowed;
};
}

#endif /* TINY_CPP_CLIENT_OrgApacheSlingDistributionMonitorDistributionQueueHealthCheckProperties_H_ */
