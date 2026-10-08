
/*
 * OrgApacheSlingCommonsSchedulerImplQuartzSchedulerProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_OrgApacheSlingCommonsSchedulerImplQuartzSchedulerProperties_H_
#define TINY_CPP_CLIENT_OrgApacheSlingCommonsSchedulerImplQuartzSchedulerProperties_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ConfigNodePropertyArray.h"
#include "ConfigNodePropertyBoolean.h"
#include "ConfigNodePropertyInteger.h"
#include "ConfigNodePropertyString.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class OrgApacheSlingCommonsSchedulerImplQuartzSchedulerProperties{
public:

    /*! \brief Constructor.
	 */
    OrgApacheSlingCommonsSchedulerImplQuartzSchedulerProperties();
    OrgApacheSlingCommonsSchedulerImplQuartzSchedulerProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~OrgApacheSlingCommonsSchedulerImplQuartzSchedulerProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyString getPoolName();

	/*! \brief Set 
	 */
	void setPoolName(ConfigNodePropertyString poolName);
	/*! \brief Get 
	 */
	ConfigNodePropertyArray getAllowedPoolNames();

	/*! \brief Set 
	 */
	void setAllowedPoolNames(ConfigNodePropertyArray allowedPoolNames);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getScheduleruseleaderforsingle();

	/*! \brief Set 
	 */
	void setScheduleruseleaderforsingle(ConfigNodePropertyBoolean scheduleruseleaderforsingle);
	/*! \brief Get 
	 */
	ConfigNodePropertyArray getMetricsfilters();

	/*! \brief Set 
	 */
	void setMetricsfilters(ConfigNodePropertyArray metricsfilters);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getSlowThresholdMillis();

	/*! \brief Set 
	 */
	void setSlowThresholdMillis(ConfigNodePropertyInteger slowThresholdMillis);


    private:
    ConfigNodePropertyString poolName;
    ConfigNodePropertyArray allowedPoolNames;
    ConfigNodePropertyBoolean scheduleruseleaderforsingle;
    ConfigNodePropertyArray metricsfilters;
    ConfigNodePropertyInteger slowThresholdMillis;
};
}

#endif /* TINY_CPP_CLIENT_OrgApacheSlingCommonsSchedulerImplQuartzSchedulerProperties_H_ */
