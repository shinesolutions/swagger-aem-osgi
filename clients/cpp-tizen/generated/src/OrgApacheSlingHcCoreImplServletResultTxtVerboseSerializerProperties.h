/*
 * OrgApacheSlingHcCoreImplServletResultTxtVerboseSerializerProperties.h
 *
 * 
 */

#ifndef _OrgApacheSlingHcCoreImplServletResultTxtVerboseSerializerProperties_H_
#define _OrgApacheSlingHcCoreImplServletResultTxtVerboseSerializerProperties_H_


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

class OrgApacheSlingHcCoreImplServletResultTxtVerboseSerializerProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	OrgApacheSlingHcCoreImplServletResultTxtVerboseSerializerProperties();
	OrgApacheSlingHcCoreImplServletResultTxtVerboseSerializerProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~OrgApacheSlingHcCoreImplServletResultTxtVerboseSerializerProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getTotalWidth();

	/*! \brief Set 
	 */
	void setTotalWidth(ConfigNodePropertyInteger  totalWidth);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getColWidthName();

	/*! \brief Set 
	 */
	void setColWidthName(ConfigNodePropertyInteger  colWidthName);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getColWidthResult();

	/*! \brief Set 
	 */
	void setColWidthResult(ConfigNodePropertyInteger  colWidthResult);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getColWidthTiming();

	/*! \brief Set 
	 */
	void setColWidthTiming(ConfigNodePropertyInteger  colWidthTiming);

private:
	ConfigNodePropertyInteger totalWidth;
	ConfigNodePropertyInteger colWidthName;
	ConfigNodePropertyInteger colWidthResult;
	ConfigNodePropertyInteger colWidthTiming;
	void __init();
	void __cleanup();

};
}
}

#endif /* _OrgApacheSlingHcCoreImplServletResultTxtVerboseSerializerProperties_H_ */
