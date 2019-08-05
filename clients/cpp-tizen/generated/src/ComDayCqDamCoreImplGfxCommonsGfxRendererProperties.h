/*
 * ComDayCqDamCoreImplGfxCommonsGfxRendererProperties.h
 *
 * 
 */

#ifndef _ComDayCqDamCoreImplGfxCommonsGfxRendererProperties_H_
#define _ComDayCqDamCoreImplGfxCommonsGfxRendererProperties_H_


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

class ComDayCqDamCoreImplGfxCommonsGfxRendererProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	ComDayCqDamCoreImplGfxCommonsGfxRendererProperties();
	ComDayCqDamCoreImplGfxCommonsGfxRendererProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ComDayCqDamCoreImplGfxCommonsGfxRendererProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getSkipbufferedcache();

	/*! \brief Set 
	 */
	void setSkipbufferedcache(ConfigNodePropertyBoolean  skipbufferedcache);

private:
	ConfigNodePropertyBoolean skipbufferedcache;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ComDayCqDamCoreImplGfxCommonsGfxRendererProperties_H_ */
