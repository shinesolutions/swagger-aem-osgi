/*
 * ComAdobeCqSocialCommonsCommentsEndpointsImplCommentDeleteEventProperties.h
 *
 * 
 */

#ifndef _ComAdobeCqSocialCommonsCommentsEndpointsImplCommentDeleteEventProperties_H_
#define _ComAdobeCqSocialCommonsCommentsEndpointsImplCommentDeleteEventProperties_H_


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

class ComAdobeCqSocialCommonsCommentsEndpointsImplCommentDeleteEventProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	ComAdobeCqSocialCommonsCommentsEndpointsImplCommentDeleteEventProperties();
	ComAdobeCqSocialCommonsCommentsEndpointsImplCommentDeleteEventProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ComAdobeCqSocialCommonsCommentsEndpointsImplCommentDeleteEventProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getRanking();

	/*! \brief Set 
	 */
	void setRanking(ConfigNodePropertyInteger  ranking);

private:
	ConfigNodePropertyInteger ranking;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ComAdobeCqSocialCommonsCommentsEndpointsImplCommentDeleteEventProperties_H_ */
