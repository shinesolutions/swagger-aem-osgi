//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class ComDayCqDamStockIntegrationImplCacheStockCacheConfigurationSerProperties {
  /// Returns a new [ComDayCqDamStockIntegrationImplCacheStockCacheConfigurationSerProperties] instance.
  ComDayCqDamStockIntegrationImplCacheStockCacheConfigurationSerProperties({
    this.getCacheExpirationUnit,
    this.getCacheExpirationValue,
  });

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyDropDown? getCacheExpirationUnit;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyInteger? getCacheExpirationValue;

  @override
  bool operator ==(Object other) => identical(this, other) || other is ComDayCqDamStockIntegrationImplCacheStockCacheConfigurationSerProperties &&
    other.getCacheExpirationUnit == getCacheExpirationUnit &&
    other.getCacheExpirationValue == getCacheExpirationValue;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (getCacheExpirationUnit == null ? 0 : getCacheExpirationUnit!.hashCode) +
    (getCacheExpirationValue == null ? 0 : getCacheExpirationValue!.hashCode);

  @override
  String toString() => 'ComDayCqDamStockIntegrationImplCacheStockCacheConfigurationSerProperties[getCacheExpirationUnit=$getCacheExpirationUnit, getCacheExpirationValue=$getCacheExpirationValue]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.getCacheExpirationUnit != null) {
      json[r'getCacheExpirationUnit'] = this.getCacheExpirationUnit;
    } else {
      json[r'getCacheExpirationUnit'] = null;
    }
    if (this.getCacheExpirationValue != null) {
      json[r'getCacheExpirationValue'] = this.getCacheExpirationValue;
    } else {
      json[r'getCacheExpirationValue'] = null;
    }
    return json;
  }

  /// Returns a new [ComDayCqDamStockIntegrationImplCacheStockCacheConfigurationSerProperties] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static ComDayCqDamStockIntegrationImplCacheStockCacheConfigurationSerProperties? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        return true;
      }());

      return ComDayCqDamStockIntegrationImplCacheStockCacheConfigurationSerProperties(
        getCacheExpirationUnit: ConfigNodePropertyDropDown.fromJson(json[r'getCacheExpirationUnit']),
        getCacheExpirationValue: ConfigNodePropertyInteger.fromJson(json[r'getCacheExpirationValue']),
      );
    }
    return null;
  }

  static List<ComDayCqDamStockIntegrationImplCacheStockCacheConfigurationSerProperties> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ComDayCqDamStockIntegrationImplCacheStockCacheConfigurationSerProperties>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ComDayCqDamStockIntegrationImplCacheStockCacheConfigurationSerProperties.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, ComDayCqDamStockIntegrationImplCacheStockCacheConfigurationSerProperties> mapFromJson(dynamic json) {
    final map = <String, ComDayCqDamStockIntegrationImplCacheStockCacheConfigurationSerProperties>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = ComDayCqDamStockIntegrationImplCacheStockCacheConfigurationSerProperties.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of ComDayCqDamStockIntegrationImplCacheStockCacheConfigurationSerProperties-objects as value to a dart map
  static Map<String, List<ComDayCqDamStockIntegrationImplCacheStockCacheConfigurationSerProperties>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<ComDayCqDamStockIntegrationImplCacheStockCacheConfigurationSerProperties>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = ComDayCqDamStockIntegrationImplCacheStockCacheConfigurationSerProperties.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

