package org.openapitools.server.model


/**
 * @param schedulerPeriod  for example: ''null''
 * @param schedulerRunOn  for example: ''null''
 * @param graniteThreaddumpEnabled  for example: ''null''
 * @param graniteThreaddumpDumpsPerFile  for example: ''null''
 * @param graniteThreaddumpEnableGzipCompression  for example: ''null''
 * @param graniteThreaddumpEnableDirectoriesCompression  for example: ''null''
 * @param graniteThreaddumpEnableJStack  for example: ''null''
 * @param graniteThreaddumpMaxBackupDays  for example: ''null''
 * @param graniteThreaddumpBackupCleanTrigger  for example: ''null''
*/
final case class ComAdobeGraniteThreaddumpThreadDumpCollectorProperties (
  schedulerPeriod: Option[ConfigNodePropertyInteger] = None,
  schedulerRunOn: Option[ConfigNodePropertyDropDown] = None,
  graniteThreaddumpEnabled: Option[ConfigNodePropertyBoolean] = None,
  graniteThreaddumpDumpsPerFile: Option[ConfigNodePropertyInteger] = None,
  graniteThreaddumpEnableGzipCompression: Option[ConfigNodePropertyBoolean] = None,
  graniteThreaddumpEnableDirectoriesCompression: Option[ConfigNodePropertyBoolean] = None,
  graniteThreaddumpEnableJStack: Option[ConfigNodePropertyBoolean] = None,
  graniteThreaddumpMaxBackupDays: Option[ConfigNodePropertyInteger] = None,
  graniteThreaddumpBackupCleanTrigger: Option[ConfigNodePropertyString] = None
)

