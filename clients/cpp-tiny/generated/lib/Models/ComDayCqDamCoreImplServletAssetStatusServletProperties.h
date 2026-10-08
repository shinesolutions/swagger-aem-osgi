
/*
 * ComDayCqDamCoreImplServletAssetStatusServletProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ComDayCqDamCoreImplServletAssetStatusServletProperties_H_
#define TINY_CPP_CLIENT_ComDayCqDamCoreImplServletAssetStatusServletProperties_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ConfigNodePropertyInteger.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class ComDayCqDamCoreImplServletAssetStatusServletProperties{
public:

    /*! \brief Constructor.
	 */
    ComDayCqDamCoreImplServletAssetStatusServletProperties();
    ComDayCqDamCoreImplServletAssetStatusServletProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ComDayCqDamCoreImplServletAssetStatusServletProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getCqdambatchstatusmaxassets();

	/*! \brief Set 
	 */
	void setCqdambatchstatusmaxassets(ConfigNodePropertyInteger cqdambatchstatusmaxassets);


    private:
    ConfigNodePropertyInteger cqdambatchstatusmaxassets;
};
}

#endif /* TINY_CPP_CLIENT_ComDayCqDamCoreImplServletAssetStatusServletProperties_H_ */
