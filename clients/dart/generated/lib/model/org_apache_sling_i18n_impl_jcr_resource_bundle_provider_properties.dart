//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class OrgApacheSlingI18nImplJcrResourceBundleProviderProperties {
  /// Returns a new [OrgApacheSlingI18nImplJcrResourceBundleProviderProperties] instance.
  OrgApacheSlingI18nImplJcrResourceBundleProviderProperties({
    this.localePeriodDefault,
    this.preloadPeriodBundles,
    this.invalidationPeriodDelay,
  });

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyString? localePeriodDefault;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyBoolean? preloadPeriodBundles;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyInteger? invalidationPeriodDelay;

  @override
  bool operator ==(Object other) => identical(this, other) || other is OrgApacheSlingI18nImplJcrResourceBundleProviderProperties &&
    other.localePeriodDefault == localePeriodDefault &&
    other.preloadPeriodBundles == preloadPeriodBundles &&
    other.invalidationPeriodDelay == invalidationPeriodDelay;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (localePeriodDefault == null ? 0 : localePeriodDefault!.hashCode) +
    (preloadPeriodBundles == null ? 0 : preloadPeriodBundles!.hashCode) +
    (invalidationPeriodDelay == null ? 0 : invalidationPeriodDelay!.hashCode);

  @override
  String toString() => 'OrgApacheSlingI18nImplJcrResourceBundleProviderProperties[localePeriodDefault=$localePeriodDefault, preloadPeriodBundles=$preloadPeriodBundles, invalidationPeriodDelay=$invalidationPeriodDelay]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.localePeriodDefault != null) {
      json[r'locale.default'] = this.localePeriodDefault;
    } else {
      json[r'locale.default'] = null;
    }
    if (this.preloadPeriodBundles != null) {
      json[r'preload.bundles'] = this.preloadPeriodBundles;
    } else {
      json[r'preload.bundles'] = null;
    }
    if (this.invalidationPeriodDelay != null) {
      json[r'invalidation.delay'] = this.invalidationPeriodDelay;
    } else {
      json[r'invalidation.delay'] = null;
    }
    return json;
  }

  /// Returns a new [OrgApacheSlingI18nImplJcrResourceBundleProviderProperties] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static OrgApacheSlingI18nImplJcrResourceBundleProviderProperties? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        return true;
      }());

      return OrgApacheSlingI18nImplJcrResourceBundleProviderProperties(
        localePeriodDefault: ConfigNodePropertyString.fromJson(json[r'locale.default']),
        preloadPeriodBundles: ConfigNodePropertyBoolean.fromJson(json[r'preload.bundles']),
        invalidationPeriodDelay: ConfigNodePropertyInteger.fromJson(json[r'invalidation.delay']),
      );
    }
    return null;
  }

  static List<OrgApacheSlingI18nImplJcrResourceBundleProviderProperties> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <OrgApacheSlingI18nImplJcrResourceBundleProviderProperties>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = OrgApacheSlingI18nImplJcrResourceBundleProviderProperties.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, OrgApacheSlingI18nImplJcrResourceBundleProviderProperties> mapFromJson(dynamic json) {
    final map = <String, OrgApacheSlingI18nImplJcrResourceBundleProviderProperties>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = OrgApacheSlingI18nImplJcrResourceBundleProviderProperties.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of OrgApacheSlingI18nImplJcrResourceBundleProviderProperties-objects as value to a dart map
  static Map<String, List<OrgApacheSlingI18nImplJcrResourceBundleProviderProperties>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<OrgApacheSlingI18nImplJcrResourceBundleProviderProperties>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = OrgApacheSlingI18nImplJcrResourceBundleProviderProperties.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

