//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class ComDayCqDamCoreImplJobsMetadataimportAsyncMetadataImportConfigProperties {
  /// Returns a new [ComDayCqDamCoreImplJobsMetadataimportAsyncMetadataImportConfigProperties] instance.
  ComDayCqDamCoreImplJobsMetadataimportAsyncMetadataImportConfigProperties({
    this.operation,
    this.operationIcon,
    this.topicName,
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
  ConfigNodePropertyString? operationIcon;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyString? topicName;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyBoolean? emailEnabled;

  @override
  bool operator ==(Object other) => identical(this, other) || other is ComDayCqDamCoreImplJobsMetadataimportAsyncMetadataImportConfigProperties &&
    other.operation == operation &&
    other.operationIcon == operationIcon &&
    other.topicName == topicName &&
    other.emailEnabled == emailEnabled;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (operation == null ? 0 : operation!.hashCode) +
    (operationIcon == null ? 0 : operationIcon!.hashCode) +
    (topicName == null ? 0 : topicName!.hashCode) +
    (emailEnabled == null ? 0 : emailEnabled!.hashCode);

  @override
  String toString() => 'ComDayCqDamCoreImplJobsMetadataimportAsyncMetadataImportConfigProperties[operation=$operation, operationIcon=$operationIcon, topicName=$topicName, emailEnabled=$emailEnabled]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.operation != null) {
      json[r'operation'] = this.operation;
    } else {
      json[r'operation'] = null;
    }
    if (this.operationIcon != null) {
      json[r'operationIcon'] = this.operationIcon;
    } else {
      json[r'operationIcon'] = null;
    }
    if (this.topicName != null) {
      json[r'topicName'] = this.topicName;
    } else {
      json[r'topicName'] = null;
    }
    if (this.emailEnabled != null) {
      json[r'emailEnabled'] = this.emailEnabled;
    } else {
      json[r'emailEnabled'] = null;
    }
    return json;
  }

  /// Returns a new [ComDayCqDamCoreImplJobsMetadataimportAsyncMetadataImportConfigProperties] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static ComDayCqDamCoreImplJobsMetadataimportAsyncMetadataImportConfigProperties? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        return true;
      }());

      return ComDayCqDamCoreImplJobsMetadataimportAsyncMetadataImportConfigProperties(
        operation: ConfigNodePropertyString.fromJson(json[r'operation']),
        operationIcon: ConfigNodePropertyString.fromJson(json[r'operationIcon']),
        topicName: ConfigNodePropertyString.fromJson(json[r'topicName']),
        emailEnabled: ConfigNodePropertyBoolean.fromJson(json[r'emailEnabled']),
      );
    }
    return null;
  }

  static List<ComDayCqDamCoreImplJobsMetadataimportAsyncMetadataImportConfigProperties> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ComDayCqDamCoreImplJobsMetadataimportAsyncMetadataImportConfigProperties>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ComDayCqDamCoreImplJobsMetadataimportAsyncMetadataImportConfigProperties.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, ComDayCqDamCoreImplJobsMetadataimportAsyncMetadataImportConfigProperties> mapFromJson(dynamic json) {
    final map = <String, ComDayCqDamCoreImplJobsMetadataimportAsyncMetadataImportConfigProperties>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = ComDayCqDamCoreImplJobsMetadataimportAsyncMetadataImportConfigProperties.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of ComDayCqDamCoreImplJobsMetadataimportAsyncMetadataImportConfigProperties-objects as value to a dart map
  static Map<String, List<ComDayCqDamCoreImplJobsMetadataimportAsyncMetadataImportConfigProperties>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<ComDayCqDamCoreImplJobsMetadataimportAsyncMetadataImportConfigProperties>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = ComDayCqDamCoreImplJobsMetadataimportAsyncMetadataImportConfigProperties.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

