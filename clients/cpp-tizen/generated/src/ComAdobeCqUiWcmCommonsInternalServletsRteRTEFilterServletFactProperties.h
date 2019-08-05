/*
 * ComAdobeCqUiWcmCommonsInternalServletsRteRTEFilterServletFactProperties.h
 *
 * 
 */

#ifndef _ComAdobeCqUiWcmCommonsInternalServletsRteRTEFilterServletFactProperties_H_
#define _ComAdobeCqUiWcmCommonsInternalServletsRteRTEFilterServletFactProperties_H_


#include <string>
#include "ConfigNodePropertyArray.h"
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

class ComAdobeCqUiWcmCommonsInternalServletsRteRTEFilterServletFactProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	ComAdobeCqUiWcmCommonsInternalServletsRteRTEFilterServletFactProperties();
	ComAdobeCqUiWcmCommonsInternalServletsRteRTEFilterServletFactProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ComAdobeCqUiWcmCommonsInternalServletsRteRTEFilterServletFactProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyArray getResourcetypes();

	/*! \brief Set 
	 */
	void setResourcetypes(ConfigNodePropertyArray  resourcetypes);

private:
	ConfigNodePropertyArray resourcetypes;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ComAdobeCqUiWcmCommonsInternalServletsRteRTEFilterServletFactProperties_H_ */
