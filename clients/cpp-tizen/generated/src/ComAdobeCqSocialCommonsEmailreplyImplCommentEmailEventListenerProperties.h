/*
 * ComAdobeCqSocialCommonsEmailreplyImplCommentEmailEventListenerProperties.h
 *
 * 
 */

#ifndef _ComAdobeCqSocialCommonsEmailreplyImplCommentEmailEventListenerProperties_H_
#define _ComAdobeCqSocialCommonsEmailreplyImplCommentEmailEventListenerProperties_H_


#include <string>
#include "ConfigNodePropertyString.h"
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

class ComAdobeCqSocialCommonsEmailreplyImplCommentEmailEventListenerProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	ComAdobeCqSocialCommonsEmailreplyImplCommentEmailEventListenerProperties();
	ComAdobeCqSocialCommonsEmailreplyImplCommentEmailEventListenerProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ComAdobeCqSocialCommonsEmailreplyImplCommentEmailEventListenerProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyString getEventtopics();

	/*! \brief Set 
	 */
	void setEventtopics(ConfigNodePropertyString  eventtopics);

private:
	ConfigNodePropertyString eventtopics;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ComAdobeCqSocialCommonsEmailreplyImplCommentEmailEventListenerProperties_H_ */
