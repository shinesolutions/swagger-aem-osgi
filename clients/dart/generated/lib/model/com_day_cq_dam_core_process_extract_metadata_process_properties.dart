//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class ComDayCqDamCoreProcessExtractMetadataProcessProperties {
  /// Returns a new [ComDayCqDamCoreProcessExtractMetadataProcessProperties] instance.
  ComDayCqDamCoreProcessExtractMetadataProcessProperties({
    this.processPeriodLabel,
    this.cqPeriodDamPeriodEnablePeriodSha1,
  });

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyString? processPeriodLabel;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyBoolean? cqPeriodDamPeriodEnablePeriodSha1;

  @override
  bool operator ==(Object other) => identical(this, other) || other is ComDayCqDamCoreProcessExtractMetadataProcessProperties &&
    other.processPeriodLabel == processPeriodLabel &&
    other.cqPeriodDamPeriodEnablePeriodSha1 == cqPeriodDamPeriodEnablePeriodSha1;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (processPeriodLabel == null ? 0 : processPeriodLabel!.hashCode) +
    (cqPeriodDamPeriodEnablePeriodSha1 == null ? 0 : cqPeriodDamPeriodEnablePeriodSha1!.hashCode);

  @override
  String toString() => 'ComDayCqDamCoreProcessExtractMetadataProcessProperties[processPeriodLabel=$processPeriodLabel, cqPeriodDamPeriodEnablePeriodSha1=$cqPeriodDamPeriodEnablePeriodSha1]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.processPeriodLabel != null) {
      json[r'process.label'] = this.processPeriodLabel;
    } else {
      json[r'process.label'] = null;
    }
    if (this.cqPeriodDamPeriodEnablePeriodSha1 != null) {
      json[r'cq.dam.enable.sha1'] = this.cqPeriodDamPeriodEnablePeriodSha1;
    } else {
      json[r'cq.dam.enable.sha1'] = null;
    }
    return json;
  }

  /// Returns a new [ComDayCqDamCoreProcessExtractMetadataProcessProperties] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static ComDayCqDamCoreProcessExtractMetadataProcessProperties? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        return true;
      }());

      return ComDayCqDamCoreProcessExtractMetadataProcessProperties(
        processPeriodLabel: ConfigNodePropertyString.fromJson(json[r'process.label']),
        cqPeriodDamPeriodEnablePeriodSha1: ConfigNodePropertyBoolean.fromJson(json[r'cq.dam.enable.sha1']),
      );
    }
    return null;
  }

  static List<ComDayCqDamCoreProcessExtractMetadataProcessProperties> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ComDayCqDamCoreProcessExtractMetadataProcessProperties>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ComDayCqDamCoreProcessExtractMetadataProcessProperties.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, ComDayCqDamCoreProcessExtractMetadataProcessProperties> mapFromJson(dynamic json) {
    final map = <String, ComDayCqDamCoreProcessExtractMetadataProcessProperties>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = ComDayCqDamCoreProcessExtractMetadataProcessProperties.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of ComDayCqDamCoreProcessExtractMetadataProcessProperties-objects as value to a dart map
  static Map<String, List<ComDayCqDamCoreProcessExtractMetadataProcessProperties>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<ComDayCqDamCoreProcessExtractMetadataProcessProperties>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = ComDayCqDamCoreProcessExtractMetadataProcessProperties.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

