/*
 * ComDayCqDamS7damCommonAnalyticsImplSiteCatalystReportRunnerProperties.h
 *
 * 
 */

#ifndef _ComDayCqDamS7damCommonAnalyticsImplSiteCatalystReportRunnerProperties_H_
#define _ComDayCqDamS7damCommonAnalyticsImplSiteCatalystReportRunnerProperties_H_


#include <string>
#include "ConfigNodePropertyBoolean.h"
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

class ComDayCqDamS7damCommonAnalyticsImplSiteCatalystReportRunnerProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	ComDayCqDamS7damCommonAnalyticsImplSiteCatalystReportRunnerProperties();
	ComDayCqDamS7damCommonAnalyticsImplSiteCatalystReportRunnerProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ComDayCqDamS7damCommonAnalyticsImplSiteCatalystReportRunnerProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyString getSchedulerexpression();

	/*! \brief Set 
	 */
	void setSchedulerexpression(ConfigNodePropertyString  schedulerexpression);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getSchedulerconcurrent();

	/*! \brief Set 
	 */
	void setSchedulerconcurrent(ConfigNodePropertyBoolean  schedulerconcurrent);

private:
	ConfigNodePropertyString schedulerexpression;
	ConfigNodePropertyBoolean schedulerconcurrent;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ComDayCqDamS7damCommonAnalyticsImplSiteCatalystReportRunnerProperties_H_ */
