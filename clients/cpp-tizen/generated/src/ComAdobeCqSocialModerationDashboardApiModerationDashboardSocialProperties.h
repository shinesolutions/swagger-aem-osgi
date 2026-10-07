/*
 * ComAdobeCqSocialModerationDashboardApiModerationDashboardSocialProperties.h
 *
 * 
 */

#ifndef _ComAdobeCqSocialModerationDashboardApiModerationDashboardSocialProperties_H_
#define _ComAdobeCqSocialModerationDashboardApiModerationDashboardSocialProperties_H_


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

class ComAdobeCqSocialModerationDashboardApiModerationDashboardSocialProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	ComAdobeCqSocialModerationDashboardApiModerationDashboardSocialProperties();
	ComAdobeCqSocialModerationDashboardApiModerationDashboardSocialProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ComAdobeCqSocialModerationDashboardApiModerationDashboardSocialProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getPriority();

	/*! \brief Set 
	 */
	void setPriority(ConfigNodePropertyInteger  priority);

private:
	ConfigNodePropertyInteger priority;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ComAdobeCqSocialModerationDashboardApiModerationDashboardSocialProperties_H_ */
