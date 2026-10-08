
/*
 * ComDayCqRewriterProcessorImplHtmlParserFactoryProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ComDayCqRewriterProcessorImplHtmlParserFactoryProperties_H_
#define TINY_CPP_CLIENT_ComDayCqRewriterProcessorImplHtmlParserFactoryProperties_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ConfigNodePropertyArray.h"
#include "ConfigNodePropertyBoolean.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class ComDayCqRewriterProcessorImplHtmlParserFactoryProperties{
public:

    /*! \brief Constructor.
	 */
    ComDayCqRewriterProcessorImplHtmlParserFactoryProperties();
    ComDayCqRewriterProcessorImplHtmlParserFactoryProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ComDayCqRewriterProcessorImplHtmlParserFactoryProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyArray getHtmlparserprocessTags();

	/*! \brief Set 
	 */
	void setHtmlparserprocessTags(ConfigNodePropertyArray htmlparserprocessTags);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getHtmlparserpreserveCamelCase();

	/*! \brief Set 
	 */
	void setHtmlparserpreserveCamelCase(ConfigNodePropertyBoolean htmlparserpreserveCamelCase);


    private:
    ConfigNodePropertyArray htmlparserprocessTags;
    ConfigNodePropertyBoolean htmlparserpreserveCamelCase;
};
}

#endif /* TINY_CPP_CLIENT_ComDayCqRewriterProcessorImplHtmlParserFactoryProperties_H_ */
