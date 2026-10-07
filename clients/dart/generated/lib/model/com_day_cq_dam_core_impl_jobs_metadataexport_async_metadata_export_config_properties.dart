//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class ComDayCqDamCoreImplJobsMetadataexportAsyncMetadataExportConfigProperties {
  /// Returns a new [ComDayCqDamCoreImplJobsMetadataexportAsyncMetadataExportConfigProperties] instance.
  ComDayCqDamCoreImplJobsMetadataexportAsyncMetadataExportConfigProperties({
    this.operation,
    this.emailEnabled,
  });

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyString? operation;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyBoolean? emailEnabled;

  @override
  bool operator ==(Object other) => identical(this, other) || other is ComDayCqDamCoreImplJobsMetadataexportAsyncMetadataExportConfigProperties &&
    other.operation == operation &&
    other.emailEnabled == emailEnabled;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (operation == null ? 0 : operation!.hashCode) +
    (emailEnabled == null ? 0 : emailEnabled!.hashCode);

  @override
  String toString() => 'ComDayCqDamCoreImplJobsMetadataexportAsyncMetadataExportConfigProperties[operation=$operation, emailEnabled=$emailEnabled]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.operation != null) {
      json[r'operation'] = this.operation;
    } else {
      json[r'operation'] = null;
    }
    if (this.emailEnabled != null) {
      json[r'emailEnabled'] = this.emailEnabled;
    } else {
      json[r'emailEnabled'] = null;
    }
    return json;
  }

  /// Returns a new [ComDayCqDamCoreImplJobsMetadataexportAsyncMetadataExportConfigProperties] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static ComDayCqDamCoreImplJobsMetadataexportAsyncMetadataExportConfigProperties? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        return true;
      }());

      return ComDayCqDamCoreImplJobsMetadataexportAsyncMetadataExportConfigProperties(
        operation: ConfigNodePropertyString.fromJson(json[r'operation']),
        emailEnabled: ConfigNodePropertyBoolean.fromJson(json[r'emailEnabled']),
      );
    }
    return null;
  }

  static List<ComDayCqDamCoreImplJobsMetadataexportAsyncMetadataExportConfigProperties> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ComDayCqDamCoreImplJobsMetadataexportAsyncMetadataExportConfigProperties>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ComDayCqDamCoreImplJobsMetadataexportAsyncMetadataExportConfigProperties.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, ComDayCqDamCoreImplJobsMetadataexportAsyncMetadataExportConfigProperties> mapFromJson(dynamic json) {
    final map = <String, ComDayCqDamCoreImplJobsMetadataexportAsyncMetadataExportConfigProperties>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = ComDayCqDamCoreImplJobsMetadataexportAsyncMetadataExportConfigProperties.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of ComDayCqDamCoreImplJobsMetadataexportAsyncMetadataExportConfigProperties-objects as value to a dart map
  static Map<String, List<ComDayCqDamCoreImplJobsMetadataexportAsyncMetadataExportConfigProperties>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<ComDayCqDamCoreImplJobsMetadataexportAsyncMetadataExportConfigProperties>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = ComDayCqDamCoreImplJobsMetadataexportAsyncMetadataExportConfigProperties.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

