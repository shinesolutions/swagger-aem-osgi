/*
 * ComAdobeCqContentinsightImplServletsReportingServicesProxyServleProperties.h
 *
 * 
 */

#ifndef _ComAdobeCqContentinsightImplServletsReportingServicesProxyServleProperties_H_
#define _ComAdobeCqContentinsightImplServletsReportingServicesProxyServleProperties_H_


#include <string>
#include "ConfigNodePropertyArray.h"
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

class ComAdobeCqContentinsightImplServletsReportingServicesProxyServleProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	ComAdobeCqContentinsightImplServletsReportingServicesProxyServleProperties();
	ComAdobeCqContentinsightImplServletsReportingServicesProxyServleProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ComAdobeCqContentinsightImplServletsReportingServicesProxyServleProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyArray getReportingservicesproxywhitelist();

	/*! \brief Set 
	 */
	void setReportingservicesproxywhitelist(ConfigNodePropertyArray  reportingservicesproxywhitelist);

private:
	ConfigNodePropertyArray reportingservicesproxywhitelist;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ComAdobeCqContentinsightImplServletsReportingServicesProxyServleProperties_H_ */
