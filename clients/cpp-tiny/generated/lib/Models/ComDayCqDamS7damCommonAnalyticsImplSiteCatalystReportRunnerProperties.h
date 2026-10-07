
/*
 * ComDayCqDamS7damCommonAnalyticsImplSiteCatalystReportRunnerProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ComDayCqDamS7damCommonAnalyticsImplSiteCatalystReportRunnerProperties_H_
#define TINY_CPP_CLIENT_ComDayCqDamS7damCommonAnalyticsImplSiteCatalystReportRunnerProperties_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ConfigNodePropertyBoolean.h"
#include "ConfigNodePropertyString.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class ComDayCqDamS7damCommonAnalyticsImplSiteCatalystReportRunnerProperties{
public:

    /*! \brief Constructor.
	 */
    ComDayCqDamS7damCommonAnalyticsImplSiteCatalystReportRunnerProperties();
    ComDayCqDamS7damCommonAnalyticsImplSiteCatalystReportRunnerProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ComDayCqDamS7damCommonAnalyticsImplSiteCatalystReportRunnerProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyString getSchedulerexpression();

	/*! \brief Set 
	 */
	void setSchedulerexpression(ConfigNodePropertyString schedulerexpression);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getSchedulerconcurrent();

	/*! \brief Set 
	 */
	void setSchedulerconcurrent(ConfigNodePropertyBoolean schedulerconcurrent);


    private:
    ConfigNodePropertyString schedulerexpression;
    ConfigNodePropertyBoolean schedulerconcurrent;
};
}

#endif /* TINY_CPP_CLIENT_ComDayCqDamS7damCommonAnalyticsImplSiteCatalystReportRunnerProperties_H_ */
