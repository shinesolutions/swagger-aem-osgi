/*
 * ComAdobeCqSocialHandlebarsGuavaTemplateCacheImplProperties.h
 *
 * 
 */

#ifndef _ComAdobeCqSocialHandlebarsGuavaTemplateCacheImplProperties_H_
#define _ComAdobeCqSocialHandlebarsGuavaTemplateCacheImplProperties_H_


#include <string>
#include "ConfigNodePropertyBoolean.h"
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

class ComAdobeCqSocialHandlebarsGuavaTemplateCacheImplProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	ComAdobeCqSocialHandlebarsGuavaTemplateCacheImplProperties();
	ComAdobeCqSocialHandlebarsGuavaTemplateCacheImplProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ComAdobeCqSocialHandlebarsGuavaTemplateCacheImplProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getParameterguavacacheenabled();

	/*! \brief Set 
	 */
	void setParameterguavacacheenabled(ConfigNodePropertyBoolean  parameterguavacacheenabled);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getParameterguavacacheparams();

	/*! \brief Set 
	 */
	void setParameterguavacacheparams(ConfigNodePropertyString  parameterguavacacheparams);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getParameterguavacachereload();

	/*! \brief Set 
	 */
	void setParameterguavacachereload(ConfigNodePropertyBoolean  parameterguavacachereload);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getServiceranking();

	/*! \brief Set 
	 */
	void setServiceranking(ConfigNodePropertyInteger  serviceranking);

private:
	ConfigNodePropertyBoolean parameterguavacacheenabled;
	ConfigNodePropertyString parameterguavacacheparams;
	ConfigNodePropertyBoolean parameterguavacachereload;
	ConfigNodePropertyInteger serviceranking;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ComAdobeCqSocialHandlebarsGuavaTemplateCacheImplProperties_H_ */
