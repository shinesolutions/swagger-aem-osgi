//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class ComAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplProperties {
  /// Returns a new [ComAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplProperties] instance.
  ComAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplProperties({
    this.comPeriodAdobePeriodCqPeriodScreensPeriodOfflinecontentPeriodImplPeriodBulkOfflineUpdateServiceImplPeriodProjectPath,
    this.comPeriodAdobePeriodCqPeriodScreensPeriodOfflinecontentPeriodImplPeriodBulkOfflineUpdateServiceImplPeriodScheduleFrequency,
  });

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyArray? comPeriodAdobePeriodCqPeriodScreensPeriodOfflinecontentPeriodImplPeriodBulkOfflineUpdateServiceImplPeriodProjectPath;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyString? comPeriodAdobePeriodCqPeriodScreensPeriodOfflinecontentPeriodImplPeriodBulkOfflineUpdateServiceImplPeriodScheduleFrequency;

  @override
  bool operator ==(Object other) => identical(this, other) || other is ComAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplProperties &&
    other.comPeriodAdobePeriodCqPeriodScreensPeriodOfflinecontentPeriodImplPeriodBulkOfflineUpdateServiceImplPeriodProjectPath == comPeriodAdobePeriodCqPeriodScreensPeriodOfflinecontentPeriodImplPeriodBulkOfflineUpdateServiceImplPeriodProjectPath &&
    other.comPeriodAdobePeriodCqPeriodScreensPeriodOfflinecontentPeriodImplPeriodBulkOfflineUpdateServiceImplPeriodScheduleFrequency == comPeriodAdobePeriodCqPeriodScreensPeriodOfflinecontentPeriodImplPeriodBulkOfflineUpdateServiceImplPeriodScheduleFrequency;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (comPeriodAdobePeriodCqPeriodScreensPeriodOfflinecontentPeriodImplPeriodBulkOfflineUpdateServiceImplPeriodProjectPath == null ? 0 : comPeriodAdobePeriodCqPeriodScreensPeriodOfflinecontentPeriodImplPeriodBulkOfflineUpdateServiceImplPeriodProjectPath!.hashCode) +
    (comPeriodAdobePeriodCqPeriodScreensPeriodOfflinecontentPeriodImplPeriodBulkOfflineUpdateServiceImplPeriodScheduleFrequency == null ? 0 : comPeriodAdobePeriodCqPeriodScreensPeriodOfflinecontentPeriodImplPeriodBulkOfflineUpdateServiceImplPeriodScheduleFrequency!.hashCode);

  @override
  String toString() => 'ComAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplProperties[comPeriodAdobePeriodCqPeriodScreensPeriodOfflinecontentPeriodImplPeriodBulkOfflineUpdateServiceImplPeriodProjectPath=$comPeriodAdobePeriodCqPeriodScreensPeriodOfflinecontentPeriodImplPeriodBulkOfflineUpdateServiceImplPeriodProjectPath, comPeriodAdobePeriodCqPeriodScreensPeriodOfflinecontentPeriodImplPeriodBulkOfflineUpdateServiceImplPeriodScheduleFrequency=$comPeriodAdobePeriodCqPeriodScreensPeriodOfflinecontentPeriodImplPeriodBulkOfflineUpdateServiceImplPeriodScheduleFrequency]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.comPeriodAdobePeriodCqPeriodScreensPeriodOfflinecontentPeriodImplPeriodBulkOfflineUpdateServiceImplPeriodProjectPath != null) {
      json[r'com.adobe.cq.screens.offlinecontent.impl.BulkOfflineUpdateServiceImpl.projectPath'] = this.comPeriodAdobePeriodCqPeriodScreensPeriodOfflinecontentPeriodImplPeriodBulkOfflineUpdateServiceImplPeriodProjectPath;
    } else {
      json[r'com.adobe.cq.screens.offlinecontent.impl.BulkOfflineUpdateServiceImpl.projectPath'] = null;
    }
    if (this.comPeriodAdobePeriodCqPeriodScreensPeriodOfflinecontentPeriodImplPeriodBulkOfflineUpdateServiceImplPeriodScheduleFrequency != null) {
      json[r'com.adobe.cq.screens.offlinecontent.impl.BulkOfflineUpdateServiceImpl.scheduleFrequency'] = this.comPeriodAdobePeriodCqPeriodScreensPeriodOfflinecontentPeriodImplPeriodBulkOfflineUpdateServiceImplPeriodScheduleFrequency;
    } else {
      json[r'com.adobe.cq.screens.offlinecontent.impl.BulkOfflineUpdateServiceImpl.scheduleFrequency'] = null;
    }
    return json;
  }

  /// Returns a new [ComAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplProperties] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static ComAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplProperties? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        return true;
      }());

      return ComAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplProperties(
        comPeriodAdobePeriodCqPeriodScreensPeriodOfflinecontentPeriodImplPeriodBulkOfflineUpdateServiceImplPeriodProjectPath: ConfigNodePropertyArray.fromJson(json[r'com.adobe.cq.screens.offlinecontent.impl.BulkOfflineUpdateServiceImpl.projectPath']),
        comPeriodAdobePeriodCqPeriodScreensPeriodOfflinecontentPeriodImplPeriodBulkOfflineUpdateServiceImplPeriodScheduleFrequency: ConfigNodePropertyString.fromJson(json[r'com.adobe.cq.screens.offlinecontent.impl.BulkOfflineUpdateServiceImpl.scheduleFrequency']),
      );
    }
    return null;
  }

  static List<ComAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplProperties> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ComAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplProperties>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ComAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplProperties.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, ComAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplProperties> mapFromJson(dynamic json) {
    final map = <String, ComAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplProperties>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = ComAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplProperties.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of ComAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplProperties-objects as value to a dart map
  static Map<String, List<ComAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplProperties>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<ComAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplProperties>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = ComAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplProperties.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

