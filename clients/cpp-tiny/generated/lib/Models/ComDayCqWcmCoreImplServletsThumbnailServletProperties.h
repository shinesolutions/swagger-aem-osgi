
/*
 * ComDayCqWcmCoreImplServletsThumbnailServletProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ComDayCqWcmCoreImplServletsThumbnailServletProperties_H_
#define TINY_CPP_CLIENT_ComDayCqWcmCoreImplServletsThumbnailServletProperties_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ConfigNodePropertyArray.h"
#include "ConfigNodePropertyString.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class ComDayCqWcmCoreImplServletsThumbnailServletProperties{
public:

    /*! \brief Constructor.
	 */
    ComDayCqWcmCoreImplServletsThumbnailServletProperties();
    ComDayCqWcmCoreImplServletsThumbnailServletProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ComDayCqWcmCoreImplServletsThumbnailServletProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyString getWorkspace();

	/*! \brief Set 
	 */
	void setWorkspace(ConfigNodePropertyString workspace);
	/*! \brief Get 
	 */
	ConfigNodePropertyArray getDimensions();

	/*! \brief Set 
	 */
	void setDimensions(ConfigNodePropertyArray dimensions);


    private:
    ConfigNodePropertyString workspace;
    ConfigNodePropertyArray dimensions;
};
}

#endif /* TINY_CPP_CLIENT_ComDayCqWcmCoreImplServletsThumbnailServletProperties_H_ */
