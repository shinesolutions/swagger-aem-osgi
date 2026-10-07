
/*
 * OrgApacheSlingServletsGetDefaultGetServletProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_OrgApacheSlingServletsGetDefaultGetServletProperties_H_
#define TINY_CPP_CLIENT_OrgApacheSlingServletsGetDefaultGetServletProperties_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ConfigNodePropertyArray.h"
#include "ConfigNodePropertyBoolean.h"
#include "ConfigNodePropertyInteger.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class OrgApacheSlingServletsGetDefaultGetServletProperties{
public:

    /*! \brief Constructor.
	 */
    OrgApacheSlingServletsGetDefaultGetServletProperties();
    OrgApacheSlingServletsGetDefaultGetServletProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~OrgApacheSlingServletsGetDefaultGetServletProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyArray getAliases();

	/*! \brief Set 
	 */
	void setAliases(ConfigNodePropertyArray aliases);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getIndex();

	/*! \brief Set 
	 */
	void setIndex(ConfigNodePropertyBoolean index);
	/*! \brief Get 
	 */
	ConfigNodePropertyArray getIndexfiles();

	/*! \brief Set 
	 */
	void setIndexfiles(ConfigNodePropertyArray indexfiles);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getEnablehtml();

	/*! \brief Set 
	 */
	void setEnablehtml(ConfigNodePropertyBoolean enablehtml);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getEnablejson();

	/*! \brief Set 
	 */
	void setEnablejson(ConfigNodePropertyBoolean enablejson);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getEnabletxt();

	/*! \brief Set 
	 */
	void setEnabletxt(ConfigNodePropertyBoolean enabletxt);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getEnablexml();

	/*! \brief Set 
	 */
	void setEnablexml(ConfigNodePropertyBoolean enablexml);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getJsonmaximumresults();

	/*! \brief Set 
	 */
	void setJsonmaximumresults(ConfigNodePropertyInteger jsonmaximumresults);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getEcmaSuport();

	/*! \brief Set 
	 */
	void setEcmaSuport(ConfigNodePropertyBoolean ecmaSuport);


    private:
    ConfigNodePropertyArray aliases;
    ConfigNodePropertyBoolean index;
    ConfigNodePropertyArray indexfiles;
    ConfigNodePropertyBoolean enablehtml;
    ConfigNodePropertyBoolean enablejson;
    ConfigNodePropertyBoolean enabletxt;
    ConfigNodePropertyBoolean enablexml;
    ConfigNodePropertyInteger jsonmaximumresults;
    ConfigNodePropertyBoolean ecmaSuport;
};
}

#endif /* TINY_CPP_CLIENT_OrgApacheSlingServletsGetDefaultGetServletProperties_H_ */
