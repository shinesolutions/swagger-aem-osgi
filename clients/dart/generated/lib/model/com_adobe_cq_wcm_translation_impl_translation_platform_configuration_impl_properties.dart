//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class ComAdobeCqWcmTranslationImplTranslationPlatformConfigurationImplProperties {
  /// Returns a new [ComAdobeCqWcmTranslationImplTranslationPlatformConfigurationImplProperties] instance.
  ComAdobeCqWcmTranslationImplTranslationPlatformConfigurationImplProperties({
    this.syncTranslationStatePeriodSchedulingFormat,
    this.schedulingRepeatTranslationPeriodSchedulingFormat,
    this.syncTranslationStatePeriodLockTimeoutInMinutes,
    this.exportPeriodFormat,
  });

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyString? syncTranslationStatePeriodSchedulingFormat;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyString? schedulingRepeatTranslationPeriodSchedulingFormat;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyString? syncTranslationStatePeriodLockTimeoutInMinutes;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyDropDown? exportPeriodFormat;

  @override
  bool operator ==(Object other) => identical(this, other) || other is ComAdobeCqWcmTranslationImplTranslationPlatformConfigurationImplProperties &&
    other.syncTranslationStatePeriodSchedulingFormat == syncTranslationStatePeriodSchedulingFormat &&
    other.schedulingRepeatTranslationPeriodSchedulingFormat == schedulingRepeatTranslationPeriodSchedulingFormat &&
    other.syncTranslationStatePeriodLockTimeoutInMinutes == syncTranslationStatePeriodLockTimeoutInMinutes &&
    other.exportPeriodFormat == exportPeriodFormat;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (syncTranslationStatePeriodSchedulingFormat == null ? 0 : syncTranslationStatePeriodSchedulingFormat!.hashCode) +
    (schedulingRepeatTranslationPeriodSchedulingFormat == null ? 0 : schedulingRepeatTranslationPeriodSchedulingFormat!.hashCode) +
    (syncTranslationStatePeriodLockTimeoutInMinutes == null ? 0 : syncTranslationStatePeriodLockTimeoutInMinutes!.hashCode) +
    (exportPeriodFormat == null ? 0 : exportPeriodFormat!.hashCode);

  @override
  String toString() => 'ComAdobeCqWcmTranslationImplTranslationPlatformConfigurationImplProperties[syncTranslationStatePeriodSchedulingFormat=$syncTranslationStatePeriodSchedulingFormat, schedulingRepeatTranslationPeriodSchedulingFormat=$schedulingRepeatTranslationPeriodSchedulingFormat, syncTranslationStatePeriodLockTimeoutInMinutes=$syncTranslationStatePeriodLockTimeoutInMinutes, exportPeriodFormat=$exportPeriodFormat]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.syncTranslationStatePeriodSchedulingFormat != null) {
      json[r'syncTranslationState.schedulingFormat'] = this.syncTranslationStatePeriodSchedulingFormat;
    } else {
      json[r'syncTranslationState.schedulingFormat'] = null;
    }
    if (this.schedulingRepeatTranslationPeriodSchedulingFormat != null) {
      json[r'schedulingRepeatTranslation.schedulingFormat'] = this.schedulingRepeatTranslationPeriodSchedulingFormat;
    } else {
      json[r'schedulingRepeatTranslation.schedulingFormat'] = null;
    }
    if (this.syncTranslationStatePeriodLockTimeoutInMinutes != null) {
      json[r'syncTranslationState.lockTimeoutInMinutes'] = this.syncTranslationStatePeriodLockTimeoutInMinutes;
    } else {
      json[r'syncTranslationState.lockTimeoutInMinutes'] = null;
    }
    if (this.exportPeriodFormat != null) {
      json[r'export.format'] = this.exportPeriodFormat;
    } else {
      json[r'export.format'] = null;
    }
    return json;
  }

  /// Returns a new [ComAdobeCqWcmTranslationImplTranslationPlatformConfigurationImplProperties] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static ComAdobeCqWcmTranslationImplTranslationPlatformConfigurationImplProperties? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        return true;
      }());

      return ComAdobeCqWcmTranslationImplTranslationPlatformConfigurationImplProperties(
        syncTranslationStatePeriodSchedulingFormat: ConfigNodePropertyString.fromJson(json[r'syncTranslationState.schedulingFormat']),
        schedulingRepeatTranslationPeriodSchedulingFormat: ConfigNodePropertyString.fromJson(json[r'schedulingRepeatTranslation.schedulingFormat']),
        syncTranslationStatePeriodLockTimeoutInMinutes: ConfigNodePropertyString.fromJson(json[r'syncTranslationState.lockTimeoutInMinutes']),
        exportPeriodFormat: ConfigNodePropertyDropDown.fromJson(json[r'export.format']),
      );
    }
    return null;
  }

  static List<ComAdobeCqWcmTranslationImplTranslationPlatformConfigurationImplProperties> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ComAdobeCqWcmTranslationImplTranslationPlatformConfigurationImplProperties>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ComAdobeCqWcmTranslationImplTranslationPlatformConfigurationImplProperties.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, ComAdobeCqWcmTranslationImplTranslationPlatformConfigurationImplProperties> mapFromJson(dynamic json) {
    final map = <String, ComAdobeCqWcmTranslationImplTranslationPlatformConfigurationImplProperties>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = ComAdobeCqWcmTranslationImplTranslationPlatformConfigurationImplProperties.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of ComAdobeCqWcmTranslationImplTranslationPlatformConfigurationImplProperties-objects as value to a dart map
  static Map<String, List<ComAdobeCqWcmTranslationImplTranslationPlatformConfigurationImplProperties>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<ComAdobeCqWcmTranslationImplTranslationPlatformConfigurationImplProperties>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = ComAdobeCqWcmTranslationImplTranslationPlatformConfigurationImplProperties.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

