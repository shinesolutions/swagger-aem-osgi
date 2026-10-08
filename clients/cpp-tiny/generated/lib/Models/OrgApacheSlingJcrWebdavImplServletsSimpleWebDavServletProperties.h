
/*
 * OrgApacheSlingJcrWebdavImplServletsSimpleWebDavServletProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_OrgApacheSlingJcrWebdavImplServletsSimpleWebDavServletProperties_H_
#define TINY_CPP_CLIENT_OrgApacheSlingJcrWebdavImplServletsSimpleWebDavServletProperties_H_


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

class OrgApacheSlingJcrWebdavImplServletsSimpleWebDavServletProperties{
public:

    /*! \brief Constructor.
	 */
    OrgApacheSlingJcrWebdavImplServletsSimpleWebDavServletProperties();
    OrgApacheSlingJcrWebdavImplServletsSimpleWebDavServletProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~OrgApacheSlingJcrWebdavImplServletsSimpleWebDavServletProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyString getDavroot();

	/*! \brief Set 
	 */
	void setDavroot(ConfigNodePropertyString davroot);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getDavcreateabsoluteuri();

	/*! \brief Set 
	 */
	void setDavcreateabsoluteuri(ConfigNodePropertyBoolean davcreateabsoluteuri);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getDavrealm();

	/*! \brief Set 
	 */
	void setDavrealm(ConfigNodePropertyString davrealm);
	/*! \brief Get 
	 */
	ConfigNodePropertyArray getCollectiontypes();

	/*! \brief Set 
	 */
	void setCollectiontypes(ConfigNodePropertyArray collectiontypes);
	/*! \brief Get 
	 */
	ConfigNodePropertyArray getFilterprefixes();

	/*! \brief Set 
	 */
	void setFilterprefixes(ConfigNodePropertyArray filterprefixes);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getFiltertypes();

	/*! \brief Set 
	 */
	void setFiltertypes(ConfigNodePropertyString filtertypes);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getFilteruris();

	/*! \brief Set 
	 */
	void setFilteruris(ConfigNodePropertyString filteruris);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getTypecollections();

	/*! \brief Set 
	 */
	void setTypecollections(ConfigNodePropertyString typecollections);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getTypenoncollections();

	/*! \brief Set 
	 */
	void setTypenoncollections(ConfigNodePropertyString typenoncollections);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getTypecontent();

	/*! \brief Set 
	 */
	void setTypecontent(ConfigNodePropertyString typecontent);


    private:
    ConfigNodePropertyString davroot;
    ConfigNodePropertyBoolean davcreateabsoluteuri;
    ConfigNodePropertyString davrealm;
    ConfigNodePropertyArray collectiontypes;
    ConfigNodePropertyArray filterprefixes;
    ConfigNodePropertyString filtertypes;
    ConfigNodePropertyString filteruris;
    ConfigNodePropertyString typecollections;
    ConfigNodePropertyString typenoncollections;
    ConfigNodePropertyString typecontent;
};
}

#endif /* TINY_CPP_CLIENT_OrgApacheSlingJcrWebdavImplServletsSimpleWebDavServletProperties_H_ */
