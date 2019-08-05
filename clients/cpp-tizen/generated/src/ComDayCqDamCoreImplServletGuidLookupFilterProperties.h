/*
 * ComDayCqDamCoreImplServletGuidLookupFilterProperties.h
 *
 * 
 */

#ifndef _ComDayCqDamCoreImplServletGuidLookupFilterProperties_H_
#define _ComDayCqDamCoreImplServletGuidLookupFilterProperties_H_


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

class ComDayCqDamCoreImplServletGuidLookupFilterProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	ComDayCqDamCoreImplServletGuidLookupFilterProperties();
	ComDayCqDamCoreImplServletGuidLookupFilterProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ComDayCqDamCoreImplServletGuidLookupFilterProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getCqdamcoreguidlookupfilterenabled();

	/*! \brief Set 
	 */
	void setCqdamcoreguidlookupfilterenabled(ConfigNodePropertyBoolean  cqdamcoreguidlookupfilterenabled);

private:
	ConfigNodePropertyBoolean cqdamcoreguidlookupfilterenabled;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ComDayCqDamCoreImplServletGuidLookupFilterProperties_H_ */
