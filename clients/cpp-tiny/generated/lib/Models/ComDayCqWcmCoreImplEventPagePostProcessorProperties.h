
/*
 * ComDayCqWcmCoreImplEventPagePostProcessorProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ComDayCqWcmCoreImplEventPagePostProcessorProperties_H_
#define TINY_CPP_CLIENT_ComDayCqWcmCoreImplEventPagePostProcessorProperties_H_


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

class ComDayCqWcmCoreImplEventPagePostProcessorProperties{
public:

    /*! \brief Constructor.
	 */
    ComDayCqWcmCoreImplEventPagePostProcessorProperties();
    ComDayCqWcmCoreImplEventPagePostProcessorProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ComDayCqWcmCoreImplEventPagePostProcessorProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyArray getPaths();

	/*! \brief Set 
	 */
	void setPaths(ConfigNodePropertyArray paths);


    private:
    ConfigNodePropertyArray paths;
};
}

#endif /* TINY_CPP_CLIENT_ComDayCqWcmCoreImplEventPagePostProcessorProperties_H_ */
