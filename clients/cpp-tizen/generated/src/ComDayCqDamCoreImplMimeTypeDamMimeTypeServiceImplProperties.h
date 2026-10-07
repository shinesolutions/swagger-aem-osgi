/*
 * ComDayCqDamCoreImplMimeTypeDamMimeTypeServiceImplProperties.h
 *
 * 
 */

#ifndef _ComDayCqDamCoreImplMimeTypeDamMimeTypeServiceImplProperties_H_
#define _ComDayCqDamCoreImplMimeTypeDamMimeTypeServiceImplProperties_H_


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

class ComDayCqDamCoreImplMimeTypeDamMimeTypeServiceImplProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	ComDayCqDamCoreImplMimeTypeDamMimeTypeServiceImplProperties();
	ComDayCqDamCoreImplMimeTypeDamMimeTypeServiceImplProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ComDayCqDamCoreImplMimeTypeDamMimeTypeServiceImplProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getCqdamdetectassetmimefromcontent();

	/*! \brief Set 
	 */
	void setCqdamdetectassetmimefromcontent(ConfigNodePropertyBoolean  cqdamdetectassetmimefromcontent);

private:
	ConfigNodePropertyBoolean cqdamdetectassetmimefromcontent;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ComDayCqDamCoreImplMimeTypeDamMimeTypeServiceImplProperties_H_ */
