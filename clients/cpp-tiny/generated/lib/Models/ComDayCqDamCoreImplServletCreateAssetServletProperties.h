
/*
 * ComDayCqDamCoreImplServletCreateAssetServletProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ComDayCqDamCoreImplServletCreateAssetServletProperties_H_
#define TINY_CPP_CLIENT_ComDayCqDamCoreImplServletCreateAssetServletProperties_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ConfigNodePropertyBoolean.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class ComDayCqDamCoreImplServletCreateAssetServletProperties{
public:

    /*! \brief Constructor.
	 */
    ComDayCqDamCoreImplServletCreateAssetServletProperties();
    ComDayCqDamCoreImplServletCreateAssetServletProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ComDayCqDamCoreImplServletCreateAssetServletProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getDetectDuplicate();

	/*! \brief Set 
	 */
	void setDetectDuplicate(ConfigNodePropertyBoolean detect_duplicate);


    private:
    ConfigNodePropertyBoolean detect_duplicate;
};
}

#endif /* TINY_CPP_CLIENT_ComDayCqDamCoreImplServletCreateAssetServletProperties_H_ */
