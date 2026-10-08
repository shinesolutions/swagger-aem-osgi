
/*
 * OrgApacheSlingSecurityImplContentDispositionFilterProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_OrgApacheSlingSecurityImplContentDispositionFilterProperties_H_
#define TINY_CPP_CLIENT_OrgApacheSlingSecurityImplContentDispositionFilterProperties_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ConfigNodePropertyArray.h"
#include "ConfigNodePropertyBoolean.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class OrgApacheSlingSecurityImplContentDispositionFilterProperties{
public:

    /*! \brief Constructor.
	 */
    OrgApacheSlingSecurityImplContentDispositionFilterProperties();
    OrgApacheSlingSecurityImplContentDispositionFilterProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~OrgApacheSlingSecurityImplContentDispositionFilterProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyArray getSlingcontentdispositionpaths();

	/*! \brief Set 
	 */
	void setSlingcontentdispositionpaths(ConfigNodePropertyArray slingcontentdispositionpaths);
	/*! \brief Get 
	 */
	ConfigNodePropertyArray getSlingcontentdispositionexcludedpaths();

	/*! \brief Set 
	 */
	void setSlingcontentdispositionexcludedpaths(ConfigNodePropertyArray slingcontentdispositionexcludedpaths);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getSlingcontentdispositionallpaths();

	/*! \brief Set 
	 */
	void setSlingcontentdispositionallpaths(ConfigNodePropertyBoolean slingcontentdispositionallpaths);


    private:
    ConfigNodePropertyArray slingcontentdispositionpaths;
    ConfigNodePropertyArray slingcontentdispositionexcludedpaths;
    ConfigNodePropertyBoolean slingcontentdispositionallpaths;
};
}

#endif /* TINY_CPP_CLIENT_OrgApacheSlingSecurityImplContentDispositionFilterProperties_H_ */
