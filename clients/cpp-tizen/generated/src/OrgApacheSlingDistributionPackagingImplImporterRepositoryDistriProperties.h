/*
 * OrgApacheSlingDistributionPackagingImplImporterRepositoryDistriProperties.h
 *
 * 
 */

#ifndef _OrgApacheSlingDistributionPackagingImplImporterRepositoryDistriProperties_H_
#define _OrgApacheSlingDistributionPackagingImplImporterRepositoryDistriProperties_H_


#include <string>
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

class OrgApacheSlingDistributionPackagingImplImporterRepositoryDistriProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	OrgApacheSlingDistributionPackagingImplImporterRepositoryDistriProperties();
	OrgApacheSlingDistributionPackagingImplImporterRepositoryDistriProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~OrgApacheSlingDistributionPackagingImplImporterRepositoryDistriProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyString getName();

	/*! \brief Set 
	 */
	void setName(ConfigNodePropertyString  name);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getServicename();

	/*! \brief Set 
	 */
	void setServicename(ConfigNodePropertyString  servicename);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getPath();

	/*! \brief Set 
	 */
	void setPath(ConfigNodePropertyString  path);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getPrivilegename();

	/*! \brief Set 
	 */
	void setPrivilegename(ConfigNodePropertyString  privilegename);

private:
	ConfigNodePropertyString name;
	ConfigNodePropertyString servicename;
	ConfigNodePropertyString path;
	ConfigNodePropertyString privilegename;
	void __init();
	void __cleanup();

};
}
}

#endif /* _OrgApacheSlingDistributionPackagingImplImporterRepositoryDistriProperties_H_ */
