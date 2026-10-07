/*
 * OrgApacheSlingJcrWebdavImplHandlerDirListingExportHandlerServicProperties.h
 *
 * 
 */

#ifndef _OrgApacheSlingJcrWebdavImplHandlerDirListingExportHandlerServicProperties_H_
#define _OrgApacheSlingJcrWebdavImplHandlerDirListingExportHandlerServicProperties_H_


#include <string>
#include "ConfigNodePropertyInteger.h"
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

class OrgApacheSlingJcrWebdavImplHandlerDirListingExportHandlerServicProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	OrgApacheSlingJcrWebdavImplHandlerDirListingExportHandlerServicProperties();
	OrgApacheSlingJcrWebdavImplHandlerDirListingExportHandlerServicProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~OrgApacheSlingJcrWebdavImplHandlerDirListingExportHandlerServicProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getServiceranking();

	/*! \brief Set 
	 */
	void setServiceranking(ConfigNodePropertyInteger  serviceranking);

private:
	ConfigNodePropertyInteger serviceranking;
	void __init();
	void __cleanup();

};
}
}

#endif /* _OrgApacheSlingJcrWebdavImplHandlerDirListingExportHandlerServicProperties_H_ */
