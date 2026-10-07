/*
 * ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportMProperties.h
 *
 * 
 */

#ifndef _ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportMProperties_H_
#define _ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportMProperties_H_


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

class ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportMProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportMProperties();
	ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportMProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportMProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getReportfetchdelay();

	/*! \brief Set 
	 */
	void setReportfetchdelay(ConfigNodePropertyInteger  reportfetchdelay);

private:
	ConfigNodePropertyInteger reportfetchdelay;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportMProperties_H_ */
