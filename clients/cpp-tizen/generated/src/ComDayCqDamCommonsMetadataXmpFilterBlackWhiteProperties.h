/*
 * ComDayCqDamCommonsMetadataXmpFilterBlackWhiteProperties.h
 *
 * 
 */

#ifndef _ComDayCqDamCommonsMetadataXmpFilterBlackWhiteProperties_H_
#define _ComDayCqDamCommonsMetadataXmpFilterBlackWhiteProperties_H_


#include <string>
#include "ConfigNodePropertyArray.h"
#include "ConfigNodePropertyBoolean.h"
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

class ComDayCqDamCommonsMetadataXmpFilterBlackWhiteProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	ComDayCqDamCommonsMetadataXmpFilterBlackWhiteProperties();
	ComDayCqDamCommonsMetadataXmpFilterBlackWhiteProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ComDayCqDamCommonsMetadataXmpFilterBlackWhiteProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getXmpfilterapplyWhitelist();

	/*! \brief Set 
	 */
	void setXmpfilterapplyWhitelist(ConfigNodePropertyBoolean  xmpfilterapply_whitelist);
	/*! \brief Get 
	 */
	ConfigNodePropertyArray getXmpfilterwhitelist();

	/*! \brief Set 
	 */
	void setXmpfilterwhitelist(ConfigNodePropertyArray  xmpfilterwhitelist);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getXmpfilterapplyBlacklist();

	/*! \brief Set 
	 */
	void setXmpfilterapplyBlacklist(ConfigNodePropertyBoolean  xmpfilterapply_blacklist);
	/*! \brief Get 
	 */
	ConfigNodePropertyArray getXmpfilterblacklist();

	/*! \brief Set 
	 */
	void setXmpfilterblacklist(ConfigNodePropertyArray  xmpfilterblacklist);

private:
	ConfigNodePropertyBoolean xmpfilterapply_whitelist;
	ConfigNodePropertyArray xmpfilterwhitelist;
	ConfigNodePropertyBoolean xmpfilterapply_blacklist;
	ConfigNodePropertyArray xmpfilterblacklist;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ComDayCqDamCommonsMetadataXmpFilterBlackWhiteProperties_H_ */
