//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class ComDayCqDamCoreImplProcessTextExtractionProcessProperties {
  /// Returns a new [ComDayCqDamCoreImplProcessTextExtractionProcessProperties] instance.
  ComDayCqDamCoreImplProcessTextExtractionProcessProperties({
    this.mimeTypes,
    this.maxExtract,
  });

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyArray? mimeTypes;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyInteger? maxExtract;

  @override
  bool operator ==(Object other) => identical(this, other) || other is ComDayCqDamCoreImplProcessTextExtractionProcessProperties &&
    other.mimeTypes == mimeTypes &&
    other.maxExtract == maxExtract;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (mimeTypes == null ? 0 : mimeTypes!.hashCode) +
    (maxExtract == null ? 0 : maxExtract!.hashCode);

  @override
  String toString() => 'ComDayCqDamCoreImplProcessTextExtractionProcessProperties[mimeTypes=$mimeTypes, maxExtract=$maxExtract]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.mimeTypes != null) {
      json[r'mimeTypes'] = this.mimeTypes;
    } else {
      json[r'mimeTypes'] = null;
    }
    if (this.maxExtract != null) {
      json[r'maxExtract'] = this.maxExtract;
    } else {
      json[r'maxExtract'] = null;
    }
    return json;
  }

  /// Returns a new [ComDayCqDamCoreImplProcessTextExtractionProcessProperties] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static ComDayCqDamCoreImplProcessTextExtractionProcessProperties? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        return true;
      }());

      return ComDayCqDamCoreImplProcessTextExtractionProcessProperties(
        mimeTypes: ConfigNodePropertyArray.fromJson(json[r'mimeTypes']),
        maxExtract: ConfigNodePropertyInteger.fromJson(json[r'maxExtract']),
      );
    }
    return null;
  }

  static List<ComDayCqDamCoreImplProcessTextExtractionProcessProperties> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ComDayCqDamCoreImplProcessTextExtractionProcessProperties>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ComDayCqDamCoreImplProcessTextExtractionProcessProperties.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, ComDayCqDamCoreImplProcessTextExtractionProcessProperties> mapFromJson(dynamic json) {
    final map = <String, ComDayCqDamCoreImplProcessTextExtractionProcessProperties>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = ComDayCqDamCoreImplProcessTextExtractionProcessProperties.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of ComDayCqDamCoreImplProcessTextExtractionProcessProperties-objects as value to a dart map
  static Map<String, List<ComDayCqDamCoreImplProcessTextExtractionProcessProperties>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<ComDayCqDamCoreImplProcessTextExtractionProcessProperties>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = ComDayCqDamCoreImplProcessTextExtractionProcessProperties.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

