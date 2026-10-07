
/*
 * ComAdobeCqSocialGroupClientImplCommunityGroupCollectionComponenProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ComAdobeCqSocialGroupClientImplCommunityGroupCollectionComponenProperties_H_
#define TINY_CPP_CLIENT_ComAdobeCqSocialGroupClientImplCommunityGroupCollectionComponenProperties_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ConfigNodePropertyBoolean.h"
#include "ConfigNodePropertyInteger.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class ComAdobeCqSocialGroupClientImplCommunityGroupCollectionComponenProperties{
public:

    /*! \brief Constructor.
	 */
    ComAdobeCqSocialGroupClientImplCommunityGroupCollectionComponenProperties();
    ComAdobeCqSocialGroupClientImplCommunityGroupCollectionComponenProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ComAdobeCqSocialGroupClientImplCommunityGroupCollectionComponenProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getGrouplistingpaginationenable();

	/*! \brief Set 
	 */
	void setGrouplistingpaginationenable(ConfigNodePropertyBoolean grouplistingpaginationenable);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getGrouplistinglazyloadingenable();

	/*! \brief Set 
	 */
	void setGrouplistinglazyloadingenable(ConfigNodePropertyBoolean grouplistinglazyloadingenable);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getPagesize();

	/*! \brief Set 
	 */
	void setPagesize(ConfigNodePropertyInteger pagesize);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getPriority();

	/*! \brief Set 
	 */
	void setPriority(ConfigNodePropertyInteger priority);


    private:
    ConfigNodePropertyBoolean grouplistingpaginationenable;
    ConfigNodePropertyBoolean grouplistinglazyloadingenable;
    ConfigNodePropertyInteger pagesize;
    ConfigNodePropertyInteger priority;
};
}

#endif /* TINY_CPP_CLIENT_ComAdobeCqSocialGroupClientImplCommunityGroupCollectionComponenProperties_H_ */
