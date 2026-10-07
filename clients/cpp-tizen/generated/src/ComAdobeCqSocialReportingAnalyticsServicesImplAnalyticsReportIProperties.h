/*
 * ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportIProperties.h
 *
 * 
 */

#ifndef _ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportIProperties_H_
#define _ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportIProperties_H_


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

class ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportIProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportIProperties();
	ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportIProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportIProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getCqsocialreportinganalyticspollingimporterinterval();

	/*! \brief Set 
	 */
	void setCqsocialreportinganalyticspollingimporterinterval(ConfigNodePropertyInteger  cqsocialreportinganalyticspollingimporterinterval);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getCqsocialreportinganalyticspollingimporterpageSize();

	/*! \brief Set 
	 */
	void setCqsocialreportinganalyticspollingimporterpageSize(ConfigNodePropertyInteger  cqsocialreportinganalyticspollingimporterpageSize);

private:
	ConfigNodePropertyInteger cqsocialreportinganalyticspollingimporterinterval;
	ConfigNodePropertyInteger cqsocialreportinganalyticspollingimporterpageSize;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportIProperties_H_ */
