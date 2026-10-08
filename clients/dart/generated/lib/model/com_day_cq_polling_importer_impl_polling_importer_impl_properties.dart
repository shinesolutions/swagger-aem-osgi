//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class ComDayCqPollingImporterImplPollingImporterImplProperties {
  /// Returns a new [ComDayCqPollingImporterImplPollingImporterImplProperties] instance.
  ComDayCqPollingImporterImplPollingImporterImplProperties({
    this.importerPeriodMinPeriodInterval,
    this.importerPeriodUser,
    this.excludePeriodPaths,
    this.includePeriodPaths,
  });

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyInteger? importerPeriodMinPeriodInterval;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyString? importerPeriodUser;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyArray? excludePeriodPaths;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyArray? includePeriodPaths;

  @override
  bool operator ==(Object other) => identical(this, other) || other is ComDayCqPollingImporterImplPollingImporterImplProperties &&
    other.importerPeriodMinPeriodInterval == importerPeriodMinPeriodInterval &&
    other.importerPeriodUser == importerPeriodUser &&
    other.excludePeriodPaths == excludePeriodPaths &&
    other.includePeriodPaths == includePeriodPaths;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (importerPeriodMinPeriodInterval == null ? 0 : importerPeriodMinPeriodInterval!.hashCode) +
    (importerPeriodUser == null ? 0 : importerPeriodUser!.hashCode) +
    (excludePeriodPaths == null ? 0 : excludePeriodPaths!.hashCode) +
    (includePeriodPaths == null ? 0 : includePeriodPaths!.hashCode);

  @override
  String toString() => 'ComDayCqPollingImporterImplPollingImporterImplProperties[importerPeriodMinPeriodInterval=$importerPeriodMinPeriodInterval, importerPeriodUser=$importerPeriodUser, excludePeriodPaths=$excludePeriodPaths, includePeriodPaths=$includePeriodPaths]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.importerPeriodMinPeriodInterval != null) {
      json[r'importer.min.interval'] = this.importerPeriodMinPeriodInterval;
    } else {
      json[r'importer.min.interval'] = null;
    }
    if (this.importerPeriodUser != null) {
      json[r'importer.user'] = this.importerPeriodUser;
    } else {
      json[r'importer.user'] = null;
    }
    if (this.excludePeriodPaths != null) {
      json[r'exclude.paths'] = this.excludePeriodPaths;
    } else {
      json[r'exclude.paths'] = null;
    }
    if (this.includePeriodPaths != null) {
      json[r'include.paths'] = this.includePeriodPaths;
    } else {
      json[r'include.paths'] = null;
    }
    return json;
  }

  /// Returns a new [ComDayCqPollingImporterImplPollingImporterImplProperties] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static ComDayCqPollingImporterImplPollingImporterImplProperties? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        return true;
      }());

      return ComDayCqPollingImporterImplPollingImporterImplProperties(
        importerPeriodMinPeriodInterval: ConfigNodePropertyInteger.fromJson(json[r'importer.min.interval']),
        importerPeriodUser: ConfigNodePropertyString.fromJson(json[r'importer.user']),
        excludePeriodPaths: ConfigNodePropertyArray.fromJson(json[r'exclude.paths']),
        includePeriodPaths: ConfigNodePropertyArray.fromJson(json[r'include.paths']),
      );
    }
    return null;
  }

  static List<ComDayCqPollingImporterImplPollingImporterImplProperties> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ComDayCqPollingImporterImplPollingImporterImplProperties>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ComDayCqPollingImporterImplPollingImporterImplProperties.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, ComDayCqPollingImporterImplPollingImporterImplProperties> mapFromJson(dynamic json) {
    final map = <String, ComDayCqPollingImporterImplPollingImporterImplProperties>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = ComDayCqPollingImporterImplPollingImporterImplProperties.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of ComDayCqPollingImporterImplPollingImporterImplProperties-objects as value to a dart map
  static Map<String, List<ComDayCqPollingImporterImplPollingImporterImplProperties>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<ComDayCqPollingImporterImplPollingImporterImplProperties>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = ComDayCqPollingImporterImplPollingImporterImplProperties.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

