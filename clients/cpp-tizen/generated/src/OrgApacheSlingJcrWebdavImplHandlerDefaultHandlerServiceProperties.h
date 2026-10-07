/*
 * OrgApacheSlingJcrWebdavImplHandlerDefaultHandlerServiceProperties.h
 *
 * 
 */

#ifndef _OrgApacheSlingJcrWebdavImplHandlerDefaultHandlerServiceProperties_H_
#define _OrgApacheSlingJcrWebdavImplHandlerDefaultHandlerServiceProperties_H_


#include <string>
#include "ConfigNodePropertyInteger.h"
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

class OrgApacheSlingJcrWebdavImplHandlerDefaultHandlerServiceProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	OrgApacheSlingJcrWebdavImplHandlerDefaultHandlerServiceProperties();
	OrgApacheSlingJcrWebdavImplHandlerDefaultHandlerServiceProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~OrgApacheSlingJcrWebdavImplHandlerDefaultHandlerServiceProperties();

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
	ConfigNodePropertyInteger serviceranking;
	ConfigNodePropertyString typecollections;
	ConfigNodePropertyString typenoncollections;
	ConfigNodePropertyString typecontent;
	void __init();
	void __cleanup();

};
}
}

#endif /* _OrgApacheSlingJcrWebdavImplHandlerDefaultHandlerServiceProperties_H_ */
