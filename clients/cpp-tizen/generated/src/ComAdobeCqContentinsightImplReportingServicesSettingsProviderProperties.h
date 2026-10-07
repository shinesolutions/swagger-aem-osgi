/*
 * ComAdobeCqContentinsightImplReportingServicesSettingsProviderProperties.h
 *
 * 
 */

#ifndef _ComAdobeCqContentinsightImplReportingServicesSettingsProviderProperties_H_
#define _ComAdobeCqContentinsightImplReportingServicesSettingsProviderProperties_H_


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

class ComAdobeCqContentinsightImplReportingServicesSettingsProviderProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	ComAdobeCqContentinsightImplReportingServicesSettingsProviderProperties();
	ComAdobeCqContentinsightImplReportingServicesSettingsProviderProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ComAdobeCqContentinsightImplReportingServicesSettingsProviderProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyString getReportingservicesurl();

	/*! \brief Set 
	 */
	void setReportingservicesurl(ConfigNodePropertyString  reportingservicesurl);

private:
	ConfigNodePropertyString reportingservicesurl;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ComAdobeCqContentinsightImplReportingServicesSettingsProviderProperties_H_ */
