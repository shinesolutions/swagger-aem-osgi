//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class OrgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporterProperties {
  /// Returns a new [OrgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporterProperties] instance.
  OrgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporterProperties({
    this.datasources,
    this.step,
    this.archives,
    this.path,
  });

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyArray? datasources;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyInteger? step;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyArray? archives;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyString? path;

  @override
  bool operator ==(Object other) => identical(this, other) || other is OrgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporterProperties &&
    other.datasources == datasources &&
    other.step == step &&
    other.archives == archives &&
    other.path == path;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (datasources == null ? 0 : datasources!.hashCode) +
    (step == null ? 0 : step!.hashCode) +
    (archives == null ? 0 : archives!.hashCode) +
    (path == null ? 0 : path!.hashCode);

  @override
  String toString() => 'OrgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporterProperties[datasources=$datasources, step=$step, archives=$archives, path=$path]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.datasources != null) {
      json[r'datasources'] = this.datasources;
    } else {
      json[r'datasources'] = null;
    }
    if (this.step != null) {
      json[r'step'] = this.step;
    } else {
      json[r'step'] = null;
    }
    if (this.archives != null) {
      json[r'archives'] = this.archives;
    } else {
      json[r'archives'] = null;
    }
    if (this.path != null) {
      json[r'path'] = this.path;
    } else {
      json[r'path'] = null;
    }
    return json;
  }

  /// Returns a new [OrgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporterProperties] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static OrgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporterProperties? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        return true;
      }());

      return OrgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporterProperties(
        datasources: ConfigNodePropertyArray.fromJson(json[r'datasources']),
        step: ConfigNodePropertyInteger.fromJson(json[r'step']),
        archives: ConfigNodePropertyArray.fromJson(json[r'archives']),
        path: ConfigNodePropertyString.fromJson(json[r'path']),
      );
    }
    return null;
  }

  static List<OrgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporterProperties> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <OrgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporterProperties>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = OrgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporterProperties.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, OrgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporterProperties> mapFromJson(dynamic json) {
    final map = <String, OrgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporterProperties>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = OrgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporterProperties.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of OrgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporterProperties-objects as value to a dart map
  static Map<String, List<OrgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporterProperties>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<OrgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporterProperties>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = OrgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporterProperties.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

