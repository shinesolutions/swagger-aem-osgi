
/*
 * ComDayCqWcmCoreImplEventTemplatePostProcessorProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ComDayCqWcmCoreImplEventTemplatePostProcessorProperties_H_
#define TINY_CPP_CLIENT_ComDayCqWcmCoreImplEventTemplatePostProcessorProperties_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ConfigNodePropertyString.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class ComDayCqWcmCoreImplEventTemplatePostProcessorProperties{
public:

    /*! \brief Constructor.
	 */
    ComDayCqWcmCoreImplEventTemplatePostProcessorProperties();
    ComDayCqWcmCoreImplEventTemplatePostProcessorProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ComDayCqWcmCoreImplEventTemplatePostProcessorProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyString getPaths();

	/*! \brief Set 
	 */
	void setPaths(ConfigNodePropertyString paths);


    private:
    ConfigNodePropertyString paths;
};
}

#endif /* TINY_CPP_CLIENT_ComDayCqWcmCoreImplEventTemplatePostProcessorProperties_H_ */
