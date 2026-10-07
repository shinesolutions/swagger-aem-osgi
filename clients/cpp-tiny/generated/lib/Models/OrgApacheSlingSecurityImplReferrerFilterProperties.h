
/*
 * OrgApacheSlingSecurityImplReferrerFilterProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_OrgApacheSlingSecurityImplReferrerFilterProperties_H_
#define TINY_CPP_CLIENT_OrgApacheSlingSecurityImplReferrerFilterProperties_H_


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

class OrgApacheSlingSecurityImplReferrerFilterProperties{
public:

    /*! \brief Constructor.
	 */
    OrgApacheSlingSecurityImplReferrerFilterProperties();
    OrgApacheSlingSecurityImplReferrerFilterProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~OrgApacheSlingSecurityImplReferrerFilterProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getAllowempty();

	/*! \brief Set 
	 */
	void setAllowempty(ConfigNodePropertyBoolean allowempty);
	/*! \brief Get 
	 */
	ConfigNodePropertyArray getAllowhosts();

	/*! \brief Set 
	 */
	void setAllowhosts(ConfigNodePropertyArray allowhosts);
	/*! \brief Get 
	 */
	ConfigNodePropertyArray getAllowhostsregexp();

	/*! \brief Set 
	 */
	void setAllowhostsregexp(ConfigNodePropertyArray allowhostsregexp);
	/*! \brief Get 
	 */
	ConfigNodePropertyArray getFiltermethods();

	/*! \brief Set 
	 */
	void setFiltermethods(ConfigNodePropertyArray filtermethods);
	/*! \brief Get 
	 */
	ConfigNodePropertyArray getExcludeagentsregexp();

	/*! \brief Set 
	 */
	void setExcludeagentsregexp(ConfigNodePropertyArray excludeagentsregexp);


    private:
    ConfigNodePropertyBoolean allowempty;
    ConfigNodePropertyArray allowhosts;
    ConfigNodePropertyArray allowhostsregexp;
    ConfigNodePropertyArray filtermethods;
    ConfigNodePropertyArray excludeagentsregexp;
};
}

#endif /* TINY_CPP_CLIENT_OrgApacheSlingSecurityImplReferrerFilterProperties_H_ */
