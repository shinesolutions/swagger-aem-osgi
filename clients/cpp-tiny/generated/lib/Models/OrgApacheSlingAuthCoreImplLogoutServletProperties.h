
/*
 * OrgApacheSlingAuthCoreImplLogoutServletProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_OrgApacheSlingAuthCoreImplLogoutServletProperties_H_
#define TINY_CPP_CLIENT_OrgApacheSlingAuthCoreImplLogoutServletProperties_H_


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

class OrgApacheSlingAuthCoreImplLogoutServletProperties{
public:

    /*! \brief Constructor.
	 */
    OrgApacheSlingAuthCoreImplLogoutServletProperties();
    OrgApacheSlingAuthCoreImplLogoutServletProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~OrgApacheSlingAuthCoreImplLogoutServletProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyArray getSlingservletmethods();

	/*! \brief Set 
	 */
	void setSlingservletmethods(ConfigNodePropertyArray slingservletmethods);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getSlingservletpaths();

	/*! \brief Set 
	 */
	void setSlingservletpaths(ConfigNodePropertyString slingservletpaths);


    private:
    ConfigNodePropertyArray slingservletmethods;
    ConfigNodePropertyString slingservletpaths;
};
}

#endif /* TINY_CPP_CLIENT_OrgApacheSlingAuthCoreImplLogoutServletProperties_H_ */
