/*
 * ComAdobeGraniteMaintenanceCrxImplRevisionCleanupTaskProperties.h
 *
 * 
 */

#ifndef _ComAdobeGraniteMaintenanceCrxImplRevisionCleanupTaskProperties_H_
#define _ComAdobeGraniteMaintenanceCrxImplRevisionCleanupTaskProperties_H_


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

class ComAdobeGraniteMaintenanceCrxImplRevisionCleanupTaskProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	ComAdobeGraniteMaintenanceCrxImplRevisionCleanupTaskProperties();
	ComAdobeGraniteMaintenanceCrxImplRevisionCleanupTaskProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ComAdobeGraniteMaintenanceCrxImplRevisionCleanupTaskProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyArray getFullgcdays();

	/*! \brief Set 
	 */
	void setFullgcdays(ConfigNodePropertyArray  fullgcdays);

private:
	ConfigNodePropertyArray fullgcdays;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ComAdobeGraniteMaintenanceCrxImplRevisionCleanupTaskProperties_H_ */
