/*
 * ComDayCqDamCoreImplReportsReportPurgeServiceProperties.h
 *
 * 
 */

#ifndef _ComDayCqDamCoreImplReportsReportPurgeServiceProperties_H_
#define _ComDayCqDamCoreImplReportsReportPurgeServiceProperties_H_


#include <string>
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

class ComDayCqDamCoreImplReportsReportPurgeServiceProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	ComDayCqDamCoreImplReportsReportPurgeServiceProperties();
	ComDayCqDamCoreImplReportsReportPurgeServiceProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ComDayCqDamCoreImplReportsReportPurgeServiceProperties();

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
	ConfigNodePropertyInteger getMaxSavedReports();

	/*! \brief Set 
	 */
	void setMaxSavedReports(ConfigNodePropertyInteger  maxSavedReports);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getTimeDuration();

	/*! \brief Set 
	 */
	void setTimeDuration(ConfigNodePropertyInteger  timeDuration);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getEnableReportPurge();

	/*! \brief Set 
	 */
	void setEnableReportPurge(ConfigNodePropertyBoolean  enableReportPurge);

private:
	ConfigNodePropertyString schedulerexpression;
	ConfigNodePropertyInteger maxSavedReports;
	ConfigNodePropertyInteger timeDuration;
	ConfigNodePropertyBoolean enableReportPurge;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ComDayCqDamCoreImplReportsReportPurgeServiceProperties_H_ */
