/*
 * ComAdobeCqSocialCommonsCommentsSchedulerImplSearchScheduledPosProperties.h
 *
 * 
 */

#ifndef _ComAdobeCqSocialCommonsCommentsSchedulerImplSearchScheduledPosProperties_H_
#define _ComAdobeCqSocialCommonsCommentsSchedulerImplSearchScheduledPosProperties_H_


#include <string>
#include "ConfigNodePropertyBoolean.h"
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

class ComAdobeCqSocialCommonsCommentsSchedulerImplSearchScheduledPosProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	ComAdobeCqSocialCommonsCommentsSchedulerImplSearchScheduledPosProperties();
	ComAdobeCqSocialCommonsCommentsSchedulerImplSearchScheduledPosProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ComAdobeCqSocialCommonsCommentsSchedulerImplSearchScheduledPosProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getEnableScheduledPostsSearch();

	/*! \brief Set 
	 */
	void setEnableScheduledPostsSearch(ConfigNodePropertyBoolean  enableScheduledPostsSearch);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getNumberOfMinutes();

	/*! \brief Set 
	 */
	void setNumberOfMinutes(ConfigNodePropertyInteger  numberOfMinutes);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getMaxSearchLimit();

	/*! \brief Set 
	 */
	void setMaxSearchLimit(ConfigNodePropertyInteger  maxSearchLimit);

private:
	ConfigNodePropertyBoolean enableScheduledPostsSearch;
	ConfigNodePropertyInteger numberOfMinutes;
	ConfigNodePropertyInteger maxSearchLimit;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ComAdobeCqSocialCommonsCommentsSchedulerImplSearchScheduledPosProperties_H_ */
