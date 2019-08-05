/*
 * ComDayCqWcmUndoUndoConfigProperties.h
 *
 * 
 */

#ifndef _ComDayCqWcmUndoUndoConfigProperties_H_
#define _ComDayCqWcmUndoUndoConfigProperties_H_


#include <string>
#include "ConfigNodePropertyArray.h"
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

class ComDayCqWcmUndoUndoConfigProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	ComDayCqWcmUndoUndoConfigProperties();
	ComDayCqWcmUndoUndoConfigProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ComDayCqWcmUndoUndoConfigProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getCqwcmundoenabled();

	/*! \brief Set 
	 */
	void setCqwcmundoenabled(ConfigNodePropertyBoolean  cqwcmundoenabled);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getCqwcmundopath();

	/*! \brief Set 
	 */
	void setCqwcmundopath(ConfigNodePropertyString  cqwcmundopath);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getCqwcmundovalidity();

	/*! \brief Set 
	 */
	void setCqwcmundovalidity(ConfigNodePropertyInteger  cqwcmundovalidity);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getCqwcmundosteps();

	/*! \brief Set 
	 */
	void setCqwcmundosteps(ConfigNodePropertyInteger  cqwcmundosteps);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getCqwcmundopersistence();

	/*! \brief Set 
	 */
	void setCqwcmundopersistence(ConfigNodePropertyString  cqwcmundopersistence);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getCqwcmundopersistencemode();

	/*! \brief Set 
	 */
	void setCqwcmundopersistencemode(ConfigNodePropertyBoolean  cqwcmundopersistencemode);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getCqwcmundomarkermode();

	/*! \brief Set 
	 */
	void setCqwcmundomarkermode(ConfigNodePropertyString  cqwcmundomarkermode);
	/*! \brief Get 
	 */
	ConfigNodePropertyArray getCqwcmundowhitelist();

	/*! \brief Set 
	 */
	void setCqwcmundowhitelist(ConfigNodePropertyArray  cqwcmundowhitelist);
	/*! \brief Get 
	 */
	ConfigNodePropertyArray getCqwcmundoblacklist();

	/*! \brief Set 
	 */
	void setCqwcmundoblacklist(ConfigNodePropertyArray  cqwcmundoblacklist);

private:
	ConfigNodePropertyBoolean cqwcmundoenabled;
	ConfigNodePropertyString cqwcmundopath;
	ConfigNodePropertyInteger cqwcmundovalidity;
	ConfigNodePropertyInteger cqwcmundosteps;
	ConfigNodePropertyString cqwcmundopersistence;
	ConfigNodePropertyBoolean cqwcmundopersistencemode;
	ConfigNodePropertyString cqwcmundomarkermode;
	ConfigNodePropertyArray cqwcmundowhitelist;
	ConfigNodePropertyArray cqwcmundoblacklist;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ComDayCqWcmUndoUndoConfigProperties_H_ */
