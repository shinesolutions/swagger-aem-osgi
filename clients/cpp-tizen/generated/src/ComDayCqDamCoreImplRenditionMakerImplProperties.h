/*
 * ComDayCqDamCoreImplRenditionMakerImplProperties.h
 *
 * 
 */

#ifndef _ComDayCqDamCoreImplRenditionMakerImplProperties_H_
#define _ComDayCqDamCoreImplRenditionMakerImplProperties_H_


#include <string>
#include "ConfigNodePropertyArray.h"
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

class ComDayCqDamCoreImplRenditionMakerImplProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	ComDayCqDamCoreImplRenditionMakerImplProperties();
	ComDayCqDamCoreImplRenditionMakerImplProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ComDayCqDamCoreImplRenditionMakerImplProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getXmppropagate();

	/*! \brief Set 
	 */
	void setXmppropagate(ConfigNodePropertyBoolean  xmppropagate);
	/*! \brief Get 
	 */
	ConfigNodePropertyArray getXmpexcludes();

	/*! \brief Set 
	 */
	void setXmpexcludes(ConfigNodePropertyArray  xmpexcludes);

private:
	ConfigNodePropertyBoolean xmppropagate;
	ConfigNodePropertyArray xmpexcludes;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ComDayCqDamCoreImplRenditionMakerImplProperties_H_ */
