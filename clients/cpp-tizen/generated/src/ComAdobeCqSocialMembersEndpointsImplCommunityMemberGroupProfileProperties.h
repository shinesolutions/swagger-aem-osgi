/*
 * ComAdobeCqSocialMembersEndpointsImplCommunityMemberGroupProfileProperties.h
 *
 * 
 */

#ifndef _ComAdobeCqSocialMembersEndpointsImplCommunityMemberGroupProfileProperties_H_
#define _ComAdobeCqSocialMembersEndpointsImplCommunityMemberGroupProfileProperties_H_


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

class ComAdobeCqSocialMembersEndpointsImplCommunityMemberGroupProfileProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	ComAdobeCqSocialMembersEndpointsImplCommunityMemberGroupProfileProperties();
	ComAdobeCqSocialMembersEndpointsImplCommunityMemberGroupProfileProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ComAdobeCqSocialMembersEndpointsImplCommunityMemberGroupProfileProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyArray getFieldWhitelist();

	/*! \brief Set 
	 */
	void setFieldWhitelist(ConfigNodePropertyArray  fieldWhitelist);

private:
	ConfigNodePropertyArray fieldWhitelist;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ComAdobeCqSocialMembersEndpointsImplCommunityMemberGroupProfileProperties_H_ */
