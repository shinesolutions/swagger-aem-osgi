/*
 * OrgApacheSlingCommonsHtmlInternalTagsoupHtmlParserProperties.h
 *
 * 
 */

#ifndef _OrgApacheSlingCommonsHtmlInternalTagsoupHtmlParserProperties_H_
#define _OrgApacheSlingCommonsHtmlInternalTagsoupHtmlParserProperties_H_


#include <string>
#include "ConfigNodePropertyArray.h"
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

class OrgApacheSlingCommonsHtmlInternalTagsoupHtmlParserProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	OrgApacheSlingCommonsHtmlInternalTagsoupHtmlParserProperties();
	OrgApacheSlingCommonsHtmlInternalTagsoupHtmlParserProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~OrgApacheSlingCommonsHtmlInternalTagsoupHtmlParserProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyArray getParserfeatures();

	/*! \brief Set 
	 */
	void setParserfeatures(ConfigNodePropertyArray  parserfeatures);

private:
	ConfigNodePropertyArray parserfeatures;
	void __init();
	void __cleanup();

};
}
}

#endif /* _OrgApacheSlingCommonsHtmlInternalTagsoupHtmlParserProperties_H_ */
