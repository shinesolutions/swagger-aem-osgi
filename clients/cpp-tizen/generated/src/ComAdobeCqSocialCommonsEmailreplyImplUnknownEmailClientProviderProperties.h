/*
 * ComAdobeCqSocialCommonsEmailreplyImplUnknownEmailClientProviderProperties.h
 *
 * 
 */

#ifndef _ComAdobeCqSocialCommonsEmailreplyImplUnknownEmailClientProviderProperties_H_
#define _ComAdobeCqSocialCommonsEmailreplyImplUnknownEmailClientProviderProperties_H_


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

class ComAdobeCqSocialCommonsEmailreplyImplUnknownEmailClientProviderProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	ComAdobeCqSocialCommonsEmailreplyImplUnknownEmailClientProviderProperties();
	ComAdobeCqSocialCommonsEmailreplyImplUnknownEmailClientProviderProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ComAdobeCqSocialCommonsEmailreplyImplUnknownEmailClientProviderProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyArray getReplyEmailPatterns();

	/*! \brief Set 
	 */
	void setReplyEmailPatterns(ConfigNodePropertyArray  replyEmailPatterns);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getPriorityOrder();

	/*! \brief Set 
	 */
	void setPriorityOrder(ConfigNodePropertyInteger  priorityOrder);

private:
	ConfigNodePropertyArray replyEmailPatterns;
	ConfigNodePropertyInteger priorityOrder;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ComAdobeCqSocialCommonsEmailreplyImplUnknownEmailClientProviderProperties_H_ */
