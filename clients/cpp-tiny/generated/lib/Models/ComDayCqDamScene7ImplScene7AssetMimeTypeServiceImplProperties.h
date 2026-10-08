
/*
 * ComDayCqDamScene7ImplScene7AssetMimeTypeServiceImplProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ComDayCqDamScene7ImplScene7AssetMimeTypeServiceImplProperties_H_
#define TINY_CPP_CLIENT_ComDayCqDamScene7ImplScene7AssetMimeTypeServiceImplProperties_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ConfigNodePropertyArray.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class ComDayCqDamScene7ImplScene7AssetMimeTypeServiceImplProperties{
public:

    /*! \brief Constructor.
	 */
    ComDayCqDamScene7ImplScene7AssetMimeTypeServiceImplProperties();
    ComDayCqDamScene7ImplScene7AssetMimeTypeServiceImplProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ComDayCqDamScene7ImplScene7AssetMimeTypeServiceImplProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyArray getCqdamscene7assetmimetypeservicemapping();

	/*! \brief Set 
	 */
	void setCqdamscene7assetmimetypeservicemapping(ConfigNodePropertyArray cqdamscene7assetmimetypeservicemapping);


    private:
    ConfigNodePropertyArray cqdamscene7assetmimetypeservicemapping;
};
}

#endif /* TINY_CPP_CLIENT_ComDayCqDamScene7ImplScene7AssetMimeTypeServiceImplProperties_H_ */
