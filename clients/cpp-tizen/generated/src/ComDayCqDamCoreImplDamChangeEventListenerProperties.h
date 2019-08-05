/*
 * ComDayCqDamCoreImplDamChangeEventListenerProperties.h
 *
 * 
 */

#ifndef _ComDayCqDamCoreImplDamChangeEventListenerProperties_H_
#define _ComDayCqDamCoreImplDamChangeEventListenerProperties_H_


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

class ComDayCqDamCoreImplDamChangeEventListenerProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	ComDayCqDamCoreImplDamChangeEventListenerProperties();
	ComDayCqDamCoreImplDamChangeEventListenerProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ComDayCqDamCoreImplDamChangeEventListenerProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyArray getChangeeventlistenerobservedpaths();

	/*! \brief Set 
	 */
	void setChangeeventlistenerobservedpaths(ConfigNodePropertyArray  changeeventlistenerobservedpaths);

private:
	ConfigNodePropertyArray changeeventlistenerobservedpaths;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ComDayCqDamCoreImplDamChangeEventListenerProperties_H_ */
