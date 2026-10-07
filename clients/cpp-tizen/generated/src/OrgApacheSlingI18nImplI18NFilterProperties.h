/*
 * OrgApacheSlingI18nImplI18NFilterProperties.h
 *
 * 
 */

#ifndef _OrgApacheSlingI18nImplI18NFilterProperties_H_
#define _OrgApacheSlingI18nImplI18NFilterProperties_H_


#include <string>
#include "ConfigNodePropertyArray.h"
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

class OrgApacheSlingI18nImplI18NFilterProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	OrgApacheSlingI18nImplI18NFilterProperties();
	OrgApacheSlingI18nImplI18NFilterProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~OrgApacheSlingI18nImplI18NFilterProperties();

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
	ConfigNodePropertyArray getSlingfilterscope();

	/*! \brief Set 
	 */
	void setSlingfilterscope(ConfigNodePropertyArray  slingfilterscope);

private:
	ConfigNodePropertyInteger serviceranking;
	ConfigNodePropertyArray slingfilterscope;
	void __init();
	void __cleanup();

};
}
}

#endif /* _OrgApacheSlingI18nImplI18NFilterProperties_H_ */
