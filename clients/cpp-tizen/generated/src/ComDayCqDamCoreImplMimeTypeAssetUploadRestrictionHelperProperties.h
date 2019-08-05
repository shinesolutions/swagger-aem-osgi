/*
 * ComDayCqDamCoreImplMimeTypeAssetUploadRestrictionHelperProperties.h
 *
 * 
 */

#ifndef _ComDayCqDamCoreImplMimeTypeAssetUploadRestrictionHelperProperties_H_
#define _ComDayCqDamCoreImplMimeTypeAssetUploadRestrictionHelperProperties_H_


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

class ComDayCqDamCoreImplMimeTypeAssetUploadRestrictionHelperProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	ComDayCqDamCoreImplMimeTypeAssetUploadRestrictionHelperProperties();
	ComDayCqDamCoreImplMimeTypeAssetUploadRestrictionHelperProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ComDayCqDamCoreImplMimeTypeAssetUploadRestrictionHelperProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getCqdamallowallmime();

	/*! \brief Set 
	 */
	void setCqdamallowallmime(ConfigNodePropertyBoolean  cqdamallowallmime);
	/*! \brief Get 
	 */
	ConfigNodePropertyArray getCqdamallowedassetmimes();

	/*! \brief Set 
	 */
	void setCqdamallowedassetmimes(ConfigNodePropertyArray  cqdamallowedassetmimes);

private:
	ConfigNodePropertyBoolean cqdamallowallmime;
	ConfigNodePropertyArray cqdamallowedassetmimes;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ComDayCqDamCoreImplMimeTypeAssetUploadRestrictionHelperProperties_H_ */
