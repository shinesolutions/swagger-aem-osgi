
/*
 * OrgApacheSlingHcCoreImplExecutorHealthCheckExecutorImplProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_OrgApacheSlingHcCoreImplExecutorHealthCheckExecutorImplProperties_H_
#define TINY_CPP_CLIENT_OrgApacheSlingHcCoreImplExecutorHealthCheckExecutorImplProperties_H_


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

class OrgApacheSlingHcCoreImplExecutorHealthCheckExecutorImplProperties{
public:

    /*! \brief Constructor.
	 */
    OrgApacheSlingHcCoreImplExecutorHealthCheckExecutorImplProperties();
    OrgApacheSlingHcCoreImplExecutorHealthCheckExecutorImplProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~OrgApacheSlingHcCoreImplExecutorHealthCheckExecutorImplProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getTimeoutInMs();

	/*! \brief Set 
	 */
	void setTimeoutInMs(ConfigNodePropertyInteger timeoutInMs);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getLongRunningFutureThresholdForCriticalMs();

	/*! \brief Set 
	 */
	void setLongRunningFutureThresholdForCriticalMs(ConfigNodePropertyInteger longRunningFutureThresholdForCriticalMs);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getResultCacheTtlInMs();

	/*! \brief Set 
	 */
	void setResultCacheTtlInMs(ConfigNodePropertyInteger resultCacheTtlInMs);


    private:
    ConfigNodePropertyInteger timeoutInMs;
    ConfigNodePropertyInteger longRunningFutureThresholdForCriticalMs;
    ConfigNodePropertyInteger resultCacheTtlInMs;
};
}

#endif /* TINY_CPP_CLIENT_OrgApacheSlingHcCoreImplExecutorHealthCheckExecutorImplProperties_H_ */
