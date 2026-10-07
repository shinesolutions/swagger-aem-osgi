/*
 * ComDayCqRewriterProcessorImplHtmlParserFactoryProperties.h
 *
 * 
 */

#ifndef _ComDayCqRewriterProcessorImplHtmlParserFactoryProperties_H_
#define _ComDayCqRewriterProcessorImplHtmlParserFactoryProperties_H_


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

class ComDayCqRewriterProcessorImplHtmlParserFactoryProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	ComDayCqRewriterProcessorImplHtmlParserFactoryProperties();
	ComDayCqRewriterProcessorImplHtmlParserFactoryProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ComDayCqRewriterProcessorImplHtmlParserFactoryProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyArray getHtmlparserprocessTags();

	/*! \brief Set 
	 */
	void setHtmlparserprocessTags(ConfigNodePropertyArray  htmlparserprocessTags);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getHtmlparserpreserveCamelCase();

	/*! \brief Set 
	 */
	void setHtmlparserpreserveCamelCase(ConfigNodePropertyBoolean  htmlparserpreserveCamelCase);

private:
	ConfigNodePropertyArray htmlparserprocessTags;
	ConfigNodePropertyBoolean htmlparserpreserveCamelCase;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ComDayCqRewriterProcessorImplHtmlParserFactoryProperties_H_ */
