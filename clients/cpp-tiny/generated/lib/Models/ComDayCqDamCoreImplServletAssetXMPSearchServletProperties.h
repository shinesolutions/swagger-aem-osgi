
/*
 * ComDayCqDamCoreImplServletAssetXMPSearchServletProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ComDayCqDamCoreImplServletAssetXMPSearchServletProperties_H_
#define TINY_CPP_CLIENT_ComDayCqDamCoreImplServletAssetXMPSearchServletProperties_H_


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

class ComDayCqDamCoreImplServletAssetXMPSearchServletProperties{
public:

    /*! \brief Constructor.
	 */
    ComDayCqDamCoreImplServletAssetXMPSearchServletProperties();
    ComDayCqDamCoreImplServletAssetXMPSearchServletProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ComDayCqDamCoreImplServletAssetXMPSearchServletProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getCqdambatchindesignmaxassets();

	/*! \brief Set 
	 */
	void setCqdambatchindesignmaxassets(ConfigNodePropertyInteger cqdambatchindesignmaxassets);


    private:
    ConfigNodePropertyInteger cqdambatchindesignmaxassets;
};
}

#endif /* TINY_CPP_CLIENT_ComDayCqDamCoreImplServletAssetXMPSearchServletProperties_H_ */
