/*
 * ComDayCqDamCoreImplLightboxLightboxServletProperties.h
 *
 * 
 */

#ifndef _ComDayCqDamCoreImplLightboxLightboxServletProperties_H_
#define _ComDayCqDamCoreImplLightboxLightboxServletProperties_H_


#include <string>
#include "ConfigNodePropertyArray.h"
#include "ConfigNodePropertyBoolean.h"
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

class ComDayCqDamCoreImplLightboxLightboxServletProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	ComDayCqDamCoreImplLightboxLightboxServletProperties();
	ComDayCqDamCoreImplLightboxLightboxServletProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ComDayCqDamCoreImplLightboxLightboxServletProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyString getSlingservletpaths();

	/*! \brief Set 
	 */
	void setSlingservletpaths(ConfigNodePropertyString  slingservletpaths);
	/*! \brief Get 
	 */
	ConfigNodePropertyArray getSlingservletmethods();

	/*! \brief Set 
	 */
	void setSlingservletmethods(ConfigNodePropertyArray  slingservletmethods);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getCqdamenableanonymous();

	/*! \brief Set 
	 */
	void setCqdamenableanonymous(ConfigNodePropertyBoolean  cqdamenableanonymous);

private:
	ConfigNodePropertyString slingservletpaths;
	ConfigNodePropertyArray slingservletmethods;
	ConfigNodePropertyBoolean cqdamenableanonymous;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ComDayCqDamCoreImplLightboxLightboxServletProperties_H_ */
