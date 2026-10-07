/*
 * ComAdobeCqSocialSiteImplAnalyticsComponentConfigurationServiceImProperties.h
 *
 * 
 */

#ifndef _ComAdobeCqSocialSiteImplAnalyticsComponentConfigurationServiceImProperties_H_
#define _ComAdobeCqSocialSiteImplAnalyticsComponentConfigurationServiceImProperties_H_


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

class ComAdobeCqSocialSiteImplAnalyticsComponentConfigurationServiceImProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	ComAdobeCqSocialSiteImplAnalyticsComponentConfigurationServiceImProperties();
	ComAdobeCqSocialSiteImplAnalyticsComponentConfigurationServiceImProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ComAdobeCqSocialSiteImplAnalyticsComponentConfigurationServiceImProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyArray getCqsocialconsoleanalyticscomponents();

	/*! \brief Set 
	 */
	void setCqsocialconsoleanalyticscomponents(ConfigNodePropertyArray  cqsocialconsoleanalyticscomponents);

private:
	ConfigNodePropertyArray cqsocialconsoleanalyticscomponents;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ComAdobeCqSocialSiteImplAnalyticsComponentConfigurationServiceImProperties_H_ */
