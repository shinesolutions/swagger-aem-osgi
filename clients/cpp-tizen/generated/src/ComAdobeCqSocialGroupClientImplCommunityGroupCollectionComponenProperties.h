/*
 * ComAdobeCqSocialGroupClientImplCommunityGroupCollectionComponenProperties.h
 *
 * 
 */

#ifndef _ComAdobeCqSocialGroupClientImplCommunityGroupCollectionComponenProperties_H_
#define _ComAdobeCqSocialGroupClientImplCommunityGroupCollectionComponenProperties_H_


#include <string>
#include "ConfigNodePropertyBoolean.h"
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

class ComAdobeCqSocialGroupClientImplCommunityGroupCollectionComponenProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	ComAdobeCqSocialGroupClientImplCommunityGroupCollectionComponenProperties();
	ComAdobeCqSocialGroupClientImplCommunityGroupCollectionComponenProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ComAdobeCqSocialGroupClientImplCommunityGroupCollectionComponenProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getGrouplistingpaginationenable();

	/*! \brief Set 
	 */
	void setGrouplistingpaginationenable(ConfigNodePropertyBoolean  grouplistingpaginationenable);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getGrouplistinglazyloadingenable();

	/*! \brief Set 
	 */
	void setGrouplistinglazyloadingenable(ConfigNodePropertyBoolean  grouplistinglazyloadingenable);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getPagesize();

	/*! \brief Set 
	 */
	void setPagesize(ConfigNodePropertyInteger  pagesize);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getPriority();

	/*! \brief Set 
	 */
	void setPriority(ConfigNodePropertyInteger  priority);

private:
	ConfigNodePropertyBoolean grouplistingpaginationenable;
	ConfigNodePropertyBoolean grouplistinglazyloadingenable;
	ConfigNodePropertyInteger pagesize;
	ConfigNodePropertyInteger priority;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ComAdobeCqSocialGroupClientImplCommunityGroupCollectionComponenProperties_H_ */
