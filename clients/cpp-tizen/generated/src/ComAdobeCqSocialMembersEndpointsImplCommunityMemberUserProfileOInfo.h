/*
 * ComAdobeCqSocialMembersEndpointsImplCommunityMemberUserProfileOInfo.h
 *
 * 
 */

#ifndef _ComAdobeCqSocialMembersEndpointsImplCommunityMemberUserProfileOInfo_H_
#define _ComAdobeCqSocialMembersEndpointsImplCommunityMemberUserProfileOInfo_H_


#include <string>
#include "ComAdobeCqSocialMembersEndpointsImplCommunityMemberUserProfileOProperties.h"
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

class ComAdobeCqSocialMembersEndpointsImplCommunityMemberUserProfileOInfo : public Object {
public:
	/*! \brief Constructor.
	 */
	ComAdobeCqSocialMembersEndpointsImplCommunityMemberUserProfileOInfo();
	ComAdobeCqSocialMembersEndpointsImplCommunityMemberUserProfileOInfo(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ComAdobeCqSocialMembersEndpointsImplCommunityMemberUserProfileOInfo();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	std::string getPid();

	/*! \brief Set 
	 */
	void setPid(std::string  pid);
	/*! \brief Get 
	 */
	std::string getTitle();

	/*! \brief Set 
	 */
	void setTitle(std::string  title);
	/*! \brief Get 
	 */
	std::string getDescription();

	/*! \brief Set 
	 */
	void setDescription(std::string  description);
	/*! \brief Get 
	 */
	ComAdobeCqSocialMembersEndpointsImplCommunityMemberUserProfileOProperties getProperties();

	/*! \brief Set 
	 */
	void setProperties(ComAdobeCqSocialMembersEndpointsImplCommunityMemberUserProfileOProperties  properties);

private:
	std::string pid;
	std::string title;
	std::string description;
	ComAdobeCqSocialMembersEndpointsImplCommunityMemberUserProfileOProperties properties;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ComAdobeCqSocialMembersEndpointsImplCommunityMemberUserProfileOInfo_H_ */
