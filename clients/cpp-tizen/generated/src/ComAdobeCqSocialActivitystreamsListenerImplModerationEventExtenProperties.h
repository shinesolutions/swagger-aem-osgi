/*
 * ComAdobeCqSocialActivitystreamsListenerImplModerationEventExtenProperties.h
 *
 * 
 */

#ifndef _ComAdobeCqSocialActivitystreamsListenerImplModerationEventExtenProperties_H_
#define _ComAdobeCqSocialActivitystreamsListenerImplModerationEventExtenProperties_H_


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

class ComAdobeCqSocialActivitystreamsListenerImplModerationEventExtenProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	ComAdobeCqSocialActivitystreamsListenerImplModerationEventExtenProperties();
	ComAdobeCqSocialActivitystreamsListenerImplModerationEventExtenProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ComAdobeCqSocialActivitystreamsListenerImplModerationEventExtenProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getAccepted();

	/*! \brief Set 
	 */
	void setAccepted(ConfigNodePropertyBoolean  accepted);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getRanked();

	/*! \brief Set 
	 */
	void setRanked(ConfigNodePropertyInteger  ranked);

private:
	ConfigNodePropertyBoolean accepted;
	ConfigNodePropertyInteger ranked;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ComAdobeCqSocialActivitystreamsListenerImplModerationEventExtenProperties_H_ */
