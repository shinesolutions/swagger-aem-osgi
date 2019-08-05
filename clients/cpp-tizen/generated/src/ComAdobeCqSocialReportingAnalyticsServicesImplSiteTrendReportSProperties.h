/*
 * ComAdobeCqSocialReportingAnalyticsServicesImplSiteTrendReportSProperties.h
 *
 * 
 */

#ifndef _ComAdobeCqSocialReportingAnalyticsServicesImplSiteTrendReportSProperties_H_
#define _ComAdobeCqSocialReportingAnalyticsServicesImplSiteTrendReportSProperties_H_


#include <string>
#include "ConfigNodePropertyArray.h"
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

class ComAdobeCqSocialReportingAnalyticsServicesImplSiteTrendReportSProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	ComAdobeCqSocialReportingAnalyticsServicesImplSiteTrendReportSProperties();
	ComAdobeCqSocialReportingAnalyticsServicesImplSiteTrendReportSProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ComAdobeCqSocialReportingAnalyticsServicesImplSiteTrendReportSProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyArray getCqsocialconsoleanalyticssitesmapping();

	/*! \brief Set 
	 */
	void setCqsocialconsoleanalyticssitesmapping(ConfigNodePropertyArray  cqsocialconsoleanalyticssitesmapping);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getPriority();

	/*! \brief Set 
	 */
	void setPriority(ConfigNodePropertyInteger  priority);

private:
	ConfigNodePropertyArray cqsocialconsoleanalyticssitesmapping;
	ConfigNodePropertyInteger priority;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ComAdobeCqSocialReportingAnalyticsServicesImplSiteTrendReportSProperties_H_ */
