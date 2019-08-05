/*
 * ComAdobeCqSocialCommonsCommentsListingImplSearchCommentSocialCProperties.h
 *
 * 
 */

#ifndef _ComAdobeCqSocialCommonsCommentsListingImplSearchCommentSocialCProperties_H_
#define _ComAdobeCqSocialCommonsCommentsListingImplSearchCommentSocialCProperties_H_


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

class ComAdobeCqSocialCommonsCommentsListingImplSearchCommentSocialCProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	ComAdobeCqSocialCommonsCommentsListingImplSearchCommentSocialCProperties();
	ComAdobeCqSocialCommonsCommentsListingImplSearchCommentSocialCProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ComAdobeCqSocialCommonsCommentsListingImplSearchCommentSocialCProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getNumUserLimit();

	/*! \brief Set 
	 */
	void setNumUserLimit(ConfigNodePropertyInteger  numUserLimit);

private:
	ConfigNodePropertyInteger numUserLimit;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ComAdobeCqSocialCommonsCommentsListingImplSearchCommentSocialCProperties_H_ */
