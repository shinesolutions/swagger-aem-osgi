/*
 * ComAdobeCqSocialCommonsEmailreplyImplAndroidEmailClientProviderProperties.h
 *
 * 
 */

#ifndef _ComAdobeCqSocialCommonsEmailreplyImplAndroidEmailClientProviderProperties_H_
#define _ComAdobeCqSocialCommonsEmailreplyImplAndroidEmailClientProviderProperties_H_


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

class ComAdobeCqSocialCommonsEmailreplyImplAndroidEmailClientProviderProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	ComAdobeCqSocialCommonsEmailreplyImplAndroidEmailClientProviderProperties();
	ComAdobeCqSocialCommonsEmailreplyImplAndroidEmailClientProviderProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ComAdobeCqSocialCommonsEmailreplyImplAndroidEmailClientProviderProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getPriorityOrder();

	/*! \brief Set 
	 */
	void setPriorityOrder(ConfigNodePropertyInteger  priorityOrder);
	/*! \brief Get 
	 */
	ConfigNodePropertyArray getReplyEmailPatterns();

	/*! \brief Set 
	 */
	void setReplyEmailPatterns(ConfigNodePropertyArray  replyEmailPatterns);

private:
	ConfigNodePropertyInteger priorityOrder;
	ConfigNodePropertyArray replyEmailPatterns;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ComAdobeCqSocialCommonsEmailreplyImplAndroidEmailClientProviderProperties_H_ */
