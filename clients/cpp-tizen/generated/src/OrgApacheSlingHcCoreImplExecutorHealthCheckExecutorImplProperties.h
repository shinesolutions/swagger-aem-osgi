/*
 * OrgApacheSlingHcCoreImplExecutorHealthCheckExecutorImplProperties.h
 *
 * 
 */

#ifndef _OrgApacheSlingHcCoreImplExecutorHealthCheckExecutorImplProperties_H_
#define _OrgApacheSlingHcCoreImplExecutorHealthCheckExecutorImplProperties_H_


#include <string>
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

class OrgApacheSlingHcCoreImplExecutorHealthCheckExecutorImplProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	OrgApacheSlingHcCoreImplExecutorHealthCheckExecutorImplProperties();
	OrgApacheSlingHcCoreImplExecutorHealthCheckExecutorImplProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~OrgApacheSlingHcCoreImplExecutorHealthCheckExecutorImplProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getTimeoutInMs();

	/*! \brief Set 
	 */
	void setTimeoutInMs(ConfigNodePropertyInteger  timeoutInMs);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getLongRunningFutureThresholdForCriticalMs();

	/*! \brief Set 
	 */
	void setLongRunningFutureThresholdForCriticalMs(ConfigNodePropertyInteger  longRunningFutureThresholdForCriticalMs);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getResultCacheTtlInMs();

	/*! \brief Set 
	 */
	void setResultCacheTtlInMs(ConfigNodePropertyInteger  resultCacheTtlInMs);

private:
	ConfigNodePropertyInteger timeoutInMs;
	ConfigNodePropertyInteger longRunningFutureThresholdForCriticalMs;
	ConfigNodePropertyInteger resultCacheTtlInMs;
	void __init();
	void __cleanup();

};
}
}

#endif /* _OrgApacheSlingHcCoreImplExecutorHealthCheckExecutorImplProperties_H_ */
