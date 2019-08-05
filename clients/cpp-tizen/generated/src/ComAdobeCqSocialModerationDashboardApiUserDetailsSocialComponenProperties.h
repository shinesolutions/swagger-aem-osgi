/*
 * ComAdobeCqSocialModerationDashboardApiUserDetailsSocialComponenProperties.h
 *
 * 
 */

#ifndef _ComAdobeCqSocialModerationDashboardApiUserDetailsSocialComponenProperties_H_
#define _ComAdobeCqSocialModerationDashboardApiUserDetailsSocialComponenProperties_H_


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

class ComAdobeCqSocialModerationDashboardApiUserDetailsSocialComponenProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	ComAdobeCqSocialModerationDashboardApiUserDetailsSocialComponenProperties();
	ComAdobeCqSocialModerationDashboardApiUserDetailsSocialComponenProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ComAdobeCqSocialModerationDashboardApiUserDetailsSocialComponenProperties();

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

#endif /* _ComAdobeCqSocialModerationDashboardApiUserDetailsSocialComponenProperties_H_ */
