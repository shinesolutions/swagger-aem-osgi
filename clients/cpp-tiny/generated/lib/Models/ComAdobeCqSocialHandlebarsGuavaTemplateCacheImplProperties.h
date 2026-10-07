
/*
 * ComAdobeCqSocialHandlebarsGuavaTemplateCacheImplProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ComAdobeCqSocialHandlebarsGuavaTemplateCacheImplProperties_H_
#define TINY_CPP_CLIENT_ComAdobeCqSocialHandlebarsGuavaTemplateCacheImplProperties_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ConfigNodePropertyBoolean.h"
#include "ConfigNodePropertyInteger.h"
#include "ConfigNodePropertyString.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class ComAdobeCqSocialHandlebarsGuavaTemplateCacheImplProperties{
public:

    /*! \brief Constructor.
	 */
    ComAdobeCqSocialHandlebarsGuavaTemplateCacheImplProperties();
    ComAdobeCqSocialHandlebarsGuavaTemplateCacheImplProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ComAdobeCqSocialHandlebarsGuavaTemplateCacheImplProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getParameterguavacacheenabled();

	/*! \brief Set 
	 */
	void setParameterguavacacheenabled(ConfigNodePropertyBoolean parameterguavacacheenabled);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getParameterguavacacheparams();

	/*! \brief Set 
	 */
	void setParameterguavacacheparams(ConfigNodePropertyString parameterguavacacheparams);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getParameterguavacachereload();

	/*! \brief Set 
	 */
	void setParameterguavacachereload(ConfigNodePropertyBoolean parameterguavacachereload);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getServiceranking();

	/*! \brief Set 
	 */
	void setServiceranking(ConfigNodePropertyInteger serviceranking);


    private:
    ConfigNodePropertyBoolean parameterguavacacheenabled;
    ConfigNodePropertyString parameterguavacacheparams;
    ConfigNodePropertyBoolean parameterguavacachereload;
    ConfigNodePropertyInteger serviceranking;
};
}

#endif /* TINY_CPP_CLIENT_ComAdobeCqSocialHandlebarsGuavaTemplateCacheImplProperties_H_ */
