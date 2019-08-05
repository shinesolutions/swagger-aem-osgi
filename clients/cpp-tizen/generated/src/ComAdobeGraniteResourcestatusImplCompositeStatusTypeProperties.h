/*
 * ComAdobeGraniteResourcestatusImplCompositeStatusTypeProperties.h
 *
 * 
 */

#ifndef _ComAdobeGraniteResourcestatusImplCompositeStatusTypeProperties_H_
#define _ComAdobeGraniteResourcestatusImplCompositeStatusTypeProperties_H_


#include <string>
#include "ConfigNodePropertyArray.h"
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

class ComAdobeGraniteResourcestatusImplCompositeStatusTypeProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	ComAdobeGraniteResourcestatusImplCompositeStatusTypeProperties();
	ComAdobeGraniteResourcestatusImplCompositeStatusTypeProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ComAdobeGraniteResourcestatusImplCompositeStatusTypeProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyString getName();

	/*! \brief Set 
	 */
	void setName(ConfigNodePropertyString  name);
	/*! \brief Get 
	 */
	ConfigNodePropertyArray getTypes();

	/*! \brief Set 
	 */
	void setTypes(ConfigNodePropertyArray  types);

private:
	ConfigNodePropertyString name;
	ConfigNodePropertyArray types;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ComAdobeGraniteResourcestatusImplCompositeStatusTypeProperties_H_ */
