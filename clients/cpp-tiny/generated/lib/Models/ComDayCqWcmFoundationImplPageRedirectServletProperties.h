
/*
 * ComDayCqWcmFoundationImplPageRedirectServletProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ComDayCqWcmFoundationImplPageRedirectServletProperties_H_
#define TINY_CPP_CLIENT_ComDayCqWcmFoundationImplPageRedirectServletProperties_H_


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

class ComDayCqWcmFoundationImplPageRedirectServletProperties{
public:

    /*! \brief Constructor.
	 */
    ComDayCqWcmFoundationImplPageRedirectServletProperties();
    ComDayCqWcmFoundationImplPageRedirectServletProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ComDayCqWcmFoundationImplPageRedirectServletProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyArray getExcludedresourcetypes();

	/*! \brief Set 
	 */
	void setExcludedresourcetypes(ConfigNodePropertyArray excludedresourcetypes);


    private:
    ConfigNodePropertyArray excludedresourcetypes;
};
}

#endif /* TINY_CPP_CLIENT_ComDayCqWcmFoundationImplPageRedirectServletProperties_H_ */
