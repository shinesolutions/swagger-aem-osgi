package org.openapitools.server.model


/**
 * @param repconfTimezone  for example: ''null''
 * @param repconfLocale  for example: ''null''
 * @param repconfSnapshots  for example: ''null''
 * @param repconfRepdir  for example: ''null''
 * @param repconfHourofday  for example: ''null''
 * @param repconfMinofhour  for example: ''null''
 * @param repconfMaxrows  for example: ''null''
 * @param repconfFakedata  for example: ''null''
 * @param repconfSnapshotuser  for example: ''null''
 * @param repconfEnforcesnapshotuser  for example: ''null''
*/
final case class ComDayCqReportingImplConfigServiceImplProperties (
  repconfTimezone: Option[ConfigNodePropertyString] = None,
  repconfLocale: Option[ConfigNodePropertyString] = None,
  repconfSnapshots: Option[ConfigNodePropertyString] = None,
  repconfRepdir: Option[ConfigNodePropertyString] = None,
  repconfHourofday: Option[ConfigNodePropertyInteger] = None,
  repconfMinofhour: Option[ConfigNodePropertyInteger] = None,
  repconfMaxrows: Option[ConfigNodePropertyInteger] = None,
  repconfFakedata: Option[ConfigNodePropertyBoolean] = None,
  repconfSnapshotuser: Option[ConfigNodePropertyString] = None,
  repconfEnforcesnapshotuser: Option[ConfigNodePropertyBoolean] = None
)

