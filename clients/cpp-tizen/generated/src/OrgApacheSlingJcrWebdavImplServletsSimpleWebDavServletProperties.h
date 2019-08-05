/*
 * OrgApacheSlingJcrWebdavImplServletsSimpleWebDavServletProperties.h
 *
 * 
 */

#ifndef _OrgApacheSlingJcrWebdavImplServletsSimpleWebDavServletProperties_H_
#define _OrgApacheSlingJcrWebdavImplServletsSimpleWebDavServletProperties_H_


#include <string>
#include "ConfigNodePropertyArray.h"
#include "ConfigNodePropertyBoolean.h"
#include "ConfigNodePropertyString.h"
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class OrgApacheSlingJcrWebdavImplServletsSimpleWebDavServletProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	OrgApacheSlingJcrWebdavImplServletsSimpleWebDavServletProperties();
	OrgApacheSlingJcrWebdavImplServletsSimpleWebDavServletProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~OrgApacheSlingJcrWebdavImplServletsSimpleWebDavServletProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyString getDavroot();

	/*! \brief Set 
	 */
	void setDavroot(ConfigNodePropertyString  davroot);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getDavcreateabsoluteuri();

	/*! \brief Set 
	 */
	void setDavcreateabsoluteuri(ConfigNodePropertyBoolean  davcreateabsoluteuri);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getDavrealm();

	/*! \brief Set 
	 */
	void setDavrealm(ConfigNodePropertyString  davrealm);
	/*! \brief Get 
	 */
	ConfigNodePropertyArray getCollectiontypes();

	/*! \brief Set 
	 */
	void setCollectiontypes(ConfigNodePropertyArray  collectiontypes);
	/*! \brief Get 
	 */
	ConfigNodePropertyArray getFilterprefixes();

	/*! \brief Set 
	 */
	void setFilterprefixes(ConfigNodePropertyArray  filterprefixes);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getFiltertypes();

	/*! \brief Set 
	 */
	void setFiltertypes(ConfigNodePropertyString  filtertypes);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getFilteruris();

	/*! \brief Set 
	 */
	void setFilteruris(ConfigNodePropertyString  filteruris);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getTypecollections();

	/*! \brief Set 
	 */
	void setTypecollections(ConfigNodePropertyString  typecollections);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getTypenoncollections();

	/*! \brief Set 
	 */
	void setTypenoncollections(ConfigNodePropertyString  typenoncollections);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getTypecontent();

	/*! \brief Set 
	 */
	void setTypecontent(ConfigNodePropertyString  typecontent);

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
	void __init();
	void __cleanup();

};
}
}

#endif /* _OrgApacheSlingJcrWebdavImplServletsSimpleWebDavServletProperties_H_ */
