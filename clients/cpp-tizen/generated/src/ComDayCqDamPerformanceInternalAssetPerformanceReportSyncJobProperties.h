/*
 * ComDayCqDamPerformanceInternalAssetPerformanceReportSyncJobProperties.h
 *
 * 
 */

#ifndef _ComDayCqDamPerformanceInternalAssetPerformanceReportSyncJobProperties_H_
#define _ComDayCqDamPerformanceInternalAssetPerformanceReportSyncJobProperties_H_


#include <string>
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

class ComDayCqDamPerformanceInternalAssetPerformanceReportSyncJobProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	ComDayCqDamPerformanceInternalAssetPerformanceReportSyncJobProperties();
	ComDayCqDamPerformanceInternalAssetPerformanceReportSyncJobProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ComDayCqDamPerformanceInternalAssetPerformanceReportSyncJobProperties();

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

private:
	ConfigNodePropertyString schedulerexpression;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ComDayCqDamPerformanceInternalAssetPerformanceReportSyncJobProperties_H_ */
