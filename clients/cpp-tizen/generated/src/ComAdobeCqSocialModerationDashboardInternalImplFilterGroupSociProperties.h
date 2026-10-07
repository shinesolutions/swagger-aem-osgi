/*
 * ComAdobeCqSocialModerationDashboardInternalImplFilterGroupSociProperties.h
 *
 * 
 */

#ifndef _ComAdobeCqSocialModerationDashboardInternalImplFilterGroupSociProperties_H_
#define _ComAdobeCqSocialModerationDashboardInternalImplFilterGroupSociProperties_H_


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

class ComAdobeCqSocialModerationDashboardInternalImplFilterGroupSociProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	ComAdobeCqSocialModerationDashboardInternalImplFilterGroupSociProperties();
	ComAdobeCqSocialModerationDashboardInternalImplFilterGroupSociProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ComAdobeCqSocialModerationDashboardInternalImplFilterGroupSociProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyArray getResourceTypefilters();

	/*! \brief Set 
	 */
	void setResourceTypefilters(ConfigNodePropertyArray  resourceTypefilters);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getPriority();

	/*! \brief Set 
	 */
	void setPriority(ConfigNodePropertyInteger  priority);

private:
	ConfigNodePropertyArray resourceTypefilters;
	ConfigNodePropertyInteger priority;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ComAdobeCqSocialModerationDashboardInternalImplFilterGroupSociProperties_H_ */
