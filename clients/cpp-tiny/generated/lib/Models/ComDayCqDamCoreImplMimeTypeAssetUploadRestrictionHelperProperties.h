
/*
 * ComDayCqDamCoreImplMimeTypeAssetUploadRestrictionHelperProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ComDayCqDamCoreImplMimeTypeAssetUploadRestrictionHelperProperties_H_
#define TINY_CPP_CLIENT_ComDayCqDamCoreImplMimeTypeAssetUploadRestrictionHelperProperties_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ConfigNodePropertyArray.h"
#include "ConfigNodePropertyBoolean.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class ComDayCqDamCoreImplMimeTypeAssetUploadRestrictionHelperProperties{
public:

    /*! \brief Constructor.
	 */
    ComDayCqDamCoreImplMimeTypeAssetUploadRestrictionHelperProperties();
    ComDayCqDamCoreImplMimeTypeAssetUploadRestrictionHelperProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ComDayCqDamCoreImplMimeTypeAssetUploadRestrictionHelperProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getCqdamallowallmime();

	/*! \brief Set 
	 */
	void setCqdamallowallmime(ConfigNodePropertyBoolean cqdamallowallmime);
	/*! \brief Get 
	 */
	ConfigNodePropertyArray getCqdamallowedassetmimes();

	/*! \brief Set 
	 */
	void setCqdamallowedassetmimes(ConfigNodePropertyArray cqdamallowedassetmimes);


    private:
    ConfigNodePropertyBoolean cqdamallowallmime;
    ConfigNodePropertyArray cqdamallowedassetmimes;
};
}

#endif /* TINY_CPP_CLIENT_ComDayCqDamCoreImplMimeTypeAssetUploadRestrictionHelperProperties_H_ */
