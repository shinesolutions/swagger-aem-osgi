/*
 * ComAdobeGraniteAnalyzerScriptsCompileAllScriptsCompilerServletProperties.h
 *
 * 
 */

#ifndef _ComAdobeGraniteAnalyzerScriptsCompileAllScriptsCompilerServletProperties_H_
#define _ComAdobeGraniteAnalyzerScriptsCompileAllScriptsCompilerServletProperties_H_


#include <string>
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

class ComAdobeGraniteAnalyzerScriptsCompileAllScriptsCompilerServletProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	ComAdobeGraniteAnalyzerScriptsCompileAllScriptsCompilerServletProperties();
	ComAdobeGraniteAnalyzerScriptsCompileAllScriptsCompilerServletProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ComAdobeGraniteAnalyzerScriptsCompileAllScriptsCompilerServletProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getDisabled();

	/*! \brief Set 
	 */
	void setDisabled(ConfigNodePropertyBoolean  disabled);

private:
	ConfigNodePropertyBoolean disabled;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ComAdobeGraniteAnalyzerScriptsCompileAllScriptsCompilerServletProperties_H_ */
