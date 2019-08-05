/*
 * ComDayCqDamScene7ImplScene7AssetMimeTypeServiceImplProperties.h
 *
 * 
 */

#ifndef _ComDayCqDamScene7ImplScene7AssetMimeTypeServiceImplProperties_H_
#define _ComDayCqDamScene7ImplScene7AssetMimeTypeServiceImplProperties_H_


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

class ComDayCqDamScene7ImplScene7AssetMimeTypeServiceImplProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	ComDayCqDamScene7ImplScene7AssetMimeTypeServiceImplProperties();
	ComDayCqDamScene7ImplScene7AssetMimeTypeServiceImplProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ComDayCqDamScene7ImplScene7AssetMimeTypeServiceImplProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyArray getCqdamscene7assetmimetypeservicemapping();

	/*! \brief Set 
	 */
	void setCqdamscene7assetmimetypeservicemapping(ConfigNodePropertyArray  cqdamscene7assetmimetypeservicemapping);

private:
	ConfigNodePropertyArray cqdamscene7assetmimetypeservicemapping;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ComDayCqDamScene7ImplScene7AssetMimeTypeServiceImplProperties_H_ */
