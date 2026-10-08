//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class ComDayCqWcmCoreImplVersionManagerImplProperties {
  /// Returns a new [ComDayCqWcmCoreImplVersionManagerImplProperties] instance.
  ComDayCqWcmCoreImplVersionManagerImplProperties({
    this.versionmanagerPeriodCreateVersionOnActivation,
    this.versionmanagerPeriodPurgingEnabled,
    this.versionmanagerPeriodPurgePaths,
    this.versionmanagerPeriodIvPaths,
    this.versionmanagerPeriodMaxAgeDays,
    this.versionmanagerPeriodMaxNumberVersions,
    this.versionmanagerPeriodMinNumberVersions,
  });

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyBoolean? versionmanagerPeriodCreateVersionOnActivation;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyBoolean? versionmanagerPeriodPurgingEnabled;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyArray? versionmanagerPeriodPurgePaths;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyArray? versionmanagerPeriodIvPaths;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyInteger? versionmanagerPeriodMaxAgeDays;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyInteger? versionmanagerPeriodMaxNumberVersions;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyInteger? versionmanagerPeriodMinNumberVersions;

  @override
  bool operator ==(Object other) => identical(this, other) || other is ComDayCqWcmCoreImplVersionManagerImplProperties &&
    other.versionmanagerPeriodCreateVersionOnActivation == versionmanagerPeriodCreateVersionOnActivation &&
    other.versionmanagerPeriodPurgingEnabled == versionmanagerPeriodPurgingEnabled &&
    other.versionmanagerPeriodPurgePaths == versionmanagerPeriodPurgePaths &&
    other.versionmanagerPeriodIvPaths == versionmanagerPeriodIvPaths &&
    other.versionmanagerPeriodMaxAgeDays == versionmanagerPeriodMaxAgeDays &&
    other.versionmanagerPeriodMaxNumberVersions == versionmanagerPeriodMaxNumberVersions &&
    other.versionmanagerPeriodMinNumberVersions == versionmanagerPeriodMinNumberVersions;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (versionmanagerPeriodCreateVersionOnActivation == null ? 0 : versionmanagerPeriodCreateVersionOnActivation!.hashCode) +
    (versionmanagerPeriodPurgingEnabled == null ? 0 : versionmanagerPeriodPurgingEnabled!.hashCode) +
    (versionmanagerPeriodPurgePaths == null ? 0 : versionmanagerPeriodPurgePaths!.hashCode) +
    (versionmanagerPeriodIvPaths == null ? 0 : versionmanagerPeriodIvPaths!.hashCode) +
    (versionmanagerPeriodMaxAgeDays == null ? 0 : versionmanagerPeriodMaxAgeDays!.hashCode) +
    (versionmanagerPeriodMaxNumberVersions == null ? 0 : versionmanagerPeriodMaxNumberVersions!.hashCode) +
    (versionmanagerPeriodMinNumberVersions == null ? 0 : versionmanagerPeriodMinNumberVersions!.hashCode);

  @override
  String toString() => 'ComDayCqWcmCoreImplVersionManagerImplProperties[versionmanagerPeriodCreateVersionOnActivation=$versionmanagerPeriodCreateVersionOnActivation, versionmanagerPeriodPurgingEnabled=$versionmanagerPeriodPurgingEnabled, versionmanagerPeriodPurgePaths=$versionmanagerPeriodPurgePaths, versionmanagerPeriodIvPaths=$versionmanagerPeriodIvPaths, versionmanagerPeriodMaxAgeDays=$versionmanagerPeriodMaxAgeDays, versionmanagerPeriodMaxNumberVersions=$versionmanagerPeriodMaxNumberVersions, versionmanagerPeriodMinNumberVersions=$versionmanagerPeriodMinNumberVersions]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.versionmanagerPeriodCreateVersionOnActivation != null) {
      json[r'versionmanager.createVersionOnActivation'] = this.versionmanagerPeriodCreateVersionOnActivation;
    } else {
      json[r'versionmanager.createVersionOnActivation'] = null;
    }
    if (this.versionmanagerPeriodPurgingEnabled != null) {
      json[r'versionmanager.purgingEnabled'] = this.versionmanagerPeriodPurgingEnabled;
    } else {
      json[r'versionmanager.purgingEnabled'] = null;
    }
    if (this.versionmanagerPeriodPurgePaths != null) {
      json[r'versionmanager.purgePaths'] = this.versionmanagerPeriodPurgePaths;
    } else {
      json[r'versionmanager.purgePaths'] = null;
    }
    if (this.versionmanagerPeriodIvPaths != null) {
      json[r'versionmanager.ivPaths'] = this.versionmanagerPeriodIvPaths;
    } else {
      json[r'versionmanager.ivPaths'] = null;
    }
    if (this.versionmanagerPeriodMaxAgeDays != null) {
      json[r'versionmanager.maxAgeDays'] = this.versionmanagerPeriodMaxAgeDays;
    } else {
      json[r'versionmanager.maxAgeDays'] = null;
    }
    if (this.versionmanagerPeriodMaxNumberVersions != null) {
      json[r'versionmanager.maxNumberVersions'] = this.versionmanagerPeriodMaxNumberVersions;
    } else {
      json[r'versionmanager.maxNumberVersions'] = null;
    }
    if (this.versionmanagerPeriodMinNumberVersions != null) {
      json[r'versionmanager.minNumberVersions'] = this.versionmanagerPeriodMinNumberVersions;
    } else {
      json[r'versionmanager.minNumberVersions'] = null;
    }
    return json;
  }

  /// Returns a new [ComDayCqWcmCoreImplVersionManagerImplProperties] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static ComDayCqWcmCoreImplVersionManagerImplProperties? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        return true;
      }());

      return ComDayCqWcmCoreImplVersionManagerImplProperties(
        versionmanagerPeriodCreateVersionOnActivation: ConfigNodePropertyBoolean.fromJson(json[r'versionmanager.createVersionOnActivation']),
        versionmanagerPeriodPurgingEnabled: ConfigNodePropertyBoolean.fromJson(json[r'versionmanager.purgingEnabled']),
        versionmanagerPeriodPurgePaths: ConfigNodePropertyArray.fromJson(json[r'versionmanager.purgePaths']),
        versionmanagerPeriodIvPaths: ConfigNodePropertyArray.fromJson(json[r'versionmanager.ivPaths']),
        versionmanagerPeriodMaxAgeDays: ConfigNodePropertyInteger.fromJson(json[r'versionmanager.maxAgeDays']),
        versionmanagerPeriodMaxNumberVersions: ConfigNodePropertyInteger.fromJson(json[r'versionmanager.maxNumberVersions']),
        versionmanagerPeriodMinNumberVersions: ConfigNodePropertyInteger.fromJson(json[r'versionmanager.minNumberVersions']),
      );
    }
    return null;
  }

  static List<ComDayCqWcmCoreImplVersionManagerImplProperties> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ComDayCqWcmCoreImplVersionManagerImplProperties>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ComDayCqWcmCoreImplVersionManagerImplProperties.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, ComDayCqWcmCoreImplVersionManagerImplProperties> mapFromJson(dynamic json) {
    final map = <String, ComDayCqWcmCoreImplVersionManagerImplProperties>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = ComDayCqWcmCoreImplVersionManagerImplProperties.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of ComDayCqWcmCoreImplVersionManagerImplProperties-objects as value to a dart map
  static Map<String, List<ComDayCqWcmCoreImplVersionManagerImplProperties>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<ComDayCqWcmCoreImplVersionManagerImplProperties>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = ComDayCqWcmCoreImplVersionManagerImplProperties.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

