/*
 * ComAdobeCqSocialForumDispatcherImplFlushOperationsProperties.h
 *
 * 
 */

#ifndef _ComAdobeCqSocialForumDispatcherImplFlushOperationsProperties_H_
#define _ComAdobeCqSocialForumDispatcherImplFlushOperationsProperties_H_


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

class ComAdobeCqSocialForumDispatcherImplFlushOperationsProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	ComAdobeCqSocialForumDispatcherImplFlushOperationsProperties();
	ComAdobeCqSocialForumDispatcherImplFlushOperationsProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ComAdobeCqSocialForumDispatcherImplFlushOperationsProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getExtensionorder();

	/*! \brief Set 
	 */
	void setExtensionorder(ConfigNodePropertyInteger  extensionorder);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getFlushforumontopic();

	/*! \brief Set 
	 */
	void setFlushforumontopic(ConfigNodePropertyBoolean  flushforumontopic);

private:
	ConfigNodePropertyInteger extensionorder;
	ConfigNodePropertyBoolean flushforumontopic;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ComAdobeCqSocialForumDispatcherImplFlushOperationsProperties_H_ */
