/*
 * ComAdobeCqSocialServiceusersInternalImplServiceUserWrapperImplProperties.h
 *
 * 
 */

#ifndef _ComAdobeCqSocialServiceusersInternalImplServiceUserWrapperImplProperties_H_
#define _ComAdobeCqSocialServiceusersInternalImplServiceUserWrapperImplProperties_H_


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

class ComAdobeCqSocialServiceusersInternalImplServiceUserWrapperImplProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	ComAdobeCqSocialServiceusersInternalImplServiceUserWrapperImplProperties();
	ComAdobeCqSocialServiceusersInternalImplServiceUserWrapperImplProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ComAdobeCqSocialServiceusersInternalImplServiceUserWrapperImplProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getEnableFallback();

	/*! \brief Set 
	 */
	void setEnableFallback(ConfigNodePropertyBoolean  enableFallback);

private:
	ConfigNodePropertyBoolean enableFallback;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ComAdobeCqSocialServiceusersInternalImplServiceUserWrapperImplProperties_H_ */
