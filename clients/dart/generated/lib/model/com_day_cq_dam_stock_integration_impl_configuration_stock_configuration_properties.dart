//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class ComDayCqDamStockIntegrationImplConfigurationStockConfigurationProperties {
  /// Returns a new [ComDayCqDamStockIntegrationImplConfigurationStockConfigurationProperties] instance.
  ComDayCqDamStockIntegrationImplConfigurationStockConfigurationProperties({
    this.name,
    this.locale,
    this.imsConfig,
  });

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyString? name;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyString? locale;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyString? imsConfig;

  @override
  bool operator ==(Object other) => identical(this, other) || other is ComDayCqDamStockIntegrationImplConfigurationStockConfigurationProperties &&
    other.name == name &&
    other.locale == locale &&
    other.imsConfig == imsConfig;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (name == null ? 0 : name!.hashCode) +
    (locale == null ? 0 : locale!.hashCode) +
    (imsConfig == null ? 0 : imsConfig!.hashCode);

  @override
  String toString() => 'ComDayCqDamStockIntegrationImplConfigurationStockConfigurationProperties[name=$name, locale=$locale, imsConfig=$imsConfig]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.name != null) {
      json[r'name'] = this.name;
    } else {
      json[r'name'] = null;
    }
    if (this.locale != null) {
      json[r'locale'] = this.locale;
    } else {
      json[r'locale'] = null;
    }
    if (this.imsConfig != null) {
      json[r'imsConfig'] = this.imsConfig;
    } else {
      json[r'imsConfig'] = null;
    }
    return json;
  }

  /// Returns a new [ComDayCqDamStockIntegrationImplConfigurationStockConfigurationProperties] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static ComDayCqDamStockIntegrationImplConfigurationStockConfigurationProperties? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        return true;
      }());

      return ComDayCqDamStockIntegrationImplConfigurationStockConfigurationProperties(
        name: ConfigNodePropertyString.fromJson(json[r'name']),
        locale: ConfigNodePropertyString.fromJson(json[r'locale']),
        imsConfig: ConfigNodePropertyString.fromJson(json[r'imsConfig']),
      );
    }
    return null;
  }

  static List<ComDayCqDamStockIntegrationImplConfigurationStockConfigurationProperties> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ComDayCqDamStockIntegrationImplConfigurationStockConfigurationProperties>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ComDayCqDamStockIntegrationImplConfigurationStockConfigurationProperties.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, ComDayCqDamStockIntegrationImplConfigurationStockConfigurationProperties> mapFromJson(dynamic json) {
    final map = <String, ComDayCqDamStockIntegrationImplConfigurationStockConfigurationProperties>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = ComDayCqDamStockIntegrationImplConfigurationStockConfigurationProperties.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of ComDayCqDamStockIntegrationImplConfigurationStockConfigurationProperties-objects as value to a dart map
  static Map<String, List<ComDayCqDamStockIntegrationImplConfigurationStockConfigurationProperties>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<ComDayCqDamStockIntegrationImplConfigurationStockConfigurationProperties>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = ComDayCqDamStockIntegrationImplConfigurationStockConfigurationProperties.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

