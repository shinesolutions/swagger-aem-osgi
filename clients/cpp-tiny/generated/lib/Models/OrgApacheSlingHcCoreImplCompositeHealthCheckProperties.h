
/*
 * OrgApacheSlingHcCoreImplCompositeHealthCheckProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_OrgApacheSlingHcCoreImplCompositeHealthCheckProperties_H_
#define TINY_CPP_CLIENT_OrgApacheSlingHcCoreImplCompositeHealthCheckProperties_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ConfigNodePropertyArray.h"
#include "ConfigNodePropertyBoolean.h"
#include "ConfigNodePropertyString.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class OrgApacheSlingHcCoreImplCompositeHealthCheckProperties{
public:

    /*! \brief Constructor.
	 */
    OrgApacheSlingHcCoreImplCompositeHealthCheckProperties();
    OrgApacheSlingHcCoreImplCompositeHealthCheckProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~OrgApacheSlingHcCoreImplCompositeHealthCheckProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyString getHcname();

	/*! \brief Set 
	 */
	void setHcname(ConfigNodePropertyString hcname);
	/*! \brief Get 
	 */
	ConfigNodePropertyArray getHctags();

	/*! \brief Set 
	 */
	void setHctags(ConfigNodePropertyArray hctags);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getHcmbeanname();

	/*! \brief Set 
	 */
	void setHcmbeanname(ConfigNodePropertyString hcmbeanname);
	/*! \brief Get 
	 */
	ConfigNodePropertyArray getFiltertags();

	/*! \brief Set 
	 */
	void setFiltertags(ConfigNodePropertyArray filtertags);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getFiltercombineTagsWithOr();

	/*! \brief Set 
	 */
	void setFiltercombineTagsWithOr(ConfigNodePropertyBoolean filtercombineTagsWithOr);


    private:
    ConfigNodePropertyString hcname;
    ConfigNodePropertyArray hctags;
    ConfigNodePropertyString hcmbeanname;
    ConfigNodePropertyArray filtertags;
    ConfigNodePropertyBoolean filtercombineTagsWithOr;
};
}

#endif /* TINY_CPP_CLIENT_OrgApacheSlingHcCoreImplCompositeHealthCheckProperties_H_ */
