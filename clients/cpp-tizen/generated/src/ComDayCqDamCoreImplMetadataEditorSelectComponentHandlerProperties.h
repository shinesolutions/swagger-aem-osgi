/*
 * ComDayCqDamCoreImplMetadataEditorSelectComponentHandlerProperties.h
 *
 * 
 */

#ifndef _ComDayCqDamCoreImplMetadataEditorSelectComponentHandlerProperties_H_
#define _ComDayCqDamCoreImplMetadataEditorSelectComponentHandlerProperties_H_


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

class ComDayCqDamCoreImplMetadataEditorSelectComponentHandlerProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	ComDayCqDamCoreImplMetadataEditorSelectComponentHandlerProperties();
	ComDayCqDamCoreImplMetadataEditorSelectComponentHandlerProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ComDayCqDamCoreImplMetadataEditorSelectComponentHandlerProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyArray getGranitedata();

	/*! \brief Set 
	 */
	void setGranitedata(ConfigNodePropertyArray  granitedata);

private:
	ConfigNodePropertyArray granitedata;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ComDayCqDamCoreImplMetadataEditorSelectComponentHandlerProperties_H_ */
