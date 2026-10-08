//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class OrgApacheSlingServletsResolverSlingServletResolverProperties {
  /// Returns a new [OrgApacheSlingServletsResolverSlingServletResolverProperties] instance.
  OrgApacheSlingServletsResolverSlingServletResolverProperties({
    this.servletresolverPeriodServletRoot,
    this.servletresolverPeriodCacheSize,
    this.servletresolverPeriodPaths,
    this.servletresolverPeriodDefaultExtensions,
  });

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyString? servletresolverPeriodServletRoot;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyInteger? servletresolverPeriodCacheSize;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyArray? servletresolverPeriodPaths;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyArray? servletresolverPeriodDefaultExtensions;

  @override
  bool operator ==(Object other) => identical(this, other) || other is OrgApacheSlingServletsResolverSlingServletResolverProperties &&
    other.servletresolverPeriodServletRoot == servletresolverPeriodServletRoot &&
    other.servletresolverPeriodCacheSize == servletresolverPeriodCacheSize &&
    other.servletresolverPeriodPaths == servletresolverPeriodPaths &&
    other.servletresolverPeriodDefaultExtensions == servletresolverPeriodDefaultExtensions;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (servletresolverPeriodServletRoot == null ? 0 : servletresolverPeriodServletRoot!.hashCode) +
    (servletresolverPeriodCacheSize == null ? 0 : servletresolverPeriodCacheSize!.hashCode) +
    (servletresolverPeriodPaths == null ? 0 : servletresolverPeriodPaths!.hashCode) +
    (servletresolverPeriodDefaultExtensions == null ? 0 : servletresolverPeriodDefaultExtensions!.hashCode);

  @override
  String toString() => 'OrgApacheSlingServletsResolverSlingServletResolverProperties[servletresolverPeriodServletRoot=$servletresolverPeriodServletRoot, servletresolverPeriodCacheSize=$servletresolverPeriodCacheSize, servletresolverPeriodPaths=$servletresolverPeriodPaths, servletresolverPeriodDefaultExtensions=$servletresolverPeriodDefaultExtensions]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.servletresolverPeriodServletRoot != null) {
      json[r'servletresolver.servletRoot'] = this.servletresolverPeriodServletRoot;
    } else {
      json[r'servletresolver.servletRoot'] = null;
    }
    if (this.servletresolverPeriodCacheSize != null) {
      json[r'servletresolver.cacheSize'] = this.servletresolverPeriodCacheSize;
    } else {
      json[r'servletresolver.cacheSize'] = null;
    }
    if (this.servletresolverPeriodPaths != null) {
      json[r'servletresolver.paths'] = this.servletresolverPeriodPaths;
    } else {
      json[r'servletresolver.paths'] = null;
    }
    if (this.servletresolverPeriodDefaultExtensions != null) {
      json[r'servletresolver.defaultExtensions'] = this.servletresolverPeriodDefaultExtensions;
    } else {
      json[r'servletresolver.defaultExtensions'] = null;
    }
    return json;
  }

  /// Returns a new [OrgApacheSlingServletsResolverSlingServletResolverProperties] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static OrgApacheSlingServletsResolverSlingServletResolverProperties? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        return true;
      }());

      return OrgApacheSlingServletsResolverSlingServletResolverProperties(
        servletresolverPeriodServletRoot: ConfigNodePropertyString.fromJson(json[r'servletresolver.servletRoot']),
        servletresolverPeriodCacheSize: ConfigNodePropertyInteger.fromJson(json[r'servletresolver.cacheSize']),
        servletresolverPeriodPaths: ConfigNodePropertyArray.fromJson(json[r'servletresolver.paths']),
        servletresolverPeriodDefaultExtensions: ConfigNodePropertyArray.fromJson(json[r'servletresolver.defaultExtensions']),
      );
    }
    return null;
  }

  static List<OrgApacheSlingServletsResolverSlingServletResolverProperties> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <OrgApacheSlingServletsResolverSlingServletResolverProperties>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = OrgApacheSlingServletsResolverSlingServletResolverProperties.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, OrgApacheSlingServletsResolverSlingServletResolverProperties> mapFromJson(dynamic json) {
    final map = <String, OrgApacheSlingServletsResolverSlingServletResolverProperties>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = OrgApacheSlingServletsResolverSlingServletResolverProperties.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of OrgApacheSlingServletsResolverSlingServletResolverProperties-objects as value to a dart map
  static Map<String, List<OrgApacheSlingServletsResolverSlingServletResolverProperties>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<OrgApacheSlingServletsResolverSlingServletResolverProperties>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = OrgApacheSlingServletsResolverSlingServletResolverProperties.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

