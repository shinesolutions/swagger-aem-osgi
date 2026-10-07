/*
 * ComAdobeCqSocialMembersImplCommunityMemberGroupProfileComponentFProperties.h
 *
 * 
 */

#ifndef _ComAdobeCqSocialMembersImplCommunityMemberGroupProfileComponentFProperties_H_
#define _ComAdobeCqSocialMembersImplCommunityMemberGroupProfileComponentFProperties_H_


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

class ComAdobeCqSocialMembersImplCommunityMemberGroupProfileComponentFProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	ComAdobeCqSocialMembersImplCommunityMemberGroupProfileComponentFProperties();
	ComAdobeCqSocialMembersImplCommunityMemberGroupProfileComponentFProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ComAdobeCqSocialMembersImplCommunityMemberGroupProfileComponentFProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getEveryoneLimit();

	/*! \brief Set 
	 */
	void setEveryoneLimit(ConfigNodePropertyInteger  everyoneLimit);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getPriority();

	/*! \brief Set 
	 */
	void setPriority(ConfigNodePropertyInteger  priority);

private:
	ConfigNodePropertyInteger everyoneLimit;
	ConfigNodePropertyInteger priority;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ComAdobeCqSocialMembersImplCommunityMemberGroupProfileComponentFProperties_H_ */
