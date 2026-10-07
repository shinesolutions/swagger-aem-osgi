/*
 * ComDayCqDamCoreImplServletBinaryProviderServletProperties.h
 *
 * 
 */

#ifndef _ComDayCqDamCoreImplServletBinaryProviderServletProperties_H_
#define _ComDayCqDamCoreImplServletBinaryProviderServletProperties_H_


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

class ComDayCqDamCoreImplServletBinaryProviderServletProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	ComDayCqDamCoreImplServletBinaryProviderServletProperties();
	ComDayCqDamCoreImplServletBinaryProviderServletProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ComDayCqDamCoreImplServletBinaryProviderServletProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyArray getSlingservletresourceTypes();

	/*! \brief Set 
	 */
	void setSlingservletresourceTypes(ConfigNodePropertyArray  slingservletresourceTypes);
	/*! \brief Get 
	 */
	ConfigNodePropertyArray getSlingservletmethods();

	/*! \brief Set 
	 */
	void setSlingservletmethods(ConfigNodePropertyArray  slingservletmethods);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getCqdamdrmenable();

	/*! \brief Set 
	 */
	void setCqdamdrmenable(ConfigNodePropertyBoolean  cqdamdrmenable);

private:
	ConfigNodePropertyArray slingservletresourceTypes;
	ConfigNodePropertyArray slingservletmethods;
	ConfigNodePropertyBoolean cqdamdrmenable;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ComDayCqDamCoreImplServletBinaryProviderServletProperties_H_ */
