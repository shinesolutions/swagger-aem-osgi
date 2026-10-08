//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class ComDayCqWcmCoreImplLanguageManagerImplProperties {
  /// Returns a new [ComDayCqWcmCoreImplLanguageManagerImplProperties] instance.
  ComDayCqWcmCoreImplLanguageManagerImplProperties({
    this.langmgrPeriodListPeriodPath,
    this.langmgrPeriodCountryPeriodDefault,
  });

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyString? langmgrPeriodListPeriodPath;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyArray? langmgrPeriodCountryPeriodDefault;

  @override
  bool operator ==(Object other) => identical(this, other) || other is ComDayCqWcmCoreImplLanguageManagerImplProperties &&
    other.langmgrPeriodListPeriodPath == langmgrPeriodListPeriodPath &&
    other.langmgrPeriodCountryPeriodDefault == langmgrPeriodCountryPeriodDefault;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (langmgrPeriodListPeriodPath == null ? 0 : langmgrPeriodListPeriodPath!.hashCode) +
    (langmgrPeriodCountryPeriodDefault == null ? 0 : langmgrPeriodCountryPeriodDefault!.hashCode);

  @override
  String toString() => 'ComDayCqWcmCoreImplLanguageManagerImplProperties[langmgrPeriodListPeriodPath=$langmgrPeriodListPeriodPath, langmgrPeriodCountryPeriodDefault=$langmgrPeriodCountryPeriodDefault]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.langmgrPeriodListPeriodPath != null) {
      json[r'langmgr.list.path'] = this.langmgrPeriodListPeriodPath;
    } else {
      json[r'langmgr.list.path'] = null;
    }
    if (this.langmgrPeriodCountryPeriodDefault != null) {
      json[r'langmgr.country.default'] = this.langmgrPeriodCountryPeriodDefault;
    } else {
      json[r'langmgr.country.default'] = null;
    }
    return json;
  }

  /// Returns a new [ComDayCqWcmCoreImplLanguageManagerImplProperties] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static ComDayCqWcmCoreImplLanguageManagerImplProperties? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        return true;
      }());

      return ComDayCqWcmCoreImplLanguageManagerImplProperties(
        langmgrPeriodListPeriodPath: ConfigNodePropertyString.fromJson(json[r'langmgr.list.path']),
        langmgrPeriodCountryPeriodDefault: ConfigNodePropertyArray.fromJson(json[r'langmgr.country.default']),
      );
    }
    return null;
  }

  static List<ComDayCqWcmCoreImplLanguageManagerImplProperties> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ComDayCqWcmCoreImplLanguageManagerImplProperties>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ComDayCqWcmCoreImplLanguageManagerImplProperties.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, ComDayCqWcmCoreImplLanguageManagerImplProperties> mapFromJson(dynamic json) {
    final map = <String, ComDayCqWcmCoreImplLanguageManagerImplProperties>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = ComDayCqWcmCoreImplLanguageManagerImplProperties.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of ComDayCqWcmCoreImplLanguageManagerImplProperties-objects as value to a dart map
  static Map<String, List<ComDayCqWcmCoreImplLanguageManagerImplProperties>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<ComDayCqWcmCoreImplLanguageManagerImplProperties>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = ComDayCqWcmCoreImplLanguageManagerImplProperties.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

