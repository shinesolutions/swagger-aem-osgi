//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class ComDayCqWcmCoreImplVersionPurgeTaskProperties {
  /// Returns a new [ComDayCqWcmCoreImplVersionPurgeTaskProperties] instance.
  ComDayCqWcmCoreImplVersionPurgeTaskProperties({
    this.versionpurgePeriodPaths,
    this.versionpurgePeriodRecursive,
    this.versionpurgePeriodMaxVersions,
    this.versionpurgePeriodMinVersions,
    this.versionpurgePeriodMaxAgeDays,
  });

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyArray? versionpurgePeriodPaths;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyBoolean? versionpurgePeriodRecursive;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyInteger? versionpurgePeriodMaxVersions;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyInteger? versionpurgePeriodMinVersions;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyInteger? versionpurgePeriodMaxAgeDays;

  @override
  bool operator ==(Object other) => identical(this, other) || other is ComDayCqWcmCoreImplVersionPurgeTaskProperties &&
    other.versionpurgePeriodPaths == versionpurgePeriodPaths &&
    other.versionpurgePeriodRecursive == versionpurgePeriodRecursive &&
    other.versionpurgePeriodMaxVersions == versionpurgePeriodMaxVersions &&
    other.versionpurgePeriodMinVersions == versionpurgePeriodMinVersions &&
    other.versionpurgePeriodMaxAgeDays == versionpurgePeriodMaxAgeDays;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (versionpurgePeriodPaths == null ? 0 : versionpurgePeriodPaths!.hashCode) +
    (versionpurgePeriodRecursive == null ? 0 : versionpurgePeriodRecursive!.hashCode) +
    (versionpurgePeriodMaxVersions == null ? 0 : versionpurgePeriodMaxVersions!.hashCode) +
    (versionpurgePeriodMinVersions == null ? 0 : versionpurgePeriodMinVersions!.hashCode) +
    (versionpurgePeriodMaxAgeDays == null ? 0 : versionpurgePeriodMaxAgeDays!.hashCode);

  @override
  String toString() => 'ComDayCqWcmCoreImplVersionPurgeTaskProperties[versionpurgePeriodPaths=$versionpurgePeriodPaths, versionpurgePeriodRecursive=$versionpurgePeriodRecursive, versionpurgePeriodMaxVersions=$versionpurgePeriodMaxVersions, versionpurgePeriodMinVersions=$versionpurgePeriodMinVersions, versionpurgePeriodMaxAgeDays=$versionpurgePeriodMaxAgeDays]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.versionpurgePeriodPaths != null) {
      json[r'versionpurge.paths'] = this.versionpurgePeriodPaths;
    } else {
      json[r'versionpurge.paths'] = null;
    }
    if (this.versionpurgePeriodRecursive != null) {
      json[r'versionpurge.recursive'] = this.versionpurgePeriodRecursive;
    } else {
      json[r'versionpurge.recursive'] = null;
    }
    if (this.versionpurgePeriodMaxVersions != null) {
      json[r'versionpurge.maxVersions'] = this.versionpurgePeriodMaxVersions;
    } else {
      json[r'versionpurge.maxVersions'] = null;
    }
    if (this.versionpurgePeriodMinVersions != null) {
      json[r'versionpurge.minVersions'] = this.versionpurgePeriodMinVersions;
    } else {
      json[r'versionpurge.minVersions'] = null;
    }
    if (this.versionpurgePeriodMaxAgeDays != null) {
      json[r'versionpurge.maxAgeDays'] = this.versionpurgePeriodMaxAgeDays;
    } else {
      json[r'versionpurge.maxAgeDays'] = null;
    }
    return json;
  }

  /// Returns a new [ComDayCqWcmCoreImplVersionPurgeTaskProperties] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static ComDayCqWcmCoreImplVersionPurgeTaskProperties? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        return true;
      }());

      return ComDayCqWcmCoreImplVersionPurgeTaskProperties(
        versionpurgePeriodPaths: ConfigNodePropertyArray.fromJson(json[r'versionpurge.paths']),
        versionpurgePeriodRecursive: ConfigNodePropertyBoolean.fromJson(json[r'versionpurge.recursive']),
        versionpurgePeriodMaxVersions: ConfigNodePropertyInteger.fromJson(json[r'versionpurge.maxVersions']),
        versionpurgePeriodMinVersions: ConfigNodePropertyInteger.fromJson(json[r'versionpurge.minVersions']),
        versionpurgePeriodMaxAgeDays: ConfigNodePropertyInteger.fromJson(json[r'versionpurge.maxAgeDays']),
      );
    }
    return null;
  }

  static List<ComDayCqWcmCoreImplVersionPurgeTaskProperties> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ComDayCqWcmCoreImplVersionPurgeTaskProperties>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ComDayCqWcmCoreImplVersionPurgeTaskProperties.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, ComDayCqWcmCoreImplVersionPurgeTaskProperties> mapFromJson(dynamic json) {
    final map = <String, ComDayCqWcmCoreImplVersionPurgeTaskProperties>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = ComDayCqWcmCoreImplVersionPurgeTaskProperties.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of ComDayCqWcmCoreImplVersionPurgeTaskProperties-objects as value to a dart map
  static Map<String, List<ComDayCqWcmCoreImplVersionPurgeTaskProperties>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<ComDayCqWcmCoreImplVersionPurgeTaskProperties>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = ComDayCqWcmCoreImplVersionPurgeTaskProperties.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

