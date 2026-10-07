/*
 * OrgApacheSlingCommonsSchedulerImplQuartzSchedulerProperties.h
 *
 * 
 */

#ifndef _OrgApacheSlingCommonsSchedulerImplQuartzSchedulerProperties_H_
#define _OrgApacheSlingCommonsSchedulerImplQuartzSchedulerProperties_H_


#include <string>
#include "ConfigNodePropertyArray.h"
#include "ConfigNodePropertyBoolean.h"
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

class OrgApacheSlingCommonsSchedulerImplQuartzSchedulerProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	OrgApacheSlingCommonsSchedulerImplQuartzSchedulerProperties();
	OrgApacheSlingCommonsSchedulerImplQuartzSchedulerProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~OrgApacheSlingCommonsSchedulerImplQuartzSchedulerProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyString getPoolName();

	/*! \brief Set 
	 */
	void setPoolName(ConfigNodePropertyString  poolName);
	/*! \brief Get 
	 */
	ConfigNodePropertyArray getAllowedPoolNames();

	/*! \brief Set 
	 */
	void setAllowedPoolNames(ConfigNodePropertyArray  allowedPoolNames);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getScheduleruseleaderforsingle();

	/*! \brief Set 
	 */
	void setScheduleruseleaderforsingle(ConfigNodePropertyBoolean  scheduleruseleaderforsingle);
	/*! \brief Get 
	 */
	ConfigNodePropertyArray getMetricsfilters();

	/*! \brief Set 
	 */
	void setMetricsfilters(ConfigNodePropertyArray  metricsfilters);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getSlowThresholdMillis();

	/*! \brief Set 
	 */
	void setSlowThresholdMillis(ConfigNodePropertyInteger  slowThresholdMillis);

private:
	ConfigNodePropertyString poolName;
	ConfigNodePropertyArray allowedPoolNames;
	ConfigNodePropertyBoolean scheduleruseleaderforsingle;
	ConfigNodePropertyArray metricsfilters;
	ConfigNodePropertyInteger slowThresholdMillis;
	void __init();
	void __cleanup();

};
}
}

#endif /* _OrgApacheSlingCommonsSchedulerImplQuartzSchedulerProperties_H_ */
