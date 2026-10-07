/*
 * ComDayCqDamCoreImplServletMultipleLicenseAcceptServletProperties.h
 *
 * 
 */

#ifndef _ComDayCqDamCoreImplServletMultipleLicenseAcceptServletProperties_H_
#define _ComDayCqDamCoreImplServletMultipleLicenseAcceptServletProperties_H_


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

class ComDayCqDamCoreImplServletMultipleLicenseAcceptServletProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	ComDayCqDamCoreImplServletMultipleLicenseAcceptServletProperties();
	ComDayCqDamCoreImplServletMultipleLicenseAcceptServletProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ComDayCqDamCoreImplServletMultipleLicenseAcceptServletProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getCqdamdrmenable();

	/*! \brief Set 
	 */
	void setCqdamdrmenable(ConfigNodePropertyBoolean  cqdamdrmenable);

private:
	ConfigNodePropertyBoolean cqdamdrmenable;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ComDayCqDamCoreImplServletMultipleLicenseAcceptServletProperties_H_ */
