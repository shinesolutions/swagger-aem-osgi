
/*
 * ComDayCqWcmCoreImplServletsFindReplaceServletProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ComDayCqWcmCoreImplServletsFindReplaceServletProperties_H_
#define TINY_CPP_CLIENT_ComDayCqWcmCoreImplServletsFindReplaceServletProperties_H_


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

class ComDayCqWcmCoreImplServletsFindReplaceServletProperties{
public:

    /*! \brief Constructor.
	 */
    ComDayCqWcmCoreImplServletsFindReplaceServletProperties();
    ComDayCqWcmCoreImplServletsFindReplaceServletProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ComDayCqWcmCoreImplServletsFindReplaceServletProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyArray getScope();

	/*! \brief Set 
	 */
	void setScope(ConfigNodePropertyArray scope);


    private:
    ConfigNodePropertyArray scope;
};
}

#endif /* TINY_CPP_CLIENT_ComDayCqWcmCoreImplServletsFindReplaceServletProperties_H_ */
