/*
 * ComDayCqDamCoreImplHandlerXmpNCommXMPHandlerProperties.h
 *
 * 
 */

#ifndef _ComDayCqDamCoreImplHandlerXmpNCommXMPHandlerProperties_H_
#define _ComDayCqDamCoreImplHandlerXmpNCommXMPHandlerProperties_H_


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

class ComDayCqDamCoreImplHandlerXmpNCommXMPHandlerProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	ComDayCqDamCoreImplHandlerXmpNCommXMPHandlerProperties();
	ComDayCqDamCoreImplHandlerXmpNCommXMPHandlerProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ComDayCqDamCoreImplHandlerXmpNCommXMPHandlerProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyArray getXmphandlercqformats();

	/*! \brief Set 
	 */
	void setXmphandlercqformats(ConfigNodePropertyArray  xmphandlercqformats);

private:
	ConfigNodePropertyArray xmphandlercqformats;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ComDayCqDamCoreImplHandlerXmpNCommXMPHandlerProperties_H_ */
