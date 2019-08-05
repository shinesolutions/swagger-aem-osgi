/*
 * ComAdobeCqCommercePimImplPageEventListenerProperties.h
 *
 * 
 */

#ifndef _ComAdobeCqCommercePimImplPageEventListenerProperties_H_
#define _ComAdobeCqCommercePimImplPageEventListenerProperties_H_


#include <string>
#include "ConfigNodePropertyBoolean.h"
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

class ComAdobeCqCommercePimImplPageEventListenerProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	ComAdobeCqCommercePimImplPageEventListenerProperties();
	ComAdobeCqCommercePimImplPageEventListenerProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ComAdobeCqCommercePimImplPageEventListenerProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getCqcommercepageeventlistenerenabled();

	/*! \brief Set 
	 */
	void setCqcommercepageeventlistenerenabled(ConfigNodePropertyBoolean  cqcommercepageeventlistenerenabled);

private:
	ConfigNodePropertyBoolean cqcommercepageeventlistenerenabled;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ComAdobeCqCommercePimImplPageEventListenerProperties_H_ */
