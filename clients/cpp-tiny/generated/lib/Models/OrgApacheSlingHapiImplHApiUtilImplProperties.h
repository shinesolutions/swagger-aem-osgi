
/*
 * OrgApacheSlingHapiImplHApiUtilImplProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_OrgApacheSlingHapiImplHApiUtilImplProperties_H_
#define TINY_CPP_CLIENT_OrgApacheSlingHapiImplHApiUtilImplProperties_H_


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

class OrgApacheSlingHapiImplHApiUtilImplProperties{
public:

    /*! \brief Constructor.
	 */
    OrgApacheSlingHapiImplHApiUtilImplProperties();
    OrgApacheSlingHapiImplHApiUtilImplProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~OrgApacheSlingHapiImplHApiUtilImplProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyString getOrgapacheslinghapitoolsresourcetype();

	/*! \brief Set 
	 */
	void setOrgapacheslinghapitoolsresourcetype(ConfigNodePropertyString orgapacheslinghapitoolsresourcetype);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getOrgapacheslinghapitoolscollectionresourcetype();

	/*! \brief Set 
	 */
	void setOrgapacheslinghapitoolscollectionresourcetype(ConfigNodePropertyString orgapacheslinghapitoolscollectionresourcetype);
	/*! \brief Get 
	 */
	ConfigNodePropertyArray getOrgapacheslinghapitoolssearchpaths();

	/*! \brief Set 
	 */
	void setOrgapacheslinghapitoolssearchpaths(ConfigNodePropertyArray orgapacheslinghapitoolssearchpaths);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getOrgapacheslinghapitoolsexternalurl();

	/*! \brief Set 
	 */
	void setOrgapacheslinghapitoolsexternalurl(ConfigNodePropertyString orgapacheslinghapitoolsexternalurl);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getOrgapacheslinghapitoolsenabled();

	/*! \brief Set 
	 */
	void setOrgapacheslinghapitoolsenabled(ConfigNodePropertyBoolean orgapacheslinghapitoolsenabled);


    private:
    ConfigNodePropertyString orgapacheslinghapitoolsresourcetype;
    ConfigNodePropertyString orgapacheslinghapitoolscollectionresourcetype;
    ConfigNodePropertyArray orgapacheslinghapitoolssearchpaths;
    ConfigNodePropertyString orgapacheslinghapitoolsexternalurl;
    ConfigNodePropertyBoolean orgapacheslinghapitoolsenabled;
};
}

#endif /* TINY_CPP_CLIENT_OrgApacheSlingHapiImplHApiUtilImplProperties_H_ */
