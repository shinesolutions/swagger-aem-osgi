/*
 * ComAdobeCqSocialCommonsEmailreplyImplCommentEmailBuilderImplProperties.h
 *
 * 
 */

#ifndef _ComAdobeCqSocialCommonsEmailreplyImplCommentEmailBuilderImplProperties_H_
#define _ComAdobeCqSocialCommonsEmailreplyImplCommentEmailBuilderImplProperties_H_


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

class ComAdobeCqSocialCommonsEmailreplyImplCommentEmailBuilderImplProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	ComAdobeCqSocialCommonsEmailreplyImplCommentEmailBuilderImplProperties();
	ComAdobeCqSocialCommonsEmailreplyImplCommentEmailBuilderImplProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ComAdobeCqSocialCommonsEmailreplyImplCommentEmailBuilderImplProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyString getContextpath();

	/*! \brief Set 
	 */
	void setContextpath(ConfigNodePropertyString  contextpath);

private:
	ConfigNodePropertyString contextpath;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ComAdobeCqSocialCommonsEmailreplyImplCommentEmailBuilderImplProperties_H_ */
